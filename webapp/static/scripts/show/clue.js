
$(function(){
	init();
});

var clueData = ["380","158,000","280"];

var lollingTime = 20000;//页签切换时间，暂定10s
var clueTimer;

//初始化方法
function init(){
	clearInterval(clueTimer);
	//1、启动页签切换，暂定8s
	setTab("BOXID-1",lollingTime,0);
	
	$("#sourceCount").text(clueData[0]);
	$("#clueCount").text(clueData[1]);
	$("#newCount").text(clueData[2]);
}

//加载汇聚线索列表
function loadClueList(type) {
	clearInterval(clueTimer);
	loadClueFromApiList(type);
}


//将查出的数据分为两部分，放入缓存，用于翻页加载
function splitPage(data){
	$.each(data.records,function(i,item){
		if(item.attachFileOne =="" || item.attachFileOne ==null ){
		}else if(item.attachFileOne.indexOf ('下载中') != -1){
			item.attachFileOne =null;
		}
	});
	clearInterval(clueTimer);
	var dataInfo1 = {};
    dataInfo1.records = [];
    var dataInfo2 = {};
    dataInfo2.records = [];
    
    //遍历查询数据，将查出的数据分为两部分，放入缓存
    $.each(data.records,function(i,item){
    	if(i<4 && item){
    	   dataInfo1.records.push(item);
    	}else if(item){
    	   dataInfo2.records.push(item);
    	}
	});
    window.localStorage.setItem("dataInfo1", JSON.stringify(dataInfo1));
    window.localStorage.setItem("dataInfo2", JSON.stringify(dataInfo2));
    
    //加载首页
	var html1 = template('clue1-list-item', dataInfo1);
	document.getElementById('clue1').innerHTML = html1;
	
    //加载下一页（定时5s）
	var html2 = template('clue2-list-item', dataInfo2);
	document.getElementById('clue2').innerHTML = html2;
	
	clueTimer = setInterval(function(){
		changePage();
	},10000);
}


//翻页（翻牌效果）
function changePage(){
	$("#clue1 .jqflip-item").each(function(index){
		var id = $(this).attr('id'); 
		setTimeout(function(){
			if(id.indexOf('one') != -1 ){
				console.log($("#one_"+index));
				 $("#one_"+index).jqflip({ targetSelector : '#two_'+index});
			}else{
				 $("#two_"+index).jqflip({ targetSelector : '#one_'+index});
			}
		},index*600);
	});
	
}

