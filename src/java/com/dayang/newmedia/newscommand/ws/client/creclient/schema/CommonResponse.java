package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.io.Serializable;

public class CommonResponse implements Serializable {
	
	
	private boolean success;
	private String description;
	
	public CommonResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
