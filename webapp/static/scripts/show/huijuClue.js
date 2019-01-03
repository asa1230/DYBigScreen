$(function(){
	init();
});

var lollingTime = 20000;//页签切换时间，暂定10s
var clueTimer;

//初始化方法
function init(){
	clearInterval(clueTimer);
	//1、启动页签切换，暂定8s
	setTab("BOXID-1",lollingTime,0);
}

//加载汇聚线索列表
function loadClueList(type) {
	clearInterval(clueTimer);
	if(type == "wangye" || type == "weibo" || type == "weixin"){
		loadClueFromApiList(type);
	}/*else{
		loadClueFromJsonList(type)
	}*/
}

//从JSON加载汇聚线索列表假数据
function loadClueFromJsonList(type) {
	var jsonFile;
	if (type == "ugc") {
		jsonFile = "../../json/huiju_ugc.json"; 	
	} else if (type == "pgc") {
		jsonFile = "../../json/huiju_pgc.json"; 	
	} else if (type == "shoulu") {
		jsonFile = "../../json/huiju_shoulu.json"; 	
	} else if (type == "youtai") {
		jsonFile = "../../json/huiju_youtai.json"; 	
	} else if (type == "tongxueshe") {
		jsonFile = "../../json/huiju_tongxueshe.json"; 	
	} else if (type == "wangye") {
		jsonFile = "../../json/huiju_weixin.json"; 	
	} else if (type == "weibo") {
		jsonFile = "../../json/huiju_weibo.json"; 	
	} else if (type == "weixin") {
		jsonFile = "../../json/huiju_weixin.json"; 	
	} 
	
	$.getJSON(jsonFile, function(data){ 
		splitPage(data);
	}); 
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
    	if(i<5 && item){
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
	if(type == "wangye"){
		resourceOriginType = 3;
	}else if(type == "weibo"){
		resourceOriginType = 1;
	}else if(type == "weixin"){
		resourceOriginType = 2;
	}
	
	// 构建JSON数据信息
	var params = {};
	params.start = 0;
	params.limit = 10;
	params.resourceOriginType = resourceOriginType;//线索来源
	
	
	ajaxRequest({
		type : 'POST',
		url : '../../api/queryClue',
		data : JSON.stringify(params),
		success : function(data) {
			if (data.commonResponse.success) {
//				console.info(JSON.stringify(data));
				//将查出的数据分为两部分，放入缓存，用于翻页加载
				splitPage(data);
			}
			
			/* else {
				console.info(data.commonResponse.errorDesc);
				//报错时从假json取数据
				if (type == "wangye") {
					jsonFile = "../../json/huiju_wangye.json"; 	
				} else if (type == "weibo") {
					jsonFile = "../../json/huiju_weibo.json"; 	
				} else if (type == "weixin") {
					jsonFile = "../../json/huiju_weixin.json"; 	
				} 
				$.getJSON(jsonFile, function(data){ 
					splitPage(data);
				}); 
			}*/
		}
	});
	
}

//动态切换tab
function setTab(tabid, time, index) {
    var _this = this;
    var delay=time;  //切换时间
    var start=index; //起始位置
    
    _this.obj=tabid;
    _this.i=start-1; 
    _this.offset = delay; 
    _this.count = jQuery("#"+_this.obj + " .left-menu .left-lb").length;   
    _this.timer = null; 
    
    console.info(_this.count);     
    this.autoroll = function (){            
        _this.i=_this.i >=(_this.count-1)? 0 : ++_this.i;               
        _this.slide(_this.i);
        _this.timer = window.setTimeout(_this.autoroll, _this.offset);
    }
            
    this.slide = function (i){   
    	var index = i+1;
    	var type = $("#"+_this.obj + ' .left-menu > div').eq(i).attr('id');
    	var img = "../../img/icon"+index+".png";
        jQuery("#"+_this.obj + ' .left-menu > div').eq(i).addClass('left-menustyle-1').addClass('renmen-font-style2').removeClass('left-menustyle').siblings().removeClass('left-menustyle-1').removeClass('renmen-font-style2').addClass('left-menustyle');   
        jQuery("#"+_this.obj + ' .left-menu img').eq(i).attr('src',img); 
        this.setImg(i);
//        console.info($("#"+_this.obj + ' .left-menu > div').eq(i).attr('id'));
        clearInterval(clueTimer);
        loadClueList(type);
    } 
    
    //改变选中tab之外的图片src
    this.setImg = function (num){
    	$("#"+_this.obj + ' .left-menu > div').each(function(index){
    		if(index != num){
    			var objIndex = index+1
    			var img = "../../img/icon"+objIndex+"-2.png";
    			$(this).find("img").attr('src',img); 
    		}
    	});
    }
           
    this.hookThumb = function (){       
    jQuery("#"+_this.obj + ' .left-menu > div').hover( 
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
        jQuery("#"+_this.obj + ' .left-menu div:first').addClass('left-menustyle-1').addClass('renmen-font-style2').removeClass('left-menustyle');   
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
