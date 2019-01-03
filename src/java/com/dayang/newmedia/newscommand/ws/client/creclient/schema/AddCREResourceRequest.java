package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class AddCREResourceRequest {
	private String token;

	private String userId;
	
	/*@JsonProperty("isUpdate")
	private boolean isUpdate;
	
	private Integer fileUpdateMode;
*/
	private List<CREResource> resourceList ;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/*public boolean isUpdate() {
		return isUpdate;
	}

	public void setUpdate(boolean isUpdate) {
		this.isUpdate = isUpdate;
	}*/

	public List<CREResource> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<CREResource> resourceList) {
		this.resourceList = resourceList;
	}

	/*public Integer getFileUpdateMode() {
		return fileUpdateMode;
	}

	public void setFileUpdateMode(Integer fileUpdateMode) {
		this.fileUpdateMode = fileUpdateMode;
	}*/
	
}
