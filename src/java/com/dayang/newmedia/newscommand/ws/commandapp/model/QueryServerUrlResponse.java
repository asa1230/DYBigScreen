package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-04T10:41:20.470Z")
public class QueryServerUrlResponse   {
  
  private CommonResponse commonResponse = null;
  private String url = null;

  /**
   * 通用返回
   **/
  public QueryServerUrlResponse commonResponse(CommonResponse commonResponse) {
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
   * 开关参数值
   **/
  public QueryServerUrlResponse url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "开关参数值")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryServerUrlResponse querySwitchSettingValueByTypeResponse = (QueryServerUrlResponse) o;
    return Objects.equals(commonResponse, querySwitchSettingValueByTypeResponse.commonResponse) &&
        Objects.equals(url, querySwitchSettingValueByTypeResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySwitchSettingValueByTypeResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    swichvalue: ").append(toIndentedString(url)).append("\n");
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

