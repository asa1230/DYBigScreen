$(function(){
	init();
});

var timer1;
var timer2;
var timer3;
var columnNum;
var ondex=0;
var Request;
function init(){
	//判断输入是否为空 获取可用栏目名称
	Request=new UrlSearch(); //实例化
	if(Request.column==null | Request.column==""){
		//1 从后台获取栏目列表并置于页首
		getColumnList();
		//2 轮流改变栏目名称的样式
		changeColor(ondex);
		/*timer1 = setInterval(function(){
			changeColor(index);
		},10000);*/
		/*timer1 = setInterval(function(){
			changePage();
			},20000);*/
		//3启动定时器刷新
		/*timer3 = setInterval(function(){
			window.location.reload();
			},96000);*/
	}else{
		//1、加载选题列表
		loadSelectApiList();
		//2、启动定时器翻页
		/*timer1 = setInterval(function(){
		changePage();
		},20000);*/
		//3、启动定时器刷新
		
	}
}

function changeColor(num){
	if(num>=columnNum){
		num=0;
	}
	console.log(num);
	var columns = document.getElementsByClassName("columnName");
	for(var o=0;o<columnNum;o++){
		columns[o].style.color="#00ffde";
	}
	columns[num].style.color="yellow";
	var args=columns[num].innerHTML;
	getManuByColumn(args);
	if(ondex<columnNum-1){
		ondex++;
	}else{
		ondex=0;
	}
	
}

function getManuByColumn(args){
	
	var params = {
			"column":args
			};	

	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/HZInterfaceSet/getYesterdayNewsBillsByCloumn.do',
		//url : '/DYBigScreen/HZInterfaceSet/getTodayNewsBills.do',
		data : JSON.stringify(params),
        contentType : "application/json;charset=UTF-8",
        success : function(data) {
        	if (data.commonResponse.success == true) {
        		var rlength=getjsonLength(data.records);
        		console.info(JSON.stringify(data));
        		 
        		for(var m=0;m<rlength;m++){
        			//对于过长的title 进行截取 长度超过20的减为20
        			if(data.records[m].newsTitle.length>25){
        				data.records[m].newsTitle=data.records[m].newsTitle.substring(0,25)+"...";
        			}
        		}
				//将查出的数据分为两部分，放入缓存，用于翻页加载
				splitPage(data);
				/*if(Request.column!=null){
					document.getElementById("columnTitle").innerText="全部栏目";
					document.getElementById("columnTitle").innerText=data.billInfo.columnName;
				}else{
				}*/
			} else {
				console.info(data.commonResponse.errorDesc);
			}
        }
        });
	
}


function getColumnList(){
	$.ajax({
	    type : 'get',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/HZInterfaceSet/getYesterdayColumnList.do',
        contentType : "application/json;charset=UTF-8",
        success : function(data) {
        	if (data.commonResponse.success == true) {
        		var rlength=getjsonLength(data.records);
        		columnNum=rlength;
        		if(rlength<5){
        			rlength=rlength;
        		}else{
        			rlength=5;
        		}
        		for(var m=0;m<rlength;m++){
        			var titlePic=document.getElementById("columnNames");
        			var div=document.createElement("div");
        			div.className="columnName";
        			var varId="columnName"+m;
        			div.id=varId;
        			titlePic.appendChild(div);
        			document.getElementById(varId).innerText=data.records[m];
        		}
			} else {
				console.info(data.commonResponse.errorDesc);
			}
        }
        });
}



