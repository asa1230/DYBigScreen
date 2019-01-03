package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-21T08:26:22.082Z")
public class FindClassifyResponse   {
  
  private CommonResponse commonResponse = null;
  private List<Classify> records = new ArrayList<Classify>();

  
  /**
   * 通用返回
   **/
  
  @ApiModelProperty(value = "通用返回")
  @JsonProperty("commonResponse")
  public CommonResponse getCommonResponse() {
    return commonResponse;
  }
  public void setCommonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
  }

  
  /**
   * 分类信息列表
   **/
  
  @ApiModelProperty(value = "分类信息列表")
  @JsonProperty("records")
  public List<Classify> getRecords() {
    return records;
  }
  public void setRecords(List<Classify> records) {
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
    FindClassifyResponse findClassifyResponse = (FindClassifyResponse) o;
    return Objects.equals(commonResponse, findClassifyResponse.commonResponse) &&
        Objects.equals(records, findClassifyResponse.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindClassifyResponse {\n");
    
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

