
//------------------发送消息模块-------------------------//
var websocket = null;
var pageId = "newsprogress";



////////////////////////////////////////////////////////////////////////////////////

$(function(){
	
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
	
	
	init();
});

//关闭连接
function closeWebSocket(){
    websocket.close();
}

//发送消息
function send(message){
    websocket.send(message);
}

var selectListMsg = "";    //储存查询需要发送的消息字符串
var firstTaskGuid = "";

var maxProjectNum = 20;
var nowPrjectNum  = 0;
var projectlist = {};

//初始化方法
function init(){
	
	/////////////////////////////////////zhy add
	var htmlStatus1="";
	htmlStatus1 +='<option value="' + 0 + '">'+ '待提交' +'</option>';  //稿件状态 0：待提交;1：待审核;2：通过;3：打回; 
	htmlStatus1 +='<option value="' + 1 + '">'+ '待审核' +'</option>';
	htmlStatus1 +='<option value="' + 2 + '">'+ '通过' +'</option>';
	htmlStatus1 +='<option value="' + 3 + '">'+ '打回' +'</option>';
	
	var htmlStatus2 = '<option value="">全部状态</option> ' + htmlStatus1;
	document.getElementById('newsstatus').innerHTML = htmlStatus2;
	
	$("#newslunbopinlv").val(newsSwitchFrequncy);
	
	var htmlprojDesp="";
	htmlprojDesp = "总共添加 " + nowPrjectNum + " 篇投屏稿件";
	document.getElementById('projectdesp').innerHTML = htmlprojDesp;
	/////////////////////////////////////////////////////////
	
	queryColumn();
	queryUser();
	loadnewsList();
	
	$(".select").change(function() {
		loadnewsList();
	});
}
//返回选题进展，无效先预留着
function backSelectProcess(){
	//isProjective = false;
	//projectiveTaskId="";
	$(".projective").removeClass().prop("src","../../images/icon1.png");
	send(selectListMsg);
}

// 获取稿件列表
function loadnewsList(start) {
	
	var startNum = 1;
	var searchContent = $("#newssearchContent").val();//搜索内容
	var column        = $("#newscolumn  option:selected").val();
	var status        = $("#newsstatus  option:selected").val();
	var chargeMan     = $("#newscreateMan  option:selected").val();
	if(start){
		startNum = start;
	}
	
	// 构建JSON数据信息
	var params = {};
	params.start  = startNum;
	params.limit  = 5;
	
	if(searchContent!=null && searchContent!=""){
		params.searchContent = searchContent;
	}
	if(status!=null && status!=""){
		params.xuantistate = status;
	}
	else
		params.xuantistate = -1;
	
	if(column!=null && column!=""){
		params.owncolumn = column;
	}
	
	if(chargeMan!=null && chargeMan!=""){
		params.userId       = chargeMan;
		params.pstartTime   = "1";
	}
	else{
		params.userId = defaultUserId;
		params.pstartTime = "4";
	}
	
	document.getElementById('news').innerHTML = "";
	setPagination(1,1);
	
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/newsProgressList.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
		success : function(data) {
			if (null!=data && null!=data.status && data.status == true ) {
				if(data.data!=null){
					
					var rlength=getjsonLength(data.data.list);
	        		for(var m=0;m<rlength;m++){	        			
	        			//对于过长的title 进行截取 长度超过30的减为30
	        			if(data.data.list[m].mainHeader.length>30){
	        				data.data.list[m].mainHeader=data.data.list[m].mainHeader.substring(0,30)+"...";
	        			}
	        		}
	        		
	        		var html = template('news-list-item', data.data);
					document.getElementById('news').innerHTML = html;
					
					//2、设置分页
					var totalCount  = data.data.totalCount;          //总条目数
					var currentPage = data.data.currentPage          //当前页
					var totalPage   = data.data.totalPage;           //总页数
					setPagination(totalPage,currentPage);
					
					var hadlistNews = $("img");
					if(null!=hadlistNews && hadlistNews.length>0)
					{
						for(var i=0;i<hadlistNews.length;i++){
							var newsid = hadlistNews[i].id;
							var params = newsid.split("_");
							if(null!=params && null!=params[1]){
								var imgid = params[1];
								var projval = projectlist[imgid];
								if(null!=projval){
									var img = $("#"+newsid);	
									img.addClass("projective");
									img.prop("src","../../images/icon2.png");
								}
							}
						}
						
					}
						
					
					////3、向客户端发送数据(定时器是为了解决初始化方法还未执行完，无法加载websocket的问题)
					var msg = {};
					msg.type    = "newslistshow";
					msg.content = data.data;				
									
					setTimeout(function(){						
						send(JSON.stringify(msg));
					},500);
				}
				
			} else {
				if(null!=data && null!=data.msg && ""!=data.msg)
					alert(data.msg);
				else
					alert("获取稿件列表失败!");
			}
		}
	})
}


function getjsonLength(json){
    var jsonLength=0;
    for (var i in json) {
        jsonLength++;
    }
    return jsonLength;
}

//设置分页
function setPagination(totalPage,currentPage) {
	var html = 		
		'<li class="prev"><a href="#" onclick="toPage(\''+totalPage+'\',\''+currentPage+'\',\'prev\');" title="Prev"><i class="fa fa-angle-left"></i>上一页</a></li>'+
		'<li><a href="#">'+currentPage+'/'+totalPage+'</a></li>'+
		'<li class="next"><a href="#" onclick="toPage(\''+totalPage+'\',\''+currentPage+'\',\'next\');" title="Next">下一页<i class="fa fa-angle-right"></i></a></li>';
	document.getElementById('newspagination').innerHTML = html;
}

