$(function(){
	init();
});

function init(){
	initHtmlTotal();
}

function getJsonFile(){
	var jsonFile= "../../json/map.json";
	$.getJSON(jsonFile, function(data){ 
		markerArr = data.maps;
		getMarker(markerArr,["people","device","car","clue"]);
	}); 
}



// 百度地图API功能
//第1步：创建Map实例
var map = new BMap.Map("allmap"); 
//第2步：设置地图中心点，北京市
var point = new BMap.Point(116.404, 39.915);
//第3步：初始化地图,设置中心点坐标和地图级别。
map.centerAndZoom(point, 12);
//第3步：启用滚轮放大缩小
map.enableScrollWheelZoom(true);
//第4步：绘制点  
//var mapInfo = JSON.parse(window.localStorage.getItem("mapInfo"));
//初始化是默认显示全部类型标注
//getMarker(markerArr,["people","device","car","clue"]);
getMarker();

//第5步：修改地图样式
var styleJson = [
                 {
                     "featureType": "water",
                     "elementType": "all",
                     "stylers": {
                               "color": "#3d85c6"
                     }
           },
           {
                     "featureType": "highway",
                     "elementType": "geometry.fill",
                     "stylers": {
                               "color": "#999999"
                     }
           },
           {
                     "featureType": "highway",
                     "elementType": "geometry.stroke",
                     "stylers": {
                               "color": "#000000"
                     }
           },
           {
                     "featureType": "arterial",
                     "elementType": "geometry.fill",
                     "stylers": {
                               "color": "#666666"
                     }
           },
           {
                     "featureType": "arterial",
                     "elementType": "geometry.stroke",
                     "stylers": {
                               "color": "#0b3d51"
                     }
           },
           {
                     "featureType": "local",
                     "elementType": "geometry",
                     "stylers": {
                               "color": "#444444"
                     }
           },
           {
                     "featureType": "land",
                     "elementType": "all",
                     "stylers": {
                               "color": "#050a1a"
                     }
           },
           {
                     "featureType": "railway",
                     "elementType": "geometry.fill",
                     "stylers": {
                               "color": "#444444"
                     }
           },
           {
                     "featureType": "railway",
                     "elementType": "geometry.stroke",
                     "stylers": {
                               "color": "#08304b"
                     }
           },
           {
                     "featureType": "subway",
                     "elementType": "geometry",
                     "stylers": {
                               "lightness": -40
                     }
           },
           {
                     "featureType": "all",
                     "elementType": "labels.text.fill",
                     "stylers": {
                               "color": "#ffffff"
                     }
           },
           {
                     "featureType": "all",
                     "elementType": "labels.text.stroke",
                     "stylers": {
                               "color": "#000000"
                     }
           },
           {
                     "featureType": "building",
                     "elementType": "geometry.fill",
                     "stylers": {
                               "color": "#0b5394",
                               "visibility": "on"
                     }
           },
           {
                     "featureType": "green",
                     "elementType": "geometry",
                     "stylers": {
                               "color": "#274e13"
                     }
           },
           {
                     "featureType": "boundary",
                     "elementType": "all",
                     "stylers": {
                               "color": "#00ffff"
                     }
           },
           {
                     "featureType": "manmade",
                     "elementType": "geometry.fill",
                     "stylers": {
                               "color": "#073763"
                     }
           },
           {
                     "featureType": "poi",
                     "elementType": "labels.text.fill",
                     "stylers": {
                               "color": "#00ffff"
                     }
           }
 ]
map.setMapStyle({
	styleJson : styleJson
});



// 添加标注
function addMarker(point, type) {
	var icon;
	if(type == "people"){
		icon = "../../img/m2_1.png";
	}else if(type == "device"){
		icon = "../../img/m3_1.png";
	}else if(type == "car"){
		icon = "../../img/m4_1.png";
	}else if(type == "clue"){
		icon = "../../img/m1_1.png";
	}
//	console.info(icon);
//     var myIcon = new BMap.Icon("http://api.map.baidu.com/img/markers.png",
    var myIcon = new BMap.Icon(icon,
        new BMap.Size(46, 50), {						
            offset: new BMap.Size(20, 50)// 指定定位位置  
            //imageOffset: new BMap.Size(0, 0 - index * 25)// 设置图片偏移  
        });
    var marker = new BMap.Marker(point, { icon: myIcon });
    map.addOverlay(marker);
    return marker;
}

