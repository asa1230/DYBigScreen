package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T08:02:24.338Z")
public class NewsTask   {
	  private String taskGuid = null;
	  private String title = null;
	  private String content = null;
	  private String creater = null;
	  private String ownColumn = null;
	  private String createTime = null;
	  private String modifyTime = null;
	  private String resourceIcon = null;
	  private String chargeMan = null;
	  private String inPeople = null;
	  private String taskPlace = null;
	  private String taskRemark = null;
	  private Integer ziyuan01 = null;
	  private Integer ziyuan02 = null;
	  private Integer ziyuan03 = null;
	  private Integer ziyuan04 = null;
	  private Integer ziyuan05 = null;
	  private String passAdvice = null;
	  private String linkGuid = null;
	  private Integer taskStatus = null;
	  private Integer status = null;
	  private List<Resource> resourceList = new ArrayList<Resource>();
	  private List<Clue> xuanTiresourceList = new ArrayList<Clue>();
	  private List<Mission> taskMissionList = new ArrayList<Mission>();
	  private Integer wzpMissonNum = null;
	  private Integer jzxMissonNum = null;
	  private Integer finishMissonNum = null;
	  private Integer zzMissonNum = null;
	  private Integer missonNum = null;
	  private Integer resourceNum = null;
	  private String xuanTiresourceJson = null;
	  private String operaterId = null;
	  private String planpublish = null;
	  

	  public String getPlanpublish() {
		return planpublish;
	}


	public void setPlanpublish(String planpublish) {
		this.planpublish = planpublish;
	}


	public NewsTask taskGuid(String taskGuid) {
	    this.taskGuid = taskGuid;
	    return this;
	  }
	  
	  
	  public String getOperaterId() {
			return operaterId;
		}
		
		
		public void setOperaterId(String operaterId) {
			this.operaterId = operaterId;
		}
	  
	  /**
	   * 如果是选题，则为关联的报题GUID
	   **/
	  public NewsTask linkGuid(String linkGuid) {
	    this.linkGuid = linkGuid;
	    return this;
	  }

	  
	  @ApiModelProperty(value = "如果是选题，则为关联的报题GUID")
	  @JsonProperty("linkGuid")
	  public String getLinkGuid() {
	    return linkGuid;
	  }
	  public void setLinkGuid(String linkGuid) {
	    this.linkGuid = linkGuid;
	  }

	   /**
	   * 任务的guid
	   * @return taskGuid
	  **/
	  @ApiModelProperty(value = "任务的guid")
	  public String getTaskGuid() {
	    return taskGuid;
	  }

	  public void setTaskGuid(String taskGuid) {
	    this.taskGuid = taskGuid;
	  }

	  public NewsTask title(String title) {
	    this.title = title;
	    return this;
	  }

	   /**
	   * 任务的标题
	   * @return title
	  **/
	  @ApiModelProperty(value = "任务的标题")
	  public String getTitle() {
	    return title;
	  }

	  public void setTitle(String title) {
	    this.title = title;
	  }

	  public NewsTask content(String content) {
	    this.content = content;
	    return this;
	  }

	   /**
	   * 任务的内容
	   * @return content
	  **/
	  @ApiModelProperty(value = "任务的内容")
	  public String getContent() {
	    return content;
	  }

	  public void setContent(String content) {
	    this.content = content;
	  }

	  public NewsTask creater(String creater) {
	    this.creater = creater;
	    return this;
	  }

	   /**
	   * 创建人
	   * @return creater
	  **/
	  @ApiModelProperty(value = "创建人")
	  public String getCreater() {
	    return creater;
	  }

	  public void setCreater(String creater) {
	    this.creater = creater;
	  }

	  public NewsTask ownColumn(String ownColumn) {
	    this.ownColumn = ownColumn;
	    return this;
	  }

	   /**
	   * 报至/派至/选至栏目
	   * @return ownColumn
	  **/
	  @ApiModelProperty(value = "报至/派至/选至栏目")
	  public String getOwnColumn() {
	    return ownColumn;
	  }

	  public void setOwnColumn(String ownColumn) {
	    this.ownColumn = ownColumn;
	  }

