package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-03-11T07:49:43.917Z")
public class ParseCrawlUrlResponse   {
  
  private CommonResponse commonResponse = null;
  private Resource resource = null;

  
  /**
   * 通用返回
   **/
  public ParseCrawlUrlResponse commonResponse(CommonResponse commonResponse) {
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
   **/
  public ParseCrawlUrlResponse resource(Resource resource) {
    this.resource = resource;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource")
  public Resource getResource() {
    return resource;
  }
  public void setResource(Resource resource) {
    this.resource = resource;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseCrawlUrlResponse parseCrawlUrlResponse = (ParseCrawlUrlResponse) o;
    return Objects.equals(commonResponse, parseCrawlUrlResponse.commonResponse) &&
        Objects.equals(resource, parseCrawlUrlResponse.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseCrawlUrlResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

