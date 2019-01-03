package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T08:02:24.338Z")
public class Clue   {
  
  private String resourceId = null;
  private String title = null;
  private String content = null;
  private String author = null;
  private String resourceOriginTypeName = null;
  private String resourceOriginAddress = null;
  private String resourceIcon = null;
  private String createdTime = null;
  private String attachSubType = null;
  private String attachSubTypeName = null;
  private Integer fileState = null;
  private String attachFileOne = null;
  private List<AttachFile> attachFiles = new ArrayList<AttachFile>();

  
  /**
   * 第一个附件的URL地址
   **/
  public Clue attachFileOne(String attachFileOne) {
    this.attachFileOne = attachFileOne;
    return this;
  }

  @ApiModelProperty(required = true, value = "第一个附件的URL地址")
  @JsonProperty("attachFileOne")
  public String getAttachFileOne() {
    return attachFileOne;
  }
  public void setAttachFileOne(String attachFileOne) {
    this.attachFileOne = attachFileOne;
  }
  
  /**
   * 资源的guid
   **/
  public Clue resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "资源的guid")
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * 资源的标题
   **/
  public Clue title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "资源的标题")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * 资源的内容
   **/
  public Clue content(String content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "资源的内容")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * 作者
   **/
  public Clue author(String author) {
    this.author = author;
    return this;
  }

  
  @ApiModelProperty(value = "作者")
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * 类型
   **/
  public Clue resourceOriginTypeName(String resourceOriginTypeName) {
    this.resourceOriginTypeName = resourceOriginTypeName;
    return this;
  }

  
  @ApiModelProperty(value = "类型")
  @JsonProperty("resourceOriginTypeName")
  public String getResourceOriginTypeName() {
    return resourceOriginTypeName;
  }
  public void setResourceOriginTypeName(String resourceOriginTypeName) {
    this.resourceOriginTypeName = resourceOriginTypeName;
  }

  /**
   * 源地址
   **/
  public Clue resourceOriginAddress(String resourceOriginAddress) {
    this.resourceOriginAddress = resourceOriginAddress;
    return this;
  }

  
  @ApiModelProperty(value = "源地址")
  @JsonProperty("resourceOriginAddress")
  public String getResourceOriginAddress() {
    return resourceOriginAddress;
  }
  public void setResourceOriginAddress(String resourceOriginAddress) {
    this.resourceOriginAddress = resourceOriginAddress;
  }

  /**
   * 头像
   **/
  public Clue resourceIcon(String resourceIcon) {
    this.resourceIcon = resourceIcon;
    return this;
  }

  
  @ApiModelProperty(value = "头像")
  @JsonProperty("resourceIcon")
  public String getResourceIcon() {
    return resourceIcon;
  }
  public void setResourceIcon(String resourceIcon) {
    this.resourceIcon = resourceIcon;
  }

  /**
   * 创建时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）
   **/
  public Clue createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(value = "创建时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）")
  @JsonProperty("createdTime")
  public String getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * 资源附件类型
   **/
  public Clue attachSubType(String attachSubType) {
    this.attachSubType = attachSubType;
    return this;
  }

  
  @ApiModelProperty(value = "资源附件类型")
  @JsonProperty("attachSubType")
  public String getAttachSubType() {
    return attachSubType;
  }
  public void setAttachSubType(String attachSubType) {
    this.attachSubType = attachSubType;
  }

  /**
   * 资源附件类型名称
   **/
  public Clue attachSubTypeName(String attachSubTypeName) {
    this.attachSubTypeName = attachSubTypeName;
    return this;
  }

  
  @ApiModelProperty(value = "资源附件类型名称")
  @JsonProperty("attachSubTypeName")
  public String getAttachSubTypeName() {
    return attachSubTypeName;
  }
  public void setAttachSubTypeName(String attachSubTypeName) {
    this.attachSubTypeName = attachSubTypeName;
  }

  /**
   * 资源状态 0:不存在 1：正在处理中 2：完成
   **/
  public Clue fileState(Integer fileState) {
    this.fileState = fileState;
    return this;
  }

  
  @ApiModelProperty(value = "资源状态 0:不存在 1：正在处理中 2：完成")
  @JsonProperty("fileState")
  public Integer getFileState() {
    return fileState;
  }
  public void setFileState(Integer fileState) {
    this.fileState = fileState;
  }
  
  /**
   * 附件
   **/
  public Clue attachFiles(List<AttachFile> attachFiles) {
    this.attachFiles = attachFiles;
    return this;
  }

  
  @ApiModelProperty(value = "附件")
  @JsonProperty("attachFiles")
  public List<AttachFile> getAttachFiles() {
    return attachFiles;
  }
  public void setAttachFiles(List<AttachFile> attachFiles) {
    this.attachFiles = attachFiles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clue clue = (Clue) o;
    return Objects.equals(resourceId, clue.resourceId) &&
        Objects.equals(title, clue.title) &&
        Objects.equals(content, clue.content) &&
        Objects.equals(author, clue.author) &&
        Objects.equals(resourceOriginTypeName, clue.resourceOriginTypeName) &&
        Objects.equals(resourceOriginAddress, clue.resourceOriginAddress) &&
        Objects.equals(resourceIcon, clue.resourceIcon) &&
        Objects.equals(createdTime, clue.createdTime) &&
        Objects.equals(attachSubType, clue.attachSubType) &&
        Objects.equals(attachSubTypeName, clue.attachSubTypeName) &&
        Objects.equals(attachFileOne, clue.attachFileOne) &&
        Objects.equals(attachFiles, clue.attachFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, title, content, author, resourceOriginTypeName, resourceOriginAddress, resourceIcon, createdTime, attachSubType, attachSubTypeName, attachFileOne,attachFiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clue {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    resourceOriginTypeName: ").append(toIndentedString(resourceOriginTypeName)).append("\n");
    sb.append("    resourceOriginAddress: ").append(toIndentedString(resourceOriginAddress)).append("\n");
    sb.append("    resourceIcon: ").append(toIndentedString(resourceIcon)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    attachSubType: ").append(toIndentedString(attachSubType)).append("\n");
    sb.append("    attachSubTypeName: ").append(toIndentedString(attachSubTypeName)).append("\n");
    sb.append("    fileState: ").append(toIndentedString(fileState)).append("\n");
    sb.append("    attachFileOne: ").append(toIndentedString(attachFileOne)).append("\n");
    sb.append("    attachFiles: ").append(toIndentedString(attachFiles)).append("\n");
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

