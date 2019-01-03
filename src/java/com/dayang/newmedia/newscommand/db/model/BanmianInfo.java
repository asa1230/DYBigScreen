package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class BanmianInfo {
    private String bguid;

    private String bname;

    private String bdescription;

    private String bcolumn;

    private String burl;

    private String bcolumnguid;

    private String bextmsg;

    private Date baddtime;

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

    public String getBdescription() {
        return bdescription;
    }

    public void setBdescription(String bdescription) {
        this.bdescription = bdescription == null ? null : bdescription.trim();
    }

    public String getBcolumn() {
        return bcolumn;
    }

    public void setBcolumn(String bcolumn) {
        this.bcolumn = bcolumn == null ? null : bcolumn.trim();
    }

    public String getBurl() {
        return burl;
    }

    public void setBurl(String burl) {
        this.burl = burl == null ? null : burl.trim();
    }

    public String getBcolumnguid() {
        return bcolumnguid;
    }

    public void setBcolumnguid(String bcolumnguid) {
        this.bcolumnguid = bcolumnguid == null ? null : bcolumnguid.trim();
    }

    public String getBextmsg() {
        return bextmsg;
    }

    public void setBextmsg(String bextmsg) {
        this.bextmsg = bextmsg == null ? null : bextmsg.trim();
    }

    public Date getBaddtime() {
        return baddtime;
    }

    public void setBaddtime(Date baddtime) {
        this.baddtime = baddtime;
    }
}