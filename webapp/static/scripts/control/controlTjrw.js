$(function() {
//        initDateRangePicker();
});

function selectType(type,type2){
	var msg = {};
	if(type == "columnName"){
		msg.type = "columnName";
		if(type2 == 1){
			if($("#column1").is(':checked')){
				msg.value = "column1";
				msg.content = true;
			}else{
				msg.value = "column1";
				msg.content = false;
			}
		}else if(type2 == 2){
			if($("#column2").is(':checked')){
				msg.value = "column2";
				msg.content = true;
			}else{
				msg.value = "column2";
				msg.content = false;
			}
		}else if(type2 == 3){
			if($("#column3").is(':checked')){
				msg.value = "column3";
				msg.content = true;
			}else{
				msg.value = "column3";
				msg.content = false;
			}
		}
		
		send(JSON.stringify(msg));
	}else{
		msg.type = "columnType";
		msg.content = $("#columnType").is(':checked');
		send(JSON.stringify(msg));
	}
}




//---------------------------消息发送---------------------------//
var websocket = null;
var pageId = "tj_rw";
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

