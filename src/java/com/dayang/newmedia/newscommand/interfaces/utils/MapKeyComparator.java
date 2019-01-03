package com.dayang.newmedia.newscommand.interfaces.utils;

import java.util.Comparator;
/*
 * 比较器 调用道顺接口是 产生sign用
 */
public class MapKeyComparator implements Comparator<String>{  
    public int compare(String str1, String str2) {  
        return str1.compareTo(str2);  
    }  
}  