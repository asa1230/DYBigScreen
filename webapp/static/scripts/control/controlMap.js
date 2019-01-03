$(function(){
	init();
});

function init(){
//	getJsonFile();
	//停止拖拽地图时触发。
	map.addEventListener("dragend", function(){
		getMarker(getShowType());
		var mtype = map.getMapType();
		var center = map.getCenter();
		var msg = '{"type":"mapMove","MAP":[{"LNG":"'+center.lng+'"},{"LAT":"'+center.lat+'"},{"ZOOM":"'+this.getZoom()+'"},{"TYPE":"'+mtype.af+'"}]}';
		send(msg);
		});
	//地图更改缩放级别结束时触发触发此事件。
	map.addEventListener("zoomend", function(){
		getMarker(getShowType());
		var mtype = map.getMapType();
		var center = map.getCenter();
		var msg = '{"type":"mapMove","MAP":[{"LNG":"'+center.lng+'"},{"LAT":"'+center.lat+'"},{"ZOOM":"'+this.getZoom()+'"},{"TYPE":"'+mtype.af+'"}]}';
		send(msg);
		});
	//地图单击触发触发此事件。
//	map.addEventListener("click", function(){
//		var msg = {};
//		msg.type = "showTotal";
//		send(JSON.stringify(msg));
//		});
}

function getJsonFile(){
	var jsonFile= "../../json/map.json";
	$.getJSON(jsonFile, function(data){ 
		markerArr = data.maps;
		getMarker(markerArr,["people","device","car","clue"]);
	}); 
}

function showRight(){
	var showRightFlag = $("#showRight").is(':checked')?true:false;
	var msg = {};
	msg.type = "showRight";
	msg.content = showRightFlag;
	send(JSON.stringify(msg));
}

function showAll(){
	var showAllFlag = $("#showAll").is(':checked')?true:false;
	var msg = {};
	msg.type = "showAll";
	msg.content = showAllFlag;
	send(JSON.stringify(msg));
}


function getShowType(){
	var showTypeArr = [];
	var showPeopleFlag = $("#showPeople").is(':checked')?true:false;
	var showDeviceFlag = $("#showDevice").is(':checked')?true:false;
	var showCarFlag = $("#showCar").is(':checked')?true:false;
	var showClueFlag = $("#showClue").is(':checked')?true:false;
	
	
	var showTypeArr = [];
	if(showPeopleFlag){
		showTypeArr.push("people");
	}
	if(showDeviceFlag){
		showTypeArr.push("device");
	}
	if(showCarFlag){
		showTypeArr.push("car");
	}
	if(showClueFlag){
		showTypeArr.push("clue");
	}
	return showTypeArr;
}

function showType(){
	var msg = {};
	msg.content = [];
	
	var showPeopleFlag = $("#showPeople").is(':checked')?true:false;
	var showDeviceFlag = $("#showDevice").is(':checked')?true:false;
	var showCarFlag = $("#showCar").is(':checked')?true:false;
	var showClueFlag = $("#showClue").is(':checked')?true:false;
	
	msg.type = "showType";
	msg.showPeople = showPeopleFlag;
	msg.showDevice = showDeviceFlag;
	msg.showCar = showCarFlag;
	msg.showClue = showClueFlag;
	send(JSON.stringify(msg));
	
	var showTypeArr = [];
	if(showPeopleFlag){
		showTypeArr.push("people");
	}
	if(showDeviceFlag){
		showTypeArr.push("device");
	}
	if(showCarFlag){
		showTypeArr.push("car");
	}
	if(showClueFlag){
		showTypeArr.push("clue");
	}
	
	map.clearOverlays()//移除之前添加的所有覆盖物
	getMarker(showTypeArr);
}


// 百度地图API功能
//第1步：创建Map实例
var map = new BMap.Map("allmap"); 
//第2步：设置地图中心点，北京市
var point = new BMap.Point(116.404, 39.915);
//第3步：初始化地图,设置中心点坐标和地图级别。
map.centerAndZoom(point, 13);
//第3步：启用滚轮放大缩小
map.enableScrollWheelZoom(true);
//第4步：绘制点  
//初始化是默认显示全部类型标注
getMarker();

function getMarker(showType){
	var jsonFile= "../../json/map.json";
	var markerArr;
	if(showType == undefined || showType == "" || showType == null){
		console.info(111);
		showType = ["people","device","car","clue"];
	}
	console.info(showType);
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
		    addInfoWindow(maker, markerArr[i]); 
		}
	}
}


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

// 添加信息窗口
function addInfoWindow(marker, poi) {
	var content;
	if(poi.type == "people"){
		content = poi.title;
	}else if(poi.type == "device"){
		content = poi.title+" "+poi.num;
	}else if(poi.type == "car"){
		content = poi.title+" "+poi.num;
	}else if(poi.type == "clue"){
		content = poi.title;
	}
	var label = new window.BMap.Label(content, { offset: new window.BMap.Size(-30, -15) });  
	label.setStyle({ 
		color : "#000000", 
		fontSize : "16px", 
		fontFamily: "方正兰亭黑简体",
		border :"0", 
		backgroundColor :"0.05",
		fontWeight :"bold" 
		});
	marker.setLabel(label);
	
	var openInfoWinFun = function () {
		var msg = {};
		msg.type = poi.type;
		msg.content = poi.id;
		send(JSON.stringify(msg));
    };
    
    marker.addEventListener("click", openInfoWinFun);
}

/*
function addInfoWindow2(marker, poi) {
    //pop弹窗标题
    var title = '<div id="'+poi.id+'" style="font-weight:bold;color:#CE5521;font-size:14px">' + poi.title + '</div>';
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
    var html2 = "<div>1</div>"
    var infoWindow = new BMap.InfoWindow(html.join(""), { title: title, width: 200 });
    var openInfoWinFun = function () {
        marker.openInfoWindow(infoWindow);
        	var p0 = poi.point.split(",")[0];
        	var p1 = poi.point.split(",")[1];
        console.info(p0);	
        console.info(p1);	
    };
    marker.addEventListener("click", openInfoWinFun);
    return openInfoWinFun;
}*/




//---------------------------消息发送---------------------------//
var websocket = null;
var pageId = "map";
//判断当前浏览器是否支持WebSocket
if('WebSocket' in window){
    websocket = new WebSocket("ws://"+baseUrl+"/DYBigScreen/websocket/"+pageId);
}
else{
    alert('Not support websocket')
}
//连接发生错误的回调方法
websocket.onerror = function(){
    alert("error");
};
 
//连接成功建立的回调方法
websocket.onopen = function(event){
    console.info("open");
}
//连接关闭的回调方法
websocket.onclose = function(){
    console.info("close");
}
//监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function(){
    websocket.close();
}
//关闭连接
function closeWebSocket(){
    websocket.close();
}

//发送消息
function send(message){
    websocket.send(message);
}
