$(function(){
	init();
});
var timer;
function init(){
	var interval = window.localStorage.getItem("interval");
	clearInterval(timer);
		if(interval == "open"){
		timer = setInterval(function(){
			location.href = "../../view/show/kpi.html";
		},10000);
	}
}

//------------------消息模块-------------------------//
var websocket = null;
var pageId = "tj_sb_show";
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
	console.info(event.data);
	if(msg.type == "tjType"){
		//清除定时器
		clearInterval(timer);
		window.localStorage.setItem("interval", "close");
		//根据控制端跳转
		if(msg.content == "task"){
			location.href = "../../view/show/reportSelect.html";
		}else if(msg.content == "mission"){
			location.href = "../../view/show/mission.html";
		}else if(msg.content == "device"){
			location.href = "../../view/show/device.html";
		}else if(msg.content == "kpi"){
			location.href = "../../view/show/kpi.html";
		}
	}else if(msg.type == "isPolling"){
		if(msg.content == "open"){
			window.localStorage.setItem("interval", "open");
			init();
		}else{
			//清除定时器
			clearInterval(timer);
			window.localStorage.setItem("interval", "close");
		}
		
	}else if(msg.type == "refresh" && (msg.content == 6 || msg.content == "all")){
		 window.location.reload();
	}
}
