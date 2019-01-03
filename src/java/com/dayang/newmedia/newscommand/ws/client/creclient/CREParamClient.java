package com.dayang.newmedia.newscommand.ws.client.creclient;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;

import com.ctc.wstx.dtd.ConcatModel;
import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.HttpClientUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.QueryScpinResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.Scpin;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ScpinCondition;

import net.sf.json.JSONObject;


public class CREParamClient {
	
	public static Logger log = Logger.getLogger(CREParamClient.class); 
	
	/**
	 * 获取入库参数
	 * @param serverUrl
	 * @param scpinCondition
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static QueryScpinResponse queryScpin(String serverUrl,ScpinCondition scpinCondition) throws Exception{
		log.debug("-----------CRE begin queryScpin----------");
		if (scpinCondition == null) {
			throw new Exception("请求参数异常!");
		}
		JSONObject jsonParam = JSONObject.fromObject(scpinCondition);
		String result = HttpClientUtil.httpPost(serverUrl, jsonParam, Constants.APPLICATION_TYPE_TEXT_JSON);
		// 去掉开头结尾的""，使其成为json格式
		if (StringUtils.isNotEmpty(result)) {
			result = result.substring(1,result.length()-1);
		}
		result = StringEscapeUtils.unescapeJava(result);
		log.debug("-----------CRE end queryScpin【result:】"+result+"----------");
		Map<String, Object> classMap = new HashMap<>();
		classMap.put("scpInList", Scpin.class);
		JSONObject resultJson = JSONObject.fromObject(result);
		QueryScpinResponse queryScpinResponse = (QueryScpinResponse) JSONObject.toBean(resultJson, QueryScpinResponse.class, classMap);
		return queryScpinResponse;
	}
	
	/**
	 * 获取指挥调度入库参数
	 * @param serverUrl
	 * @param userId
	 * @param token
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static QueryScpinResponse queryNewsCommand(String serverUrl,String userId,String token) throws Exception{
		ScpinCondition scpinCondition = new ScpinCondition();
		scpinCondition.setUserId(userId);
		scpinCondition.setToken(token);
		scpinCondition.setType(4);
		scpinCondition.setSourceSystem(Constants.CRE_FROM);
		return queryScpin(serverUrl, scpinCondition);
	}
	
	/**
	 * 获取指挥调度入库参数
	 * @return
	 * @author luomeng
	 * @throws Exception 
	 */
	public static QueryScpinResponse queryNewsCommand(String serverUrl) throws Exception{
		ScpinCondition scpinCondition = new ScpinCondition();
		String token = CommonServiceUtil.getUserToken(null, null);
		scpinCondition.setToken(token);
		return queryNewsCommand(serverUrl, Constants.DEFAULT_CRE_USERID, token);
	}
	
	public static void main(String[] args) throws Exception {
		String serverUrl = "http://100.0.10.201:8080/cre/api/configuration/scpin/load";
		QueryScpinResponse queryScpinResponse = queryNewsCommand(serverUrl, "admin", "TGT-2400-wb312GXYJ3ABGf3mcNbNZPj1RzdjSTeFguQJ6pPlwTzQDviXc2-cas");
	}
}
