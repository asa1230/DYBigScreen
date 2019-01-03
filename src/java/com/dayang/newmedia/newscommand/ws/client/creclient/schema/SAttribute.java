package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

public class SAttribute {
	public SAttribute(String strName, String enumType, String value) {
		super();
		this.strName = strName;
		this.enumType = enumType;
		this.value = value;
	}

	public SAttribute() {
	}

	private String strName;
	private String enumType;
	private String value;

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getEnumType() {
		return enumType;
	}

	public void setEnumType(String enumType) {
		this.enumType = enumType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
