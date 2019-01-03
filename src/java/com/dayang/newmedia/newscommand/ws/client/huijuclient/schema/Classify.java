package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-21T08:26:22.082Z")
public class Classify   {
  
  private Integer classId = null;
  private Integer parentClassId = null;
  private String name = null;
  private Integer status = null;

  
  /**
   * 分类Id
   **/
  
  @ApiModelProperty(required = true, value = "分类Id")
  @JsonProperty("classId")
  public Integer getClassId() {
    return classId;
  }
  public void setClassId(Integer classId) {
    this.classId = classId;
  }

  
  /**
   * 该分类的父分类Id
   **/
  
  @ApiModelProperty(value = "该分类的父分类Id")
  @JsonProperty("parentClassId")
  public Integer getParentClassId() {
    return parentClassId;
  }
  public void setParentClassId(Integer parentClassId) {
    this.parentClassId = parentClassId;
  }

  
  /**
   * 分类名称
   **/
  
  @ApiModelProperty(value = "分类名称")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 状态(0:启用，1：停用)
   **/
  
  @ApiModelProperty(value = "状态(0:启用，1：停用)")
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
    Classify classify = (Classify) o;
    return Objects.equals(classId, classify.classId) &&
        Objects.equals(parentClassId, classify.parentClassId) &&
        Objects.equals(name, classify.name) &&
        Objects.equals(status, classify.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classId, parentClassId, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classify {\n");
    
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    parentClassId: ").append(toIndentedString(parentClassId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

