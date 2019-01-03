package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class CustomSettings {
    private String cuguid;

    private String cutype;

    private String cuvalue;

    private String cuname;

    private Date cutime;

    public String getCuguid() {
        return cuguid;
    }

    public void setCuguid(String cuguid) {
        this.cuguid = cuguid == null ? null : cuguid.trim();
    }

    public String getCutype() {
        return cutype;
    }

    public void setCutype(String cutype) {
        this.cutype = cutype == null ? null : cutype.trim();
    }

    public String getCuvalue() {
        return cuvalue;
    }

    public void setCuvalue(String cuvalue) {
        this.cuvalue = cuvalue == null ? null : cuvalue.trim();
    }

    public String getCuname() {
        return cuname;
    }

    public void setCuname(String cuname) {
        this.cuname = cuname == null ? null : cuname.trim();
    }

    public Date getCutime() {
        return cutime;
    }

    public void setCutime(Date cutime) {
        this.cutime = cutime;
    }
}