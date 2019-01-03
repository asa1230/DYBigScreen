var isbusy = false;    //zhy add
var timer2;

$(function(){
	init();
});


var pageData=null;
var echartData = {};
function init(){
	//1、加载选题列表
	loadSelectApiList();
	
	timer2 = setInterval(function(){  //zhy add
		loadSelectApiList();
	},120000);
	
	initSwiper();
	
	// 定时刷新	
	window.setInterval(function(){ 
		window.location.reload();
	}, 600000); 
}

var mySwiper = null;
var initSwiper = function(){
	
	var frequncy = parseInt(todaySelectSwitchFrequncy);
	if(null==frequncy || Number.isNaN(frequncy))
		frequncy = 5000;
	else
		frequncy = frequncy *1000;
	
	var autoplayparams = {};
	autoplayparams.delay = frequncy;
	
	mySwiper = new Swiper ('.swiper-container', {
        direction: 'vertical',
        loop: true,
       /*autoHeight:true,*/
       height:906,
       /*
       autoplay: {
         delay:  todaySelectSwitchFrequncy, //5000,//1秒切换一次
         },
        */
       autoplay:autoplayparams,       
        speed:1000,
        freeMode : false,
        scrollbar: {
            el: '.swiper-scrollbar',
            hide: true,
        },
        on: {
            init: function(){
              //Swiper初始化了
//              alert('当前的slide序号是'+this.activeIndex);
            },
            slideChangeTransitionStart: function(){
            	
            	if(isbusy)       //zhy add
            		return;
            	isbusy=true;
            	
            	var index = this.activeIndex;
            	var obj = this.slides[index];
            	var s4 = $(obj).find(".resOne");
            	
            	$(s4).each(function(i,e){
            		var dom = $(e).find(".res_right div").get(0);
            		console.log("11111---"+dom);
            		var _id = $(dom).attr("name");
            		var id = _id.replace("container","");
            		var edata = echartData[id];
            		edata.showEchart(dom);
            	});            	
            	
            	isbusy=false;   //zhy add
              },
          }
    });
	
}


function loadServerUrl(){
	var url="";
	window.localStorage.setItem("zhihuidiaoduURL", url);
	return url;
}


//来源于控制端传递的数据
function loadSelectControlList(data) {
	
	if (data.commonResponse.success == true) {
		var rlength=getjsonLength(data.records);
		console.info(JSON.stringify(data));
		for(var m=0;m<rlength;m++){
			//对于过长的title 进行截取 长度超过20的减为20
			if(data.records[m].title.length>20){
				data.records[m].title=data.records[m].title.substring(0,20)+"...";
			}
			if(data.records[m].content != null){
				data.records[m].content=titleLegthDiy(data.records[m].content,60)
				var div = document.createElement("div");		//去掉HTML格式，变成纯文本
				div.innerHTML = data.records[m].content;
				data.records[m].content = div.innerText;
			}
			if(data.records[m].status!=null)
				data.records[m].statusdesp = xuantiStatusDesp[data.records[m].status];
		}
		
		//将查出的数据分为两部分，放入缓存，用于翻页加载
		pageData = data;
		splitPage(data);
	} else {
		console.info(data.commonResponse.errorDesc);
	};

}


//获取选题列表
function loadSelectApiList() {
	
	if(isbusy)                     //zhy add
	{
		 setTimeout(function(){					 
			 loadSelectApiList();
		 },1000);
		 
		 return;
	}
	
	isbusy = true;
	
	
	var url = window.localStorage.getItem("zhihuidiaoduURL");
	// 构建JSON数据信息
	var params = {};
	params.start = 1;
	params.limit = 8;
	params.isShow = 1;//是否上屏（0，不上屏 ；1，上屏）
	params.userId = defaultUserId;
	params.xuantistate = -1;
	$.ajax({
		    type : 'POST',
	        async : false,
	        dataType : 'json',
			url : '/DYBigScreen/DYNewsCommandMobileInterface/selectProgressList.do',
	        contentType : "application/json;charset=UTF-8",
	        data : JSON.stringify(params),
	        success : function(data) {
	        	console.log(data);
            	if (data.commonResponse.success == true) {
            		var rlength=getjsonLength(data.records);
            		for(var m=0;m<rlength;m++){
            			//对于过长的title 进行截取 长度超过20的减为20
            			if(data.records[m].title.length>20){
            				data.records[m].title=data.records[m].title.substring(0,20)+"...";
            			}
            			if(data.records[m].content != null){
            				data.records[m].content=data.records[m].content.substring(0,60)+"...";
            				var div = document.createElement("div");		//去掉HTML格式，变成纯文本
            				div.innerHTML = data.records[m].content;
            				data.records[m].content = div.innerText;
            			}
            			if(data.records[m].status!=null)
            				data.records[m].statusdesp = xuantiStatusDesp[data.records[m].status];
            			
            			if(data.records[m].ownColumn==null || data.records[m].ownColumn=="")
            				data.records[m].ownColumn = defaultPrePushCliname;
            		}
    				//将查出的数据分为两部分，放入缓存，用于翻页加载
            		pageData = data;
    				splitPage(data);    				
    				
    				isbusy = false;  //zhy add    				
    				
    			} else {
    				isbusy = false;  //zhy add    				
    				alert(data.commonResponse.errorDesc);    				
    			}
	        },
	        complete:function(){
	        	isbusy = false;  //zhy add	        	
	        }
	        
	 });
}

function titleLegthDiy(a,b){
	if(a.length>b){
		return a.substring(0,b)+"...";
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
	    	if(i<4 && item){
	    	   dataInfo1.records.push(item);
	    	}else if(item){
	    	   dataInfo2.records.push(item);
	    	}
		});
		
	    //加载首页
		var html1 = template('select1-list-item', dataInfo1);
