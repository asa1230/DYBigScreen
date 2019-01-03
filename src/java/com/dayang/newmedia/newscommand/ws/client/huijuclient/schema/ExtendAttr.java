package com.dayang.newmedia.newscommand.ws.client.huijuclient.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-21T08:26:22.082Z")
public class ExtendAttr   {
  
  private String name = null;
  private String value = null;
  private String desc = null;

  
  /**
   * 扩展属性名称
   **/
  
  @ApiModelProperty(required = true, value = "扩展属性名称")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 扩展属性值
   **/
  
  @ApiModelProperty(required = true, value = "扩展属性值")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * 扩展属性描述
   **/
  
  @ApiModelProperty(value = "扩展属性描述")
  @JsonProperty("desc")
  public String getDesc() {
    return desc;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendAttr extendAttr = (ExtendAttr) o;
    return Objects.equals(name, extendAttr.name) &&
        Objects.equals(value, extendAttr.value) &&
        Objects.equals(desc, extendAttr.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, desc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendAttr {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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

