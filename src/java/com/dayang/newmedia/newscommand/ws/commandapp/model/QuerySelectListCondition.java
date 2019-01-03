package com.dayang.newmedia.newscommand.ws.commandapp.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;




/**
 * QuerySelectListCondition
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-11T07:38:06.543Z")
public class QuerySelectListCondition {
  private String userId = null;

  private Integer queryModel = null;

  private String searchContent = null;

  private Integer start = null;

  private Integer limit = null;

  private String status = null;

  private String importance = null;

  private String urgency = null;

  private String chargerId = null;

  private String createrId = null;

  private String startTime = null;

  private String endTime = null;

  private String department = null;

  private Integer type = null;
  
  private Integer subType = null;
  
  private Integer isShow = null;
  
  private String systemId = null;

  private Integer source = null;
  
  private String keyword = null;
  
  private String acditState = null;
  
  private String activityId = null;
  
  private String orgs = null;
  
  public QuerySelectListCondition orgs(String orgs) {
	    this.orgs = orgs;
	    return this;
	  }

/**
* 人员所属活动ID
* @return activityId
**/
@ApiModelProperty(value = "人员所属活动ID")
public String getOrgs() {
return orgs;
}

public void setOrgs(String orgs) {
this.orgs = orgs;
}
  
  public QuerySelectListCondition activityId(String activityId) {
	    this.activityId = activityId;
	    return this;
	  }

 /**
 * 选题所属活动ID
 * @return activityId
**/
@ApiModelProperty(value = "选题所属活动ID")
public String getActivityId() {
  return activityId;
}

