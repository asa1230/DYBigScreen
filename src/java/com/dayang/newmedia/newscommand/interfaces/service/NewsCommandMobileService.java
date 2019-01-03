package com.dayang.newmedia.newscommand.interfaces.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.UnsupportedCharsetException;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.newscommand.interfaces.db.model.NewsCommandMobileSelectListQueryCondition;
import com.dayang.newmedia.newscommand.interfaces.db.model.NewsCommandMobileSelectQueryCondition;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class NewsCommandMobileService {
	
	private Logger log = LoggerFactory.getLogger(NewsCommandMobileService.class);
	@Value(value="${DYNewsCommandMobile.defaultUserId}")
	private String defaultUserId;
	@Value(value="${DYNewsCommandMobile.xuantiList}")
	private String xuantiUrl;
	@Value(value="${DYNewsCommandMobile.xuantMapiList}")
	private String xuantiMapUrl;
	@Value(value="${DYNewsCommandMobile.gpsList}")
	private String gpsUrl;
	@Value(value="${DYNewsCommandMobile.resourceList}")
	private String resourceUrl;
	@Value(value="${DYNewsCommandMobile.queryModel}")
	private String queryModel;
	@Value(value="${DYNewsCommandMobile.hzSelectList.limit}")
	private String selectListLimit;
	@Value(value="${DYNewsCommandMobile.tenantId}")
	private String tenantId;
	@Value(value="${DYNewsCommandMobile.userId}")
	private String userId;
	@Value(value="${DYNewsCommandMobile.resourceUserId}")
	private String resourceUserId;
	@Value(value="${DYNewsCommandMobile.sysID}")
	private String sysID;
	@Value(value="${DYNewsCommandMobile.Manuscripts}")
	private String manuscriptsUrl;
	@Value(value="${DYNewsCommandMobile.onLine}")
	private String onLineUrl;
	@Value(value="${DYNewsCommandMobile.userList}")
	private String userListUrl;
	@Value(value="${DYNewsCommandMobile.columnList}")
	private String columnListUrl;
	
	@Value(value="${DYNewsCommandMobile.Manuscriptsprogress}")
	private String manuscriptsprogress;
	
	@Value(value="${DYNewsCommandMobile.cmsgaoDetailUrl}")
	private String wangyegaodeatailurl;
	@Value(value="${DYNewsCommandMobile.weixingaoDetailUrl}")
	private String weixingaodeatailurl;
	@Value(value="${DYNewsCommandMobile.weibogaoDetailUrl}")
	private String weibogaodeatailurl;
	@Value(value="${DYNewsCommandMobile.dianshigaoDetailUrl}")
	private String dianshigaodeatailurl;
	@Value(value="${DYNewsCommandMobile.tonggaoDetailUrl}")
	private String tonggaodeatailurl;
	
	@Value(value="${DYNewsCommandMobile.tvnewsuserqueryUrl}")
	private String tvnewsuserqueryUrl;
	@Value(value="${DYNewsCommandMobile.tvnewsitemqueryUrl}")
	private String tvnewsitemlistqueryUrl;	
	@Value(value="${DYNewsCommandMobile.tvnewsitemdetailqueryUrl}")
	private String tvnewsitemDtailqueryUrl;
	
	
	
	
	public String getUserIdFromProperties() {
		return defaultUserId;
	}
	public String getSelectListLimit() {
		return selectListLimit;
	}
	
	
	public String selectProgressList(NewsCommandMobileSelectListQueryCondition nc) {
		log.debug("--进入方法selectProgressList中--");
		CloseableHttpClient client = HttpClients.createDefault();
		log.debug("调用接口指挥调度选题列表接口为："+xuantiUrl);
		HttpPost post = new HttpPost(xuantiUrl);
		log.debug("query condition to news command"+nc.toString());
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("currentPage", nc.getStart());
		jsonObject.put("pageSize", nc.getLimit());
		if(nc.getSearchContent() != null) {
			jsonObject.put("searchContent", nc.getSearchContent());
		}
		if(nc.getOwncolumn() != null) {
			jsonObject.put("preReportColumnId", nc.getOwncolumn());		  //表示是拟播栏目的查询	
		}
		if(nc.getXuantistate() != -1) {
			jsonObject.put("topicStateKey", nc.getXuantistate());
		}
		if(nc.getChargeman() != null) {
			jsonObject.put("principalsId", nc.getChargeman());
		}
		if(nc.getExcludeStatus() != null && nc.getExcludeStatus().length>0) {
			jsonObject.put("excludeStatus", nc.getExcludeStatus());
		}
		
		jsonObject.put("topicIsdelete","0");   //zhy add,表示查找没有删除标识的选题
		jsonObject.put("topicType",1);          //zhy add,标识查找的是选题，  0-报题 ；1-选题
		//jsonObject.put("queryModel",1);       //zhy add,标识查找全部选题，  0-表示自己创建的 ；1-表示所有    对于queryAllTopic可以不传
		
		log.debug("chaxuntiaojian"+jsonObject.toString());
		try {
			StringEntity stringEntity = new StringEntity(jsonObject.toString(),"utf-8");
			//stringEntity.setContentType("application/json;charset=utf-8");
			stringEntity.setContentEncoding("UTF-8");
			stringEntity.setContentType("application/json");
			
			post.setHeader("tenantId", tenantId);
			post.setHeader("userId", userId);
			post.setEntity(stringEntity);
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");
					JSONObject resultjson = JSONObject.fromObject(result);
					log.debug("queryAllTopic 获取的result :"+result);
//					if(resultjson.getJSONArray("records")!=null) {
//						JSONArray records = resultjson.getJSONArray("records");
//						//log.debug(records.getString(0).toString()+"这是第一个records ");
//						EntityUtils.consume(entity);
//						log.debug("commandMobileService 获取的result :"+result);
//					}
					return result;
			} catch (Exception e) {
				log.debug("接口post请求执行错误");
				e.printStackTrace();
			} 
		
		}// catch (UnsupportedEncodingException e) {
		catch(UnsupportedCharsetException e) 
		{
			log.debug("post组装请求体错误");
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String selectProgressMapList(NewsCommandMobileSelectListQueryCondition nc) {
		log.debug("--进入方法selectProgressMapList中--");
		CloseableHttpClient client = HttpClients.createDefault();
		log.debug("调用接口指挥调度选题地图列表接口为："+xuantiMapUrl);
		HttpPost post = new HttpPost(xuantiMapUrl);
		log.debug("query condition to news command"+nc.toString());
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("currentPage", nc.getStart());
		jsonObject.put("pageSize", nc.getLimit());
		if(nc.getSearchContent() != null) {
			jsonObject.put("searchContent", nc.getSearchContent());
		}
		if(nc.getOwncolumn() != null) {
			jsonObject.put("preReportColumnId", nc.getOwncolumn());
		}
		if(nc.getXuantistate() != 0) {
			jsonObject.put("topicStateKey", nc.getXuantistate());
		}
		if(nc.getChargeman() != null) {
			jsonObject.put("principalsId", nc.getChargeman());
		}
		
		log.debug("chaxuntiaojian"+jsonObject.toString());
		try {
			StringEntity stringEntity = new StringEntity(jsonObject.toString());
			stringEntity.setContentType("application/json;charset=utf-8");
			post.setHeader("tenantId", tenantId);
			post.setHeader("userId", userId);
			post.setEntity(stringEntity);
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");
					JSONObject resultjson = JSONObject.fromObject(result);
					log.debug("queryMapTopic 获取的result :"+result);
//					if(resultjson.getJSONArray("records")!=null) {
//						JSONArray records = resultjson.getJSONArray("records");
//						//log.debug(records.getString(0).toString()+"这是第一个records ");
//						EntityUtils.consume(entity);
//						log.debug("commandMobileService 获取的result :"+result);
//					}
					return result;
			} catch (Exception e) {
				log.debug("接口post请求执行错误");
				e.printStackTrace();
			} 
		
		} catch (UnsupportedEncodingException e) {
			log.debug("post组装请求体错误");
			e.printStackTrace();
		}
		return null;
	}
	
	@Value(value="${DYNewsCommandMobile.xuantiDetail}")
	private String xuantiDetail;
	public String selectProgressByIdAndType(NewsCommandMobileSelectQueryCondition nc) {
			log.debug("进入方法selectProgressByIdAndType中");
			log.debug("本次调用方法所带参数:"+nc.toString());
			CloseableHttpClient client = HttpClients.createDefault();
			StringBuffer sb = new StringBuffer(xuantiDetail);
			sb.append("?topicGuid="+nc.getId());
			//sb.append("/"+nc.getType());
			log.debug("指挥调度 选题详情接口请求全路径："+sb.toString());
	      	HttpGet httpGet = new HttpGet(sb.toString());
	      	httpGet.setHeader("tenantId", tenantId);
	      	httpGet.setHeader("userId", userId);
	      	try {
	      		CloseableHttpResponse response = client.execute(httpGet);
	      		if(response.getStatusLine().getStatusCode()==200) {
	      			log.debug("接口调用成功,返回状态码为200");
	      		}else {
	      			log.debug(response.getStatusLine().getStatusCode()+" 指挥调度选题详情接口调用失败 ");
	      		}
	      		
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");
				log.debug("selectProgressByIdAndType方法返回的结果:"+result);
				return result;
			} catch (ClientProtocolException e) {
				log.debug("从指挥调度接口获取线索详情失败");
				e.printStackTrace();
			} catch (IOException e) {
				log.debug("从指挥调度接口获取线索详情失败");
				e.printStackTrace();
			}
		return null;
	}
	
	
	

	public String MapGpsInfoList(NewsCommandMobileSelectListQueryCondition nc) {
		log.debug("--进入方法MapGpsInfoList中--");
		int querymodel = nc.getQueryModel();
		CloseableHttpClient client = HttpClients.createDefault();
		log.debug("调用接口指挥调度GPS信息接口为："+gpsUrl);
		HttpPost post = new HttpPost(gpsUrl);
		JSONObject jsonObject = new JSONObject();
		if(querymodel == 4 ) {
			jsonObject.put("gpsTargetType", 1);
		}
		if(querymodel == 5 ) {
			jsonObject.put("gpsTargetType", 2);
		}
		
		log.debug("gsptiaojian"+jsonObject.toString());
		try {
			StringEntity stringEntity = new StringEntity(jsonObject.toString());
			stringEntity.setContentType("application/json;charset=utf-8");
			post.setHeader("tenantId", tenantId);
			post.setHeader("userId", userId);
			post.setEntity(stringEntity);
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");
					JSONObject resultjson = JSONObject.fromObject(result);
					log.debug("queryMapGpsinfo 获取的result :"+result);
//					if(resultjson.getJSONArray("records")!=null) {
//						JSONArray records = resultjson.getJSONArray("records");
//						//log.debug(records.getString(0).toString()+"这是第一个records ");
//						EntityUtils.consume(entity);
//						log.debug("commandMobileService 获取的result :"+result);
//					}
					return result;
			} catch (Exception e) {
				log.debug("接口post请求执行错误");
				e.printStackTrace();
			} 
		
		} catch (UnsupportedEncodingException e) {
			log.debug("post组装请求体错误");
			e.printStackTrace();
		}
		return null;
	}
	
	public String MapResourceList(NewsCommandMobileSelectListQueryCondition nc) {
		log.debug("--进入方法MapResourceList中--");
		int querymodel = nc.getQueryModel();
		//String resourceToken = gottoken();
		CloseableHttpClient client = HttpClients.createDefault();
		log.debug("调用接口指挥调度地图线索信息接口为："+resourceUrl);
		HttpPost post = new HttpPost(resourceUrl);
		JSONObject jsonObject = new JSONObject();
		JSONObject queryJson = new JSONObject();
		JSONArray sortList = new JSONArray();
		JSONObject jsonSort = new JSONObject();
		jsonObject.put("sourceType", 2);
		jsonObject.put("sysId", sysID);
		
		jsonSort.put("sortName", "CT");
		sortList.add(jsonSort);
		
		queryJson.put("sortList", sortList);
		//queryJson.put("startTime", "2017-09-25 00:00:00");
		//queryJson.put("endTime", "2018-12-30 00:00:00");
		queryJson.put("start", 0);
		queryJson.put("limit", 999);
		
		jsonObject.put("queryCondition", queryJson);
		
		log.debug("融云线索条件"+jsonObject.toString());
		try {
			StringEntity stringEntity = new StringEntity(jsonObject.toString());
			stringEntity.setContentType("application/json;charset=utf-8");
			post.setHeader("token", "000");
			post.setHeader("userId", resourceUserId);
			//post.setHeader("Content-Type", "application/json");
			post.setEntity(stringEntity);
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");
					JSONObject resultjson = JSONObject.fromObject(result);
					log.debug("MapResourceList 获取的result :"+result);
					return result;
			} catch (Exception e) {
				log.debug("接口post请求执行错误");
				e.printStackTrace();
			} 
		
		} catch (UnsupportedEncodingException e) {
			log.debug("post组装请求体错误");
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String ManuscriptsList(NewsCommandMobileSelectListQueryCondition nc) {
		log.debug("--进入方法ManuscriptsListList中--");
		CloseableHttpClient client = HttpClients.createDefault();
		
		log.debug("调用指挥调度稿件信息接口为："+manuscriptsUrl);
		HttpPost post = new HttpPost(manuscriptsUrl);
		JSONObject jsonObject = new JSONObject();
		
		try {
			StringEntity stringEntity = new StringEntity(jsonObject.toString());
			stringEntity.setContentType("application/json;charset=utf-8");
			post.setHeader("token", "dayangbiubiubiu");
			post.setHeader("userId", userId);
			post.setEntity(stringEntity);
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");
					JSONObject resultjson = JSONObject.fromObject(result);
					log.debug("MapResourceList 获取的result :"+result);
					return result;
			} catch (Exception e) {
				log.debug("接口post请求执行错误");
				e.printStackTrace();
			} 
		
		} catch (UnsupportedEncodingException e) {
			log.debug("post组装请求体错误");
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String onLineGo(NewsCommandMobileSelectListQueryCondition nc) {
		log.debug("--进入方法onLineGo中--");
		CloseableHttpClient client = HttpClients.createDefault();
		log.debug("调用全时会议接口为："+onLineUrl);
		HttpPost post = new HttpPost(onLineUrl);
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("changerName", nc.getUserId());
		jsonObject.put("memberName", nc.getChargeman());
		jsonObject.put("onlineType", nc.getQueryModel());
		jsonObject.put("tenantId", tenantId);
		
		log.info("调用全时会议接口条件------"+jsonObject.toString());
		
		try {
			StringEntity stringEntity = new StringEntity(jsonObject.toString());
			stringEntity.setContentType("application/json;charset=utf-8");
			post.setHeader("tenantId", tenantId);
			post.setHeader("userId", userId);
			post.setEntity(stringEntity);
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");
					JSONObject resultjson = JSONObject.fromObject(result);
					log.debug("MapResourceList 获取的result :"+result);
					return result;
			} catch (Exception e) {
				log.debug("接口post请求执行错误");
				e.printStackTrace();
			} 
		
		} catch (UnsupportedEncodingException e) {
			log.debug("post组装请求体错误");
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String allUserList(NewsCommandMobileSelectListQueryCondition nc) {
		log.debug("--进入方法allUserList中--");
		log.debug("调用获取全部人员接口为："+userListUrl);
		CloseableHttpClient client = HttpClients.createDefault();
      	HttpGet httpGet = new HttpGet(userListUrl);
      	httpGet.setHeader("tenantId", tenantId);
      	httpGet.setHeader("userId", userId);
      	try {
      		CloseableHttpResponse response = client.execute(httpGet);
      		if(response.getStatusLine().getStatusCode()==200) {
      			log.debug("接口调用成功,返回状态码为200");
      		}else {
      			log.debug(response.getStatusLine().getStatusCode()+" 指挥调度获取所有用户接口调用失败 ");
      		}
      		
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity,"utf-8");
			log.debug("allUserList方法返回的结果:"+result);
			return result;
		} catch (ClientProtocolException e) {
			log.debug("从指挥调度接口获取所有用户失败");
			e.printStackTrace();
		} catch (IOException e) {
			log.debug("从指挥调度接口获取所有用户失败");
			e.printStackTrace();
		}
		return null;
	}
	
	public String allColumnrList(NewsCommandMobileSelectListQueryCondition nc) {
		log.debug("--进入方法allColumnrList中--");
		CloseableHttpClient client = HttpClients.createDefault();
		log.debug("调用获取全部人员接口为："+columnListUrl);
      	HttpGet httpGet = new HttpGet(columnListUrl);
      	httpGet.setHeader("tenantId", tenantId);
      	httpGet.setHeader("userId", userId);
      	try {
      		CloseableHttpResponse response = client.execute(httpGet);
      		if(response.getStatusLine().getStatusCode()==200) {
      			log.debug("接口调用成功,返回状态码为200");
      		}else {
      			log.debug(response.getStatusLine().getStatusCode()+" 指挥调度获取所有栏目接口调用失败 ");
      		}
      		
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity,"utf-8");
			log.debug("allColumnrList方法返回的结果:"+result);
			return result;
		} catch (ClientProtocolException e) {
			log.debug("从指挥调度接口获取所有栏目失败");
			e.printStackTrace();
		} catch (IOException e) {
			log.debug("从指挥调度接口获取所有栏目失败");
			e.printStackTrace();
		}
		return null;
	}
	
	public String ManuscriptsProgressList(NewsCommandMobileSelectListQueryCondition ncnewsprolist) {
		log.debug("--进入方法ManuscriptsProgressList中--");
		CloseableHttpClient client = HttpClients.createDefault();		
		log.debug("调用全媒体稿件信息接口为："+manuscriptsprogress);
			
		try {
			String queryurl = manuscriptsprogress;
			queryurl += "?currentPage=" + ncnewsprolist.getStart() ;
			queryurl += "&pageSize=" + ncnewsprolist.getLimit() ;
			queryurl += "&mainIsDeleted=1" ;
			queryurl += "&resourceType=" + ncnewsprolist.getPstartTime();
			if(ncnewsprolist.getSearchContent() != null)
			{
				String strChangeSearchCont = java.net.URLEncoder.encode(ncnewsprolist.getSearchContent(), "UTF-8");
				//queryurl += "&mainHeader=" + ncnewsprolist.getSearchContent() ;
				queryurl += "&mainHeader=" + strChangeSearchCont ;
			}
			if(ncnewsprolist.getOwncolumn() != null)
				queryurl += "&columnId=" + ncnewsprolist.getOwncolumn() ;
			if( -1 != ncnewsprolist.getXuantistate() )
				queryurl += "&mainStatus=" + ncnewsprolist.getXuantistate() ;
			log.debug("ManuscriptsProgressList方法查询URL加条件为"+queryurl);
			
			//String changequeryurl = java.net.URLEncoder.encode(queryurl, "UTF-8");
			//log.debug("ManuscriptsProgressList方法查询URL加条件变化后为"+changequeryurl);
			
			HttpPost post = new HttpPost(queryurl);
			//HttpPost post = new HttpPost(manuscriptsprogress);	
			
			JSONObject jsonObject = new JSONObject();
			
			/*
			jsonObject.put("currentPage"     , ncnewsprolist.getStart());
			jsonObject.put("pageSize"        , ncnewsprolist.getLimit());
			jsonObject.put("mainIsDeleted"   , 1);
			if(ncnewsprolist.getSearchContent() != null) {
				jsonObject.put("mainHeader", ncnewsprolist.getSearchContent());
			}
			if(ncnewsprolist.getOwncolumn() != null) {
				jsonObject.put("columnId", ncnewsprolist.getOwncolumn());
			}
			if(ncnewsprolist.getXuantistate() != -1) {
				jsonObject.put("mainStatus", ncnewsprolist.getXuantistate());
			}			
			jsonObject.put("resourceType"    , ncnewsprolist.getPstartTime());			
			log.debug("ManuscriptsProgressList方法查询条件为"+jsonObject.toString());
			*/
			
			StringEntity stringEntity = new StringEntity(jsonObject.toString());
			stringEntity.setContentEncoding("UTF-8");
			stringEntity.setContentType("application/json");
			
			post.setHeader("token"  , "dayangbiubiubiu");			
			if(ncnewsprolist.getUserId() != null) 
				post.setHeader("userId" , ncnewsprolist.getUserId());
			else
				post.setHeader("userId" , userId);
			post.setEntity(stringEntity);
			
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");
				JSONObject resultjson = JSONObject.fromObject(result);
				log.debug("ManuscriptsProgressList 获取的result :"+result);
				return result;
			} catch (Exception e) {
				log.debug("接口post请求执行错误");
				e.printStackTrace();
				return null;
			} 
		
		}catch (UnsupportedEncodingException e) {
			log.debug("post组装请求体错误");
			e.printStackTrace();
			return null;
		}catch (Exception e) {
			log.debug("post初始化错误");
			e.printStackTrace();
			return null;
		} 
		
		//return null;
	}
	
	public String ManuscriptsProgressDetail(NewsCommandMobileSelectListQueryCondition ncnewsprolist) {
		log.debug("--进入方法ManuscriptsProgressDetail中--");
		CloseableHttpClient client = HttpClients.createDefault();
		
		String querynewsID= ncnewsprolist.getSearchContent();
		log.debug("需要查找的稿件ID为："+querynewsID);
		
		String querynewsType= ncnewsprolist.getOwncolumn();
		log.debug("需要查找的稿件类型为："+querynewsType);
		
		String QueryUrl = "";
		if("0".equals(querynewsType))
			QueryUrl = wangyegaodeatailurl;
		else if("1".equals(querynewsType))
			QueryUrl = weixingaodeatailurl;
		else if("2".equals(querynewsType))
			QueryUrl = weibogaodeatailurl;
		else if("3".equals(querynewsType))
			QueryUrl = dianshigaodeatailurl;
		else if("4".equals(querynewsType))
			QueryUrl = tonggaodeatailurl;
		if(null==QueryUrl || "".equals(QueryUrl))
		{
			log.debug("没有找到对应稿件类型的详情访问地址");
			return null;
		}				
		log.debug("调用全媒体稿件详情查询信息接口地址为："+QueryUrl);
			
		try {
			String reuqesturl = QueryUrl;
			reuqesturl += "?mainGuid=" + querynewsID ;			
			log.debug("ManuscriptsProgressDetail方法查询URL加条件为"+reuqesturl);	
			
			
			HttpPost post = new HttpPost(reuqesturl);
			
			JSONObject jsonObject = new JSONObject();			
			StringEntity stringEntity = new StringEntity(jsonObject.toString());
			stringEntity.setContentEncoding("UTF-8");
			stringEntity.setContentType("application/json");
			
			post.setHeader("tenantId"  , tenantId);
			post.setEntity(stringEntity);
			
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");
				JSONObject resultjson = JSONObject.fromObject(result);
				log.debug("ManuscriptsProgressDetail 获取的result :"+result);
				return result;
			} catch (Exception e) {
				log.debug("接口post请求执行错误");
				e.printStackTrace();
				return null;
			} 
		
		}catch (UnsupportedEncodingException e) {
			log.debug("post组装请求体错误");
			e.printStackTrace();
			return null;
		}catch (Exception e) {
			log.debug("post初始化错误");
			e.printStackTrace();
			return null;
		} 
		
		//return null;
	}
	
	public String tvNewsuserlistQurey(NewsCommandMobileSelectListQueryCondition ncnewsprolist) {
		log.debug("--进入方法tvNewsuserlistquery中--");
		CloseableHttpClient client = HttpClients.createDefault();
		
		String queryTVNewsColumn="";
		try {
			JSONObject jsonUser = new JSONObject();
			queryTVNewsColumn= ncnewsprolist.getOwncolumn();
			if(null==queryTVNewsColumn || "".equals(queryTVNewsColumn))
			{
				jsonUser.put("status", false);
				jsonUser.put("msg", "No Define Query Column");
				
				String strReturn = jsonUser.toString();
				return strReturn;
			}
		}catch (Exception e) {
			log.debug("--方法tvNewsuserlistFuncquery中--错误原因返回json解析失败");
			e.printStackTrace();
			return null;
		}
		log.debug("--方法tvNewsuserlistFuncQurey中--请求的栏目是" + queryTVNewsColumn);
		
					
		try {
            JSONObject jsonObjectRequest = new JSONObject();		
            jsonObjectRequest.put("owncolumn"     , queryTVNewsColumn);				
			log.debug("--方法tvNewsuserlistFuncQurey中--请求的查询条件为"+jsonObjectRequest.toString());
			
			String reuqesturl = tvnewsuserqueryUrl;					
			log.debug("--方法tvNewsuserlistFuncQurey中--请求的URL为"+reuqesturl);	
			
			
			HttpPost post = new HttpPost(reuqesturl);			
					
			StringEntity stringEntity = new StringEntity(jsonObjectRequest.toString());
			stringEntity.setContentEncoding("UTF-8");
			stringEntity.setContentType("application/json");			
			post.setEntity(stringEntity);
			
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");				
				log.debug("--方法tvNewsuserlistFuncQurey中--获取的result为:"+result);
				return result;
			} catch (Exception e) {
				log.debug("--方法tvNewsuserlistFuncQurey中--接口post请求执行错误");
				e.printStackTrace();
				return null;
			} 
		
		}catch (UnsupportedEncodingException e) {
			log.debug("--方法tvNewsuserlistFuncQurey中--post组装请求体错误");
			e.printStackTrace();
			return null;
		}catch (Exception e) {
			log.debug("--方法tvNewsuserlistFuncQurey中--post初始化错误");
			e.printStackTrace();
			return null;
		} 		
		
	}
	
	public String tvNewsitemlistquery(NewsCommandMobileSelectListQueryCondition ncnewsprolist) {
		log.debug("--进入方法tvNewsitemlistQurey中--");
		CloseableHttpClient client = HttpClients.createDefault();		
		
					
		try {
            JSONObject jsonObjectRequest = new JSONObject();			
            jsonObjectRequest.put("currentPage"     , ncnewsprolist.getStart());
            jsonObjectRequest.put("pageSize"        , ncnewsprolist.getLimit());
            jsonObjectRequest.put("mainIsDeleted"   , 0);
			if(ncnewsprolist.getSearchContent() != null) {
				jsonObjectRequest.put("mainHeader", ncnewsprolist.getSearchContent());
			}
			if(ncnewsprolist.getOwncolumn() != null) {
				jsonObjectRequest.put("columnId", ncnewsprolist.getOwncolumn());
			}
			if(ncnewsprolist.getXuantistate() != -1) {
				jsonObjectRequest.put("mainStatus", ncnewsprolist.getXuantistate());
			}
			if(ncnewsprolist.getUserId() != null && !"".equals(ncnewsprolist.getUserId()) ) {
				jsonObjectRequest.put("userid", ncnewsprolist.getUserId());
			}				
			log.debug("--方法tvNewsitemlistFuncQurey中--查询条件为"+jsonObjectRequest.toString());			
			
			            
			
			String reuqesturl = tvnewsitemlistqueryUrl;					
			log.debug("--方法tvNewsitemlistFuncQurey中--请求的URL为"+reuqesturl);				
			
			HttpPost post = new HttpPost(reuqesturl);					
			StringEntity stringEntity = new StringEntity(jsonObjectRequest.toString());
			stringEntity.setContentEncoding("UTF-8");
			stringEntity.setContentType("application/json");			
			post.setEntity(stringEntity);
			
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");				
				log.debug("--方法tvNewsitemlistFuncQurey中--获取的result为:"+result);
				return result;
			} catch (Exception e) {
				log.debug("--方法tvNewsitemlistFuncQurey中--接口post请求执行错误");
				e.printStackTrace();
				return null;
			} 
		
		}catch (UnsupportedEncodingException e) {
			log.debug("--方法tvNewsitemlistFuncQurey中--post组装请求体错误");
			e.printStackTrace();
			return null;
		}catch (Exception e) {
			log.debug("--方法tvNewsitemlistFuncQurey中--post初始化错误");
			e.printStackTrace();
			return null;
		} 		
		
	}
	
	public String tvNewsitemdetailquery(NewsCommandMobileSelectListQueryCondition ncnewsprolist) {
		log.debug("--进入方法tvNewsitemdetailFuncquery中--");
		CloseableHttpClient client = HttpClients.createDefault();		
		
					
		try {
            JSONObject jsonObjectRequest = new JSONObject();
			if(ncnewsprolist.getSearchContent() != null) {
				jsonObjectRequest.put("mainGuid", ncnewsprolist.getSearchContent());
			}
			log.debug("--方法tvNewsitemdetailFuncquery中--查询条件为"+jsonObjectRequest.toString());			
			
			            
			
			String reuqesturl = tvnewsitemDtailqueryUrl;					
			log.debug("--方法tvNewsitemdetailFuncquery中--请求的URL为"+reuqesturl);				
			
			HttpPost post = new HttpPost(reuqesturl);					
			StringEntity stringEntity = new StringEntity(jsonObjectRequest.toString());
			stringEntity.setContentEncoding("UTF-8");
			stringEntity.setContentType("application/json");			
			post.setEntity(stringEntity);
			
			try {
				CloseableHttpResponse response = client.execute(post);
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");				
				log.debug("--方法tvNewsitemdetailFuncquery中--获取的result为:"+result);
				return result;
			} catch (Exception e) {
				log.debug("--方法tvNewsitemdetailFuncquery中--接口post请求执行错误");
				e.printStackTrace();
				return null;
			} 
		
		}catch (UnsupportedEncodingException e) {
			log.debug("--方法tvNewsitemdetailFuncquery中--post组装请求体错误");
			e.printStackTrace();
			return null;
		}catch (Exception e) {
			log.debug("--方法tvNewsitemdetailFuncquery中--post初始化错误");
			e.printStackTrace();
			return null;
		} 		
		
	}
	
	
	@Value(value="${DYNewsCommandMobile.DUCPMissionQueryUrl}")
	private String DUCPMissionQueryUrl;
	@Value(value="${DYNewsCommandMobile.DUCPMissionQueryuserType}")
	private String DUCPMissionQueryuserType;
	@Value(value="${DYNewsCommandMobile.DUCPMissionQueryuserId}")
	private String DUCPMissionQueryuserId;
	@Value(value="${DYNewsCommandMobile.DUCPMissionQueryorgCode}")
	private String DUCPMissionQueryorgCode;
	@Value(value="${DYNewsCommandMobile.DUCPMissionQuerytenantId}")
	private String DUCPMissionQuerytenantId;
	public String getXuantiMissionByselectId(NewsCommandMobileSelectQueryCondition nc) {
			log.debug("进入方法getXuantiMissionByselectId中");
			log.debug("本次调用方法所带参数:"+nc.toString());
			
			CloseableHttpClient client = HttpClients.createDefault();
			
			StringBuffer sb = new StringBuffer(DUCPMissionQueryUrl);
			sb.append("?userType=" + DUCPMissionQueryuserType);
			sb.append("&userId=" + DUCPMissionQueryuserId);
			if( "INSIDE".equals(DUCPMissionQueryuserType) )			
				sb.append("&orgCode="+DUCPMissionQueryorgCode);			
			else
				sb.append("&tenantId="+DUCPMissionQuerytenantId);	
			
			sb.append("&type=4");
			sb.append("&otherType=1");
			
			String topicparam ="{topicId:'" + nc.getId() + "'}";
			try {
				String encodetopicparam = URLEncoder.encode(topicparam,"UTF-8");
				sb.append("&otherParam=" + encodetopicparam);
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			
			log.debug("DUCP选题任务接口请求全路径："+sb.toString());
			
			
	      	HttpGet httpGet = new HttpGet(sb.toString());	      
	      	try {
	      		CloseableHttpResponse response = client.execute(httpGet);
	      		if(response.getStatusLine().getStatusCode()==200) {
	      			log.debug("接口调用成功,返回状态码为200");
	      		}else {
	      			log.debug(response.getStatusLine().getStatusCode()+" DUCP选题任务接口调用失败 ");
	      		}
	      		
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity,"utf-8");
				log.debug("getXuantiMissionByselectId方法返回的结果:"+result);
				return result;
			} catch (ClientProtocolException e) {
				log.debug("从DUCP选题任务接口获取关联任务信息失败");
				e.printStackTrace();
			} catch (IOException e) {
				log.debug("从DUCP选题任务接口获取关联任务信息失败2");
				e.printStackTrace();
			}
		return null;
	}
	
	@Value(value="${DYNewsCommandMobile.resourceGrant_type}")
	private String resourceGrant_type;
	@Value(value="${DYNewsCommandMobile.resourcetenantId}")
	private String resourceTenantId;
	@Value(value="${DYNewsCommandMobile..resourceClientuserId}")
	private String resourceClientUserId;
	@Value(value="${DYNewsCommandMobile.resourceClientId}")
	private String resourceClientId;
	@Value(value="${DYNewsCommandMobile.resourceClientSecret}")
	private String resourceClientSecret;
	
	public String gottoken() {
		try {
			String resourceTokenUrl = resourceUrl + "/oauth/token";
			log.debug("获取token的url："+resourceTokenUrl);
			StringBuffer sb = new StringBuffer();
			String requesturl=resourceTokenUrl;
			String requesrparams1="grant_type";
			String requesrparams2="tenantId";
			String requesrparams3="userId";
			String requestUrl=requesturl+"?"+requesrparams1+"="+resourceGrant_type+"&"+requesrparams2+"="+resourceTenantId+"&"+requesrparams3+"="+resourceClientUserId;
			//base64加密处理clientId 和 clientSecret
			String beforeEncode=resourceClientId+":"+resourceClientSecret;
			String afterEncode=Base64.encode(beforeEncode.getBytes());
			
			URL url=new URL(requestUrl);
			log.debug("请求："+requestUrl);
			URLConnection connection = url.openConnection();
			connection.setRequestProperty("Authorization", "Basic "+ afterEncode);
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String temp="";
			while(((temp=br.readLine())!=null)) {
				sb.append(temp);
			}
			br.close();
			log.debug("从token接口获取到的值为："+sb.toString());
			String ssb = sb.toString();
			//JSONObject jsonresponse = JSONObject.fromString(ssb);
			JSONObject jsonresponse = JSONObject.fromObject(ssb);
			log.debug("将获取的值转化为json对象为"+jsonresponse.toString());
			String finalToken = jsonresponse.getString("access_token");
			log.debug("提取并返回的的token值为:"+finalToken);
			return finalToken;
		} catch (Exception e) {
			log.debug("未能获取到token");
			e.printStackTrace();
		}
		return null;
	}
	
	
}