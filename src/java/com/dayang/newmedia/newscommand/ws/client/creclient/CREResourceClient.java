package com.dayang.newmedia.newscommand.ws.client.creclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.HttpClientUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.model.enums.CRECONDITION;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.AddCREResourceRequest;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.AddCREResourceResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.AddResourceFolderResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.CREFile;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.CREResource;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.Condition;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ExtendAttributes;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.Files;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ItemList;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ItemListWarper;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.SearchParameterModel;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.HJResourceClient;

import net.sf.json.JSONObject;

/**
 * CRE资源的操作
 * @author luomeng
 */
public class CREResourceClient {
	
	public static Logger log = Logger.getLogger(CREResourceClient.class); 
	
	/**
	 * 根据资源ID获取资源详情
	 * @param searchUrl
	 * @param resourceGuid
	 * @return
	 * @throws Exception
	 */
	public static ItemListWarper getCREResourceById(String searchUrl,String resourceGuid) throws Exception{
		log.debug("-----------begin getCREResourceById----------");
		if (StringUtils.isEmpty(resourceGuid)) {
			throw new Exception("请求参数有误!");
		}
		SearchParameterModel searchParameterModel = new SearchParameterModel();
		List<Condition> conditionList = new ArrayList<Condition>();
		Condition condition = new Condition();
		condition.setId(Constants.CRE_SEARCH_ID);
		condition.setValue(resourceGuid);
		conditionList.add(condition);
		searchParameterModel.setConditions(conditionList);
		searchParameterModel.setLimit(Constants.MAX_PAGE);
		return getCREResourceList(searchUrl, searchParameterModel);
	}
	
	
	/**
	 * 获取CRE资源
	 * @return
	 * @author luomeng
	 * @throws Exception 
	 */
	public static ItemListWarper getCREResourceList(String searchUrl,String searchContent,Integer start,Integer limit,String userId,String token) throws Exception{
		log.debug("-----------begin getCREResourceList----------");
		SearchParameterModel searchParameterModel = new SearchParameterModel();
		searchParameterModel.setLimit(limit);
		searchParameterModel.setStart(start);
		searchParameterModel.setUserId(userId);
		searchParameterModel.setToken(token);
		
		List<Condition> conditionList = new ArrayList<Condition>();
		// 内容过滤
		if (StringUtils.isNotEmpty(searchContent)) {
			Condition condition = new Condition();
			condition.setId(CRECONDITION.CONTENT.getId());
			condition.setValue(searchContent);
			conditionList.add(condition);
		}
		// 过滤调选题目录
		Condition conditionFold = new Condition();
		conditionFold.setId(CRECONDITION.RESOURCETYPE.getId());
		conditionFold.setValue("7");
		conditionFold.setOperator("1");
		conditionFold.setDataType("1");
		conditionList.add(conditionFold);
		searchParameterModel.setExtendResultFields("正文");
		searchParameterModel.setConditions(conditionList);
		
		return getCREResourceList(searchUrl, searchParameterModel);
	}
	