public void setActivityId(String activityId) {
  this.activityId = activityId;
}
  
  public QuerySelectListCondition acditState(String acditState) {
	    this.acditState = acditState;
	    return this;
	  }

   /**
   * 审核人Id
   * @return acditState
  **/
  @ApiModelProperty(value = "审核人Id")
  public String getAcditState() {
    return acditState;
  }

  public void setAcditState(String acditState) {
    this.acditState = acditState;
  }
  
  public QuerySelectListCondition userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 用户Id
   * @return userId
  **/
  @ApiModelProperty(value = "用户Id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public QuerySelectListCondition queryModel(Integer queryModel) {
    this.queryModel = queryModel;
    return this;
  }

   /**
   * 查询模式：0：全部选题，1：我的选题
   * @return queryModel
  **/
  @ApiModelProperty(value = "查询模式：0：全部选题，1：我的选题")
  public Integer getQueryModel() {
    return queryModel;
  }

  public void setQueryModel(Integer queryModel) {
    this.queryModel = queryModel;
  }

  public QuerySelectListCondition searchContent(String searchContent) {
    this.searchContent = searchContent;
    return this;
  }

   /**
   * 可以根据标题、内容、关键字搜索，关键字优先级最高
   * @return searchContent
  **/
  @ApiModelProperty(value = "可以根据标题、内容、关键字搜索，关键字优先级最高")
  public String getSearchContent() {
    return searchContent;
  }

  public void setSearchContent(String searchContent) {
    this.searchContent = searchContent;
  }

  public QuerySelectListCondition start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * 起始条目数
   * @return start
  **/
  @ApiModelProperty(value = "起始条目数")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public QuerySelectListCondition limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * 每页条数，默认是5
   * @return limit
  **/
  @ApiModelProperty(value = "每页条数，默认是5")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public QuerySelectListCondition status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 选题状态：100-保存，101-提交，102-进行中，103-完成，104-终止，999-删除，每个之间逗号隔开
   * @return status
  **/
  @ApiModelProperty(value = "选题状态：100-保存，101-提交，102-进行中，103-完成，104-终止，999-删除，每个之间逗号隔开")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public QuerySelectListCondition importance(String importance) {
    this.importance = importance;
    return this;
  }

   /**
   * 重要性：0-一般，1-重要，每个之间逗号隔开
   * @return importance
  **/
  @ApiModelProperty(value = "重要性：0-一般，1-重要，每个之间逗号隔开")
  public String getImportance() {
    return importance;
  }

  public void setImportance(String importance) {
    this.importance = importance;
  }

  public QuerySelectListCondition urgency(String urgency) {
    this.urgency = urgency;
    return this;
  }

   /**
   * 紧急性：0-一般，1-重要，每个之间逗号隔开
   * @return urgency
  **/
  @ApiModelProperty(value = "紧急性：0-一般，1-重要，每个之间逗号隔开")
  public String getUrgency() {
    return urgency;
  }

  public void setUrgency(String urgency) {
    this.urgency = urgency;
  }

  public QuerySelectListCondition chargerId(String chargerId) {
    this.chargerId = chargerId;
    return this;
  }

   /**
   * 负责人ID，每个之间逗号隔开
   * @return chargerId
  **/
  @ApiModelProperty(value = "负责人ID，每个之间逗号隔开")
  public String getChargerId() {
    return chargerId;
  }

  public void setChargerId(String chargerId) {
    this.chargerId = chargerId;
  }

  public QuerySelectListCondition createrId(String createrId) {
    this.createrId = createrId;
    return this;
  }

   /**
   * 创建人ID，每个之间逗号隔开
   * @return createrId
  **/
  @ApiModelProperty(value = "创建人ID，每个之间逗号隔开")
  public String getCreaterId() {
    return createrId;
  }

  public void setCreaterId(String createrId) {
    this.createrId = createrId;
  }

  public QuerySelectListCondition startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 创建时间范围
   * @return startTime
  **/
  @ApiModelProperty(value = "创建时间范围")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public QuerySelectListCondition endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * 创建时间范围
   * @return endTime
  **/
  @ApiModelProperty(value = "创建时间范围")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public QuerySelectListCondition department(String department) {
    this.department = department;
    return this;
  }

   /**
   * 部门，每个之间逗号隔开
   * @return department
  **/
  @ApiModelProperty(value = "部门，每个之间逗号隔开")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public QuerySelectListCondition type(Integer type) {
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

  public QuerySelectListCondition subType(Integer subType) {
	    this.subType = subType;
	    return this;
	  }

	   /**
	   * 会议类型：101-普通，102-采编会，103-总编协调会
	   * @return subType
	  **/
	  @ApiModelProperty(value = "会议类型：101-普通，102-采编会，103-总编协调会")
	  public Integer getSubType() {
	    return subType;
	  }

	  public void setSubType(Integer subType) {
	    this.subType = subType;
	  }
	  
	  public QuerySelectListCondition isShow(Integer isShow) {
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
	  
	  public QuerySelectListCondition systemId(String systemId) {
		  this.systemId = systemId;
		  return this;
	  }
	  
	  /**
	   * 来源系统id
	   * @return systemId
	   **/
	  @ApiModelProperty(value = "来源系统id")
	  public String getSystemId() {
		  return systemId;
	  }
	  
	  public void setSystemId(String systemId) {
		  this.systemId = systemId;
	  }
	  
  public QuerySelectListCondition source(Integer source) {
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
  
  public QuerySelectListCondition keyword(String keyword) {
	    this.keyword = keyword;
	    return this;
  }

   /**
   * 部门，每个之间逗号隔开
   * @return department
  **/
  @ApiModelProperty(value = "关键字，每个用逗号隔开")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

@Override
public String toString() {
	return "QuerySelectListCondition [userId=" + userId + ", queryModel=" + queryModel + ", searchContent="
			+ searchContent + ", start=" + start + ", limit=" + limit + ", status=" + status + ", importance="
			+ importance + ", urgency=" + urgency + ", chargerId=" + chargerId + ", createrId=" + createrId
			+ ", startTime=" + startTime + ", endTime=" + endTime + ", department=" + department + ", type=" + type
			+ ", subType=" + subType + ", isShow=" + isShow + ", systemId=" + systemId + ", source=" + source
			+ ", keyword=" + keyword + ", acditState=" + acditState + ", activityId=" + activityId + ", orgs=" + orgs
			+ "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((acditState == null) ? 0 : acditState.hashCode());
	result = prime * result + ((activityId == null) ? 0 : activityId.hashCode());
	result = prime * result + ((chargerId == null) ? 0 : chargerId.hashCode());
	result = prime * result + ((createrId == null) ? 0 : createrId.hashCode());
	result = prime * result + ((department == null) ? 0 : department.hashCode());
	result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
	result = prime * result + ((importance == null) ? 0 : importance.hashCode());
	result = prime * result + ((isShow == null) ? 0 : isShow.hashCode());
	result = prime * result + ((keyword == null) ? 0 : keyword.hashCode());
	result = prime * result + ((limit == null) ? 0 : limit.hashCode());
	result = prime * result + ((orgs == null) ? 0 : orgs.hashCode());
	result = prime * result + ((queryModel == null) ? 0 : queryModel.hashCode());
	result = prime * result + ((searchContent == null) ? 0 : searchContent.hashCode());
	result = prime * result + ((source == null) ? 0 : source.hashCode());
	result = prime * result + ((start == null) ? 0 : start.hashCode());
	result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
	result = prime * result + ((subType == null) ? 0 : subType.hashCode());
	result = prime * result + ((systemId == null) ? 0 : systemId.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	result = prime * result + ((urgency == null) ? 0 : urgency.hashCode());
	result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
	QuerySelectListCondition other = (QuerySelectListCondition) obj;
	if (acditState == null) {
		if (other.acditState != null)
			return false;
	} else if (!acditState.equals(other.acditState))
		return false;
	if (activityId == null) {
		if (other.activityId != null)
			return false;
	} else if (!activityId.equals(other.activityId))
		return false;
	if (chargerId == null) {
		if (other.chargerId != null)
			return false;
	} else if (!chargerId.equals(other.chargerId))
		return false;
	if (createrId == null) {
		if (other.createrId != null)
			return false;
	} else if (!createrId.equals(other.createrId))
		return false;
	if (department == null) {
		if (other.department != null)
			return false;
	} else if (!department.equals(other.department))
		return false;
	if (endTime == null) {
		if (other.endTime != null)
			return false;
	} else if (!endTime.equals(other.endTime))
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
	if (limit == null) {
		if (other.limit != null)
			return false;
	} else if (!limit.equals(other.limit))
		return false;
	if (orgs == null) {
		if (other.orgs != null)
			return false;
	} else if (!orgs.equals(other.orgs))
		return false;
	if (queryModel == null) {
		if (other.queryModel != null)
			return false;
	} else if (!queryModel.equals(other.queryModel))
		return false;
	if (searchContent == null) {
		if (other.searchContent != null)
			return false;
	} else if (!searchContent.equals(other.searchContent))
		return false;
	if (source == null) {
		if (other.source != null)
			return false;
	} else if (!source.equals(other.source))
		return false;
	if (start == null) {
		if (other.start != null)
			return false;
	} else if (!start.equals(other.start))
		return false;
	if (startTime == null) {
		if (other.startTime != null)
			return false;
	} else if (!startTime.equals(other.startTime))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	if (subType == null) {
		if (other.subType != null)
			return false;
	} else if (!subType.equals(other.subType))
		return false;
	if (systemId == null) {
		if (other.systemId != null)
			return false;
	} else if (!systemId.equals(other.systemId))
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
	if (userId == null) {
		if (other.userId != null)
			return false;
	} else if (!userId.equals(other.userId))
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

