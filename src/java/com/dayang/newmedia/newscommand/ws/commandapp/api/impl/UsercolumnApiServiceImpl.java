package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;


import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.newscommand.db.model.UserBanmianInfo;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.UsercolumnApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryUserListResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.UserInfo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

/**
 * 根据用户ID获取其所在栏目下所有用户信息
 * @author luomeng
 *
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class UsercolumnApiServiceImpl extends UsercolumnApiService {
	
	public static Logger log = Logger.getLogger(UsercolumnApiServiceImpl.class); 
    @Override
    public Response queryUserList(String userId, SecurityContext securityContext)
    throws NotFoundException {
    	log.debug("------------------begin queryUserList-------------");
    	try {
			// 1、获取用户栏目信息
			List<UserBanmianInfo> userBanmianInfos = CommonServiceUtil.getUserBanmianInfoList();
			// 2、封装请求参数
			List<UserInfo> userInfo = getUserInfosByUserBanmianInfos(userBanmianInfos);
			QueryUserListResponse queryUserListResponse = getQueryUserListResponseSuccess(userInfo);
			return Response.ok().entity(queryUserListResponse).build();
		} catch (Exception e) {
			log.error("----------------queryUserList error----------",e);
			return Response.ok().entity(getQueryUserListResponseFailure(e.toString())).build();
		}
    }
    
    /**
     * 将用户信息封装成APP所需要的格式
     * @param userBanmianInfos
     * @return
     * @author luomeng
     */
	private List<UserInfo> getUserInfosByUserBanmianInfos(List<UserBanmianInfo> userBanmianInfos) {
		List<UserInfo> userInfoList = new ArrayList<>();
		Set<String> userIdSet = new HashSet<>(); 
		for (UserBanmianInfo userBanmianInfo : userBanmianInfos) {
			String userId = userBanmianInfo.getUserguid();
			boolean isSuccess = userIdSet.add(userId);
			if (isSuccess) {
				UserInfo userInfo = new UserInfo();
				userInfo.setUserId(userId);
				userInfo.setUserName(userBanmianInfo.getUsername());
				userInfoList.add(userInfo);
			}
		}
		return userInfoList;
	}
	
	/**
	 * 成功返回
	 * @param userInfo
	 * @return
	 * @author luomeng
	 */
	private QueryUserListResponse getQueryUserListResponseSuccess(List<UserInfo> userInfo){
		QueryUserListResponse queryUserListResponse = new QueryUserListResponse();
		CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess("");
		queryUserListResponse.setCommonResponse(commonResponse);
		queryUserListResponse.setUserInfos(userInfo);
		return queryUserListResponse;
	}
	
	/**
	 * 失败返回
	 * @param userInfo
	 * @return
	 * @author luomeng
	 */
	private QueryUserListResponse getQueryUserListResponseFailure(String msg){
		QueryUserListResponse queryUserListResponse = new QueryUserListResponse();
		CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
		queryUserListResponse.setCommonResponse(commonResponse);
		return queryUserListResponse;
	}
}