function addInfoWindow(marker, poi) {
//	var content;
//	if(poi.type == "people"){
//		content = poi.title;
//	}else if(poi.type == "device"){
//		content = poi.title+" "+poi.num;
//	}else if(poi.type == "car"){
//		content = poi.title+" "+poi.num;
//	}else if(poi.type == "clue"){
//		content = poi.title;
//	}
//	
//	var label = new window.BMap.Label(content, { offset: new window.BMap.Size(20, -15) });  
//	label.setStyle({ 
//		color : "#000000", 
//		fontSize : "16px", 
//		fontFamily: "方正兰亭黑简体",
//		border :"0", 
//		fontWeight :"bold" 
//		});
//	marker.setLabel(label);

    
    var openInfoWinFun = function () {
    	showDetail(poi.id,poi.type);
    };
    marker.addEventListener("click", openInfoWinFun);
}

//加载右侧数据
function showDetail(id,type){
	var jsonFile= "../../json/map.json";
	$.getJSON(jsonFile, function(data){ 
		//遍历查询数据
	    $.each(data.maps,function(i,item){
	    	if(item.type == type){
	    		if(item.id == id){
	    			if(type == "people"){
	    	    		initHtmlPeople(item);
	    	    	}else if(type == "device"){
	    	    		initHtmlDevice(item);
	    	    	}else if(type == "car"){
	    	    		initHtmlCar(item);
	    	    	}else if(type == "clue"){
	    	    		initHtmlClue(item);
	    	    	}
	    		}
	    	}
		});
	});
	
}
/*
// 添加信息窗口
function addInfoWindow2(marker, poi) {
    //pop弹窗标题
    var title = '<div style="font-weight:bold;color:#CE5521;font-size:14px">' + poi.title + '</div>';
    //pop弹窗信息
    var html = [];
    html.push('<table cellspacing="0" style="table-layout:fixed;width:100%;font:12px arial,simsun,sans-serif"><tbody>');
    html.push('<tr>');
    if(poi.type == "people"){
        html.push('<td style="vertical-align:top;line-height:16px;width:58px;white-space:nowrap;word-break:keep-all">联系方式：</td>');
        html.push('<td style="vertical-align:top;line-height:16px">' + poi.tel + ' </td>');
    }else if(poi.type == "device"){
        html.push('<td style="vertical-align:top;line-height:16px;width:58px;white-space:nowrap;word-break:keep-all">设备编号：</td>');
        html.push('<td style="vertical-align:top;line-height:16px">' + poi.num + ' </td>');
    }else if(poi.type == "car"){
        html.push('<td style="vertical-align:top;line-height:16px;width:48px;white-space:nowrap;word-break:keep-all">车牌号：</td>');
        html.push('<td style="vertical-align:top;line-height:16px">' + poi.num + ' </td>');
    }else if(poi.type == "clue"){
        html.push('<td style="vertical-align:top;line-height:16px;width:48px;white-space:nowrap;word-break:keep-all">报料人：</td>');
        html.push('<td style="vertical-align:top;line-height:16px">' + poi.blPeople + ' </td>');
    }
    html.push('</tr>');
    html.push('</tbody></table>');
    var infoWindow = new BMap.InfoWindow(html.join(""), { title: title, width: 200 });

    var openInfoWinFun = function () {
        marker.openInfoWindow(infoWindow);
    	if(poi.type == "people"){
    		$("#showInfo").html(initHtmlPeople);
    	}else if(poi.type == "device"){
    		$("#showInfo").html(initHtmlDevice);
    	}else if(poi.type == "car"){
    		$("#showInfo").html(initHtmlCar);
    	}else if(poi.type == "clue"){
    		$("#showInfo").html(initHtmlClue);
    	}
    };
    marker.addEventListener("click", openInfoWinFun);
    return openInfoWinFun;
}*/


