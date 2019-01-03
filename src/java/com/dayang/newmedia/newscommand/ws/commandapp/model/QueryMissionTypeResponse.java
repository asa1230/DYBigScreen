package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T01:30:07.527Z")
public class QueryMissionTypeResponse   {
  
  private CommonResponse commonResponse = null;
  private List<TaskMissionType> records = new ArrayList<TaskMissionType>();

  /**
   * 通用返回
   **/
  public QueryMissionTypeResponse commonResponse(CommonResponse commonResponse) {
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
  public QueryMissionTypeResponse records(List<TaskMissionType> records) {
    this.records = records;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("records")
  public List<TaskMissionType> getRecords() {
    return records;
  }
  public void setRecords(List<TaskMissionType> records) {
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
    QueryMissionTypeResponse queryMissionTypeResponse = (QueryMissionTypeResponse) o;
    return Objects.equals(commonResponse, queryMissionTypeResponse.commonResponse) &&
        Objects.equals(records, queryMissionTypeResponse.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryMissionTypeResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
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

