$(function(){
	init();
});

var selectListMsg = "";    //储存查询需要发送的消息字符串
//var projectiveTaskId =""; //正在投屏的id
//var isProjective = false;
//var isfirst = true;
var firstTaskGuid = "";
//初始化方法
function init(){
	//loadServerUrl();
	
	/////////////////////////////////////zhy add
	var htmlStatus1="";
	for(var z=0;z<xuantiStatusDesp.length;z++)
	{
		htmlStatus1 +='<option value="' + z + '">'+ xuantiStatusDesp[z] +'</option>';
	}	
	var htmlStatus2 = '<option value="">全部状态</option> ' + htmlStatus1;
	document.getElementById('status').innerHTML = htmlStatus2;
	
	// $("#lunbopinlv").val(todaySelectSwitchFrequncy);
	
	/////////////////////////////////////////////////////////
	
	
	
	queryColumn();
	queryUser();
	loadSelectApiList();
	$(".select").change(function() {
		loadSelectApiList();
	});
}
//返回选题进展
function backSelectProcess(){
	//isProjective = false;
	//projectiveTaskId="";
	$(".projective").removeClass().prop("src","../../images/icon1.png");
	send(selectListMsg);
}

// 获取选题列表
function loadSelectApiList(start) {
	var startNum = 1;
	var searchContent = $("#searchContent").val();//搜索内容
	var column = $("#column  option:selected").val();
	var status = $("#status  option:selected").val();
	var chargeMan = $("#chargeMan  option:selected").val();
	if(start){
		startNum = start;
	}
	// 构建JSON数据信息
	var params = {};
	params.start = startNum;
	params.limit = 8;
	params.isShow = 1;//是否上屏（0，不上屏 ；1，上屏）
	params.userId = defaultUserId;
	if(searchContent){
		params.searchContent = searchContent;
	}
	if(column){
		params.owncolumn = column;
	}
	if(status!=null && status!=""){
		params.xuantistate = status;
	}else{
		params.xuantistate = -1;
	}
	if(chargeMan){
		params.chargeman = chargeMan;
	}
	var url = window.localStorage.getItem("zhihuidiaoduURL");
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/selectProgressList.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
		success : function(data) {
			if (data.commonResponse.success == true) {
				var rlength=getjsonLength(data.records);
        		for(var m=0;m<rlength;m++){
        			//对于过长的title 进行截取 长度超过20的减为20
        			if(data.records[m].title.length>30){
        				data.records[m].title=data.records[m].title.substring(0,30)+"...";
        			}
        			if(data.records[m].content.length>40){
        				data.records[m].content=data.records[m].content.substring(0,100)+"...";
        			}
        			if(data.records[m].status!=null)
        				data.records[m].statusdesp = xuantiStatusDesp[data.records[m].status];
        			
        			if(data.records[m].ownColumn==null || data.records[m].ownColumn=="")
        				data.records[m].ownColumn = defaultPrePushCliname;
        		}
				var html = template('select-list-item', data);
				document.getElementById('select').innerHTML = html;
				//正在投屏的信息 若有 则设置投屏的图标效果
				//$("#"+projectiveTaskId).prop("src","../../images/icon2.png").addClass("projective");
				//设置列表第一个选题为投屏图标效果
				if(data.records.length>0){
					firstTaskGuid = data.records[0].taskGuid;
					$("#img_"+firstTaskGuid).prop("src","../../images/icon2.png").addClass("projective");
				}
				//2、设置分页
				var totalCount = data.totalCount;//总条目数
				var currentPage = data.currentPage//当前页
				var totalPage = Math.ceil(totalCount/8);//总页数
//				console.info(totalPage);
				setPagination(totalPage,currentPage);
				//3、向客户端发送数据(定时器是为了解决初始化方法还未执行完，无法加载websocket的问题)
				data.type = "selectProgress";
				//判断是否正在投屏
				/*if(isProjective){
					//正在投屏 不发送消息 将消息保存
					selectListMsg = JSON.stringify(data);
				}else{*/
					//未投屏 发送消息
					setTimeout(function(){
						send(JSON.stringify(data));
					},500);
				//}
				/*if(isfirst){
					//初始化时保存默认消息
					isfirst=false;
					selectListMsg= JSON.stringify(data);
				}*/
			} else {
				alert(data.commonResponse.errorDesc);
			}
		}
	})
}


