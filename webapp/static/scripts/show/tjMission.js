$(function(){
	init();
});

var timer;
var myChart;
function init(jsonFile){
	//1、从json中获取数据
	var jsonFile;
	if(jsonFile == "" || jsonFile == null){
		jsonFile = "../../json/tj_rw_all.json"; 	
	}
	
	$.getJSON(jsonFile, function(data){ 
		myData = data;
		var dom = document.getElementById("container");
		myChart = echarts.init(dom);
		var app = {};
		option = null;
		app.title = '嵌套环形图';

		option = {
		        tooltip: {
		        trigger: 'item',
		        formatter: "{a} <br/>{b}: {c} ({d}%)<br/>"
		    },
		    legend: {
		        show:false,
		        itemWidth:30,
		        itemHeight:20,
		        height:10,
				itemGrap:80,
		        data:['苏州新闻','新闻夜班车','苏州今朝','未领用1','进行中1','已完成1','终止1','未领用2','进行中2','已完成2','终止2','未领用3','进行中3','已完成3','终止3']
		       },
		    series: [
		        {
		            name:'栏目任务量',
		            type:'pie',
		            selectedMode: 'single',
		            radius: [0, '60%'],

		            label: {
		                normal: {
		                    position: 'inner',
							textStyle:
							{
								fontSize:30,
							},

		                }
		            },
		            labelLine: {
		                normal: {
		                    show: false
		                }
		            },
		      
		            data: myData.column
		        },
		        {
		           
		            type:'pie',
		            radius: ['80%', '100%'],
		                 label: {
		                normal: {
		                  show: false
		                }
		            },
		            labelLine: {
		                normal: {
		                    show: false
		                }
		            },

		            data: myData.type
		        }
		    ]
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


		if (option && typeof option === "object") {
		    myChart.setOption(option, true);
		}

		setTotalNums(myData);
	});
	
	//
	$("#time").html(current());
	
	//2、启动定时器
	var interval = window.localStorage.getItem("interval");
	clearInterval(timer);
	if(interval == "open"){
		timer = setInterval(function(){
			location.href = "../../view/show/device.html";
		},10000);
	}
}

function current() {
	var d = new Date(), str = '';
	str += d.getFullYear() + '/'; // 获取当前年份
	str += d.getMonth() + 1 + '/'; // 获取当前月份（0——11）
	str += d.getDate();
	return str;
} 


//设置任务状态统计总数
function setTotalNums(data){
	var wly = 0;
	var jxz = 0;
	var ywc = 0;
	var zz = 0;
	var all = 0;
	$.each(data.type,function(i,item){
		all += item.value;
		if(item.name.indexOf("未领用") != -1){
			wly += item.value;
		}else if(item.name.indexOf("进行中") != -1){
			jxz += item.value;
		}else if(item.name.indexOf("已完成") != -1){
			ywc += item.value;
		}else if(item.name.indexOf("终止") != -1){
			zz += item.value;
		}
	});
	
	console.info(wly);
	console.info(jxz);
	console.info(ywc);
	console.info(zz);
	console.info(all);
	
	$("#all").html(all);
	$("#wly").html(wly);
	$("#jxz").html(jxz);
	$("#ywc").html(ywc);
	$("#zz").html(zz);
}




//------------------消息模块-------------------------//
var websocket = null;
var pageId = "tj_rw_show";
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
		if(msg.value == "column1"){
			if(!msg.content){
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '苏州新闻'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '未领用1'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '进行中1'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '已完成1'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '终止1'
			    });
			}else{
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '苏州新闻'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '未领用1'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '进行中1'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '已完成1'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '终止1'
			    });
			}
		}
		if(msg.value == "column2"){
			if(!msg.content){
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        // 图例名称
			        name: '新闻夜班车'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '未领用2'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '进行中2'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '已完成2'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '终止2'
			    });
			}else{
				myChart.dispatchAction({
			        type: 'legendSelect',
			        // 图例名称
			        name: '新闻夜班车'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '未领用2'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '进行中2'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '已完成2'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '终止2'
			    });
			}
		}
		if(msg.value == "column3"){
			if(!msg.content){
			   myChart.dispatchAction({
			        type: 'legendUnSelect',
			        // 图例名称
			        name: '苏州今朝'
			    });
			   myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '未领用3'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '进行中3'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '已完成3'
			    });
			 myChart.dispatchAction({
			        type: 'legendUnSelect',
			        name: '终止3'
			    });
			}else{
				myChart.dispatchAction({
			        type: 'legendSelect',
			        // 图例名称
			        name: '苏州今朝'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '未领用3'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '进行中3'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '已完成3'
			    });
				myChart.dispatchAction({
			        type: 'legendSelect',
			        name: '终止3'
			    });
			}
		}
		
	}else if(msg.type == "columnType"){
		if(msg.content){
			init("");
		}else{
			init("../../json/tj_rw_type.json");
		}
		
	}else if(msg.type == "refresh" && (msg.content == 6 || msg.content == "all")){
		 window.location.reload();
	}
}
