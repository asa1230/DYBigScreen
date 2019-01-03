package com.dayang.newmedia.common.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;


public class MyConfigReader {	
   
	
	/**
	 * 直接读取confog/param.properties文件
	 * @return
	 */
	public static MyConfigReader getParam() {
		return new MyConfigReader("extraconfig.properties");
	}

	
	public static MyConfigReader get(String nameInConfigFolder) {
		return new MyConfigReader(nameInConfigFolder);
	}
	
	private String     configfile = "";
	private Properties properties = null;
	
	public MyConfigReader(String fileClassPath) {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream(fileClassPath);		
		properties = new Properties();
		try {			
			configfile = fileClassPath;
			properties.load(is);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		System.out.println();
	}
	
	public boolean saveVal(String key,String value) {
		
		try {			
			properties.setProperty(key, value);			
			
		}catch (ClassCastException e)	{
			e.printStackTrace();
			return false;
		}catch (NullPointerException e)	{
			e.printStackTrace();
			return false;
		}		
		return true;
	}
	
	public boolean saveValtoFile(String key,String value)
	{
		try {			
			properties.setProperty(key, value);
			
			URL classpath = this.getClass().getClassLoader().getResource("");
			String strPath = classpath.getPath();			
			String saveconfigfile =  strPath + configfile;
			FileOutputStream os = new FileOutputStream(saveconfigfile, false);			
			properties.store(os, "");
			os.flush();
			os.close();
			
		}catch (IOException e) {
			e.printStackTrace();
			return false;
		}catch (ClassCastException e)	{
			e.printStackTrace();
			return false;
		}catch (NullPointerException e)	{
			e.printStackTrace();
			return false;
		}		
		return true;
	}
	
	public String val(String key) {
		if(properties.get(key) == null) {
			return null;
		}
		
		String stringGet = properties.get(key).toString();		
		return stringGet;
	}
	
	public Integer intVal(String key) {
		if(properties.get(key) == null) {
			return null;
		}
		
		String val = properties.get(key).toString();
		return Integer.parseInt(val);
	}
	
	public Long longVal(String key) {
		if(properties.get(key) == null) {
			return null;
		}
		
		String val = properties.get(key).toString();
		return Long.parseLong(val);
	}
	
	public Boolean boolVal(String key) {
		if(properties.get(key) == null) {
			return false;
		}
		
		String val = properties.get(key).toString();
		return Boolean.parseBoolean(val);
	}

}
