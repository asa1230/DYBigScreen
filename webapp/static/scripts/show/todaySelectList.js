$(function(){
	init();
});
//var btn=document.getElementById('searchButton');


/*btn.onclick=function(){
	$("#columnList").slideToggle();
	$("#selectState").slideToggle();
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
}*/



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
	 //不满4条一屏幕就不翻页==========================
	 if(count<6){
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
	
		/*var sel=document.getElementById("columnList"); 
		var index = sel.selectedIndex; // 选中索引
		var albumid= sel.options[index].value;//要的值
		 	*/		
		var columnList=$("#columnList").val();
		var selectState=$("#selectState").val();
	
	// 构建JSON数据信息
		var params = {
				"column":columnList,
				"state":selectState};	
	
	$.ajax({
		    type : 'get',
	        async : false,
	        dataType : 'json',
			url : '/DYBigScreen/HZInterfaceSet/getselectList.do?',
			//url : '/DYBigScreen/HZInterfaceSet/selectListFromNewsCommand.do?',
			//url : '/DYBigScreen/HZInterfaceSet/selectListFromBsNews.do?',
	        contentType : "application/json;charset=UTF-8",
	        success : function(data) {
            	if (data.commonResponse.success == true) {
            		var rlength=getjsonLength(data.records);
            		console.info(JSON.stringify(data));
            		
            		for(var m=0;m<rlength;m++){
            			//对于过长的title 进行截取 长度超过20的减为20
            			if(data.records[m].newsTaskTitle.length>18){
            				data.records[m].newsTaskTitle=data.records[m].newsTaskTitle.substring(0,18)+"...";
            			}
            			if(data.records[m].taskState==2){
            				data.records[m].taskState='选题终止';
            			}else if(data.records[m].taskState==0){
            				data.records[m].taskState='进行中';
            			}else if(data.records[m].taskState==104){
            				data.records[m].taskState='未指派';
            			}else if(data.records[m].taskState==1){
            				data.records[m].taskState='已完成';
            			}else if(data.records[m].taskState==8){
            				data.records[m].taskState='选题已保存';
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


function splitPage(data){//=======================!!!!!!!!!!!!!!!!!!
	/*for(var i = 0; i < uniqueArray.length; i++){ */
		
		var dataInfo1 = {};
	    dataInfo1.records = [];
	    var dataInfo2 = {};
	    dataInfo2.records = [];
	    //var blankNum = 8-data.records.length;
	    //遍历查询数据，将查出的数据分为两部分，放入缓存
	    $.each(data.records,function(i,item){
	    	if(i<6 && item){
	    	   dataInfo1.records.push(item);
	    	}else if(5<i && i<12 && item){
	    	   dataInfo2.records.push(item);
	    	}
		});
		
	    //加载首页
		var html1 = template('select1-list-item', dataInfo1);
		document.getElementById('select1').innerHTML = html1;
		
		var html2 = template('select2-list-item', dataInfo2);
		document.getElementById('select2').innerHTML = html2;
		
		//若当前页面数据第二页不足满页 需要填充空白
		/*if(blankNum<4&&blankNum>0){
			document.getElementById('select2').append("<div class='jqflip-parent ' style='height: 222px;'></div>")
		}*/
		/*setEchartsList(data);*/
	/*}*/
	}
	

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
}

///计算两个整数的百分比值 
function GetPercent(num, total) { 
num = parseFloat(num); 
total = parseFloat(total); 
if (isNaN(num) || isNaN(total)) { 
return "-"; 
} 
return total <= 0 ? "0%" : (Math.round(num / total * 100)  + "%"); 
} 


function setEcharts(data){
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
	rwData.push({value:rwNum_all-rwNum_wc,itemStyle:{normal:{color:'#1d2233'}}});
	
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
	}*/
	
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