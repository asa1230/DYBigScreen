package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-28T05:21:47.936Z")
public class LoginResponse   {
  
  private CommonResponse commonResponse = null;
  private String userId = null;
  private String userName = null;
  private String iconUrl = null;
  private List<String> roleItemFlag = new ArrayList<String>();
  private String storageURL = null;
  private String tel = null;
  private String mail = null;
  private List<ColumnInfo> columns = new ArrayList<ColumnInfo>();

  /**
   * 通用返回
   **/
  public LoginResponse commonResponse(CommonResponse commonResponse) {
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
   * 用户ID
   **/
  public LoginResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "用户ID")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * 用户姓名
   **/
  public LoginResponse userName(String userName) {
    this.userName = userName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "用户姓名")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * 用户头像
   **/
  public LoginResponse iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  
  @ApiModelProperty(value = "用户头像")
  @JsonProperty("iconUrl")
  public String getIconUrl() {
    return iconUrl;
  }
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  /**
   * 资源信息列表
   **/
  public LoginResponse roleItemFlag(List<String> roleItemFlag) {
    this.roleItemFlag = roleItemFlag;
    return this;
  }

  
  @ApiModelProperty(value = "资源信息列表")
  @JsonProperty("roleItemFlag")
  public List<String> getRoleItemFlag() {
    return roleItemFlag;
  }
  public void setRoleItemFlag(List<String> roleItemFlag) {
    this.roleItemFlag = roleItemFlag;
  }

  /**
   * 本地资源上传FTP地址
   **/
  public LoginResponse storageURL(String storageURL) {
    this.storageURL = storageURL;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "本地资源上传FTP地址")
  @JsonProperty("storageURL")
  public String getStorageURL() {
    return storageURL;
  }
  public void setStorageURL(String storageURL) {
    this.storageURL = storageURL;
  }

  /**
   * 电话
   **/
  public LoginResponse tel(String tel) {
    this.tel = tel;
    return this;
  }

  
  @ApiModelProperty(value = "电话")
  @JsonProperty("tel")
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }

  /**
   * 邮箱
   **/
  public LoginResponse mail(String mail) {
    this.mail = mail;
    return this;
  }

  
  @ApiModelProperty(value = "邮箱")
  @JsonProperty("mail")
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  /**
   **/
  public LoginResponse columns(List<ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("columns")
  public List<ColumnInfo> getColumns() {
    return columns;
  }
  public void setColumns(List<ColumnInfo> columns) {
    this.columns = columns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginResponse loginResponse = (LoginResponse) o;
    return Objects.equals(commonResponse, loginResponse.commonResponse) &&
        Objects.equals(userId, loginResponse.userId) &&
        Objects.equals(userName, loginResponse.userName) &&
        Objects.equals(iconUrl, loginResponse.iconUrl) &&
        Objects.equals(roleItemFlag, loginResponse.roleItemFlag) &&
        Objects.equals(storageURL, loginResponse.storageURL) &&
        Objects.equals(tel, loginResponse.tel) &&
        Objects.equals(mail, loginResponse.mail) &&
        Objects.equals(columns, loginResponse.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, userId, userName, iconUrl, roleItemFlag, storageURL, tel, mail, columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    roleItemFlag: ").append(toIndentedString(roleItemFlag)).append("\n");
    sb.append("    storageURL: ").append(toIndentedString(storageURL)).append("\n");
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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


