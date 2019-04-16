package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class InterFaceset {
    private String guid;

    private String tenantid;

    private String interfacename;

    private String interfacetoken;

    private String interfaceuserid;

    private String interfacesource;

    private String creater;

    private Date createtime;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid == null ? null : tenantid.trim();
    }

    public String getInterfacename() {
        return interfacename;
    }

    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename == null ? null : interfacename.trim();
    }

    public String getInterfacetoken() {
        return interfacetoken;
    }

    public void setInterfacetoken(String interfacetoken) {
        this.interfacetoken = interfacetoken == null ? null : interfacetoken.trim();
    }

    public String getInterfaceuserid() {
        return interfaceuserid;
    }

    public void setInterfaceuserid(String interfaceuserid) {
        this.interfaceuserid = interfaceuserid == null ? null : interfaceuserid.trim();
    }

    public String getInterfacesource() {
        return interfacesource;
    }

    public void setInterfacesource(String interfacesource) {
        this.interfacesource = interfacesource == null ? null : interfacesource.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}