var debug_time=0;
//从汇聚接口加载汇聚线索列表数据
function loadClueFromApiList(type) {
	debug_time += 1;
	console.info(debug_time);
	console.info("加载内容的type:" + type);
	var resourceOriginType = 3
	var resourceMediaType = 0 ;
	if(type == "wangye"){
		resourceMediaType = 0;
		resourceOriginType = 3;
	}else if(type == "weibo"){
		resourceMediaType = 4;
		resourceOriginType = 1;
	}else if(type == "weixin"){
		resourceMediaType = 11;
		resourceOriginType = 2;
	}
	
	// 构建JSON数据信息
	var params = {};
	params.start = 0;
	params.limit = 8;
	params.resourceOriginType = resourceOriginType;//线索来源
	
	var paramss = {
			"start":0,
			"limit":8,
			"resourceMediaType":resourceMediaType};			
	
	/*console.info("123");
	 $.ajax({//这个ajax是为了获取token
         type: "POST",
         url: "http://140.143.114.101:7777/oauth/token?grant_type=client_credentials&tenantId=7fe79084-b00f-416b-a690-819aac5fa0d1&userId=admin",
         beforeSend: function(request) {
        	 request.setRequestHeader("Content-Type","application/x-www-form-urlencoded"),
             request.setRequestHeader("Authorization", "Basic"+ " dGVzdDp0ZXN0");
         },
         success: function(result) {
        	 console.info("321");
        	 console.info(result.access_token+" ");
        	 $.ajax({  //这个ajax是将token作为参数 并且配合其他参数 从接口获取
                 type: "POST",  
                 url: "http://140.143.114.101:8088/ws/resource/screen", 
                 data : JSON.stringify(paramss),//传入参数
                 beforeSend: function(request) {  
                	 request.setRequestHeader("Content-Type","application/json;charset=utf-8"),
                     request.setRequestHeader("Authorization", "Basic"+ " dGVzdDp0ZXN0");
                	 request.setRequestHeader("token", result.access_token+" ");
                 },  
                 success: function(data) {  
                	 console.info("chenggong");  
                	 if (data.commonResponse.success) {
                		 data.limit=10;
                		 data.records=data.resources;
                		 console.info(data); 
                		// splitPage(data);
         			}
                	 
                 }  
             }); 
         }
     });*/
     
	
	 
	 $.ajax({
		type : 	'POST',
		contentType: "application/json", 
		dataType: "json"  ,
		url  : 	'/DYBigScreen/clueCloudInterface/getClueList.do',
		 data: JSON.stringify(paramss),
		success : function(data) {
			if (data.commonResponse.success == true) {
        		
        		var rlength=getjsonLength(data.records);
        		for(var m=0;m<rlength;m++){
        			//对于过长的title 进行截取 长度超过20的减为20
        			if(data.records[m].author==null | data.records[m].author==""){
        				data.records[m].author=data.records[m].siteName;
        			}
        			if(data.records[m].title.length>20){
        				data.records[m].title=data.records[m].title.substring(0,20)+"...";
        			}
        			if(data.records[m].content.length>50){
        				data.records[m].content=data.records[m].content.substring(0,50)+"...";
        			}
        			data.records[m].createdTime=data.records[m].createdTime.substring(5,16);
        			data.records[m].type = type;
        		}
				//将查出的数据分为两部分，放入缓存，用于翻页加载
				splitPage(data);
			} else {
				alert(data.commonResponse.errorDesc);
			}
		}
	});
	
}
//获取json长度
function getjsonLength(json){
    var jsonLength=0;
    for (var i in json) {
        jsonLength++;
    }
    return jsonLength;
}
//动态切换tab
function setTab(tabid, time, index) {
    var _this = this;
    var delay=time;  //切换时间
    var start=index; //起始位置
    
    _this.obj=tabid;
    _this.i=start-1; 
    _this.offset = delay; 
    _this.count = 3;   
    _this.timer = null; 
    
    console.info(_this.count);     
    this.autoroll = function (){            
        _this.i=_this.i >=(_this.count-1)? 0 : ++_this.i;               
        _this.slide(_this.i);
        _this.timer = window.setTimeout(_this.autoroll, _this.offset);
    }
            
    this.slide = function (i){   
    	var index = i+1;
    	var type = jQuery("#"+_this.obj + " .tabbable-line li").eq(i).attr('id');
    	jQuery("#"+_this.obj + " .tabbable-line li").removeClass('active');
    	 jQuery("#"+type + "").addClass('active');
        //this.setImg(i);
        clearInterval(clueTimer);
        console.log(type);
        loadClueList(type);
    } 
           
    this.hookThumb = function (){       
    jQuery("#"+_this.obj + ' .tabbable-line li').hover( 
        function () { 
            if (_this.timer) {   
                clearInterval(_this.timer); 
                clearInterval(clueTimer);
                }
                _this.i = jQuery(this).prevAll().length;                    
                _this.slide(_this.i);                                           
            },   
        function () {
            if (_this.offset>0) {     
            	clearInterval(clueTimer);
                _this.timer = window.setTimeout(_this.autoroll, _this.offset);
            }
            this.blur();               
            return false;   
        }   
        );   
    }
 
    //初始化组件     
    this.factory = function(){
        if (_this.offset>0) {
            this.autoroll();
        }  
        this.hookThumb(); 
    }
         
    this.factory();     
    
      
      
      
}

//-----------------------------消息-----------------------------//
var websocket = null;
var pageId = "huijuClue_show";
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
	//获取当前选中的tab的id
	var selectId = $(".left-menustyle-1").attr("id");
	//获取当前选中的tab的data-number
	var selectIndex = $(".left-menustyle-1").attr("data-number");
	//如果是线索类型指令
	if(msg.type == "clueType"){
		$("#"+msg.content).trigger('mouseenter');
	}
	//如果是轮询指令（开启，关闭）
	else if(msg.type == "isPolling"){
		if(msg.content == "open"){
			clearInterval(clueTimer);
			setTab("BOXID-1",lollingTime,selectIndex);
		}else{
			clearInterval(clueTimer);
			$("#"+selectId).trigger('mouseenter');
		}
	}else if(msg.type == "refresh" && (msg.content == 1 || msg.content == "all")){
		 window.location.reload();
	}
}
