package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-21T08:26:22.082Z")
public class UseHistories   {
  
  private String itemGuid = null;
  private String userId = null;
  private String userName = null;
  private String buildGuid = null;
  private String buildType = null;
  private String buildName = null;
  private String sysId = null;
  private String sysName = null;


	/**
	* GUID
	**/
  	@ApiModelProperty(required = true, value = "GUID")
  	@JsonProperty("itemGuid")
	public String getItemGuid() {
		return itemGuid;
	}
	
	public void setItemGuid(String itemGuid) {
		this.itemGuid = itemGuid;
	}
	/**
	 * 用户ID
	 **/
	@ApiModelProperty(required = true, value = "用户ID")
	@JsonProperty("userId")
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 用户名
	 **/
	@ApiModelProperty(required = true, value = "用户名")
	@JsonProperty("userName")
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 原系统资源guid
	 **/
	@ApiModelProperty(required = true, value = "原系统资源guid")
	@JsonProperty("buildGuid")
	public String getBuildGuid() {
		return buildGuid;
	}
	
	public void setBuildGuid(String buildGuid) {
		this.buildGuid = buildGuid;
	}
	/**
	 * 原系统资源分类
	 **/
	@ApiModelProperty(required = true, value = "原系统资源分类")
	@JsonProperty("buildType")
	public String getBuildType() {
		return buildType;
	}
	
	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}
	/**
	 * 原系统构建名称
	 **/
	@ApiModelProperty(required = true, value = "原系统构建名称")
	@JsonProperty("buildName")
	public String getBuildName() {
		return buildName;
	}
	
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	/**
	 * 使用系统ID
	 **/
	@ApiModelProperty(required = true, value = "使用系统ID")
	@JsonProperty("sysId")
	public String getSysId() {
		return sysId;
	}
	
	public void setSysId(String sysId) {
		this.sysId = sysId;
	}
	/**
	 * 使用系统名称
	 **/
	@ApiModelProperty(required = true, value = "使用系统名称")
	@JsonProperty("sysName")
	public String getSysName() {
		return sysName;
	}
	
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}




  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseHistories extendAttr = (UseHistories) o;
    return Objects.equals(itemGuid, extendAttr.itemGuid) &&
        Objects.equals(userId, extendAttr.userId) &&
        Objects.equals(userName, extendAttr.userName) &&
        Objects.equals(buildGuid, extendAttr.buildGuid) &&
        Objects.equals(buildType, extendAttr.buildType) &&
        Objects.equals(buildName, extendAttr.buildName) &&
        Objects.equals(sysId, extendAttr.sysId) &&
        Objects.equals(sysName, extendAttr.sysName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemGuid, userId, userName,buildGuid,buildType,buildName,sysId,sysName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendAttr {\n");
    
    sb.append("    itemGuid: ").append(toIndentedString(itemGuid)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    buildGuid: ").append(toIndentedString(buildGuid)).append("\n");
    sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
    sb.append("    buildName: ").append(toIndentedString(buildName)).append("\n");
    sb.append("    sysId: ").append(toIndentedString(sysId)).append("\n");
    sb.append("    sysName: ").append(toIndentedString(sysName)).append("\n");
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

