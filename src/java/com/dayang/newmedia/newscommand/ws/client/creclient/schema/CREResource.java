package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.List;

public class CREResource {
	private String id;

	private String name;

	private int proType;

	private int resourceType;

	private String source;

	//private String scpInId;

	private String ccid;

	private int duration;

	private String folderId;
	
	//private List<CREFile> files ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFolderId() {
		return folderId;
	}

	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProType() {
		return proType;
	}

	public void setProType(int proType) {
		this.proType = proType;
	}

	public int getResourceType() {
		return resourceType;
	}

	public void setResourceType(int resourceType) {
		this.resourceType = resourceType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	/*public String getScpInId() {
		return scpInId;
	}

	public void setScpInId(String scpInId) {
		this.scpInId = scpInId;
	}*/

	public String getCcid() {
		return ccid;
	}

	public void setCcid(String ccid) {
		this.ccid = ccid;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	/*public List<CREFile> getFiles() {
		return files;
	}

	public void setFiles(List<CREFile> files) {
		this.files = files;
	}*/
	
	
	
}
