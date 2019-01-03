
//------------------发送消息模块-------------------------//
var websocket = null;
var pageId = "tvnewsctrl";



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
var tvNewspageSize    = 5;

//初始化方法
function init(){
	
	//查询都是先查中文稿，根据newslevel字段为null或空字符串，条件，为固定栏目，可选状态，可选创建人
	//如果条件中有状态的，得靠查询数据库后彻程序过滤
	//如果中文稿文字状态是一审通过，则其装维为责编已审，
	//如果中文稿文字状态是二审通过，则其装维为主任已审
	//查到中文稿件后，再查找copynewsguid=此中文稿id的稿件而且selfDefineReserv1字段!=此中文稿件guid，的稿件有吗？ 如果有则状态为稿件待译
	//查到中文稿件后，再查找selfDefineReserv1字段=此中文稿件guid 的稿件有吗？如果有则状态为翻译定稿
	//查到有翻译合成稿有配音状态的，则为稿件配音
	//查到的中文稿是剪辑状态的则为稿件剪辑
	
	var htmlStatus1="";
	htmlStatus1 +='<option value="' + 0 + '">'+ '编辑'  +'</option>';   //稿件状态 0：责编已审，中文电视稿一审通过;
	htmlStatus1 +='<option value="' + 1 + '">'+ '责编已审' +'</option>';   //稿件状态 0：责编已审，中文电视稿一审通过;
	htmlStatus1 +='<option value="' + 2 + '">'+ '主任已审' +'</option>';   //1：主任已审，中文电视稿二审通过
	htmlStatus1 +='<option value="' + 3 + '">'+ '稿件待译' +'</option>';   //2: 稿件待译 ,中文电视稿有对应的藏文稿了，但是藏文稿还没有合成,
	htmlStatus1 +='<option value="' + 4 + '">'+ '翻译定稿' +'</option>';   //3: 翻译定稿，中文稿有藏文稿了、并且存在合成的藏文稿
	htmlStatus1 +='<option value="' + 5 + '">'+ '稿件配音' +'</option>';   //4: 稿件配音、合成的藏文稿配音了
	htmlStatus1 +='<option value="' + 6 + '">'+ '稿件剪辑' +'</option>';   //5: 稿件剪辑、中文稿已经视频剪辑了
	
	var htmlStatus2 = '<option value="">全部状态</option> ' + htmlStatus1;
	document.getElementById('newsstatus').innerHTML = htmlStatus2;
	
	$("#newslunbopinlv").val(tvnewsSwitchFrequncy);
	
	var htmlprojDesp="";
	htmlprojDesp = "总共添加 " + nowPrjectNum + " 篇投屏稿件";
	document.getElementById('projectdesp').innerHTML = htmlprojDesp;
	
	queryUser();
	loadnewsList();
	
	$(".select").change(function() {
		loadnewsList();
	});
}

//获取指定栏目用户
function queryUser() {
	
	var params = {};
	params.owncolumn = tvnewsquerycolumn;
	
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
        url : '/DYBigScreen/DYNewsCommandMobileInterface/tvnewsuserList.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
        success : function(data) {
        	console.info(JSON.stringify(data));
        	if (null!=data && data.status == true) {
				var html2="";
				if (data.userlist != null) {
					$.each(data.userlist, function(i, item) {
						html2 = html2 + '<option value=' + item.id + '>'+ item.name + '</option>';
					});
				}
				html = '<option value="">创建人</option> ' + html2;
				document.getElementById('newscreateMan').innerHTML = html;
			} else {
				if(null!=data && null!=data.msg && ""!=data.msg)
					alert(data.msg);
			}
        }
     });	
}


