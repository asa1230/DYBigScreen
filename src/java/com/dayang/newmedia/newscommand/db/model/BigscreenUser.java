package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class BigscreenUser {
    private String guid;

    private String tenantid;

    private String tenantorgname;

    private String tenantnote;

    private String editor;

    private Date edittime;

    private Date modifytime;

    private Integer isuse;

    private Integer screennum;

    private Integer screentheme;

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

    public String getTenantorgname() {
        return tenantorgname;
    }

    public void setTenantorgname(String tenantorgname) {
        this.tenantorgname = tenantorgname == null ? null : tenantorgname.trim();
    }

    public String getTenantnote() {
        return tenantnote;
    }

    public void setTenantnote(String tenantnote) {
        this.tenantnote = tenantnote == null ? null : tenantnote.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Integer getIsuse() {
        return isuse;
    }

    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }

    public Integer getScreennum() {
        return screennum;
    }

    public void setScreennum(Integer screennum) {
        this.screennum = screennum;
    }

    public Integer getScreentheme() {
        return screentheme;
    }

    public void setScreentheme(Integer screentheme) {
        this.screentheme = screentheme;
    }
}