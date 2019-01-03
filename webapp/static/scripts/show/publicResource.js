;
dp.PublicRespurce = (function($, window, document) {
	var thisContext; // 当前上下文环境指针
	var cfbServer; // 资源库后台服务地址
	var scrollTime; // 列表滚动事件间隔定时器
	var intervalTime = 2000;// 滚动事件间隔 2S
	var pieChangeTime = 3000;// 饼图切换类型间隔时间 3S
	var imageAndVideoRefreshTime = 10000;// 图片和视频更新时间10s
	var resouceListSize = 18;// 数量返回的数量 默认18
	var refreshIntervalTime1 = 0;// 刷新时间间隔定时器
	var refreshIntervalTime2 = 0;// 折线图饼图刷新时间间隔定时器
	var refreshIntervalTime3 = 0;// 图片和视频刷新时间间隔定时器
	var pageSize = 9;
	
	var PublicRespurceClass = function() {
	};

	PublicRespurceClass.prototype = {
		// 构造函数
		constructor : PublicRespurceClass,
		init : function() {
			thisContext = this;
			thisContext.initViewStyle();
			thisContext.initData();
			thisContext.initEvent();
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
			thisContext.initCfbServer();
			
			// 加载左侧列表数据
			thisContext.initResourceList(pageSize*2);
			
			// 加载上传数量统计数据
			thisContext.initUploadFileNumEveryday();
			
			// 加载资源构成统计
			thisContext.initFileTypeRatio();
			
			// 获取最新上传数据
			thisContext.initNewResource();
		},
		/**
		 * 初始化事件
		 */
		initEvent : function() {
			// 清理定时器
			window.clearTimeout(scrollTime); 
			window.clearTimeout(refreshIntervalTime1); 
			window.clearTimeout(refreshIntervalTime2); 
			window.clearTimeout(refreshIntervalTime3); 
			
			// 添加滚屏定时任务，两秒滚动一次
			scrollTime = setInterval(function() {
				thisContext.doscroll()
			}, intervalTime);
			
//			// 根据每次查询返回的条目数*时间间隔计算刷新数据时间,并更新数据队列
			setTimeout(function() {
				thisContext.initResourceList(pageSize * 2);
				refreshIntervalTime1 = setInterval(function() {
					thisContext.initResourceList(pageSize * 2)
				}, intervalTime * pageSize * 2);
			}, intervalTime * pageSize);
			
			// 定时刷新折线图和饼图数据
			refreshIntervalTime2 = setInterval(function() {
				thisContext.initUploadFileNumEveryday();
				thisContext.initFileTypeRatio();
			}, dp.global.cfbRefreshTime);
			
			// 定时刷新图片和视频
			refreshIntervalTime3 = setInterval(function() {
				thisContext.initNewResource();
			}, imageAndVideoRefreshTime);
			
			// 图片添加加载效果
			$(".img_piece").neatShow({ speed: 8000});
		},
		/**
		 * 获取资源库服务地址
		 */
		initCfbServer : function() {
			cfbServer = publicresourceurl;
			
//			cfbServer = dp.global.getParamterByCode(dp.global.CFB_SERVER,dp.global.tenantId);
//			cfbServer = "http://100.0.0.61:8888/dycfbserver/";
		},
		/**
		 * 查询最新上传的文件（图片和视频）
		 */
		initNewResource:  function(){
			//查询最新上传的文件（图片）
			thisContext.initNewImageResource();
			//查询最新上传的文件（视频）
			thisContext.initNewVideoResource();
		},
		/**
		 * 查询最新上传的文件（图片）
		 */
		initNewImageResource:  function(){
			console.log("刷新24小时内上传图片数据列表");
			dp.util.ajaxRequest({
				type : 'POST',
				async: true,
				url : cfbServer + "FileController/listFileByCondition",
				data : {
					pageSize : 2,// 每页显示条数
					filebaseType : 2,// 大屏查询公共库数据
					is24hour : 0,
					virtualfileTypes:"[1]"
				},
				success : function(data) {
					if (data.status == 'true' || data.status == true) {
						if (data.data != null && typeof (data.data) != "undefined" && data.data.list.length > 0) {
							// 渲染模板
							var imageHtml = template('imageToday_script', data);
							$('#imageTodayDiv').html(imageHtml);
						}
					} else {
						console.log(data.msg);
					}
				}
			});
		},

		/**
		 * 查询最新上传的文件（视频）
		 */
		initNewVideoResource:  function(){
			console.log("刷新24小时内上传视频数据列表");
			dp.util.ajaxRequest({
				type : 'POST',
				async: true,
				url : cfbServer + "FileController/listFileByCondition",
				data : {
					pageSize : 2,// 每页显示条数
					filebaseType : 2,// 大屏查询公共库数据
					is24hour : 0,
					virtualfileTypes:"[2,4]"
				},
				success : function(data) {
					if (data.status == 'true' || data.status == true) {
						if (data.data != null
								&& typeof (data.data) != "undefined"
								&& data.data.list.length > 0) {
							// 渲染模板
							var videoHtml = template('videoToday_script', data);
							$('#videoTodayDiv').html(videoHtml);
						}
					} else {
						console.log(data.msg);
					}
				}
			});
		},
		
		/**
		 * 查询上传文件类型比例
		 */
		initFileTypeRatio :  function(){
			var fileTypeRatioArray = new Array();
			dp.util.ajaxRequest({
				type : 'POST',
				async: true,
				url : cfbServer + "StatisticsController/getFileTypeRatio",
				data : {
					filebaseType : 2,// 大屏查询公共库数据
				},
				success : function(data) {
					if(data.status ==true || data.status == 'true'){
						var myobj = data.data;
						if(myobj!=null){
							for(var i=0;i<myobj.length;i++){
								var dataObj = {
										value : myobj[i].fileNum,
										ratio : myobj[i].fileTypeRatio,
										name : myobj[i].fileTypeName,
										color : dp.global.fileTypeColor[i]
								};
								fileTypeRatioArray.push(dataObj);
							}
							if(fileTypeRatioArray.length > 0){
								//渲染饼图
								thisContext.pieChart(fileTypeRatioArray);
								//渲染比例百分比进度
								thisContext.initFileTypeRatioProgress(fileTypeRatioArray);
							}else{
								console.log("用户上传文件类型比例为空！");
							}
						}else{
							console.log("用户上传文件类型比例为空！");
						}
					}else{
						console.log("获取用户上传文件类型比例失败！");
					}
				}
			});
		},
		/**
		 * 渲染文件分类百分比进度条
		 */
		initFileTypeRatioProgress : function(fileTypeRatioArray) {
			// 渲染模板
			var data = {};
			data.list = fileTypeRatioArray;
			var html = template('fileTypeRatioProgress_script', data);
			$('#fileTypeRatioProgress').html(html);
		},
		/**
		 * 获取近7天每天上传每天上传文件数量，并折线图展现
		 */
		initUploadFileNumEveryday : function() {
			console.log("加载折线图");
			dp.util.ajaxRequest({
						type : 'POST',
						async: true,
						url : cfbServer
								+ "StatisticsController/getUploadFileNumEveryday",
						data : {
							filebaseType : 2,// 大屏查询公共库数据
							startDate : dp.util.getDate(6),
							endDate : dp.util.getDate()
						// 获取近7天数据
						},
						success : function(data) {
							if (data.status == true || data.status == 'true') {
								var myobj = data.data;
								if (myobj != null) {
									var uploadDateArray = new Array();
									var uploadFileNumArray = new Array();
									for (var i = 0; i < myobj.length; i++) {
										uploadDateArray
												.push(myobj[i].uploadDate);
										uploadFileNumArray
												.push(myobj[i].uploadFileNum);
									}
									thisContext.lineChart(uploadDateArray,
											uploadFileNumArray);
								}
							} else {
								alert(data.msg);
							}
						}
					});
		},
		/**
		 * 加载公共资源列表
		 */
		initResourceList : function(pageSize) {
			console.log("刷新数据列表");
			dp.util.ajaxRequest({
				type : 'POST',
				async: true,
				url : cfbServer + "FileController/listFileByCondition",
				data : {
					pageSize : pageSize, // 每页显示条数
					filebaseType : 2,    // 大屏查询公共库数据
					is24hour : 0
				// 不需要时间范围
				},
				success : function(data) {
					if (data.status == 'true' || data.status == true) {
						if (data.data != null && typeof (data.data) != "undefined" && data.data.list.length > 0) {
							// 渲染左侧列表
//							$('#public_list').html('');
							var resourceListHtml = template('resourceList_script', data);
							$('#public_list').append(resourceListHtml);
							
							// 渲染累计资源数量
							$('#totalCount').html(data.data.totalCount);
							
							// 渲染今日上传数量
							$('#todayCount').html(data.data.extraParam["todayCount"]);
							
							// 获取查询到的数据数量
//							window.sessionStorage.setItem("resouceListSize",data.data.list.length);
						}
					} else {
						console.log(data.msg);
					}
				}
			});
		},
		/**
		 * 对列表数据添加滚动事件
		 */
		doscroll : function() {
			var $parent = $('#public_list');
			var $first = $parent.find('li:first').height();
			var $child = $("#public_list li");
			$parent.animate({
				marginTop:-$first
			}, 1000, function() {
				$parent.css('marginTop',0);
//				$child.slice(0,1).appendTo($parent);
				// 将滚动过得元素直接移除掉
				$child.slice(0,1).remove();
			});
		},
		
		/**
		 * 加载饼图
		 */
		pieChart : function(resourceData) {
			var app = {};
			app.currentIndex = -1;
			
			var myChart = echarts.init(document.getElementById("public_pie"));
			var option = {
				tooltip : {
					trigger : 'item',
					formatter : "{a} <br/>{b}: {c} ({d}%)"
				},

				series : [ {
					type : 'pie',
					radius : [ '50%', '70%' ],
					avoidLabelOverlap : false,
					label : {
						normal : {
							show : false,
							position : 'center'
						},
						emphasis : {
							show : false

						}
					},
					labelLine : {
						normal : {
							show : false
						}
					},
					data : resourceData
				
				} ],
				color : dp.global.fileTypeColor
			};
			
			app.timeTicket = setInterval(function () {
			    var dataLen = option.series[0].data.length;
			    // 取消之前高亮的图形
			    myChart.dispatchAction({
			        type: 'downplay',
			        seriesIndex: 0,
			        dataIndex: app.currentIndex
			    });
			    app.currentIndex = (app.currentIndex + 1) % dataLen;
			    // 高亮当前图形
			    myChart.dispatchAction({
			        type: 'highlight',
			        seriesIndex: 0,
			        dataIndex: app.currentIndex
			    });
			    // 显示 tooltip
			    myChart.dispatchAction({
			        type: 'showTip',
			        seriesIndex: 0,
			        dataIndex: app.currentIndex
			    });
			}, pieChangeTime);

			
			myChart.setOption(option);
		},
		/**
		 * 加载折线图
		 */
		lineChart : function(xDate, seriesData) {
			var myChart = echarts.init(document.getElementById("public_line"));
			var option = {
				xAxis : {
					type : 'category',
					boundaryGap : false,
					axisLabel : {
						textStyle : {
							color : 'rgba(255,255,255,.5)',
							fontSize : 14,
							fontWeight : 'normal'
						},
						formatter : function(date) {
							return date.slice(5);
						}
					},
					axisLine : {
						lineStyle : {
							color : "rgba(255,255,255,0.6)"
						}
					},
					data : xDate
				},
				yAxis : {
					name : "文件数",
					type : 'value',
					nameTextStyle : {
						color : "rgba(255,255,255,.5)",
						fontSize : 14
					},
					axisLabel : {
						textStyle : {
							color : 'rgba(255,255,255,.5)',
							fontSize : 14,
							fontWeight : 'normal'
						}
					},
					splitLine : {
						lineStyle : {
							color : "rgba(255,255,255,0.13)"
						}
					},
					axisLine : {
						lineStyle : {
							color : "rgba(255,255,255,0.6)"
						}
					}
				},
				series : [ {
					data : seriesData,
					type : 'line',
					itemStyle : {
						normal : {
							normal : {
								color : new echarts.graphic.LinearGradient(0,
										0, 0, 1, [ {
											offset : 1,
											color : '#07eded'
										}, {
											offset : 0.5,
											color : '#40c3f1'
										}, {
											offset : 0,
											color : '#07eded'
										} ])
							},
							color : '#07eded',
							lineStyle : {
								color : '#07eded'
							}
						}
					},
					areaStyle : {
						normal : {
							color : new echarts.graphic.LinearGradient(0, 0, 0,
									1, [ {
										offset : 0,
										color : '#07eded'
									}, {
										offset : 1,
										color : '#0b1b3c'
									} ]),
							opacity : 0.4
						}
					},
					color : "#07eded"
				} ]
			};
			myChart.setOption(option);
		},
	};
	return new PublicRespurceClass();
})(jQuery, window, document);
$(dp.PublicRespurce.init());

