package com.dayang.newmedia.newscommand.interfaces.db.model;

public class HZNewsStory {
	private String newsGuid;
	private String creater;
	private String createTime;
	private String modifier;
	private String modifyTime;
	private String newsTitle;
	private String subTitle;
	private String newsSource;
	private String newsKeyword;
	private String newsRemark;
	private String newsContent;
	private String broadLength;
	private String videoLength;
	private String wordsLength;
	private String reporter;
	private String guestMan;
	private String camerist;
	private String batMan;
	private String editor;
	private String dubMan;
	private String driver;
	private String assistant;
	private int newsStateValue;
	private String newsState;
	private int videoStateValue;
	private String videoState;
	private int dubStateValue;
	private String dubState;
	private int auditStateValue;
	private String auditState;
	private String ownColumn;
	public HZNewsStory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HZNewsStory(String newsGuid, String creater, String createTime, String modifier, String modifyTime,
			String newsTitle, String subTitle, String newsSource, String newsKeyword, String newsRemark,
			String newsContent, String broadLength, String videoLength, String wordsLength, String reporter,
			String guestMan, String camerist, String batMan, String editor, String dubMan, String driver,
			String assistant, int newsStateValue, String newsState, int videoStateValue, String videoState,
			int dubStateValue, String dubState, int auditStateValue, String auditState, String ownColumn) {
		super();
		this.newsGuid = newsGuid;
		this.creater = creater;
		this.createTime = createTime;
		this.modifier = modifier;
		this.modifyTime = modifyTime;
		this.newsTitle = newsTitle;
		this.subTitle = subTitle;
		this.newsSource = newsSource;
		this.newsKeyword = newsKeyword;
		this.newsRemark = newsRemark;
		this.newsContent = newsContent;
		this.broadLength = broadLength;
		this.videoLength = videoLength;
		this.wordsLength = wordsLength;
		this.reporter = reporter;
		this.guestMan = guestMan;
		this.camerist = camerist;
		this.batMan = batMan;
		this.editor = editor;
		this.dubMan = dubMan;
		this.driver = driver;
		this.assistant = assistant;
		this.newsStateValue = newsStateValue;
		this.newsState = newsState;
		this.videoStateValue = videoStateValue;
		this.videoState = videoState;
		this.dubStateValue = dubStateValue;
		this.dubState = dubState;
		this.auditStateValue = auditStateValue;
		this.auditState = auditState;
		this.ownColumn = ownColumn;
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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getNewsSource() {
		return newsSource;
	}
	public void setNewsSource(String newsSource) {
		this.newsSource = newsSource;
	}
	public String getNewsKeyword() {
		return newsKeyword;
	}
	public void setNewsKeyword(String newsKeyword) {
		this.newsKeyword = newsKeyword;
	}
	public String getNewsRemark() {
		return newsRemark;
	}
	public void setNewsRemark(String newsRemark) {
		this.newsRemark = newsRemark;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getBroadLength() {
		return broadLength;
	}
	public void setBroadLength(String broadLength) {
		this.broadLength = broadLength;
	}
	public String getVideoLength() {
		return videoLength;
	}
	public void setVideoLength(String videoLength) {
		this.videoLength = videoLength;
	}
	public String getWordsLength() {
		return wordsLength;
	}
	public void setWordsLength(String wordsLength) {
		this.wordsLength = wordsLength;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getGuestMan() {
		return guestMan;
	}
	public void setGuestMan(String guestMan) {
		this.guestMan = guestMan;
	}
	public String getCamerist() {
		return camerist;
	}
	public void setCamerist(String camerist) {
		this.camerist = camerist;
	}
	public String getBatMan() {
		return batMan;
	}
	public void setBatMan(String batMan) {
		this.batMan = batMan;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getDubMan() {
		return dubMan;
	}
	public void setDubMan(String dubMan) {
		this.dubMan = dubMan;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getAssistant() {
		return assistant;
	}
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}
	public int getNewsStateValue() {
		return newsStateValue;
	}
	public void setNewsStateValue(int newsStateValue) {
		this.newsStateValue = newsStateValue;
	}
	public String getNewsState() {
		return newsState;
	}
	public void setNewsState(String newsState) {
		this.newsState = newsState;
	}
	public int getVideoStateValue() {
		return videoStateValue;
	}
	public void setVideoStateValue(int videoStateValue) {
		this.videoStateValue = videoStateValue;
	}
	public String getVideoState() {
		return videoState;
	}
	public void setVideoState(String videoState) {
		this.videoState = videoState;
	}
	public int getDubStateValue() {
		return dubStateValue;
	}
	public void setDubStateValue(int dubStateValue) {
		this.dubStateValue = dubStateValue;
	}
	public String getDubState() {
		return dubState;
	}
	public void setDubState(String dubState) {
		this.dubState = dubState;
	}
	public int getAuditStateValue() {
		return auditStateValue;
	}
	public void setAuditStateValue(int auditStateValue) {
		this.auditStateValue = auditStateValue;
	}
	public String getAuditState() {
		return auditState;
	}
	public void setAuditState(String auditState) {
		this.auditState = auditState;
	}
	public String getOwnColumn() {
		return ownColumn;
	}
	public void setOwnColumn(String ownColumn) {
		this.ownColumn = ownColumn;
	}
	@Override
	public String toString() {
		return "HZNewsStory [newsGuid=" + newsGuid + ", creater=" + creater + ", createTime=" + createTime
				+ ", modifier=" + modifier + ", modifyTime=" + modifyTime + ", newsTitle=" + newsTitle + ", subTitle="
				+ subTitle + ", newsSource=" + newsSource + ", newsKeyword=" + newsKeyword + ", newsRemark="
				+ newsRemark + ", newsContent=" + newsContent + ", broadLength=" + broadLength + ", videoLength="
				+ videoLength + ", wordsLength=" + wordsLength + ", reporter=" + reporter + ", guestMan=" + guestMan
				+ ", camerist=" + camerist + ", batMan=" + batMan + ", editor=" + editor + ", dubMan=" + dubMan
				+ ", driver=" + driver + ", assistant=" + assistant + ", newsStateValue=" + newsStateValue
				+ ", newsState=" + newsState + ", videoStateValue=" + videoStateValue + ", videoState=" + videoState
				+ ", dubStateValue=" + dubStateValue + ", dubState=" + dubState + ", auditStateValue=" + auditStateValue
				+ ", auditState=" + auditState + ", ownColumn=" + ownColumn + "]";
	}

	
	

}
