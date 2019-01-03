package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryBaotiByIdResponse   {
  
  private CommonResponse commonResponse = null;
  private Object taskInfo = null;

  /**
   * 通用返回
   **/
  public QueryBaotiByIdResponse commonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
    return this;
  }

  
  @ApiModelProperty(value = "通用返回")
  @JsonProperty("commonResponse")
  public CommonResponse getCommonResponse() {
    return commonResponse;
  }
  public void setCommonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
  }

  /**
   * 报题资源
   **/
  public QueryBaotiByIdResponse taskInfo(Object taskInfo) {
    this.taskInfo = taskInfo;
    return this;
  }

  
  @ApiModelProperty(value = "报题资源")
  @JsonProperty("taskInfo")
  public Object getTaskInfo() {
    return taskInfo;
  }
  public void setTaskInfo(Object taskInfo) {
    this.taskInfo = taskInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryBaotiByIdResponse queryBaotiByIdResponse = (QueryBaotiByIdResponse) o;
    return Objects.equals(commonResponse, queryBaotiByIdResponse.commonResponse) &&
        Objects.equals(taskInfo, queryBaotiByIdResponse.taskInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, taskInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryBaotiByIdResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
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

