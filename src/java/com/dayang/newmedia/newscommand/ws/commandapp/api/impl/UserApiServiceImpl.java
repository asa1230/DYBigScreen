package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.newscommand.db.model.ServerSettings;
import com.dayang.newmedia.newscommand.service.ServerSettingsService;
import com.dayang.newmedia.newscommand.service.UserBanmianInfoService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.UserApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.LoginResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryServerUrlResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.UserCondition;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class UserApiServiceImpl extends UserApiService {
	
	public Logger log = Logger.getLogger(UserApiServiceImpl.class); 
	private UserBanmianInfoService userBanmianInfoService =  (UserBanmianInfoService) SpringContextUtil.getBean("userBanmianInfoService");
	private ServerSettingsService serverSettingsService =  (ServerSettingsService) SpringContextUtil.getBean("serverSettingsService");
	
	
	
	
	
	@Override
    public Response getUserInfo(UserCondition userCondition, SecurityContext securityContext)
    throws NotFoundException {
		log.debug("-------getUserInfo request param:"+userCondition+"-----");
		try {
			LoginResponse loginResponse = userBanmianInfoService.getUserInfo(userCondition);
			log.debug("---------loginResponse:"+loginResponse+"--------");
			return Response.ok().entity(loginResponse).build();
		} catch (Exception e) {
			log.error("---------getUserInfo error----",e);
			return Response.ok().entity(getLoginResponseFailure(e.getMessage())).build();
		}
    }
	
    @Override
    public Response login(UserCondition userCondition, SecurityContext securityContext)
    throws NotFoundException {
    	log.debug("-------login request param:"+userCondition+"-----");
		try {
			LoginResponse loginResponse = userBanmianInfoService.getUserInfo(userCondition);
			log.debug("---------loginResponse:"+loginResponse+"--------");
			return Response.ok().entity(loginResponse).build();
		} catch (Exception e) {
			log.error("---------login error-----",e);
			return Response.ok().entity(getLoginResponseFailure(e.getMessage())).build();
		}
    }
    
    public LoginResponse getLoginResponseFailure(String msg){
    	LoginResponse loginResponse = new LoginResponse();
    	CommonResponse failureResponse = CommonServiceUtil.getCommonResponseFailure(msg);
    	loginResponse.setCommonResponse(failureResponse);
    	return loginResponse;
    }

    
	@Override
	public Response queryServerUrl(String type, SecurityContext securityContext) throws NotFoundException {
		try {
			ServerSettings serverSettings = serverSettingsService.getServerSettingsByUtype(Integer.valueOf(type));
			QueryServerUrlResponse queryServerUrlResponse = getQueryServerUrlResponseSuccess(serverSettings.getUpath());
    		log.debug("----------end queryServerUrlResponse result[queryServerUrlResponse:]"+queryServerUrlResponse+"------------");
    		return Response.ok().entity(queryServerUrlResponse).build();
    	} catch (Exception e) {
    		QueryServerUrlResponse queryServerUrlResponse = getQueryServerUrlResponseResponseFailure(e.toString());
			return Response.ok().entity(queryServerUrlResponse).build();
		}
	} 
    
	
    /**
     * 失败
     * @param msg
     * @return
     */
    public QueryServerUrlResponse getQueryServerUrlResponseResponseFailure(String msg){
    	QueryServerUrlResponse queryServerUrlResponse = new QueryServerUrlResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
    	queryServerUrlResponse.setCommonResponse(commonResponse);
		return queryServerUrlResponse;
    }
    
    /**
     * 成功
     * @param msg
     * @return
     */
    public QueryServerUrlResponse getQueryServerUrlResponseSuccess(String url){
    	QueryServerUrlResponse queryServerUrlResponse = new QueryServerUrlResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess("");
    	queryServerUrlResponse.setCommonResponse(commonResponse);
    	queryServerUrlResponse.setUrl(url);;
		return queryServerUrlResponse;
    }
}
