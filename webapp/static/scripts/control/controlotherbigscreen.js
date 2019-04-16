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
	
	$("input[type=checkbox][id='tableBox']").prop('checked', false);
	loadSelectApiList();
	
	// 新建大屏
	$("#createBigscreen").on("click",function(){
		$(window.document).find("#ceateBigScreenModal").modal("show");
	})
	
	// 删除
	$("#deleteBigscreen").on("click",function(){
		$(window.document).find("#deleteModal").modal("show");
	})
	
	
	
    $("#createBigscreenName").keyup(function(){
        var len = $(this).val().length;
        if(len > 9){
            $(this).val($(this).val().substring(0,10));
        }
    });
	
	$("#editBigscreenName").keyup(function(){
		        var len = $(this).val().length;
		        if(len > 9){
		            $(this).val($(this).val().substring(0,10));
		        }
		    });
	
}

// 获取选题列表
function loadSelectApiList(start) {
	var startNum = 1;
	var searchContent = $("#searchContent").val();//搜索内容
	if(start){
		startNum = start;
	}
	// 构建JSON数据信息
	var params = {};
	params.start = startNum;
	params.limit = 8;
	params.searchContent = searchContent;
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
        url : '../../api/queryBigscreen/queryOtherBigscreen',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
		success : function(data) {
			console.log(data);
			if (data.commonResponse.success == true) {
				var rlength=getjsonLength(data.records);
        		for(var m=0;m<rlength;m++){
        			//对于过长的title 进行截取 长度超过20的减为20
        			if(data.records[m].screenname.length>30){
        				data.records[m].screenname=data.records[m].screenname.substring(0,30)+"...";
        			}
        			if(data.records[m].screenurl.length>40){
        				data.records[m].screenurl=data.records[m].screenurl.substring(0,100)+"...";
        			}
        			if(data.records[m].controlscreenurl.length>40){
        				data.records[m].controlscreenurl=data.records[m].controlscreenurl.substring(0,100)+"...";
        			}
        			data.records[m].createtime = new Date(+new Date(data.records[m].createtime)+8*3600*1000).toISOString().replace(/T/g,' ').replace(/\.[\d]{3}Z/,'') 
        			
        			var hrefscreenurl = "http://" + baseUrl + "/DYBigScreen" + data.records[m].screenurl;
        			var hrefcontrolscreenurl = "http://" + baseUrl + "/DYBigScreen" + data.records[m].controlscreenurl;
        			
        			data.records[m].hrefscreenurl = hrefscreenurl;
        			data.records[m].hrefcontrolscreenurl = hrefcontrolscreenurl;
        			
        		}
				var html = template('select-list-item', data);
				document.getElementById('select').innerHTML = html;
				//2、设置分页
//				var totalCount = data.totalCount;//总条目数
//				var currentPage = data.currentPage//当前页
//				var totalPage = Math.ceil(totalCount/8);//总页数
//				setPagination(totalPage,currentPage);
			} else {
				alert(data.commonResponse.errorDesc);
			}
		}
	})
	
	tableOpen();
}

