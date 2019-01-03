package com.dayang.newmedia.newscommand.ws.commandapp.model;


import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;




/**
 * QueryHJCondition
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-09T10:44:50.407Z")
public class QueryHJCondition   {
	
  private String resourceOriginType = null;
  private String searchContent = null;
  private String startTime = null;
  private String endTime = null;
  private Integer start = null;
  private Integer limit = null;

  public QueryHJCondition resourceOriginType(String resourceOriginType) {
    this.resourceOriginType = resourceOriginType;
    return this;
  }

   /**
   * 资源来源类型
   * @return resourceOriginType
  **/
  @ApiModelProperty(value = "资源来源类型")
  public String getResourceOriginType() {
    return resourceOriginType;
  }

  public void setResourceOriginType(String resourceOriginType) {
    this.resourceOriginType = resourceOriginType;
  }

  public QueryHJCondition searchContent(String searchContent) {
    this.searchContent = searchContent;
    return this;
  }

   /**
   * 搜索内容过滤
   * @return searchContent
  **/
  @ApiModelProperty(value = "搜索内容过滤")
  public String getSearchContent() {
    return searchContent;
  }

  public void setSearchContent(String searchContent) {
    this.searchContent = searchContent;
  }

  public QueryHJCondition startTime(String startTime) {
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

  public QueryHJCondition endTime(String endTime) {
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

  public QueryHJCondition start(Integer start) {
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

  public QueryHJCondition limit(Integer limit) {
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
    QueryHJCondition queryHJCondition = (QueryHJCondition) o;
    return Objects.equals(this.resourceOriginType, queryHJCondition.resourceOriginType) &&
        Objects.equals(this.searchContent, queryHJCondition.searchContent) &&
        Objects.equals(this.startTime, queryHJCondition.startTime) &&
        Objects.equals(this.endTime, queryHJCondition.endTime) &&
        Objects.equals(this.start, queryHJCondition.start) &&
        Objects.equals(this.limit, queryHJCondition.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceOriginType, searchContent, startTime, endTime, start, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryHJCondition {\n");
    
    sb.append("    resourceOriginType: ").append(toIndentedString(resourceOriginType)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

