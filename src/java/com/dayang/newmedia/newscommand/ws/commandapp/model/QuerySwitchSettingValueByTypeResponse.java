package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-04T10:41:20.470Z")
public class QuerySwitchSettingValueByTypeResponse   {
  
  private CommonResponse commonResponse = null;
  private Integer swichvalue = null;

  /**
   * 通用返回
   **/
  public QuerySwitchSettingValueByTypeResponse commonResponse(CommonResponse commonResponse) {
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
  public QuerySwitchSettingValueByTypeResponse swichvalue(Integer swichvalue) {
    this.swichvalue = swichvalue;
    return this;
  }

  
  @ApiModelProperty(value = "开关参数值")
  @JsonProperty("swichvalue")
  public Integer getSwichvalue() {
    return swichvalue;
  }
  public void setSwichvalue(Integer swichvalue) {
    this.swichvalue = swichvalue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySwitchSettingValueByTypeResponse querySwitchSettingValueByTypeResponse = (QuerySwitchSettingValueByTypeResponse) o;
    return Objects.equals(commonResponse, querySwitchSettingValueByTypeResponse.commonResponse) &&
        Objects.equals(swichvalue, querySwitchSettingValueByTypeResponse.swichvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, swichvalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySwitchSettingValueByTypeResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    swichvalue: ").append(toIndentedString(swichvalue)).append("\n");
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

