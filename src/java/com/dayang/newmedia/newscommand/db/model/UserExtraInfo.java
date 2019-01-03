package com.dayang.newmedia.newscommand.db.model;

public class UserExtraInfo {
    private String extraid;

    private String username;

    private String userid;

    private String gpsdeviceid;

    private Integer gpsdevicetype;

    private Integer relatetype;

    private String userweixinid;

    private String userimagefile;

    private String userbusyicon;

    private String userfreeicon;

    public String getExtraid() {
        return extraid;
    }

    public void setExtraid(String extraid) {
        this.extraid = extraid == null ? null : extraid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getGpsdeviceid() {
        return gpsdeviceid;
    }

    public void setGpsdeviceid(String gpsdeviceid) {
        this.gpsdeviceid = gpsdeviceid == null ? null : gpsdeviceid.trim();
    }

    public Integer getGpsdevicetype() {
        return gpsdevicetype;
    }

    public void setGpsdevicetype(Integer gpsdevicetype) {
        this.gpsdevicetype = gpsdevicetype;
    }

    public Integer getRelatetype() {
        return relatetype;
    }

    public void setRelatetype(Integer relatetype) {
        this.relatetype = relatetype;
    }

    public String getUserweixinid() {
        return userweixinid;
    }

    public void setUserweixinid(String userweixinid) {
        this.userweixinid = userweixinid == null ? null : userweixinid.trim();
    }

    public String getUserimagefile() {
        return userimagefile;
    }

    public void setUserimagefile(String userimagefile) {
        this.userimagefile = userimagefile == null ? null : userimagefile.trim();
    }

    public String getUserbusyicon() {
        return userbusyicon;
    }

    public void setUserbusyicon(String userbusyicon) {
        this.userbusyicon = userbusyicon == null ? null : userbusyicon.trim();
    }

    public String getUserfreeicon() {
        return userfreeicon;
    }

    public void setUserfreeicon(String userfreeicon) {
        this.userfreeicon = userfreeicon == null ? null : userfreeicon.trim();
    }
}