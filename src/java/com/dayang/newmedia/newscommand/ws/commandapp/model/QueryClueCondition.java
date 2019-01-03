package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryClueCondition   {
  
  private Integer queryModel = null;
  private String resourceGuid = null;

  /**
   * 0-汇聚线索 1-CRE线索
   **/
  public QueryClueCondition queryModel(Integer queryModel) {
    this.queryModel = queryModel;
    return this;
  }

  
  @ApiModelProperty(value = "0-汇聚线索 1-CRE线索")
  @JsonProperty("queryModel")
  public Integer getQueryModel() {
    return queryModel;
  }
  public void setQueryModel(Integer queryModel) {
    this.queryModel = queryModel;
  }

  /**
   * 资源的GUID
   **/
  public QueryClueCondition resourceGuid(String resourceGuid) {
    this.resourceGuid = resourceGuid;
    return this;
  }

  
  @ApiModelProperty(value = "资源的GUID")
  @JsonProperty("resourceGuid")
  public String getResourceGuid() {
    return resourceGuid;
  }
  public void setResourceGuid(String resourceGuid) {
    this.resourceGuid = resourceGuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryClueCondition queryClueCondition = (QueryClueCondition) o;
    return Objects.equals(queryModel, queryClueCondition.queryModel) &&
        Objects.equals(resourceGuid, queryClueCondition.resourceGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryModel, resourceGuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryClueCondition {\n");
    
    sb.append("    queryModel: ").append(toIndentedString(queryModel)).append("\n");
    sb.append("    resourceGuid: ").append(toIndentedString(resourceGuid)).append("\n");
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

