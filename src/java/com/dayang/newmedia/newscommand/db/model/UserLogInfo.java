package com.dayang.newmedia.newscommand.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserLogInfo {
    private String logguid;

    private String logusername;

    private String loguserid;

    private BigDecimal logstate;

    private Date logintime;

    private Date logouttime;

    private Date livingtime;

    public String getLogguid() {
        return logguid;
    }

    public void setLogguid(String logguid) {
        this.logguid = logguid == null ? null : logguid.trim();
    }

    public String getLogusername() {
        return logusername;
    }

    public void setLogusername(String logusername) {
        this.logusername = logusername == null ? null : logusername.trim();
    }

    public String getLoguserid() {
        return loguserid;
    }

    public void setLoguserid(String loguserid) {
        this.loguserid = loguserid == null ? null : loguserid.trim();
    }

    public BigDecimal getLogstate() {
        return logstate;
    }

    public void setLogstate(BigDecimal logstate) {
        this.logstate = logstate;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getLogouttime() {
        return logouttime;
    }

    public void setLogouttime(Date logouttime) {
        this.logouttime = logouttime;
    }

    public Date getLivingtime() {
        return livingtime;
    }

    public void setLivingtime(Date livingtime) {
        this.livingtime = livingtime;
    }
}