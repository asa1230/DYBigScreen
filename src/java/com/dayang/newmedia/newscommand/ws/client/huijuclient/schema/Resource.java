package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-03-16T12:06:24.335Z")
public class Resource {

	private String resourceId = null;
	private String title = null;
	private String content = null;
	private String author = null;
	private String authorContact = null;
	private String submitUserId = null;
	private String submitUserName = null;
	private String sourceSystemId = null;
	private String sourceSystemName = null;
	private Integer resourceOriginType = null;
	private String resourceOriginTypeName = null;
	private String visibleRange = null;
	private Integer visibleRangeType = null;
	private Integer classId = null;
	private String parentResourceId = null;
	private String resourceOriginAddress = null;
	private Integer commentNum = null;
	private Integer transmitNum = null;
	private String locationCoordinate = null;
	private String locationName = null;
	private String resourceIcon = null;
	private String publishTime = null;
	private String createdTime = null;
	private Integer isDownLoadAttachFile = null;
	private Integer attachFilePathType = null;
	private List<AttachFile> attachFiles = new ArrayList<AttachFile>();
	private List<ExtendAttr> extendAttrs = new ArrayList<ExtendAttr>();
	private List<UseHistories> useHistories = new ArrayList<UseHistories>();
	private String weiboId = null;
	private String callBackUrl = null;
	/**
	 * 资源Id信息。（入库时如果没有填写，则会自动生成一个GUID）
	 **/
	public Resource resourceId(String resourceId) {
		this.resourceId = resourceId;
		return this;
	}

	@ApiModelProperty(value = "资源Id信息。（入库时如果没有填写，则会自动生成一个GUID）")
	@JsonProperty("resourceId")
	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	/**
	 * 资源标题
	 **/
	public Resource title(String title) {
		this.title = title;
		return this;
	}

	@ApiModelProperty(required = true, value = "资源标题")
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 资源内容（如网页内容信息）
	 **/
	public Resource content(String content) {
		this.content = content;
		return this;
	}

