$(function(){
	init(null);
});
var scrtime1;
var scrtime2;
var flag = true;//重定向标志

function init(id){
	//clearInterval(scrtime1);
	//clearInterval(scrtime2);
	//1、加载选题详情
	 //先判断是否有请求参数
	var taskid = getQueryString("TaskGuid");
	console.log(taskid);
	if(taskid!=null&&flag){
		loadSelectDetail(taskid);
		flag = false;
	}else{
		if(id){
			loadSelectDetail(id);
		}
	}
	//
//	scrollZiyuan();
//	scrollMission();
}



//获取选题详情
function loadSelectDetail(id) {
	/*var url = window.localStorage.getItem("zhihuidiaoduURL");
	if(url == null || url == ""){
		ajaxRequest({
			type : 'GET',
			url : '../../api/user/queryServerUrl?type=31',
			success : function(data) {
				if (data.commonResponse.success == true) {
					window.localStorage.setItem("zhihuidiaoduUrl", JSON.stringify(data.url));
					url = data.url;
				} 
			}
		});
		window.localStorage.setItem("zhihuidiaoduURL", url);
	}*/
	
	var params={};
	params.id=id;
	params.type=1;
	ajaxRequest({
		type : 'POST',
		async : true,
		dataType : 'json',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/selectProgressDetailes.do',
		contentType : "application/json;charset=UTF-8",
		data : JSON.stringify(params),
		success : function(data) {
			console.info(data);
			console.info(JSON.stringify(data));
			if (data.commonResponse.success == true) {
				data.title=data.title.substring(0,20)+"...";
				data.content=data.content.substring(0,200)+"...";
				console.info(JSON.stringify(data));
				if(data.content != null){
					var div = document.createElement("div");		//去掉HTML格式，变成纯文本
					div.innerHTML = data.content;
					data.content = div.innerText;
				}
				if(data.status!=null)
    				data.statusdesp = xuantiStatusDesp[data.status];
				if(data.ownColumn==null || data.ownColumn=="")
    				data.ownColumn = defaultPrePushCliname;
				
				
				var html_1 = template('select1-list-item', data);
				document.getElementById('select-1').innerHTML = html_1;
				
				var html_2 = template('select2-list-item', data);
				document.getElementById('select-2').innerHTML = html_2;
				
				var html_3 = template('select3-list-item', data);
				document.getElementById('select-3').innerHTML = html_3;
				if(data.resourceList !=null){
					var html_4 = template('select4-list-item', data);
					document.getElementById('select-4').innerHTML = html_4;
					
					var zyrlength=getjsonLength(data.resourceList);   //zhy mod
					var zyNum = zyrlength;   //data.resourceList.length;
					$("#zyNum").html(zyNum);
				}else{
					var html_4 = template('select4-list-item', data);
					document.getElementById('select-4').innerHTML = html_4;
					$("#zyNum").html(0);
				}
				var html_5 = template('select5-list-item', data);
				document.getElementById('select-5').innerHTML = html_5;
			} else {
				console.info(data.commonResponse.errorDesc);
			}
		}
	});
	/*ajaxRequest({
		type : 'POST',
		async: true,
		url : url+'/api/houjian/queryTask',
		contentType : "application/json;charset=UTF-8",
        dataType:'json',
        data:JSON.stringify({
        	"workNo" : defaultUserWorkNo,
        	"taskQueryModel" : {"extend_id":id}
        }),
		success : function(data) {
			if (data.commonResponse.success == true) {
				//任务
				if(data.taskModelList !=null){
					var finishMissonNum = 0;
					for(var m=0;m<data.taskModelList.length;m++){
						if(data.taskModelList[m].rwStatus == 4){
							finishMissonNum++;
						}
					}
					data.finishMissonNum = finishMissonNum;
					data.missonNum = data.taskModelList.length - finishMissonNum;
					var html_5 = template('select5-list-item', data);
					document.getElementById('select-5').innerHTML = html_5;
				}
				console.info(JSON.stringify(data));
			} else {
				alert(data.commonResponse.errorDesc);
			}
		}
	});*/
}

function getjsonLength(json){
    var jsonLength=0;
    for (var i in json) {
        jsonLength++;
    }
    return jsonLength;
}

function scrollZiyuan(){

    $("#ziyuan").hover(function(){
         clearInterval(scrtime1);
    },function(){
        scrtime1 = setInterval(function(){
            	var ul = $("#ziyuan");
                var liHeight = ul.find("tr:last").height();
                ul.animate({marginTop : liHeight+20 +"px"},500,function(){
                	ul.find("tr:last").prependTo(ul)
                	ul.find("tr:first").hide();
                	ul.css({marginTop:0});
                	ul.find("tr:first").fadeIn(1000);
                });        
        },5000);
     }).trigger("mouseleave");
}

function scrollMission(){

    $("#mission").hover(function(){
         clearInterval(scrtime2);
    },function(){
        scrtime2 = setInterval(function(){
            	var ul = $("#mission");
                var liHeight = ul.find(".scroll:last").height();
                ul.animate({marginTop : liHeight+20 +"px"},500,function(){
                	ul.find(".scroll:last").prependTo(ul)
                	ul.find(".scroll:first").hide();
                	ul.css({marginTop:0});
                	ul.find(".scroll:first").fadeIn(1000);
                });        
        },5000);
     }).trigger("mouseleave");
}
/**
 *根据解析url获取指定名称请求参数
 * @param name 请求参数名称
 * @returns  请求参数内容
 */
function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null) return unescape(r[2]); return null;
}

//------------------发送消息模块-------------------------//
var websocket = null;
var pageId = "selectDetail_show";
//判断当前浏览器是否支持WebSocket
if ('WebSocket' in window) {
	websocket = new WebSocket("ws://"+baseUrl+"/DYBigScreen/websocket/" + pageId);
} else {
	alert('Not support websocket')
}
//连接发生错误的回调方法
websocket.onerror = function() {
	alert("client error");
};

//连接成功建立的回调方法
websocket.onopen = function(event) {
	console.info("open client");
}
//连接关闭的回调方法
websocket.onclose = function() {
	console.info("close client");
}
//监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function() {
	websocket.close();
}
//关闭连接
function closeWebSocket() {
	websocket.close();
}

//接收到消息的回调方法
websocket.onmessage = function(event) {
	var msg=JSON.parse(event.data);
	if(msg.type == "selectDetail"){
		init(msg.content);
	}else if(msg.type == "selectProgress"){
		//展示列表第一个选题的选题详情
		init(msg.records[0].taskGuid);
	}else if(msg.type == "refresh" && (msg.content == 4 || msg.content == "all")){
		window.location.reload();
	}
}

//计算任务完成百分比
template.helper("renwuPercent",function(num,total){ 
	num = parseFloat(num); 
	total = parseFloat(total); 
	if (isNaN(num) || isNaN(total)) { 
	return "0%"; 
	} 
	return total <= 0 ? "0%" : (Math.round(num / total * 100) + "%"); 
});