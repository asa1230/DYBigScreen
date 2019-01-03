package com.dayang.newmedia.newscommand.db.model.enums;

import com.dayang.newmedia.common.utils.Constants;

public enum CLUETYPEANDSERVERTYPE_ID {
	
	HJCLUE(0,Constants.HJ_SERVER_URL_TYPE,"api/resource",Constants.HUIJU_TYPE),
	CRECLUE(1,Constants.CRE_SEARCH_URL_TYPE,"",Constants.CRE_TYPE);
	
	private int clueType;
	private int serverType;
	private String url;
	private String resourceType;   // CRE 、huiju
	private CLUETYPEANDSERVERTYPE_ID(int clueType,int serverType,String url,String resourceType) {
		this.clueType = clueType;
		this.serverType = serverType;
		this.url = url;
		this.resourceType = resourceType;
	}
	public int getClueType() {
		return clueType;
	}
	public void setClueType(int clueType) {
		this.clueType = clueType;
	}
	public int getServerType() {
		return serverType;
	}
	public void setServerType(int serverType) {
		this.serverType = serverType;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	
}
