package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class Bigscreen {
    private String screenguid;

    private String screenname;

    private String screenurl;
    
    private String controlscreenurl;

    private String creater;

    private String creatertenantid;

    private Date createtime;

    private Integer screenstate;

    private String screenimg;

    private String screentype;

    private String screenset;

    private String screennote;

    private Integer screengroup;

    public String getScreenguid() {
        return screenguid;
    }

    public void setScreenguid(String screenguid) {
        this.screenguid = screenguid == null ? null : screenguid.trim();
    }

    public String getScreenname() {
        return screenname;
    }

    public void setScreenname(String screenname) {
        this.screenname = screenname == null ? null : screenname.trim();
    }

    public String getScreenurl() {
        return screenurl;
    }

    public void setScreenurl(String screenurl) {
        this.screenurl = screenurl == null ? null : screenurl.trim();
    }
    
    public String getControlscreenurl() {
        return controlscreenurl;
    }

    public void setControlscreenurl(String controlscreenurl) {
        this.controlscreenurl = controlscreenurl == null ? null : controlscreenurl.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getCreatertenantid() {
        return creatertenantid;
    }

    public void setCreatertenantid(String creatertenantid) {
        this.creatertenantid = creatertenantid == null ? null : creatertenantid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getScreenstate() {
        return screenstate;
    }

    public void setScreenstate(Integer screenstate) {
        this.screenstate = screenstate;
    }

    public String getScreenimg() {
        return screenimg;
    }

    public void setScreenimg(String screenimg) {
        this.screenimg = screenimg == null ? null : screenimg.trim();
    }

    public String getScreentype() {
        return screentype;
    }

    public void setScreentype(String screentype) {
        this.screentype = screentype == null ? null : screentype.trim();
    }

    public String getScreenset() {
        return screenset;
    }

    public void setScreenset(String screenset) {
        this.screenset = screenset == null ? null : screenset.trim();
    }

    public String getScreennote() {
        return screennote;
    }

    public void setScreennote(String screennote) {
        this.screennote = screennote == null ? null : screennote.trim();
    }

    public Integer getScreengroup() {
        return screengroup;
    }

    public void setScreengroup(Integer screengroup) {
        this.screengroup = screengroup;
    }
}