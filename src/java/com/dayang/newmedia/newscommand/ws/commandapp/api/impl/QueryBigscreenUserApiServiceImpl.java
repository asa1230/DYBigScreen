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
import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryBigscreenUserApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Column;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBigscreenUserResponse;

import net.sf.json.JSONObject;

public class QueryBigscreenUserApiServiceImpl extends QueryBigscreenUserApiService{
	
	public static Logger log = Logger.getLogger(QueryBigscreenUserApiServiceImpl.class);
    public BigscreenService bigscreenService = (BigscreenService) SpringContextUtil.getBean("bigscreenService");

	@Override
	public Response queryBigscreenUser(String name,SecurityContext securityContext) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			List<BigscreenUser> bigscreenUserList = new ArrayList<BigscreenUser>();
			if(name.equals("")) {
				bigscreenUserList = bigscreenService.getBigScreenUser();
			}else {
				bigscreenUserList = bigscreenService.getBigScreenUserByName("%" + name + "%");
			}
			
			
            return  Response.ok().entity(getResopnseWithSuccess("",bigscreenUserList)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response queryAllBigscreen(SecurityContext securityContext) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			
			List<Bigscreen> bigScreenList =  bigscreenService.getAllBigScreen();
			return  Response.ok().entity(getResopnseWithByIDSuccess("",null,null,bigScreenList)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response queryBigscreenUserByID(String guid,SecurityContext securityContext) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			BigscreenUser BigscreenUser = bigscreenService.getBigScreenUserByID(guid);
			List<Bigscreen> bigScreenList =  bigscreenService.getAllBigScreen();
			
			List<Bigscreen> bigscreenUserList = bigscreenService.getBigScreenByUserGuid(BigscreenUser.getTenantid());
            return  Response.ok().entity(getResopnseWithByIDSuccess("",BigscreenUser,bigscreenUserList,bigScreenList)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response updateTenant(String perdate,HttpServletRequest request) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			LoginUser userInfo = (LoginUser)request.getSession().getAttribute("UserInfo");
			BigscreenUser BigscreenUser = new BigscreenUser();
	    	JSONObject json = JSONObject.fromObject(perdate); 
	    	String tenantID = json.get("hideTenantID").toString();
	    	String tenantorgName = json.get("tenantorgName").toString();
	    	String screenIDS = json.get("screenIDS").toString();
	    	String isuer = json.get("isuer").toString();
	    	String[] ids = screenIDS.split(",");
	    	if(tenantID.equals("")) {
	    		String uuid = UUID.randomUUID().toString();
	    		BigscreenUser.setGuid(uuid);
	    		BigscreenUser.setEdittime(new Date());
	    		if(userInfo != null) {
	    			BigscreenUser.setTenantid(userInfo.getTenantid());
		    		BigscreenUser.setTenantorgname(userInfo.getTenantname());
	    		}else {
	    			BigscreenUser.setTenantid(null);
		    		BigscreenUser.setTenantorgname(null);
	    		}
		    	BigscreenUser.setIsuse(Integer.parseInt(isuer));
		    	BigscreenUser.setModifytime(new Date());
		    	BigscreenUser.setScreennum(ids.length);
		    	BigscreenUser.setScreentheme(0);
		    	
		    	if(ids.length>0) {
		    		for(String id : ids){
		    			BigScreenForUser bfu = new BigScreenForUser();
		    			String newid = UUID.randomUUID().toString();
		    			bfu.setGuid(newid);
		    			bfu.setScreenguid(id);
		    			bfu.setTenantid(BigscreenUser.getTenantid());
		    			bfu.setTenantorgname(BigscreenUser.getTenantorgname());
		    			bfu.setCreatetime(new Date());
		    			bigscreenService.addBigScreenForUser(bfu);
		    		}
		    	}
		    	bigscreenService.addBigScreenUser(BigscreenUser);
	    	}else {
	    		BigscreenUser = bigscreenService.getBigScreenUserByID(tenantID);
	    		List<BigScreenForUser> BigScreenForUserList = bigscreenService.getBytenantID(BigscreenUser.getTenantid());
	    		for(BigScreenForUser record : BigScreenForUserList){
	    			bigscreenService.deleteBigScreenForUser(record.getGuid());
	    		}
	    		
	    		BigscreenUser.setTenantorgname(tenantorgName);
		    	BigscreenUser.setIsuse(Integer.parseInt(isuer));
		    	BigscreenUser.setModifytime(new Date());
		    	BigscreenUser.setScreennum(ids.length);
		    	BigscreenUser.setScreentheme(0);
		    	
		    	if(ids.length>0) {
		    		for(String id : ids){
		    			BigScreenForUser bfu = new BigScreenForUser();
		    			String newid = UUID.randomUUID().toString();
		    			bfu.setGuid(newid);
		    			bfu.setScreenguid(id);
		    			bfu.setTenantid(BigscreenUser.getTenantid());
		    			bfu.setTenantorgname(BigscreenUser.getTenantorgname());
		    			bfu.setCreatetime(new Date());
		    			bigscreenService.addBigScreenForUser(bfu);
		    		}
		    	}
		    	bigscreenService.updateBigScreenUser(BigscreenUser);
	    	}
	    	
	    	
	    	
            return  Response.ok().entity(getResopnseWithByIDSuccess("操作成功",null,null,null)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response deleteTenant(String perdate,SecurityContext securityContext) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			
			
			String[] ids = perdate.split(",");
	    	
			for(String id : ids){
				
				BigscreenUser BigscreenUser = bigscreenService.getBigScreenUserByID(id);
	    		List<BigScreenForUser> BigScreenForUserList = bigscreenService.getBytenantID(BigscreenUser.getTenantid());
	    		for(BigScreenForUser record : BigScreenForUserList){
	    			bigscreenService.deleteBigScreenForUser(record.getGuid());
	    		}
				
    			bigscreenService.deleteBigScreenUser(id);
    		}
			
            return  Response.ok().entity(getResopnseWithByIDSuccess("操作成功",null,null,null)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response changeOpenTenant(String perdate,SecurityContext securityContext) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			
			
			String[] ids = perdate.split(",");
	    	
			for(String id : ids){
				
				BigscreenUser BigscreenUser = bigscreenService.getBigScreenUserByID(id);
				BigscreenUser.setIsuse(1);
				BigscreenUser.setModifytime(new Date());
				
				bigscreenService.updateBigScreenUser(BigscreenUser);
				
    		}
			
            return  Response.ok().entity(getResopnseWithByIDSuccess("操作成功",null,null,null)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
	}
	
	@Override
	public Response changeCloseTenant(String perdate,SecurityContext securityContext) throws NotFoundException {
		// TODO Auto-generated method stub
		try {
			
			
			String[] ids = perdate.split(",");
	    	
			for(String id : ids){
				
				BigscreenUser BigscreenUser = bigscreenService.getBigScreenUserByID(id);
				BigscreenUser.setIsuse(0);
				BigscreenUser.setModifytime(new Date());
				
				bigscreenService.updateBigScreenUser(BigscreenUser);
				
    		}
			
            return  Response.ok().entity(getResopnseWithByIDSuccess("操作成功",null,null,null)).build();
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
	public QueryBigscreenUserResponse getResopnseWithSuccess(String message, List<BigscreenUser> records) {
		QueryBigscreenUserResponse QueryBigscreenUserResponse = new QueryBigscreenUserResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess(message);
        QueryBigscreenUserResponse.setCommonResponse(commonResponse);
        QueryBigscreenUserResponse.setRecords(records);
        return QueryBigscreenUserResponse;
    }
	
	/**
     * 成功返回结果
     * 
     * @param msg
     * @return
     */
	public QueryBigscreenUserResponse getResopnseWithByIDSuccess(String message,BigscreenUser bcUser, List<Bigscreen> bigScreenUserList, List<Bigscreen> bigScreenList) {
		QueryBigscreenUserResponse QueryBigscreenUserResponse = new QueryBigscreenUserResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess(message);
        QueryBigscreenUserResponse.setCommonResponse(commonResponse);
        QueryBigscreenUserResponse.setBcUser(bcUser);
        QueryBigscreenUserResponse.setBigScreenList(bigScreenList);
        QueryBigscreenUserResponse.setBigScreenUserList(bigScreenUserList);
        return QueryBigscreenUserResponse;
    }
	
	/**
     * 失败返回结果
     * 
     * @param msg
     * @return
     */
    public QueryBigscreenUserResponse getResponseWithFailure(String msg) {
    	QueryBigscreenUserResponse queryBigscreenResponse = new QueryBigscreenUserResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
        queryBigscreenResponse.setCommonResponse(commonResponse);
        return queryBigscreenResponse;
    }
    

}