//汇总
function initHtmlTotal(){
	var html = 
'<div class="mapstyle">'+
'	<table width="49%" style="float: left">'+
'		<tr><td class="map-font1" align="left" valign="top">随心拍</td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font2">135</div></td></tr>'+
'		<tr><td align="right" colspan="2" valign="top"><div class="map-font3">人次使用随心拍</div></td></tr>'+
'	</table>'+
'	<table width="49%" style="float: left; border-left: 1px #666 solid; padding-left: 2%; margin-left: 2%;">'+
'		<tr><td class="map-font1" align="left" valign="top">新闻线索</td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font2">49</div></td></tr>'+
'		<tr><td align="right" colspan="2" valign="top"><div class="map-font3">条新产生线索</div></td></tr>'+
'	</table>'+
'	<div style="clear: both"></div>'+
'</div>'+
'<div class="mapstyle">'+
'	<div class="map-font1">生产任务</div>'+
'	<table width="49%" style="float: left">'+
'		<tr><td align="right" valign="top"><div class="map-font2">308</div></td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font3">条生产任务</div></td></tr>'+
'	</table>'+
'	<table width="49%" style="float: left">'+
'		<tr><td align="right" valign="top"><div class="map-font2">37</div></td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font3">条完成任务</div></td></tr>'+
'	</table>'+
'	<div style="clear: both"></div>'+
'</div>'+
'<div class="mapstyle">'+
'	<div class="map-font1">人员情况</div>'+
'	<table width="49%" style="float: left">'+
'		<tr><td align="right" valign="top"><div class="map-font2">52</div></td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font3">人员忙碌</div></td></tr>'+
'	</table>'+
'	<table width="49%" style="float: left">'+
'		<tr><td align="right" valign="top"><div class="map-font2">83</div></td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font3">人次任务执行</div></td></tr>'+
'	</table>'+
'	<div style="clear: both"></div>'+
'</div>'+
'<div class="mapstyle">'+
'	<div class="map-font1">设备情况</div>'+
'	<table width="33%" style="float: left">'+
'		<tr><td align="right" valign="top"><div class="map-font2">63</div></td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font3">台摄像机<br /> 78%</div></td></tr>'+
'	</table>'+
'	<table width="33%" style="float: left">'+
'		<tr><td align="right" valign="top"><div class="map-font2">20</div></td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font3">非编工作站<br /> 25%</div></td></tr>'+
'	</table>'+
'	<table width="33%" style="float: left">'+
'		<tr><td align="right" valign="top"><div class="map-font2">6</div></td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font3">移动非编<br /> 33%</div></td></tr>'+
'	</table>'+
'	<div style="clear: both"></div>'+
'</div>'+
'<div class="mapstyle" style="border-bottom: 0px;">'+
'	<div class="map-font1">车辆情况</div>'+
'	<table width="49%" style="float: left">'+
'		<tr><td align="right" valign="top"><div class="map-font2">9</div></td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font3">采访车辆<br />88%</div></td></tr>'+
'	</table>'+
'	<table width="49%" style="float: left">'+
'		<tr><td align="right" valign="top"><div class="map-font2">1</div></td></tr>'+
'		<tr><td align="right" valign="top"><div class="map-font3">转播车辆<br /> 50%</div></td></tr>'+
'	</table>'+
'	<div style="clear: both"></div>'+
'</div>';
	
	$("#showInfo").hide();
	$("#showInfo").html(html);
	$("#showInfo").fadeIn(1000);
}

//人员页面html
function initHtmlPeople(obj){
	var html = 
	     '<table width="90%" align="center" class="font-style3" style="margin-top:30px;">'+
			'<tr>'+
			'	<td width="30%" rowspan="2"><img src="'+obj.icon+'" width="100px" height="139px" /></td><td width="60%" height="52" valign="top">'+obj.title+'</td>'+
			'</tr>'+
			'<tr><td valign="top" class="font-style6">'+obj.tel+'</td></tr>'+
		 '</table>'+
		 '<table width="90%" align="center" >'+
		 	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon32.png" />当前任务</td></tr>'+
		 	'<tr><td class="font-style9">'+obj.mevents+'</td></tr>'+
		 	'<tr>'+
		 	'	<td class="map-font3 font-style8" height="60px"><img src="../../img/icon33.png" />任务类型</td></tr>'+
		 	'<tr><td class="font-style9 ">'+obj.mtype+'</td></tr>'+
		 	'<tr>'+
		 	'	<td class="map-font3 font-style8" height="60px"><img src="../../img/icon38.png" />所属选题</td></tr>'+
		 	'<tr><td class="font-style9">'+obj.selectTitle+'</td></tr>'+
		 	'<tr>'+
		 	'	<td class="map-font3 font-style8" height="60px"><img src="../../img/icon37.png" />当前位置</td></tr>'+
		 	'<tr><td class="font-style9">'+obj.place+'</td></tr>'+
		 '</table>';
	$("#showInfo").hide();
	$("#showInfo").html(html);
	$("#showInfo").fadeIn(1000);
}

