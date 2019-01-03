package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;




/**
 * QuerySelectListResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public class QuerySelectListToBigShowResponse   {
  private CommonResponse commonResponse = null;

  private Integer totalCount = null;

  private Integer currentPage = null;

  private Integer limit = null;

  private List<SelectTopicToBigShow> records = new ArrayList<SelectTopicToBigShow>();

  public QuerySelectListToBigShowResponse commonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
    return this;
  }

   /**
   * 通用返回
   * @return commonResponse
  **/
  @ApiModelProperty(value = "通用返回")
  public CommonResponse getCommonResponse() {
    return commonResponse;
  }

  public void setCommonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
  }

  public QuerySelectListToBigShowResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 总查询数
   * @return totalCount
  **/
  @ApiModelProperty(value = "总查询数")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public QuerySelectListToBigShowResponse currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * 当前页
   * @return currentPage
  **/
  @ApiModelProperty(value = "当前页")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public QuerySelectListToBigShowResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * 每页条数
   * @return limit
  **/
  @ApiModelProperty(value = "每页条数")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public QuerySelectListToBigShowResponse records(List<SelectTopicToBigShow> records) {
    this.records = records;
    return this;
  }

  public QuerySelectListToBigShowResponse addRecordsItem(SelectTopicToBigShow recordsItem) {
    this.records.add(recordsItem);
    return this;
  }

   /**
   * 选题集合
   * @return records
  **/
  @ApiModelProperty(value = "选题集合")
  public List<SelectTopicToBigShow> getRecords() {
    return records;
  }

  public void setRecords(List<SelectTopicToBigShow> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySelectListToBigShowResponse querySelectListResponse = (QuerySelectListToBigShowResponse) o;
    return Objects.equals(this.commonResponse, querySelectListResponse.commonResponse) &&
        Objects.equals(this.totalCount, querySelectListResponse.totalCount) &&
        Objects.equals(this.currentPage, querySelectListResponse.currentPage) &&
        Objects.equals(this.limit, querySelectListResponse.limit) &&
        Objects.equals(this.records, querySelectListResponse.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, totalCount, currentPage, limit, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySelectListResponse {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