//翻页（翻牌效果）
function changePage(){
	 var count = jQuery(".jqflip-parent").length; 
	 //不满8条一屏幕就不翻页  第二页无数据 则不翻页
	 if(count<8){
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

function UrlSearch() 
{
   var name,value; 
   var str=location.href; //取得整个地址栏
   var num=str.indexOf("?") 
   str=str.substr(num+1); //取得所有参数   stringvar.substr(start [, length ]

   var arr=str.split("&"); //各个参数放到数组里
   for(var i=0;i < arr.length;i++){ 
    num=arr[i].indexOf("="); 
    if(num>0){ 
     name=arr[i].substring(0,num);
     value=arr[i].substr(num+1);
     this[name]=value;
     } 
    } 
} 
//向后台请求数据
function loadSelectApiList() {
		var Request=new UrlSearch(); //实例化
	// 构建JSON数据信息
		var params = {
				"column":Request.column
				};	
	$.ajax({
		    type : 'POST',
	        async : false,
	        dataType : 'json',
			url : '/DYBigScreen/HZInterfaceSet/getYesterdayNewsBillsByCloumn.do',
			//url : '/DYBigScreen/HZInterfaceSet/getTodayNewsBills.do',
			data : JSON.stringify(params),
	        contentType : "application/json;charset=UTF-8",
	        success : function(data) {
            	if (data.commonResponse.success == true) {
            		var rlength=getjsonLength(data.records);
            		console.info(JSON.stringify(data));
            		for(var m=0;m<rlength;m++){
            			//对于过长的title 进行截取 长度超过20的减为20
            			if(data.records[m].newsTitle.length>18){
            				data.records[m].newsTitle=data.records[m].newsTitle.substring(0,18)+"...";
            			}
            		}
    				//将查出的数据分为两部分，放入缓存，用于翻页加载
    				var titlePic=document.getElementById("columnNames");
        			var div=document.createElement("div");
        			div.className="columnName";
        			var varId="columnName"+0;
        			div.id=varId;
        			titlePic.appendChild(div);
    				document.getElementById(varId).innerText=data.billInfo.columnName;
    				splitPage(data);
    			} else {
    				console.info(data.commonResponse.errorDesc);
    			}
	        }
	        });
}

//数组去重法 
function unique1(array){ 
var n = []; //一个新的临时数组 
//遍历当前数组 
for(var i = 0; i < array.length; i++){ 
//如果当前数组的第i已经保存进了临时数组，那么跳过， 
//否则把当前项push到临时数组里面 
if (n.indexOf(array[i]) == -1) n.push(array[i]); 
} 
return n; 
}

function getjsonLength(json){
    var jsonLength=0;
    for (var i in json) {
        jsonLength++;
    }
    return jsonLength;
}
//暂停方法
function sleep(numberMillis) { 
	var now = new Date(); 
	var exitTime = now.getTime() + numberMillis; 
	while (true) { 
	now = new Date(); 
	if (now.getTime() > exitTime) 
	return; 
	} 
}

//加载页面的方法
function splitPage(data){//=======================!!!!!!!!!!!!!!!!!!
	/*for(var i = 0; i < uniqueArray.length; i++){ */
	var totalCount =getjsonLength(data.records);	//总条目数量
	var pageLimit=8;								//每页容量
	var totalPage =Math.ceil(totalCount/pageLimit);	//总页数
		var dataInfo1 = {};
	    dataInfo1.records = [];
	    var dataInfo2 = {};
	    dataInfo2.records = [];
	    var dataInfo3 = {};
	    dataInfo3.records = [];
	    //var blankNum = 8-data.records.length;
	    //遍历查询数据，将查出的数据分为两部分，放入缓存
	    $.each(data.records,function(i,item){
	    	if(i<8 && item){
	    	   dataInfo1.records.push(item);
	    	}else if( 7<i && i<16 && item){
	    	   dataInfo2.records.push(item);
	    	}else if( 15<i && i<24 && item){
	    	   dataInfo3.records.push(item);
	    	}
		});
		
	    //加载首页
	    var html1 = template('select1-list-item', dataInfo1);
		document.getElementById('select1').innerHTML = html1;
		if(dataInfo2.records.length>0){
		setTimeout(function(){
			 var html1 = template('select1-list-item', dataInfo2);
				document.getElementById('select1').innerHTML = html1;
		},12000)
		}
		if(dataInfo3.records.length>0){
			setTimeout(function(){
				 var html1 = template('select1-list-item', dataInfo3);
					document.getElementById('select1').innerHTML = html1;
			},12000)
		}
		if(Request.column==null | Request.column==""){
			setTimeout(function(){
				changeColor(ondex);
			},29000);
		}else{
			setTimeout(function(){
				init();
			},29000);
		}
			
		
		//若当前页面数据第二页不足满页 需要填充空白
		/*if(blankNum<4&&blankNum>0){
			document.getElementById('select2').append("<div class='jqflip-parent ' style='height: 222px;'></div>")
		}*/
		/*setEchartsList(data);*/
	/*}*/
	}
//==========================================目前暂不需要的方法===============================================================================

/*function titleLegthDiy(a,b){
	if(a.length>b){
		return a.substring(0,b);
	}else{
		return a;
	}
}*/



/*//来源于控制端传递的数据
function loadSelectControlList(data) {
	splitPage(data);
}
*/
/*
function loadServerUrl(){
	var url="";
	ajaxRequest({
		type : 'GET',
		url : '../../api/user/queryServerUrl?type=31',
		success : function(data) {
			if (data.commonResponse.success == true) {
				window.localStorage.setItem("zhihuidiaoduUrl", JSON.stringify(data.url));
				url = data.url;
			} 
		}
	});
	window.localStorage.setItem("zhihuidiaoduURL", url);
	return url;
}*/
/*
function setEchartsList(data){
	$.each(data.records,function(i,item){
		//无任务的选题 不显示环形百分比
		if(item.missonNum!=null&&item.missonNum>0){
			setEcharts(item)
		}else{
		   //显示无任务
		   $("#container"+item.taskGuid).html("<img src='../../img/icon_wrw.png' style='margin-top:23px;' /> ")
		}
	});
}*/
/*
///计算两个整数的百分比值 
function GetPercent(num, total) { 
num = parseFloat(num); 
total = parseFloat(total); 
if (isNaN(num) || isNaN(total)) { 
return "-"; 
} 
return total <= 0 ? "0%" : (Math.round(num / total * 100)  + "%"); 
} */
/*function setEcharts(data){
	var rwNum_wly = 0;
	var rwNum_jxz = 0;
	var rwNum_wc = 0;
	var rwNum_zz = 0;
	var rwRrogress = 0;
	var missonNum = 1;
	rwNum_wly = data.wzpMissonNum;
	rwNum_jxz = data.jzxMissonNum;
	rwNum_wc = data.finishMissonNum;
	rwNum_zz = data.zzMissonNum;
	rwNum_all = data.missonNum;
//	console.log(data.wzpMissonNum, data.jzxMissonNum, data.finishMissonNum, data.zzMissonNum);
	console.log(rwNum_wc,rwNum_all);
	if(data.missonNum != 0){
		missonNum = data.missonNum;
	}
	if(rwNum_all == 0 && rwNum_wc == 0){
		rwNum_all = 1;
	}
	rwRrogress = GetPercent(data.finishMissonNum,rwNum_all);
	
	//console.info(missonNum);
	rwData = [];
	//终止类型任务,环形百分比颜色为红色
	var percentColor ='#2aff00'; 
	if(data.status==2){
		percentColor = '#ae1b07';
	}
	rwData.push({value:rwNum_wc,itemStyle:{normal:{color:percentColor}}});
	rwData.push({value:rwNum_all-rwNum_wc,itemStyle:{normal:{color:'#1d2233'}}});*/
	
	/*var dom = document.getElementById("container"+data.taskGuid);
	var myChart = echarts.init(dom);
	var app = {};
	option = null;
	app.title = '环形图';
	option = {
		    title:{
		        text : rwRrogress,
		        textStyle: {
		            fontSize: 30,
		            fontWeight: 'bolder',
		            color: '#FFFFFF'  
		        },
		        x: 'center',
		        y: 'center'
		    },
		    series: [
		        {
		            name:'任务进度',
		            type:'pie',
		            radius: ['40%', '70%'],
		            avoidLabelOverlap: false,
		            label: {
		                normal: {
		                    show: false,
		                    position: 'center'
		                }
		            },
		            data:rwData
		        }
		    ]
		};
	if (option && typeof option === "object") {
	    myChart.setOption(option, true);
	}
	
}*/
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