//设备信息页面
function initHtmlDevice(obj){
	var html = 
	     '<table width="90%" align="center" class="font-style3" style="margin-top:30px;">'+
			'<tr>'+
			'	<td width="30%" rowspan="2"><img src="'+obj.icon+'" width="100px" height="70px" /></td>'+
			'	<td width="70%">'+obj.title+'</td>'+
          	'</tr>'+
          	'<tr><td class="font-style6">'+obj.num+'</td></tr>'+
         '</table>'+
         '<table width="90%" align="center" >'+
         	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon36.png" />使用人</td></tr>'+
         	'<tr><td class="font-style9">'+obj.user+'</td></tr>'+
         	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon32.png" />当前任务</td></tr>'+
         	'<tr><td class="font-style9">'+obj.mevents+'</td></tr>'+
         	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon37.png" />当前位置</td></tr>'+
         	'<tr><td class="font-style9">'+obj.place+'</td></tr>'+
         	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon35.png" />本月使用时长</td></tr>'+
         	'<tr><td class="font-style9">'+obj.useTime+'</td></tr>'+
         	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon31.png" />本月使用频率</td></tr>'+
         	'<tr><td class="font-style9">'+obj.useFrequency+'</td></tr>'+
         '</table>';	
	
	$("#showInfo").hide();
	$("#showInfo").html(html);
	$("#showInfo").fadeIn(1000);
}

//车辆信息页面
function initHtmlCar(obj){
	var html = 
	     '<table width="90%" align="center" class="font-style3" style="margin-top:30px;">'+
			'<tr>'+
				'<td width="30%" rowspan="2"><img src="'+obj.icon+'" width="100px" height="70px" /></td>'+
				'<td width="70%" class="font-style3">'+obj.title+'</td>'+
			'</tr>'+
			'<tr><td class="font-style6">'+obj.num+'</td></tr>'+
		 '</table>'+
		 '<table width="90%" align="center" >'+
		 	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon36.png" />司机姓名</td></tr>'+
		 	'<tr><td class="font-style9">'+obj.driver+'</td></tr>'+
		 	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon39.png" />联系方式</td></tr>'+
		 	'<tr><td class="font-style9">'+obj.tel+'</td></tr>'+
		 	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon32.png" />当前任务</td></tr>'+
		 	'<tr><td class="font-style9">'+obj.mevents+'</td></tr>'+
		 	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon37.png" />当前位置</td></tr>'+
		 	'<tr><td class="font-style9">'+obj.place+'</td></tr>'+
		 	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon35.png" />本月行驶里程</td></tr>'+
		 	'<tr><td class="font-style9">'+obj.mileage+'</td></tr>'+
		 	'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon31.png" />本月使用频率</td></tr>'+
		 	'<tr><td class="font-style9">'+obj.useFrequency+'</td></tr>'+
		 '</table>';		
	$("#showInfo").hide();
	$("#showInfo").html(html);
	$("#showInfo").fadeIn(1000);	
}


//线索信息页面
function initHtmlClue(obj){
	var html = 
	     '<table width="90%" align="center" style="margin-top:30px">'+
			'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon34.png" />线索名称</td></tr>'+
			'<tr><td class="font-style9">'+obj.title+'</td></tr>'+
			'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon36.png" />报料人</td></tr>'+
			'<tr><td class="font-style9">'+obj.blPeople+'</td></tr>'+
			'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon37.png" />发生地位置</td></tr>'+
			'<tr><td class="font-style9">'+obj.place+'</td></tr>'+
			'<tr><td class="map-font3 font-style8" height="60px"><img src="../../img/icon40.png" />线索内容</td></tr>'+
			'<tr><td class="font-style9">'+obj.content+'<p><video src="../../dataImg/1.mp4" controls="controls" loop="loop" autoplay = "autoplay" width="380" height="240"/></p></td></tr>'+
		'</table>';		
	$("#showInfo").hide();
	$("#showInfo").html(html);
	$("#showInfo").fadeIn(1000);		
}