	/**
	 * 获取CRE资源
	 * @param searchUrl
	 * @param searchParameterModel
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static ItemListWarper getCREResourceList(String searchUrl,SearchParameterModel searchParameterModel) throws Exception{
		log.debug("-----------begin getCREResourceList----------");
		if (searchParameterModel == null) {
			throw new Exception("请求参数异常!");
		}
		// 每页条数
		if (searchParameterModel.getLimit()==0) {
			searchParameterModel.setLimit(Constants.DEFAULT_LIMIT);
		}
		// userId
		if (StringUtils.isEmpty(searchParameterModel.getUserId())) {
			searchParameterModel.setUserId(Constants.DEFAULT_CRE_USERID);
		}
		// token
		if (StringUtils.isEmpty(searchParameterModel.getToken())) {
			searchParameterModel.setToken(CommonServiceUtil.getUserToken(null, null));
		}
		// 排序
		if (StringUtils.isEmpty(searchParameterModel.getOrderBy())) {
			searchParameterModel.setOrderBy(Constants.DEFAULT_CRE_ORDERBY);
		}
		// 默认情况情况下过滤已删除的资源
		searchParameterModel.setOnlySearchNotDeletedObject(true);
		searchParameterModel.setOnlySearchPublishObject(false);
		// 将实体对象转化成json
		JSONObject paramJson = JSONObject.fromObject(searchParameterModel);
		log.debug("-----------getCREResourceList request param:"+paramJson+"----------");
		
		// 发送请求
		String result = HttpClientUtil.httpPost(searchUrl, paramJson,Constants.APPLICATION_TYPE_TEXT_JSON);
		// 去掉开头结尾的""，使其成为json格式
		if (StringUtils.isNotEmpty(result)) {
			result = result.substring(1,result.length()-1);
		}
		result = StringEscapeUtils.unescapeJava(result);
		log.debug("-----------getCREResourceList request result:"+result+"----------");
		// 将json转化成对象
		JSONObject resultJson = JSONObject.fromObject(result);
		Map<String, Class> classMap = new HashMap<String, Class>();
		classMap.put("itemList", ItemList.class);
		classMap.put("files", Files.class);
		classMap.put("extendAttributes", ExtendAttributes.class);
		ItemListWarper itemListWarper = (ItemListWarper) JSONObject.toBean(resultJson, ItemListWarper.class, classMap);
		return itemListWarper;
	}
	
	/**
	 * 获取CRE选题目录资源
	 * @return
	 * @author luomeng
	 * @throws Exception 
	 */
	public static ItemListWarper getCREFolderResourceList(String searchUrl,String searchContent,Integer start,Integer limit,String userId,String token,String floderId) throws Exception{
		log.debug("-----------begin getCREResourceList----------");
		SearchParameterModel searchParameterModel = new SearchParameterModel();
		searchParameterModel.setLimit(limit);
		searchParameterModel.setStart(start);
		searchParameterModel.setUserId(userId);
		searchParameterModel.setToken(token);
		
		List<Condition> conditionList = new ArrayList<Condition>();
		if (StringUtils.isNotEmpty(searchContent)) {
			Condition condition = new Condition();
			condition.setId(CRECONDITION.CONTENT.getId());
			condition.setValue(searchContent);
			conditionList.add(condition);
			Condition conditionName = new Condition();
			conditionName.setId(CRECONDITION.NAME.getId());
			conditionName.setValue(searchContent);
			conditionList.add(conditionName);
		}
		
		if (StringUtils.isNotEmpty(floderId)) {
			Condition condition = new Condition();
			condition.setId(CRECONDITION.FOLDERID.getId());
			condition.setValue(floderId);
			conditionList.add(condition);
		}
		searchParameterModel.setConditions(conditionList);
		// 默认情况下过滤掉已删除的资源
		searchParameterModel.setOnlySearchNotDeletedObject(true);
		searchParameterModel.setOnlySearchPublishObject(false);
		searchParameterModel.setNeedSummary(true);
		return getCREResourceList(searchUrl, searchParameterModel);
	}
	
	/**
	 * 添加CRE资源
	 * @param addCREResourceRequest
	 * @return
	 * @author luomeng
	 * @throws Exception 
	 */
	public static AddCREResourceResponse addCREResource(String serverUrl,String userId,ItemList itemList,String folderId) throws Exception {
		return addCREResource(serverUrl, getSaveAsCREResourceRequest(userId, itemList,folderId));
	}
	
	/**
	 * 将CRE资源分发到某个选题目录下
	 * @param userId
	 * @param itemList
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	/*public static AddCREResourceRequest getAddCREResourceRequest(String userId,ItemList itemList,String folderId) throws Exception{
		AddCREResourceRequest addCREResourceRequest = new AddCREResourceRequest();
		addCREResourceRequest.setUserId("admin");
		String token = CommonServiceUtil.getUserToken(null, null);
		addCREResourceRequest.setToken(token);
		addCREResourceRequest.setUpdate(Constants.CRE_RESOURCE_UPDATE);
		addCREResourceRequest.setFileUpdateMode(Constants.CRE_RESOURCE_ADD_UPLOAD_TYPE);
		CREResource creResource = getCREResource(itemList,folderId);
		List<CREResource> resources = new ArrayList<>();
		resources.add(creResource);
		addCREResourceRequest.setResourceList(resources);
		return addCREResourceRequest;
	}*/
	
