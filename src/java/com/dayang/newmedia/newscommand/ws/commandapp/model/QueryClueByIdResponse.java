package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryClueByIdResponse   {
  
  private CommonResponse commonResponse = null;
  private Clue resourceInfo = null;

  /**
   * 通用返回
   **/
  public QueryClueByIdResponse commonResponse(CommonResponse commonResponse) {
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
   * 线索详情
   **/
  public QueryClueByIdResponse resourceInfo(Clue resourceInfo) {
    this.resourceInfo = resourceInfo;
    return this;
  }

  
  @ApiModelProperty(value = "线索详情")
  @JsonProperty("resourceInfo")
  public Clue getResourceInfo() {
    return resourceInfo;
  }
  public void setResourceInfo(Clue resourceInfo) {
    this.resourceInfo = resourceInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryClueByIdResponse queryClueByIdResponse = (QueryClueByIdResponse) o;
    return Objects.equals(commonResponse, queryClueByIdResponse.commonResponse) &&
        Objects.equals(resourceInfo, queryClueByIdResponse.resourceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, resourceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryClueByIdResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    resourceInfo: ").append(toIndentedString(resourceInfo)).append("\n");
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

