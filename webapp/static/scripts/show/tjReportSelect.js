$(function(){
	init();
//	console.info(JSON.stringify(myData));
});

var timer;
var myChart;

function init(jsonFile){
	//1、从json中获取数据
	var jsonFile;
	if(jsonFile == "" || jsonFile == null){
		jsonFile = "../../json/tj_bxt_all.json"; 	
	}
	$.getJSON(jsonFile, function(data){ 
		myData = data;
		var series=[];

		$.each(myData.type,function(i,item){
			series.push({
		        name: item.name,
		        type: 'bar',
		        barWidth: '45%',
		        stack: '栏目',
		        itemStyle:
		        {
		            normal:
		            {
		                color:item.color
		            }
		        },
		        data: item.nums
		    });
		});
//		window.localStorage.setItem("tj_bxt",JSON.stringify(data));
		var dom = document.getElementById("container");
		myChart = echarts.init(dom);
		var app = {};
		var option = null;
		option = {
		    tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    legend: {
		        show:false,
		        itemWidth:30,
		        itemHeight:20,
		        height:10,
				   textStyle:
				   {
				       fontFamily:'方正兰亭黑简体',
				       fontSize:'28px',
				       fontWeight:'blod',
				       
				   },

				   itemGrap:80,
		           data:['报题未选用','报题选用','直接指派']
		       },
		    grid: {
		       left: '2%',
		        right: '',
		        bottom: '10%',
		        containLabel: true
		    },
		    xAxis : [
		        {
		            type : 'category',
		      data:myData.column, 
		        
		        }
		   ],
		    yAxis : [
		        {
		            type : 'value',
				axisLabel:{
					formatter : '{value}' ,
					textStyle:
		   				 {
							  fontSize:23,
							  color:'#fff'
		  				  }
					},
		            splitLine:{ 
		            	show:true
		            	},
			     }
		    ],
		    
		    series : series
		};


		app.currentIndex = -1;

		app.timeTicket = setInterval(function () {
		    var dataLen = option.series[0].data.length;
		    // 取消之前高亮的图形
		    myChart.dispatchAction({
		        type: 'downplay',
		        seriesIndex: 0,
		        dataIndex: app.currentIndex
		    });
		    app.currentIndex = (app.currentIndex + 1) % dataLen;
		    // 高亮当前图形
		    myChart.dispatchAction({
		        type: 'highlight',
		        seriesIndex: 0,
		        dataIndex: app.currentIndex
		    });
		    // 显示 tooltip
		    myChart.dispatchAction({
		        type: 'showTip',
		        seriesIndex: 0,
		        dataIndex: app.currentIndex
		    });
		}, 3000);
		;
		if (option && typeof option === "object") {
		    myChart.setOption(option, true);
		}
		
		setTotalNums(data);
	}); 
	
	//2、启动定时器
	var interval = window.localStorage.getItem("interval");
	clearInterval(timer);
	if(interval == "open"){
		  timer = setInterval(function(){
				location.href = "../../view/show/mission.html";
			},10000);
	}
}

//设置三类状态统计总数
function setTotalNums(data){
	var noSelect = 0;
	var select = 0;
	var assign = 0;
	$.each(data.type,function(i,item){
		if(item.name == "报题未选用"){
			$.each(item.nums,function(i,item){
				noSelect += item;
			});
		}else if(item.name == "报题选用"){
			$.each(item.nums,function(i,item){
				select += item;
			});
		}else if(item.name == "直接指派"){
			$.each(item.nums,function(i,item){
				assign += item;
			});
		}
	});
	
	$("#noSelect").html(noSelect);
	$("#select").html(select);
	$("#assign").html(assign);
}





//------------------消息模块-------------------------//
var websocket = null;
var pageId = "tj_bxt_show";
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
	console.info(event.data);
	if(msg.type == "tjType"){
		//清除定时器
		clearInterval(timer);
		window.localStorage.setItem("interval", "close");
		//根据控制端跳转
		if(msg.content == "task"){
			location.href = "../../view/show/reportSelect.html";
		}else if(msg.content == "mission"){
			location.href = "../../view/show/mission.html";
		}else if(msg.content == "device"){
			location.href = "../../view/show/device.html";
		}else if(msg.content == "kpi"){
			location.href = "../../view/show/kpi.html";
		}
	}else if(msg.type == "isPolling"){
		if(msg.content == "open"){
			window.localStorage.setItem("interval", "open");
			init();
		}else{
			//清除定时器
			clearInterval(timer);
			window.localStorage.setItem("interval", "close");
		}
		
	}else if(msg.type == "columnName"){
		if(msg.content){
			init("");
		}else{
			init("../../json/tj_bxt_lm1.json");
		}
	}else if(msg.type == "columnType"){
		if(msg.value == "wxy"){
			if(!msg.content){
				$("#noSelectDiv").hide();
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        // 图例名称
			        name: '报题未选用'
			    });
			}else{
				$("#noSelectDiv").show();
				myChart.dispatchAction({
			        type: 'legendSelect',
			        // 图例名称
			        name: '报题未选用'
			    });
			}
		}
		if(msg.value == "xy"){
			if(!msg.content){
				$("#selectDiv").hide();
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        // 图例名称
			        name: '报题选用'
			    });
			}else{
				$("#selectDiv").show();
				myChart.dispatchAction({
			        type: 'legendSelect',
			        // 图例名称
			        name: '报题选用'
			    });
			}
		}
		if(msg.value == "zp"){
			if(!msg.content){
				$("#assignDiv").hide();
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        // 图例名称
			        name: '直接指派'
			    });
			}else{
				$("#assignDiv").show();
				myChart.dispatchAction({
			        type: 'legendSelect',
			        // 图例名称
			        name: '直接指派'
			    });
			}
		}
		
	}else if(msg.type == "refresh" && (msg.content == 6 || msg.content == "all")){
		 window.location.reload();
	}
}