function getjsonLength(json){
    var jsonLength=0;
    for (var i in json) {
        jsonLength++;
    }
    return jsonLength;
}

//设置分页
function setPagination(totalPage,currentPage) {
	var html = 		
		'<li class="prev"><a href="#" onclick="toPage(\''+totalPage+'\',\''+currentPage+'\',\'prev\');" title="Prev"><i class="fa fa-angle-left"></i>上一页</a></li>'+
		'<li><a href="#">'+currentPage+'/'+totalPage+'</a></li>'+
		'<li class="next"><a href="#" onclick="toPage(\''+totalPage+'\',\''+currentPage+'\',\'next\');" title="Next">下一页<i class="fa fa-angle-right"></i></a></li>';
	document.getElementById('pagination').innerHTML = html;
}

//上一页，下一页
function toPage(totalPage,currentPage,type) {
	if(type == "next"){
		if(currentPage != totalPage){
			loadSelectApiList(Number(currentPage) + 1);
			
		}else{
			alert("已经是最后一页");
		}
	}else{
		if(currentPage != 1){
			loadSelectApiList(currentPage-1);
		}else{
			alert("已经是第一页");
		}
	}
}

// 获取全部栏目
function queryColumn() {
	
	var params = {};
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/columnList.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
        success : function(data) {
        	console.info(JSON.stringify(data));
        	if (data.status == true) {
				// console.info(JSON.stringify(data));
				var html2;
				if (data.data != null) {
					$.each(data.data, function(i, item) {
						html2 = html2 + '<option value=' + item.id + '>'+ item.name + '</option>';
					});
				}
				html = '<option value="">栏目</option>' + html2;
				document.getElementById('column').innerHTML = html;
			} else {
				alert(data.commonResponse.errorDesc);
			}
        }
        });
	
	/*
	ajaxRequest({
		type : 'POST',
		url : '../../api/queryColumn',
		success : function(data) {
			if (data.commonResponse.success == true) {
				// console.info(JSON.stringify(data));
				var html2;
				if (data.records != null) {
					$.each(data.records, function(i, item) {
						html2 = html2 + '<option value=' + item.column + '>'+ item.column + '</option>';
					});
				}
				html = '<option value="">栏目</option>' + html2;
				document.getElementById('column').innerHTML = html;
			} else {
				alert(data.commonResponse.errorDesc);
			}
		}
	})*/
	
	
	
}

function queryUser() {
	
	var params = {};
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
        url : '/DYBigScreen/DYNewsCommandMobileInterface/userList.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
        success : function(data) {
        	console.info(JSON.stringify(data));
        	if (data.status == true) {
				// console.info(JSON.stringify(data));
				var html2;
				if (data.data != null) {
					$.each(data.data, function(i, item) {
						html2 = html2 + '<option value=' + item.id + '>'+ item.name + '</option>';
					});
				}
				html = '<option value="">负责人</option> ' + html2;
				document.getElementById('chargeMan').innerHTML = html;
			} else {
				alert(data.msg);
			}
        }
        });
	
	/*var url = window.localStorage.getItem("zhihuidiaoduURL");
	var token = "token";
	var columnId = "ccbnbdz";
	ajaxRequest({
		type : 'POST',
		async : true,
		url : url+'/api/cre/getUsers',
		data:JSON.stringify({
           	'token' : token,
           	'orgId' : columnId
        }),
		success : function(data) {
			if (data.commonResponse.success == true) {
//				console.info(JSON.stringify(data));
			 	var html2;
				if (data.records != null) {
					$.each(data.records, function(i, item) {
						html2 = html2 + '<option value=' + item.id + '>'+ item.username + '</option>';
					});
				}
				html = '<option value="">负责人</option> ' + html2;
				document.getElementById('chargeMan').innerHTML = html;
			} else {
				alert(data.commonResponse.errorDesc);
			}
		}
	})
	ajaxRequest({
		type : 'GET',
		url : '../../api/usercolumn/123',
		success : function(data) {
			if (data.commonResponse.success == true) {
				// console.info(JSON.stringify(data));
				var html2;
				if (data.userInfos != null) {
					$.each(data.userInfos, function(i, item) {
						html2 = html2 + '<option value=' + item.userName + '>'+ item.userName + '</option>';
					});
				}
				html = '<option value="">负责人</option> ' + html2;
				document.getElementById('chargeMan').innerHTML = html;
			} else {
				alert(data.commonResponse.errorDesc);
			}
		}
	})*/
}


