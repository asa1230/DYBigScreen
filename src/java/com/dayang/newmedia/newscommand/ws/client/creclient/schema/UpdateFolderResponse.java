package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

public class UpdateFolderResponse {
	private List<AddResourceFolderResponse> updateResourceFolderListResponse ;

	public List<AddResourceFolderResponse> getUpdateResourceFolderListResponse() {
		return updateResourceFolderListResponse;
	}

	public void setUpdateResourceFolderListResponse(List<AddResourceFolderResponse> updateResourceFolderListResponse) {
		this.updateResourceFolderListResponse = updateResourceFolderListResponse;
	}
	
}
