//---------------------------消息发送------------------------//
var websocket = null;
var pageId = "control_map20";
//判断当前浏览器是否支持WebSocket
if('WebSocket' in window){
	websocket = new WebSocket("ws://"+baseUrl+"/DYBigScreen/websocket/" + pageId);
}
else{
    alert('map Not support websocket')
}
//连接发生错误的回调方法
websocket.onerror = function(){
    alert("map wbsocket error");
};
 
//连接成功建立的回调方法
websocket.onopen = function(event){
    console.info("map open wbs");
}
//连接关闭的回调方法
websocket.onclose = function(){
    console.info("map close wbs");
}
//监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function(){
    websocket.close();
}
//关闭连接
function closeWebSocket(){
    websocket.close();
}

//发送消息
function send(message){
    websocket.send(message);
}

//alert
function boxAlert(title){
	$(".alertTitle").text(title);
	$(".box-shadow").css("display","block");
	$(".boxAlert").css("display","block");
	var msg = '{"type":"showAlert","title":"'+title+'"}';
	send(msg);
}

var MediaSystem = function() {
	var mapicon_zindex = 1;
	var PageSize = 7;
	var first_load = true;
	var c;
	var map;
	var activeId;
	var userInfo = JSON.parse(window.localStorage.getItem("userInfo"));
	var points =new Array();
	var timer;//定时任务
	return {
		init : function() {
			c = this;
			map = c.initMap();
			
			
			for (i = 1; i <= 5; i++) {
				if(i!=2){
					c.initCacheDate(i, null, "");
				}
				
			}
			c.initViewStyle();
			/*
			 * setTimeout(function(){ c.initData(); },500);
			 */
			c.initEvent();
			c.initControl();
			
			c.mapControl();
			
		},
		
		/**
         * 初始化地图滑动缩放控制
         */
        mapControl:function(){
        	map.addEventListener("dragend", function(){
        		var mtype = map.getMapType();
        		var center = map.getCenter();
        		var msg = '{"type":"mapMove","MAP":[{"LNG":"'+center.lng+'"},{"LAT":"'+center.lat+'"},{"ZOOM":"'+this.getZoom()+'"},{"TYPE":"'+mtype.af+'"}]}';
        		send(msg);
        		});
        	//地图更改缩放级别结束时触发触发此事件。
        	map.addEventListener("zoomend", function(){
        		var mtype = map.getMapType();
        		var center = map.getCenter();
        		var msg = '{"type":"mapMove","MAP":[{"LNG":"'+center.lng+'"},{"LAT":"'+center.lat+'"},{"ZOOM":"'+this.getZoom()+'"},{"TYPE":"'+mtype.af+'"}]}';
        		send(msg);
        		});
        },
        
		 /**
         * 初始化控制事件
         */
        initControl:function(){
        	//接收到消息的回调方法
/*        	
        	websocket.onmessage = function(event){
        		var msg=JSON.parse(event.data);
        		
        		if(msg.type == "mapMove"){
        			map.centerAndZoom(new BMap.Point(msg.MAP[0].LNG,msg.MAP[1].LAT),msg.MAP[2].ZOOM); //移动到新位置
        			var showTypeArr = window.localStorage.getItem("showTypeArr");
        		}else if(msg.type == "tabClick"){
        			$('#tabList').find('li').attr("class","");
        			$("#li_"+msg.activeId).attr("class","tab-current");
        			$("section[id^='section-iconbox-']").attr("class","");
        			$("section[id='section-iconbox-"+msg.activeId+"']").attr("class","content-current");
        			$("#li_"+msg.activeId).click();
        		}else if(msg.type == "mapPointChecked"){
        			$("#section-iconbox-"+msg.activeId).find(":checkbox").prop("checked",true);
        			c.loadOtherIcon(msg.activeId);
        		}else if(msg.type == "mapPointNone"){
        			$("img[class^='mapicon2_']").parent().remove();
        			$("#section-iconbox-"+msg.activeId).find(":checkbox").prop("checked",false);
        		}else if(msg.type == "toDetail"){
        			c.toDetail(msg.userId);
        		}else if(msg.type == "toUserList"){
        			c.toUserList();
        		}else if(msg.type == "userClick"){
        			//清除其他图标的点击效果
					$("img[class^='mapicon1']").prop("src","../../ccbn/images/blue.png");
					$("div[id^='label_']").hide();
        			$(".mapicon1_"+msg.userId).prop("src","../../ccbn/images/red.png");
					$("#label_"+msg.tabType+"_"+msg.userId).show();
        		}else if(msg.type == "pageJump"){
        				var type = msg.tabType;
        				//调用分页
	                    laypage({
	                        cont: "list-pagination"+type,
	                        pages: msg.totalPage,
	                        skin: 'molv', //皮肤
	                        curr: msg.currPage,
	                        first: 1, //将首页显示为数字1,。若不显示，设置false即可
	                        last: msg.totalPage, //将尾页显示为总页数。若不显示，设置false即可
	                        prev: '<i class="fa fa-angle-left" style="font-size: 20px;margin-top: 8px;"></i>', //若不显示，设置false即可
	                        next: '<i class="fa fa-angle-right" style="font-size: 20px;margin-top: 8px;"></i>', //若不显示，设置false即可
	                        groups: 5,//连续显示分页数
	                        jump: function(e,first){
             					var starPage = e.curr;
    							var data = c.getPageData(type, starPage, PageSize);
    							if(data){
    								data["type"] = type;
    							}
    							var html = template('id_records_list', data);
    							$('#section-iconbox-' + type).find(".data-cont").remove();
    							$('#section-iconbox-' + type).find(".contLists").prepend(html);
    							// 根据坐标添加地址信息
    							for (var i = 0; i < data.records.length; i++) {
    								var staff = data.records[i];
    								if (staff.Longitude != null
    										&& staff.Lantitude != null) {
    									if (type == 1 && staff.locationName != null
    											&& staff.locationName != "") {
    										$('#section-iconbox-' + type).find(
    												"#address" + staff.id).html(
    												staff.locationName);
    									} else {
    										c
    												.setAddress(staff.Longitude,
    														staff.Lantitude,
    														staff.id, type);
    									}
    								}
    							}
    							// 显示分页的地图标示
    							c.showTabMapPoint(type, starPage);
    							c.loadOtherIcon(type);
    							// 添加鼠标滑过事件
    							//c.addMouseToTabList(type);
    							//调整分页控件样式
    							$("#list-pagination" + type).css("margin-top","30px");
    							// 如果总页数为1,只显示页码1的分页标示
    							if (e.pages == 1) {
    								var pageHtml = "<div name='laypage1.3' class='laypage_main laypageskin_molv'><a href='javascript:;' class='laypage_prev' data-page='1' ><i class='fa fa-angle-left' style='font-size: 20px;margin-top: 8px;'></i></a><span class='laypage_curr'>1</span><a href='javascript:;' class='laypage_next' data-page='1' ><i class='fa fa-angle-right' style='font-size: 20px;margin-top: 8px;'></i></a></div>"
    								$("#list-pagination" + type).append(pageHtml);
    							}
    							// 调整分页按钮的占位
    							var $next = $('#section-iconbox-' + type).find(
    									".laypage_next");
    							var $prev = $('#section-iconbox-' + type).find(
    									".laypage_prev");
    							var $page = $("#list-pagination" + type).find(
    									"div[id^='laypage']");
    							if ($prev.length <= 0) {
    								$page.prepend("<a href='javascript:;' class='laypage_prev' data-page='1' ><i class='fa fa-angle-left' style='font-size: 20px;margin-top: 8px;'></i></a>");
    							}
    							if ($next.length <= 0) {
    								$page.append("<a href='javascript:;' class='laypage_next' data-page='1' ><i class='fa fa-angle-right' style='font-size: 20px;margin-top: 8px;'></i></a>");
    							}
	                        }
	                  });
        			
        		}else if(msg.type == "iconShow"){
        			//清除其他图标的点击效果
					$("img[class^='mapicon1']").prop("src","../../ccbn/images/blue.png");
					$("div[id^='label_']").hide();
					$("div[id^='label2_']").hide();
					$(".mapicon1_"+msg.iconId).prop("src","../../ccbn/images/yellow.png");
					$("#label_"+msg.tabType+"_"+msg.iconId).show();
        		}else if(msg.type == "iconHide"){
        			$(".mapicon1_"+msg.iconId).prop("src","../../ccbn/images/blue.png");
					$("#label_"+msg.tabType+"_"+msg.iconId).hide();
        		}else if(msg.type == "iconShow2"){
        			//清除其他图标的点击效果
					$("img[class^='mapicon1']").each(function(){
						var src =  $(this).prop("src");
						if(src.indexOf("red")<=0){
							$(this).prop("src","../../ccbn/images/blue.png");
							$(this).parent().parent().find("div[id^='label_']").hide();
						}
					});
					$("div[id^='label2_']").hide();
        			$("#label2_"+msg.tabType+"_"+msg.iconId).show();
        		}else if(msg.type == "iconHide2"){
        			$("#label2_"+msg.tabType+"_"+msg.iconId).hide();
        		}else if(msg.type == "listOver"){
        			$("."+msg.classStr).prop("src","../../ccbn/images/yellow.png");
        		}else if(msg.type == "listOut"){
        			$("."+msg.classStr).prop("src","../../ccbn/images/blue.png");
        		}else if(msg.type == "labelShow"){
        			if(msg.iconType=="1"){
        				$("#label_"+msg.tabType+"_"+msg.labelId).show();
        			}else{
        				$("#label2_"+msg.tabType+"_"+msg.labelId).show();
        			}
        		}else if(msg.type == "labelHide"){
        			if(msg.iconType=="1"){
        				$("#label_"+msg.tabType+"_"+msg.labelId).hide();
        			}else{
        				$("#label2_"+msg.tabType+"_"+msg.labelId).hide();
        			}
        		}else if(msg.type == "closeAlert"){
        			$(".box-shadow").css("display","none");
        			$(".boxAlert").css("display","none");
        		}else if(msg.type == "refresh"){
        			 window.location.reload();
        		}
        	}
*/
        },
		/**
		 * 初始化地图
		 */
		initMap : function() {
			// 百度地图API功能
			var centerPointLongi   = 116.403875;
			var centerPointLanti   = 39.915168;
			var centerdefaultscale = 12; 				//地图级别,值:19
			var setmaptype         = {mapType:BMAP_NORMAL_MAP,enableMapClick : false};        //地图类型,值:{mapType:BMAP_NORMAL_MAP}
			var pointc = new BMap.Point(centerPointLongi, centerPointLanti); // 指定经纬度创建一个地理点坐标
			var map = new BMap.Map("allmap", setmaptype); // 创建Map实例,
			map.centerAndZoom(pointc, centerdefaultscale);// 初始化地图,设置中心点坐标和地图级别
			map.enableDragging(); // 启用地图拖拽,默认状态启用
			map.enableScrollWheelZoom(true); // 开启鼠标滚轮缩放
			var styleJson =[
					          {
				                    "featureType": "water",
				                    "elementType": "all",
				                    "stylers": {
				                              "color": "#012674ff"
				                    }
				          },
				          {
				                    "featureType": "highway",
				                    "elementType": "geometry.fill",
				                    "stylers": {
				                              "color": "#000000"
				                    }
				          },
				          {
				                    "featureType": "highway",
				                    "elementType": "geometry.stroke",
				                    "stylers": {
				                              "color": "#b6d7a8ff"
				                    }
				          },
				          {
				                    "featureType": "arterial",
				                    "elementType": "geometry.fill",
				                    "stylers": {
				                              "color": "#000000"
				                    }
				          },
				          {
				                    "featureType": "arterial",
				                    "elementType": "geometry.stroke",
				                    "stylers": {
				                              "color": "#0b3d51"
				                    }
				          },
				          {
				                    "featureType": "local",
				                    "elementType": "geometry",
				                    "stylers": {
				                              "color": "#999999ff"
				                    }
				          },
				          {
				                    "featureType": "land",
				                    "elementType": "all",
				                    "stylers": {
				                              "color": "#013c93ff"
				                    }
				          },
				          {
				                    "featureType": "railway",
				                    "elementType": "geometry.fill",
				                    "stylers": {
				                              "color": "#000000"
				                    }
				          },
				          {
				                    "featureType": "railway",
				                    "elementType": "geometry.stroke",
				                    "stylers": {
				                              "color": "#08304b"
				                    }
				          },
				          {
				                    "featureType": "subway",
				                    "elementType": "geometry",
				                    "stylers": {
				                              "lightness": -70
				                    }
				          },
				          {
				                    "featureType": "building",
				                    "elementType": "geometry.fill",
				                    "stylers": {
				                              "color": "#000000"
				                    }
				          },
				          {
				                    "featureType": "all",
				                    "elementType": "labels.text.fill",
				                    "stylers": {
				                              "color": "#857f7f"
				                    }
				          },
				          {
				                    "featureType": "all",
				                    "elementType": "labels.text.stroke",
				                    "stylers": {
				                              "color": "#000000"
				                    }
				          },
				          {
				                    "featureType": "building",
				                    "elementType": "geometry",
				                    "stylers": {
				                              "color": "#022338ff"
				                    }
				          },
				          {
				                    "featureType": "green",
				                    "elementType": "geometry",
				                    "stylers": {
				                              "color": "#012674ff"
				                    }
				          },
				          {
				                    "featureType": "boundary",
				                    "elementType": "all",
				                    "stylers": {
				                              "color": "#ccccccff"
				                    }
				          },
				          {
				                    "featureType": "manmade",
				                    "elementType": "geometry",
				                    "stylers": {
				                              "color": "#022338"
				                    }
				          },
				          {
				                    "featureType": "poi",
				                    "elementType": "all",
				                    "stylers": {
				                              "visibility": "off"
				                    }
				          },
				          {
				                    "featureType": "all",
				                    "elementType": "labels.icon",
				                    "stylers": {
				                              "visibility": "off"
				                    }
				          },
				          {
				                    "featureType": "all",
				                    "elementType": "labels.text.fill",
				                    "stylers": {
				                              "color": "#ffffffff",
				                              "visibility": "on"
				                    }
				          }				          
				]
		       map.setMapStyle({
		       styleJson : styleJson
		       });			
			
			return map;
		},
		/**
		 * 初始化地图搜索
		 */
		initMapSearch : function() {
			var ac = new BMap.Autocomplete( // 建立一个自动完成的对象
			{
				"input" : "suggestId",
				"location" : map
			});
			ac.addEventListener("onhighlight", function(e) { // 鼠标放在下拉列表上的事件
				var str = "";
				var _value = e.fromitem.value;
				var value = "";
				if (e.fromitem.index > -1) {
					value = _value.province + _value.city + _value.district
							+ _value.street + _value.business;
				}
				str = "FromItem<br />index = " + e.fromitem.index
						+ "<br />value = " + value;

				value = "";
				if (e.toitem.index > -1) {
					_value = e.toitem.value;
					value = _value.province + _value.city + _value.district
							+ _value.street + _value.business;
				}
				str += "<br />ToItem<br />index = " + e.toitem.index
						+ "<br />value = " + value;
				G("searchResultPanel").innerHTML = str;
			});

			var myValue;
			ac.addEventListener("onconfirm", function(e) { // 鼠标点击下拉列表后的事件
				var _value = e.item.value;
				myValue = _value.province + _value.city + _value.district
						+ _value.street + _value.business;
				G("searchResultPanel").innerHTML = "onconfirm<br />index = "
						+ e.item.index + "<br />myValue = " + myValue;
				setPlace();
				$(".myAdds").val(myValue)
			});

			// 地图中心转移
			function setPlace() {
				function myFun() {
					var centerdefaultscale = $("#defaultscale").val();
					var pp = local.getResults().getPoi(0).point; // 获取第一个智能搜索的结果
					map.centerAndZoom(pp, centerdefaultscale);
				}
				var local = new BMap.LocalSearch(map, { // 智能搜索
					onSearchComplete : myFun
				});
				local.search(myValue);
			}
			// 百度地图API功能
			function G(id) {
				return document.getElementById(id);
			}
		},
		/**
		 * 按筛选条件，初始化缓存数据
		 */
		initCacheDate : function(type, state, searchContent,basync) {

//			if (type == 2 || type == 3) {
//				var json = {
//					"searchContent" : searchContent,
//					"taskState" : state
//				};
//			}
			if (type == 3) {
				var json = {
					"currentPage" : 1,
					"pageSize" : 999
				};
			}
			if (type == 1) {
				// 由于目前线索状态的功能界定不清晰，所以状态筛选（已选用，未选用）暂不做筛选功能，参数设为固定 全部状态
				var json = {
					"start" : 0,
					"limit" : 999,
					"classId" : 32768,
					"searchContent" : searchContent,
					"queryModel" : parseInt(state),
					"isFilterUser" : 1
				};
			}
			if(type == 4){
				var json = { 
					"searchName": searchContent,
					"querytype": "1",
					"isonline": state
				};
			}
			if(type == 5){
				var json = { 
					"searchName": searchContent,
					"querytype": "2",
					"isonline": state
				};
			}
			var url = c.tabUrl(type.toString());
			var itemName = c.itemName(type.toString());
			c.setCacheItem(url, json, itemName, type,basync);
		},
		/**
		 * 将指定url返回的data存入指定itemname的本地缓存
		 */
		setCacheItem : function(url, json, itemName, type,basync) {
			window.localStorage.removeItem(itemName.toString());
			
			var params = {};
			params.start = 1;
			params.limit = 999;
			params.queryModel = type;
			if(type==3)
				params.xuantistate = -1;
			
			if(basync==null || basync==undefined)   //zhy mod
				basync = true;
			
				ajaxRequest({
					type : "POST",
					async : basync,            //zhy mod   async :true,
					dataType : 'json',
					url : '/DYBigScreen/DYNewsCommandMobileInterface/selectMapProgressList.do',
					contentType : "application/json;charset=UTF-8",
					data : JSON.stringify(params),
					success : function(data) {
						if(data.status){							
							var filterdata = {};
							filterdata.list=[];
							var addindex = 0;
							for(var jj=0;jj<data.data.list.length;jj++)
							{
								var item = data.data.list[jj];
								if(null==item || null==item.topicLongitude || null==item.topicLatitude || ""==item.topicLongitude || ""==item.topicLatitude)
									continue;
								filterdata.list[addindex]=item;
								addindex = addindex+1;
							}
							filterdata.totalCount=addindex;
							data.data = filterdata;
							window.localStorage.setItem(itemName, JSON.stringify(data));
							c.initTabDate(type.toString());							
						}else{
							$('#section-iconbox-' + type).find("h2").remove();
							$('#section-iconbox-' + type).find(".contLists").prepend("<h2>服务端异常</h2>");
							$("#list-pagination" + type).empty();
							
							/*   //zhy del
							setTimeout(function() {
						        $.bootstrapGrowl(data.commonResponse.errorDesc, { type: 'danger' });
							}, 1000);
							*/
							
							if (first_load == true && type == '4') {    //zhy mod
								//c.loadOtherIcon(1);
								c.loadOtherIcon(4);                   //zhy mod
							} 
						}
					}
				});
		},

		/**
		 * 初始化页面视图
		 */
		initViewStyle : function() {
			$(":checkbox").prop("checked", true);
			//$('.cont').css('height', $(window).height() + "px");			
			$('#tabList').find('li:nth-child(3)').find('s').show();  //zhy mod
			// tab切换功能
			(function() {

				[].slice.call(document.querySelectorAll('.tabs')).forEach(
						function(el) {
							new mapTabs(el,{start:2});     //zhy mod
						});

			})();
			//初始化页面 位于第一个tab
			$('#tabList').find('#li_4').attr("class","tab-current active");

			$('.contLists').css('height',
					($('.cont-right').height() - 170) + 'px');
			// 列表区滚动条样式
			var innerCont = $('.cont-right').height() - 170;
			$('.inner-content').slimScroll({
				height : innerCont,
				size : "10px",
			});
			activeId = $('.content-current').attr('id').split('-')[2];
			console.log("初始化----"+activeId);

			// 调整筛选输入框样式冲突
			$(".select2-selection.select2-selection--single").css(
					"border-radius", "2px 0px 0px 2px");
			$(".searchBtn").find("input[class='form-control']").css(
					"border-radius", "0px").css("height", "34px");
			$(".input-group-addon").css("border-radius", "0px 2px 2px 0px");
			
		},
		/**
		 * 初始化数据
		 */
		initData : function() {
			// 初始化tab数据
			for (i = 1; i <= 5; i++) {
				c.initTabDate(i.toString(), c.tabUrl(i.toString()));
			}
		},

		/**
		 * 初始化事件
		 */
		initEvent : function() {
			// 给alert绑定点击关闭事件
			$(".box-shadow").on('click', function() {
				$(this).css("display", "none");
				$(".boxAlert").css("display", "none");
			});
			// tab切换样式
			/*$('#tabList').find('li').on('click', function() {
				if ($(this).hasClass('tab-current')) {
					$(this).find('s').show();
					$(this).siblings().find('s').hide();
				}
			});*/

			// 点击tab加载tab详情
			$('#tabList').find('li')
					.on(
							'click',
							function() {
								activeId = $('.content-current').attr('id')
										.split('-')[2];
								// 清除checkbox的checked 以及地图小图标
								$(":checkbox").prop("checked", true);
								$("input[name='userCheckbox']").prop("checked",false);
								// 获取当前页号
								var currPage = $('.content-current').find(
										".laypage_curr").text();
								if (currPage == "" || currPage == null)
									currPage = 1;
								//刷新tab页数据
								//c.resetCacheByQuery(activeId);
								// 显示tab页的地图标示
								c.showTabMapPoint(activeId, 1);
								// 加载列表之外的其他地图图标
								c.loadOtherIcon(activeId);
								
								//发送控制消息
								var msg = '{"type":"tabClick","activeId":"'+activeId+'"}';
					    		send(msg);
					    		
								//开启定时任务,定时刷新当前tab下数据
								clearInterval(timer);
								timer = setInterval(function() {
									//刷新tab页数据
									c.resetCacheByQuery(activeId,false);
									// 显示tab页的地图标示
									c.showTabMapPoint(activeId, 1);
									var checked = $('.content-current').find(":checkbox").prop("checked");
									if(checked){
										// 加载列表之外的其他地图图标
										c.loadOtherIcon(activeId);
									}else{
										// 删除列表之外的其他地图图标
										$("img[class^='mapicon2_']").parent().remove();
									}
								}, 60000);
							});

			// 给checkbox添加小图标展示事件
			$(":checkbox").bind('change', function() {
				if (this.checked) {
					// 加载列表之外的其他地图图标
					c.loadOtherIcon(activeId);
				} else {
					// 删除列表之外的其他地图图标
					$("img[class^='mapicon2_']").parent().remove();
				}
			});
			$(".input-group-addon").bind('click', function() {
				activeId = $('.content-current').attr('id').split('-')[2];
				// 条件筛选后 重置对应类型的缓存，并重新刷新列表数据 以及地图标识显示
				c.resetCacheByQuery(activeId);
				c.showTabMapPoint(activeId, 1);
				c.loadOtherIcon(activeId);
				/*
				 * setTimeout(function(){ c.initTabDate(activeId.toString());
				 * //显示分页的地图标示 c.showTabMapPoint(activeId, 1);
				 * c.loadOtherIcon(activeId); },200);
				 */
			});
			// 给状态筛选绑定change
			$(".select2-multiple").change(function() {
				activeId = $('.content-current').attr('id').split('-')[2];
				// 条件筛选后 重置对应类型的缓存，并重新刷新列表数据 以及地图标识显示
				c.resetCacheByQuery(activeId);
				c.showTabMapPoint(activeId, 1);
				c.loadOtherIcon(activeId);
				/*
				 * setTimeout(function(){ c.initTabDate(activeId.toString());
				 * //显示分页的地图标示 c.showTabMapPoint(activeId, 1);
				 * c.loadOtherIcon(activeId); },200);
				 */
			});
		},
		// 获取初始化Tab数据 1.线索, 2.报题, 3.选题, 4.人员 ,5 设备
		initTabDate : function(type) {
			// debugger;
			$('#section-iconbox-' + type).find(".data-cont").remove();
			$('#section-iconbox-' + type).find("h2").remove();
			var itemName = c.itemName(type.toString());
			// 获取列表首页数据
			var data = c.getPageData(type, 1, PageSize);
			var tipdata = new Array();
			if (data != null && data.records.length > 0) {
				data["type"] = type;
				
				for (var i = 0; i < data.records.length; i++) {
					var staff = data.records[i];
					if (staff.topicLongitude != null && staff.topicLatitude != null) {
						// if(type==1&&staff.locationName!=null&&staff.locationName!=""){
						if (staff.topicHapplace != null
								&& staff.topicHapplace != "") {
							$('#section-iconbox-' + type).find(
									"#address" + staff.topicGuid).html(
									staff.topicHapplace);
						} else {
							c.setAddress(staff.topicLongitude, staff.topicLatitude,
									staff.topicGuid, type);
						}
					}
					if(staff.topicLongitude != ""){
            			tipdata.push(staff);
					}
					
				}
				var htmldata = {records:tipdata,type:data.type};
				var html = template('id_records_list', htmldata);
				$('#section-iconbox-' + type).find(".contLists").prepend(html);
				
				// 默认显示线索列表的地图标示
				if (first_load == true && type == '4') {    //zhy mod
					c.showTabMapPoint('4', 1);          //zhy mod
				} 
					
				// 添加鼠标滑过事件
				//c.addMouseToTabList(type);
				
				// 调用分页
				laypage({
					cont : "list-pagination" + type,
					pages : data.page_info.total_page,
					skin : 'molv', // 皮肤
					first : '1', // 将首页显示为数字1,。若不显示，设置false即可
					last : data.page_info.total_page, // 将尾页显示为总页数。若不显示，设置false即可
					prev : '<i class="fa fa-angle-left" style="font-size: 20px;margin-top: 8px;"></i>', // 若不显示，设置false即可
					next : '<i class="fa fa-angle-right" style="font-size: 20px;margin-top: 8px;"></i>', // 若不显示，设置false即可
					groups : 5, // 连续显示分页数
					jump : function(e, first) {
						if (!first) {
							var starPage = e.curr;
							var data = c.getPageData(type, starPage, PageSize);
							
							if(data){
								data["type"] = type;
							}
							var tipdata = new Array();
							// 根据坐标添加地址信息
							for (var i = 0; i < data.records.length; i++) {
								var staff = data.records[i];
								if (staff.topicLongitude != null&& staff.topicLatitude != null) {
									if (type == 1 && staff.topicHapplace != null&& staff.topicHapplace != "") {
										$('#section-iconbox-' + type).find("#address" + staff.topicGuid).html(staff.locationName);
									} else {
										c.setAddress(staff.topicLongitude,staff.topicLatitude,staff.topicGuid, type);
									}
								}
								if(staff.topicLongitude != ""){
			            			tipdata.push(staff);
								}
							}
							var htmldata = {records:tipdata,type:data.type};
							var html = template('id_records_list', htmldata);
							$('#section-iconbox-' + type).find(".data-cont").remove();
							$('#section-iconbox-' + type).find(".contLists").prepend(html);
							// 显示分页的地图标示
							c.showTabMapPoint(type, starPage);
							var checked = $('.content-current').find(":checkbox").prop("checked");
							if(checked){
								// 加载列表之外的其他地图图标
								c.loadOtherIcon(activeId);
							}else{
								// 删除列表之外的其他地图图标
								$("img[class^='mapicon2_']").parent().remove();
							}
							// 添加鼠标滑过事件
							//c.addMouseToTabList(type);
						}
						$("#list-pagination" + type).css("margin-top","30px");
						// 如果总页数为1,只显示页码1的分页标示
						if (e.pages == 1) {
							var pageHtml = "<div name='laypage1.3' class='laypage_main laypageskin_molv'><a href='javascript:;' class='laypage_prev' data-page='1' ><i class='fa fa-angle-left' style='font-size: 20px;margin-top: 8px;'></i></a><span class='laypage_curr'>1</span><a href='javascript:;' class='laypage_next' data-page='1' ><i class='fa fa-angle-right' style='font-size: 20px;margin-top: 8px;'></i></a></div>"
							$("#list-pagination" + type).append(pageHtml);
						}
						// 调整分页按钮的占位
						var $next = $('#section-iconbox-' + type).find(
								".laypage_next");
						var $prev = $('#section-iconbox-' + type).find(
								".laypage_prev");
						var $page = $("#list-pagination" + type).find(
								"div[id^='laypage']");
						if ($prev.length <= 0) {
							$page.prepend("<a href='javascript:;' class='laypage_prev' data-page='1' ><i class='fa fa-angle-left' style='font-size: 20px;margin-top: 8px;'></i></a>");
						}
						if ($next.length <= 0) {
							$page.append("<a href='javascript:;' class='laypage_next' data-page='1' ><i class='fa fa-angle-right' style='font-size: 20px;margin-top: 8px;'></i></a>");
						}
					}
				});
			} else {
				$('#section-iconbox-' + type).find(".contLists").prepend("<h2>未查询到结果</h2>");
				$("#list-pagination" + type).empty();
			}
			if (first_load == true && type == '4') {    //zhy mod
				// 初始化显示线索页面的小图标
				//c.loadOtherIcon(1);
				c.loadOtherIcon(4);                 //zhy mod
				first_load = false;
			} else if (first_load == false) {
				c.loadOtherIcon(type);
			}
		},

		/**
		 * 从缓存中获取相应列表的分页数据
		 */
		getPageData : function(type, pageNum, pageSize) {
			var returnData = null;
			var itemName = c.itemName(type.toString());
			var data = JSON.parse(window.localStorage.getItem(itemName
					.toString()));
			if (data != null && data.data.list.length > 0) {
				var totalPage = Math.floor((data.data.totalCount + pageSize - 1)
						/ pageSize);
				var startNo = (pageNum - 1) * pageSize;
				var endNo = pageNum * pageSize - 1;
				var arr = new Array();
				for (var i = startNo; i <= endNo; i++) {
					if (data.data.list[i] == null)
						break;
					//大屏不需要保存选题显示
//					if(data.data.list[i].topicStatus==8)
//						break;
					var newData = c.formatPageData(type, data.data.list[i]);
					arr.push(newData);
				}
				if (arr.length > 0) {
					var json = {
						page_info : {
							current_page : pageNum,
							page_num : pageSize,
							total_num : data.totalCount,
							total_page : totalPage
						},
						records : arr
					}
					returnData = json;
				}
			}
			return returnData;
		},
		/**
		 * 格式化分页数据 将state转换为对应的中文，并添加stateType用于前台显示不同的颜色标识
		 */
		formatPageData : function(type, pageData) {
			var stateId = pageData.topicStatus;
			
			function StateObject(stateName, stateType) {
				this.stateName = stateName;
				this.stateType = stateType;
			}
			StateObject.prototype.getStateName = function() {
				return this.stateName;
			}
			StateObject.prototype.getStateType = function() {
				return this.stateType;
			}
			StateObject.prototype.setStateName = function(stateName) {
				this.stateName;
			}
			StateObject.prototype.setStateType = function(stateType) {
				this.stateType;
			}
			
			var s = null;
			if (type == 1) {
				var isUse = pageData.isUse;
				switch (isUse.toString()) {
				case '0':
					s = new StateObject("未选用", "4");
					break;
				case '1':
					s = new StateObject("已选用", "1");
					break;
				}
			}
			if (type == 2) {
				switch (stateId.toString()) {
				case '101':
					s = new StateObject("已提交", "4");
					break;
				case '103':
					s = new StateObject("全部选用", "1");
					break;
				case '102':
					s = new StateObject("部分选用", "2");
					break;
				case '104':
					s = new StateObject("退回", "5");
					break;
				}
			}
			if (type == 3) {
				
				s = new StateObject(xuantiStatusDesp[stateId], stateId);
				
					
				/*  //zhy mod
				switch (stateId.toString()) {
				case '1':
					s = new StateObject("保存", "4");
					break;
				case '2':
					s = new StateObject("待选", "4");
					break;
				case '3':
					s = new StateObject("已选", "2");
					break;
				case '4':
					s = new StateObject("审核中", "2");
					break;
				case '5':
					s = new StateObject("审核完成", "4");
					break;
				case '6':
					s = new StateObject("审核打回", "4");
					break;
				case '7':
					s = new StateObject("终止", "5");
					break;
				case '8':
					s = new StateObject("完成", "1");
					break;
				}	
				*/
				
//				case '1':
//					s = new StateObject("已完成", "1");
//					break;
//				case '0':
//					s = new StateObject("进行中", "2");
//					break;
//				case '2':
//					s = new StateObject("已终止", "5");
//					break;
//				case '104':
//					s = new StateObject("未指派", "3");
//					break;
//				case '8':
//					s = new StateObject("保存", "4");
//					break;
				
			}
			if (type == 4 || type == 5 ) {
				switch (stateId.toString()) {
				case '0':
					s = new StateObject("在线", "1");
					break;
				case '1':
					s = new StateObject("离线", "4");
					break;
				}
			}
			pageData["topicStatus"] = s.getStateName();
			pageData["stateType"] = s.getStateType();
			return pageData;
		},
		/**
		 * 初始化当前列表信息的地址标示
		 */
		showTabMapPoint : function(type, currPage) {
			// 移除地图列表图标
			$(".tab_mapPoint_default").parent().remove();
			var itemName = c.itemName(type.toString());
			var data = c.getPageData(type, currPage, PageSize);
			// 根据坐标添加地址信息
			points = new Array();
			var iconNum = 0;
			if (data != null && data.records.length > 0) {
				for (var i = 0; i < data.records.length; i++) {
					var records = data.records[i];
					if(records.topicLongitude==null||records.topicLongitude=="" ||records.topicLatitude==null||records.topicLatitude=="")
						continue;
						
					//if(records.topicLongitude != ""){
						iconNum = iconNum + 1;
					//}
					var point = new BMap.Point(records.topicLongitude,
							records.topicLatitude);
					//用于调整地图缩放级别
					points.push(point);
					
					html = "<div style='background:transparent;position: relative;' class='tab_mapPoint_default'>"
							+ "<img style='width: 60px;' class='mapicon1_"+ records.topicGuid+ "' src='../../static/images/tip_"+type+".png'>"
							+ "<div style='position: absolute; top: 20px; left: 25px;color:#FFFFFF;'>"+iconNum+"</div> "
							+ "</div>" 
							+ "<div id='label_"
							+ type
							+ "_"
							+ records.topicGuid
							+ "' class='map-message' style='display:none;'>";
					html += mySubString(records.topicTitle, 0, 25) + "</div>";
					var marker = new BMapLib.RichMarker(html, point, {
						"anchor" : new BMap.Size(-15, -42),
						"enableDragging" : false
					});
					
					c.addClickHandler(marker, records.topicGuid, type);    //zhy mof ,for clickmark show info
					
					//c.addMouseHandler(marker, records.id, type, '1');
					map.addOverlay(marker);
				}
				
				//调整当前地图大小能显示所有列表坐标(常州台不需要进行调整)
				if(MapneedSetViewPort)
					map.setViewport(points); 
				
				
				// 设置marker为透明,设置marker的显示优先级
				$(".tab_mapPoint_default").parent().css("background","transparent");
				$(".tab_mapPoint_default").parent().css("z-index", "-1000");
			}
		},
		/**
		 * 将地图的中心焦点移到指定坐标
		 */
		focusPoint : function(Longitude, Lantitude) {
			if (Longitude != null && Longitude.length > 0 && Lantitude != null
					&& Lantitude.length > 0) {
				var fpoint = new BMap.Point(Longitude, Lantitude);
				map.centerAndZoom(fpoint, 17);
			}
		},
		/**
		 * 给marker添加点击事件
		 */
		addClickHandler : function(marker, id, type) {
			//if (type == '4') {                                     //zhy od for showotherTypeicon info
				marker.addEventListener("click", function(e) {
					// 清除其他图标的点击效果
					//$("img[class^='mapicon1']").prop("src",
					//		"../../ccbn/images/blue.png");
					
					var isOrgshow = $("#label_" + type + "_" + id).is(':visible');
					
					var otherIcons = $("div[id^='label2_']");
					if(otherIcons!=null && otherIcons.length>0)
					{
						for(i=0;i<otherIcons.length;i++){
							var con = otherIcons[i];
							if(con!=null && con.id!=null && con.id!="" && $("#" + con.id).is(':visible')){
								var orgParentz = $("#" + con.id).attr("orgz");
								if(orgParentz!=null && orgParentz!=""){
									$("#" + con.id).parent().css("z-index", orgParentz);
									$("#" + con.id).attr("orgz","");
									break;
								}								
							}							
						}
					}
					
					$("div[id^='label_']").hide();
					$("div[id^='label2_']").hide();
					
					//$(".mapicon1_" + id).prop("src",
					//		"../../ccbn/images/red.png");
					if(!isOrgshow)
						$("#label_" + type + "_" + id).show();
					
					c.toDetail(id);
					
					
					//zhy add for send mapmark msg
					var ifshow="0";
					if(!isOrgshow)
						ifshow="1";
					else
						ifshow="0";
					var msg = '{"type":"mapmarkclick","iconType":"1"' +
						      ',"resid":"' +id+ '"' + 
						      ',"tabType":"' +type+ '"' +
						      ',"showstate":"' +ifshow+ '"}';
		    		send(msg);
					
				});
			//}
		},
		
		addClickHandler2 : function(marker, id, type) {              //zhy add for showotherpageicon info
			//if (type == '4') {
				marker.addEventListener("click", function(e) {
					
					
					var isOrgshow = $("#label2_" + type + "_" + id).is(':visible');
					
					var orgParentz;
					if(isOrgshow)
						orgParentz = $("#label2_" + type + "_" + id).attr("orgz");
					else
						orgParentz = $("#label2_" + type + "_" + id).parent().css("z-index");
					
					
					var nowIconID = "#label2_" + type + "_" + id;
					var otherIcons = $("div[id^='label2_']");
					if(otherIcons!=null && otherIcons.length>0)
					{
						for(i=0;i<otherIcons.length;i++){
							var con = otherIcons[i];
							if(con!=null && con.id!=null && con.id!="" && $("#" + con.id).is(':visible') && con.id!=nowIconID){
								var orgParentz = $("#" + con.id).attr("orgz");
								if(orgParentz!=null && orgParentz!=""){
									$("#" + con.id).parent().css("z-index", orgParentz);
									$("#" + con.id).attr("orgz","");
									break;
								}								
							}							
						}
					}
										
					$("div[id^='label_']").hide();	
					$("div[id^='label2_']").hide();
					
					if(!isOrgshow)
					{
						$("#label2_" + type + "_" + id).parent().css("z-index", "-1000");
						$("#label2_" + type + "_" + id).attr("orgz",orgParentz);
						
						$("#label2_" + type + "_" + id).show();							
					}
					else
					{
						$("#label2_" + type + "_" + id).parent().css("z-index", orgParentz);
						$("#label2_" + type + "_" + id).attr("orgz","");
					}
					
					//zhy add for send mapmark msg
					var ifshow="0";
					if(!isOrgshow)
						ifshow="1";
					else
						ifshow="0";
					var msg = '{"type":"mapmarkclick","iconType":"2"' +
						      ',"resid":"' +id+ '"' + 
						      ',"tabType":"' +type+ '"' +
						      ',"showstate":"' +ifshow+ '"}';
		    		send(msg);
		    		
				});
		    //}
		},
		/**
		 * 给marker添加鼠标滑过事件
		 */
		addMouseHandler : function(marker, id, type, iconType) {
			marker
					.addEventListener(
							"mouseover",
							function(e) {
								// 鼠标移动到标示上，将标示层级提到最高
								var container = e.target._container;
								var zindex = $(container).css("z-index");
								$(container).css("z-index",
										parseInt(zindex) + 100000000);
								if (iconType == '1') {
									$(".mapicon1_" + id)
											.each(
													function() {
														var src = $(this).prop(
																"src");
														if (src.indexOf("red") <= 0) {
															$(this)
																	.prop(
																			"src",
																			"../../ccbn/images/yellow.png");
															$(
																	"#label_"
																			+ type
																			+ "_"
																			+ id)
																	.show();
														}
													});
								} else {
									$("#label2_" + type + "_" + id).show();
								}

							});
			marker
					.addEventListener(
							"mouseout",
							function(e) {
								// 鼠标移出标示外，将标示层级还原
								var container = e.target._container;
								var zindex = $(container).css("z-index");
								$(container).css("z-index",
										parseInt(zindex) - 100000000);
								if (iconType == '1') {
									$(".mapicon1_" + id)
											.each(
													function() {
														var src = $(this).prop(
																"src");
														if (src.indexOf("red") <= 0) {
															$(this)
																	.prop(
																			"src",
																			"../../ccbn/images/blue.png");
															$(
																	"#label_"
																			+ type
																			+ "_"
																			+ id)
																	.hide();
														}
													});
								} else {
									$("#label2_" + type + "_" + id).hide();
								}
							});
		},
		/**
		 * 给tab的列表内容添加鼠标滑过事件
		 */
		addMouseToTabList : function(type) {
			$('#section-iconbox-' + type).find(".data-cont").bind(
					'mouseover',
					function() {
						var mapicon = $(this).find("img[class*='mapicon1_']");
						var classStr = mapicon.attr("class");
						$("." + classStr).prop("src",
								"../../ccbn/images/yellow.png");
						// 将地图中的标示的zindex重新设置使其置顶
						var marker = $("#allmap").find("." + classStr).parent()
								.parent();
						var zindex = marker.css("z-index");
						marker.css("z-index", mapicon_zindex++);
					});
			$('#section-iconbox-' + type).find(".data-cont").bind(
					'mouseout',
					function() {
						var mapicon = $(this).find("img[class*='mapicon1_']");
						var classStr = mapicon.attr("class");
						$("." + classStr).prop("src",
								"../../ccbn/images/blue.png");
					});
		},
		/**
		 * 连接按钮
		 */
		toConnect : function(workNo) {
			// boxAlert("已通知到对方，连线中....");
			var formData = {
				'changerWorkNo' : userInfo.workNo,
				'memberWorkNo' : workNo
			}
			$.ajax({
				type : 'POST',
				async : false,
				dataType : 'json',
				url : 'api/quanshi/joinMeeting',
				contentType : "application/json;charset=UTF-8",
				data : JSON.stringify(formData),
				success : function(data) {
					console.info(JSON.stringify(data));
					if (data.success) {
						boxAlert("已通知到对方，连线中....");
					} else {
						boxAlert(data.errorDesc);
					}
				}
			});
		},
		/**
		 * 跳转人员详情页
		 */
		toDetail : function(id) {
			/*
			//判断是车辆还是人员
        	var typeSelect = $('#section-iconbox-5').attr('class');
        	if("content-current" == typeSelect){
        		return false;
        	}
			//$('.cont-people').show();
			var data = JSON.parse(window.localStorage.getItem("userdetail")).data;
			for (var i = 0; i < data.records.length; i++) {
				var user = data.records[i];
				if (user.id == id) {
					//user = c.formatPageData(4, data.records[i]);
					var json = {
						"userId" : id.toString()
					};
					
					// 获取额外的用户信息
					ajaxRequest({
						type : "POST",
						contentType : "application/json;charset=utf-8",
						url : system.getServerPath()+"/mapUser/queryUserDetail",
						data : JSON.stringify(json),
						success : function(data) {
							console.log("111111"+data);
							if (data != null && data.records.length > 0){
								var extraUser = data.records[0];
								user["phone"] = extraUser.phone;
								user["curSelectList"] =  extraUser.curSelectList; 
								user["curTaskList"] =  extraUser.curTaskList; 
								user["deviceName"] = extraUser.deviceName;
							}
							var html = template('user_toDetail', user);
							$(".cont-people").html('');
							$(".cont-people").append(html);
							var addres = $('#section-iconbox-4').find(
									"#address" + id).text();
							$(".detail_address").text(addres);
							$('.cont-right').hide();
							// 根据开关判断是否启用连线功能
				        	if(system.isOnLine() == 'true'){
				        		$('.onLineDiv').show();
				        	}
							// 将空字符串替换为 无 字
							var spandetail_1 = $(".userDetail_span_1");
							var spandetail_2 = $(".userDetail_span_2");
							var spandetail_3 = $(".userDetail_span_3");
							if($.trim(spandetail_1.text())==""||spandetail_1.text()=='null'){
								spandetail_1.html("    无");
							}
				            if(user.curTaskList.length<=0){
				            	spandetail_2.html("<span class='select_task_title'>无</span>");
				            }
				            if(user.curSelectList.length<=0){
				            	spandetail_3.html("<span class='select_task_title'>无</span>");
				            }
						},
						failure : function(form, action) {
							var html = template('user_toDetail', user);
							$(".cont-people").html('');
							$(".cont-people").append(html);
							var addres = $('#section-iconbox-4').find(
									"#address" + id).text();
							$(".detail_address").text(addres);
							$('.cont-right').hide();
							// 将空字符串替换为 无 字
							var spandetail_1 = $(".userDetail_span_1");
							var spandetail_2 = $(".userDetail_span_2");
							var spandetail_3 = $(".userDetail_span_3");
							if($.trim(spandetail_1.text())==""||spandetail_1.text()=='null'){
								spandetail_1.html("    无");
							}
				            if(user.curTaskList.length<=0){
				            	spandetail_2.html("<span class='select_task_title'>无</span>");
				            }
				            if(user.curSelectList.length<=0){
				            	spandetail_3.html("<span class='select_task_title'>无</span>");
				            }
						}
					});
					break;
				}
			}
		*/
		},
		// 返回
		toUserList : function() {
			$('.cont-people').hide();
			$("img[class^='mapicon1_']").prop("src",
					"../../ccbn/images/blue.png");
			$("div[id^='label_4']").hide();
			$('.cont-right').show();
		},
		/**
		 * 弹出选题编辑
		 */
		onXuantiByid : function(_this) {
			$("#xuantiModel").empty();
			var html = "<iframe id='addBaotiIframe' width='100%' frameborder='0' topmargin='0' leftmargin='0' height='770' src='../../newstask/ifframe/toXuantiGroup.do?taskguid="+_this+"'>" + "</iframe>";
			$("#xuantiModel").append(html);
		},
		// 移出video标签
		doRemove : function() {
			$("#addBaotiIframe").attr("src", "");
		},
		/**
		 * 弹出当前任务窗口
		 */
		onSonTaskClick : function(_this) {
			$.post("../../xuanti/inXuantiToSonTaskByID.action", {
				MGuid : _this
			}, function(data) {
				$("#sontaskChangeManSpan").html(
						data.typeValue + "      " + data.mchargeMan);
				if (data.devices == null) {
					$("#sontaskDeviceSpan").html("");
				} else {
					$("#sontaskDeviceSpan").html("设备：" + data.devices);
				}
				/*
				 * if(data.inPeople == ""){ $("#sontaskPeopleSpan").html("");
				 * }else{ $("#sontaskPeopleSpan").html("参与人员："+data.inPeople); }
				 */
				$("#sontaskContentSpan").html(data.mevents);

			}, "json");
		},
		// 移出video标签
		doRemove : function() {
			$("#addBaotiIframe").attr("src", "");
			$("#gps").css("padding-right", "0px");
		},
		/**
		 * 根据坐标获取地址
		 */
		setAddress : function(Longitude, Lantitude, id, type) {
			var pt = new BMap.Point(Longitude, Lantitude);
			var geoc = new BMap.Geocoder();
			geoc.getLocation(pt, function(rs) {
				var addComp = rs.addressComponents;
				var address = addComp.city + addComp.district + addComp.street
						+ addComp.streetNumber;
				$('#section-iconbox-' + type).find("#address" + id).html(
						address);
			});
		},
		/**
		 * 根据查询条件重置列表数据缓存
		 */
		resetCacheByQuery : function(type,baysnc) {
			// 获取type列表下的筛选条件
			var state = $("#section-iconbox-" + type).find(
					"select option:selected").val();
			if (state == "all") {
				state = "";
			}
			var searchContent = $.trim($("#section-iconbox-" + type).find(
					".input-group > input[type='text']").val());
			c.initCacheDate(type, state, searchContent,baysnc);
		},
		/**
		 * 加载当前列表之外的其他地图图标
		 */
		loadOtherIcon : function(type) {
			// 清除地图上的小图标
			//$("img[class^='mapicon2_']").parent().remove();
			$(".tab_mapPoint_default2").parent().remove();    //zhy mod
			
			// 获取当前页号
			var currPage = $('.content-current').find(".laypage_curr").text();
			var itemName = c.itemName(type.toString());
			// 获取当前列表的总页数
			var data = JSON.parse(window.localStorage.getItem(itemName
					.toString()));
			var totalPage = 1;
			
			if (data != null && data.data.list.length > 0) {
				totalPage = Math.floor((data.data.totalCount + PageSize - 1)
						/ PageSize);
			}
			if (totalPage > 1) {
				// 将data中当前页的records数据移除
				var startNo = (currPage - 1) * PageSize;
				data.data.list.splice(startNo, PageSize);
			}
			// 加载其他列表的所有小图标
			for (var i = 1; i <= 5; i++) {
				// 如果列表只有1页则不需要
				if (i == type && totalPage <= 1)
					continue;
				var cacheName = c.itemName(i.toString());
				if (i == type) {
					var otherData = data;
				} else {
					var otherData = JSON.parse(window.localStorage
							.getItem(cacheName.toString()));
				}
				if (otherData != null && otherData.data.list.length > 0) {
					// 根据不同类型添加地图图标
					for (var j = 0; j < otherData.data.list.length; j++) {
						var records = otherData.data.list[j];
						
						if(records.topicLongitude==null||records.topicLongitude=="" ||records.topicLatitude==null||records.topicLatitude=="")
							continue;
							
						var point = new BMap.Point(records.topicLongitude,
								records.topicLatitude);
						var deviceType = "";
						var iconNum = j + 1;
						if (i == 5) {
							// 暂时无字段区分是车辆还是拍摄设备
							// deviceType = "_"+records.deviceType;
							deviceType = "_" + "1";
						}
						/*html = "<div style='position: relative;cursor: pointer;'> "
							    +"<img style='width: 35px;' class='mapicon2_"+ records.topicGuid+ "' src='../../static/images/tip_"+i+".png'>"
							    + "<div style='position: absolute; top: 0; left: 8px;'>"+iconNum+"</div> "
							    + "</div> "
								+ "</div><div id='label2_"
								+ type
								+ "_"
								+ records.topicGuid
								+ "'+ class='map-message2' style='display:none;'>"*/
						
						/*  //zhy mod
						html = "<img style='width: 35px;' class='mapicon2_"+ records.topicGuid+ "' src='../../static/images/tip_"+i+".png'>"
									+ "<div id='label2_"
									+ type
									+ "_"
									+ records.topicGuid
									+ "'+ class='map-message2' style='display:none;'>";
						html += mySubString(records.topicTitle, 0, 25) + "</div>";
						*/
						
						html = "<div style='background:transparent;position: relative;' class='tab_mapPoint_default2'>"
							+ "<img style='width: 35px;' class='mapicon2_"+ records.topicGuid+ "' src='../../static/images/tip_"+i+".png'>"							
							+ "</div>" 
							+ "<div id='label2_"
							+ type
							+ "_"
							+ records.topicGuid
							+ "' orgz='' class='map-message2' style='display:none;'>";
						html += mySubString(records.topicTitle, 0, 25) + "</div>";
					
						var marker = new BMapLib.RichMarker(html, point, {
							"anchor" : new BMap.Size(-5, -25),
							"enableDragging" : false
						});
						
						c.addClickHandler2(marker, records.topicGuid, type);    //zhy mof ,for clickmark show info
						
						//c.addMouseHandler(marker, records.id, type, '2');
						
						map.addOverlay(marker);
					}
					
					// 设置marker为透明
					//$("img[class^='mapicon2_']").parent().css("background","transparent");  //zhy mod
					$(".tab_mapPoint_default2").parent().css("background","transparent");					
					
				}
			}
		},
		/**
		 * 根据tab标签类型 返回本地缓存名称
		 */
		itemName : function(type) {
			var itemName = "";
			switch (type) {
			case '1':
				itemName = "cluedetail";
				break;
			case '2':
				itemName = "reportdetail";
				break;
			case '3':
				itemName = "selectdetail";
				break;
			case '4':
				itemName = "userdetail";
				break;
			case '5':
				itemName = "devicedetail";
				break;
			}
			return itemName;
		},
		/**
		 * 根据tab标签类型 返回请求根路径
		 */
		tabUrl : function(type) {
			var tabUrl = "";
			switch (type) {
			case '1':
				tabUrl = appServiceUrl+"/mapHJClue/queryHJClue";
				break;
			case '2':
				tabUrl = appServiceUrl+"/mapBaoti/queryBaoti";
				break;
			case '3':
				tabUrl = appServiceUrl+"/topic/queryAllTopic";
				break;
			case '4':
				tabUrl = appServiceUrl+"/mapUserOrDevice/queryUserOrDeviceGpsInfo";
				break;
			case '5':
				tabUrl = appServiceUrl+"/mapUserOrDevice/queryUserOrDeviceGpsInfo";
				
				break;
			}
			return tabUrl;
		},

		contsDetail : function() {
			$('.cont-people').show();
			$('.cont-right').hide();
			$('.details-lists').css('height',
					($('.cont-people').height - 45) + 'px');
		},
		
		 /**
         * 连接按钮
         */
        toConnect:function(memberName){
        	var changerName = system.getUsername();
        	var formData = {
        	   'onlineType' : 1,
      		   'changerName' : changerName,
     		   'memberName' : memberName
        	}
        	$.ajax({
	               type : 'POST',
	               async : false,
	               dataType : 'json',
	               url : system.getServerPath()+'/quanshi/joinMeeting',
	               contentType : "application/json;charset=UTF-8",
	               data : JSON.stringify(formData),
	               success : function(data) {
	               if(data.success){
	            	   boxAlert("已通知到对方，连线中....");
		       	   }else{
		       		   boxAlert(data.errorDesc);
	  			   }
	           	}
		   });
        },
        /**
         * 关闭选题模态窗口
         */
        baotiClose:function(){
    		$("#xuantiClick").modal('hide');
    	},
    	
    	 backCommand : function() {
         	window.history.back(-1);
         },

		empty : null
	}
}();
$(MediaSystem.init());
window.onload = function () { 
	
	
	$("#li_4").trigger("click");                                             
	$('#tabList').find('#li_4').attr("class","tab-current active");          
	boxshow();
};


function boxhide(){
	$("#box1").hide();
	$("#box2").hide();
}

function boxshow(){
	$("#box1").show();
	$("#box2").show();
	
}

function onLineGo(lineType){
	var linenum = "";
	$("input[name='userCheckbox']:checked").each(function(){
		linenum = linenum + $(this).val() + ",";
	})
	if(linenum.length > 0){
		linenum = linenum.substring(0, linenum.length-1);
		
		
		var params = {};
		params.queryModel = lineType;
		params.chargeman = linenum;
		params.userId = defaultUserId;
		$.ajax({
		    type : 'POST',
	        async : false,
	        dataType : 'json',
			url : '/DYBigScreen/DYNewsCommandMobileInterface/onLineGo.do',
	        contentType : "application/json;charset=UTF-8",
	        data : JSON.stringify(params),
	        success : function(data) {
	        	console.info(JSON.stringify(data));
				if (data.status) {
					//alert("已通知到对方，连线中....");
					window.open(data.data);
				} else {
					alert(data.msg);
				}
	        }
	        });
		
	}
	
	
	
}



