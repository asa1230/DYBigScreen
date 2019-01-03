package com.dayang.newmedia.newscommand.ws.client.creclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.HttpClientUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.AddResourceFolderResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.DeleteCREFolderResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.FolderCondition;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.MetaData;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ResourceFolder;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.SAttribute;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.UpdateFolderResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * CRE选题目录客户端
 * @author lm
 *
 */
public class CREFolderClient {
	
	public static Logger log = Logger.getLogger(CREFolderClient.class); 
	
	/**
	 * 创建选题目录
	 * @param url
	 * @param folderCondition
	 * @throws Exception 
	 */
	public static List<AddResourceFolderResponse> addFolder(String url,FolderCondition folderCondition) throws Exception{
		log.debug("-------begin CRE  addFolder-------------");
		String userId = folderCondition.getUserId();
		String token = folderCondition.getToken();
		if (StringUtils.isEmpty(userId)) {
			userId = Constants.DEFAULT_CRE_USERID;
		}
		// 获取token
		if (StringUtils.isEmpty(token)) {
			token = CommonServiceUtil.getUserToken(null,null);
		}
		folderCondition.setUserId(userId);
		folderCondition.setToken(token);
		JSONObject paramJson = JSONObject.fromObject(folderCondition);
		log.debug("------- CRE  addFolder param "+paramJson+"-------------");
		String result = HttpClientUtil.httpPost(url, paramJson, Constants.APPLICATION_TYPE_TEXT_JSON);
		log.debug("------- CRE  addFolder result "+result+"-------------");
		// 去掉开头结尾的""，使其成为json格式
		if (StringUtils.isNotEmpty(result)) {
			result = result.substring(1,result.length()-1);
		}
		result = StringEscapeUtils.unescapeJava(result);
		JSONObject resultJson = JSONObject.fromObject(result);
		System.out.println(resultJson);
		JSONArray jsonArray = resultJson.getJSONArray("addResourceFolderListResponse");
		return jsonArray.toList(jsonArray, AddResourceFolderResponse.class);
	}
	
	/**
	 * CRE更新选题目录
	 * @param url
	 * @param folderCondition
	 * @return
	 * @throws Exception
	 */
	public static UpdateFolderResponse updateFolder(String url,FolderCondition folderCondition) throws Exception{
		log.debug("-------begin CRE  updateFolder-------------");
		String userId = folderCondition.getUserId();
		String token = folderCondition.getToken();
		if (StringUtils.isEmpty(userId)) {
			userId = Constants.DEFAULT_CRE_USERID;
		}
		// 获取token
		if (StringUtils.isEmpty(token)) {
			token = CommonServiceUtil.getUserToken(null,null);
		}
		folderCondition.setUserId(userId);
		folderCondition.setToken(token);
		JSONObject paramJson = JSONObject.fromObject(folderCondition);
		log.debug("------- CRE  updateFolder request Param  "+paramJson+"-------------");
		String result = HttpClientUtil.httpPost(url, paramJson, Constants.APPLICATION_TYPE_TEXT_JSON);
		log.debug("------- CRE  updateFolder result "+result+"-------------");
		// 去掉开头结尾的""，使其成为json格式
		if (StringUtils.isNotEmpty(result)) {
			result = result.substring(1,result.length()-1);
		}
		result = StringEscapeUtils.unescapeJava(result);
		JSONObject resultJson = JSONObject.fromObject(result);
		Map<String, Object> map = new HashMap<>();
		map.put("updateResourceFolderListResponse", AddResourceFolderResponse.class);
		UpdateFolderResponse updateFolderResponse = (UpdateFolderResponse) JSONObject.toBean(resultJson, UpdateFolderResponse.class, map);
		return updateFolderResponse;
	}
	
