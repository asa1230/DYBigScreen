package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class Resources {
    private String id;

    private String resourceGuid;

    private String correlationGuid;

    private String title;

    private String resourceType;

    private String uploader;

    private String fileSize;

    private String resourceUrl;

    private Date createTime;
    
    private String filePath;
    
    private String resourceClass;
    
    private String resourceOriginAddress;
    
    public String getResourceOriginAddress() {
		return resourceOriginAddress;
	}

	public void setResourceOriginAddress(String resourceOriginAddress) {
		this.resourceOriginAddress = resourceOriginAddress;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getResourceGuid() {
        return resourceGuid;
    }

    public void setResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid == null ? null : resourceGuid.trim();
    }

    public String getCorrelationGuid() {
        return correlationGuid;
    }

    public void setCorrelationGuid(String correlationGuid) {
        this.correlationGuid = correlationGuid == null ? null : correlationGuid.trim();
    }
    @ApiModelProperty(value = "资源标题")
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader == null ? null : uploader.trim();
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getResourceClass() {
		return resourceClass;
	}

	public void setResourceClass(String resourceClass) {
		this.resourceClass = resourceClass;
	}
}