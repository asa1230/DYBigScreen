package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;

import com.dayang.newmedia.newscommand.db.model.Bigscreen;
import com.dayang.newmedia.newscommand.db.model.BigscreenUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryBigscreenUserResponse   {
  
  private CommonResponse commonResponse = null;
  private Integer totalCount = null;
  private Integer currentPage = null;
  private Integer limit = null;
  
  private BigscreenUser bcUser = new BigscreenUser();
  
  private List<Bigscreen> bigScreenList = new ArrayList<Bigscreen>();
  private List<Bigscreen> bigScreenUserList = new ArrayList<Bigscreen>();
  private List<BigscreenUser> records = new ArrayList<BigscreenUser>();

  /**
   * 通用返回
   **/
  public QueryBigscreenUserResponse commonResponse(CommonResponse commonResponse) {
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
  public QueryBigscreenUserResponse totalCount(Integer totalCount) {
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
  public QueryBigscreenUserResponse currentPage(Integer currentPage) {
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
  public QueryBigscreenUserResponse limit(Integer limit) {
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
   * 线索
   **/
  public QueryBigscreenUserResponse records(List<BigscreenUser> records) {
    this.records = records;
    return this;
  }
  
  public QueryBigscreenUserResponse bcUser(BigscreenUser bcUser) {
	    this.bcUser = bcUser;
	    return this;
  }
  
  public QueryBigscreenUserResponse bigScreenList(List<Bigscreen> bigScreenList) {
	    this.bigScreenList = bigScreenList;
	    return this;
  }
  
  public QueryBigscreenUserResponse bigScreenUserList(List<Bigscreen> bigScreenUserList) {
	    this.bigScreenUserList = bigScreenUserList;
	    return this;
}

  
  @ApiModelProperty(value = "线索")
  @JsonProperty("records")
  public List<BigscreenUser> getRecords() {
    return records;
  }
  public void setRecords(List<BigscreenUser> records) {
    this.records = records;
  }

  @ApiModelProperty(value = "线索")
  @JsonProperty("bcUser")
  public BigscreenUser getBcUser() {
	return bcUser;
  }	
  public void setBcUser(BigscreenUser bcUser) {
	this.bcUser = bcUser;
  }
  
  
  @ApiModelProperty(value = "线索")
  @JsonProperty("bigScreenUserList")
  public List<Bigscreen> getBigScreenUserList() {
	return bigScreenUserList;
  }
  public void setBigScreenUserList(List<Bigscreen> bigScreenUserList) {
	this.bigScreenUserList = bigScreenUserList;
  }


  @ApiModelProperty(value = "线索")
  @JsonProperty("bigScreenList")
  public List<Bigscreen> getBigScreenList() {
	return bigScreenList;
  }
  public void setBigScreenList(List<Bigscreen> bigScreenList) {
	this.bigScreenList = bigScreenList;
  }


@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryBigscreenUserResponse queryXuantiResponse = (QueryBigscreenUserResponse) o;
    return Objects.equals(commonResponse, queryXuantiResponse.commonResponse) &&
        Objects.equals(totalCount, queryXuantiResponse.totalCount) &&
        Objects.equals(currentPage, queryXuantiResponse.currentPage) &&
        Objects.equals(limit, queryXuantiResponse.limit) &&
        Objects.equals(records, queryXuantiResponse.records)&&
    	Objects.equals(bcUser, queryXuantiResponse.bcUser)&&
    	Objects.equals(bigScreenList, queryXuantiResponse.bigScreenList)&&
    	Objects.equals(bigScreenUserList, queryXuantiResponse.bigScreenUserList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, totalCount, currentPage, limit, records, bcUser, bigScreenList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryXuantiResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    bcUser: ").append(toIndentedString(bcUser)).append("\n");
    sb.append("    bigScreenList: ").append(toIndentedString(bigScreenList)).append("\n");
    sb.append("    bigScreenUserList: ").append(toIndentedString(bigScreenUserList)).append("\n");
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

