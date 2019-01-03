package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

public class LoginModel {
	private String code;
	private String description;
	private String userId;
	private String token;
	
//	private String creStatus;//CRE调用状态  0:成功；1:失败; 2:异常
//	private String creDescription;//CRE调用的描述
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
//	public String getCreStatus() {
//		return creStatus;
//	}
//	public void setCreStatus(String creStatus) {
//		this.creStatus = creStatus;
//	}
//	public String getCreDescription() {
//		return creDescription;
//	}
//	public void setCreDescription(String creDescription) {
//		this.creDescription = creDescription;
//	}
	
}
