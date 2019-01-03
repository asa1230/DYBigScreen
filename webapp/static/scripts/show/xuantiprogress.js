
var progress = function(){
	
	
	var curHtml = "";
	
	var remainData = null;
	
	var INIT_LIMIT = 10;
	
	var isFirst = true;
	
	var topic_status = {
			"1" : "保存",
			"2" : "待选",
			"3" : "进行中",
			"4" : "审核中",
			"5" : "审核通过",
			"6" : "审核打回",
			"7" : "终止",
			"8" : "已发布"
	};
	
	var topicStatus = {
			/*
			"2" : "#7856BE",
			"3" : "#6CE894",
			"4" : "#275EBB",
			"5" : "#55B98B",
			"6" : "#EB536B",
			"7" : "#ECAC46",
			"8" : "#69C7F7"
			*/
			"2" : "#3CF",
			"3" : "#3CF",
			"4" : "#FF0",
			"5" : "#3CF",
			"6" : "#F00",
			"7" : "#F00",
			"8" : "#3C0"
	};
	
	var statusColor = function(status){
		$("#topicStatus").css({"background":topicStatus[status]});
	}
	
	var getHtml = function(topicInfo){
		var data = {};
		data.topicInfo = topicInfo;
		var html = template('item_template',data);
		return html;
	};
	
	var c = null;
	var getDetailHtml = function(topic){
		var data = {};
		//根据选题id获取选题详情
		$("#resourceList").empty();
		
		var params={};
		params.id=topic.taskGuid;
		params.type=1;
		ajaxRequest({
			type : 'POST',
			async : true,
			dataType : 'json',
			url : '/DYBigScreen/DYNewsCommandMobileInterface/selectProgressDetailes.do',
			contentType : "application/json;charset=UTF-8",
			data : JSON.stringify(params),
			success : function(data) {
				console.info(">>>>>从后台详情。。。。");
				console.info(data);
				console.info(JSON.stringify(data));			
				
				
				if (data.commonResponse.success == true) {
					data.title=data.title.substring(0,20)+"...";
					data.content=data.content.substring(0,200)+"...";					
					if(data.content != null){
						var div = document.createElement("div");		//去掉HTML格式，变成纯文本
						div.innerHTML = data.content;
						data.content = div.innerText;
					}
					
					if(data.resourceList && $(data.resourceList).size() > 0){
						data.records = data.resourceList;
						html = template('resource_template',data);
						$("#resourceList").append(html);
					}				
				}
			},
			error : function() {
			}
		
		});
/*		
		var url = systemConfig.serverPath + 'topic/getTopicInfoByGuid?topicGuid='+topic.topicGuid;
		dp.util.ajaxRequest({
			url : url,
			type : "GET",
			contentType : "application/json;charset=utf-8",
//			data : JSON.stringify(json),
//			async : flag,
			isDefaultUser:true,
//			dataType : 'json',
			success : function(data) {
				console.info(">>>>>从后台详情。。。。");
				console.info(data);
				if(data.data.resources && $(data.data.resources).size() > 0){
					data.records = data.data.resources;
					html = template('resource_template',data);
					$("#resourceList").append(html);
				}
			},
			error : function() {
			}
		});
*/		
		
	};
	
	var doscroll = function(){
		var $parent = $('#progress_gress');
		var $first = $parent.find('div:first').height();
		var $child =$("#progress_gress div");
		$parent.animate({
			marginTop:-$first
		},1000,function(){
			
			$parent.css('marginTop',0);
//			$child.slice(0,1).appendTo($parent);
			moveOne();
//			var html = getHtml(remainData[10]);
//	    	 $parent.append(html);
		})

	     console.info(">>>>>>remainData:");
	     console.info(remainData);
	     
	     if(remainData!=null&&remainData.length < 8){
	    	 loadData();
	     }
	     
	};
	
	function getjsonLength(json){
	    var jsonLength=0;
	    for (var i in json) {
	        jsonLength++;
	    }
	    return jsonLength;
	}
	
	var loadData = function(){		
		
		var params = {};
		params.start = 1;
		params.limit = 10;
		params.isShow = 1;//是否上屏（0，不上屏 ；1，上屏）
		params.userId = defaultUserId;
		params.xuantistate = -1;
		params.excludeStatus=["1","2"];
		
		var flag = !isFirst;
		
		dp.util.ajaxRequest({	
			//url : systemConfig.serverPath + 'topic/queryAllTopic',
			url : '/DYBigScreen/DYNewsCommandMobileInterface/selectProgressList.do',
			
			type : "POST",
			contentType : "application/json;charset=utf-8",
			
			//data : JSON.stringify(json),
			data:JSON.stringify(params),
			
			async : flag,
			
			//isDefaultUser:true,

			success : function(data) {
				console.info(">>>>>从后台获取数据。。。。");
				console.info(data);
				if(isFirst){
					remainData = [];
				}
				
				//if(data.status == true){
				if (data.commonResponse.success == true) {
					var rlength=getjsonLength(data.records);
					//for(var d in data.data.list){
            		for(var m=0;m<rlength;m++){
            			
            			//data.records[m].content=data.records[m].content.substring(0,60)+"...";
        				var div = document.createElement("div");		//去掉HTML格式，变成纯文本
        				div.innerHTML = data.records[m].content;
        				data.records[m].content = div.innerText;
					
						//remainData.push(data.data.list[d]);
            			remainData.push(data.records[m]);
            			
						var $parent = $('#progress_gress');
						
						//var html = getHtml(data.data.list[d]);
						var html = getHtml(data.records[m]);
						
				    	$parent.append(html);
					}
					isFirst = false;
				}
			},
			error: function (XMLHttpRequest, textStatus, errorThrown) {
				isFirst = false;
                console.log("错误信息" + errorThrown.toString());
                switch(XMLHttpRequest.status){
                	case 403:
                		alert("系统拒绝：您没有访问权限");
                		break;
                		
                	case 404:
                		alert("您访问的页面不存在！" + defaults.url);
                }
            }
		});
	};
	
	var initData = function(){
		loadData();
		
		
		var initHtml = "";
		for(var i = 0;i<INIT_LIMIT;i++){
			initHtml += getHtml(remainData[i]);
		}
		console.info(">>>>>remainData:");
		console.info(remainData);
		
		console.info(">>>>>initHtml:");
		console.info(initHtml);
		
		var $parent = $('#progress_gress');
		$parent.append(initHtml);
		

		if(remainData.length > 2){
			displayTopic(remainData[2]);
		}
	}
	
	var moveOne = function(){
		remainData.shift();
//		var next = $(".progress_march").next();
//		$(".progress_march").removeClass("progress_march").toggleClass("progress_news");
//		next.removeClass("progress_news").toggleClass("progress_march");
		if(remainData.length > 2){
			displayTopic(remainData[2]);
		}else{
			return ;
		}
		var $parent = $('#progress_gress');
		var $first = $parent.find('div:first');
		$first.remove();
	}
	
	var displayTopic = function(topic){
		console.info(">>>>>display topic......");
		console.info(topic);		
		
		$("#topicTitle").text(topic.title);
		$("#topicStatus").text(topic_status[topic.status]);
		statusColor(topic.status);
		$("#principal").text(topic.chargeMan);
		if(topic.modifytime != "" && topic.modifytime != null){
			var timestr = topic.modifytime.substr(0,10);
			$("#topicModifyTime").text(timestr);
		}
		
		
		$("#preReportColumn").text(topic.ownColumn);
		$("#topicContent").text(topic.content);
		
		//设置资源列表
		getDetailHtml(topic);

	};
	
	
	
	return {
		
		init : function(){
			initData();
			setInterval(function(){doscroll()}, 10000);
			
			c = this;
		},
		getStatus : function(statusCode){
			return topic_status[statusCode];
		},
		
		getStatusColor : function(statusCode){
			
			return topicStatus[statusCode];
		}
		
		
	};
}();



$(function(){
	
	template.helper("convertStatus",function(code){
	    return progress.getStatus(code);
	});
	template.helper("convertStatusColor",function(code){
		return progress.getStatusColor(code);
	});
	
	progress.init();
	
	
	
});


