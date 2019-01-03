package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class ItemInfo {
    private String itemguid;

    private String itemname;

    private String parentguid;

    private String itemurl;

    private String itemtarget;

    private Date addtime;

    public String getItemguid() {
        return itemguid;
    }

    public void setItemguid(String itemguid) {
        this.itemguid = itemguid == null ? null : itemguid.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getParentguid() {
        return parentguid;
    }

    public void setParentguid(String parentguid) {
        this.parentguid = parentguid == null ? null : parentguid.trim();
    }

    public String getItemurl() {
        return itemurl;
    }

    public void setItemurl(String itemurl) {
        this.itemurl = itemurl == null ? null : itemurl.trim();
    }

    public String getItemtarget() {
        return itemtarget;
    }

    public void setItemtarget(String itemtarget) {
        this.itemtarget = itemtarget == null ? null : itemtarget.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}