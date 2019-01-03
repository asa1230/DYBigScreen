package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-09T04:01:05.996Z")
public class FindSysInfosResponse   {
  
  private CommonResponse commonResponse = null;
  private List<Sysinfo> records = new ArrayList<Sysinfo>();

  
  /**
   * \u901A\u7528\u8FD4\u56DE
   **/
  public FindSysInfosResponse commonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
    return this;
  }

  
  @ApiModelProperty(value = "\u901A\u7528\u8FD4\u56DE")
  @JsonProperty("commonResponse")
  public CommonResponse getCommonResponse() {
    return commonResponse;
  }
  public void setCommonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
  }

  
  /**
   * \u5206\u7C7B\u4FE1\u606F\u5217\u8868
   **/
  public FindSysInfosResponse records(List<Sysinfo> records) {
    this.records = records;
    return this;
  }

  
  @ApiModelProperty(value = "\u5206\u7C7B\u4FE1\u606F\u5217\u8868")
  @JsonProperty("records")
  public List<Sysinfo> getRecords() {
    return records;
  }
  public void setRecords(List<Sysinfo> records) {
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
    FindSysInfosResponse findSysInfosResponse = (FindSysInfosResponse) o;
    return Objects.equals(commonResponse, findSysInfosResponse.commonResponse) &&
        Objects.equals(records, findSysInfosResponse.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindSysInfosResponse {\n");
    
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

