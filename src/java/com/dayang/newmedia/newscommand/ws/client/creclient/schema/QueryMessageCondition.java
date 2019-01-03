package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

public class QueryMessageCondition {
	private String sourceUserId;

	private String targetUserId;

	private String sourceAppId;

	private String targetAppId;

	private String contentFilter;

	/*private List<String> timeRange ;*/

	private int starFlag;

	private int readFlag;

	private int start;

	private int fetchCount;

	private String targetMobileAppId;

	public String getSourceUserId() {
		return sourceUserId;
	}

	public void setSourceUserId(String sourceUserId) {
		this.sourceUserId = sourceUserId;
	}

	public String getTargetUserId() {
		return targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
	}

	public String getSourceAppId() {
		return sourceAppId;
	}

	public void setSourceAppId(String sourceAppId) {
		this.sourceAppId = sourceAppId;
	}

	public String getTargetAppId() {
		return targetAppId;
	}

	public void setTargetAppId(String targetAppId) {
		this.targetAppId = targetAppId;
	}

	public String getContentFilter() {
		return contentFilter;
	}

	public void setContentFilter(String contentFilter) {
		this.contentFilter = contentFilter;
	}

	/*public List<String> getTimeRange() {
		return timeRange;
	}

	public void setTimeRange(List<String> timeRange) {
		this.timeRange = timeRange;
	}*/

	public int getStarFlag() {
		return starFlag;
	}

	public void setStarFlag(int starFlag) {
		this.starFlag = starFlag;
	}

	public int getReadFlag() {
		return readFlag;
	}

	public void setReadFlag(int readFlag) {
		this.readFlag = readFlag;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getFetchCount() {
		return fetchCount;
	}

	public void setFetchCount(int fetchCount) {
		this.fetchCount = fetchCount;
	}

	public String getTargetMobileAppId() {
		return targetMobileAppId;
	}

	public void setTargetMobileAppId(String targetMobileAppId) {
		this.targetMobileAppId = targetMobileAppId;
	}
	
	
}
