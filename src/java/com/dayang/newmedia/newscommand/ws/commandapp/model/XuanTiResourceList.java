package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class XuanTiResourceList   {
  
  private List<Resource> records = new ArrayList<Resource>();

  /**
   **/
  public XuanTiResourceList records(List<Resource> records) {
    this.records = records;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("records")
  public List<Resource> getRecords() {
    return records;
  }
  public void setRecords(List<Resource> records) {
    this.records = records;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XuanTiResourceList xuanTiResourceList = (XuanTiResourceList) o;
    return Objects.equals(records, xuanTiResourceList.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XuanTiResourceList {\n");
    
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

