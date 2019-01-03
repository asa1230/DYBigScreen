package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-12T07:57:16.630Z")
public class QueryProgressByIdResponse   {
  
  private CommonResponse commonResponse = null;
  private String resourceGuid = null;
  private String progress = null;

  
  /**
   * \u901A\u7528\u8FD4\u56DE
   **/
  public QueryProgressByIdResponse commonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
    return this;
  }

  
  @ApiModelProperty(value = "\u901A\u7528\u8FD4\u56DE")
  @JsonProperty("commonResponse")
  public CommonResponse getCommonResponse() {
    return commonResponse;
  }
  public void setCommonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
  }

  
  /**
   * \u8D44\u6E90\u7684GUID
   **/
  public QueryProgressByIdResponse resourceGuid(String resourceGuid) {
    this.resourceGuid = resourceGuid;
    return this;
  }

  
  @ApiModelProperty(value = "\u8D44\u6E90\u7684GUID")
  @JsonProperty("resourceGuid")
  public String getResourceGuid() {
    return resourceGuid;
  }
  public void setResourceGuid(String resourceGuid) {
    this.resourceGuid = resourceGuid;
  }

  
  /**
   * \u9644\u4EF6\u4E0A\u4F20\u7684\u8FDB\u5EA6
   **/
  public QueryProgressByIdResponse progress(String progress) {
    this.progress = progress;
    return this;
  }

  
  @ApiModelProperty(value = "\u9644\u4EF6\u4E0A\u4F20\u7684\u8FDB\u5EA6")
  @JsonProperty("progress")
  public String getProgress() {
    return progress;
  }
  public void setProgress(String progress) {
    this.progress = progress;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryProgressByIdResponse queryProgressByIdResponse = (QueryProgressByIdResponse) o;
    return Objects.equals(commonResponse, queryProgressByIdResponse.commonResponse) &&
        Objects.equals(resourceGuid, queryProgressByIdResponse.resourceGuid) &&
        Objects.equals(progress, queryProgressByIdResponse.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, resourceGuid, progress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryProgressByIdResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    resourceGuid: ").append(toIndentedString(resourceGuid)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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

