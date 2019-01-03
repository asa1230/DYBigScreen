package com.dayang.newmedia.newscommand.db.model.enums;

public enum CRECONDITION {
	CONTENT("CONTENT"),
	FOLDERID("FOLDERID"), 
	NAME("NAME"),
	RESOURCETYPE("RESOURCETYPE");
	
	public String id;
	
	private CRECONDITION (String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
