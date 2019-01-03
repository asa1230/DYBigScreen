package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class ColumnInfo   {
  
  private String columnId = null;
  private String columnName = null;

  /**
   * 栏目ID
   **/
  public ColumnInfo columnId(String columnId) {
    this.columnId = columnId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "栏目ID")
  @JsonProperty("columnId")
  public String getColumnId() {
    return columnId;
  }
  public void setColumnId(String columnId) {
    this.columnId = columnId;
  }

  /**
   * 栏目名称
   **/
  public ColumnInfo columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "栏目名称")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnInfo columnInfo = (ColumnInfo) o;
    return Objects.equals(columnId, columnInfo.columnId) &&
        Objects.equals(columnName, columnInfo.columnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnId, columnName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnInfo {\n");
    
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
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