function getMarker(showType){
	var jsonFile= "../../json/map.json";
	var markerArr;
	if(showType == undefined || showType == "" || showType == null){
		showType = ["people","device","car","clue"];
	}
	$.ajaxSettings.async = false;
	$.getJSON(jsonFile, function(data){ 
		 markerArr = data.maps;
	}); 
	map.clearOverlays()//移除之前添加的所有覆盖物
	for (var i = 0; i < markerArr.length; i++) {
		//数据类型（people,device,car,clue）
		var type = markerArr[i].type;
		if($.inArray(type, showType) != -1){
			//坐标
		    var p0 = markerArr[i].point.split(",")[0];
		    var p1 = markerArr[i].point.split(",")[1];
		    var maker = addMarker(new window.BMap.Point(p0, p1), type);
		    addInfoWindow(maker, markerArr[i], i); 
		}
	}
}

// function addInfoWindow(marker, poi) {  
//     marker.setAnimation(BMAP_ANIMATION_BOUNCE); //跳动的动画  
//     var label = new window.BMap.Label(poi.title, { offset: new window.BMap.Size(20, -10) });  
//     marker.setLabel(label);  
//     var clo="";  
//     if("我的位置"==poi.title){  
//         clo="#FF5782";  
//     }else{  
//         clo="#E6FED";  
//     }  
//     var info = new window.BMap.InfoWindow("<p style=’font-size:12px;lineheight:1.8em;color:"+clo+";’>" +poi.title+ "</p>"); // 创建信息窗口对象  
//     marker.addEventListener("mouseover", openInfoWinFun);  
//     var openInfoWinFun = function () {  
//         this.openInfoWindow(info);  
//     };  
//	}  

//-----------------------------消息接收------------------------//
var websocket = null;
var pageId = "map_show";
//判断当前浏览器是否支持WebSocket
if('WebSocket' in window){
	websocket = new WebSocket("ws://"+baseUrl+"/DYBigScreen/websocket/" + pageId);
}
else{
    alert('Not support websocket')
}
//连接发生错误的回调方法
websocket.onerror = function(){
    alert("client error");
};
 
//连接成功建立的回调方法
websocket.onopen = function(event){
    console.info("open client");
}
//连接关闭的回调方法
websocket.onclose = function(){
    console.info("close client");
}
//监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function(){
    websocket.close();
}
//关闭连接
function closeWebSocket(){
    websocket.close();
}

//接收到消息的回调方法
websocket.onmessage = function(event){
	var msg=JSON.parse(event.data);
	if(msg.type == "mapMove"){
		map.centerAndZoom(new BMap.Point(msg.MAP[0].LNG,msg.MAP[1].LAT),msg.MAP[2].ZOOM); //移动到新位置
		var showTypeArr = window.localStorage.getItem("showTypeArr");
		getMarker(JSON.parse(showTypeArr));
	}else if(msg.type == "showRight"){
		if(msg.content){
			$("#showInfo").fadeIn(1000);
		}else{
			$("#showInfo").fadeOut(1000);
		}
	}else if(msg.type == "showAll"){
		if(msg.content){
			initHtmlTotal();
		}else{
			$("#showInfo").fadeOut(1000);
		}
	}else if(msg.type == "people"){
		showDetail(msg.content,msg.type);
	}else if(msg.type == "device"){
		showDetail(msg.content,msg.type);
	}else if(msg.type == "car"){
		showDetail(msg.content,msg.type);
	}else if(msg.type == "clue"){
		showDetail(msg.content,msg.type);
	}else if(msg.type == "showType"){
		var showTypeArr = [];
		if(msg.showPeople){
			showTypeArr.push("people");
		}
		if(msg.showDevice){
			showTypeArr.push("device");
		}
		if(msg.showCar){
			showTypeArr.push("car");
		}
		if(msg.showClue){
			showTypeArr.push("clue");
		}
		window.localStorage.setItem("showTypeArr", JSON.stringify(showTypeArr));
		map.clearOverlays()//移除之前添加的所有覆盖物
		getMarker(showTypeArr);
	}else if(msg.type == "refresh" && (msg.content == 5 || msg.content == "all")){
		 window.location.reload();
	}
}
