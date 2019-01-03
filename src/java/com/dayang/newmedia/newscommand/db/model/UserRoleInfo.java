package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class UserRoleInfo {
    private String userroleguid;

    private String username;

    private String userguid;

    private String roleguid;

    private Integer canuse;

    private Date addtime;

    public String getUserroleguid() {
        return userroleguid;
    }

    public void setUserroleguid(String userroleguid) {
        this.userroleguid = userroleguid == null ? null : userroleguid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserguid() {
        return userguid;
    }

    public void setUserguid(String userguid) {
        this.userguid = userguid == null ? null : userguid.trim();
    }

    public String getRoleguid() {
        return roleguid;
    }

    public void setRoleguid(String roleguid) {
        this.roleguid = roleguid == null ? null : roleguid.trim();
    }

    public Integer getCanuse() {
        return canuse;
    }

    public void setCanuse(Integer canuse) {
        this.canuse = canuse;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}