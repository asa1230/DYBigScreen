package com.dayang.newmedia.newscommand.ws.client.creclient.schema;
import java.io.Serializable;

public class SubscriberInfo implements Serializable{
	
	private static final long serialVersionUID = -7898248084832330426L;
	private int classId;
	private int parentClassId;
	private String name;
	private int status;
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getParentClassId() {
		return parentClassId;
	}
	public void setParentClassId(int parentClassId) {
		this.parentClassId = parentClassId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