	@ApiModelProperty(value = "资源内容（如网页内容信息）")
	@JsonProperty("content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 资源作者
	 **/
	public Resource author(String author) {
		this.author = author;
		return this;
	}

	@ApiModelProperty(value = "资源作者")
	@JsonProperty("author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * 资源作者联系方式
	 **/
	public Resource authorContact(String authorContact) {
		this.authorContact = authorContact;
		return this;
	}

	@ApiModelProperty(value = "资源作者联系方式")
	@JsonProperty("authorContact")
	public String getAuthorContact() {
		return authorContact;
	}

	public void setAuthorContact(String authorContact) {
		this.authorContact = authorContact;
	}

	/**
	 * 资源提交人Id
	 **/
	public Resource submitUserId(String submitUserId) {
		this.submitUserId = submitUserId;
		return this;
	}

	@ApiModelProperty(value = "资源提交人Id")
	@JsonProperty("submitUserId")
	public String getSubmitUserId() {
		return submitUserId;
	}

	public void setSubmitUserId(String submitUserId) {
		this.submitUserId = submitUserId;
	}

	/**
	 * 资源提交人姓名
	 **/
	public Resource submitUserName(String submitUserName) {
		this.submitUserName = submitUserName;
		return this;
	}

	@ApiModelProperty(value = "资源提交人姓名")
	@JsonProperty("submitUserName")
	public String getSubmitUserName() {
		return submitUserName;
	}

	public void setSubmitUserName(String submitUserName) {
		this.submitUserName = submitUserName;
	}

	/**
	 * 来源系统Id
	 **/
	public Resource sourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
		return this;
	}

	@ApiModelProperty(required = true, value = "来源系统Id")
	@JsonProperty("sourceSystemId")
	public String getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	/**
	 * 来源系统名称
	 **/
	public Resource sourceSystemName(String sourceSystemName) {
		this.sourceSystemName = sourceSystemName;
		return this;
	}

	@ApiModelProperty(value = "来源系统名称")
	@JsonProperty("sourceSystemName")
	public String getSourceSystemName() {
		return sourceSystemName;
	}

	public void setSourceSystemName(String sourceSystemName) {
		this.sourceSystemName = sourceSystemName;
	}

	/**
	 * 资源的来源类型
	 **/
	public Resource resourceOriginType(Integer resourceOriginType) {
		this.resourceOriginType = resourceOriginType;
		return this;
	}

	@ApiModelProperty(value = "资源的来源类型")
	@JsonProperty("resourceOriginType")
	public Integer getResourceOriginType() {
		return resourceOriginType;
	}

	public void setResourceOriginType(Integer resourceOriginType) {
		this.resourceOriginType = resourceOriginType;
	}

	/**
	 * 资源的来源类型名称
	 **/
	public Resource resourceOriginTypeName(String resourceOriginTypeName) {
		this.resourceOriginTypeName = resourceOriginTypeName;
		return this;
	}

	@ApiModelProperty(value = "资源的来源类型名称")
	@JsonProperty("resourceOriginTypeName")
	public String getResourceOriginTypeName() {
		return resourceOriginTypeName;
	}

	public void setResourceOriginTypeName(String resourceOriginTypeName) {
		this.resourceOriginTypeName = resourceOriginTypeName;
	}

	/**
	 * 资源可见范围值(全部可见(0)，用户工号，栏目代码)
	 **/
	public Resource visibleRange(String visibleRange) {
		this.visibleRange = visibleRange;
		return this;
	}

	@ApiModelProperty(value = "资源可见范围值(全部可见(0)，用户工号，栏目代码)")
	@JsonProperty("visibleRange")
	public String getVisibleRange() {
		return visibleRange;
	}

	public void setVisibleRange(String visibleRange) {
		this.visibleRange = visibleRange;
	}

	/**
	 * 资源可见范围类型(0：全部可见，1：栏目可见，2：个人可见)
	 **/
	public Resource visibleRangeType(Integer visibleRangeType) {
		this.visibleRangeType = visibleRangeType;
		return this;
	}

	@ApiModelProperty(value = "资源可见范围类型(0：全部可见，1：栏目可见，2：个人可见)")
	@JsonProperty("visibleRangeType")
	public Integer getVisibleRangeType() {
		return visibleRangeType;
	}

	public void setVisibleRangeType(Integer visibleRangeType) {
		this.visibleRangeType = visibleRangeType;
	}

	/**
	 * 资源的分类Id。如果没填，就根据sourceSystemId来获取
	 **/
	public Resource classId(Integer classId) {
		this.classId = classId;
		return this;
	}

	@ApiModelProperty(value = "资源的分类Id。如果没填，就根据sourceSystemId来获取")
	@JsonProperty("classId")
	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	/**
	 * 资源的父级资源Id
	 **/
	public Resource parentResourceId(String parentResourceId) {
		this.parentResourceId = parentResourceId;
		return this;
	}

	@ApiModelProperty(value = "资源的父级资源Id")
	@JsonProperty("parentResourceId")
	public String getParentResourceId() {
		return parentResourceId;
	}

	public void setParentResourceId(String parentResourceId) {
		this.parentResourceId = parentResourceId;
	}

	/**
	 * 资源的原始地址
	 **/
	public Resource resourceOriginAddress(String resourceOriginAddress) {
		this.resourceOriginAddress = resourceOriginAddress;
		return this;
	}

	@ApiModelProperty(value = "资源的原始地址")
	@JsonProperty("resourceOriginAddress")
	public String getResourceOriginAddress() {
		return resourceOriginAddress;
	}

	public void setResourceOriginAddress(String resourceOriginAddress) {
		this.resourceOriginAddress = resourceOriginAddress;
	}

	/**
	 * 评论数
	 **/
	public Resource commentNum(Integer commentNum) {
		this.commentNum = commentNum;
		return this;
	}

	@ApiModelProperty(value = "评论数")
	@JsonProperty("commentNum")
	public Integer getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	/**
	 * 转发数
	 **/
	public Resource transmitNum(Integer transmitNum) {
		this.transmitNum = transmitNum;
		return this;
	}

	@ApiModelProperty(value = "转发数")
	@JsonProperty("transmitNum")
	public Integer getTransmitNum() {
		return transmitNum;
	}

	public void setTransmitNum(Integer transmitNum) {
		this.transmitNum = transmitNum;
	}

	/**
	 * 提交资源的地理坐标（经纬度）
	 **/
	public Resource locationCoordinate(String locationCoordinate) {
		this.locationCoordinate = locationCoordinate;
		return this;
	}

	@ApiModelProperty(value = "提交资源的地理坐标（经纬度）")
	@JsonProperty("locationCoordinate")
	public String getLocationCoordinate() {
		return locationCoordinate;
	}

	public void setLocationCoordinate(String locationCoordinate) {
		this.locationCoordinate = locationCoordinate;
	}

	/**
	 * 提交资源的地理位置名称
	 **/
	public Resource locationName(String locationName) {
		this.locationName = locationName;
		return this;
	}

	@ApiModelProperty(value = "提交资源的地理位置名称")
	@JsonProperty("locationName")
	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 * 资源图标地址
	 **/
	public Resource resourceIcon(String resourceIcon) {
		this.resourceIcon = resourceIcon;
		return this;
	}

	@ApiModelProperty(value = "资源图标地址")
	@JsonProperty("resourceIcon")
	public String getResourceIcon() {
		return resourceIcon;
	}

	public void setResourceIcon(String resourceIcon) {
		this.resourceIcon = resourceIcon;
	}

	/**
	 * 资源发布时间(1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss)。入库时不用填写
	 **/
	public Resource publishTime(String publishTime) {
		this.publishTime = publishTime;
		return this;
	}

	@ApiModelProperty(value = "资源发布时间(1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss)。入库时不用填写")
	@JsonProperty("publishTime")
	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	/**
	 * 资源创建时间(1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss)。入库时不用填写
	 **/
	public Resource createdTime(String createdTime) {
		this.createdTime = createdTime;
		return this;
	}

	@ApiModelProperty(value = "资源创建时间(1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss)。入库时不用填写")
	@JsonProperty("createdTime")
	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	/**
	* 是否下载附件(0:下载，1：不下载),默认是0
	**/
	public Resource isDownLoadAttachFile(Integer isDownLoadAttachFile) {
		this.isDownLoadAttachFile = isDownLoadAttachFile;
		return this;
	}
	
	@ApiModelProperty(value = "是否下载附件(0:下载，1：不下载),默认是0")
	@JsonProperty("isDownLoadAttachFile")
	public Integer getIsDownLoadAttachFile() {
		return isDownLoadAttachFile;
	}
	
	public void setIsDownLoadAttachFile(Integer isDownLoadAttachFile) {
		this.isDownLoadAttachFile = isDownLoadAttachFile;
	}
	
	/**
	 * 上传回调通知接口接口地址
	 **/
	public Resource callBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
		return this;
	}

	  
	  @ApiModelProperty(value = "上传回调通知接口接口地址")
	  @JsonProperty("callBackUrl")
	  public String getCallBackUrl() {
	    return callBackUrl;
	  }
	  public void setCallBackUrl(String callBackUrl) {
	    this.callBackUrl = callBackUrl;
	  }
	
	  
	/**
	 * 附件的存储类型(0:流媒体，1：UNC，2：FTP)
	 **/
	public Resource attachFilePathType(Integer attachFilePathType) {
		this.attachFilePathType = attachFilePathType;
		return this;
	}