//投屏到选题详情页面
function toSelectDetail(id,target){
	//判断是否是投屏状态
	var img = $(target);
	if(img.is(".projective")){
		//取消投屏 判断取消的是否是第一个选题,若不是才能取消投屏，取消投屏跳转到默认的第一条选题
		if(firstTaskGuid!=id){
			//已投屏 则关闭投屏 发送消息 返回到列表展示
			//isProjective = false;
			//projectiveTaskId="";
			img.removeClass();
			img.prop("src","../../images/icon1.png");
			var msg = {};
			msg.type = "selectDetail";
			msg.content = firstTaskGuid;
			send(JSON.stringify(msg));
			$("#img_"+firstTaskGuid).prop("src","../../images/icon2.png").addClass("projective");
		}
	}else{
		//未投屏  发送消息让大屏跳转到对应详细
		isProjective = true;
		$("img[class='projective']").removeClass().prop("src","../../images/icon1.png");;
		img.addClass("projective");
		img.prop("src","../../images/icon2.png");
		projectiveTaskId = img.attr("id");
//		console.info(id);
		var msg = {};
		msg.type = "selectDetail";
		msg.content = id;
		send(JSON.stringify(msg));
	}

}

function loadServerUrl(){
	var url="";
	/*ajaxRequest({
		type : 'GET',
		url : '../../api/user/queryServerUrl?type=31',
		success : function(data) {
			if (data.commonResponse.success == true) {
				window.localStorage.setItem("zhihuidiaoduUrl", JSON.stringify(data.url));
				url = data.url;
			} 
		}
	});*/
	window.localStorage.setItem("zhihuidiaoduURL", url);
	return url;
}

function switchfrequncychange(){
	
	// var swtichrequncy = $("#lunbopinlv").val();//搜索内容
	if(null==swtichrequncy || ""==swtichrequncy)
		return;
	var correctVal = parseInt(swtichrequncy);
	if(null==correctVal || Number.isNaN(correctVal))
	{
		alert("设置参数填写有误!");
		return;
	}
	
	var commandType   = "11";
	
	// 构建JSON数据信息
	var params = {};
	params.handleCommand            = commandType;
	params.todaySelectSwiperFrequcy = swtichrequncy;
	
	
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/handlesystemconfigparam.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
		success : function(data) {
			if (data.state == 0) {
				var sysSwtichrequncy = data.todaySelectSwiperFrequcy;
				todaySelectSwitchFrequncy = sysSwtichrequncy;
				// $("#lunbopinlv").val(sysSwtichrequncy);				
				alert("设置参数成功！");	
				
				var msg = {};
				msg.type = "changetsfrequncy";
				msg.content = sysSwtichrequncy;
				send(JSON.stringify(msg));
				
			} else {
				alert("设置参数失败！");
				var orgSysSwtichrequncy = data.todaySelectSwiperFrequcy;				
				// $("#lunbopinlv").val(orgSysSwtichrequncy);
			}
		}
	});
}



//------------------发送消息模块-------------------------//
var websocket = null;
var pageId = "selectProgress";
//判断当前浏览器是否支持WebSocket
if('WebSocket' in window){
    websocket = new WebSocket("ws://"+baseUrl+"/DYBigScreen/websocket/"+pageId);
}
else{
    alert('Not support websocket')
}
//连接发生错误的回调方法
websocket.onerror = function(){
    alert("error");
};
 
//连接成功建立的回调方法
websocket.onopen = function(event){
    console.info("open");
}
//连接关闭的回调方法
websocket.onclose = function(){
    console.info("close");
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