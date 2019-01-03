package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

public class ResourceFolder {
	private String id;

	private String name;

	private String parentId;

	private int lifeCycleDays;

	private int keepSecretDays;

	private String aclContent;

	private String metadataInfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public int getLifeCycleDays() {
		return lifeCycleDays;
	}

	public void setLifeCycleDays(int lifeCycleDays) {
		this.lifeCycleDays = lifeCycleDays;
	}

	public int getKeepSecretDays() {
		return keepSecretDays;
	}

	public void setKeepSecretDays(int keepSecretDays) {
		this.keepSecretDays = keepSecretDays;
	}

	public String getAclContent() {
		return aclContent;
	}

	public void setAclContent(String aclContent) {
		this.aclContent = aclContent;
	}

	public String getMetadataInfo() {
		return metadataInfo;
	}

	public void setMetadataInfo(String metadataInfo) {
		this.metadataInfo = metadataInfo;
	}

	@Override
	public String toString() {
		return "ResourceFolder [id=" + id + ", name=" + name + ", parentId=" + parentId + ", lifeCycleDays="
				+ lifeCycleDays + ", keepSecretDays=" + keepSecretDays + ", aclContent=" + aclContent
				+ ", metadataInfo=" + metadataInfo + "]";
	}
	
	
}
