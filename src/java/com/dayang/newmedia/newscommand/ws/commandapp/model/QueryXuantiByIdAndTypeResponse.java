package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-11T08:12:33.541Z")
public class QueryXuantiByIdAndTypeResponse   {
  
  private CommonResponse commonResponse = null;
  private List<Resource> resourceList = new ArrayList<Resource>();
  private List<Clue> xuanTiresourceList = new ArrayList<Clue>();
  private List<Mission> taskMissionList = new ArrayList<Mission>();

  /**
   * 通用返回
   **/
  public QueryXuantiByIdAndTypeResponse commonResponse(CommonResponse commonResponse) {
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
   * 挂载资源信息
   **/
  public QueryXuantiByIdAndTypeResponse resourceList(List<Resource> resourceList) {
    this.resourceList = resourceList;
    return this;
  }

  
  @ApiModelProperty(value = "挂载资源信息")
  @JsonProperty("resourceList")
  public List<Resource> getResourceList() {
    return resourceList;
  }
  public void setResourceList(List<Resource> resourceList) {
    this.resourceList = resourceList;
  }

  /**
   * 从CRE获取到的挂在资源
   **/
  public QueryXuantiByIdAndTypeResponse xuanTiresourceList(List<Clue> xuanTiresourceList) {
    this.xuanTiresourceList = xuanTiresourceList;
    return this;
  }

  
  @ApiModelProperty(value = "从CRE获取到的挂在资源")
  @JsonProperty("xuanTiresourceList")
  public List<Clue> getXuanTiresourceList() {
    return xuanTiresourceList;
  }
  public void setXuanTiresourceList(List<Clue> xuanTiresourceList) {
    this.xuanTiresourceList = xuanTiresourceList;
  }

  /**
   **/
  public QueryXuantiByIdAndTypeResponse taskMissionList(List<Mission> taskMissionList) {
    this.taskMissionList = taskMissionList;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("taskMissionList")
  public List<Mission> getTaskMissionList() {
    return taskMissionList;
  }
  public void setTaskMissionList(List<Mission> taskMissionList) {
    this.taskMissionList = taskMissionList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryXuantiByIdAndTypeResponse queryXuantiByIdAndTypeResponse = (QueryXuantiByIdAndTypeResponse) o;
    return Objects.equals(commonResponse, queryXuantiByIdAndTypeResponse.commonResponse) &&
        Objects.equals(resourceList, queryXuantiByIdAndTypeResponse.resourceList) &&
        Objects.equals(xuanTiresourceList, queryXuantiByIdAndTypeResponse.xuanTiresourceList) &&
        Objects.equals(taskMissionList, queryXuantiByIdAndTypeResponse.taskMissionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, resourceList, xuanTiresourceList, taskMissionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryXuantiByIdAndTypeResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
    sb.append("    xuanTiresourceList: ").append(toIndentedString(xuanTiresourceList)).append("\n");
    sb.append("    taskMissionList: ").append(toIndentedString(taskMissionList)).append("\n");
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

