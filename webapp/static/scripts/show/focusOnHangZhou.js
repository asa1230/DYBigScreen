$(function(){
	init();
});

var timer1;
var timer2;
var colorIndex=0;
function init(){
	//1、加载选题列表
	loadSelectApiList(colorIndex);
	//2、启动定时器翻页
	timer1 = setInterval(function(){
		changePage();
	},20000);
	//3、启动定时器刷新
	timer2 = setInterval(function(){
		loadSelectApiList(colorIndex);
	},40000);
}

//翻页（翻牌效果）
function changePage(){
	 var count = jQuery(".jqflip-parent").length; 
	 //不满4条一屏幕就不翻页
	 if(count<4){
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
function loadSelectApiList(colorNum) {
	var resourcetype;
	
	if(colorNum==0){
		resourcetype=0;
	}else if(colorNum==1){
		resourcetype=4;
	}else if(colorNum==2){
		resourcetype=11;
	}
	// 构建JSON数据信息
	var paramss = {
			"page":0,
			"pageSize":12,
			"resourceMediaType":[resourcetype],//0（资讯）、1（论坛）、4（微博）、11（微信）
			"fullTextContent":'杭州',
			"author":null};	
	$.ajax({
		    type : 'POST',
	        async : false,
	        dataType : 'json',
	        url  : 	'/DYBigScreen/clueCloudInterface/getClueListByKeyWord.do',
	        data: JSON.stringify(paramss),
	        contentType : "application/json;charset=UTF-8",
	        success : function(data) {
            	if (data.commonResponse.success == true) {
            		
            		var rlength=getjsonLength(data.records);
            		console.info(JSON.stringify(data));
            		for(var m=0;m<rlength;m++){
            			//对于过长的title 进行截取 长度超过20的减为20
            			
            			if(	data.records[m].title.length>22){
            				data.records[m].title=data.records[m].title.replace(/<[^>]+>/g,"");
            				data.records[m].title=data.records[m].title.substring(0,22)+"...";
            			}
            				data.records[m].createdTime=data.records[m].createdTime.substring(5,16);
            				
            		}
    				//将查出的数据分为两部分，放入缓存，用于翻页加载
    				splitPage(data);
    				changecolor(colorNum);
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
function changecolor(colorNo){
	var targetId;
	if(colorNo==0){
		targetId='resourceName1';
		var di1=document.getElementById('resourceName2');
		var di2=document.getElementById('resourceName3');
		di1.style.color='#00ffde';
		di2.style.color='#00ffde';
	}else if(colorNo==1){
		targetId='resourceName2';
		var di1=document.getElementById('resourceName1');
		var di2=document.getElementById('resourceName3');
		di1.style.color='#00ffde';
		di2.style.color='#00ffde';
	}else if(colorNo==2){
		targetId='resourceName3';
		var di1=document.getElementById('resourceName1');
		var di2=document.getElementById('resourceName2');
		di1.style.color='#00ffde';
		di2.style.color='#00ffde';
	}
	var di=document.getElementById(targetId);
	di.style.color='yellow';
	if(colorIndex<2){
		colorIndex++;
	}else{
		colorIndex=0;
	}
};

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
		
		//若当前页面数据第二页不足满页 需要填充空白
		/*if(blankNum<4&&blankNum>0){
			document.getElementById('select2').append("<div class='jqflip-parent ' style='height: 222px;'></div>")
		}*/
		
		setEchartsList(data);
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
var websocket = null;
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
