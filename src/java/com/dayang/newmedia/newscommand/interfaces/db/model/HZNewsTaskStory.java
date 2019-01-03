package com.dayang.newmedia.newscommand.interfaces.db.model;

public class HZNewsTaskStory {
		private String newsTaskGuid ;
		private String creater ;
		private String createTime;
		private String arriveTime ;
		private String modifyTime ;
		private String newsTaskTitle ;
		private String taskPlace ;
		private String taskKeyword ;
		private String taskRemark ;
		private String taskContent ;
		private String reporter ;
		private String guestMan ;
		private String camerist ;
		private String batMan ;
		private String driver ;
		private String otherMan ;
		private String assistant ;
		private String taskStateValue ;
		private String taskState ;
		private String ownColumn ;
		private String estimateDate ;
		private String owEstimateColumnnColumn ;
		public HZNewsTaskStory() {
			super();
			// TODO Auto-generated constructor stub
		}
		public HZNewsTaskStory(String newsTaskGuid, String creater, String createTime, String arriveTime,
				String modifyTime, String newsTaskTitle, String taskPlace, String taskKeyword, String taskRemark,
				String taskContent, String reporter, String guestMan, String camerist, String batMan, String driver,
				String otherMan, String assistant, String taskStateValue, String taskState, String ownColumn,
				String estimateDate, String owEstimateColumnnColumn) {
			super();
			this.newsTaskGuid = newsTaskGuid;
			this.creater = creater;
			this.createTime = createTime;
			this.arriveTime = arriveTime;
			this.modifyTime = modifyTime;
			this.newsTaskTitle = newsTaskTitle;
			this.taskPlace = taskPlace;
			this.taskKeyword = taskKeyword;
			this.taskRemark = taskRemark;
			this.taskContent = taskContent;
			this.reporter = reporter;
			this.guestMan = guestMan;
			this.camerist = camerist;
			this.batMan = batMan;
			this.driver = driver;
			this.otherMan = otherMan;
			this.assistant = assistant;
			this.taskStateValue = taskStateValue;
			this.taskState = taskState;
			this.ownColumn = ownColumn;
			this.estimateDate = estimateDate;
			this.owEstimateColumnnColumn = owEstimateColumnnColumn;
		}
		public String getNewsTaskGuid() {
			return newsTaskGuid;
		}
		public void setNewsTaskGuid(String newsTaskGuid) {
			this.newsTaskGuid = newsTaskGuid;
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
		public String getArriveTime() {
			return arriveTime;
		}
		public void setArriveTime(String arriveTime) {
			this.arriveTime = arriveTime;
		}
		public String getModifyTime() {
			return modifyTime;
		}
		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
		public String getNewsTaskTitle() {
			return newsTaskTitle;
		}
		public void setNewsTaskTitle(String newsTaskTitle) {
			this.newsTaskTitle = newsTaskTitle;
		}
		public String getTaskPlace() {
			return taskPlace;
		}
		public void setTaskPlace(String taskPlace) {
			this.taskPlace = taskPlace;
		}
		public String getTaskKeyword() {
			return taskKeyword;
		}
		public void setTaskKeyword(String taskKeyword) {
			this.taskKeyword = taskKeyword;
		}
		public String getTaskRemark() {
			return taskRemark;
		}
		public void setTaskRemark(String taskRemark) {
			this.taskRemark = taskRemark;
		}
		public String getTaskContent() {
			return taskContent;
		}
		public void setTaskContent(String taskContent) {
			this.taskContent = taskContent;
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
		public String getDriver() {
			return driver;
		}
		public void setDriver(String driver) {
			this.driver = driver;
		}
		public String getOtherMan() {
			return otherMan;
		}
		public void setOtherMan(String otherMan) {
			this.otherMan = otherMan;
		}
		public String getAssistant() {
			return assistant;
		}
		public void setAssistant(String assistant) {
			this.assistant = assistant;
		}
		public String getTaskStateValue() {
			return taskStateValue;
		}
		public void setTaskStateValue(String taskStateValue) {
			this.taskStateValue = taskStateValue;
		}
		public String getTaskState() {
			return taskState;
		}
		public void setTaskState(String taskState) {
			this.taskState = taskState;
		}
		public String getOwnColumn() {
			return ownColumn;
		}
		public void setOwnColumn(String ownColumn) {
			this.ownColumn = ownColumn;
		}
		public String getEstimateDate() {
			return estimateDate;
		}
		public void setEstimateDate(String estimateDate) {
			this.estimateDate = estimateDate;
		}
		public String getOwEstimateColumnnColumn() {
			return owEstimateColumnnColumn;
		}
		public void setOwEstimateColumnnColumn(String owEstimateColumnnColumn) {
			this.owEstimateColumnnColumn = owEstimateColumnnColumn;
		}
		@Override
		public String toString() {
			return "HZNewsTaskStory [newsTaskGuid=" + newsTaskGuid + ", creater=" + creater + ", createTime="
					+ createTime + ", arriveTime=" + arriveTime + ", modifyTime=" + modifyTime + ", newsTaskTitle="
					+ newsTaskTitle + ", taskPlace=" + taskPlace + ", taskKeyword=" + taskKeyword + ", taskRemark="
					+ taskRemark + ", taskContent=" + taskContent + ", reporter=" + reporter + ", guestMan=" + guestMan
					+ ", camerist=" + camerist + ", batMan=" + batMan + ", driver=" + driver + ", otherMan=" + otherMan
					+ ", assistant=" + assistant + ", taskStateValue=" + taskStateValue + ", taskState=" + taskState
					+ ", ownColumn=" + ownColumn + ", estimateDate=" + estimateDate + ", owEstimateColumnnColumn="
					+ owEstimateColumnnColumn + "]";
		}
		
}
