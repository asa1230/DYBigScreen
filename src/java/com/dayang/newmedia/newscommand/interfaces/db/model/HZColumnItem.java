package com.dayang.newmedia.newscommand.interfaces.db.model;

public class HZColumnItem {
	private String ColumnName;
	private String OwnChannel;
	private int ColumnLength;
	private int IsValid;
	
	
	public HZColumnItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HZColumnItem(String columnName, String ownChannel, int columnLength, int isValid) {
		super();
		ColumnName = columnName;
		OwnChannel = ownChannel;
		ColumnLength = columnLength;
		IsValid = isValid;
	}
	public String getColumnName() {
		return ColumnName;
	}
	public void setColumnName(String columnName) {
		ColumnName = columnName;
	}
	public String getOwnChannel() {
		return OwnChannel;
	}
	public void setOwnChannel(String ownChannel) {
		OwnChannel = ownChannel;
	}
	public int getColumnLength() {
		return ColumnLength;
	}
	public void setColumnLength(int columnLength) {
		ColumnLength = columnLength;
	}
	public int getIsValid() {
		return IsValid;
	}
	public void setIsValid(int isValid) {
		IsValid = isValid;
	}
	@Override
	public String toString() {
		return "HZColumnItem [ColumnName=" + ColumnName + ", OwnChannel=" + OwnChannel + ", ColumnLength="
				+ ColumnLength + ", IsValid=" + IsValid + "]";
	}
	
	
	

}
