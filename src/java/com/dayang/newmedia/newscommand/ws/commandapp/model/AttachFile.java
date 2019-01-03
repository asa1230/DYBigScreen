package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class AttachFile   {
  
  private String filePath = null;
  private Integer fileType = null;

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
        Objects.equals(fileType, attachFile.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, fileType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachFile {\n");
    
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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

