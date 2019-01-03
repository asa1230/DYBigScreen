package com.dayang.newmedia.common.utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;

/**
 * 
 * @author ryan-OUYANG
 *
 */
public class JsonUtil {
	 /**
	 * 将指定对象转成JSON字符串，日期格式默认为'yyyy-MM-dd'
	 * @param o
	 * @return JSON
	 * @throws Exception
	 */
	 public static String jsonFromObject(Object o) throws Exception{
		String retStr="";
		if(null!=o){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor());
			StringBuffer jsonBuf = new StringBuffer();
			JSONObject jsonObj = JSONObject.fromObject(o,conf);
			jsonBuf.append(jsonObj.toString());
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 /**
	 * 将指定对象转成JSON字符串，日期串按照指定的日期格式转换
	 * @param o
	 * @param datePattern
	 * @return JSON
	 * @throws Exception
	 */
	 public static String jsonFromObject(Object o,String datePattern) throws Exception{
		String retStr="";
		if(null!=o){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor(datePattern));
			StringBuffer jsonBuf = new StringBuffer();
			JSONObject jsonObj = JSONObject.fromObject(o,conf);
			jsonBuf.append(jsonObj.toString());
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 
	 /**
	 * 将指定对象转成JSON字符串，日期串按照指定的日期格式转换，只转换指定的属性
	 * @param o
	 * @param datePattern
	 * @param propertySet 需要转换的属性集
	 * @return JSON
	 * @throws Exception
	 */
	 @SuppressWarnings("unchecked")
	public static String jsonFromObject(Object o,String datePattern,HashSet<String> propertySet) throws Exception{
		String retStr="";
		if(null!=o){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor(datePattern));
			StringBuffer jsonBuf = new StringBuffer();
			JSONObject jsonObjO = JSONObject.fromObject(o,conf);
			JSONObject jsonObj = JSONObject.fromObject(o,conf);
			Set<Object> keySet = jsonObjO.keySet();
			for(Object key:keySet){
				if(false == propertySet.contains(key))
					jsonObj.remove(key);
			}
			jsonBuf.append(jsonObj.toString());
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 
	/**
	 * 将指定集合转成JSON字符串，日期格式默认为'yyyy-MM-dd'
	 * @param list
	 * @return JSON 数组串
	 * @throws Exception
	 */
	 @SuppressWarnings("unchecked")
	public static String jsonArrayFromList(List list) throws Exception{
		String retStr="";
		if(null!=list){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor());
			StringBuffer jsonBuf = new StringBuffer();
			jsonBuf.append("[");
			for(int i=0;i<list.size();i++){
				if(i>0)
					jsonBuf.append(",");
				JSONObject jsonObj = JSONObject.fromObject(list.get(i),conf);
				jsonBuf.append(jsonObj.toString());
			}
			/*if(0==list.size())
				jsonBuf.append("{}");*/
			jsonBuf.append("]");
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 
	 /**
	 * 将指定集合转成JSON字符串，日期格式默认为'yyyy-MM-dd'，只转换指定的属性
	 * @param list
	 * @param propertySet 需要转换的属性集
	 * @return JSON 数组串
	 * @throws Exception
	 */
	 @SuppressWarnings("unchecked")
	public static String jsonArrayFromList(List list,HashSet<String> propertySet) throws Exception{
		String retStr="";
		if(null!=list){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor());
			StringBuffer jsonBuf = new StringBuffer();
			jsonBuf.append("[");
			for(int i=0;i<list.size();i++){
				if(i>0)
					jsonBuf.append(",");
				JSONObject jsonObjO = JSONObject.fromObject(list.get(i),conf);
				JSONObject jsonObj = JSONObject.fromObject(list.get(i),conf);
				Set<Object> keySet = jsonObjO.keySet();
				for(Object key:keySet){
					if(false == propertySet.contains(key))
						jsonObj.remove(key);
				}
				jsonBuf.append(jsonObj.toString());
			}
			/*if(0==list.size())
				jsonBuf.append("{}");*/
			jsonBuf.append("]");
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 
	 /**
	  * 将指定集合转成JSON字符串,日期串按照指定的日期格式转换
	  * @param list
	  * @param datePattern
	  * @return JSON 数组串
	  * @throws Exception
	  */
	 @SuppressWarnings("unchecked")
	public static String jsonArrayFromList(List list,String datePattern) throws Exception{
		String retStr="";
		if(null!=list){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor(datePattern));
			StringBuffer jsonBuf = new StringBuffer();
			jsonBuf.append("[");
			for(int i=0;i<list.size();i++){
				if(i>0)
					jsonBuf.append(",");
				JSONObject jsonObj = JSONObject.fromObject(list.get(i),conf);
				jsonBuf.append(jsonObj.toString());
			}
			/*if(0==list.size())
				jsonBuf.append("{}");*/
			jsonBuf.append("]");
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 
	 /**
	  * 将指定集合转成JSON字符串,日期串按照指定的日期格式转换，只转换指定的属性
	  * @param list
	  * @param datePattern
	  * @param propertySet 需要转换的属性集
	  * @return JSON 数组串
	  * @throws Exception
	  */
	 @SuppressWarnings("unchecked")
	 public static String jsonArrayFromList(List list,String datePattern,HashSet<String> propertySet) throws Exception{
		String retStr="";
		if(null!=list){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor(datePattern));
			StringBuffer jsonBuf = new StringBuffer();
			jsonBuf.append("[");
			for(int i=0;i<list.size();i++){
				if(i>0)
					jsonBuf.append(",");
				JSONObject jsonObjO = JSONObject.fromObject(list.get(i),conf);
				JSONObject jsonObj = JSONObject.fromObject(list.get(i),conf);
				Set<Object> keySet = jsonObjO.keySet();
				for(Object key:keySet){
					if(false == propertySet.contains(key))
						jsonObj.remove(key);
				}
				jsonBuf.append(jsonObj.toString());
			}
			/*if(0==list.size())
				jsonBuf.append("{}");*/
			jsonBuf.append("]");
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 
	 /**
	  * 将指定数组转成JSON字符串，日期格式默认为'yyyy-MM-dd'
	  * @param array
	  * @return JSON 数组串
	  * @throws Exception
	  */
	 public static String jsonArrayFromArray(Object array) throws Exception{
		String retStr="";
		if(null!=array && true == array.getClass().isArray()){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor());
			StringBuffer jsonBuf = new StringBuffer();
			jsonBuf.append("[");
			int length = Array.getLength(array);
			for(int i=0;i<length;i++){
				if(i>0)
					jsonBuf.append(",");
				JSONObject jsonObj = JSONObject.fromObject(Array.get(array, i),conf);
				jsonBuf.append(jsonObj.toString());
			}
			/*if(0==length)
				jsonBuf.append("{}");*/
			jsonBuf.append("]");
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 
	 /**
	  * 将指定数组转成JSON字符串，日期格式默认为'yyyy-MM-dd'，只转换指定的属性
	  * @param array
	  * @param propertySet 需要转换的属性集
	  * @return JSON 数组串
	  * @throws Exception
	  */
	 @SuppressWarnings("unchecked")
	public static String jsonArrayFromArray(Object array,HashSet<String> propertySet) throws Exception{
		String retStr="";
		if(null!=array && true == array.getClass().isArray()){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor());
			StringBuffer jsonBuf = new StringBuffer();
			jsonBuf.append("[");
			int length = Array.getLength(array);
			for(int i=0;i<length;i++){
				if(i>0)
					jsonBuf.append(",");
				JSONObject jsonObjO = JSONObject.fromObject(Array.get(array, i),conf);
				JSONObject jsonObj = JSONObject.fromObject(Array.get(array, i),conf);
				Set<Object> keySet = jsonObjO.keySet();
				for(Object key:keySet){
					if(false == propertySet.contains(key))
						jsonObj.remove(key);
				}
				jsonBuf.append(jsonObj.toString());
			}
			/*if(0==length)
				jsonBuf.append("{}");*/
			jsonBuf.append("]");
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 
	 /**
	  * 将指定数组转成JSON字符串，日期串按照指定的日期格式转换
	  * @param array
	  * @param datePattern
	  * @return
	  * @throws Exception
	  */
	 public static String jsonArrayFromArray(Object array,String datePattern) throws Exception{
		String retStr="";
		if(null!=array && true == array.getClass().isArray()){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor(datePattern));
			StringBuffer jsonBuf = new StringBuffer();
			jsonBuf.append("[");
			int length = Array.getLength(array);
			for(int i=0;i<length;i++){
				if(i>0)
					jsonBuf.append(",");
				JSONObject jsonObj = JSONObject.fromObject(Array.get(array, i),conf);
				jsonBuf.append(jsonObj.toString());
			}
			/*if(0==length)
				jsonBuf.append("{}");*/
			jsonBuf.append("]");
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 
	 /**
	  * 将指定数组转成JSON字符串，日期串按照指定的日期格式转换，只转换指定的属性
	  * @param array
	  * @param datePattern
	  * @param propertySet 需要转换的属性集
	  * @return
	  * @throws Exception
	  */
	 @SuppressWarnings("unchecked")
	public static String jsonArrayFromArray(Object array,String datePattern,HashSet<String> propertySet) throws Exception{
		String retStr="";
		if(null!=array && true == array.getClass().isArray()){
			JsonConfig conf = new JsonConfig();
			conf.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor(datePattern));
			StringBuffer jsonBuf = new StringBuffer();
			jsonBuf.append("[");
			int length = Array.getLength(array);
			for(int i=0;i<length;i++){
				if(i>0)
					jsonBuf.append(",");
				JSONObject jsonObjO = JSONObject.fromObject(Array.get(array, i),conf);
				JSONObject jsonObj = JSONObject.fromObject(Array.get(array, i),conf);
				Set<Object> keySet = jsonObjO.keySet();
				for(Object key:keySet){
					if(false == propertySet.contains(key))
						jsonObj.remove(key);
				}
				jsonBuf.append(jsonObj.toString());
			}
			/*if(0==length)
				jsonBuf.append("{}");*/
			jsonBuf.append("]");
			retStr = jsonBuf.toString();
		}
		return retStr;
	 }
	 
	 /**
	  * 将JSON 数组转换成Bean，并存到List中返回。
	  * @param elementClass
	  * @param jsonArray
	  * @return JavaBean List
	  * @throws Exception
	  */
	public static <T> List<T> jsonArrayToList(Class<T> elementClass,String jsonArray) throws Exception{
		List<T> returnList = null;
		if(false == StringUtils.isEmpty(jsonArray)){
			returnList = new ArrayList<T>();
			JSONArray objectArray = JSONArray.fromObject(jsonArray);
			JsonConfig jsonConfig = new JsonConfig();  
			jsonConfig.setRootClass( elementClass);  
			for(int i=0;null!=objectArray && i<objectArray.size();i++){
				Object obj = JSONSerializer.toJava(objectArray.getJSONObject(i), jsonConfig ); 
				returnList.add(elementClass.cast(obj));
			}
		}
		return returnList;
	 }
}
