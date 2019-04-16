package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.newscommand.db.model.BigScreenForUser;
import com.dayang.newmedia.newscommand.db.model.Bigscreen;
import com.dayang.newmedia.newscommand.db.model.BigscreenUser;
import com.dayang.newmedia.newscommand.db.model.LoginUser;
import com.dayang.newmedia.newscommand.service.BigscreenService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryBigscreenApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Column;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBigscreenResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryColumnResponse;

import net.sf.json.JSONObject;

public class QueryBigscreenApiServiceImpl extends QueryBigscreenApiService{
	
	public static Logger log = Logger.getLogger(QueryBigscreenApiServiceImpl.class);
    public BigscreenService bigscreenService = (BigscreenService) SpringContextUtil.getBean("bigscreenService");

	@Override
	public Response queryBigscreen(HttpServletRequest request) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			LoginUser userInfo = (LoginUser)request.getSession().getAttribute("UserInfo");
			if(userInfo!= null) {
				
				List<Bigscreen> bigscreenList = bigscreenService.getBigScreenByUserGuid(userInfo.getTenantid());
				return  Response.ok().entity(getResopnseWithSuccess("",userInfo,bigscreenList)).build();
			}
			
            return  Response.ok().entity(getResopnseWithSuccess("",null,null)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response addBigscreen(String perdate,HttpServletRequest request) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			LoginUser userInfo = (LoginUser)request.getSession().getAttribute("UserInfo");
			Bigscreen Bigscreen = new Bigscreen();
	    	JSONObject json = JSONObject.fromObject(perdate); 
	    	String createBigscreenName = json.get("createBigscreenName").toString();
	    	String createBigscreenUrl = json.get("createBigscreenUrl").toString();
	    	String createControlBigscreenUrl = json.get("createControlBigscreenUrl").toString();
	    	String createBigscreenImg = json.get("createBigscreenImg").toString();
	    	String uuid = UUID.randomUUID().toString();
	    	
	    	Bigscreen.setScreenguid(uuid);
	    	Bigscreen.setScreenname(createBigscreenName);
	    	Bigscreen.setScreenurl(createBigscreenUrl);
	    	Bigscreen.setControlscreenurl(createControlBigscreenUrl);
	    	Bigscreen.setScreenimg(createBigscreenImg);
	    	Bigscreen.setCreatetime(new Date());
	    	Bigscreen.setScreenstate(1);
	    	Bigscreen.setScreentype("3");
	    	Bigscreen.setScreengroup(4);
	    	
	    	if(userInfo!=null) {
	    		Bigscreen.setCreater(userInfo.getTenantname());
		    	Bigscreen.setCreatertenantid(userInfo.getTenantid());
	    	}else {
	    		Bigscreen.setCreater(null);
		    	Bigscreen.setCreatertenantid(null);
	    	}
			
			bigscreenService.addBigScreen(Bigscreen);
            return  Response.ok().entity(getResopnseWithSuccess("",null,null)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response updateBigscreen(String perdate,SecurityContext securityContext) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			Bigscreen Bigscreen = new Bigscreen();
	    	JSONObject json = JSONObject.fromObject(perdate); 
	    	
	    	String hidBigscreenGuid = json.get("hidBigscreenGuid").toString();
	    	String editBigscreenName = json.get("editBigscreenName").toString();
	    	String editBigscreenUrl = json.get("editBigscreenUrl").toString();
	    	String editControlBigscreenUrl = json.get("editControlBigscreenUrl").toString();
	    	String editBigscreenImg = json.get("editBigscreenImg").toString();
	    	
	    	Bigscreen = bigscreenService.getBigScreenByGuid(hidBigscreenGuid);
	    	
	    	Bigscreen.setScreenname(editBigscreenName);
	    	Bigscreen.setScreenurl(editBigscreenUrl);
	    	Bigscreen.setControlscreenurl(editControlBigscreenUrl);
	    	Bigscreen.setScreenimg(editBigscreenImg);
			
			bigscreenService.updateBigScreen(Bigscreen);
            return  Response.ok().entity(getResopnseWithSuccess("",null,null)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response deleteBigscreen(String perdate,SecurityContext securityContext) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			
			String[] ids = perdate.split(",");
	    	
			for(String id : ids){
				
    			bigscreenService.deleteBigScreen(id);
    		}
			
            return  Response.ok().entity(getResopnseWithSuccess("",null,null)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response queryOtherBigscreen(String perdate,SecurityContext securityContext) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			JSONObject json = JSONObject.fromObject(perdate); 
	    	String searchContent = json.get("searchContent").toString();
			
			List<Bigscreen> bigscreenList = bigscreenService.getOtherBigScreen("%" + searchContent + "%");
	    	
			
            return  Response.ok().entity(getResopnseWithSuccess("",null,bigscreenList)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response queryOtherBigscreenByID(String perdate,SecurityContext securityContext) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			List<Bigscreen> bigscreenList = new ArrayList<Bigscreen>();
			
			JSONObject json = JSONObject.fromObject(perdate); 
	    	String guid = json.get("guid").toString();
			
	    	Bigscreen Bigscreen = bigscreenService.getBigScreenByGuid(guid);
	    	bigscreenList.add(Bigscreen);
	    	
			
            return  Response.ok().entity(getResopnseWithSuccess("",null,bigscreenList)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	
	
	/**
     * 成功返回结果
     * 
     * @param msg
     * @return
     */
	public QueryBigscreenResponse getResopnseWithSuccess(String message,LoginUser userInfo, List<Bigscreen> records) {
		QueryBigscreenResponse queryBigscreenResponse = new QueryBigscreenResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess(message);
        queryBigscreenResponse.setCommonResponse(commonResponse);
        queryBigscreenResponse.setRecords(records);
        queryBigscreenResponse.setUserinfo(userInfo);
        return queryBigscreenResponse;
    }
	
	/**
     * 失败返回结果
     * 
     * @param msg
     * @return
     */
    public QueryBigscreenResponse getResponseWithFailure(String msg) {
    	QueryBigscreenResponse queryBigscreenResponse = new QueryBigscreenResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
        queryBigscreenResponse.setCommonResponse(commonResponse);
        return queryBigscreenResponse;
    }
    

}
