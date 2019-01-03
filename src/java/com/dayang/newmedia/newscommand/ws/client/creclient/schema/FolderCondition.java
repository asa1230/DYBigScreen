package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

public class FolderCondition {
	private String userId;

	private String token;

	private List<ResourceFolder> resourceFolderList ;

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

	public List<ResourceFolder> getResourceFolderList() {
		return resourceFolderList;
	}

	public void setResourceFolderList(List<ResourceFolder> resourceFolderList) {
		this.resourceFolderList = resourceFolderList;
	}

	@Override
	public String toString() {
		return "FolderCondition [userId=" + userId + ", token=" + token + ", resourceFolderList=" + resourceFolderList
				+ "]";
	}

	
}
