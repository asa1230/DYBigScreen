package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class ServerSettings {
    private String urlguid;

    private String uarea;

    private String uname;

    private String upath;

    private Integer utype;

    private Date changetime;

    public String getUrlguid() {
        return urlguid;
    }

    public void setUrlguid(String urlguid) {
        this.urlguid = urlguid == null ? null : urlguid.trim();
    }

    public String getUarea() {
        return uarea;
    }

    public void setUarea(String uarea) {
        this.uarea = uarea == null ? null : uarea.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpath() {
        return upath;
    }

    public void setUpath(String upath) {
        this.upath = upath == null ? null : upath.trim();
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }
}