//		document.getElementById('select1').innerHTML = html1;
		$(".select1").html(html1);
		
		if(dataInfo2.records.length>0)             //zhy mod
		{
			var html2 = template('select2-list-item', dataInfo2);
//			document.getElementById('select2').innerHTML = html2;
			$(".select2").html(html2);			
		}
		else                                      //zhy mod
		{
			var html2 = template('select2-list-item', dataInfo1);
			$(".select2").html(html2);			
		}
		
		
		setEchartsList(data);
		
		if(null!=mySwiper){
			var index = mySwiper.activeIndex;
	    	var obj   = mySwiper.slides[index];
	    	var s4 = $(obj).find(".resOne");    	
	    	$(s4).each(function(i,e){
	    		var dom = $(e).find(".res_right div").get(0);    		
	    		var _id = $(dom).attr("name");
	    		var id = _id.replace("container","");
	    		var edata = echartData[id];
	    		edata.showEchart(dom);
	    	});    
		}
		   
	}
	

function setEchartsList(data){
	$.each(data.records,function(i,item){
		let ec = pageEchart(item);
		echartData[item.taskGuid] = ec;
		//var dom = document.getElementById("container"+data.taskGuid);
		//ec.showEchart(dom);
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


var pageEchart = function(data){
	var rwNum_wly = 0;
	var rwNum_jxz = 0;
	var rwNum_wc = 0;
	var rwNum_zz = 0;
	var rwRrogress = 0;
	var missonNum = 1;
	var rwNum_all = 1;
	rwNum_wly = data.wzpMissonNum;
	rwNum_jxz = data.jzxMissonNum;
	rwNum_wc = data.finishMissonNum;
	rwNum_zz = data.zzMissonNum;
	rwNum_all = data.missonNum;
//	console.log(data.wzpMissonNum, data.jzxMissonNum, data.finishMissonNum, data.zzMissonNum);
	if(data.missonNum != 0){
		missonNum = data.missonNum;
	}
	if(rwNum_all == 0 && rwNum_wc == 0){
		rwNum_all = 1;
	}
	rwRrogress = GetPercent(data.finishMissonNum,rwNum_all);
	
	
//	var dom = document.getElementById("container"+data.taskGuid);
//	var dom = $("[name='container"+data.taskGuid+"']");
	
	
	var getEchartOption = function(colorStatus){
        var dataStyle = {
            normal: {
                label: {
                    show: false
                },
                labelLine: {
                    show: false
                },
                shadowBlur: 40,
                shadowColor: 'rgba(40, 40, 40, 0.5)',
            }
        };
        var placeHolderStyle = {
            normal: {
                color: 'rgba(255, 255, 255, 0.3)',//未完成的圆环的颜色
                label: {
                    show: false
                },
                labelLine: {
                    show: false
                }
            },
            emphasis: {
                color: 'rgba(255, 255, 255, 0.3)'//未完成的圆环的颜色
            }
        };
        var option = {
            title: {
                text: rwRrogress,
                x: 'center',
                y: 'center',
                textStyle: {
                    fontWeight: 'normal',
                    color: "#fff",
                    fontSize: 55
                }
            },
            backgroundColor: 'transparent',
//            color: ['#eb644b', '#313443', '#fff'],
            color: [colorStatus, '#313443', '#fff'],
            tooltip: {
                show: false,
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                show: false,
                itemGap: 12,
                data: ['01', '02']
            },
            toolbox: {
                show: false,
                feature: {
                    mark: {
                        show: true
                    },
                    dataView: {
                        show: true,
                        readOnly: false
                    },
                    restore: {
                        show: true
                    },
                    saveAsImage: {
                        show: true
                    }
                }
            },
            series: [{
                name: 'Line 1',
                type: 'pie',
                clockWise: false,
                radius: [80, 85],
//                color: colorStatus,
                itemStyle: dataStyle,
                hoverAnimation: false,

                data: [{
//                    value: rwNum_wc,
                    value: data.finishMissonNum,
                    name: '01'
                }, {
//                    value: rwNum_all-rwNum_wc,
                    value: rwNum_all-data.finishMissonNum,
                    name: 'invisible',
                    itemStyle: placeHolderStyle
                }

                ]
            }, {
                name: 'Line 2',
                type: 'pie',
                animation: false,
                clockWise: false,
                color:'rgba(255, 255, 255, 0.3)',
                radius: [98, 97],
                itemStyle: dataStyle,
                hoverAnimation: false,
                tooltip: {
                    show: false
                },
                data: [{
                    value: rwNum_all,
                    name: '02',
                    itemStyle: {
                        emphasis: {
                            color: '#313443'
                        }
                    }
                }, {
                    value: 0,
                    name: 'invisible',
                    itemStyle: placeHolderStyle
                }

                ]
            },


            ]
        };
        
        return option;
    };
	
//    debugger;
    
    
	
    
    return {
    	showEchart : function(dom){
    		var color = "";
    		if(data.status==1){
    			color = '#00e4ef';
    		}else if(data.status==2){
    			 color = '#ff3346';
    		}else{
    			 color = '#3192f6';
    		}
    		var myChart = echarts.init(dom);
    		var option = getEchartOption(color);
    		myChart.setOption(option);
    		return myChart;
    	}
    	
    };
};


//------------------消息模块-------------------------//
var websocket = null;
var pageId = "selectProgress_show";
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
	else if(msg.type == "changetsfrequncy"){
		var frequncy = parseInt(msg.content);
		if(null==frequncy || Number.isNaN(frequncy))
			frequncy = 5000;
		else
			frequncy = frequncy *1000;
		
		var autoplayparams = {};
		autoplayparams.delay = frequncy;		
		mySwiper.params.autoplay.delay=frequncy;
	}
}
