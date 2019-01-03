package com.dayang.newmedia.newscommand.ws.client.creclient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import com.dayang.newmedia.common.utils.HttpClientUtil;
import com.dayang.newmedia.common.utils.JsonUtil;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ParameterModel;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.UserLoadModel;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * CRE用户详情获取
 * @author luomeng
 *
 */
public class CREUserLoadClient {
	
	public static Logger log = Logger.getLogger(CREUserLoadClient.class);
	
	/**
	 * 获取信息
	 * @param url
	 * @param bean
	 * @return
	 */
	public static List<UserLoadModel> userLoadClient(String url,ParameterModel bean){
		String msg = "";
		List<UserLoadModel> userLoadList = new ArrayList<UserLoadModel>();
		try {
			log.info("*********userLoad:调用【CRE接口】开始**************");
			HashSet<String> propertySet = new HashSet<String>();
			propertySet.add("userIdList");
			propertySet.add("token");
			if(StringUtils.isNotEmpty(bean.getToken())){
				String jsonParam = JsonUtil.jsonFromObject(bean, "yyyy-MM-dd", propertySet);
				log.info("*********url:" + url + "**************");
				log.info("*********jsonParam:" + jsonParam + "**************");
				String result = HttpClientUtil.HttpClientPost(url, jsonParam);
				if(StringUtils.isNotEmpty(result)){
					JSONObject json = JSONObject.fromObject(result);
					JSONObject commonResponseJson = json.getJSONObject("commonResponse");
					//成功
					if(commonResponseJson.getBoolean("success")){
						JSONArray jsonArray = json.getJSONArray("userList");
						userLoadList = JsonUtil.jsonArrayToList(UserLoadModel.class, jsonArray.toString());
						msg="success-成功获取信息";
					}else{
						msg="fail-调用CRE接口失败:【"+commonResponseJson.getString("description")+"】";
					}
				}else{
					msg="fail-调用CRE接口失败:【没有返回任何数据】";
				}
			}else{
				msg="fail-【令牌】不可为空";
			}
		} catch (Exception e) {
			log.error("********调用【CRE接口】异常：" + e.toString()+"********");
			msg="fail-CRE接口调用异常";
			e.printStackTrace();
		}
		log.info("******msg:"+msg+"*******");
		return userLoadList;
	}
	
	/**
	 * 根据用户ID和token获取用户详情
	 * @param url
	 * @param userId
	 * @param token
	 * @return
	 */
	public static List<UserLoadModel> userLoadClient(String url,String userId,String token){
		log.debug("---------CRE userLoadClient begin-----");
		ParameterModel parameterModel = new ParameterModel();
		List<String> userIdList = new ArrayList<String>();
		userIdList.add(userId);
		parameterModel.setUserIdList(userIdList);
		parameterModel.setToken(token);
		return userLoadClient(url, parameterModel);
	}
	
	public static void main(String[] args) {
		String url = "http://100.0.10.201:8080/cre/api/authorization/user/load";
		List<UserLoadModel> user = userLoadClient(url, "0016","TGT-2400-wb312GXYJ3ABGf3mcNbNZPj1RzdjSTeFguQJ6pPlwTzQDviXc2-cas");
		System.out.println(user.get(0).getName());
		System.out.println(user.get(0).getIconUrl());
	}
}
