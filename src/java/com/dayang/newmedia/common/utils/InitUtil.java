package com.dayang.newmedia.common.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class InitUtil {
	static Log log = LogFactory.getLog(InitUtil.class);
	//文件下载目录（本地存储目录）
	public static String file_down_dir;
	//源系统ID
	public static String source_sys_id;
	
	/**参数标记*/
	public static String PARAMETER_SOURCE_XML_FILE = "sourceXmlFile";
	public static String PARAMETER_SOURCE_PATH = "sourcePath";
	public static String PARAMETER_TARGET_PATH = "targetPath";
	public static String PARAMETER_MESSAGE = "message";
}
