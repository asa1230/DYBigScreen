package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class CommonResponse   {
  
  private Boolean success = null;
  private String errorDesc = null;

  /**
   **/
  public CommonResponse success(Boolean success) {
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
  public CommonResponse errorDesc(String errorDesc) {
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
    CommonResponse commonResponse = (CommonResponse) o;
    return Objects.equals(success, commonResponse.success) &&
        Objects.equals(errorDesc, commonResponse.errorDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, errorDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponse {\n");
    
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

