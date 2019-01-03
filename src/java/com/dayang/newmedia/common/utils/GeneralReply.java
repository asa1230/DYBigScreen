package com.dayang.newmedia.common.utils;


/**
 * 统一回复类定义
* @author LH 
* @version 2011-5-23
*
 */
public class GeneralReply {

	/**
	 * 服务是否异常
	 */
	private boolean status =false;
	/**
	 * 异常信息或其他信息
	 */
	private String msg = "";
	/**
	 * 方法返回结果
	 */
	private Object data =null;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}	
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
	public static GeneralReply Exception(String msg)
	{
		GeneralReply reply=new GeneralReply();
		reply.setStatus(false);
		reply.setMsg(msg);
		return reply;
	}
	
	public static GeneralReply Normal(boolean result)
	{
		GeneralReply reply=new GeneralReply();
		reply.setStatus(result);
		return reply;
	}	
	
	public static GeneralReply Normal(boolean result,Object data)
	{
		GeneralReply reply=new GeneralReply();
		reply.setStatus(result);
		reply.setData(data);		
		return reply;
	}
	
	public static GeneralReply Normal(boolean result,Object data,String msg)
	{
		GeneralReply reply=new GeneralReply();
		reply.setStatus(result);
		reply.setData(data);
		reply.setMsg(msg);
		return reply;
	}	
	
	public static GeneralReply Normal(boolean result,String msg)
	{
		GeneralReply reply=new GeneralReply();
		reply.setStatus(result);
		reply.setMsg(msg);
		return reply;
	}	
	
	public GeneralReply() {
		
	}
	
}
