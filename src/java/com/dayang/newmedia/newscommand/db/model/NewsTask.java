package com.dayang.newmedia.newscommand.db.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class NewsTask {
    private String taskguid;

    private String creater;

    private String resourceguid;

    private String createrguid;

    private String owncolumn;

    private Date createtime;

    private Date modifytime;

    private String tasktitle;

    private String taskplace;

    private String taskremark;

    private String taskkeywork;

    private Integer taskstate;

    private String tasktype;

    private String tasklevel;

    private String programcode;

    private String programname;

    private Integer isspecial;

    private String sourcetype;

    private String passer;

    private String passadvice;

    private Date endtime;

    private String chargeman;

    private Integer iscaifang;

    private String reporter;

    private String linkguid;

    private String linktitle;

    private String caifangremark;

    private Integer isopen;

    private String deviceids;

    private String banmiantype;

    private String banmianguid;

    private String inpeople;

    private String allinpeople;

    private String usecolumn;

    private BigDecimal xuantistate;

    private BigDecimal islocked;

    private String locker;

    private Date locktime;

    private List<TaskResource> taskResources;
    
    private String operation;
    
    // 操作人ID
    private String operaterId;
    
    private String planpublish;			//拟发布渠道
    
    
    
    public String getPlanpublish() {
		return planpublish;
	}

	public void setPlanpublish(String planpublish) {
		this.planpublish = planpublish;
	}

	public String getTaskguid() {
        return taskguid;
    }

    public void setTaskguid(String taskguid) {
        this.taskguid = taskguid == null ? null : taskguid.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getResourceguid() {
        return resourceguid;
    }

    public void setResourceguid(String resourceguid) {
        this.resourceguid = resourceguid == null ? null : resourceguid.trim();
    }

    public String getCreaterguid() {
        return createrguid;
    }

    public void setCreaterguid(String createrguid) {
        this.createrguid = createrguid == null ? null : createrguid.trim();
    }

    public String getOwncolumn() {
        return owncolumn;
    }

    public void setOwncolumn(String owncolumn) {
        this.owncolumn = owncolumn == null ? null : owncolumn.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getTasktitle() {
        return tasktitle;
    }

    public void setTasktitle(String tasktitle) {
        this.tasktitle = tasktitle == null ? null : tasktitle.trim();
    }

    public String getTaskplace() {
        return taskplace;
    }

    public void setTaskplace(String taskplace) {
        this.taskplace = taskplace == null ? null : taskplace.trim();
    }

    public String getTaskremark() {
        return taskremark;
    }

    public void setTaskremark(String taskremark) {
        this.taskremark = taskremark == null ? null : taskremark.trim();
    }

    public String getTaskkeywork() {
        return taskkeywork;
    }

    public void setTaskkeywork(String taskkeywork) {
        this.taskkeywork = taskkeywork == null ? null : taskkeywork.trim();
    }

    public Integer getTaskstate() {
        return taskstate;
    }

    public void setTaskstate(Integer taskstate) {
        this.taskstate = taskstate;
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype == null ? null : tasktype.trim();
    }

    public String getTasklevel() {
        return tasklevel;
    }

    public void setTasklevel(String tasklevel) {
        this.tasklevel = tasklevel == null ? null : tasklevel.trim();
    }

    public String getProgramcode() {
        return programcode;
    }

    public void setProgramcode(String programcode) {
        this.programcode = programcode == null ? null : programcode.trim();
    }

    public String getProgramname() {
        return programname;
    }

    public void setProgramname(String programname) {
        this.programname = programname == null ? null : programname.trim();
    }

    public Integer getIsspecial() {
        return isspecial;
    }

    public void setIsspecial(Integer isspecial) {
        this.isspecial = isspecial;
    }

    public String getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype == null ? null : sourcetype.trim();
    }

    public String getPasser() {
        return passer;
    }

    public void setPasser(String passer) {
        this.passer = passer == null ? null : passer.trim();
    }

    public String getPassadvice() {
        return passadvice;
    }

    public void setPassadvice(String passadvice) {
        this.passadvice = passadvice == null ? null : passadvice.trim();
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getChargeman() {
        return chargeman;
    }

    public void setChargeman(String chargeman) {
        this.chargeman = chargeman == null ? null : chargeman.trim();
    }

    public Integer getIscaifang() {
        return iscaifang;
    }

    public void setIscaifang(Integer iscaifang) {
        this.iscaifang = iscaifang;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
    }

    public String getLinkguid() {
        return linkguid;
    }

    public void setLinkguid(String linkguid) {
        this.linkguid = linkguid == null ? null : linkguid.trim();
    }

    public String getLinktitle() {
        return linktitle;
    }

    public void setLinktitle(String linktitle) {
        this.linktitle = linktitle == null ? null : linktitle.trim();
    }

    public String getCaifangremark() {
        return caifangremark;
    }

    public void setCaifangremark(String caifangremark) {
        this.caifangremark = caifangremark == null ? null : caifangremark.trim();
    }

    public Integer getIsopen() {
        return isopen;
    }

    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    public String getDeviceids() {
        return deviceids;
    }

    public void setDeviceids(String deviceids) {
        this.deviceids = deviceids == null ? null : deviceids.trim();
    }

    public String getBanmiantype() {
        return banmiantype;
    }

    public void setBanmiantype(String banmiantype) {
        this.banmiantype = banmiantype == null ? null : banmiantype.trim();
    }

    public String getBanmianguid() {
        return banmianguid;
    }

    public void setBanmianguid(String banmianguid) {
        this.banmianguid = banmianguid == null ? null : banmianguid.trim();
    }

    public String getInpeople() {
        return inpeople;
    }

    public void setInpeople(String inpeople) {
        this.inpeople = inpeople == null ? null : inpeople.trim();
    }

    public String getAllinpeople() {
        return allinpeople;
    }

    public void setAllinpeople(String allinpeople) {
        this.allinpeople = allinpeople == null ? null : allinpeople.trim();
    }

    public String getUsecolumn() {
        return usecolumn;
    }

    public void setUsecolumn(String usecolumn) {
        this.usecolumn = usecolumn == null ? null : usecolumn.trim();
    }

    public BigDecimal getXuantistate() {
        return xuantistate;
    }

    public void setXuantistate(BigDecimal xuantistate) {
        this.xuantistate = xuantistate;
    }

    public BigDecimal getIslocked() {
        return islocked;
    }

    public void setIslocked(BigDecimal islocked) {
        this.islocked = islocked;
    }

    public String getLocker() {
        return locker;
    }

    public void setLocker(String locker) {
        this.locker = locker == null ? null : locker.trim();
    }

    public Date getLocktime() {
        return locktime;
    }

    public void setLocktime(Date locktime) {
        this.locktime = locktime;
    }

	public List<TaskResource> getTaskResources() {
		return taskResources;
	}

	public void setTaskResources(List<TaskResource> taskResources) {
		this.taskResources = taskResources;
	}

	public String getOperaterId() {
		return operaterId;
	}

	public void setOperaterId(String operaterId) {
		this.operaterId = operaterId;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
    
}