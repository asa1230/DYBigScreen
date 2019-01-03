package com.dayang.newmedia.newscommand.interfaces.db.model;

public class HZNewsBillItem {
	private String newsGuid;
	private String creater;
	private String newsTitle;
	private String videoLength;
	private String newsState;
	private String newsStateName;
	private String videoState;
	private String videoStateName;
	private String dubState;
	private String dubStateName;
	private String auditState;
	private String auditStateName;
	public HZNewsBillItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HZNewsBillItem(String newsGuid, String creater, String newsTitle, String videoLength, String newsState,
			String newsStateName, String videoState, String videoStateName, String dubState, String dubStateName,
			String auditState, String auditStateName) {
		super();
		this.newsGuid = newsGuid;
		this.creater = creater;
		this.newsTitle = newsTitle;
		this.videoLength = videoLength;
		this.newsState = newsState;
		this.newsStateName = newsStateName;
		this.videoState = videoState;
		this.videoStateName = videoStateName;
		this.dubState = dubState;
		this.dubStateName = dubStateName;
		this.auditState = auditState;
		this.auditStateName = auditStateName;
	}
	public String getNewsGuid() {
		return newsGuid;
	}
	public void setNewsGuid(String newsGuid) {
		this.newsGuid = newsGuid;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getVideoLength() {
		return videoLength;
	}
	public void setVideoLength(String videoLength) {
		this.videoLength = videoLength;
	}
	public String getNewsState() {
		return newsState;
	}
	public void setNewsState(String newsState) {
		this.newsState = newsState;
	}
	public String getNewsStateName() {
		return newsStateName;
	}
	public void setNewsStateName(String newsStateName) {
		this.newsStateName = newsStateName;
	}
	public String getVideoState() {
		return videoState;
	}
	public void setVideoState(String videoState) {
		this.videoState = videoState;
	}
	public String getVideoStateName() {
		return videoStateName;
	}
	public void setVideoStateName(String videoStateName) {
		this.videoStateName = videoStateName;
	}
	public String getDubState() {
		return dubState;
	}
	public void setDubState(String dubState) {
		this.dubState = dubState;
	}
	public String getDubStateName() {
		return dubStateName;
	}
	public void setDubStateName(String dubStateName) {
		this.dubStateName = dubStateName;
	}
	public String getAuditState() {
		return auditState;
	}
	public void setAuditState(String auditState) {
		this.auditState = auditState;
	}
	public String getAuditStateName() {
		return auditStateName;
	}
	public void setAuditStateName(String auditStateName) {
		this.auditStateName = auditStateName;
	}
	@Override
	public String toString() {
		return "HZNewsBillItem [newsGuid=" + newsGuid + ", creater=" + creater + ", newsTitle=" + newsTitle
				+ ", videoLength=" + videoLength + ", newsState=" + newsState + ", newsStateName=" + newsStateName
				+ ", videoState=" + videoState + ", videoStateName=" + videoStateName + ", dubState=" + dubState
				+ ", dubStateName=" + dubStateName + ", auditState=" + auditState + ", auditStateName=" + auditStateName
				+ "]";
	}

	

}
