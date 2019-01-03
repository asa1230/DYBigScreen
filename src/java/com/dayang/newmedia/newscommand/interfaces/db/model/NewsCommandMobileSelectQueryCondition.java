package com.dayang.newmedia.newscommand.interfaces.db.model;

public class NewsCommandMobileSelectQueryCondition {
	private String id;
	private int type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "NewsCommandMobileSelectQueryCondition [id=" + id + ", type=" + type + "]";
	}
	public NewsCommandMobileSelectQueryCondition(String id, int type) {
		super();
		this.id = id;
		this.type = type;
	}
	public NewsCommandMobileSelectQueryCondition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