	  public NewsTask createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	  }

	   /**
	   * 创建时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）
	   * @return createTime
	  **/
	  @ApiModelProperty(value = "创建时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）")
	  public String getCreateTime() {
	    return createTime;
	  }

	  public void setCreateTime(String createTime) {
	    this.createTime = createTime;
	  }

	  public NewsTask modifyTime(String modifyTime) {
	    this.modifyTime = modifyTime;
	    return this;
	  }

	   /**
	   * 修改时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）
	   * @return modifyTime
	  **/
	  @ApiModelProperty(value = "修改时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）")
	  public String getModifyTime() {
	    return modifyTime;
	  }

	  public void setModifyTime(String modifyTime) {
	    this.modifyTime = modifyTime;
	  }

	  public NewsTask resourceIcon(String resourceIcon) {
	    this.resourceIcon = resourceIcon;
	    return this;
	  }

	   /**
	   * 资源头像地址
	   * @return resourceIcon
	  **/
	  @ApiModelProperty(value = "资源头像地址")
	  public String getResourceIcon() {
	    return resourceIcon;
	  }

	  public void setResourceIcon(String resourceIcon) {
	    this.resourceIcon = resourceIcon;
	  }

	  public NewsTask chargeMan(String chargeMan) {
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

	  public NewsTask inPeople(String inPeople) {
	    this.inPeople = inPeople;
	    return this;
	  }

	   /**
	   * 参与人，多个以逗号隔开
	   * @return inPeople
	  **/
	  @ApiModelProperty(value = "参与人，多个以逗号隔开")
	  public String getInPeople() {
	    return inPeople;
	  }

	  public void setInPeople(String inPeople) {
	    this.inPeople = inPeople;
	  }

	  public NewsTask taskPlace(String taskPlace) {
	    this.taskPlace = taskPlace;
	    return this;
	  }

	   /**
	   * 地点信息
	   * @return taskPlace
	  **/
	  @ApiModelProperty(value = "地点信息")
	  public String getTaskPlace() {
	    return taskPlace;
	  }

	  public void setTaskPlace(String taskPlace) {
	    this.taskPlace = taskPlace;
	  }

	  public NewsTask taskRemark(String taskRemark) {
	    this.taskRemark = taskRemark;
	    return this;
	  }

	   /**
	   * 任务完成情况百分比
	   * @return taskRemark
	  **/
	  @ApiModelProperty(value = "任务完成情况百分比")
	  public String getTaskRemark() {
	    return taskRemark;
	  }

	  public void setTaskRemark(String taskRemark) {
	    this.taskRemark = taskRemark;
	  }

	  public NewsTask ziyuan01(Integer ziyuan01) {
	    this.ziyuan01 = ziyuan01;
	    return this;
	  }

	   /**
	   * 资源（电视）
	   * @return ziyuan01
	  **/
	  @ApiModelProperty(value = "资源（电视）")
	  public Integer getZiyuan01() {
	    return ziyuan01;
	  }

	  public void setZiyuan01(Integer ziyuan01) {
	    this.ziyuan01 = ziyuan01;
	  }

	  public NewsTask ziyuan02(Integer ziyuan02) {
	    this.ziyuan02 = ziyuan02;
	    return this;
	  }

	   /**
	   * 资源（网页）
	   * @return ziyuan02
	  **/
	  @ApiModelProperty(value = "资源（网页）")
	  public Integer getZiyuan02() {
	    return ziyuan02;
	  }

	  public void setZiyuan02(Integer ziyuan02) {
	    this.ziyuan02 = ziyuan02;
	  }

	  public NewsTask ziyuan03(Integer ziyuan03) {
	    this.ziyuan03 = ziyuan03;
	    return this;
	  }

	   /**
	   * 资源（微博）
	   * @return ziyuan03
	  **/
	  @ApiModelProperty(value = "资源（微博）")
	  public Integer getZiyuan03() {
	    return ziyuan03;
	  }

	  public void setZiyuan03(Integer ziyuan03) {
	    this.ziyuan03 = ziyuan03;
	  }

	  public NewsTask ziyuan04(Integer ziyuan04) {
	    this.ziyuan04 = ziyuan04;
	    return this;
	  }

	   /**
	   * 资源（微信）
	   * @return ziyuan04
	  **/
	  @ApiModelProperty(value = "资源（微信）")
	  public Integer getZiyuan04() {
	    return ziyuan04;
	  }

	  public void setZiyuan04(Integer ziyuan04) {
	    this.ziyuan04 = ziyuan04;
	  }

	  public NewsTask ziyuan05(Integer ziyuan05) {
	    this.ziyuan05 = ziyuan05;
	    return this;
	  }

	   /**
	   * 资源（其它）
	   * @return ziyuan05
	  **/
	  @ApiModelProperty(value = "资源（其它）")
	  public Integer getZiyuan05() {
	    return ziyuan05;
	  }

	  public void setZiyuan05(Integer ziyuan05) {
	    this.ziyuan05 = ziyuan05;
	  }

	  public NewsTask passAdvice(String passAdvice) {
	    this.passAdvice = passAdvice;
	    return this;
	  }

	   /**
	   * 审核意见
	   * @return passAdvice
	  **/
	  @ApiModelProperty(value = "审核意见")
	  public String getPassAdvice() {
	    return passAdvice;
	  }

	  public void setPassAdvice(String passAdvice) {
	    this.passAdvice = passAdvice;
	  }

	  public NewsTask taskStatus(Integer taskStatus) {
	    this.taskStatus = taskStatus;
	    return this;
	  }

	   /**
	   * 任务类型(0-报题，8-保存，2-选题)
	   * @return taskStatus
	  **/
	  @ApiModelProperty(value = "任务类型(0-报题，8-保存，2-选题)")
	  public Integer getTaskStatus() {
	    return taskStatus;
	  }

	  public void setTaskStatus(Integer taskStatus) {
	    this.taskStatus = taskStatus;
	  }

	  public NewsTask status(Integer status) {
	    this.status = status;
	    return this;
	  }

	   /**
	   * 任务状态(8-保存、 报题：（101-已提交、102-部分选用、103-全部选用）选题： （104-未指派、0-进行中、1-完成、2-终止）)
	   * @return status
	  **/
	  @ApiModelProperty(value = "任务状态(8-保存、 报题：（101-已提交、102-部分选用、103-全部选用）选题： （104-未指派、0-进行中、1-完成、2-终止）)")
	  public Integer getStatus() {
	    return status;
	  }

	  public void setStatus(Integer status) {
	    this.status = status;
	  }

	  public NewsTask resourceList(List<Resource> resourceList) {
	    this.resourceList = resourceList;
	    return this;
	  }

	  public NewsTask addResourceListItem(Resource resourceListItem) {
	    this.resourceList.add(resourceListItem);
	    return this;
	  }

	   /**
	   * 挂载资源信息
	   * @return resourceList
	  **/
	  @ApiModelProperty(value = "挂载资源信息")
	  public List<Resource> getResourceList() {
	    return resourceList;
	  }

	  public void setResourceList(List<Resource> resourceList) {
	    this.resourceList = resourceList;
	  }

	  public NewsTask xuanTiresourceList(List<Clue> xuanTiresourceList) {
	    this.xuanTiresourceList = xuanTiresourceList;
	    return this;
	  }

	  public NewsTask addXuanTiresourceListItem(Clue xuanTiresourceListItem) {
	    this.xuanTiresourceList.add(xuanTiresourceListItem);
	    return this;
	  }

	   /**
	   * 从CRE获取到的挂在资源
	   * @return xuanTiresourceList
	  **/
	  @ApiModelProperty(value = "从CRE获取到的挂在资源")
	  public List<Clue> getXuanTiresourceList() {
	    return xuanTiresourceList;
	  }

	  public void setXuanTiresourceList(List<Clue> xuanTiresourceList) {
	    this.xuanTiresourceList = xuanTiresourceList;
	  }

	  public NewsTask taskMissionList(List<Mission> taskMissionList) {
	    this.taskMissionList = taskMissionList;
	    return this;
	  }

	  public NewsTask addTaskMissionListItem(Mission taskMissionListItem) {
	    this.taskMissionList.add(taskMissionListItem);
	    return this;
	  }

	   /**
	   * Get taskMissionList
	   * @return taskMissionList
	  **/
	  @ApiModelProperty(value = "")
	  public List<Mission> getTaskMissionList() {
	    return taskMissionList;
	  }

	  public void setTaskMissionList(List<Mission> taskMissionList) {
	    this.taskMissionList = taskMissionList;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    NewsTask newsTask = (NewsTask) o;
	    return Objects.equals(this.taskGuid, newsTask.taskGuid) &&
	        Objects.equals(this.title, newsTask.title) &&
	        Objects.equals(this.content, newsTask.content) &&
	        Objects.equals(this.creater, newsTask.creater) &&
	        Objects.equals(this.ownColumn, newsTask.ownColumn) &&
	        Objects.equals(this.createTime, newsTask.createTime) &&
	        Objects.equals(this.modifyTime, newsTask.modifyTime) &&
	        Objects.equals(this.resourceIcon, newsTask.resourceIcon) &&
	        Objects.equals(this.chargeMan, newsTask.chargeMan) &&
	        Objects.equals(this.inPeople, newsTask.inPeople) &&
	        Objects.equals(this.taskPlace, newsTask.taskPlace) &&
	        Objects.equals(this.taskRemark, newsTask.taskRemark) &&
	        Objects.equals(this.ziyuan01, newsTask.ziyuan01) &&
	        Objects.equals(this.ziyuan02, newsTask.ziyuan02) &&
	        Objects.equals(this.ziyuan03, newsTask.ziyuan03) &&
	        Objects.equals(this.ziyuan04, newsTask.ziyuan04) &&
	        Objects.equals(this.ziyuan05, newsTask.ziyuan05) &&
	        Objects.equals(this.finishMissonNum, newsTask.finishMissonNum) &&
	        Objects.equals(this.missonNum, newsTask.missonNum) &&
	        Objects.equals(this.resourceNum, newsTask.resourceNum) &&
	        Objects.equals(this.passAdvice, newsTask.passAdvice) &&
	        Objects.equals(this.linkGuid, newsTask.linkGuid) &&
	        Objects.equals(this.taskStatus, newsTask.taskStatus) &&
	        Objects.equals(this.status, newsTask.status) &&
	        Objects.equals(this.resourceList, newsTask.resourceList) &&
	        Objects.equals(this.xuanTiresourceList, newsTask.xuanTiresourceList) &&
	        Objects.equals(this.taskMissionList, newsTask.taskMissionList);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(taskGuid, title, content, creater, ownColumn, createTime, modifyTime, resourceIcon, chargeMan, inPeople, taskPlace, taskRemark, finishMissonNum,missonNum,resourceNum,ziyuan01, ziyuan02, ziyuan03, ziyuan04, ziyuan05, passAdvice, linkGuid ,taskStatus, status, resourceList, xuanTiresourceList, taskMissionList);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class NewsTask {\n");
	    
	    sb.append("    taskGuid: ").append(toIndentedString(taskGuid)).append("\n");
	    sb.append("    title: ").append(toIndentedString(title)).append("\n");
	    sb.append("    content: ").append(toIndentedString(content)).append("\n");
	    sb.append("    creater: ").append(toIndentedString(creater)).append("\n");
	    sb.append("    ownColumn: ").append(toIndentedString(ownColumn)).append("\n");
	    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
	    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
	    sb.append("    resourceIcon: ").append(toIndentedString(resourceIcon)).append("\n");
	    sb.append("    chargeMan: ").append(toIndentedString(chargeMan)).append("\n");
	    sb.append("    inPeople: ").append(toIndentedString(inPeople)).append("\n");
	    sb.append("    taskPlace: ").append(toIndentedString(taskPlace)).append("\n");
	    sb.append("    taskRemark: ").append(toIndentedString(taskRemark)).append("\n");
	    sb.append("    ziyuan01: ").append(toIndentedString(ziyuan01)).append("\n");
	    sb.append("    ziyuan02: ").append(toIndentedString(ziyuan02)).append("\n");
	    sb.append("    ziyuan03: ").append(toIndentedString(ziyuan03)).append("\n");
	    sb.append("    ziyuan04: ").append(toIndentedString(ziyuan04)).append("\n");
	    sb.append("    ziyuan05: ").append(toIndentedString(ziyuan05)).append("\n");
	    sb.append("    finishMissonNum: ").append(toIndentedString(finishMissonNum)).append("\n");
	    sb.append("    missonNum: ").append(toIndentedString(missonNum)).append("\n");
	    sb.append("    resourceNum: ").append(toIndentedString(resourceNum)).append("\n");
	    sb.append("    passAdvice: ").append(toIndentedString(passAdvice)).append("\n");
	    sb.append("    linkGuid: ").append(toIndentedString(linkGuid)).append("\n");
	    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
	    sb.append("    status: ").append(toIndentedString(status)).append("\n");
	    sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
	    sb.append("    xuanTiresourceList: ").append(toIndentedString(xuanTiresourceList)).append("\n");
	    sb.append("    taskMissionList: ").append(toIndentedString(taskMissionList)).append("\n");
	    sb.append("}");
	    return sb.toString();
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

	@ApiModelProperty(value = "完成任务数")
	public Integer getFinishMissonNum() {
		return finishMissonNum;
	}


	public void setFinishMissonNum(Integer finishMissonNum) {
		this.finishMissonNum = finishMissonNum;
	}

	@ApiModelProperty(value = "总任务数")
	public Integer getMissonNum() {
		return missonNum;
	}


	public void setMissonNum(Integer missonNum) {
		this.missonNum = missonNum;
	}

	@ApiModelProperty(value = "总资源数")
	public Integer getResourceNum() {
		return resourceNum;
	}


	public void setResourceNum(Integer resourceNum) {
		this.resourceNum = resourceNum;
	}


	public Integer getWzpMissonNum() {
		return wzpMissonNum;
	}


	public void setWzpMissonNum(Integer wzpMissonNum) {
		this.wzpMissonNum = wzpMissonNum;
	}


	public Integer getJzxMissonNum() {
		return jzxMissonNum;
	}


	public void setJzxMissonNum(Integer jzxMissonNum) {
		this.jzxMissonNum = jzxMissonNum;
	}


	public Integer getZzMissonNum() {
		return zzMissonNum;
	}


	public void setZzMissonNum(Integer zzMissonNum) {
		this.zzMissonNum = zzMissonNum;
	}


	public String getXuanTiresourceJson() {
		return xuanTiresourceJson;
	}


	public void setXuanTiresourceJson(String xuanTiresourceJson) {
		this.xuanTiresourceJson = xuanTiresourceJson;
	}


	}

