package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

public class Message {
	private String id;

	private int priority;

	private String createdTime;

	private String sourceAppId;

	private String sourceUserId;

	private String targetAppId;

	private String targetUserId;

	private String content;

	private int readFlag;

	private String readTime;

	private int starFlag;

	private String targetMobileAppId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getSourceAppId() {
		return sourceAppId;
	}

	public void setSourceAppId(String sourceAppId) {
		this.sourceAppId = sourceAppId;
	}

	public String getSourceUserId() {
		return sourceUserId;
	}

	public void setSourceUserId(String sourceUserId) {
		this.sourceUserId = sourceUserId;
	}

	public String getTargetAppId() {
		return targetAppId;
	}

	public void setTargetAppId(String targetAppId) {
		this.targetAppId = targetAppId;
	}

	public String getTargetUserId() {
		return targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReadFlag() {
		return readFlag;
	}

	public void setReadFlag(int readFlag) {
		this.readFlag = readFlag;
	}

	public String getReadTime() {
		return readTime;
	}

	public void setReadTime(String readTime) {
		this.readTime = readTime;
	}

	public int getStarFlag() {
		return starFlag;
	}

	public void setStarFlag(int starFlag) {
		this.starFlag = starFlag;
	}

	public String getTargetMobileAppId() {
		return targetMobileAppId;
	}

	public void setTargetMobileAppId(String targetMobileAppId) {
		this.targetMobileAppId = targetMobileAppId;
	}
	
	
}
