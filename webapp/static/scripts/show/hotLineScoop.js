$(function(){
	init();
});

var timer1;
var timer2;

function init(){
	//loadServerUrl();
	//1、加载选题列表
	loadSelectApiList();
	//2、启动定时器翻页
	timer1 = setInterval(function(){
		changePage();
	},20000);
	//3、启动定时器刷新
	timer2 = setInterval(function(){
		loadSelectApiList();
	},80000);
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


//翻页（翻牌效果）
function changePage(){
	 var count = jQuery(".jqflip-parent").length; 
	 //不满4条一屏幕就不翻页
	 if(count<11){
		 return false;
	 }else{
		 $("#select1 .jqflip-parent").each(function(index){
			 var id = $(this).attr('id'); 
			 setTimeout(function(){
				 	if(id.indexOf('one') != -1 ){
						$("#one_"+index+" .jqflip-item").jqflip({ targetSelector : '#two_'+index+" .jqflip-item"});
					}else{
						$("#two_"+index+" .jqflip-item").jqflip({ targetSelector : '#one_'+index+" .jqflip-item"});
					}
				},index*600);
			});
	 }
	
	
}



//来源于控制端传递的数据
function loadSelectControlList(data) {
	splitPage(data);
}


//获取选题列表
function loadSelectApiList() {
	var url = window.localStorage.getItem("zhihuidiaoduURL");
	$.ajax({
		    type : 'post',
	        async : false,
	        dataType : 'json',
	        data: "",
			url : '/DYBigScreen/HZInterfaceSet/getHotLineScoop.do',
	        contentType : "application/json;charset=UTF-8",
	        success : function(data) {
            	if (data.commonResponse.success == true) {
            		
            		var rlength=getjsonLength(data.records);
            		console.info(JSON.stringify(data));
            		for(var m=0;m<rlength;m++){
            			//对于过长的title 进行截取 长度超过20的减为20
            			if(data.records[m].title.length>20){
            				data.records[m].title=data.records[m].title.substring(0,20)+"...";
            			}
            			if(data.records[m].summary.length>36){
            				data.records[m].summary=data.records[m].summary.substring(0,48)+"...";
            			}
            			if(data.records[m].author.length>6){
            				data.records[m].author=data.records[m].author.substring(0,6)+"...";
            			}
            			if(data.records[m].authorContact.length>15){
            				data.records[m].authorContact=data.records[m].authorContact.substring(0,15)+"...";
            			}
            			
            		}
    				//将查出的数据分为两部分，放入缓存，用于翻页加载
    				splitPage(data);
    			} else {
    				console.info(data.commonResponse.errorDesc);
    			}
	        }
	        });
}

function titleLegthDiy(a,b){
	if(a.length>b){
		return a.substring(0,b);
	}else{
		return a;
	}
	
}


function getjsonLength(json){
    var jsonLength=0;
    for (var i in json) {
        jsonLength++;
    }
    return jsonLength;
}


function splitPage(data){
		var dataInfo1 = {};
	    dataInfo1.records = [];
	    var dataInfo2 = {};
	    dataInfo2.records = [];
	    //var blankNum = 8-data.records.length;
	    //遍历查询数据，将查出的数据分为两部分，放入缓存
	    $.each(data.records,function(i,item){
	    	if(i<6 && item){
	    	   dataInfo1.records.push(item);
	    	}else if(item){
	    	   dataInfo2.records.push(item);
	    	}
		});
		
	    //加载首页
		var html1 = template('select1-list-item', dataInfo1);
		document.getElementById('select1').innerHTML = html1;
		
		var html2 = template('select2-list-item', dataInfo2);
		document.getElementById('select2').innerHTML = html2;
		
		
	}
	



//------------------消息模块-------------------------//
/*var websocket = null;
var pageId = "*********_show";
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
	if(msg.type == "selectProgress"){
		loadSelectControlList(msg);
	}else if(msg.type == "selectDetail"){
		//window.location.href="selectDetail.html?TaskGuid="+msg.content;
	}else if(msg.type == "refresh" && (msg.content == 3 || msg.content == "all")){
		 window.location.reload();
	}
}*/
