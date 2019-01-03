package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-23T10:02:13.019Z")
public class DistributeTask   {
  
	private String resourceGuid = null;
	  private String distServiceId = null;
	  private String submitUserId = null;
	  private String submitUserName = null;
	  private String distColumnCode = null;
	  private String distColumnName = null;
	  private Integer isSynchronize = null;
	  private List<ExtendAttr> extendAttrs = new ArrayList<ExtendAttr>();

	  
	  /**
	   * 资源ID
	   **/
	  
	  @ApiModelProperty(required = true, value = "资源ID")
	  @JsonProperty("resourceGuid")
	  public String getResourceGuid() {
	    return resourceGuid;
	  }
	  public void setResourceGuid(String resourceGuid) {
	    this.resourceGuid = resourceGuid;
	  }

	  
	  /**
	   * 分发服务ID
	   **/
	  
	  @ApiModelProperty(required = true, value = "分发服务ID")
	  @JsonProperty("distServiceId")
	  public String getDistServiceId() {
	    return distServiceId;
	  }
	  public void setDistServiceId(String distServiceId) {
	    this.distServiceId = distServiceId;
	  }

	  
	  /**
	   * 任务提交人工号
	   **/
	  
	  @ApiModelProperty(value = "任务提交人工号")
	  @JsonProperty("submitUserId")
	  public String getSubmitUserId() {
	    return submitUserId;
	  }
	  public void setSubmitUserId(String submitUserId) {
	    this.submitUserId = submitUserId;
	  }

	  
	  /**
	   * 任务提交人姓名
	   **/
	  
	  @ApiModelProperty(value = "任务提交人姓名")
	  @JsonProperty("submitUserName")
	  public String getSubmitUserName() {
	    return submitUserName;
	  }
	  public void setSubmitUserName(String submitUserName) {
	    this.submitUserName = submitUserName;
	  }

	  
	  /**
	   * 分发栏目代码
	   **/
	  
	  @ApiModelProperty(value = "分发栏目代码")
	  @JsonProperty("distColumnCode")
	  public String getDistColumnCode() {
	    return distColumnCode;
	  }
	  public void setDistColumnCode(String distColumnCode) {
	    this.distColumnCode = distColumnCode;
	  }

	  
	  /**
	   * 分发栏目名称
	   **/
	  
	  @ApiModelProperty(value = "分发栏目名称")
	  @JsonProperty("distColumnName")
	  public String getDistColumnName() {
	    return distColumnName;
	  }
	  public void setDistColumnName(String distColumnName) {
	    this.distColumnName = distColumnName;
	  }

	  /**
	   * 是否同步(0=异步  1=同步)，默认是异步
	   **/
	  public DistributeTask isSynchronize(Integer isSynchronize) {
	    this.isSynchronize = isSynchronize;
	    return this;
	  }

	  
	  @ApiModelProperty(value = "是否同步(0=异步  1=同步)，默认是异步")
	  @JsonProperty("isSynchronize")
	  public Integer getIsSynchronize() {
	    return isSynchronize;
	  }
	  public void setIsSynchronize(Integer isSynchronize) {
	    this.isSynchronize = isSynchronize;
	  }
	  
	  /**
	   * 扩展属性列表（后续扩展使用，现在未实现）
	   **/
	  
	  @ApiModelProperty(value = "扩展属性列表（后续扩展使用，现在未实现）")
	  @JsonProperty("extendAttrs")
	  public List<ExtendAttr> getExtendAttrs() {
	    return extendAttrs;
	  }
	  public void setExtendAttrs(List<ExtendAttr> extendAttrs) {
	    this.extendAttrs = extendAttrs;
	  }

	  

	  @Override
	  public boolean equals(Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    DistributeTask distributeTask = (DistributeTask) o;
	    return Objects.equals(resourceGuid, distributeTask.resourceGuid) &&
	        Objects.equals(distServiceId, distributeTask.distServiceId) &&
	        Objects.equals(submitUserId, distributeTask.submitUserId) &&
	        Objects.equals(submitUserName, distributeTask.submitUserName) &&
	        Objects.equals(distColumnCode, distributeTask.distColumnCode) &&
	        Objects.equals(distColumnName, distributeTask.distColumnName) &&
	        Objects.equals(extendAttrs, distributeTask.extendAttrs);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(resourceGuid, distServiceId, submitUserId, submitUserName, distColumnCode, distColumnName, extendAttrs);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class DistributeTask {\n");
	    
	    sb.append("    resourceGuid: ").append(toIndentedString(resourceGuid)).append("\n");
	    sb.append("    distServiceId: ").append(toIndentedString(distServiceId)).append("\n");
	    sb.append("    submitUserId: ").append(toIndentedString(submitUserId)).append("\n");
	    sb.append("    submitUserName: ").append(toIndentedString(submitUserName)).append("\n");
	    sb.append("    distColumnCode: ").append(toIndentedString(distColumnCode)).append("\n");
	    sb.append("    distColumnName: ").append(toIndentedString(distColumnName)).append("\n");
	    sb.append("    isSynchronize: ").append(toIndentedString(isSynchronize)).append("\n");
	    sb.append("    extendAttrs: ").append(toIndentedString(extendAttrs)).append("\n");
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

