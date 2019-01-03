package com.dayang.newmedia.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 把java字段转换成JDBC类型字段工具类
 * 把java对象字段（驼峰标识）改成数据能识别的字段（下划线分隔）
 * @author liubiaoxin
 *
 */
public class ConvertClumnUtil {

	/**
	 * 把java字段转换成JDBC类型字段:
	 * 		把java对象字段（驼峰标识）改成数据能识别的字段（下划线分隔）
	 * @author liubiaoxin
	 * @param sortField  排序字段
	 * @return
	 */
	public static String convertClumn_JAVA2JDBC(String sortField) {
		//获取最后一个.号之后的字符串
		if(sortField.contains(".")){
			sortField = sortField.substring(sortField.lastIndexOf(".")+1);
		}
		//正则提取字符串中的大写字母
		Pattern p = Pattern.compile("([A-Z]+)");
        Matcher m = p.matcher(sortField);
        List<String>  replaceList  = new ArrayList<String>();
        while(m.find()){
            String findStr = m.group(1);
            //去重处理
            if(!replaceList.contains(findStr)){
            	replaceList.add(findStr);
            }
        }
        
        //替换
        for (String str : replaceList) {
        	 sortField = sortField.replaceAll(str, "_"+str);
		}
        
        //去掉第一个下划线
        if(sortField.startsWith("_")){
        	sortField = sortField.substring(1);
        }
        return sortField.toUpperCase();
	}
	
	public static void main(String[] args) {
		String convertClumn_JAVA2JDBC = convertClumn_JAVA2JDBC("attachDistriDuteStyle");
		System.out.println(convertClumn_JAVA2JDBC);
	}
}
