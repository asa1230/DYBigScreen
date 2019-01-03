package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.List;


import io.swagger.annotations.ApiModelProperty;




/**
 * SelectTopicToBigShow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T12:29:19.102Z")
public class SelectTopicToBigShow   {
	
  private String taskGuid = null;
  private String title = null;
  private String chargeMan = null;
  private String ownColumn = null;
  private String createTime = null;
  private String content = null;
  
  private Integer type = null;
  
  private Integer isShow = null;

  private Integer source = null;

  private Integer importance = null;

  private Integer urgency = null;

  private String chargerId = null;

  private List<Members> members = null;

  private String exeStartTime = null;

  private String exeEndTime = null;

  private String keyword = null;

  private String reportDirection = null;

  private Integer status = null;

  private String auditUser = null;
  
  private String auditUserId = null;

  private String creater = null;
  
  private String createrId = null;

  private String modifyUser = null;

  private String modyfyTime = null;
  
  private String detailUrl = null;
  
  private String ziyuan01 = null;
  private String ziyuan02 = null;
  private String ziyuan03 = null;
  private String ziyuan04 = null;
  private String ziyuan05 = null;
  private String taskPlace = null;
  
  private Integer wzpMissonNum = null;
  private Integer jzxMissonNum = null;
  private Integer finishMissonNum = null;
  private Integer zzMissonNum = null;
  private Integer missonNum = null;
  
  
public SelectTopicToBigShow wzpMissonNum(Integer wzpMissonNum) {
	this.wzpMissonNum = wzpMissonNum;
	return this;
}  
@ApiModelProperty(value = "wzpMissonNum")
public Integer getWzpMissonNum() {
	return wzpMissonNum;
}
public void setWzpMissonNum(Integer wzpMissonNum) {
	this.wzpMissonNum = wzpMissonNum;
}
//-------------------
public SelectTopicToBigShow jzxMissonNum(Integer jzxMissonNum) {
	this.jzxMissonNum = jzxMissonNum;
	return this;
}  
@ApiModelProperty(value = "jzxMissonNum")
public Integer getJzxMissonNum() {
	return jzxMissonNum;
}
public void setJzxMissonNum(Integer jzxMissonNum) {
	this.jzxMissonNum = jzxMissonNum;
}
//-------------------
public SelectTopicToBigShow finishMissonNum(Integer finishMissonNum) {
	this.finishMissonNum = finishMissonNum;
	return this;
}  
@ApiModelProperty(value = "finishMissonNum")
public Integer getFinishMissonNum() {
	return finishMissonNum;
}
public void setFinishMissonNum(Integer finishMissonNum) {
	this.finishMissonNum = finishMissonNum;
}
//-------------------
@ApiModelProperty(value = "zzMissonNum")
public SelectTopicToBigShow zzMissonNum(Integer zzMissonNum) {
	this.zzMissonNum = zzMissonNum;
	return this;
}  
public Integer getZzMissonNum() {
	return zzMissonNum;
}
public void setZzMissonNum(Integer zzMissonNum) {
	this.zzMissonNum = zzMissonNum;
}
//-------------------
@ApiModelProperty(value = "missonNum")
public SelectTopicToBigShow missonNum(Integer missonNum) {
	this.missonNum = missonNum;
	return this;
} 
public Integer getMissonNum() {
	return missonNum;
}
public void setMissonNum(Integer missonNum) {
	this.missonNum = missonNum;
}

	public SelectTopicToBigShow taskPlace(String taskPlace) {
		this.taskPlace = taskPlace;
		return this;
	}
	/**
	 * taskPlace
	 * 
	 * @return taskPlace
	 **/
	@ApiModelProperty(value = "taskPlace")
	public String getTaskPlace() {
		return taskPlace;
	}

	public void setTaskPlace(String taskPlace) {
		this.taskPlace = taskPlace;
	}
	
	public SelectTopicToBigShow ziyuan05(String ziyuan05) {
		this.ziyuan05 = ziyuan05;
		return this;
	}
	/**
	 * ziyuan05
	 * 
	 * @return ziyuan05
	 **/
	@ApiModelProperty(value = "ziyuan05")
	public String getZiyuan05() {
		return ziyuan05;
	}

	public void setZiyuan05(String ziyuan05) {
		this.ziyuan05 = ziyuan05;
	}
	
	public SelectTopicToBigShow ziyuan04(String ziyuan04) {
		this.ziyuan04 = ziyuan04;
		return this;
	}
	/**
	 * ziyuan04
	 * 
	 * @return ziyuan04
	 **/
	@ApiModelProperty(value = "ziyuan04")
	public String getZiyuan04() {
		return ziyuan04;
	}

	public void setZiyuan04(String ziyuan04) {
		this.ziyuan04 = ziyuan04;
	}
	
	public SelectTopicToBigShow ziyuan02(String ziyuan02) {
		this.ziyuan02 = ziyuan02;
		return this;
	}
	/**
	 * ziyuan02
	 * 
	 * @return ziyuan02
	 **/
	@ApiModelProperty(value = "ziyuan02")
	public String getZiyuan02() {
		return ziyuan02;
	}

	public void setZiyuan02(String ziyuan02) {
		this.ziyuan02 = ziyuan02;
	}
	
	
	public SelectTopicToBigShow ziyuan03(String ziyuan03) {
		this.ziyuan03 = ziyuan03;
		return this;
	}
	
	/**
	 * ziyuan03
	 * 
	 * @return ziyuan02
	 **/
	@ApiModelProperty(value = "ziyuan03")
	public String getZiyuan03() {
		return ziyuan03;
	}

	public void setZiyuan03(String ziyuan03) {
		this.ziyuan03 = ziyuan03;
	}
	

	public SelectTopicToBigShow ziyuan01(String ziyuan01) {
		this.ziyuan01 = ziyuan01;
		return this;
	}
	/**
	 * ziyuan01
	 * 
	 * @return ziyuan01
	 **/
	@ApiModelProperty(value = "ziyuan01")
	public String getZiyuan01() {
		return ziyuan01;
	}

	public void setZiyuan01(String ziyuan01) {
		this.ziyuan01 = ziyuan01;
	}
  
  public SelectTopicToBigShow detailUrl(String detailUrl) {
    this.detailUrl = detailUrl;
    return this;
  }

   /**
   * 选题详情url
   * @return detailUrl
  **/
  @ApiModelProperty(value = "选题详情urld")
  public String getDetailUrl() {
    return detailUrl;
  }

  public void setDetailUrl(String detailUrl) {
    this.detailUrl = detailUrl;
  }

  public SelectTopicToBigShow id(String id) {
    this.taskGuid = taskGuid;
    return this;
  }

   /**
   * 选题guid
   * @return selectGuid
  **/
  @ApiModelProperty(required = true, value = "选题guid")
  public String getTaskGuid() {
    return taskGuid;
  }

  public void setTaskGuid(String taskGuid) {
    this.taskGuid = taskGuid;
  }

  public SelectTopicToBigShow title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 选题标题
   * @return title
  **/
  @ApiModelProperty(value = "选题标题")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SelectTopicToBigShow type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * 选题类型：0-自主选题，1-上报选题
   * @return type
  **/
  @ApiModelProperty(value = "选题类型：0-自主选题，1-上报选题")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public SelectTopicToBigShow isShow(Integer isShow) {
	    this.isShow = isShow;
	    return this;
	  }

	   /**
	   * 是否上屏：0-否，1-是
	   * @return isShow
	  **/
	  @ApiModelProperty(value = "是否上屏：0-否，1-是")
	  public Integer getIsShow() {
	    return isShow;
	  }

	  public void setIsShow(Integer isShow) {
	    this.isShow = isShow;
	  }
	  
  public SelectTopicToBigShow source(Integer source) {
    this.source = source;
    return this;
  }

   /**
   * 选题来源：0-手工创建，1-线索生成
   * @return source
  **/
  @ApiModelProperty(value = "选题来源：0-手工创建，1-线索生成")
  public Integer getSource() {
    return source;
  }

  public void setSource(Integer source) {
    this.source = source;
  }

  public SelectTopicToBigShow importance(Integer importance) {
    this.importance = importance;
    return this;
  }

   /**
   * 重要性：0-一般，1-重要
   * @return importance
  **/
  @ApiModelProperty(value = "重要性：0-一般，1-重要")
  public Integer getImportance() {
    return importance;
  }

  public void setImportance(Integer importance) {
    this.importance = importance;
  }

  public SelectTopicToBigShow urgency(Integer urgency) {
    this.urgency = urgency;
    return this;
  }

   /**
   * 紧急性：0-一般，1-重要
   * @return urgency
  **/
  @ApiModelProperty(value = "紧急性：0-一般，1-重要")
  public Integer getUrgency() {
    return urgency;
  }

  public void setUrgency(Integer urgency) {
    this.urgency = urgency;
  }

  public SelectTopicToBigShow chargeMan(String chargeMan) {
    this.chargeMan = chargeMan;
    return this;
  }

   /**
   * 负责人
   * @return chargeMan
  **/
  @ApiModelProperty(value = "负责人")
  public String getChargeMan() {
    return chargeMan;
  }

  public void setChargeMan(String chargeMan) {
    this.chargeMan = chargeMan;
  }
  
  public SelectTopicToBigShow chargerId(String chargerId) {
	    this.chargerId = chargerId;
	    return this;
  }

   /**
   * 负责人
   * @return charger
  **/
  @ApiModelProperty(value = "负责人")
  public String getChargerId() {
    return chargerId;
  }

  public void setChargerId(String chargerId) {
    this.chargerId = chargerId;
  }

  public SelectTopicToBigShow members(List<Members> members) {
    this.members = members;
    return this;
  }

   /**
   * 选题成员：多个成员之间用逗号分隔
   * @return members
  **/
  @ApiModelProperty(value = "选题成员：多个成员之间用逗号分隔")
  public List<Members> getMembers() {
    return members;
  }

  public void setMembers(List<Members> members) {
    this.members = members;
  }

  public SelectTopicToBigShow content(String content) {
    this.content = content;
    return this;
  }

   /**
   * 任务内容
   * @return content
  **/
  @ApiModelProperty(value = "任务内容")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public SelectTopicToBigShow ownColumn(String ownColumn) {
    this.ownColumn = ownColumn;
    return this;
  }

   /**
   * 所属部门（栏目）
   * @return ownColumn
  **/
  @ApiModelProperty(value = "所属部门（栏目）")
  public String getOwnColumn() {
    return ownColumn;
  }

  public void setOwnColumn(String ownColumn) {
    this.ownColumn = ownColumn;
  }

  public SelectTopicToBigShow exeStartTime(String exeStartTime) {
    this.exeStartTime = exeStartTime;
    return this;
  }

   /**
   * 选题执行预计开始时间
   * @return exeStartTime
  **/
  @ApiModelProperty(value = "选题执行预计开始时间")
  public String getExeStartTime() {
    return exeStartTime;
  }

  public void setExeStartTime(String exeStartTime) {
    this.exeStartTime = exeStartTime;
  }

  public SelectTopicToBigShow exeEndTime(String exeEndTime) {
    this.exeEndTime = exeEndTime;
    return this;
  }

   /**
   * 选题执行预计结束时间
   * @return exeEndTime
  **/
  @ApiModelProperty(value = "选题执行预计结束时间")
  public String getExeEndTime() {
    return exeEndTime;
  }

  public void setExeEndTime(String exeEndTime) {
    this.exeEndTime = exeEndTime;
  }

  public SelectTopicToBigShow keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * 关键字：多个关键字之间用逗号分隔
   * @return keyword
  **/
  @ApiModelProperty(value = "关键字：多个关键字之间用逗号分隔")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public SelectTopicToBigShow reportDirection(String reportDirection) {
    this.reportDirection = reportDirection;
    return this;
  }

   /**
   * 报道方向
   * @return reportDirection
  **/
  @ApiModelProperty(value = "报道方向")
  public String getReportDirection() {
    return reportDirection;
  }

  public void setReportDirection(String reportDirection) {
    this.reportDirection = reportDirection;
  }

  public SelectTopicToBigShow status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * 选题状态：100-保存，101-提交，102-进行中，103-完成，104-终止，999-删除
   * @return status
  **/
  @ApiModelProperty(value = "选题状态：100-保存，101-提交，102-进行中，103-完成，104-终止，999-删除")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public SelectTopicToBigShow auditUser(String auditUser) {
    this.auditUser = auditUser;
    return this;
  }

   /**
   * 指定审核人
   * @return auditUser
  **/
  @ApiModelProperty(value = "指定审核人")
  public String getAuditUser() {
    return auditUser;
  }

  public void setAuditUser(String auditUser) {
    this.auditUser = auditUser;
  }
  
  public SelectTopicToBigShow auditUserId(String auditUserId) {
	    this.auditUserId = auditUserId;
	    return this;
	  }

   /**
   * 指定审核人
   * @return auditUser
  **/
  @ApiModelProperty(value = "指定审核人")
  public String getAuditUserId() {
    return auditUserId;
  }

  public void setAuditUserId(String auditUserId) {
    this.auditUserId = auditUserId;
  }

  public SelectTopicToBigShow creater(String creater) {
    this.creater = creater;
    return this;
  }

   /**
   * 作者
   * @return creater
  **/
  @ApiModelProperty(value = "作者")
  public String getCreater() {
    return creater;
  }

  public void setCreater(String creater) {
    this.creater = creater;
  }

  public SelectTopicToBigShow createrId(String createrId) {
	    this.createrId = createrId;
	    return this;
	  }

   /**
   * 作者
   * @return createrId
  **/
  @ApiModelProperty(value = "作者")
  public String getCreaterId() {
    return createrId;
  }

  public void setCreaterId(String createrId) {
    this.createrId = createrId;
  }

  public SelectTopicToBigShow createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createrTime
  **/
  @ApiModelProperty(value = "创建时间")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public SelectTopicToBigShow modifyUser(String modifyUser) {
    this.modifyUser = modifyUser;
    return this;
  }

   /**
   * 修改人
   * @return modifyUser
  **/
  @ApiModelProperty(value = "修改人")
  public String getModifyUser() {
    return modifyUser;
  }

  public void setModifyUser(String modifyUser) {
    this.modifyUser = modifyUser;
  }

  public SelectTopicToBigShow modyfyTime(String modyfyTime) {
    this.modyfyTime = modyfyTime;
    return this;
  }

   /**
   * 修改时间
   * @return modyfyTime
  **/
  @ApiModelProperty(value = "修改时间")
  public String getModyfyTime() {
    return modyfyTime;
  }

  public void setModyfyTime(String modyfyTime) {
    this.modyfyTime = modyfyTime;
  }

  @Override