// 获取稿件列表
function loadnewsList(start) {
	
	var startNum = 1;
	var searchContent = $("#newssearchContent").val();//搜索内容
	var column        = tvnewsquerycolumn;
	var status        = $("#newsstatus  option:selected").val();
	var chargeMan     = $("#newscreateMan  option:selected").val();
	if(start){
		startNum = start;
	}
	
	// 构建JSON数据信息
	var params = {};
	params.start  = 1;         //startNum;
	params.limit  = 100;       //tvNewspageSize;
	
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
	}
	
	
	document.getElementById('tvnews').innerHTML = "";
	setPagination(1,1);
	
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/tvnewslistquery.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
		success : function(data) {
			if (null!=data && null!=data.status && data.status == true ) {
				if(data.newslist!=null){
					
					var rlength=getjsonLength(data.newslist);
					
					var totalCount  = rlength;                             //总条目数
	        		var currentPage = startNum;                            //当前页
	        		var totalPage   = Math.ceil(rlength/tvNewspageSize);   //总页数
	        		
	        		var startIndex = (startNum-1)*tvNewspageSize;
	        		var endIndex   = startNum*tvNewspageSize-1;
	        		var m=0;	        		
	        		if(rlength<startIndex)
	        			m=0;
	        		else
	        			m=startIndex;
	        		
	        		var last = 0;
	        		if(rlength<endIndex)
	        			last = rlength;
	        		else
	        			last = endIndex+1;
	        		
	        		data.shownewslist = [];
	        		for(var j=m;j<last;j++){
	        			
	        			//对于过长的title 进行截取 长度超过30的减为30
	        			if(data.newslist[j].mainHeader.length>30){
	        				data.newslist[j].mainHeader=data.newslist[j].mainHeader.substring(0,30)+"...";
	        			}
	        			
	        			var statedesp = "";
	        			if(data.newslist[j].mainStatus==0)
	        				statedesp = "编辑";
	        			else if(data.newslist[j].mainStatus==1)
	        				statedesp = "责编已审";
	        			else if(data.newslist[j].mainStatus==2)
	        				statedesp = "主任已审";
	        			else if(data.newslist[j].mainStatus==3)
	        				statedesp = "稿件待译";
	        			else if(data.newslist[j].mainStatus==4)
	        				statedesp = "翻译定稿";
	        			
	        			if(data.newslist[j].mainDubStatus==1)
	        				statedesp = "稿件配音";
	        			
	        			if(data.newslist[j].mainVideoStatus==1)
	        				statedesp = "稿件剪辑"; 
	        			
	        			data.newslist[j].statedesp=statedesp; 
	        			
	        			data.shownewslist.push(data.newslist[j]);
	        		}
	        		
	        		
	        		
	        		var html = template('tvnews-list-item', data);
					document.getElementById('tvnews').innerHTML = html;
					
					//2、设置分页					
					//var totalCount  = data.totalCount;          //总条目数
					//var currentPage = data.currentPage          //当前页
					//var totalPage   = data.totalPage;           //总页数
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
					msg.type    = "tvnewslistshow";
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
		msg.type = "canceltvnewsshow";
		msg.content = id;
		send(JSON.stringify(msg));		
		
	}else{
		//进行投屏
		if(nowPrjectNum>=maxProjectNum)
		{
			alert("投屏稿件数目已经超过最大限制("+maxProjectNum+")条,不能继续投屏");
			return;
		}		
		
		nowPrjectNum = nowPrjectNum +1;
		
		img.addClass("projective");
		img.prop("src","../../images/icon2.png");	
		
		projectlist[id] = "1";
		
		var msg = {};
		msg.type        = "seltvnewsshow";
		msg.content     = id;		
		
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
	msg.type = "allseltvnewscancel";	
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
	
	var commandType   = "31";
	
	// 构建JSON数据信息
	var params = {};
	params.handleCommand       = commandType;
	params.tvnewsSwiperFrequcy = swtichrequncy;
	
	
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/handlesystemconfigparam.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
		success : function(data) {
			if (data.state == 0) {
				var sysSwtichrequncy = data.tvnewsSwiperFrequcy;
				tvnewsSwitchFrequncy = sysSwtichrequncy;
				$("#newslunbopinlv").val(sysSwtichrequncy);				
				alert("设置参数成功！");	
				
				var msg = {};
				msg.type = "changetvnewspfrequncy";
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



