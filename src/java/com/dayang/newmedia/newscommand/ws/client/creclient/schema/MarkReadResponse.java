package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

public class MarkReadResponse {
	private List<AddResourceFolderResponse> markMessageResponse;

	public List<AddResourceFolderResponse> getMarkMessageResponse() {
		return markMessageResponse;
	}

	public void setMarkMessageResponse(List<AddResourceFolderResponse> markMessageResponse) {
		this.markMessageResponse = markMessageResponse;
	}
	
}