	@ApiModelProperty(value = "附件的存储类型(0:流媒体，1：UNC，2：FTP)")
	@JsonProperty("attachFilePathType")
	public Integer getAttachFilePathType() {
		return attachFilePathType;
	}

	public void setAttachFilePathType(Integer attachFilePathType) {
		this.attachFilePathType = attachFilePathType;
	}

	/**
	 * 附件信息列表
	 **/
	public Resource attachFiles(List<AttachFile> attachFiles) {
		this.attachFiles = attachFiles;
		return this;
	}

	@ApiModelProperty(value = "附件信息列表")
	@JsonProperty("attachFiles")
	public List<AttachFile> getAttachFiles() {
		return attachFiles;
	}

	public void setAttachFiles(List<AttachFile> attachFiles) {
		this.attachFiles = attachFiles;
	}

	/**
	 * 扩展属性列表（后续扩展使用，现在未实现）
	 **/
	public Resource extendAttrs(List<ExtendAttr> extendAttrs) {
		this.extendAttrs = extendAttrs;
		return this;
	}

	@ApiModelProperty(value = "扩展属性列表（后续扩展使用，现在未实现）")
	@JsonProperty("extendAttrs")
	public List<ExtendAttr> getExtendAttrs() {
		return extendAttrs;
	}

	public void setExtendAttrs(List<ExtendAttr> extendAttrs) {
		this.extendAttrs = extendAttrs;
	}
	
	/**
	 * 使用历史
	 **/
	public Resource useHistories(List<UseHistories> useHistories) {
		this.useHistories = useHistories;
		return this;
	}

	@ApiModelProperty(value = "扩展属性列表（后续扩展使用，现在未实现）")
	@JsonProperty("useHistories")
	public List<UseHistories> getUseHistories() {
		return useHistories;
	}

	public void setUseHistories(List<UseHistories> useHistories) {
		this.useHistories = useHistories;
	}

	public Resource weiboId(String weiboId) {
		this.weiboId = weiboId;
		return this;
	}

	@ApiModelProperty(value = "为微博互动入库，保存该条微博所创建的字段，对外服务不需要使用该字段")
	@JsonProperty("weiboId")
	public String getWeiboId() {
		return weiboId;
	}

