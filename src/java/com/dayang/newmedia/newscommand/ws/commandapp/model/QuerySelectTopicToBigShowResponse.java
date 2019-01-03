package com.dayang.newmedia.newscommand.ws.commandapp.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.dayang.newmedia.newscommand.db.model.TaskModel;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * QuerySelectTopicResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-14T06:38:37.396Z")
public class QuerySelectTopicToBigShowResponse   {
  private CommonResponse commonResponse = null;

  private String id = null;

  private String title = null;

  private Integer type[] = null;
  
  private Integer subType[] = null;
  
  private Integer isShow[] = null;
  
  private Integer source[] = null;

  private Integer importance[] = null;

  private Integer urgency[] = null;

  private String content = null;

  private String exeStartTime = null;

  private String exeEndTime = null;
  
  private String keyword[] = null;

  private String passAdvice = null;

  private Integer status = null;

  private Integer auditState = null;

  private String createTime = null;
  
  private String modifyTime = null;

  private String ownColumn = null;
  
  private String chargeMan = null;

  private String creater[] = null;

//  private String members[] = null;

  private String auditUser[] = null;

  private String activity[] = null;
  
  private String departmentId[] = null;
  
  private String chargerId[] = null;

  private String createrId[] = null;

//  private String membersId[] = null;

  private String auditUserId[] = null;

  private String activityId[] = null;

  private List<Resources> xuanTiresourceJson = null;
  
  private List<Members> members = null; 
  
  private String inPeople = null;
  
  private String ziyuan01 = null;
  private String ziyuan02 = null;
  private String ziyuan03 = null;
  private String ziyuan04 = null;
  private String ziyuan05 = null;
  
  private Integer finishMissonNum = null;
  private Integer missonNum = null;
  
  private List<TaskModel> taskModelList = null;
  
  private List<Resource> resourceList=null;
  
