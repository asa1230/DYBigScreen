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
	},79000);
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
	 if(count<15){
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
var showData={};
showData.records=[];

//获取选题列表
function loadSelectApiList() {
	var url = window.localStorage.getItem("zhihuidiaoduURL");
	// 构建JSON数据信息
	
	$.ajax({
		    type : 'POST',
	        async : false,
	        dataType : 'json',
	        url  : 	'/DYBigScreen/HZInterfaceSet/HZTodayOnHistory.do?',
	        contentType : "application/json;charset=UTF-8",
	        success : function(data) {
            	if (data.commonResponse.success == true) {
            		var rlength=getjsonLength(data.records);
            		console.info(rlength);
            		
            		var dateYear=null;
            		var count=0;
            		for(var m=0;m<rlength;m++){
            			if(data.records[m].resourceName!=null && data.records[m].resourceName!=""){
            				var reg=/\d{4}(\-|\/|.)\d{1,2}\1\d{1,2}/;
            				if(!reg.test(data.records[m].resourceName)){
            					console.info(data.records[m].resourceName);
            					if(data.records[m].resourceName.length>20){
                    				data.records[m].resourceName=data.records[m].resourceName.substring(0,20)+"...";
                    			}
            					if(dateYear==null){
                    				dateYear=data.records[m].firstShowDate;
                    				showData.records.push(data.records[m]);
                    				count++;
                    			}else{
                    				if(dateYear==data.records[m].firstShowDate){
                    					if(count<3){
                    						showData.records.push(data.records[m]);
                    						count++;
                    					}else{
                    						continue;
                    					}
                    				}else{
                    					dateYear=data.records[m].firstShowDate;
                    					count=0;
                    					showData.records.push(data.records[m]);
                    					count++;
                    				}
                    			}
            					
            					//showData.records.push(data.records[m]);
            				}
            				
            				/*if(isContains(data.records[m].navigation,getNowDate())){
            					//对于过长的title 进行截取 长度超过20的减为20
                    			if(data.records[m].content.length>135){
                    				data.records[m].content=data.records[m].content.substring(0,135)+"...";
                    			}
                    				data.records[m].createdTime=data.records[m].createdTime.substring(0,10);
                    				//利用正则表达式 抽取出allcontent中的 xxxx年xx月xx日部分
                    				var reg =/\d+\u5e74\d+\u6708\d+\u65e5/;
                    				var TargetTime=reg.exec(data.records[m].allContent);
                    				if(TargetTime!=null){
                    					data.records[m].happenTime=TargetTime[0];
                    				}else{
                    					data.records[m].happenTime="";
                    				}
                    				var reg1=/\d+\u5e74/;
                    				var years=reg1.exec(data.records[m].navigation);
                    				if(years!=null){
                    					data.records[m].year=years[0];
                    				}else{
                    					data.records[m].year="";
                    				}
            					showData.records.push(data.records[m]);
            				}*/
            			}
            		}
            		//showData.records.sort(up);
            		//\u5e74 \u6708\ u65e5
    				//将查出的数据分为两部分，放入缓存，用于翻页加载
    				splitPage(showData);
    			} else {
    				console.info(data.commonResponse.errorDesc);
    			}
	        }
	        });
}

//定义升序方法
function up(x,y){
    return (x.year < y.year) ? 1 : -1
}


//获取当前日期  格式： 1月1日
function getNowDate(){
	var myDate = new Date();
	var nowMou= myDate.getMonth()+1;
	var nowDay= myDate.getDate();
	return nowMou+"月"+nowDay+"日";
}


//判断a是否包含b
function isContains(a,b) {
	if(a.indexOf(b) >= 0){
		return true;
	}else{
		return false;
	}
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
	/*var vars={};
	var totalCount=getjsonLength(data.records);//总条目数量
	var totalPage = Math.ceil(totalCount/8);//总页数
	var limit=6;//每页数量
	
	for(var i=1;i<=totalPage;i++){
		var dataInfoName="dataInfo"+i;
		vars[dataInfoName]={};
		vars[dataInfoName].records=[];
		
	};
	
	$.each(data.records,function(i,item){
		for(var j=1;j<=totalPage;j++){
			if(j*limit<=i && i<(j+1)*limit  && item){
				vars["dataInfo"+j].records.push(item);
			}
		}
	});*/
		var dataInfo1 = {};
	    dataInfo1.records = [];
	    var dataInfo2 = {};
	    dataInfo2.records = [];
	    //var blankNum = 8-data.records.length;
	    //遍历查询数据，将查出的数据分为两部分，放入缓存
	    $.each(data.records,function(i,item){
	    	if(i<8 && item){
	    	   dataInfo1.records.push(item);
	    	}else if(i>7 && i<16 && item){
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
}
*/