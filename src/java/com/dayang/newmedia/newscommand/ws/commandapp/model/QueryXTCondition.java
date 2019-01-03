package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;




/**
 * 选题查询请求条件
 * @author huyulong
 *
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-10T03:25:14.207Z")
public class QueryXTCondition   {
	
  private String creater = null;
  private String chargeMan = null;
  private String inPeople = null;
  private String taskTitle = null;
  private String taskContent = null;
  private String ownColumn = null;
  private String xuantiState = null;
  private String startTime = null;
  private String endTime = null;
  private Integer start = null;
  private Integer limit = null;

  public QueryXTCondition creater(String creater) {
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

  public QueryXTCondition chargeMan(String chargeMan) {
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

  public QueryXTCondition inPeople(String inPeople) {
    this.inPeople = inPeople;
    return this;
  }

   /**
   * 成员
   * @return inPeople
  **/
  @ApiModelProperty(value = "成员")
  public String getInPeople() {
    return inPeople;
  }

  public void setInPeople(String inPeople) {
    this.inPeople = inPeople;
  }

  public QueryXTCondition taskTitle(String taskTitle) {
    this.taskTitle = taskTitle;
    return this;
  }

   /**
   * 标题(此项是用like查询)
   * @return taskTitle
  **/
  @ApiModelProperty(value = "标题(此项是用like查询)")
  public String getTaskTitle() {
    return taskTitle;
  }

  public void setTaskTitle(String taskTitle) {
    this.taskTitle = taskTitle;
  }

  public QueryXTCondition taskContent(String taskContent) {
    this.taskContent = taskContent;
    return this;
  }

   /**
   * 内容(此项是用like查询)
   * @return taskContent
  **/
  @ApiModelProperty(value = "内容(此项是用like查询)")
  public String getTaskContent() {
    return taskContent;
  }

  public void setTaskContent(String taskContent) {
    this.taskContent = taskContent;
  }

  public QueryXTCondition ownColumn(String ownColumn) {
    this.ownColumn = ownColumn;
    return this;
  }

   /**
   * 所属栏目名称
   * @return ownColumn
  **/
  @ApiModelProperty(value = "所属栏目名称")
  public String getOwnColumn() {
    return ownColumn;
  }

  public void setOwnColumn(String ownColumn) {
    this.ownColumn = ownColumn;
  }

  public QueryXTCondition xuantiState(String xuantiState) {
    this.xuantiState = xuantiState;
    return this;
  }

   /**
   * 选题状态(8-保存、104-未指派、0-进行中、1-完成、2-终止)
   * @return xuantiState
  **/
  @ApiModelProperty(value = "选题状态(8-保存、104-未指派、0-进行中、1-完成、2-终止)")
  public String getXuantiState() {
    return xuantiState;
  }

  public void setXuantiState(String xuantiState) {
    this.xuantiState = xuantiState;
  }

  public QueryXTCondition startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）
   * @return startTime
  **/
  @ApiModelProperty(value = "开始时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public QueryXTCondition endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）
   * @return endTime
  **/
  @ApiModelProperty(value = "结束时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public QueryXTCondition start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * 开始页，默认是0
   * @return start
  **/
  @ApiModelProperty(value = "开始页，默认是0")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public QueryXTCondition limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * 每页条目数，默认是5
   * @return limit
  **/
  @ApiModelProperty(value = "每页条目数，默认是5")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryXTCondition queryXTCondition = (QueryXTCondition) o;
    return Objects.equals(this.creater, queryXTCondition.creater) &&
        Objects.equals(this.chargeMan, queryXTCondition.chargeMan) &&
        Objects.equals(this.inPeople, queryXTCondition.inPeople) &&
        Objects.equals(this.taskTitle, queryXTCondition.taskTitle) &&
        Objects.equals(this.taskContent, queryXTCondition.taskContent) &&
        Objects.equals(this.ownColumn, queryXTCondition.ownColumn) &&
        Objects.equals(this.xuantiState, queryXTCondition.xuantiState) &&
        Objects.equals(this.startTime, queryXTCondition.startTime) &&
        Objects.equals(this.endTime, queryXTCondition.endTime) &&
        Objects.equals(this.start, queryXTCondition.start) &&
        Objects.equals(this.limit, queryXTCondition.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creater, chargeMan, inPeople, taskTitle, taskContent, ownColumn, xuantiState, startTime, endTime, start, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryXTCondition {\n");
    
    sb.append("    creater: ").append(toIndentedString(creater)).append("\n");
    sb.append("    chargeMan: ").append(toIndentedString(chargeMan)).append("\n");
    sb.append("    inPeople: ").append(toIndentedString(inPeople)).append("\n");
    sb.append("    taskTitle: ").append(toIndentedString(taskTitle)).append("\n");
    sb.append("    taskContent: ").append(toIndentedString(taskContent)).append("\n");
    sb.append("    ownColumn: ").append(toIndentedString(ownColumn)).append("\n");
    sb.append("    xuantiState: ").append(toIndentedString(xuantiState)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
}

