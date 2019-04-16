dp.News = (function($, window, document) {
	var thisContext; // 当前上下文环境指针
	var manuscriptServer; // 资源库后台服务地址
	var intervalTime = 2000;// 滚动事件间隔 2S
	var intervalDataListTime = 10;// 刷新时间间隔定时器
	var pageSize = 5;
	var time = 1;

	var NewsClass = function() {
	};

	NewsClass.prototype = {
		// 构造函数
		constructor : NewsClass,
		init : function() {
			thisContext = this;
			thisContext.initViewStyle();
			thisContext.initData();
			thisContext.initEvent();
			// 定时刷新页面
			window.setInterval(function(){ 
				window.location.reload();
			}, 600000); 
		},
		/**
		 * 初始化页面视图
		 */
		initViewStyle : function() {

		},

		/**
		 * 初始化数据
		 */
		initData : function() {
			// 获取资源库后台服务地址
			//thisContext.initManuscriptServer();   //zhy mod  不需要了，现在从后台action取数据
			
			thisContext.initNewsList(pageSize * 2);
		},
		/**
		 * 初始化事件
		 */
		initEvent : function() {
			// 添加滚屏定时任务，两秒滚动一次
			setInterval(function() {
				thisContext.doscroll()
			}, intervalTime);
			
			setTimeout(function() {
				
				thisContext.initNewsList(pageSize * 2);  //还是需要的因为滚一条少一条
				
				setInterval(function() {
					thisContext.initNewsList(pageSize * 2);
				}, intervalTime * pageSize * 2);
			}, intervalTime * pageSize);
			
		},
		/**
		 * 获取资源库服务地址
		 */
		initManuscriptServer : function() {
			manuscriptServer = dp.global.getParamterByCode(
					dp.global.CMEDIT_SERVER, dp.global.tenantId);
			// manuscriptServer = "http://100.0.1.68:8080/DYCMEditExternal/";
			console.log(manuscriptServer);
		},
		/**
		 * 加载公共资源列表
		 */
		initNewsList : function(pageSize) {
			var data = {};
			data.limit = pageSize;
			dp.util
					.ajaxRequest({
						type : 'POST',
						//url : manuscriptServer
						//		+ "System/BigScreenQueryManuscriptController/getManuscripts.do",
						url : '/DYBigScreen/DYNewsCommandMobileInterface/ManuscriptsList.do',
						data : JSON.stringify(data),
						dataType : 'json',
						contentType : "application/json;charset=UTF-8",
						success : function(data) {
							if (data.status == 'true' || data.status == true) {
								if (data.data != null
										&& typeof (data.data) != "undefined"
										&& data.data.length > 0) {
									// $('#news_cont').html("");
									 console.log(JSON.stringify(data))
									for (var a = 0; a < data.data.length; a++) {
										var type = data.data[a].manuscripttype;
										if (type == "0") {
											data.data[a].manuscripttype = "CMS";
										} else if (type == "1") {
											data.data[a].manuscripttype = "微信";
										} else if (type == "2") {
											data.data[a].manuscripttype = "微博";
										} else if (type == "3") {
											data.data[a].manuscripttype = "电视";
										} else if (type == "4") {
											data.data[a].manuscripttype = "通稿";
										}
									}
									intervalDataListTime = data.data.length;
									if (intervalDataListTime == 0) {
										intervalDataListTime = 10;
									}
									var newsListHtml = template(
											'manuscript_script', data);
									$('#news_cont').append(newsListHtml);
								}
							} else {
								alert(data.msg);
							}
						}
					});
		},
		/**
		 * 对列表数据添加滚动事件
		 */
		doscroll : function() {
			var $parent = $("#news_cont");
			var $first = $parent.find('div:first').height();
			var $child = $("#news_cont div");
			$parent.animate({
				marginTop : -$first
			}, 1000, function() {
				$parent.css('marginTop', 0);
				// $child.slice(0, 1).appendTo($parent);
				$child.slice(0, 1).remove();

			});
		},
	};
	return new NewsClass();
})(jQuery, window, document);
$(dp.News.init());
