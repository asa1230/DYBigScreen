package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T09:16:54.812Z")
public class MoreResponse   {
  
  private String taskGuid = null;
  private String columnName = null;
  private Boolean success = null;
  private String errorDesc = null;

  /**
   **/
  public MoreResponse taskGuid(String taskGuid) {
    this.taskGuid = taskGuid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("taskGuid")
  public String getTaskGuid() {
    return taskGuid;
  }
  public void setTaskGuid(String taskGuid) {
    this.taskGuid = taskGuid;
  }

  /**
   **/
  public MoreResponse columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  /**
   **/
  public MoreResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   **/
  public MoreResponse errorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDesc")
  public String getErrorDesc() {
    return errorDesc;
  }
  public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoreResponse moreResponse = (MoreResponse) o;
    return Objects.equals(taskGuid, moreResponse.taskGuid) &&
        Objects.equals(columnName, moreResponse.columnName) &&
        Objects.equals(success, moreResponse.success) &&
        Objects.equals(errorDesc, moreResponse.errorDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskGuid, columnName, success, errorDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoreResponse {\n");
    
    sb.append("    taskGuid: ").append(toIndentedString(taskGuid)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errorDesc: ").append(toIndentedString(errorDesc)).append("\n");
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

