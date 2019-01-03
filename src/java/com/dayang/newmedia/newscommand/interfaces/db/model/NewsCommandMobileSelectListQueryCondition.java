package com.dayang.newmedia.newscommand.interfaces.db.model;

public class NewsCommandMobileSelectListQueryCondition {
	private String userId;
	private int queryModel;
	private int limit;
	private int start;
	private int isShow;
	private String chargeman;
	private String startTime;
	private String endTime;
	private int newsclass;
	private String owncolumn;
	private String pstartTime;
	private String pendTime;
	private int reportsource;
	private String searchContent;
	private int xuantistate;
	
	private String excludeStatus[];
	
	public NewsCommandMobileSelectListQueryCondition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NewsCommandMobileSelectListQueryCondition(String userId, int queryModel, int limit, int start) {
		super();
		this.userId = userId;
		this.queryModel = queryModel;
		this.limit = limit;
		this.start = start;
	}

	public NewsCommandMobileSelectListQueryCondition(String userId, int queryModel, int limit, int start,
			int isShow, String chargeman, String startTime, String endTime, int newsclass, String owncolumn,
			String pstartTime, String pendTime, int reportsource, String searchContent, int xuantistate) {
		super();
		this.userId = userId;
		this.queryModel = queryModel;
		this.limit = limit;
		this.start = start;
		this.isShow = isShow;
		this.chargeman = chargeman;
		this.startTime = startTime;
		this.endTime = endTime;
		this.newsclass = newsclass;
		this.owncolumn = owncolumn;
		this.pstartTime = pstartTime;
		this.pendTime = pendTime;
		this.reportsource = reportsource;
		this.searchContent = searchContent;
		this.xuantistate = xuantistate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getQueryModel() {
		return queryModel;
	}
	public void setQueryModel(int queryModel) {
		this.queryModel = queryModel;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getIsShow() {
		return isShow;
	}
	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}
	public String getChargeman() {
		return chargeman;
	}
	public void setChargeman(String chargeman) {
		this.chargeman = chargeman;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getNewsclass() {
		return newsclass;
	}
	public void setNewsclass(int newsclass) {
		this.newsclass = newsclass;
	}
	public String getOwncolumn() {
		return owncolumn;
	}
	public void setOwncolumn(String owncolumn) {
		this.owncolumn = owncolumn;
	}
	public String getPstartTime() {
		return pstartTime;
	}
	public void setPstartTime(String pstartTime) {
		this.pstartTime = pstartTime;
	}
	public String getPendTime() {
		return pendTime;
	}
	public void setPendTime(String pendTime) {
		this.pendTime = pendTime;
	}
	public int getReportsource() {
		return reportsource;
	}
	public void setReportsource(int reportsource) {
		this.reportsource = reportsource;
	}
	public String getSearchContent() {
		return searchContent;
	}
	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}
	public int getXuantistate() {
		return xuantistate;
	}
	public void setXuantistate(int xuantistate) {
		this.xuantistate = xuantistate;
	}
	@Override
	public String toString() {
		return "NewsCommandMobileSelectListQueryCondition [userId=" + userId + ", queryModel=" + queryModel + ", limit="
				+ limit + ", start=" + start + ", isShow=" + isShow + ", chargeman=" + chargeman + ", startTime="
				+ startTime + ", endTime=" + endTime + ", newsclass=" + newsclass + ", owncolumn=" + owncolumn
				+ ", pstartTime=" + pstartTime + ", pendTime=" + pendTime + ", reportsource=" + reportsource
				+ ", searchContent=" + searchContent + ", xuantistate=" + xuantistate + "]";
	}

	public String[] getExcludeStatus() {
		return excludeStatus;
	}

	public void setExcludeStatus(String excludeStatus[]) {
		this.excludeStatus = excludeStatus;
	}
	
	
}
