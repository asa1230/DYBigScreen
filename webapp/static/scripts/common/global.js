/**
 * 全局类，用于存储常用方法和
 * 全局变量
 */
;
dp.global = (function($, window, document) {
	return {
		/** 版本号 */
		version : "V2.0.0_Build20180201",
		/** 版本更新时间 */
		updatetime : "2018-02-01",
		/** ip或域名，如 100.0.0.17 */
		host : "127.0.0.1",
		/** 端口号，如 8080 */
		port : "8080",
		/** 应用名，如 dybigscreen */
		appName : "dybigscreen",
		/** 应用根路径,为空则表示是单体应用，默认获取contextPath路径,不为空则是配置路径*/
		appPath : "",
		/** portal服务地址 */
		portalPath : "http://fast.dayang.com/dyportalserver/",
//		portalPath : "http://dayang.fast.com:8087/dyportalserver/",
//		portalPath : "http://100.0.0.61:8888/dyportalserver/",
		/** 租户ID */
		tenantId : "dayang.com",
		/** 默认用户ID */
		userId : "8883",
		/** 资源库后端服务参数CODE */
		CFB_SERVER : "PUB_CFB_SERVER",
		/** 选题后台服务地址 **/
		TOPIC_SERVER : "PUB_NC_SERVER",
		/** 稿件后端服务参数CODE */
		CMEDIT_SERVER : "PUB_CMEDIT_SERVER",
		fileTypeColor : [ '#3eb1f4', '#ff4268', '#f7a825', '#7e54c4',
			  				'#06bd87', '#367eac', '#367eac', '#0000FF', '#0000FF',
			  				'#C0C0C0' ],
		/** 折线图饼图默认刷新时间 */
	    cfbRefreshTime : 10*60*6000,//10分钟
		
		
		init : function() {
			this.initAppPath();
			this.initUserInfo();
		},
		initAppPath : function() {
			var pathName = document.location.pathname;
			if (!dp.util.isNotEmpty(this.appPath)) {
				var appPath = window.sessionStorage.getItem("appPath");
				if (dp.util.isNotEmpty(appPath)) {
					this.appPath = appPath;
				} else {
					this.appPath = dp.util.getContextPath(pathName) + "/";
					window.sessionStorage.setItem("appPath", this.appPath);
				}
			}
		},
		/**
		 * 将用户租户信息放入缓存对象
		 * 
		 * @returns
		 */
		initUserInfo : function() {
			var userInfo = {};
			userInfo.tenantId = this.tenantId;
			userInfo.userId = this.userId;
            var userInfoItem = window.sessionStorage.setItem("userInfo",JSON.stringify(userInfo));
		},
		/**
		 * 根据参数code从配置服务获取参数值
		 * 
		 * @param parameterCode 参数code 必填
		 * @param tenantId 租户ID 必填
		 * @returns
		 */
		getParamterByCode : function(parameterCode, tenantId) {
			var parameterValue = "";
			$.ajax({
				type : 'POST',
				async : false,
				url : dp.global.portalPath
						+ "ParameterController/getParameter",
				beforeSend : function(XHR) {
					XHR.setRequestHeader("tenantId", tenantId);
				},
				data : {
					parameterCode : parameterCode
				},
				success : function(data) {
					if (data.status == true || data.status == "true") {
						parameterValue = data.data[0].parameterValue;
					} else {
						alert(data.msg);
					}
				}
			});
			return parameterValue;
		},
		/**
		 * 根据参数code从配置服务获取参数值
		 * 
		 * @param code 枚举值code 必填
		 * @param appGuid 应用ID 非必填
		 * @param tenantId 租户ID 必填
		 * @returns
		 */
		getEnumerated : function(code,appGuid,tenantId) {
			var enumData = "";
			$.ajax({
				type : 'POST',
				async : false,
				url : dp.global.portalPath
						+ "EnumeratedController/getEnumerated",
				beforeSend : function(XHR) {
					XHR.setRequestHeader("tenantId", tenantId);
				},
				data : {
					enumeratedType : code,
					appGuid : appGuid
				},
				success : function(data) {
					if (data.status == true || data.status == "true") {
						enumData = data.data;
					} else {
						alert(data.msg);
					}
				}
			});
			return enumData;
		},
		
	};
})(jQuery, window, document);
//调用初始化方法
$(dp.global.init());