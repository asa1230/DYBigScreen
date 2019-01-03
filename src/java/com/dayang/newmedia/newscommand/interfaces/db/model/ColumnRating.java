package com.dayang.newmedia.newscommand.interfaces.db.model;



public class ColumnRating {
	private String columnRatingName;
	private String columnRatingValue;
	public ColumnRating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ColumnRating(String columnRatingName, String columnRatingValue) {
		super();
		this.columnRatingName = columnRatingName;
		this.columnRatingValue = columnRatingValue;
	}
	public String getColumnRatingName() {
		return columnRatingName;
	}
	public void setColumnRatingName(String columnRatingName) {
		this.columnRatingName = columnRatingName;
	}
	public String getColumnRatingValue() {
		return columnRatingValue;
	}
	public void setColumnRatingValue(String columnRatingValue) {
		this.columnRatingValue = columnRatingValue;
	}
	@Override
	public String toString() {
		return "ColumnRating [columnRatingName=" + columnRatingName + ", columnRatingValue=" + columnRatingValue + "]";
	}
   	
}
