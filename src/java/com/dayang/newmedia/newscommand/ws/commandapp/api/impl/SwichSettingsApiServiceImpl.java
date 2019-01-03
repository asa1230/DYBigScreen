package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import com.dayang.commons.StringUtil;
import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.newscommand.service.SwichSettingsService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.SwichSettingsApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySwitchSettingValueByTypeResponse;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-04T10:41:20.470Z")
public class SwichSettingsApiServiceImpl extends SwichSettingsApiService {
	
	public static Logger log = Logger.getLogger(SwichSettingsApiServiceImpl.class); 
	public SwichSettingsService swichSettingsService = (SwichSettingsService) SpringContextUtil.getBean("swichSettingsService");
	
    @Override
    public Response querySwitchSettingValueByType(Integer switchType, SecurityContext securityContext) throws NotFoundException {
    	log.debug("----------begin querySwitchSettingValueByType------------");
    	try {
    		Integer swichValue = swichSettingsService.getSwitchSettingValueByType(switchType);//参数值
    		QuerySwitchSettingValueByTypeResponse querySwitchSettingValueByTypeResponse = getQuerySwitchSettingValueByTypeResponseSuccess(swichValue);
    		log.debug("----------end QuerySwitchSettingValueByTypeResponse result[QuerySwitchSettingValueByTypeResponse:]"+querySwitchSettingValueByTypeResponse+"------------");
    		return Response.ok().entity(querySwitchSettingValueByTypeResponse).build();
    	} catch (Exception e) {
			QuerySwitchSettingValueByTypeResponse querySwitchSettingValueByTypeResponse = getQuerySwitchSettingValueByTypeResponseFailure(e.toString());
			return Response.ok().entity(querySwitchSettingValueByTypeResponse).build();
		}
    }
    
    
    /**
     * 失败
     * @param msg
     * @return
     */
    public QuerySwitchSettingValueByTypeResponse getQuerySwitchSettingValueByTypeResponseFailure(String msg){
    	QuerySwitchSettingValueByTypeResponse querySwitchSettingValueByTypeResponse = new QuerySwitchSettingValueByTypeResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
    	querySwitchSettingValueByTypeResponse.setCommonResponse(commonResponse);
		return querySwitchSettingValueByTypeResponse;
    }
    
    /**
     * 成功
     * @param msg
     * @return
     */
    public QuerySwitchSettingValueByTypeResponse getQuerySwitchSettingValueByTypeResponseSuccess(Integer swichValue){
    	QuerySwitchSettingValueByTypeResponse querySwitchSettingValueByTypeResponse = new QuerySwitchSettingValueByTypeResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess("");
    	querySwitchSettingValueByTypeResponse.setCommonResponse(commonResponse);
    	querySwitchSettingValueByTypeResponse.setSwichvalue(swichValue);
		return querySwitchSettingValueByTypeResponse;
    }
}
