package com.dayang.newmedia.newscommand.db.model;

public class SwichSettings {
    private String swichguid;

    private String swichname;

    private Integer swichvalue;

    private Integer swichtype;

    private String swichparam;

    public String getSwichguid() {
        return swichguid;
    }

    public void setSwichguid(String swichguid) {
        this.swichguid = swichguid == null ? null : swichguid.trim();
    }

    public String getSwichname() {
        return swichname;
    }

    public void setSwichname(String swichname) {
        this.swichname = swichname == null ? null : swichname.trim();
    }

    public Integer getSwichvalue() {
        return swichvalue;
    }

    public void setSwichvalue(Integer swichvalue) {
        this.swichvalue = swichvalue;
    }

    public Integer getSwichtype() {
        return swichtype;
    }

    public void setSwichtype(Integer swichtype) {
        this.swichtype = swichtype;
    }

    public String getSwichparam() {
        return swichparam;
    }

    public void setSwichparam(String swichparam) {
        this.swichparam = swichparam == null ? null : swichparam.trim();
    }
}