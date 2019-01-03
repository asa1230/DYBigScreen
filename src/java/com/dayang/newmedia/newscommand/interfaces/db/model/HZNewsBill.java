package com.dayang.newmedia.newscommand.interfaces.db.model;

public class HZNewsBill {
	private String newsBillGuid;
	private String billTitle;
	private String columnDate;
	private String columnName;
	private String broadTime;
	public HZNewsBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HZNewsBill(String newsBillGuid, String billTitle, String columnDate, String columnName, String broadTime) {
		super();
		this.newsBillGuid = newsBillGuid;
		this.billTitle = billTitle;
		this.columnDate = columnDate;
		this.columnName = columnName;
		this.broadTime = broadTime;
	}
	public String getNewsBillGuid() {
		return newsBillGuid;
	}
	public void setNewsBillGuid(String newsBillGuid) {
		this.newsBillGuid = newsBillGuid;
	}
	public String getBillTitle() {
		return billTitle;
	}
	public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}
	public String getColumnDate() {
		return columnDate;
	}
	public void setColumnDate(String columnDate) {
		this.columnDate = columnDate;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getBroadTime() {
		return broadTime;
	}
	public void setBroadTime(String broadTime) {
		this.broadTime = broadTime;
	}
	@Override
	public String toString() {
		return "NewsBill [newsBillGuid=" + newsBillGuid + ", billTitle=" + billTitle + ", columnDate=" + columnDate
				+ ", columnName=" + columnName + ", broadTime=" + broadTime + "]";
	}

}