//上一页，下一页
function toPage(totalPage,currentPage,type) {
	if(type == "next"){
		if(currentPage != totalPage){
			loadnewsList(Number(currentPage) + 1);
			
		}else{
			alert("已经是最后一页");
		}
	}else{
		if(currentPage != 1){
			loadnewsList(Number(currentPage)-1);
		}else{
			alert("已经是第一页");
		}
	}
}

// 获取全部栏目
function queryColumn() {
	
	var params = {};
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/columnList.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
        success : function(data) {
        	console.info(JSON.stringify(data));
        	if (data.status == true) {				
				var html2;
				if (data.data != null) {
					$.each(data.data, function(i, item) {
						html2 = html2 + '<option value=' + item.id + '>'+ item.name + '</option>';
					});
				}
				html = '<option value="">栏目</option>' + html2;
				document.getElementById('newscolumn').innerHTML = html;
			} else {
				alert(data.commonResponse.errorDesc);
			}
        }
     });	
}

function queryUser() {
	
	var params = {};
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
        url : '/DYBigScreen/DYNewsCommandMobileInterface/userList.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
        success : function(data) {
        	console.info(JSON.stringify(data));
        	if (data.status == true) {
				// console.info(JSON.stringify(data));
				var html2;
				if (data.data != null) {
					$.each(data.data, function(i, item) {
						html2 = html2 + '<option value=' + item.id + '>'+ item.name + '</option>';
					});
				}
				html = '<option value="">创建人</option> ' + html2;
				document.getElementById('newscreateMan').innerHTML = html;
			} else {
				alert(data.msg);
			}
        }
     });	
}


//投屏到选题详情页面
function toNewsProgressSelShow(id,target){
	
	//判断是否是投屏状态
	var img = $(target).find("img");	
	if(img.is(".projective")){
		//取消投屏
		if(nowPrjectNum>0)
			nowPrjectNum = nowPrjectNum -1;
		
		img.removeClass();
		img.prop("src","../../images/icon1.png");
		
		delete projectlist[id];	
		
		var msg = {};
		msg.type = "cancelnewsshow";
		msg.content = id;
		send(JSON.stringify(msg));		
		
	}else{
		//进行投屏
		if(nowPrjectNum>=maxProjectNum)
		{
			alert("投屏稿件数目已经超过最大限制("+maxProjectNum+")条,不能继续投屏");
			return;
		}
		var selNewsTypeObj = $("#type_" +id);		
		if(null==selNewsTypeObj)
		{
			alert("选择的投频稿件缺失稿件类型，不能投屏");
			return;
		}
		var selNewsType = selNewsTypeObj.attr("type");
		if(null==selNewsType || ""==selNewsType)
		{
			alert("选择的投频稿件无稿件类型属性，不能投屏");
			return;
		}
		
		nowPrjectNum = nowPrjectNum +1;
		
		img.addClass("projective");
		img.prop("src","../../images/icon2.png");	
		
		projectlist[id] = "1";
		
		var msg = {};
		msg.type        = "selnewsshow";
		msg.content     = id;
		msg.contenttype = selNewsType;
		
		send(JSON.stringify(msg));
	}
	
	var htmlprojDesp="";
	htmlprojDesp = "总共添加 " + nowPrjectNum + " 篇投屏稿件";
	document.getElementById('projectdesp').innerHTML = htmlprojDesp;

}

function newsclearproject(){
	$("img[class='projective']").removeClass().prop("src","../../images/icon1.png");
	nowPrjectNum = 0;	
	
	var htmlprojDesp="";
	htmlprojDesp = "总共添加 " + nowPrjectNum + " 篇投屏稿件";
	document.getElementById('projectdesp').innerHTML = htmlprojDesp;
	
	projectlist = {};
	
	var msg = {};
	msg.type = "allselnewscancel";	
	send(JSON.stringify(msg));
}


function newsSwitchfrequncychange(){
	
	var swtichrequncy = $("#newslunbopinlv").val();
	if(null==swtichrequncy || ""==swtichrequncy)
		return;
	var correctVal = parseInt(swtichrequncy);
	if(null==correctVal || Number.isNaN(correctVal))
	{
		alert("设置参数填写有误!");
		return;
	}
	
	var commandType   = "21";
	
	// 构建JSON数据信息
	var params = {};
	params.handleCommand     = commandType;
	params.newsSwiperFrequcy = swtichrequncy;
	
	
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/handlesystemconfigparam.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
		success : function(data) {
			if (data.state == 0) {
				var sysSwtichrequncy = data.newsSwiperFrequcy;
				newsSwitchFrequncy = sysSwtichrequncy;
				$("#newslunbopinlv").val(sysSwtichrequncy);				
				alert("设置参数成功！");	
				
				var msg = {};
				msg.type = "changenewspfrequncy";
				msg.content = sysSwtichrequncy;
				send(JSON.stringify(msg));
				
			} else {
				alert("设置参数失败！");
				var orgSysSwtichrequncy = data.newsSwiperFrequcy;				
				$("#newslunbopinlv").val(orgSysSwtichrequncy);
			}
		}
	});
}



