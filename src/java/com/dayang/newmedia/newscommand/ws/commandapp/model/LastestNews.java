package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class LastestNews   {
  
  private String newsGuid = null;
  private String taskGuid = null;
  private String taskTitle = null;
  private String handerName = null;
  private String author = null;
  private String resourceIcon = null;
  private String createdTime = null;

  /**
   * 最新动态GUID
   **/
  public LastestNews newsGuid(String newsGuid) {
    this.newsGuid = newsGuid;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "最新动态GUID")
  @JsonProperty("newsGuid")
  public String getNewsGuid() {
    return newsGuid;
  }
  public void setNewsGuid(String newsGuid) {
    this.newsGuid = newsGuid;
  }

  /**
   * 关联的任务GUID
   **/
  public LastestNews taskGuid(String taskGuid) {
    this.taskGuid = taskGuid;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "关联的任务GUID")
  @JsonProperty("taskGuid")
  public String getTaskGuid() {
    return taskGuid;
  }
  public void setTaskGuid(String taskGuid) {
    this.taskGuid = taskGuid;
  }

  /**
   * 关联任务标题
   **/
  public LastestNews taskTitle(String taskTitle) {
    this.taskTitle = taskTitle;
    return this;
  }

  
  @ApiModelProperty(value = "关联任务标题")
  @JsonProperty("taskTitle")
  public String getTaskTitle() {
    return taskTitle;
  }
  public void setTaskTitle(String taskTitle) {
    this.taskTitle = taskTitle;
  }

  /**
   * 操作
   **/
  public LastestNews handerName(String handerName) {
    this.handerName = handerName;
    return this;
  }

  
  @ApiModelProperty(value = "操作")
  @JsonProperty("handerName")
  public String getHanderName() {
    return handerName;
  }
  public void setHanderName(String handerName) {
    this.handerName = handerName;
  }

  /**
   * 操作人
   **/
  public LastestNews author(String author) {
    this.author = author;
    return this;
  }

  
  @ApiModelProperty(value = "操作人")
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * 头像
   **/
  public LastestNews resourceIcon(String resourceIcon) {
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
  public LastestNews createdTime(String createdTime) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastestNews lastestNews = (LastestNews) o;
    return Objects.equals(newsGuid, lastestNews.newsGuid) &&
        Objects.equals(taskGuid, lastestNews.taskGuid) &&
        Objects.equals(taskTitle, lastestNews.taskTitle) &&
        Objects.equals(handerName, lastestNews.handerName) &&
        Objects.equals(author, lastestNews.author) &&
        Objects.equals(resourceIcon, lastestNews.resourceIcon) &&
        Objects.equals(createdTime, lastestNews.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newsGuid, taskGuid, taskTitle, handerName, author, resourceIcon, createdTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastestNews {\n");
    
    sb.append("    newsGuid: ").append(toIndentedString(newsGuid)).append("\n");
    sb.append("    taskGuid: ").append(toIndentedString(taskGuid)).append("\n");
    sb.append("    taskTitle: ").append(toIndentedString(taskTitle)).append("\n");
    sb.append("    handerName: ").append(toIndentedString(handerName)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    resourceIcon: ").append(toIndentedString(resourceIcon)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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

