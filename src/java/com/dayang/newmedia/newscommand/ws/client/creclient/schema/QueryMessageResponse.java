package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

public class QueryMessageResponse {
	private String success;

	private String description;

	private List<Message> messageList ;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}
	
	
}
