package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

public class ParameterModel {
	//用户认证
	private String from;
	private String loginUser;
	private String pwd;
	
	//获取用户
	private List<String> userIdList;
	
	//获取权限
	//获取栏目
	private String token;
	private String userId;
	private String privilegePrefix;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPrivilegePrefix() {
		return privilegePrefix;
	}
	public void setPrivilegePrefix(String privilegePrefix) {
		this.privilegePrefix = privilegePrefix;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public List<String> getUserIdList() {
		return userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	

}
