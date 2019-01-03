package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryTaskCondition   {
  
  private String userId = null;
  private Integer queryModel = null;
  private String searchContent = null;
  private String startTime = null;
  private String endTime = null;
  private Integer start = null;
  private Integer limit = null;

  /**
   * 用户Id
   **/
  public QueryTaskCondition userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "用户Id")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * 搜索分类（0：汇聚线索、1：CRE线索）（0：全部报题、1：我的报题）（0：全部选题 、1：我的选题）（0：全部任务、1：我的任务）
   **/
  public QueryTaskCondition queryModel(Integer queryModel) {
    this.queryModel = queryModel;
    return this;
  }

  
  @ApiModelProperty(value = "搜索分类（0：汇聚线索、1：CRE线索）（0：全部报题、1：我的报题）（0：全部选题 、1：我的选题）（0：全部任务、1：我的任务）")
  @JsonProperty("queryModel")
  public Integer getQueryModel() {
    return queryModel;
  }
  public void setQueryModel(Integer queryModel) {
    this.queryModel = queryModel;
  }

  /**
   * 搜索内容过滤额
   **/
  public QueryTaskCondition searchContent(String searchContent) {
    this.searchContent = searchContent;
    return this;
  }

  
  @ApiModelProperty(value = "搜索内容过滤额")
  @JsonProperty("searchContent")
  public String getSearchContent() {
    return searchContent;
  }
  public void setSearchContent(String searchContent) {
    this.searchContent = searchContent;
  }
  

  /**
   * 开始时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）
   **/
  public QueryTaskCondition startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(value = "开始时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）")
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * 结束时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）
   **/
  public QueryTaskCondition endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(value = "结束时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）")
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * 开始页，默认是0
   **/
  public QueryTaskCondition start(Integer start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(value = "开始页，默认是0")
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }
  public void setStart(Integer start) {
    this.start = start;
  }

  /**
   * 每页条目数，默认是5
   **/
  public QueryTaskCondition limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  @ApiModelProperty(value = "每页条目数，默认是5")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTaskCondition queryTaskCondition = (QueryTaskCondition) o;
    return Objects.equals(userId, queryTaskCondition.userId) &&
        Objects.equals(queryModel, queryTaskCondition.queryModel) &&
        Objects.equals(searchContent, queryTaskCondition.searchContent) &&
        Objects.equals(startTime, queryTaskCondition.startTime) &&
        Objects.equals(endTime, queryTaskCondition.endTime) &&
        Objects.equals(start, queryTaskCondition.start) &&
        Objects.equals(limit, queryTaskCondition.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, queryModel, searchContent, startTime, endTime, start, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTaskCondition {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    queryModel: ").append(toIndentedString(queryModel)).append("\n");
    sb.append("    searchContent: ").append(toIndentedString(searchContent)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