  @ApiModelProperty(value = "选题资源")
  @JsonProperty("resourceList")
  public List<Resource> getResourceList() {
	return resourceList;
}
public void setResourceList(List<Resource> resourceList) {
	this.resourceList = resourceList;
}
@ApiModelProperty(value = "选题任务")
  @JsonProperty("taskModelList")
  public List<TaskModel> getTaskModelList() {
	return taskModelList;
}
public void setTaskModelList(List<TaskModel> taskModelList) {
	this.taskModelList = taskModelList;
}
@ApiModelProperty(value = "完成任务数量")
  @JsonProperty("finishMissonNum")
  public Integer getFinishMissonNum() {
	return finishMissonNum;
}
public void setFinishMissonNum(Integer finishMissonNum) {
	this.finishMissonNum = finishMissonNum;
}
@ApiModelProperty(value = "总任务数量")
@JsonProperty("missonNum")
public Integer getMissonNum() {
	return missonNum;
}
public void setMissonNum(Integer missonNum) {
	this.missonNum = missonNum;
}
public void setModifyTime(String modifyTime) {
	this.modifyTime = modifyTime;
}
public QuerySelectTopicToBigShowResponse ziyuan01(String ziyuan01) {
	    this.ziyuan01 = ziyuan01;
	    return this;
	  }
  public String getZiyuan01() {
	return ziyuan01;
}
public void setZiyuan01(String ziyuan01) {
	this.ziyuan01 = ziyuan01;
}
public QuerySelectTopicToBigShowResponse ziyuan02(String ziyuan02) {
    this.ziyuan02 = ziyuan02;
    return this;
  }
public String getZiyuan02() {
	return ziyuan02;
}
public void setZiyuan02(String ziyuan02) {
	this.ziyuan02 = ziyuan02;
}
public QuerySelectTopicToBigShowResponse ziyuan03(String ziyuan03) {
    this.ziyuan03 = ziyuan03;
    return this;
  }
public String getZiyuan03() {
	return ziyuan03;
}
public void setZiyuan03(String ziyuan03) {
	this.ziyuan03 = ziyuan03;
}
public QuerySelectTopicToBigShowResponse ziyuan04(String ziyuan04) {
    this.ziyuan04 = ziyuan04;
    return this;
  }
public String getZiyuan04() {
	return ziyuan04;
}
public void setZiyuan04(String ziyuan04) {
	this.ziyuan04 = ziyuan04;
}
public QuerySelectTopicToBigShowResponse ziyuan05(String ziyuan05) {
    this.ziyuan05 = ziyuan05;
    return this;
  }
public String getZiyuan05() {
	return ziyuan05;
}
public void setZiyuan05(String ziyuan05) {
	this.ziyuan05 = ziyuan05;
}
public QuerySelectTopicToBigShowResponse inPeople(String inPeople) {
	    this.inPeople = inPeople;
	    return this;
	  }
  @ApiModelProperty(value = "成员")
  public String getInPeople() {
	return inPeople;
}

public void setInPeople(String inPeople) {
	this.inPeople = inPeople;
}

public QuerySelectTopicToBigShowResponse commonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
    return this;
  }

   /**
   * 通用返回
   * @return commonResponse
  **/
  @ApiModelProperty(value = "通用返回")
  public CommonResponse getCommonResponse() {
    return commonResponse;
  }

  public void setCommonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
  }

  public QuerySelectTopicToBigShowResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 选题guid
   * @return id
  **/
  @ApiModelProperty(required = true, value = "选题guid")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuerySelectTopicToBigShowResponse title(String title) {
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

  public QuerySelectTopicToBigShowResponse type(Integer type[]) {
    this.type = type;
    return this;
  }

   /**
   * 选题类型：0-自主选题，1-上报选题
   * @return type
  **/
  @ApiModelProperty(value = "选题类型：0-自主选题，1-上报选题")
  public Integer[] getType() {
    return type;
  }

  public void setType(Integer type[]) {
    this.type = type;
  }

  public QuerySelectTopicToBigShowResponse subType(Integer subType[]) {
	    this.subType = subType;
	    return this;
	  }
	   /**
	   * 会议类型：101-普通，102-采编会，103-总编协调会
	   * @return subType
	  **/
	  @ApiModelProperty(value = "会议类型：101-普通，102-采编会，103-总编协调会")
	  public Integer[] getSubType() {
	    return subType;
	  }

	  public void setSubType(Integer subType[]) {
	    this.subType = subType;
	  }
	  
	  public QuerySelectTopicToBigShowResponse isShow(Integer isShow[]) {
		  this.isShow = isShow;
		  return this;
	  }
	  /**
	   * 是否上屏： 0-否，1-是
	   * @return isShow
	   **/
	  @ApiModelProperty(value = "是否上屏： 0-否，1-是")
	  public Integer[] getIsShow() {
		  return isShow;
	  }
	  
	  public void setIsShow(Integer isShow[]) {
		  this.isShow = isShow;
	  }

  public QuerySelectTopicToBigShowResponse source(Integer source[]) {
    this.source = source;
    return this;
  }

   /**
   * 选题来源：0-手工创建，1-线索生成
   * @return source
  **/
  @ApiModelProperty(value = "选题来源：0-手工创建，1-线索生成")
  public Integer[] getSource() {
    return source;
  }

  public void setSource(Integer source[]) {
    this.source = source;
  }

  public QuerySelectTopicToBigShowResponse importance(Integer importance[]) {
    this.importance = importance;
    return this;
  }

   /**
   * 重要性：0-一般，1-重要
   * @return importance
  **/
  @ApiModelProperty(value = "重要性：0-一般，1-重要")
  public Integer[] getImportance() {
    return importance;
  }

  public void setImportance(Integer importance[]) {
    this.importance = importance;
  }

  public QuerySelectTopicToBigShowResponse urgency(Integer urgency[]) {
    this.urgency = urgency;
    return this;
  }

   /**
   * 紧急性：0-一般，1-重要
   * @return urgency
  **/
  @ApiModelProperty(value = "紧急性：0-一般，1-重要")
  public Integer[] getUrgency() {
    return urgency;
  }

  public void setUrgency(Integer urgency[]) {
    this.urgency = urgency;
  }

  public QuerySelectTopicToBigShowResponse content(String content) {
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

  public QuerySelectTopicToBigShowResponse ownColumn(String ownColumn) {
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
  
  public QuerySelectTopicToBigShowResponse departmentId(String[] departmentId) {
	    this.departmentId = departmentId;
	    return this;
	  }

	   /**
	   * 所属部门（栏目）
	   * @return ownColumn
	  **/
	  @ApiModelProperty(value = "所属部门（栏目）")
	  public String[] getDepartmentId() {
	    return departmentId;
	  }

	  public void setDepartmentId(String[] departmentId) {
	    this.departmentId = departmentId;
	  }

  public QuerySelectTopicToBigShowResponse exeStartTime(String exeStartTime) {
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

  public QuerySelectTopicToBigShowResponse exeEndTime(String exeEndTime) {
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

  public QuerySelectTopicToBigShowResponse keyword(String keyword[]) {
    this.keyword = keyword;
    return this;
  }

   /**
   * 关键字：多个关键字之间用逗号分隔
   * @return keywords
  **/
  @ApiModelProperty(value = "关键字：多个关键字之间用逗号分隔")
  public String[] getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword[]) {
    this.keyword = keyword;
  }

  public QuerySelectTopicToBigShowResponse passAdvice(String passAdvice) {
    this.passAdvice = passAdvice;
    return this;
  }

   /**
   * 报道方向
   * @return passAdvice
  **/
  @ApiModelProperty(value = "报道方向")
  public String getPassAdvice() {
    return passAdvice;
  }

  public void setPassAdvice(String passAdvice) {
    this.passAdvice = passAdvice;
  }

  public QuerySelectTopicToBigShowResponse status(Integer status) {
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

  public QuerySelectTopicToBigShowResponse auditState(Integer auditState) {
    this.auditState = auditState;
    return this;
  }

   /**
   * 审核状态：9：无须审核，8：待审，1：审核通过，0：审核不通过
   * @return auditState
  **/
  @ApiModelProperty(value = "审核状态：9：无须审核，8：待审，1：审核通过，0：审核不通过")
  public Integer getAuditState() {
    return auditState;
  }

  public void setAuditState(Integer auditState) {
    this.auditState = auditState;
  }

  public QuerySelectTopicToBigShowResponse createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @ApiModelProperty(value = "创建时间")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }
  
  public QuerySelectTopicToBigShowResponse modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 修改时间
   * @return modifyTime
  **/
  @ApiModelProperty(value = "修改时间")
  public String getModifyTime() {
    return modifyTime;
  }

  public void setModifyTimee(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public QuerySelectTopicToBigShowResponse chargeMan(String chargeMan) {
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
  
  public QuerySelectTopicToBigShowResponse chargerId(String chargerId[]) {
	    this.chargerId = chargerId;
	    return this;
	  }

   /**
   * 负责人Id
   * @return chargerId
  **/
  @ApiModelProperty(value = "负责人")
  public String[] getChargerId() {
    return chargerId;
  }

  public void setChargerId(String[] chargerId) {
    this.chargerId = chargerId;
  }

  public QuerySelectTopicToBigShowResponse creater(String[] creater) {
    this.creater = creater;
    return this;
  }

   /**
   * 创建人
   * @return creater
  **/
  @ApiModelProperty(value = "创建人")
  public String[] getCreater() {
    return creater;
  }

  public void setCreater(String[] creater) {
    this.creater = creater;
  }
  
  public QuerySelectTopicToBigShowResponse createrId(String[] createrId) {
    this.createrId = createrId;
    return this;
  }

   /**
   * 创建人ID
   * @return createrId
  **/
  @ApiModelProperty(value = "创建人")
  public String[] getCreaterId() {
    return createrId;
  }

  public void setCreaterId(String[] createrId) {
    this.createrId = createrId;
  }
  
  public QuerySelectTopicToBigShowResponse members(List<Members> members) {
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

//  public QuerySelectTopicResponse members(String[] members) {
//    this.members = members;
//    return this;
//  }
//
//   /**
//   * 参与人员
//   * @return members
//  **/
//  @ApiModelProperty(value = "参与人员")
//  public String[] getMembers() {
//    return members;
//  }
//
//  public void setMembers(String[] members) {
//    this.members = members;
//  }
//  
//  public QuerySelectTopicResponse membersId(String[] membersId) {
//    this.membersId = membersId;
//    return this;
//  }
//
//   /**
//   * 参与人员ID
//   * @return membersId
//  **/
//  @ApiModelProperty(value = "参与人员")
//  public String[] getMembersId() {
//    return membersId;
//  }
//
//  public void setMembersId(String[] membersId) {
//    this.membersId = membersId;
//  }
//
//  public QuerySelectTopicResponse auditUser(String[] auditUser) {
//    this.auditUser = auditUser;
//    return this;
//  }

   /**
   * 指定审核人
   * @return auditUser
  **/
  @ApiModelProperty(value = "指定审核人")
  public String[] getAuditUser() {
    return auditUser;
  }

  public void setAuditUser(String[] auditUser) {
    this.auditUser = auditUser;
  }
  
  public QuerySelectTopicToBigShowResponse auditUserId(String[] auditUserId) {
    this.auditUserId = auditUserId;
    return this;
  }

   /**
   * 指定审核人ID
   * @return auditUserId
  **/
  @ApiModelProperty(value = "指定审核人")
  public String[] getAuditUserId() {
    return auditUserId;
  }

  public void setAuditUserId(String[] auditUserId) {
    this.auditUserId = auditUserId;
  }

  public QuerySelectTopicToBigShowResponse activity(String[] activity) {
    this.activity = activity;
    return this;
  }

   /**
   * 所属活动
   * @return activity
  **/
  @ApiModelProperty(value = "所属活动")
  public String[] getActivity() {
    return activity;
  }

  public void setActivity(String[] activity) {
    this.activity = activity;
  }
  
  public QuerySelectTopicToBigShowResponse activityId(String[] activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * 所属活动ID
   * @return activityId
  **/
  @ApiModelProperty(value = "所属活动")
  public String[] getActivityId() {
    return activityId;
  }

  public void setActivityId(String[] activityId) {
    this.activityId = activityId;
  }

  public QuerySelectTopicToBigShowResponse xuanTiresourceJson(List<Resources> xuanTiresourceJson) {
    this.xuanTiresourceJson = xuanTiresourceJson;
    return this;
  }

  public QuerySelectTopicToBigShowResponse addResourceListItem(Resources resourceListItem) {
    this.xuanTiresourceJson.add(resourceListItem);
    return this;
  }

   /**
   * 挂载资源信息
   * @return resourcesList
  **/
  @ApiModelProperty(value = "挂载资源信息")
  @JsonProperty("xuanTiresourceJson")
  public List<Resources> getXuanTiresourceJson() {
    return xuanTiresourceJson;
  }

  public void setXuanTiresourceJson(List<Resources> xuanTiresourceJson) {
    this.xuanTiresourceJson = xuanTiresourceJson;
  }

 
@Override
public String toString() {
	return "QuerySelectTopicToBigShowResponse [commonResponse="
			+ commonResponse + ", id=" + id + ", title=" + title + ", type="
			+ Arrays.toString(type) + ", subType=" + Arrays.toString(subType)
			+ ", isShow=" + Arrays.toString(isShow) + ", source="
			+ Arrays.toString(source) + ", importance="
			+ Arrays.toString(importance) + ", urgency="
			+ Arrays.toString(urgency) + ", content=" + content
			+ ", exeStartTime=" + exeStartTime + ", exeEndTime=" + exeEndTime
			+ ", keyword=" + Arrays.toString(keyword) + ", passAdvice="
			+ passAdvice + ", status=" + status + ", auditState=" + auditState
			+ ", createTime=" + createTime + ", modifyTime=" + modifyTime
			+  ", ownColumn="
			+ ownColumn + ", chargeMan=" + chargeMan + ", creater="
			+ Arrays.toString(creater) + ", auditUser="
			+ Arrays.toString(auditUser) + ", activity="
			+ Arrays.toString(activity) + ", departmentId="
			+ Arrays.toString(departmentId) + ", chargerId="
			+ Arrays.toString(chargerId) + ", createrId="
			+ Arrays.toString(createrId) + ", auditUserId="
			+ Arrays.toString(auditUserId) + ", activityId="
			+ Arrays.toString(activityId) + ", xuanTiresourceJson="
			+ xuanTiresourceJson + ", members=" + members + ", inPeople="
			+ inPeople + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Arrays.hashCode(activity);
	result = prime * result + Arrays.hashCode(activityId);
	result = prime * result
			+ ((auditState == null) ? 0 : auditState.hashCode());
	result = prime * result + Arrays.hashCode(auditUser);
	result = prime * result + Arrays.hashCode(auditUserId);
	result = prime * result + ((chargeMan == null) ? 0 : chargeMan.hashCode());
	result = prime * result + Arrays.hashCode(chargerId);
	result = prime * result
			+ ((commonResponse == null) ? 0 : commonResponse.hashCode());
	result = prime * result + ((content == null) ? 0 : content.hashCode());
	result = prime * result
			+ ((createTime == null) ? 0 : createTime.hashCode());
	result = prime * result + Arrays.hashCode(creater);
	result = prime * result + Arrays.hashCode(createrId);
	result = prime * result + Arrays.hashCode(departmentId);
	result = prime * result
			+ ((exeEndTime == null) ? 0 : exeEndTime.hashCode());
	result = prime * result
			+ ((exeStartTime == null) ? 0 : exeStartTime.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + Arrays.hashCode(importance);
	result = prime * result + ((inPeople == null) ? 0 : inPeople.hashCode());
	result = prime * result + Arrays.hashCode(isShow);
	result = prime * result + Arrays.hashCode(keyword);
	result = prime * result + ((members == null) ? 0 : members.hashCode());
	result = prime * result
			+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
	result = prime * result + ((ownColumn == null) ? 0 : ownColumn.hashCode());
	result = prime * result
			+ ((passAdvice == null) ? 0 : passAdvice.hashCode());
	result = prime * result + Arrays.hashCode(source);
	result = prime * result + ((status == null) ? 0 : status.hashCode());
	result = prime * result + Arrays.hashCode(subType);
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	result = prime * result + Arrays.hashCode(type);
	result = prime * result + Arrays.hashCode(urgency);
	result = prime
			* result
			+ ((xuanTiresourceJson == null) ? 0 : xuanTiresourceJson.hashCode());
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
	QuerySelectTopicToBigShowResponse other = (QuerySelectTopicToBigShowResponse) obj;
	if (!Arrays.equals(activity, other.activity))
		return false;
	if (!Arrays.equals(activityId, other.activityId))
		return false;
	if (auditState == null) {
		if (other.auditState != null)
			return false;
	} else if (!auditState.equals(other.auditState))
		return false;
	if (!Arrays.equals(auditUser, other.auditUser))
		return false;
	if (!Arrays.equals(auditUserId, other.auditUserId))
		return false;
	if (chargeMan == null) {
		if (other.chargeMan != null)
			return false;
	} else if (!chargeMan.equals(other.chargeMan))
		return false;
	if (!Arrays.equals(chargerId, other.chargerId))
		return false;
	if (commonResponse == null) {
		if (other.commonResponse != null)
			return false;
	} else if (!commonResponse.equals(other.commonResponse))
		return false;
	if (content == null) {
		if (other.content != null)
			return false;
	} else if (!content.equals(other.content))
		return false;
	if (createTime == null) {
		if (other.createTime != null)
			return false;
	} else if (!createTime.equals(other.createTime))
		return false;
	if (!Arrays.equals(creater, other.creater))
		return false;
	if (!Arrays.equals(createrId, other.createrId))
		return false;
	if (!Arrays.equals(departmentId, other.departmentId))
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
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (!Arrays.equals(importance, other.importance))
		return false;
	if (inPeople == null) {
		if (other.inPeople != null)
			return false;
	} else if (!inPeople.equals(other.inPeople))
		return false;
	if (!Arrays.equals(isShow, other.isShow))
		return false;
	if (!Arrays.equals(keyword, other.keyword))
		return false;
	if (members == null) {
		if (other.members != null)
			return false;
	} else if (!members.equals(other.members))
		return false;
	if (modifyTime == null) {
		if (other.modifyTime != null)
			return false;
	} else if (!modifyTime.equals(other.modifyTime))
		return false;
	if (ownColumn == null) {
		if (other.ownColumn != null)
			return false;
	} else if (!ownColumn.equals(other.ownColumn))
		return false;
	if (passAdvice == null) {
		if (other.passAdvice != null)
			return false;
	} else if (!passAdvice.equals(other.passAdvice))
		return false;
	if (!Arrays.equals(source, other.source))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	if (!Arrays.equals(subType, other.subType))
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	if (!Arrays.equals(type, other.type))
		return false;
	if (!Arrays.equals(urgency, other.urgency))
		return false;
	if (xuanTiresourceJson == null) {
		if (other.xuanTiresourceJson != null)
			return false;
	} else if (!xuanTiresourceJson.equals(other.xuanTiresourceJson))
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