	public void setWeiboId(String weiboId) {
		this.weiboId = weiboId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Resource resource = (Resource) o;
		return Objects.equals(resourceId, resource.resourceId) && Objects.equals(title, resource.title)
				&& Objects.equals(content, resource.content) && Objects.equals(author, resource.author)
				&& Objects.equals(authorContact, resource.authorContact)
				&& Objects.equals(submitUserId, resource.submitUserId)
				&& Objects.equals(submitUserName, resource.submitUserName)
				&& Objects.equals(sourceSystemId, resource.sourceSystemId)
				&& Objects.equals(sourceSystemName, resource.sourceSystemName)
				&& Objects.equals(resourceOriginType, resource.resourceOriginType)
				&& Objects.equals(resourceOriginTypeName, resource.resourceOriginTypeName)
				&& Objects.equals(visibleRange, resource.visibleRange)
				&& Objects.equals(visibleRangeType, resource.visibleRangeType)
				&& Objects.equals(classId, resource.classId)
				&& Objects.equals(parentResourceId, resource.parentResourceId)
				&& Objects.equals(resourceOriginAddress, resource.resourceOriginAddress)
				&& Objects.equals(commentNum, resource.commentNum) && Objects.equals(transmitNum, resource.transmitNum)
				&& Objects.equals(locationCoordinate, resource.locationCoordinate)
				&& Objects.equals(locationName, resource.locationName)
				&& Objects.equals(resourceIcon, resource.resourceIcon)
				&& Objects.equals(publishTime, resource.publishTime)
				&& Objects.equals(createdTime, resource.createdTime)
				&& Objects.equals(isDownLoadAttachFile, resource.isDownLoadAttachFile)
				&& Objects.equals(attachFilePathType, resource.attachFilePathType)
				&& Objects.equals(attachFiles, resource.attachFiles)
				&& Objects.equals(extendAttrs, resource.extendAttrs)
				&& Objects.equals(useHistories, resource.useHistories)
				&& Objects.equals(callBackUrl, resource.callBackUrl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceId, title, content, author, authorContact, submitUserId, submitUserName,
				sourceSystemId, sourceSystemName, resourceOriginType, resourceOriginTypeName, visibleRange,
				visibleRangeType, classId, parentResourceId, resourceOriginAddress, commentNum, transmitNum,
				locationCoordinate, locationName, resourceIcon, publishTime, createdTime, isDownLoadAttachFile,attachFilePathType,
				attachFiles, extendAttrs,useHistories,callBackUrl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Resource {\n");

		sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
		sb.append("    authorContact: ").append(toIndentedString(authorContact)).append("\n");
		sb.append("    submitUserId: ").append(toIndentedString(submitUserId)).append("\n");
		sb.append("    submitUserName: ").append(toIndentedString(submitUserName)).append("\n");
		sb.append("    sourceSystemId: ").append(toIndentedString(sourceSystemId)).append("\n");
		sb.append("    sourceSystemName: ").append(toIndentedString(sourceSystemName)).append("\n");
		sb.append("    resourceOriginType: ").append(toIndentedString(resourceOriginType)).append("\n");
		sb.append("    resourceOriginTypeName: ").append(toIndentedString(resourceOriginTypeName)).append("\n");
		sb.append("    visibleRange: ").append(toIndentedString(visibleRange)).append("\n");
		sb.append("    visibleRangeType: ").append(toIndentedString(visibleRangeType)).append("\n");
		sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
		sb.append("    parentResourceId: ").append(toIndentedString(parentResourceId)).append("\n");
		sb.append("    resourceOriginAddress: ").append(toIndentedString(resourceOriginAddress)).append("\n");
		sb.append("    commentNum: ").append(toIndentedString(commentNum)).append("\n");
		sb.append("    transmitNum: ").append(toIndentedString(transmitNum)).append("\n");
		sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
		sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
		sb.append("    resourceIcon: ").append(toIndentedString(resourceIcon)).append("\n");
		sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
		sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
		sb.append("    isDownLoadAttachFile: ").append(toIndentedString(isDownLoadAttachFile)).append("\n");
		sb.append("    attachFilePathType: ").append(toIndentedString(attachFilePathType)).append("\n");
		sb.append("    attachFiles: ").append(toIndentedString(attachFiles)).append("\n");
		sb.append("    extendAttrs: ").append(toIndentedString(extendAttrs)).append("\n");
		sb.append("    useHistories: ").append(toIndentedString(useHistories)).append("\n");
		sb.append("    callBackUrl: ").append(toIndentedString(callBackUrl)).append("\n");
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
