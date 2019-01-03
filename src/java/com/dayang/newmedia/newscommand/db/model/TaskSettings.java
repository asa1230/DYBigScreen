package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class TaskSettings {
    private String guid;

    private String taskguid;

    private String mguid;

    private Date createtime;

    private Integer tasktype;

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

    public String getMguid() {
        return mguid;
    }

    public void setMguid(String mguid) {
        this.mguid = mguid == null ? null : mguid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getTasktype() {
        return tasktype;
    }

    public void setTasktype(Integer tasktype) {
        this.tasktype = tasktype;
    }
}