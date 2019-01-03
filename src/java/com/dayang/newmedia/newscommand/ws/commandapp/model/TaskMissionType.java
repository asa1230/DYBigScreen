package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T01:30:07.527Z")
public class TaskMissionType   {
  
  private String guid = null;
  private String missionType = null;
  private String missionTypeName = null;

  /**
   * 任务类型guid
   **/
  public TaskMissionType guid(String guid) {
    this.guid = guid;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "任务类型guid")
  @JsonProperty("guid")
  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }

  /**
   * 任务类型
   **/
  public TaskMissionType missionType(String missionType) {
    this.missionType = missionType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "任务类型")
  @JsonProperty("missionType")
  public String getMissionType() {
    return missionType;
  }
  public void setMissionType(String missionType) {
    this.missionType = missionType;
  }

  /**
   * 任务类型名称
   **/
  public TaskMissionType missionTypeName(String missionTypeName) {
    this.missionTypeName = missionTypeName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "任务类型名称")
  @JsonProperty("missionTypeName")
  public String getMissionTypeName() {
    return missionTypeName;
  }
  public void setMissionTypeName(String missionTypeName) {
    this.missionTypeName = missionTypeName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskMissionType taskMissionType = (TaskMissionType) o;
    return Objects.equals(guid, taskMissionType.guid) &&
        Objects.equals(missionType, taskMissionType.missionType) &&
        Objects.equals(missionTypeName, taskMissionType.missionTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, missionType, missionTypeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskMissionType {\n");
    
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    missionType: ").append(toIndentedString(missionType)).append("\n");
    sb.append("    missionTypeName: ").append(toIndentedString(missionTypeName)).append("\n");
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

