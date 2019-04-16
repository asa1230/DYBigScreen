package com.dayang.newmedia.newscommand.db.model;
import java.util.Date;

public class BigScreenForUser {
    private String guid;

    private String screenguid;

    private String tenantid;

    private String tenantorgname;

    private Date createtime;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getScreenguid() {
        return screenguid;
    }

    public void setScreenguid(String screenguid) {
        this.screenguid = screenguid == null ? null : screenguid.trim();
    }

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid == null ? null : tenantid.trim();
    }

    public String getTenantorgname() {
        return tenantorgname;
    }

    public void setTenantorgname(String tenantorgname) {
        this.tenantorgname = tenantorgname == null ? null : tenantorgname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}