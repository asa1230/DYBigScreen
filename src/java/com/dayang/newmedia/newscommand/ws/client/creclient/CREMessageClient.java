package com.dayang.newmedia.newscommand.ws.client.creclient;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.HttpClientUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.AddMessageRequest;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.AddMessageResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.AddResourceFolderResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.DeleteMessageResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.MarkReadResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.Message;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.QueryMessageCondition;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.QueryMessageCountResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.QueryMessageResponse;

import net.sf.json.JSONObject;

public class CREMessageClient {
	public static Logger log = Logger.getLogger(CREMessageClient.class);

	/**
	 * 添加消息
	 * @param serverUrl
	 * @param messages
	 * @return
	 * @throws Exception
	 */
	public static  AddMessageResponse addMessage(String serverUrl, List<Message> messages) throws Exception{
		if (StringUtils.listIsNotEmpty(messages)) {
			AddMessageRequest addMessageRequest = new AddMessageRequest();
			addMessageRequest.setMessageList(messages);
			AddMessageResponse addMessageResponse = addMessage(serverUrl, addMessageRequest);
			if (addMessageResponse!=null) {
				return addMessageResponse;
			}
		}
		return null;
	}
	
	/**
	 * 添加消息
	 * 
	 * @param addMessageRequest
	 * @param serverUrl
	 * @return
	 * @author luomeng
	 * @throws Exception
	 */
	public static AddMessageResponse addMessage(String serverUrl, AddMessageRequest addMessageRequest)
			throws Exception {
		log.debug("---------begin CRE AddMessageResponse---------------");
		if (addMessageRequest != null) {
			JSONObject paramJson = JSONObject.fromObject(addMessageRequest);
			log.debug("---------------AddMessageResponse Request Param[addMessageRequest:]" + paramJson
					+ "-------------");
			//String result = HttpClientUtil.HttpClientPost(serverUrl, paramJson.toString());
			String result = HttpClientUtil.httpPost(serverUrl, paramJson, Constants.APPLICATION_TYPE_TEXT_JSON);
			log.debug("---------------AddMessageResponse Response Result" + result + "--------------");
			// 去掉开头结尾的""，使其成为json格式
			if (StringUtils.isNotEmpty(result)) {
				result = result.substring(1,result.length()-1);
			}
			result = StringEscapeUtils.unescapeJava(result);
			JSONObject resultJson = JSONObject.fromObject(result);
			Map<String, Object> classMap = new HashMap<>();
			classMap.put("addMessageResponse", AddResourceFolderResponse.class);
			AddMessageResponse addMessageResponse = (AddMessageResponse) JSONObject.toBean(resultJson,
					AddMessageResponse.class, classMap);
			return addMessageResponse;
		}
		return null;
	}

	/**
	 * 查询满足条件的消息
	 * 
	 * @param queryMessageCondition
	 * @param serverUrl
	 * @return
	 * @author luomeng
	 * @throws Exception
	 */
	public static QueryMessageResponse queryMessage(String serverUrl, QueryMessageCondition queryMessageCondition)
			throws Exception {
		log.debug("----------begin CRE queryMessage------------");
		if (queryMessageCondition != null) {
			JSONObject paramJson = JSONObject.fromObject(queryMessageCondition);
			log.debug("---------------queryMessage Request paramJson" + paramJson + "--------------");
			//String result = HttpClientUtil.HttpClientPost(serverUrl, paramJson.toString());
			String result = HttpClientUtil.httpPost(serverUrl, paramJson, Constants.APPLICATION_TYPE_TEXT_JSON);
			log.debug("---------------queryMessage Response Result" + result + "--------------");
			JSONObject resultJson = JSONObject.fromObject(result);
			Map<String, Object> classMap = new HashMap<>();
			classMap.put("messageList", Message.class);
			QueryMessageResponse queryMessageResponse = (QueryMessageResponse) JSONObject.toBean(resultJson,
					QueryMessageResponse.class, classMap);
			return queryMessageResponse;
		}
		return null;
	}

	/**
	 * 查询满足条件消息的个数
	 * 
	 * @param serverUrl
	 * @param queryMessageCondition
	 * @return
	 * @author luomeng
	 */
	public static QueryMessageCountResponse queryMessageCount(String serverUrl,QueryMessageCondition queryMessageCondition) {
		return null;
	}

	/**
	 * 将消息标记为已读
	 * 
	 * @param serverUrl
	 * @param messageIdList
	 * @return
	 */
	public static MarkReadResponse markMessageToReaded(String serverUrl, List<String> messageIdList) {
		return null;
	}

	/**
	 * 删除消息
	 * 
	 * @param serverUrl
	 * @param messageIdList
	 * @return
	 */
	public static DeleteMessageResponse deleteMessages(String serverUrl, List<String> messageIdList) {
		
		return null;
	}

	public static void main(String[] args) throws Exception {
		String serverUrl = "http://localhost:3333/messagecenter/api/message/add";
		AddMessageRequest addMessageRequest = new AddMessageRequest();
		List<Message> messageList = new ArrayList<>();
		Message message = new Message();
		message.setContent("罗罗罗哦多发点撒发发");
		message.setSourceAppId(Constants.MESSAGESOURCEORTARGETID);
		message.setSourceUserId("0016");
		message.setTargetUserId("admin");
		message.setTargetAppId(Constants.MESSAGESOURCEORTARGETID);
		messageList.add(message);
		addMessageRequest.setMessageList(messageList);
		//addMessage(serverUrl, addMessageRequest);
		
		
		String searchUrl = "http://localhost:3333/messagecenter/api/message/query";
		QueryMessageCondition queryMessageCondition = new QueryMessageCondition();
		queryMessageCondition.setSourceUserId("0016");
		queryMessageCondition.setTargetUserId("admin");
		queryMessageCondition.setSourceAppId(Constants.MESSAGESOURCEORTARGETID);
		queryMessageCondition.setStarFlag(0);
		queryMessageCondition.setReadFlag(0);
		queryMessageCondition.setStart(0);
		queryMessageCondition.setFetchCount(Constants.DEFAULT_LIMIT);
		queryMessage(searchUrl, queryMessageCondition);
	}
	
	
}
