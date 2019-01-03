package com.dayang.newmedia.newscommand.db.model;

import java.util.Date;

public class TaskMisson {
    private String mguid;

    private String mtitle;

    private String mplace;

    private String mcreater;

    private String mcreaterguid;

    private String mchargeman;

    private String mpasser;

    private String mpasseradvice;

    private Integer mstate;

    private String mowncolumn;

    private String mrepoter;

    private String mtype;

    private Date mfinishtime;

    private Date mcreatetime;

    private String taskguid;

    private String mremark;

    private String tasktitle;

    private Integer mlevel;

    private String mid;

    private String mname;

    private String inpeople;

    private String taskchangeman;

    public String getMguid() {
        return mguid;
    }

    public void setMguid(String mguid) {
        this.mguid = mguid == null ? null : mguid.trim();
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle == null ? null : mtitle.trim();
    }

    public String getMplace() {
        return mplace;
    }

    public void setMplace(String mplace) {
        this.mplace = mplace == null ? null : mplace.trim();
    }

    public String getMcreater() {
        return mcreater;
    }

    public void setMcreater(String mcreater) {
        this.mcreater = mcreater == null ? null : mcreater.trim();
    }

    public String getMcreaterguid() {
        return mcreaterguid;
    }

    public void setMcreaterguid(String mcreaterguid) {
        this.mcreaterguid = mcreaterguid == null ? null : mcreaterguid.trim();
    }

    public String getMchargeman() {
        return mchargeman;
    }

    public void setMchargeman(String mchargeman) {
        this.mchargeman = mchargeman == null ? null : mchargeman.trim();
    }

    public String getMpasser() {
        return mpasser;
    }

    public void setMpasser(String mpasser) {
        this.mpasser = mpasser == null ? null : mpasser.trim();
    }

    public String getMpasseradvice() {
        return mpasseradvice;
    }

    public void setMpasseradvice(String mpasseradvice) {
        this.mpasseradvice = mpasseradvice == null ? null : mpasseradvice.trim();
    }

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }

    public String getMowncolumn() {
        return mowncolumn;
    }

    public void setMowncolumn(String mowncolumn) {
        this.mowncolumn = mowncolumn == null ? null : mowncolumn.trim();
    }

    public String getMrepoter() {
        return mrepoter;
    }

    public void setMrepoter(String mrepoter) {
        this.mrepoter = mrepoter == null ? null : mrepoter.trim();
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype == null ? null : mtype.trim();
    }

    public Date getMfinishtime() {
        return mfinishtime;
    }

    public void setMfinishtime(Date mfinishtime) {
        this.mfinishtime = mfinishtime;
    }

    public Date getMcreatetime() {
        return mcreatetime;
    }

    public void setMcreatetime(Date mcreatetime) {
        this.mcreatetime = mcreatetime;
    }

    public String getTaskguid() {
        return taskguid;
    }

    public void setTaskguid(String taskguid) {
        this.taskguid = taskguid == null ? null : taskguid.trim();
    }

    public String getMremark() {
        return mremark;
    }

    public void setMremark(String mremark) {
        this.mremark = mremark == null ? null : mremark.trim();
    }

    public String getTasktitle() {
        return tasktitle;
    }

    public void setTasktitle(String tasktitle) {
        this.tasktitle = tasktitle == null ? null : tasktitle.trim();
    }

    public Integer getMlevel() {
        return mlevel;
    }

    public void setMlevel(Integer mlevel) {
        this.mlevel = mlevel;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getInpeople() {
        return inpeople;
    }

    public void setInpeople(String inpeople) {
        this.inpeople = inpeople == null ? null : inpeople.trim();
    }

    public String getTaskchangeman() {
        return taskchangeman;
    }

    public void setTaskchangeman(String taskchangeman) {
        this.taskchangeman = taskchangeman == null ? null : taskchangeman.trim();
    }
}