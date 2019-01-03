//初始化开关
$('[name="my-checkbox"]').bootstrapSwitch({  
    size:"large",  
    onSwitchChange:function(event,state){  
    	console.log(state); // true | false
        if(state==true){  
        	sendMsgByType("isPolling","open");
        }else{  
        	sendMsgByType("isPolling","close");
        }  
    }  
})  



//选中统计类型标签
function selectType(type,content,index){
	//1、改变样式
	$('#statisticsType .dashboard-stat').each(function(i){
		if(index != i){
			$(this).removeClass('blue').addClass('grey'); 
		}else{
			$(this).addClass('blue').removeClass('grey');
		}
		
	});
	//2、发送消息
	sendMsgByType(type,content);
	$('[name="my-checkbox"]').bootstrapSwitch('state',false);//注意是state
}


//发送消息
function sendMsgByType(type,content){
	var msg = {};
	if(type == "tjType"){
		msg.type = "tjType";
	}else{
		msg.type = "isPolling";
	}
	msg.content = content;
	console.info(JSON.stringify(msg));
	send(JSON.stringify(msg));
}

function toUrl(type){
	if(type == "task"){
		location.href = "../../view/control/control_tj_bxt.html";
	}else if(type == "mission"){
		location.href = "../../view/control/control_tj_rw.html";
	}else if(type == "device"){
		location.href = "../../view/control/control_tj_sb.html";
	}else if(type == "kpi"){
		location.href = "../../view/control/control_tj_kpi.html";
	}
}


//---------------------------消息发送---------------------------//
var websocket = null;
var pageId = "tj";
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