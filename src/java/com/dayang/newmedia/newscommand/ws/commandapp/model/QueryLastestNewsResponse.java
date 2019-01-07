package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryLastestNewsResponse   {
  
  private CommonResponse commonResponse = null;
  private Integer totalCount = null;
  private Integer currentPage = null;
  private Integer limit = null;
  private List<LastestNews> records = new ArrayList<LastestNews>();

  /**
   * 通用返回
   **/
  public QueryLastestNewsResponse commonResponse(CommonResponse commonResponse) {
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
   * 总条目数
   **/
  public QueryLastestNewsResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  
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
  public QueryLastestNewsResponse currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  
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
  public QueryLastestNewsResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  @ApiModelProperty(value = "每页条目数")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   * 最新动态列表
   **/
  public QueryLastestNewsResponse records(List<LastestNews> records) {
    this.records = records;
    return this;
  }

  
  @ApiModelProperty(value = "最新动态列表")
  @JsonProperty("records")
  public List<LastestNews> getRecords() {
    return records;
  }
  public void setRecords(List<LastestNews> records) {
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
    QueryLastestNewsResponse queryLastestNewsResponse = (QueryLastestNewsResponse) o;
    return Objects.equals(commonResponse, queryLastestNewsResponse.commonResponse) &&
        Objects.equals(totalCount, queryLastestNewsResponse.totalCount) &&
        Objects.equals(currentPage, queryLastestNewsResponse.currentPage) &&
        Objects.equals(limit, queryLastestNewsResponse.limit) &&
        Objects.equals(records, queryLastestNewsResponse.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, totalCount, currentPage, limit, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryLastestNewsResponse {\n");
    
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
