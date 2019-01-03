package com.dayang.newmedia.newscommand.interfaces.db.model;

import java.util.List;

public class HZColumnRatingList {
private List<ColumnRating> ratingList;

public HZColumnRatingList(List<ColumnRating> ratingList) {
	super();
	this.ratingList = ratingList;
}

public HZColumnRatingList() {
	super();
	// TODO Auto-generated constructor stub
}

public List<ColumnRating> getRatingList() {
	return ratingList;
}

public void setRatingList(List<ColumnRating> ratingList) {
	this.ratingList = ratingList;
}

@Override
public String toString() {
	return "HZColumnRatingList [ratingList=" + ratingList + "]";
}	
	
}
