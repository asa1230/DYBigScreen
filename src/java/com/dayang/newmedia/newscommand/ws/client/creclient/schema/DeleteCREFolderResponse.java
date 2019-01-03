package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

public class DeleteCREFolderResponse {
	private List<AddResourceFolderResponse> deleteResourceFolderListResponse;

	public List<AddResourceFolderResponse> getDeleteResourceFolderListResponse() {
		return deleteResourceFolderListResponse;
	}

	public void setDeleteResourceFolderListResponse(List<AddResourceFolderResponse> deleteResourceFolderListResponse) {
		this.deleteResourceFolderListResponse = deleteResourceFolderListResponse;
	}
	
}
