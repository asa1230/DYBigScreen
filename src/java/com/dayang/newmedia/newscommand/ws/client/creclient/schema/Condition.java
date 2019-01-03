package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

public class Condition {
	
	private String id;
	private String value;
	private String operator;
	private String dataType;
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	public void setValue(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	
}
