$(function(){
	init();
});

function init(){
	//1、加载热点信息列表
	loadHotList();
	//2、添加滚动显示效果（热点内容）
	scrollHot();
	//3、添加滚动显示效果（热点评论）
	scrollComment();
	
}


//加载热点列表
function loadHotList() {
	var jsonFile= "../../json/hotJson.json"; 		//热点内容
	$.getJSON(jsonFile, function(data){ 
		hotInfo = data;
		//1、加载hot内容
		var html = template('hot-list-item', hotInfo);
		document.getElementById('hot').innerHTML = html;
	}); 
	
	var jsonFile= "../../json/commentJson.json"; 	//热点评论
	$.getJSON(jsonFile, function(data){ 
		//2、加载评论内容
		commentInfo = data;
		var html = template('comment-list-item', commentInfo);
		document.getElementById('comment').innerHTML = html;
	}); 
	
}

function gethotJsonFile(){
	var jsonFile= "../../json/hotJson.json"; 		//热点内容
	$.getJSON(jsonFile, function(data){ 
		window.localStorage.setItem("hotInfo", JSON.stringify(data));
	}); 
}

function getCommentJsonFile(){
	
}



//添加滚动显示效果（热点内容）
function scrollHot(){
	var scrtime;
    $("#hot").hover(function(){
         clearInterval(scrtime);
    },function(){
        scrtime = setInterval(function(){
            	var ul = $("#hot");
                var liHeight = ul.find("table:last").height();
                ul.animate({marginTop : liHeight+40 +"px"},1000,function(){
                	ul.find("table:last").prependTo(ul)
                	ul.find("table:first").hide();
                	ul.css({marginTop:0});
                	ul.find("table:first").fadeIn(1000);
                });        
        },5000);
     }).trigger("mouseleave");
}
   
//添加滚动显示效果（热点评论）
function scrollComment(){
	var scrtime2;
    $("#comment").hover(function(){
         clearInterval(scrtime2);
    },function(){
    	scrtime2 = setInterval(function(){
            	var ul = $("#comment");
                var liHeight = ul.find(".remen-style7:last").height();
                ul.animate({marginTop : liHeight+40 +"px"},1000,function(){
                	ul.find(".remen-style7:last").prependTo(ul)
                	ul.find(".remen-style7:first").hide();
                	ul.css({marginTop:0});
                	ul.find(".remen-style7:first").fadeIn(1000);
                });        
        },3000);
     }).trigger("mouseleave");
}

//-----------------------------消息-----------------------------//
var websocket = null;
var pageId = "hot_show";
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
	if(msg.type == "refresh" && (msg.content == 2 || msg.content == "all")){
		 window.location.reload();
	}
}

   