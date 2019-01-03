$(function(){
	init();
});

var timer1;
var timer2;

function init(){
	//1、加载选题列表
	loadSelectApiList();
	//2、启动定时器翻页
	timer1 = setInterval(function(){
		changePage();
	},20000);
	//3、启动定时器刷新
	timer2 = setInterval(function(){
		window.location.reload();
	},10800000);
}

//翻页（翻牌效果）
function changePage(){
	 var count = jQuery(".jqflip-parent").length; 
	 //不满4条一屏幕就不翻页
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
var showData={};
showData.records=[];

//获取选题列表
function loadSelectApiList() {
	var url = window.localStorage.getItem("zhihuidiaoduURL");
	// 构建JSON数据信息
	var paramss = {
			"start":0,
			"limit":200,
			"resourceMediaType":0,	//0（资讯）、1（论坛）、4（微博）、11（微信）
			"siteNames":['历史上的今天']
				};
	$.ajax({
		    type : 'POST',
	        async : false,
	        dataType : 'json',
	        url  : 	'/DYBigScreen/clueCloudInterface/getClueList.do',
	        data: JSON.stringify(paramss),
	        contentType : "application/json;charset=UTF-8",
	        success : function(data) {
            	if (data.commonResponse.success == true) {
            		
            		var rlength=getjsonLength(data.records);
            		console.info(rlength);
            		for(var m=0;m<rlength;m++){
            			if(data.records[m].navigation!=null && data.records[m].navigation!=""){
            				if(isContains(data.records[m].navigation,getNowDate())){
            					//对于过长的title 进行截取 长度超过20的减为20
                    			if(data.records[m].title.length>25){
                    				data.records[m].title=data.records[m].title.substring(0,25)+"...";
                    			}
                    				data.records[m].createdTime=data.records[m].createdTime.substring(0,10);
                    				//利用正则表达式 抽取出allcontent中的 xxxx年xx月xx日部分
                    				var reg =/\d+\u5e74/;
                    				//var reg =/\d+\u5e74\d+\u6708\d+\u65e5/;
                    				var TargetTime=reg.exec(data.records[m].navigation);
                    				if(TargetTime!=null){
                    					data.records[m].happenTime=TargetTime[0]+getNowDate();
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
            				}
            			}
            		}
            		showData.records.sort(up);
            		//因2月12日前后 杭州台领导视察 因此2月10-2月14展示内容为自定义 内容
    				 if(getNowDate()=="2月10日"){
    					splitPage(showDataDiy10);  //如果在2月10日不打算使用自定义数据，那么将 本行中showDataDiy10 更换为showData 
    				}
    				else if(getNowDate()=="2月11日"){
    					splitPage(showDataDiy11);  //如果在2月11日不打算使用自定义数据，那么将 本行中showDataDiy11 更换为showData 
    				}
    				else if(getNowDate()=="2月12日"){
    					splitPage(showDataDiy12);  //如果在2月12日不打算使用自定义数据，那么将 本行中showDataDiy12 更换为showData 
    				}
    				else if(getNowDate()=="2月13日"){
    					splitPage(showDataDiy13);  //如果在2月13日不打算使用自定义数据，那么将 本行中showDataDiy13 更换为showData 
    				}
    				else if(getNowDate()=="2月14日"){
    					splitPage(showDataDiy14);  //如果在2月14日不打算使用自定义数据，那么将 本行中showDataDiy14 更换为showData 
    				}
    				else{
    					splitPage(showData);
    				}
    			} else {
    				console.info(data.commonResponse.errorDesc);
    			}
	        }
	        });
}

var showDataDiy10={};
showDataDiy10.records=[];
var data101= {	"title":"美国商用通信卫星与俄罗斯军用通信卫星相撞"	,	"happenTime":"2009年2月10日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/10/16555.html"};	showDataDiy10.records.push(data101);
var data102= {	"title":"温家宝中南海接见十一世班禅"	,	"happenTime":"2012年2月10日" ,"resourceOriginAddress":"#"	};	showDataDiy10.records.push(data102);
var data103= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy10.records.push(data103);
var data104= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy10.records.push(data104);
var data105= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy10.records.push(data105);
var data106= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy10.records.push(data106);
var data107= {	"title":"伟大的诗人普希金去世一百八十周年纪念日"	,	"happenTime":"2017年2月10日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/10/19493.html"};	showDataDiy10.records.push(data107);
var data108= {	"title":"中国第一份人权专业杂志创刊"	,	"happenTime":"2002年2月10日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/10/china-DiYiFenRenQuanZhuanYe-magazine-ChuangKan.html"};	showDataDiy10.records.push(data108);
var data109= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy10.records.push(data109);
var data1010={	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy10.records.push(data1010);
var data1011={	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy10.records.push(data1011);
var data1012={	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy10.records.push(data1012);

var showDataDiy11={};
showDataDiy11.records=[];
var data111= {	"title":"荷兰足球名将凯泽尔去世"	,	"happenTime":"2017年2月11日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/11/19509.html"};	showDataDiy11.records.push(data111);
var data112= {	"title":"商务印书馆诞生120周年"	,	"happenTime":"2017年2月11日" ,"resourceOriginAddress":"http://www.todayonhistory.com/2/11/19554.html"	};	showDataDiy11.records.push(data112);
var data113= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy11.records.push(data113);
var data114= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy11.records.push(data114);
var data115= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy11.records.push(data115);
var data116= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy11.records.push(data116);
var data117= {	"title":"天主教皇本笃十六世宣布辞去教皇一职"	,	"happenTime":"2013年2月11日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/11/16747.html"};	showDataDiy11.records.push(data117);
var data118= {	"title":"相声泰斗马三立逝世"	,	"happenTime":"2003年2月11日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/11/XiangShengTaiDouMaSanLiShiShi.html"};	showDataDiy11.records.push(data118);
var data119= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy11.records.push(data119);
var data1110={	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy11.records.push(data1110);
var data1111={	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy11.records.push(data1111);
var data1112={	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy11.records.push(data1112);

var showDataDiy12={};
showDataDiy12.records=[];
var data121= {	"title":"弗兰克·瓦尔特·施泰因迈尔当选第12任德国总统"	,	"happenTime":"2017年2月12日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/12/19514.html"};	showDataDiy12.records.push(data121);
var data122= {	"title":"法院正式宣告三鹿集团破产"	,	"happenTime":"2009年2月12日" ,"resourceOriginAddress":"http://www.todayonhistory.com/2/12/16950.html"	};	showDataDiy12.records.push(data122);
var data123= {	"title":"浙江将国家赔偿纳入财政预算 明晰对责任人的追偿比例"	,	"happenTime":"2017年2月12日"	,"resourceOriginAddress":"http://www.xinhuanet.com/fortune/2017-02/12/c_1120452413.htm"};	showDataDiy12.records.push(data123);
var data124= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy12.records.push(data124);
var data125= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy12.records.push(data125);
var data126= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy12.records.push(data126);
var data127= {	"title":"朝鲜进行第三次核试验"	,	"happenTime":"2013年2月12日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/12/16948.html"};	showDataDiy12.records.push(data127);
var data128= {	"title":"中国首家搬家公司北京利康开始营业"	,	"happenTime":"1988年2月12日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/12/china-ShouJiaBanJiaGongSi-BeiJingLiKangBanJiaGongSiKaiShiYingYe.html"};	showDataDiy12.records.push(data128);
var data129= {	"title":"浙江城镇住房保障覆盖率提前完成“十三五”目标"	,	"happenTime":"2016年2月12日"	,"resourceOriginAddress":"http://finance.huanqiu.com/roll/2016-02/8528551.html"};	showDataDiy12.records.push(data129);
var data1210={	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy12.records.push(data1210);
var data1211={	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy12.records.push(data1211);
var data1212={	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy12.records.push(data1212);

var showDataDiy13={};
showDataDiy13.records=[];
var data131= {	"title":"朝鲜领导人金正恩长兄 金正男在马来西亚遇害"	,	"happenTime":"2017年2月13日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/13/19582.html"};	showDataDiy13.records.push(data131);
var data132= {	"title":"马英九辞去中国国民党党主席一职"	,	"happenTime":"2017年2月13日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/13/17199.html"};	showDataDiy13.records.push(data132);
var data133= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy13.records.push(data133);
var data134= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy13.records.push(data134);
var data135= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy13.records.push(data135);
var data136= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy13.records.push(data136);
var data137= {	"title":"联合国教科文组织公布第一批入选世界地质公园名单"	,	"happenTime":"2004年2月13日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/13/LianHeGuoJiaoKeWenZuZhiGongBu-china-DiYiPiRuXuanShiJieDiZhiGongYuanMingDan.html"};	showDataDiy13.records.push(data137);
var data138= {	"title":"中国首次派团参加冬季奥运会"	,	"happenTime":"1980年2月13日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/13/china-ShouCiPaiTuanCanJiaDongJiAoYunHui.html"};	showDataDiy13.records.push(data138);
var data139= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy13.records.push(data139);
var data1310= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy13.records.push(data1310);
var data1311= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy13.records.push(data1311);
var data1312= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy13.records.push(data1312);

var showDataDiy14={};
showDataDiy14.records=[];
var data141= {	"title":"克隆羊多莉接受安乐死"	,	"happenTime":"2003年2月14日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/14/KeLongYangDuoLiJieShouAnYueSi.html"};	showDataDiy14.records.push(data141);
var data142= {	"title":"中国男子足球队在东亚四强锦标赛上夺冠"	,	"happenTime":"2010年2月14日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/14/17604.html"};	showDataDiy14.records.push(data142);
var data143= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy14.records.push(data143);
var data144= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy14.records.push(data144);
var data145= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy14.records.push(data145);
var data146= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy14.records.push(data146);
var data147= {	"title":"联合国宣布1991年世界经济出现战后首次负增长"	,	"happenTime":"1992年2月14日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/14/LianHeGuoXuanBu-1991-NianShiJieJingJiChuXianZhanHouShouCiFuZengChang.html"};	showDataDiy14.records.push(data147);
var data148= {	"title":"国务院批准成立国家自然科学基金委员会"	,	"happenTime":"1986年2月14日"	,"resourceOriginAddress":"http://www.todayonhistory.com/2/14/17619.html"};	showDataDiy14.records.push(data148);
var data149= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy14.records.push(data149);
var data1410= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy14.records.push(data1410);
var data1411= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy14.records.push(data1411);
var data1412= {	"title":"123"	,	"happenTime":"xxxx年x月xx日"	,"resourceOriginAddress":""};	showDataDiy14.records.push(data1412);

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