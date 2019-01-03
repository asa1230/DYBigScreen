package com.dayang.newmedia.newscommand.ws.commandapp.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = { "guid", "resourceGuid", "title", "resourceType", "fileType", "filePath" })

@XmlRootElement(name = "Resource")
public class Resource {

	private String guid = null;

	private String resourceGuid = null;

	private String title = null;

	private String resourceType = null;

	private String fileType = null;

	private String filePath = null;

	/**
	 * 资源的guid
	 **/
	 @ApiModelProperty(value = "主键id")
	  @JsonProperty("resourceList")
	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * 汇聚或CRE提供给的资源guid
	 **/
	@ApiModelProperty(value = "汇聚或CRE提供给的资源guid")
	  @JsonProperty("resourceGuid")
	public String getResourceGuid() {
		return resourceGuid;
	}

	public void setResourceGuid(String resourceGuid) {
		this.resourceGuid = resourceGuid;
	}

	/**
	 * 资源标题
	 **/
	@ApiModelProperty(value = "ApiModelProperty")
	  @JsonProperty("title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 资源类型 (汇聚资源：huiju 、CER资源：CRE、本地资源:local，本地资源只有在新增的时候会用到)
	 **/
	@ApiModelProperty(value = "资源类型")
	  @JsonProperty("resourceType")
	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	/**
	 * 汇聚资源附件类型：(1=视频； 2=音频； 4=图片；8=文档；128=其他)
	 **/
	@ApiModelProperty(value = "汇聚资源附件类型")
	  @JsonProperty("fileType")
	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	/**
	 * 附件经壳上传后的FTP存储路径
	 **/
	@ApiModelProperty(value = "附件经壳上传后的FTP存储路径")
	  @JsonProperty("filePath")
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Resource {\n");

		sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
		sb.append("    resourceGuid: ").append(toIndentedString(resourceGuid)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
		sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
		sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
