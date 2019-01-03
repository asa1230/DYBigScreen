$(function(){
	init();
});
var timer;
function init(){
	clearInterval(timer);
	var interval = window.localStorage.getItem("interval");
	if(interval == "open"){
		timer = setInterval(function(){
			location.href = "../../view/show/reportSelect.html";
		},10000);
	}
}

var dom = document.getElementById("container");
var myChart = echarts.init(dom);
var app = {};
option = null;

var dataLY = [
  
  
    [50,42,258,201,87,81],
  
];
var dataWX = [
   
   
    [45,32,210,158,96,85],
  
];

var dataLC = [
   
   
    [30,26,162,147,74,65],
   
];


var dataAVE = [
   
   
    [38,35,225,169,80,76],
  
];


var lineStyle = {
    normal: {
        width: 7,
        opacity: 1
    }
};

option = {
    backgroundColor: '',



    radar: {
        indicator: [
            {name: '报题量', max: 60},
            {name: '选用报题量', max: 50},
            {name: '任务量', max: 300},
            {name: '完成任务量', max: 210},
            {name: '参与选题量', max: 100},
            {name: '完成选题量', max: 100}
        ],
        shape: 'circle',
        splitNumber: 6,
        name: {
            textStyle: {
                color: '#d15519',
                fontSize:30
            }
        },
        splitLine: {
            lineStyle: {
                color: [
                    'rgba(238, 197, 102, 0.5)', 'rgba(238, 197, 102, 0.6)',
                    'rgba(238, 197, 102, 0.6)', 'rgba(238, 197, 102, 0.6)',
                    'rgba(238, 197, 102, 0.8)', 'rgba(238, 197, 102, 0.8)','rgba(238, 197, 102, 1)'
                ].reverse()
            }
        },
        splitArea: {
            show: false
        },
        axisLine: {
            lineStyle: {
                color: 'rgba(238, 197, 102, 0.5)'
            }
        }
    },
    series: [
        {
            name: '李颖',
            type: 'radar',
            lineStyle: lineStyle,
            data: dataLY,
            symbol: 'none',
            itemStyle: {
                normal: {
                    color: '#50bc0e'
                }
            },
       
        },
        {
            name: '王旭',
            type: 'radar',
            lineStyle: lineStyle,
            data: dataWX,
            symbol: 'none',
            itemStyle: {
                normal: {
                    color: '#12c2f1'
                }
            },
        
        },
        {
            name: '刘畅',
            type: 'radar',
            lineStyle: lineStyle,
            data: dataLC,
            symbol: 'none',
            itemStyle: {
                normal: {
                    color: '#F00'
                }
            },
        },
            
         {
           name: 'KPI',
            type: 'radar',
            lineStyle: lineStyle,
            data: dataAVE,
            symbol: 'none',
            itemStyle: {
                normal: {
                    color: '#ffa20c'
                }
            },
          
          
        }
    ]
};


if (option && typeof option === "object") {
    myChart.setOption(option, true);
}


//------------------消息模块-------------------------//
var websocket = null;
var pageId = "tj_kpi_show";
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
		
	}else if(msg.type == "refresh" && (msg.content == 6 || msg.content == "all")){
		 window.location.reload();
	}
}
