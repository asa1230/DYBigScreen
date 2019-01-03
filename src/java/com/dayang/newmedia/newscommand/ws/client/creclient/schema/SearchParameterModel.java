package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

public class SearchParameterModel {
	private String token;

	private List<Condition> conditions ;

	private String userId;

	private boolean searchInFile;

	private String extendResultFields;

	private boolean needSummary;

	private boolean needHightLight;
	
	private boolean onlySearchNotDeletedObject;
	
	private boolean onlySearchPublishObject;

	public boolean isOnlySearchPublishObject() {
		return onlySearchPublishObject;
	}

	public void setOnlySearchPublishObject(boolean onlySearchPublishObject) {
		this.onlySearchPublishObject = onlySearchPublishObject;
	}

	private String orderBy;

	private int start;

	private int limit;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<Condition> getConditions() {
		return conditions;
	}

	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isSearchInFile() {
		return searchInFile;
	}

	public void setSearchInFile(boolean searchInFile) {
		this.searchInFile = searchInFile;
	}

	public String getExtendResultFields() {
		return extendResultFields;
	}

	public void setExtendResultFields(String extendResultFields) {
		this.extendResultFields = extendResultFields;
	}

	public boolean isNeedSummary() {
		return needSummary;
	}

	public void setNeedSummary(boolean needSummary) {
		this.needSummary = needSummary;
	}

	public boolean isNeedHightLight() {
		return needHightLight;
	}

	public void setNeedHightLight(boolean needHightLight) {
		this.needHightLight = needHightLight;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public boolean isOnlySearchNotDeletedObject() {
		return onlySearchNotDeletedObject;
	}

	public void setOnlySearchNotDeletedObject(boolean onlySearchNotDeletedObject) {
		this.onlySearchNotDeletedObject = onlySearchNotDeletedObject;
	}
	
	
}
