package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-21T08:26:22.082Z")
public class FindResourceResponse   {
  
  private CommonResponse commonResponse = null;
  private Integer totalCount = null;
  private Integer currentPage = null;
  private Integer limit = null;
  private List<Resource> records = new ArrayList<Resource>();

  
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
   * 总条目数
   **/
  
  @ApiModelProperty(value = "总条目数")
  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  
  /**
   * 当前页
   **/
  
  @ApiModelProperty(value = "当前页")
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }
  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  
  /**
   * 每页条目数
   **/
  
  @ApiModelProperty(value = "每页条目数")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  
  /**
   * 资源信息列表
   **/
  
  @ApiModelProperty(value = "资源信息列表")
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
    FindResourceResponse findResourceResponse = (FindResourceResponse) o;
    return Objects.equals(commonResponse, findResourceResponse.commonResponse) &&
        Objects.equals(totalCount, findResourceResponse.totalCount) &&
        Objects.equals(currentPage, findResourceResponse.currentPage) &&
        Objects.equals(limit, findResourceResponse.limit) &&
        Objects.equals(records, findResourceResponse.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, totalCount, currentPage, limit, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindResourceResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