	/**
	 * 删除CRE中的选题目录
	 * @param serverUrl
	 * @param ids
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static DeleteCREFolderResponse deleteFolderByIds(String serverUrl,String ids) throws Exception{
		log.debug("------CRE deleteFolderByIds -----");
		if (StringUtils.isEmpty(ids)) {
			throw new Exception("要删除的选题ID不能为空!");
		}
		String userId = Constants.DEFAULT_CRE_USERID;
		String token = CommonServiceUtil.getUserToken(null, null);
		return deleteFolderByIdS(serverUrl, ids, userId, token);
	}
	
	/**
	 * 删除CRE中的选题目录
	 * @param serverUrl
	 * @param ids
	 * @param userId
	 * @param token
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static DeleteCREFolderResponse deleteFolderByIdS(String serverUrl,String ids,String userId,String token) throws Exception {
		JSONObject paramJson = new JSONObject();
		paramJson.put("userId", userId);
		paramJson.put("token", token);
		paramJson.put("ids", ids);
		log.debug("---------CRE deleteFolderByIdS param[paramJson]"+paramJson+"---------");
		String result = HttpClientUtil.httpPost(serverUrl, paramJson, Constants.APPLICATION_TYPE_TEXT_JSON);
		// 去掉开头结尾的""，使其成为json格式
		if (StringUtils.isNotEmpty(result)) {
			result = result.substring(1,result.length()-1);
		}
		result = StringEscapeUtils.unescapeJava(result);
		if (StringUtils.isEmpty(result)) {
			throw new Exception("删除选题目录失败!");
		}
		JSONObject resultJson = JSONObject.fromObject(result);
		log.debug("---------CRE deleteFolderByIdS result[resultJson]"+resultJson.toString()+"---------");
		Map<String, Object> map = new HashMap<>();
		map.put("deleteResourceFolderListResponse",AddResourceFolderResponse.class);
		DeleteCREFolderResponse deleteCREFolderResponse = (DeleteCREFolderResponse) JSONObject.toBean(resultJson, DeleteCREFolderResponse.class, map);
		return deleteCREFolderResponse;
	}
	
	public static void main(String[] args) throws Exception {
		
		String url="http://100.0.10.201:8080/cre/api/resource/folder/add";
		
		FolderCondition folderCondition = new FolderCondition();
		folderCondition.setUserId("admin");
		folderCondition.setToken("fdasdfdfs");
		
		MetaData metaData = new MetaData();
		metaData.setMetaDataCount(1);
		SAttribute sAttribute = new SAttribute();
		sAttribute.setEnumType("0");
		sAttribute.setStrName("栏目名称");
		sAttribute.setValue("测试");
		
		List<SAttribute> sAttributes = new ArrayList<>();
		sAttributes.add(sAttribute);
		metaData.setsAttributes(sAttributes);
		// 生命周期
		//SwichSettings life = swichService.findSwichSettingByType(2);
		// 私密周期
		//SwichSettings secret = swichService.findSwichSettingByType(3);
		
		ResourceFolder resourceFolder = new ResourceFolder();
		String id = StringUtils.CreateGuid();
		System.out.println(id);
		resourceFolder.setId(id);
		resourceFolder.setMetadataInfo(metaData.toString());
		// 任务标题+栏目名称
		resourceFolder.setName("选题目录重复测试");
		String aclContent="0016,10,Admin;0127,10,AdvEditor";
		resourceFolder.setAclContent(aclContent);
		resourceFolder.setParentId("TOPIC_ROOT_FOLDERID");
		List<ResourceFolder> resourceFolderList = new ArrayList<>();
		resourceFolderList.add(resourceFolder);
		folderCondition.setResourceFolderList(resourceFolderList);
		
		addFolder(url, folderCondition);
		
		String deleteUrl="http://100.0.10.201:8080/cre/api/resource/folder/delete";
		//deleteFolderByIds(deleteUrl, "5e610eb2-8a7b-4032-8678-310abbc280ec");
		//deleteFolderByIdS(deleteUrl, "5e610eb2-8a7b-4032-8678-310abbc280ec", "admin", "1212");
	}
	
}
