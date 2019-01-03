package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.newscommand.db.model.Programrating;
import com.dayang.newmedia.newscommand.service.ProgramRatingService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.ProgramRatingApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryProgramRatingResponse;
import com.google.gson.Gson;
  
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public class ProgramRatingApiServiceImp extends ProgramRatingApiService{
	public static Logger log = Logger.getLogger(QuerySelectListToBigShowApiServiceImpl.class); 
	public ProgramRatingService programRatingService = (ProgramRatingService) SpringContextUtil.getBean("programRatingService");
    @Override
    public Response queryProgramRating(SecurityContext securityContext) {
    	try {
    	//获取收视率信息
    	List<Programrating>	lstProgramratingChannel =  programRatingService.getListProgramrating("CHANNELNAME");
    	log.info("lstProgramratingChannel.size()="+lstProgramratingChannel.size());
    	//获取收视率时间范围信息
    	List<Programrating>	lstProgramratingDate =  programRatingService.getListProgramrating("RATINGDATE");
    	log.info("lstProgramratingDate.size()="+lstProgramratingDate.size());
    	String strProgRatingName = "";
    	if ((lstProgramratingDate!=null) && lstProgramratingDate.size()>0){
        	Programrating programrating =lstProgramratingDate.get(0);
        	strProgRatingName = programrating.getRatingvalue();    		
    	}
    	QueryProgramRatingResponse querySelectListResponse = new QueryProgramRatingResponse();
    	CommonResponse commonResponse = new CommonResponse();
    	commonResponse.setSuccess(true);
    	commonResponse.setErrorDesc("");
    	querySelectListResponse.setCommonResponse(commonResponse);
    	querySelectListResponse.setTotalCount(100);
    	querySelectListResponse.setCurrentPage(1);
    	querySelectListResponse.setLimit(10);
    	querySelectListResponse.setProgramRatingDate(strProgRatingName);
    	querySelectListResponse.setRecords(lstProgramratingChannel);
		return Response.ok().entity(querySelectListResponse).build();
    	} catch (Exception e) {
    		log.error("----------querySelectListToBigShow error-------",e);
			return Response.ok().entity(getQuerySelectListToBigShowWithFailure(e.toString())).build();
    	}
    }
    	
    
    /**
     * 失败返回结果
     * @param msg
     * @return
     */
    public QueryProgramRatingResponse getQuerySelectListToBigShowWithFailure(String msg){
    	QueryProgramRatingResponse querySelectListResponse = new QueryProgramRatingResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
    	querySelectListResponse.setCommonResponse(commonResponse);
		return querySelectListResponse;
    }


	@Override
	public Response queryAll(SecurityContext securityContext)
			throws NotFoundException {
		try {
			List<Programrating> list = programRatingService.queryAllProgramRating();
			QueryProgramRatingResponse querySelectListResponse = new QueryProgramRatingResponse();
			CommonResponse commonResponse = new CommonResponse();
			commonResponse.setSuccess(true);
			commonResponse.setErrorDesc("");
			querySelectListResponse.setCommonResponse(commonResponse);
			querySelectListResponse.setRecords(list);
			return Response.ok().entity(querySelectListResponse).build();
		} catch (Exception e) {
			log.error("----------queryAll error-------",e);
			return Response.ok().entity(getQuerySelectListToBigShowWithFailure(e.toString())).build();
		}
	}


	@Override
	public Response addOrUpdate(Programrating programRating,
			SecurityContext securityContext) throws NotFoundException {
		log.debug("=========addOrUpdate begin : param:" + new Gson().toJson(programRating));
		try {
			programRatingService.addOrUpdateProgramRating(programRating);
			log.debug("=========addOrUpdate end");
			return Response.ok().entity(CommonServiceUtil.getCommonResponseSuccess("保存成功")).build();
		} catch (Exception e) {
			log.error("=========" + e.getMessage());
			e.printStackTrace();
			return Response.ok().entity(CommonServiceUtil.getCommonResponseFailure(e.getMessage())).build();
		}
	}


	@Override
	public Response deleteProgramRating(String ids,
			SecurityContext securityContext) throws NotFoundException {
		log.debug("=========deleteProgramRating begin : param:" + ids);
		try {
			if(StringUtils.isEmpty(ids)){
//			return "待删除id为空！";
			}
			String[] idArr = ids.split(",");
			programRatingService.deleteProgramRatingBatch(Arrays.asList(idArr));
			log.debug("=========deleteProgramRating end");
			return Response.ok().entity(CommonServiceUtil.getCommonResponseSuccess("删除成功")).build();
		} catch (Exception e) {
			log.error("=========" + e.getMessage());
			e.printStackTrace();
			return Response.ok().entity(CommonServiceUtil.getCommonResponseFailure(e.getMessage())).build();
		}
	}


}
