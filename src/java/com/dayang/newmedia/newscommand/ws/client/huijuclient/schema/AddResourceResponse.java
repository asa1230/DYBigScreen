package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-23T10:02:13.019Z")
public class AddResourceResponse   {
  
  private CommonResponse commonResponse = null;
  private String resourceId = null;

  
  /**
   * 通用返回
   **/
  
  @ApiModelProperty(value = "通用返回")
  @JsonProperty("commonResponse")
  public CommonResponse getCommonResponse() {
    return commonResponse;
  }
  public void setCommonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
  }

  
  /**
   * 资源的GUID
   **/
  
  @ApiModelProperty(value = "资源的GUID")
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddResourceResponse addResourceResponse = (AddResourceResponse) o;
    return Objects.equals(commonResponse, addResourceResponse.commonResponse) &&
        Objects.equals(resourceId, addResourceResponse.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddResourceResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

