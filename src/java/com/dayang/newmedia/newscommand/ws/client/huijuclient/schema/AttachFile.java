package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-03-16T12:06:24.335Z")
public class AttachFile   {
  
  private String filePath = null;
  private Integer fileType = null;
  private String thumbnailPath = null;

  
  /**
   * 文件路径（带文件名的全路径）
   **/
  public AttachFile filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "文件路径（带文件名的全路径）")
  @JsonProperty("filePath")
  public String getFilePath() {
    return filePath;
  }
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  
  /**
   * 文件的类型(1=视频  2=音频  4=图片 8=文档 128=其他)
   **/
  public AttachFile fileType(Integer fileType) {
    this.fileType = fileType;
    return this;
  }

  
  @ApiModelProperty(value = "文件的类型(1=视频  2=音频  4=图片 8=文档 128=其他)")
  @JsonProperty("fileType")
  public Integer getFileType() {
    return fileType;
  }
  public void setFileType(Integer fileType) {
    this.fileType = fileType;
  }

  
  /**
   * 缩略图文件路径
   **/
  public AttachFile thumbnailPath(String thumbnailPath) {
    this.thumbnailPath = thumbnailPath;
    return this;
  }

  
  @ApiModelProperty(value = "缩略图文件路径")
  @JsonProperty("thumbnailPath")
  public String getThumbnailPath() {
    return thumbnailPath;
  }
  public void setThumbnailPath(String thumbnailPath) {
    this.thumbnailPath = thumbnailPath;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachFile attachFile = (AttachFile) o;
    return Objects.equals(filePath, attachFile.filePath) &&
        Objects.equals(fileType, attachFile.fileType) &&
        Objects.equals(thumbnailPath, attachFile.thumbnailPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, fileType, thumbnailPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachFile {\n");
    
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    thumbnailPath: ").append(toIndentedString(thumbnailPath)).append("\n");
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

