package com.dayang.newmedia.newscommand.db.model.enums;

import com.dayang.newmedia.common.utils.Constants;

public enum CLUETYPEANDSERVERTYPE_ALL {
	
	HJCLUE(0,Constants.HJ_SERVER_URL_TYPE,"api/resources/find"),
	CRECLUE(1,Constants.CRE_SEARCH_URL_TYPE,"");
	
	private int clueType;
	private int serverType;
	private String url;
	private CLUETYPEANDSERVERTYPE_ALL(int clueType,int serverType,String url) {
		this.clueType = clueType;
		this.serverType = serverType;
		this.url = url;
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
}
