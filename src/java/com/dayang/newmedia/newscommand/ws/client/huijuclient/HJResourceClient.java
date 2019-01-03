package com.dayang.newmedia.newscommand.ws.client.huijuclient;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.HttpClientUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.AddResourceResponse;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.AttachFile;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.CommonResponse;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.FindResourceByIdResponse;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.FindResourceResponse;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.Resource;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.UseHistories;

import net.sf.json.JSONObject;

/**
 * 汇聚资源操作客户端
 * @author luomeng
 *
 */
public class HJResourceClient {
	
	public static Logger log = Logger.getLogger(HJResourceClient.class); 
	
	/**
	 * 根据资源ID获取资源详情
	 * @param url
	 * @param resourceGuid
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static FindResourceByIdResponse getHJResourceById(String url,String resourceGuid) throws Exception{
		log.debug("------begin getHJResourceById---------");
		if (StringUtils.isEmpty(resourceGuid)) {
			throw new Exception("请求参数异常!");
		}
		String fullPath = StringUtils.combineUrl(url, resourceGuid);
		JSONObject resultJson = HttpClientUtil.httpGet(fullPath);
		log.debug("------end getHJResourceById result[resultJson:]"+resultJson+"---------");
		Map<String, Class> classMap = new HashMap<String, Class>();
		classMap.put("attachFiles", AttachFile.class);
		classMap.put("useHistories", UseHistories.class);
		FindResourceByIdResponse findResourceByIdResponse = (FindResourceByIdResponse) JSONObject.toBean(resultJson, FindResourceByIdResponse.class, classMap);
		return findResourceByIdResponse;
	}
	
	/**
	 * 获取汇聚线索
	 * @return
	 * @throws Exception 
	 * @author luomeng
	 */
	public static FindResourceResponse getHJResouceList(String url,String searchContent,String resourceOriginType ,String startTime,String endTime,Integer start,Integer limit) throws Exception{
		log.debug("------begin getHJResouceClue---------");
		JSONObject paramJson = new JSONObject();
		if (StringUtils.isNotEmpty(searchContent)) {
			paramJson.put("fullText", searchContent);
		}
		if(StringUtils.isNotEmpty(resourceOriginType)){
			paramJson.put("resourceOriginType", resourceOriginType);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 开始时间
		if (StringUtils.isEmpty(startTime)) {
			Date startDate = StringUtils.getDateTimeByCurrentTime(4, 10);
			startTime = sdf.format(startDate);
		}
		// 结束时间
		if (StringUtils.isEmpty(endTime)) {
			endTime = sdf.format(new Date());
		}
		// 起始页
		if (start == null) {
			start = 0;
		}
		// 每页条数
		if (limit == null) {
			limit = 5;
		}
		paramJson.put("createdTimeStart", startTime);
		paramJson.put("createdTimeEnd", endTime);
		paramJson.put("start", start);
		paramJson.put("limit", limit);
		log.debug("----------getHJResouceClue param:"+paramJson+"-------------");
		String result = HttpClientUtil.httpPost(url, paramJson, "");
		log.debug("----------getHJResouceClue result:"+result+"-------------");
		JSONObject resultJson = JSONObject.fromObject(result);
		Map<String, Class> classMap = new HashMap<String, Class>();
		classMap.put("records", Resource.class);
		classMap.put("attachFiles", AttachFile.class);
		classMap.put("useHistories", UseHistories.class);

		FindResourceResponse findResourceResponse = (FindResourceResponse) JSONObject.toBean(resultJson, FindResourceResponse.class, classMap);
		CommonResponse response = findResourceResponse.getCommonResponse();
		if (!response.getSuccess()) {
			throw new Exception(response.getErrorDesc());
		}
		
		return findResourceResponse;
	}
	
	/**
	 * 添加资源
	 * @param url
	 * @param resource
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static AddResourceResponse addResource(String url,Resource resource) throws Exception{
		JSONObject paramJson = JSONObject.fromObject(resource);
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		JSONObject resultJson = JSONObject.fromObject(result);
		AddResourceResponse addResourceResponse = (AddResourceResponse) JSONObject.toBean(resultJson,AddResourceResponse.class);
		return addResourceResponse;
	}
	
	
}
