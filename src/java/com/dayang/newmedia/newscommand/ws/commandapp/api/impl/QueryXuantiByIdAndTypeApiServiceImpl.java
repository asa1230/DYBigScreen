package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.newscommand.db.model.enums.XUANTIGZTYPE;
import com.dayang.newmedia.newscommand.service.NewsTaskService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryXuantiByIdAndTypeApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXuantiByIdAndTypeResponse;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-11T08:12:33.541Z")
public class QueryXuantiByIdAndTypeApiServiceImpl extends QueryXuantiByIdAndTypeApiService {
	
	public static Logger log = Logger.getLogger(QueryXuantiByIdAndTypeApiServiceImpl.class); 
	public NewsTaskService newsTaskService = (NewsTaskService) SpringContextUtil.getBean("newsTaskService");
	
    @Override
    public Response queryXuantiByIdAndType(String id, String type, SecurityContext securityContext)
    throws NotFoundException {
    	log.debug("----------begin queryXuantiByIdAndType------------");
    	try {
    		//默认type=0,为挂载资源
    		if (type == null) {
    			type = XUANTIGZTYPE.RESOURCE.getType().toString();
			}
    		QueryXuantiByIdAndTypeResponse queryXuantiByIdAndTypeObj = newsTaskService.getQueryXuantiByIdAndType(id,type);
    		QueryXuantiByIdAndTypeResponse queryXuantiByIdAndTypeResponse = getQueryXuantiByIdAndTypeResponseSuccess(queryXuantiByIdAndTypeObj);
    		log.debug("----------end queryXuantiByIdAndType result[queryXuantiByIdAndTypeResponse:]"+queryXuantiByIdAndTypeResponse+"------------");
    		return Response.ok().entity(queryXuantiByIdAndTypeResponse).build();
		} catch (Exception e) {
			log.error("-------queryXuantiByIdAndTypeById error-------",e);
			QueryXuantiByIdAndTypeResponse queryXuantiByIdAndTypeResponse = getQueryXuantiByIdAndTypeResponseFailure(e.toString());
			return Response.ok().entity(queryXuantiByIdAndTypeResponse).build();
		}
    }
    
    
    /**
     * 失败
     * @param msg
     * @return
     */
    public QueryXuantiByIdAndTypeResponse getQueryXuantiByIdAndTypeResponseFailure(String msg){
    	QueryXuantiByIdAndTypeResponse queryXuantiByIdAndTypeResponse = new QueryXuantiByIdAndTypeResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
    	queryXuantiByIdAndTypeResponse.setCommonResponse(commonResponse);
		return queryXuantiByIdAndTypeResponse;
    }
    
    /**
     * 成功
     * @param msg
     * @return
     */
    public QueryXuantiByIdAndTypeResponse getQueryXuantiByIdAndTypeResponseSuccess(QueryXuantiByIdAndTypeResponse queryXuantiByIdAndTypeResponse){
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess("");
    	queryXuantiByIdAndTypeResponse.setCommonResponse(commonResponse);
		return queryXuantiByIdAndTypeResponse;
    }
}
