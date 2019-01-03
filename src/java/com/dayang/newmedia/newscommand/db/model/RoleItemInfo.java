package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class RoleItemInfo {
    private String roleitemguid;

    private String roleguid;

    private String itemguid;

    private Date addtime;

    public String getRoleitemguid() {
        return roleitemguid;
    }

    public void setRoleitemguid(String roleitemguid) {
        this.roleitemguid = roleitemguid == null ? null : roleitemguid.trim();
    }

    public String getRoleguid() {
        return roleguid;
    }

    public void setRoleguid(String roleguid) {
        this.roleguid = roleguid == null ? null : roleguid.trim();
    }

    public String getItemguid() {
        return itemguid;
    }

    public void setItemguid(String itemguid) {
        this.itemguid = itemguid == null ? null : itemguid.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}