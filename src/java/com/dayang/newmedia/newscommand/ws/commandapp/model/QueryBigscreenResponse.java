package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.dayang.newmedia.newscommand.db.model.Bigscreen;
import com.dayang.newmedia.newscommand.db.model.LoginUser;

import io.swagger.annotations.ApiModelProperty;


/**
 * QueryBigscreenResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public class QueryBigscreenResponse   {
  private CommonResponse commonResponse = null;

  private List<Bigscreen> records = new ArrayList<Bigscreen>();
  
  private LoginUser userinfo = new LoginUser();

  public QueryBigscreenResponse commonResponse(CommonResponse commonResponse) {
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

  public QueryBigscreenResponse records(List<Bigscreen> records) {
    this.records = records;
    return this;
  }
  
  public QueryBigscreenResponse userinfo(LoginUser userinfo) {
	    this.userinfo = userinfo;
	    return this;
	  }

  public QueryBigscreenResponse addRecordsItem(Bigscreen recordsItem) {
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(value = "")
  public List<Bigscreen> getRecords() {
    return records;
  }

  public void setRecords(List<Bigscreen> records) {
    this.records = records;
  }


  public LoginUser getUserinfo() {
	return userinfo;
}

public void setUserinfo(LoginUser userinfo) {
	this.userinfo = userinfo;
}

@Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryBigscreenResponse queryColumnResponse = (QueryBigscreenResponse) o;
    return Objects.equals(this.commonResponse, queryColumnResponse.commonResponse) &&
        Objects.equals(this.records, queryColumnResponse.records)&&
        Objects.equals(this.userinfo, queryColumnResponse.userinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryColumnResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    userinfo: ").append(toIndentedString(userinfo)).append("\n");
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

