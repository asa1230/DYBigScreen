package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T01:30:07.527Z")
public class QueryMissionByIdResponse   {
  
  private CommonResponse commonResponse = null;
  private Mission missionInfo = null;

  /**
   * 通用返回
   **/
  public QueryMissionByIdResponse commonResponse(CommonResponse commonResponse) {
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
   * 任务
   **/
  public QueryMissionByIdResponse missionInfo(Mission missionInfo) {
    this.missionInfo = missionInfo;
    return this;
  }

  
  @ApiModelProperty(value = "任务")
  @JsonProperty("missionInfo")
  public Mission getMissionInfo() {
    return missionInfo;
  }
  public void setMissionInfo(Mission missionInfo) {
    this.missionInfo = missionInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryMissionByIdResponse queryMissionByIdResponse = (QueryMissionByIdResponse) o;
    return Objects.equals(commonResponse, queryMissionByIdResponse.commonResponse) &&
        Objects.equals(missionInfo, queryMissionByIdResponse.missionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, missionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryMissionByIdResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    missionInfo: ").append(toIndentedString(missionInfo)).append("\n");
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

