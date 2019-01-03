package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-09T04:01:05.996Z")
public class Sysinfo   {
  
  private String sysId = null;
  private String sysName = null;
  private Integer status = null;

  
  /**
   * \u6765\u6E90\u7CFB\u7EDFId
   **/
  public Sysinfo sysId(String sysId) {
    this.sysId = sysId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "\u6765\u6E90\u7CFB\u7EDFId")
  @JsonProperty("sysId")
  public String getSysId() {
    return sysId;
  }
  public void setSysId(String sysId) {
    this.sysId = sysId;
  }

  
  /**
   * \u6765\u6E90\u7CFB\u7EDF\u540D\u79F0
   **/
  public Sysinfo sysName(String sysName) {
    this.sysName = sysName;
    return this;
  }

  
  @ApiModelProperty(value = "\u6765\u6E90\u7CFB\u7EDF\u540D\u79F0")
  @JsonProperty("sysName")
  public String getSysName() {
    return sysName;
  }
  public void setSysName(String sysName) {
    this.sysName = sysName;
  }

  
  /**
   * \u72B6\u6001(0:\u542F\u7528\uFF0C1\uFF1A\u505C\u7528)
   **/
  public Sysinfo status(Integer status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "\u72B6\u6001(0:\u542F\u7528\uFF0C1\uFF1A\u505C\u7528)")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sysinfo sysinfo = (Sysinfo) o;
    return Objects.equals(sysId, sysinfo.sysId) &&
        Objects.equals(sysName, sysinfo.sysName) &&
        Objects.equals(status, sysinfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sysId, sysName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sysinfo {\n");
    
    sb.append("    sysId: ").append(toIndentedString(sysId)).append("\n");
    sb.append("    sysName: ").append(toIndentedString(sysName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

