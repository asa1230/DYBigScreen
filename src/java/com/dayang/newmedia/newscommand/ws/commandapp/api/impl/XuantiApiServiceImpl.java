package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.newscommand.service.NewsTaskService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.ApiResponseMessage;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.XuantiApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXuantiByIdResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

/**
 * 根据选题ID获取选题详情
 * 1、获取选题详情
 * 2、调用CRE接口获取挂在资源详情
 * 3、获取分配任务列表
 * @author luomeng
 *
 */

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class XuantiApiServiceImpl extends XuantiApiService {
	
	public static Logger log = Logger.getLogger(XuantiApiServiceImpl.class); 
	public NewsTaskService newsTaskService = (NewsTaskService) SpringContextUtil.getBean("newsTaskService");
	
    @Override
    public Response queryXuantiById(String id, SecurityContext securityContext)
    throws NotFoundException {
    	log.debug("----------begin queryXuantiById------------");
    	try {
    		NewsTask newsTask = newsTaskService.getXuanTiNewsTaskById(id);
    		QueryXuantiByIdResponse queryXuantiByIdResponse = getQueryXuantiByIdResponseSuccess(newsTask);
    		log.debug("----------end queryXuantiByIdResponse result[queryXuantiByIdResponse:]"+queryXuantiByIdResponse+"------------");
    		return Response.ok().entity(queryXuantiByIdResponse).build();
		} catch (Exception e) {
			log.error("-------queryXuantiById error-------",e);
			QueryXuantiByIdResponse queryXuantiByIdResponse = getQueryXuantiByIdResponseFailure(e.toString());
			return Response.ok().entity(queryXuantiByIdResponse).build();
		}
    }
    
    /**
     * 失败
     * @param msg
     * @return
     */
    public QueryXuantiByIdResponse getQueryXuantiByIdResponseFailure(String msg){
    	QueryXuantiByIdResponse queryXuantiByIdResponse = new QueryXuantiByIdResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
    	queryXuantiByIdResponse.setCommonResponse(commonResponse);
		return queryXuantiByIdResponse;
    }
    
    /**
     * 成功
     * @param msg
     * @return
     */
    public QueryXuantiByIdResponse getQueryXuantiByIdResponseSuccess(NewsTask newsTask){
    	QueryXuantiByIdResponse queryXuantiByIdResponse = new QueryXuantiByIdResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess("");
    	queryXuantiByIdResponse.setCommonResponse(commonResponse);
    	queryXuantiByIdResponse.setTaskInfo(newsTask);
		return queryXuantiByIdResponse;
    }
}
