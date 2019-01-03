package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

public class AddMessageRequest {
	private List<Message> messageList;

	public List<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}
	
}
