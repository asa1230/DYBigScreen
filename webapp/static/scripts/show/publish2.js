$(function(){
	init();
});

var time;

function init(){
	clearInterval(time);
	//2、启动定时器翻页
	time = setInterval(function(){
		var src = $("#p1 img").attr('src');
		if(src == "../../dataImg/8.jpg"){
			$("#p1 img").attr('src','../../dataImg/8-2.jpg');
		}else{
			$("#p1 img").attr('src','../../dataImg/8.jpg');
		}
	},10000);
}


//-----------------------------消息-----------------------------//
var websocket = null;
var pageId = "publish_2_show";
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
	console.info("收到指令,类型:" + msg.type + "，内容："+ msg.content);
	if(msg.type == "refresh" && (msg.content == 8 || msg.content == "all")){
		 window.location.reload();
	}else if(msg.type == "isPolling"){
		if(msg.content == "open"){
			init();
		}else{
			//清除定时器
			clearInterval(time);
		}
		
	}else if(msg.type == "publishType2"){
		//清除定时器
		clearInterval(time);
		if(msg.content == "pub2_1"){
			$("#p1 img").attr('src','../../dataImg/8.jpg');
		}else{
			$("#p1 img").attr('src','../../dataImg/8-2.jpg');
		}
	}
}

   