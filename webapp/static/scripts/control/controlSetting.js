function refreshBigShow(index){
	var msg = {};
	msg.type = "refresh";
	msg.content = index;
	console.info(JSON.stringify(msg));
	send(JSON.stringify(msg));
}





//----------------------------消息发送------------------------------//
var websocket = null;
var pageId = "setting";
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