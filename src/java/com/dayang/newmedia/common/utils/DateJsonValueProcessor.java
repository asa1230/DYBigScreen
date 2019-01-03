/**
 * 
 */
package com.dayang.newmedia.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**
 * 
 * @author TianQF
 * @version 2011-5-26下午04:11:01
 * @see
 * @since
 */
public class DateJsonValueProcessor implements JsonValueProcessor {
	private String format = "yyyy-MM-dd HH:mm:ss";

	public DateJsonValueProcessor() {
	}

	public DateJsonValueProcessor(String format) {
		this.format = format;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sf.json.processors.JsonValueProcessor#processObjectValue(java.lang
	 * .String, java.lang.Object, net.sf.json.JsonConfig)
	 */
	public Object processObjectValue(String arg0, Object value, JsonConfig jsonConfig) {
		if (value instanceof Date) {
			SimpleDateFormat sf = new SimpleDateFormat(format);
			Date date = (Date) value;
			return sf.format(date);
		}
		return value!=null?value.toString():"";
	}

	public Object processArrayValue(Object value, JsonConfig jsonConfig) {
		String[] obj = {};
		if (value instanceof Date[]) {
			SimpleDateFormat sf = new SimpleDateFormat(format);
			Date[] dates = (Date[]) value;
			obj = new String[dates.length];
			for (int i = 0; i < dates.length; i++) {
				obj[i] = sf.format(dates[i]);
			}
		}
		return obj;

	}
}