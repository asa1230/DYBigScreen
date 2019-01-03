package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-03-17T06:09:51.688Z")
public class QueryResourceCondition   {
  
  private String sourceSystemId = null;
  private List<Integer> classId = new ArrayList<Integer>();
  private String userId = null;
  private String createdTimeStart = null;
  private String createdTimeEnd = null;
  private List<Integer> resourceContentType = new ArrayList<Integer>();
  private Integer resourceOriginType = null;
  private String fullText = null;
  private Integer start = null;
  private Integer limit = null;
  
  
  /**
   * 源系统Id
   **/
  public QueryResourceCondition sourceSystemId(String sourceSystemId) {
    this.sourceSystemId = sourceSystemId;
    return this;
  }

  
  @ApiModelProperty(value = "源系统Id")
  @JsonProperty("sourceSystemId")
  public String getSourceSystemId() {
    return sourceSystemId;
  }
  public void setSourceSystemId(String sourceSystemId) {
    this.sourceSystemId = sourceSystemId;
  }

  
  /**
   * 分类Id数组。如果是数组，只支持叶子节点类型
   **/
  public QueryResourceCondition classId(List<Integer> classId) {
    this.classId = classId;
    return this;
  }

  
  @ApiModelProperty(value = "分类Id数组。如果是数组，只支持叶子节点类型")
  @JsonProperty("classId")
  public List<Integer> getClassId() {
    return classId;
  }
  public void setClassId(List<Integer> classId) {
    this.classId = classId;
  }

  
  /**
   * 用户工号，当有用户工号时，会返回用户可见范围内的资源
   **/
  public QueryResourceCondition userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "用户工号，当有用户工号时，会返回用户可见范围内的资源")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * 资源创建时间的查询起始时间(1999-05-12,yyyy-MM-dd)
   **/
  public QueryResourceCondition createdTimeStart(String createdTimeStart) {
    this.createdTimeStart = createdTimeStart;
    return this;
  }

  
  @ApiModelProperty(value = "资源创建时间的查询起始时间(1999-05-12,yyyy-MM-dd)")
  @JsonProperty("createdTimeStart")
  public String getCreatedTimeStart() {
    return createdTimeStart;
  }
  public void setCreatedTimeStart(String createdTimeStart) {
    this.createdTimeStart = createdTimeStart;
  }

  
  /**
   * 资源创建时间的查询结束时间(1999-06-12,yyyy-MM-dd)
   **/
  public QueryResourceCondition createdTimeEnd(String createdTimeEnd) {
    this.createdTimeEnd = createdTimeEnd;
    return this;
  }

  
  @ApiModelProperty(value = "资源创建时间的查询结束时间(1999-06-12,yyyy-MM-dd)")
  @JsonProperty("createdTimeEnd")
  public String getCreatedTimeEnd() {
    return createdTimeEnd;
  }
  public void setCreatedTimeEnd(String createdTimeEnd) {
    this.createdTimeEnd = createdTimeEnd;
  }

  
  /**
   * 资源内容的类型数组，或的关系(1=视频； 2=音频； 4=图片；8=文档)
   **/
  public QueryResourceCondition resourceContentType(List<Integer> resourceContentType) {
    this.resourceContentType = resourceContentType;
    return this;
  }

  
  @ApiModelProperty(value = "资源内容的类型数组，或的关系(1=视频； 2=音频； 4=图片；8=文档)")
  @JsonProperty("resourceContentType")
  public List<Integer> getResourceContentType() {
    return resourceContentType;
  }
  public void setResourceContentType(List<Integer> resourceContentType) {
    this.resourceContentType = resourceContentType;
  }

  
  /**
   * 全文检索字段
   **/
  public QueryResourceCondition fullText(String fullText) {
    this.fullText = fullText;
    return this;
  }

  
  @ApiModelProperty(value = "全文检索字段")
  @JsonProperty("fullText")
  public String getFullText() {
    return fullText;
  }
  public void setFullText(String fullText) {
    this.fullText = fullText;
  }

  
  /**
   * 分页起始条目(从0开始)
   **/
  public QueryResourceCondition start(Integer start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "分页起始条目(从0开始)")
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }
  public void setStart(Integer start) {
    this.start = start;
  }

  
  /**
   * 每页条目数（默认10，最大1000）
   **/
  public QueryResourceCondition limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "每页条目数（默认10，最大1000）")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  

  /**
   * 资源的来源类型(1：微博,2：微信,3：网站,4：随心拍,5：短信,6：电话,7：其它录入资源,8:微信互动)
   **/
  public QueryResourceCondition resourceOriginType(Integer resourceOriginType) {
    this.resourceOriginType = resourceOriginType;
    return this;
  }

  
  @ApiModelProperty(value = "资源的来源类型(1：微博,2：微信,3：网站,4：随心拍,5：短信,6：电话,7：其它录入资源,8:微信互动)")
  @JsonProperty("resourceOriginType")
  public Integer getResourceOriginType() {
    return resourceOriginType;
  }
  public void setResourceOriginType(Integer resourceOriginType) {
    this.resourceOriginType = resourceOriginType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResourceCondition queryResourceCondition = (QueryResourceCondition) o;
    return Objects.equals(sourceSystemId, queryResourceCondition.sourceSystemId) &&
        Objects.equals(classId, queryResourceCondition.classId) &&
        Objects.equals(userId, queryResourceCondition.userId) &&
        Objects.equals(createdTimeStart, queryResourceCondition.createdTimeStart) &&
        Objects.equals(createdTimeEnd, queryResourceCondition.createdTimeEnd) &&
        Objects.equals(resourceContentType, queryResourceCondition.resourceContentType) &&
        Objects.equals(resourceOriginType, queryResourceCondition.resourceOriginType) &&
        Objects.equals(fullText, queryResourceCondition.fullText) &&
        Objects.equals(start, queryResourceCondition.start) &&
        Objects.equals(limit, queryResourceCondition.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceSystemId, classId, userId, createdTimeStart, createdTimeEnd, resourceContentType, resourceOriginType, fullText, start, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResourceCondition {\n");
    
    sb.append("    sourceSystemId: ").append(toIndentedString(sourceSystemId)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdTimeStart: ").append(toIndentedString(createdTimeStart)).append("\n");
    sb.append("    createdTimeEnd: ").append(toIndentedString(createdTimeEnd)).append("\n");
    sb.append("    resourceContentType: ").append(toIndentedString(resourceContentType)).append("\n");
    sb.append("    resourceOriginType: ").append(toIndentedString(resourceOriginType)).append("\n");
    sb.append("    fullText: ").append(toIndentedString(fullText)).append("\n");
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

