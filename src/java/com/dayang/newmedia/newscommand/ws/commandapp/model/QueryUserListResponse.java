package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryUserListResponse   {
  
  private CommonResponse commonResponse = null;
  private List<UserInfo> userInfos = new ArrayList<UserInfo>();

  /**
   * 通用返回
   **/
  public QueryUserListResponse commonResponse(CommonResponse commonResponse) {
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
   * 用户信息
   **/
  public QueryUserListResponse userInfos(List<UserInfo> userInfos) {
    this.userInfos = userInfos;
    return this;
  }

  
  @ApiModelProperty(value = "用户信息")
  @JsonProperty("userInfos")
  public List<UserInfo> getUserInfos() {
    return userInfos;
  }
  public void setUserInfos(List<UserInfo> userInfos) {
    this.userInfos = userInfos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryUserListResponse queryUserListResponse = (QueryUserListResponse) o;
    return Objects.equals(commonResponse, queryUserListResponse.commonResponse) &&
        Objects.equals(userInfos, queryUserListResponse.userInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, userInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryUserListResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    userInfos: ").append(toIndentedString(userInfos)).append("\n");
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

