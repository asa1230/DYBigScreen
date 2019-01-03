package com.dayang.newmedia.newscommand.db.model.enums;

public enum MESSAGESERVICEURL {
	ADDMESSAGE("messagecenter/api/message/add"),
	DELETEMESSAGE("messagecenter/api/message/delete"),
	QUERYMESSAGE("messagecenter/api/message/query"),
	MARKREADMESSAGE("messagecenter/api/message/markread");
	
	private String serverUrl;
	
	private MESSAGESERVICEURL(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}
	
	
}
