package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class UserBanmianInfo {
    private String ubguid;

    private String userguid;

    private String uguid;

    private Date addtime;

    private String username;

    private String bguid;

    private String bname;

    private String btype;

    private String columnguid;

    public String getUbguid() {
        return ubguid;
    }

    public void setUbguid(String ubguid) {
        this.ubguid = ubguid == null ? null : ubguid.trim();
    }

    public String getUserguid() {
        return userguid;
    }

    public void setUserguid(String userguid) {
        this.userguid = userguid == null ? null : userguid.trim();
    }

    public String getUguid() {
        return uguid;
    }

    public void setUguid(String uguid) {
        this.uguid = uguid == null ? null : uguid.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getBguid() {
        return bguid;
    }

    public void setBguid(String bguid) {
        this.bguid = bguid == null ? null : bguid.trim();
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype == null ? null : btype.trim();
    }

    public String getColumnguid() {
        return columnguid;
    }

    public void setColumnguid(String columnguid) {
        this.columnguid = columnguid == null ? null : columnguid.trim();
    }
}