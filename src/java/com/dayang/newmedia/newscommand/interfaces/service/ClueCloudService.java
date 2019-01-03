package com.dayang.newmedia.newscommand.interfaces.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.newscommand.interfaces.db.model.ClueCloudInterfaceQueryCondition1;
import com.dayang.newmedia.newscommand.interfaces.db.model.ClueCloudIterfaceQueryCondition;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
@Service
public class ClueCloudService {
	private Logger log = LoggerFactory.getLogger(ClueCloudService.class);
	//从配置文件中获取线索云的接口url
	@Value(value="${clueCloudUrl.xuanti}")
	private String xuantiUrl;
	public String getClueList(ClueCloudIterfaceQueryCondition paramss){
		log.debug(clientSecret+"getClueList+com.dayang.newmedia.newscommand.service.ClueCloudService.getClueList()");
		log.debug("get query conditions as ClueCloudIterfaceQueryCondition from web ,they are:"+paramss.toString());
		log.debug("获取线索的url："+xuantiUrl);
		//通过httpclients创建客户端 httpclient
		CloseableHttpClient httpClient = HttpClients.createDefault();
		//创建创建针对某路径的post请求实例
		HttpPost post = new HttpPost(xuantiUrl);
		JSONObject object = new JSONObject();
		object.put("resourceMediaType", paramss.getResourceMediaType());
		object.put("start", paramss.getStart());
		object.put("limit",paramss.getLimit());
		if(paramss.getSiteNames()!=null && paramss.getSiteNames().toString()!="") {
			ArrayList<String> sites = new ArrayList<>();
			String[] names = paramss.getSiteNames();
			for (String site : names) {
			log.debug("网站参数："+site);
			sites.add(site);
			}
			object.put("siteNames", sites);
		}
		if(paramss.getLocationNames()!=null && paramss.getLocationNames().toString()!="") {
			ArrayList<String> locationNames = new ArrayList<>();
			String[] names = paramss.getLocationNames();
			for (String location : names) {
			log.debug("地理参数："+location);
			locationNames.add(location);
			}
			object.put("locationNames", locationNames);
		}
		log.debug("请求的json"+object.toString());
		StringEntity stringEntity = new StringEntity(object.toString(), "utf-8");
		stringEntity.setContentType("application/json;charset=utf-8");
		String token = gottoken();
		post.setEntity(stringEntity);
		post.addHeader("token", token);
		log.debug("post请求:"+post.getEntity().toString());
		log.debug("post请求:"+post.toString());
		try {
			CloseableHttpResponse response = httpClient.execute(post);
 				HttpEntity entity = response.getEntity();
 				String result = EntityUtils.toString(entity,"utf-8");
 				EntityUtils.consume(entity);
 		log.debug("线索云返回的result:"+result);		
		return result;
		}
 			catch (Exception e) {
			log.debug("调用线索云接口失败");
			e.printStackTrace();
		} 
		return null;
	}
	
	
	@Value(value="${clueCloudUrl.xuanti.key}")
	private String keyXuantiUrl;
	public String getClueListByKeyWord(ClueCloudInterfaceQueryCondition1 paramss){
		log.debug(clientSecret+"getClueList+com.dayang.newmedia.newscommand.service.ClueCloudService.getClueListByKeyWord()");
		log.debug("get query conditions as ClueCloudIterfaceQueryCondition1 from web ,they are:"+paramss.toString());
		log.debug("获取线索的url："+keyXuantiUrl);
		//通过httpclients创建客户端 httpclient
		CloseableHttpClient httpClient = HttpClients.createDefault();
		//创建创建针对某路径的post请求实例
		HttpPost post = new HttpPost(keyXuantiUrl);
		JSONObject object = new JSONObject();
		//1媒体类型标识：0（资讯）、1（论坛）、4（微博）、11（微信）
		object.put("resourceMediaType", paramss.getResourceMediaType());
		//2页码
		object.put("page", paramss.getPage());
		//3页面大小
		object.put("pageSize",paramss.getPageSize());
			//获取七天前的当前 时刻
			String sttime = getDateCondition(7);
			//获取当前的当前 时刻 
			String edtime = getDateCondition(0);
		//4发布时间起始值
		object.put("ptTimeStart", sttime);
		//5发布时间结束值
		object.put("ptTimeEnd", edtime);
		//6全文检索字段
		object.put("fullTextContent", paramss.getFullTextContent());
			JSONArray sortList = new JSONArray();
			JSONObject sortNo1 = new JSONObject();
			sortNo1.put("sortName", "publish_time");
			sortNo1.put("sortType", "desc");
			sortList.add(sortNo1);
		//7排序字段集合
		object.put("sortList", sortList);
		
		log.debug("请求的json"+object.toString());
		StringEntity stringEntity = new StringEntity(object.toString(), "utf-8");
		stringEntity.setContentType("application/json;charset=utf-8");
		String token = gottokenNo2();
		post.setEntity(stringEntity);
		post.addHeader("token", token);
		log.debug("post请求:"+post.getEntity().toString());
		log.debug("post请求:"+post.toString());
		try {
			CloseableHttpResponse response = httpClient.execute(post);
 				HttpEntity entity = response.getEntity();
 				String result = EntityUtils.toString(entity,"utf-8");
 				EntityUtils.consume(entity);
 		log.debug("线索云返回的result:"+result);		
		return result;
		}
 			catch (Exception e) {
			log.debug("调用线索云接口失败");
			e.printStackTrace();
		} 
		return null;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 根据配置的    第一个 ！  租户id和用户id 从线索云获取token
	 * @return
	 */
	
	@Value(value="${clueCloud.grant_type}")
	private String grant_type;
	//从配置文件中读取的租户id信息
	@Value(value="${clueCloud.TenantId}")
	private String tenantId;
	//从配置文件中读取的userid信息
	@Value(value="${clueCloud.UserId}")
	private String userId;
	//从配置文件中读取的客户id信息
	@Value(value="${clueCloud.clientId}")
	private String clientId;
	//从配置文件中读取的客户密码信息
	@Value(value="${clueCloud.clientSecret}")
	private String clientSecret;
	//从配置文件中读取的获取token的路径
	@Value(value="${clueCloudUrl.token}")
	private String tokenUrl;
	
	public String gottoken() {
		try {
			log.debug("获取token的url："+tokenUrl);
			StringBuffer sb = new StringBuffer();
			String requesturl=tokenUrl;
			String requesrparams1="grant_type";
			String requesrparams2="tenantId";
			String requesrparams3="userId";
			String requestUrl=requesturl+"?"+requesrparams1+"="+grant_type+"&"+requesrparams2+"="+tenantId+"&"+requesrparams3+"="+userId;
			//base64加密处理clientId 和 clientSecret
			String beforeEncode=clientId+":"+clientSecret;
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
	
	/*
	 * 	clueCloud.TenantId.big=7fe79084-b00f-416b-a690-819aac5fa0d1
		clueCloud.UserId.big=admin
		clueCloud.clientId.big=test
		clueCloud.clientSecret.big=test
	 */
	
	//从配置文件中读取的租户id信息
		@Value(value="${clueCloud.TenantId.big}")
		private String tenantIdNo2;
		//从配置文件中读取的userid信息
		@Value(value="${clueCloud.UserId.big}")
		private String userIdNo2;
		//从配置文件中读取的客户id信息
		@Value(value="${clueCloud.clientId.big}")
		private String clientIdNo2;
		//从配置文件中读取的客户密码信息
		@Value(value="${clueCloud.clientSecret.big}")
		private String clientSecretNo2;
	public String gottokenNo2() {
		try {
			log.debug("获取tokenNo2的url："+tokenUrl);
			StringBuffer sb = new StringBuffer();
			String requesturl=tokenUrl;
			String requesrparams1="grant_type";
			String requesrparams2="tenantId";
			String requesrparams3="userId";
			String requestUrl=requesturl+"?"+requesrparams1+"="+grant_type+"&"+requesrparams2+"="+tenantIdNo2+"&"+requesrparams3+"="+userIdNo2;
			//base64加密处理clientId 和 clientSecret
			String beforeEncode=clientIdNo2+":"+clientSecretNo2;
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
	
	
	/*
	 * 获取几天前的日期  传入数字几 获得几天前的日期
	 */
	public String getDateCondition(int days) {
		Date date = new Date();
		long time = date.getTime();
		Date yesterday = new Date(time - (86400000l*days));
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String yesterdayString = format.format(yesterday);
		return yesterdayString;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
