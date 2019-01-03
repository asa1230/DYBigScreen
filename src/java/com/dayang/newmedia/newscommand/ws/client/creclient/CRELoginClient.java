package com.dayang.newmedia.newscommand.ws.client.creclient;

import java.util.HashSet;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.HttpClientUtil;
import com.dayang.newmedia.common.utils.JsonUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.LoginModel;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ParameterModel;

import net.sf.json.JSONObject;

/**
 * CRE登陆认证
 * @author luomeng
 *
 */
public class CRELoginClient {
	
	public static Logger log = Logger.getLogger(CRELoginClient.class); 
	/**
	 * 登陆认证
	 * @param url
	 * @param bean
	 * @return
	 * @author luomeng
	 */
	public static LoginModel loginClient(String loginUrl,String loginUser,String pwd,String from){
		log.debug("-----------CRE loginClient begin----------");
		
		if (StringUtils.isEmpty(loginUrl)) {
			log.error("CRE用户认证接口地址配置为null，参数名字");
			return null;
		}
		
		if(StringUtils.isNotEmpty(loginUser)&&StringUtils.isNotEmpty(pwd)){
			//登录认证
			ParameterModel bean = new ParameterModel();
			bean.setFrom(from);
			bean.setLoginUser(loginUser);
			bean.setPwd(pwd);
			LoginModel loginModel = CRELoginClient.loginClient(loginUrl, bean);
			return loginModel;
		}
		return null;
	}
	
	/**
	 * 用户认证-登录
	 * @param url
	 * @param bean
	 * @return
	 */
	public static LoginModel loginClient(String url,ParameterModel bean){
		LoginModel jsonBean = new LoginModel();
		String msg = "";
		try {
			log.info("*********login:调用【CRE接口】开始**************");
			HashSet<String> propertySet = new HashSet<String>();
			propertySet.add("from");
			propertySet.add("loginUser");
			propertySet.add("pwd");
			if(StringUtils.isNotEmpty(bean.getLoginUser())&&StringUtils.isNotEmpty(bean.getPwd())){
				String jsonParam = JsonUtil.jsonFromObject(bean, "yyyy-MM-dd", propertySet);
				log.info("*********url:"+url+"**************");
				log.info("*********jsonParam:"+jsonParam+"**************");
				String result = HttpClientUtil.HttpClientPost(url, jsonParam);
				log.info("*********result:"+result+"**************");
			
				//解析返回的结果
				if(StringUtils.isNotEmpty(result)){
					//获取数据
					JSONObject json = JSONObject.fromObject(result);
					jsonBean = JsonUtil.jsonArrayToList(LoginModel.class,"["+json.toString()+"]").get(0);
					int code = json.getInt("code");
					//0:登录成功；1:用户被锁定；2:用户名或密码不正确；3:验证内部错误
					if(code==0){
						msg="success-登录成功";
					}else if(code==1){
						msg="fail-用户被锁定";
					}else if(code==2){
						msg="fail-用户名或密码不正确";
					}else{
						msg="fail-验证内部错误";
					}
				}else{
					msg="fail-CRE接口调用失败";
				}
			}else{
				msg="fail-【密码、用户名、调用系统】不可为空";
			}
		} catch (Exception e) {
			msg="fail-CRE接口调用异常";
			log.error("********调用【CRE接口】异常********",e);
		}
		log.info("***********msg:"+msg+"**************");
		return jsonBean;
	}
	
	public static void main(String[] args) {
		String loginUrl = "http://100.0.10.201:8080/cas/api/login";
		LoginModel loginModel = loginClient(loginUrl, "admin", "admin", "newsCommand");
		System.out.println(loginModel.getCode());
		System.out.println(loginModel.getToken());
		System.out.println(loginModel.getUserId());
	}
}