function tableOpen(){
	$(".list-item .editIcon").on("click",function(){
		var data = {};
		var parentid = $(this).parent().parent().attr("id");
		data.guid = parentid;
		var session_value ='<%=Session[""]%>';
		ajaxRequest({
			type : 'POST',
			async: false,
			url : '../../api/queryBigscreen/queryOtherBigscreenByID',
			contentType : "application/json;charset=UTF-8",
			data : JSON.stringify(data),
		    dataType:'json',
		    success : function(data) {
		    	if (data.commonResponse.success == true) {
		    		
		    		$("#hidBigscreenGuid").val(data.records[0].screenguid);
		    		$("#editBigscreenName").val(data.records[0].screenname);
		    		$("#editBigscreenUrl").text(data.records[0].screenurl);
		    		$("#editControlBigscreenUrl").text(data.records[0].controlscreenurl);
		    		$("#editBigscreenImg").text(data.records[0].screenimg);
		    		
		    	}
		    }
		})
		
		$(window.document).find("#editBigScreenModal").modal("show");
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


function tosave(){
	var data = {};
	var createBigscreenName = $("#createBigscreenName").val();
	var createBigscreenUrl = $("#createBigscreenUrl").val();
	var createControlBigscreenUrl = $("#createControlBigscreenUrl").val();
	var createBigscreenImg = $("#createBigscreenImg").val();
	
	data.createBigscreenName = createBigscreenName;
	data.createBigscreenUrl = createBigscreenUrl;
	data.createControlBigscreenUrl = createControlBigscreenUrl;
	data.createBigscreenImg = createBigscreenImg;
	
	
	if(createBigscreenName.length >0){
		ajaxRequest({
			type : 'POST',
			async: false,
			url : '../../api/queryBigscreen/addBigscreen',
			contentType : "application/json;charset=UTF-8",
			data : JSON.stringify(data),
		    dataType:'json',
		    success : function(data) {
		    	if (data.commonResponse.success == true) {
		    		location.reload();
		    	}
		    }
		})
	}else{
		alert("请输入大屏名称!");
	}
}

function toedit(){
	var data = {};
	var hidBigscreenGuid = $("#hidBigscreenGuid").val();
	var editBigscreenName = $("#editBigscreenName").val();
	var editBigscreenUrl = $("#editBigscreenUrl").val();
	var editControlBigscreenUrl = $("#editControlBigscreenUrl").val();
	var editBigscreenImg = $("#editBigscreenImg").val();
	data.hidBigscreenGuid = hidBigscreenGuid;
	data.editBigscreenName = editBigscreenName;
	data.editBigscreenUrl = editBigscreenUrl;
	data.editControlBigscreenUrl = editControlBigscreenUrl;
	data.editBigscreenImg = editBigscreenImg;
	
	if(editBigscreenName.length >0){
		ajaxRequest({
			type : 'POST',
			async: false,
			url : '../../api/queryBigscreen/updateBigscreen',
			contentType : "application/json;charset=UTF-8",
			data : JSON.stringify(data),
		    dataType:'json',
		    success : function(data) {
		    	if (data.commonResponse.success == true) {
		    		location.reload();
		    	}
		    }
		})
	}else{
		alert("请输入大屏名称!");
	}
	
}

function todelete(){
	
	var deleteid = "";
	
	$("input[type=checkbox][name='tablecheckbox']").each(function(i){
        if(this.checked == true){
        	var parentid = $(this).parent().parent().parent().attr("id");
        	deleteid = deleteid + parentid + ",";
        }
    })
    if(deleteid != ""){
    	deleteid = deleteid.substring(0,deleteid.length-1);
    	ajaxRequest({
			type : 'POST',
			async: false,
			url : '../../api/queryBigscreen/deleteBigscreen',
			contentType : "application/json;charset=UTF-8",
			data : deleteid,
		    dataType:'json',
		    success : function(data) {
		    	if (data.commonResponse.success == true) {
		    		location.reload();
		    	}
		    }
		})
     }else{
    	 alert("请选择需要删除的机构!");
     }
	
}

function changeTableBox(){
	if ($("#tableBox").prop('checked')) {
		$("input[type=checkbox][name='tablecheckbox']").prop('checked', true);
	}else{
		$("input[type=checkbox][name='tablecheckbox']").prop('checked', false);
	}
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
//var websocket = null;
//var pageId = "selectProgress";
////判断当前浏览器是否支持WebSocket
//if('WebSocket' in window){
//    websocket = new WebSocket("ws://"+baseUrl+"/DYBigScreen/websocket/"+pageId);
//}
//else{
//    alert('Not support websocket')
//}
////连接发生错误的回调方法
//websocket.onerror = function(){
//    alert("error");
//};
// 
////连接成功建立的回调方法
//websocket.onopen = function(event){
//    console.info("open");
//}
////连接关闭的回调方法
//websocket.onclose = function(){
//    console.info("close");
//}
////监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
//window.onbeforeunload = function(){
//    websocket.close();
//}
////关闭连接
//function closeWebSocket(){
//    websocket.close();
//}
//
////发送消息
//function send(message){
//    websocket.send(message);
//}