public String toString() {
	return "SelectListRecords [taskGuid=" + taskGuid + ", title=" + title + ", type=" + type + ", isShow=" + isShow + ", source="
			+ source + ", importance=" + importance + ", urgency=" + urgency + ", chargeMan=" + chargeMan + ", chargerId="
			+ chargerId + ", members=" + members + ", content=" + content + ", ownColumn=" + ownColumn
			+ ", exeStartTime=" + exeStartTime + ", exeEndTime=" + exeEndTime + ", keyword=" + keyword
			+ ", reportDirection=" + reportDirection + ", status=" + status + ", auditUser=" + auditUser
			+ ", ziyuan01=" + ziyuan01 + ", ziyuan02=" + ziyuan02 + ", ziyuan03=" + ziyuan03 +", ziyuan04=" + ziyuan04+", ziyuan05=" + ziyuan05
			+ ", wzpMissonNum=" + wzpMissonNum + ", jzxMissonNum=" + jzxMissonNum + ", finishMissonNum=" + finishMissonNum +", zzMissonNum=" + zzMissonNum+", missonNum=" + missonNum
			+ ", auditUserId=" + auditUserId + ", creater=" + creater + ", createrId=" + createrId + ", createTime="
			+ createTime + ", modifyUser=" + modifyUser + ", modyfyTime=" + modyfyTime + ", taskPlace="+ taskPlace +" ,detailUrl=" + detailUrl
			+ "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((auditUser == null) ? 0 : auditUser.hashCode());
	result = prime * result + ((auditUserId == null) ? 0 : auditUserId.hashCode());
	result = prime * result + ((chargeMan == null) ? 0 : chargeMan.hashCode());
	result = prime * result + ((chargerId == null) ? 0 : chargerId.hashCode());
	result = prime * result + ((content == null) ? 0 : content.hashCode());
	result = prime * result + ((creater == null) ? 0 : creater.hashCode());
	result = prime * result + ((createrId == null) ? 0 : createrId.hashCode());
	result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
	result = prime * result + ((ownColumn == null) ? 0 : ownColumn.hashCode());
	result = prime * result + ((detailUrl == null) ? 0 : detailUrl.hashCode());
	result = prime * result + ((exeEndTime == null) ? 0 : exeEndTime.hashCode());
	result = prime * result + ((exeStartTime == null) ? 0 : exeStartTime.hashCode());
	result = prime * result + ((taskGuid == null) ? 0 : taskGuid.hashCode());
	result = prime * result + ((importance == null) ? 0 : importance.hashCode());
	result = prime * result + ((isShow == null) ? 0 : isShow.hashCode());
	result = prime * result + ((keyword == null) ? 0 : keyword.hashCode());
	result = prime * result + ((members == null) ? 0 : members.hashCode());
	result = prime * result + ((modifyUser == null) ? 0 : modifyUser.hashCode());
	result = prime * result + ((modyfyTime == null) ? 0 : modyfyTime.hashCode());
	result = prime * result + ((reportDirection == null) ? 0 : reportDirection.hashCode());
	result = prime * result + ((source == null) ? 0 : source.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	result = prime * result + ((urgency == null) ? 0 : urgency.hashCode());
	result = prime * result + ((taskPlace == null) ? 0 : taskPlace.hashCode());
	result = prime * result + ((ziyuan01 == null) ? 0 : ziyuan01.hashCode());
	result = prime * result + ((ziyuan02 == null) ? 0 : ziyuan02.hashCode());
	result = prime * result + ((ziyuan03 == null) ? 0 : ziyuan03.hashCode());
	result = prime * result + ((ziyuan04 == null) ? 0 : ziyuan04.hashCode());
	result = prime * result + ((ziyuan05 == null) ? 0 : ziyuan05.hashCode());
	result = prime * result + ((wzpMissonNum == null) ? 0 : wzpMissonNum.hashCode());
	result = prime * result + ((jzxMissonNum == null) ? 0 : jzxMissonNum.hashCode());
	result = prime * result + ((finishMissonNum == null) ? 0 : finishMissonNum.hashCode());
	result = prime * result + ((zzMissonNum == null) ? 0 : zzMissonNum.hashCode());
	result = prime * result + ((missonNum == null) ? 0 : missonNum.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SelectTopicToBigShow other = (SelectTopicToBigShow) obj;
	if (auditUser == null) {
		if (other.auditUser != null)
			return false;
	} else if (!auditUser.equals(other.auditUser))
		return false;
	if (auditUserId == null) {
		if (other.auditUserId != null)
			return false;
	} else if (!auditUserId.equals(other.auditUserId))
		return false;
	if (chargeMan == null) {
		if (other.chargeMan != null)
			return false;
	} else if (!chargeMan.equals(other.chargeMan))
		return false;
	if (chargerId == null) {
		if (other.chargerId != null)
			return false;
	} else if (!chargerId.equals(other.chargerId))
		return false;
	if (content == null) {
		if (other.content != null)
			return false;
	} else if (!content.equals(other.content))
		return false;
	if (creater == null) {
		if (other.creater != null)
			return false;
	} else if (!creater.equals(other.creater))
		return false;
	if (createrId == null) {
		if (other.createrId != null)
			return false;
	} else if (!createrId.equals(other.createrId))
		return false;
	if (createTime == null) {
		if (other.createTime != null)
			return false;
	} else if (!createTime.equals(other.createTime))
		return false;
	if (ownColumn == null) {
		if (other.ownColumn != null)
			return false;
	} else if (!ownColumn.equals(other.ownColumn))
		return false;
	if (detailUrl == null) {
		if (other.detailUrl != null)
			return false;
	} else if (!detailUrl.equals(other.detailUrl))
		return false;
	if (exeEndTime == null) {
		if (other.exeEndTime != null)
			return false;
	} else if (!exeEndTime.equals(other.exeEndTime))
		return false;
	if (exeStartTime == null) {
		if (other.exeStartTime != null)
			return false;
	} else if (!exeStartTime.equals(other.exeStartTime))
		return false;
	if (taskGuid == null) {
		if (other.taskGuid != null)
			return false;
	} else if (!taskGuid.equals(other.taskGuid))
		return false;
	if (importance == null) {
		if (other.importance != null)
			return false;
	} else if (!importance.equals(other.importance))
		return false;
	if (isShow == null) {
		if (other.isShow != null)
			return false;
	} else if (!isShow.equals(other.isShow))
		return false;
	if (keyword == null) {
		if (other.keyword != null)
			return false;
	} else if (!keyword.equals(other.keyword))
		return false;
	if (members == null) {
		if (other.members != null)
			return false;
	} else if (!members.equals(other.members))
		return false;
	if (modifyUser == null) {
		if (other.modifyUser != null)
			return false;
	} else if (!modifyUser.equals(other.modifyUser))
		return false;
	if (modyfyTime == null) {
		if (other.modyfyTime != null)
			return false;
	} else if (!modyfyTime.equals(other.modyfyTime))
		return false;
	if (reportDirection == null) {
		if (other.reportDirection != null)
			return false;
	} else if (!reportDirection.equals(other.reportDirection))
		return false;
	if (source == null) {
		if (other.source != null)
			return false;
	} else if (!source.equals(other.source))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	if (type == null) {
		if (other.type != null)
			return false;
	} else if (!type.equals(other.type))
		return false;
	if (urgency == null) {
		if (other.urgency != null)
			return false;
	} else if (!urgency.equals(other.urgency))
		return false;
	if (taskPlace == null) {
		if (other.taskPlace != null)
			return false;
	} else if (!taskPlace.equals(other.taskPlace))
		return false;
	if (ziyuan01 == null) {
		if (other.ziyuan01 != null)
			return false;
	} else if (!ziyuan01.equals(other.ziyuan01))
		return false;
	if (ziyuan02 == null) {
		if (other.ziyuan02 != null)
			return false;
	} else if (!ziyuan02.equals(other.ziyuan02))
		return false;
	if (ziyuan03 == null) {
		if (other.ziyuan03 != null)
			return false;
	} else if (!ziyuan03.equals(other.ziyuan03))
		return false;
	if (ziyuan04 == null) {
		if (other.ziyuan04 != null)
			return false;
	} else if (!ziyuan04.equals(other.ziyuan04))
		return false;
	if (ziyuan05 == null) {
		if (other.ziyuan05 != null)
			return false;
	} else if (!ziyuan05.equals(other.ziyuan05))
		return false;
	if (wzpMissonNum == null) {
		if (other.wzpMissonNum != null)
			return false;
	} else if (!wzpMissonNum.equals(other.wzpMissonNum))
		return false;
	if (jzxMissonNum == null) {
		if (other.jzxMissonNum != null)
			return false;
	} else if (!jzxMissonNum.equals(other.jzxMissonNum))
		return false;
	if (finishMissonNum == null) {
		if (other.finishMissonNum != null)
			return false;
	} else if (!finishMissonNum.equals(other.finishMissonNum))
		return false;
	if (zzMissonNum == null) {
		if (other.zzMissonNum != null)
			return false;
	} else if (!zzMissonNum.equals(other.zzMissonNum))
		return false;
	if (missonNum == null) {
		if (other.missonNum != null)
			return false;
	} else if (!missonNum.equals(other.missonNum))
		return false;
	return true;
}

/**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

