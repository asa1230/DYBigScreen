package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.io.Serializable;

/**
 * 
 * @author Mars
 *资源文件列表
 */

public class ExtendAttributes implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean containLink ;
    private int dataType;
    private String id;
    private String name;
    private boolean notShow;
    private int style;
    private String value;
	public boolean isContainLink() {
		return containLink;
	}
	public void setContainLink(boolean containLink) {
		this.containLink = containLink;
	}
	public int getDataType() {
		return dataType;
	}
	public void setDataType(int dataType) {
		this.dataType = dataType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isNotShow() {
		return notShow;
	}
	public void setNotShow(boolean notShow) {
		this.notShow = notShow;
	}
	public int getStyle() {
		return style;
	}
	public void setStyle(int style) {
		this.style = style;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
    
}
