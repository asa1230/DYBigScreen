package com.dayang.newmedia.common.utils;

public class Constants {
	// ------------APP 接口--------------
	public static final Integer CRE_LOGIN = 7;    			// CRE登陆地址类型
	public static final Integer CRE_USER_LOAD = 9;			// CRE获取用户详情类型
	public static final Integer LOCAL_FTP_UPLOAD_URL = 22;	// 本地资源上传FTP地址
	public static final String CRE_FROM = "newsCommand";		// CRE为指挥调度提供的系统来源
	public static final String MESSAGESOURCEORTARGETID="zhihuidiaodu_bs";
	public static final Integer HJ_SERVER_URL_TYPE=12;		// 汇聚API接口地址
	public static final Integer CRE_SEARCH_URL_TYPE=6;		// CRE的查询地址
	public static final Integer CRE_FOLDER_ADD = 13;			// CRE的添加选题目录
	public static final Integer HJ_ADD_URL = 19;				// 汇聚的新增接口地址类型
	public static final Integer CRE_FOLDER_UPDATE_TYPE = 20;	// CRE更新选题目录类型
	public static final String HJ_DISTRIBUTE_CRE_ID="creserid";// 分发到CER的服务ID
	public static final String HJ_DISTRIBUET_CRE_EXTENDATTR = "DISTRIBUTE_DIRECTORY";
	public static final Integer CRE_FOLDER_DELETE = 18;		// CRE选题目录删除
	
	public static final Boolean NEED_DOG = false; // 是否启用加密狗
	public static final String FILE_DOWNLOAD_FAILURE = "文件下载失败";
	public static final Integer DEFAULT_START = 0;
	public static final int DEFAULT_LIMIT = 5;
	public static final String APPLICATION_TYPE_TEXT_JSON = "text/json;charset=utf-8";
	public static final String DEFAULT_CRE_USERID = "admin";
	public static final String DEFAULT_CRE_PASSWORD = "admin";
	public static final String DEFAULT_CRE_ORDERBY = "created desc";
	public static final String CRE_SEARCH_ID = "ID";
	public static final String BAOTIZIYUAN = "zhihuidiaodu_bs";
	public static final Object LOCAL_TYPE = "local";
	public static final String HUIJU_TYPE = "huiju";
	public static final String CRE_TYPE = "CRE";
	public static final Integer PAGESIZE = 5;
	public static final Integer MAX_PAGE = 999;
	public static final Integer SWICHSERVICE_LIFE = 2;
	public static final Integer SWICHSERVICE_SECRET = 3;
	public static final Integer SWICHSERVICE_BAOTI_ORDER = 7;  //报题：0=按照创建时间排序    1=更新时间排序
	public static final Integer SWICHSERVICE_XUANTI_ORDER = 10;  //选题：0=按照创建时间排序    1=更新时间排序
	public static final Integer SWICHSERVICE_RENWU_ORDER = 11;  //任务：0=按照创建时间排序    1=更新时间排序
	public static final Integer SWICHSERVICE_RADIO = 8; //是支持生成多报、选题   0=不支持，1=支持
	public static final Integer SWICHSERVICE_XIANSUO = 9;//是否可查看线索               0=不可以，1=可以
	public static final String DEFAULT_FOLDER_ID = "TOPIC_ROOT_FOLDERID";
	public static final String COLUMNZONGBIAN = "栏目责编";
	public static final String ZONGZHIHUI="总指挥";
	public static final int CRE_FOLDER_TYPE_USER = 10;
	public static final String CRE_FOLDER_ADMIN="Admin";
	public static final String CRE_FOLDER_ADVEDITOR="AdvEditor";
	public static final boolean CRE_RESOURCE_UPDATE = true;
	public static final Integer HJ_DISTRIBUET_URL_TYPE = 15;
	public static final Integer CRE_DISTRIBUET_URL_TYPE = 14;
	public static final Integer CRE_RESOURCE_ADD_UPLOAD_TYPE = 1;
	public static final String DEFAULT_MISSION_CUTTYPE = "renwu";
	public static final String HAVEADMIN = "haveAdmin";
	public static final String HAVEAUDITXUANTI = "haveAuditXuanti";
	public static final String NEWSCOMMAND_MESSAGE_ID = "DIRECTMANAGE";
	public static final Integer MESSAGE_URL = 25;
	public static final Integer SYNCHRONIZE = 1;
	
}
