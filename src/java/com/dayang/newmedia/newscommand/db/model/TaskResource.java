package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class TaskResource {
    private String guid;

    private String taskguid;

    private String resourceguid;

    private Date createtime;

    private String title;

    private String resourcetype;

    private String author;

    private String filePath;
    
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getTaskguid() {
        return taskguid;
    }

    public void setTaskguid(String taskguid) {
        this.taskguid = taskguid == null ? null : taskguid.trim();
    }

    public String getResourceguid() {
        return resourceguid;
    }

    public void setResourceguid(String resourceguid) {
        this.resourceguid = resourceguid == null ? null : resourceguid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getResourcetype() {
        return resourcetype;
    }

    public void setResourcetype(String resourcetype) {
        this.resourcetype = resourcetype == null ? null : resourcetype.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
    
    
}