	/**
	 * 将CRE资源分发到某个选题目录下
	 * @param userId
	 * @param itemList
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static AddCREResourceRequest getSaveAsCREResourceRequest(String userId,ItemList itemList,String folderId) throws Exception{
		AddCREResourceRequest addCREResourceRequest = new AddCREResourceRequest();
		addCREResourceRequest.setUserId(userId);
		String token = CommonServiceUtil.getUserToken(null, null);
		addCREResourceRequest.setToken(token);
		CREResource creResource = getCREResource(itemList,folderId);
		List<CREResource> resources = new ArrayList<>();
		resources.add(creResource);
		addCREResourceRequest.setResourceList(resources);
		return addCREResourceRequest;
	}
	
	/**
	 * 将CER资源转化成CRE接口所需要的参数
	 * @param itemList
	 * @return
	 * @author luomeng
	 */
	public static CREResource getCREResource(ItemList itemList,String folderId){
		CREResource creResource = new CREResource();
		creResource.setId(itemList.getId());
		creResource.setName(itemList.getName());
		//creResource.setProType(itemList.getProType());
		creResource.setSource(Constants.CRE_FROM);
		if (StringUtils.isNotEmpty(folderId)) {
			creResource.setFolderId(folderId);
		}
		//creResource.setScpInId("539D001C-1205-422F-9895-86146B472E9E");
		//creResource.setFiles(new ArrayList<CREFile>());
		return creResource;
	}
	
	/**
	 * 添加CRE资源
	 * @param addCREResourceRequest
	 * @return
	 * @author luomeng
	 * @throws Exception 
	 */
	public static AddCREResourceResponse addCREResource(String serverUrl,AddCREResourceRequest addCREResourceRequest) throws Exception{
		log.debug("---------begin AddCREResourceResponse----------");
		if (addCREResourceRequest == null || 
			!StringUtils.listIsNotEmpty(addCREResourceRequest.getResourceList())) {
			throw new Exception("请求参数异常!");
		}
		
		JSONObject paramJson = JSONObject.fromObject(addCREResourceRequest);
		paramJson.put("isUpdate",true);
		log.debug("---------AddCREResourceResponse param:"+paramJson+"----------");
		String result = HttpClientUtil.httpPost(serverUrl, paramJson, Constants.APPLICATION_TYPE_TEXT_JSON);
		log.debug("---------end AddCREResourceResponse result:"+result+"----------");
		JSONObject resultJson = JSONObject.fromObject(result);
		Map<String, Object> map = new HashMap<>();
		map.put("addResourceListResponse",AddResourceFolderResponse.class);
		AddCREResourceResponse addCREResourceResponse = (AddCREResourceResponse) JSONObject.toBean(resultJson, AddCREResourceResponse.class, map);
		return addCREResourceResponse;
	}
	
	public static void main(String[] args) throws Exception {
		String searchUrl = "http://100.0.10.201:8080/cre/api/search";
		SearchParameterModel searchParameterModel = new SearchParameterModel();
		searchParameterModel.setUserId("admin");
		searchParameterModel.setToken("TGT-3058-igqbbevxNfTwEc2gSLwlQekEdNaYYasb3XlxDfrDhiyc2rj5UB-cas");
		searchParameterModel.setStart(0);
		searchParameterModel.setLimit(2);
		searchParameterModel.setSearchInFile(true);
		searchParameterModel.setOrderBy("created desc");
		searchParameterModel.setNeedSummary(true);
		getCREResourceList(searchUrl, searchParameterModel);
		
	}
	
	
}
