
var websocket;
var pageId = "newslastshow";
	
$(function(){
	
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
	
	//监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
	window.onbeforeunload = function(){
	    websocket.close();
	}
	
	
	//接收到消息的回调方法
	websocket.onmessage = function(event) {
		var msg=JSON.parse(event.data);
		
		if(msg.type == "selnewsshow"){        //接收到条目上屏请求
			var showid   = msg.content;
			var showtype = msg.contenttype;
			if(null==showid || ""==showid)
				return;
			if(null==showtype || ""==showtype)
				return;
			
			var existproj = projectshowlist[showid];
			if(null!=existproj)
				return;
			
			var selnewsinfo = {};
			selnewsinfo.id   = showid;
			selnewsinfo.type = showtype;
			AddShowList(selnewsinfo);
		}
		else if(msg.type == "cancelnewsshow"){        //接收到条目取消投屏请求
			var showid   = msg.content;			
			if(null==showid || ""==showid)
				return;
						
			var existproj = projectshowlist[showid];
			if(null==existproj)
				return;
			
			CaneclShowNews(showid);
		}
		else if(msg.type == "allselnewscancel"){      //接收到全部条目取消投屏请求
		
			CaneclAllShowNews();
		}
	}
	
	init();
});


//关闭连接
function closeWebSocket() {
	websocket.close();
}


var pageSize             = 5;     // 页面显示稿件数，从接口获取最新稿件列表的条目数为其*2  ,如果和选中的有重复，则不显示
var maxSelShowCount      = 20;    // 最大挑选显示条目。挑选的条目来自于控制端  暂时没用

var projectshowlist      = {};   // 被选中显示的条目列表
projectshowlist.records  = [];
var projectshowlistNum   = 0;    // 被选中显示的条目个数


var timer1               = null;     // 从后台获取数据间隔定时器
var intervalTime         = 20*1000;  // 从后台获取数据间隔时间


function init () 
{
	/*
	intervalTime = parseInt(newsSwitchFrequncy);
	if(null==intervalTime || Number.isNaN(intervalTime))
		intervalTime = 2000;
	else
		intervalTime = intervalTime *1000;
	*/
	
	initViewStyle();
	initData();
	initEvent();
}

/**
 * 初始化页面视图
 */
function initViewStyle () {

}

/**
 * 初始化数据
 */
function initData () {
	
	initNewsList(pageSize*2);
}

/**
 * 初始化事件
 */
function initEvent  () {
	
	timer1 = setInterval(function() {
		refreshSelShowList();          //重新获取选中的投屏稿件内容
		initNewsList(pageSize*2);      //获取最新稿件
	}, intervalTime);
	
	
}

/**
 * 加载公共资源列表
 */
function initNewsList (pageperSize) {
	
	//说明当前没有选中条目，需要获取最新稿件列表	
	getLastestNewsList(pageperSize);	
}


function getLastestNewsList (pageperSize){
	
	// 构建JSON数据信息
	var data = {};
	data.start        = 1;
	data.limit        = pageperSize;
	data.xuantistate  = -1;
	data.userId       = defaultUserId;
	data.pstartTime   = "4";	
	
	if(projectshowlistNum>=pageSize)		 //全部显示投频条目了，不用获取最新稿件
	{
		return;                  
	}	
	
	dp.util.ajaxRequest({
				type : 'POST',
				url : '/DYBigScreen/DYNewsCommandMobileInterface/newsProgressList.do',
				data : JSON.stringify(data),
				dataType : 'json',
				contentType : "application/json;charset=UTF-8",
				success : function(data) {
					if (null!=data && null!=data.status && data.status == true ) {
						if(data.data!=null && typeof (data.data) != "undefined" && data.data.list!=null && data.data.list.length > 0){
							
							var lastnewslist         = {};   // 从后台获取的最新稿件列表
							lastnewslist.list        = [];					
							for (var i = 0; i < data.data.list.length; i++) {
								
								var getnewsid = data.data.list[i].mainGuid;
								var hadshow = false;
								for(var j=0;j<projectshowlistNum;j++){
									var projectid = projectshowlist.records[j].mainGuid;
									if(getnewsid == projectid){
										hadshow = true;
										break;
									}									
								}
								if(hadshow)
									continue;
								
								if(data.data.list[i].mainHeader.length>30){
			        				data.data.list[i].mainHeader=data.data.list[i].mainHeader.substring(0,30)+"...";
			        			}
								
								var type = data.data.list[i].mainType;  //稿件类型 0：CMS稿件;1：微信稿件;2：微博稿件;3：电视稿件;4：通稿稿件;
								if (type == 0) {
									data.data.list[i].manuscripttype = "CMS";
								} else if (type == 1) {
									data.data.list[i].manuscripttype = "微信";
								} else if (type == 2) {
									data.data.list[i].manuscripttype = "微博";
								} else if (type == 3) {
									data.data.list[i].manuscripttype = "电视";
								} else if (type == 4) {
									data.data.list[i].manuscripttype = "通稿";
								}
								
								lastnewslist.list.push(data.data.list[i]);
							}
							
							var newsListHtml = template('manuscript_script', lastnewslist);
							if(null!=newsListHtml && ""!=newsListHtml)
							{
								$('#news_contlast').html("");   //先清空原来的显示
								$('#news_contlast').html(newsListHtml);	
							}
														
						}
					}
					else {
						if(null!=data && null!=data.msg && ""!=data.msg)
							alert(data.msg);
						else
							alert("获取稿件列表失败!");
					}
					
				}
			});
}

//说明有选中的条目，只需要重新获取选中条目的内容
function refreshSelShowList (){
	
	var showCount = projectshowlist.records.length;
	var showTotalConten = "";
	for(var i=0;i<showCount;i++)
	{
		var params = {};
		params.searchContent  = projectshowlist.records[i].mainGuid;
		params.owncolumn      = ""+projectshowlist.records[i].mainType;
		
		dp.util.ajaxRequest({
			type : 'POST',
			url : '/DYBigScreen/DYNewsCommandMobileInterface/newsDetailInfo.do',
			data : JSON.stringify(params),
			dataType : 'json',
			contentType : "application/json;charset=UTF-8",
			success : function(data) {
				if (null!=data && null!=data.status && data.status == true ) {
					if(data.data!=null && typeof (data.data) != "undefined" ){							
							
						if(data.data.mainHeader.length>30){
	        				data.data.mainHeader=data.data.mainHeader.substring(0,30)+"...";
	        			}
						
						var type = data.data.mainType;  //稿件类型 0：CMS稿件;1：微信稿件;2：微博稿件;3：电视稿件;4：通稿稿件;
						if (type == 0) {
							data.data.manuscripttype = "CMS";
						} else if (type == 1) {
							data.data.manuscripttype = "微信";
						} else if (type == 2) {
							data.data.manuscripttype = "微博";
						} else if (type == 3) {
							data.data.manuscripttype = "电视";
						} else if (type == 4) {
							data.data.manuscripttype = "通稿";
						}										
						var newsListHtml = template('manuscript_deatail_script', data.data);
						showTotalConten += newsListHtml;
					}
				}			
			}
		});
	}
	
	$('#news_contselect').html(showTotalConten);	
}


function AddShowList(newsinfo){
	
	var params = {};
	params.searchContent  = newsinfo.id;
	params.owncolumn      = newsinfo.type;
	
	dp.util.ajaxRequest({
		type : 'POST',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/newsDetailInfo.do',
		data : JSON.stringify(params),
		dataType : 'json',
		contentType : "application/json;charset=UTF-8",
		success : function(data) {
			if (null!=data && null!=data.status && data.status == true ) {
				if(data.data!=null && typeof (data.data) != "undefined" ){							
						
					if(data.data.mainHeader.length>30){
        				data.data.mainHeader=data.data.mainHeader.substring(0,30)+"...";
        			}
					
					var type = data.data.mainType;  //稿件类型 0：CMS稿件;1：微信稿件;2：微博稿件;3：电视稿件;4：通稿稿件;
					if (type == 0) {
						data.data.manuscripttype = "CMS";
					} else if (type == 1) {
						data.data.manuscripttype = "微信";
					} else if (type == 2) {
						data.data.manuscripttype = "微博";
					} else if (type == 3) {
						data.data.manuscripttype = "电视";
					} else if (type == 4) {
						data.data.manuscripttype = "通稿";
					}
					
					var newsListHtml = template('manuscript_deatail_script', data.data);
					
					if(projectshowlistNum < 5)
					{
						projectshowlistNum	= projectshowlistNum +1;     //增加挑选显示记录
						projectshowlist[newsinfo.id] = newsinfo.type;
						projectshowlist.records.push(data.data);
						
						$('#news_contselect').append(newsListHtml);
					}
					else
					{
						var cancelID = projectshowlist.records[0].mainGuid;    //超过5个投屏了，将第一个投频的去除
						projectshowlist.records.splice(0,1);
						delete projectshowlist[cancelID];						
						
						
						var projectcontent = $("#news_contselect");
						var firstNews   = projectcontent.find('div:first');
						if(null!=firstNews && firstNews.length>0){
							var firstnewsid   = firstNews[0].id;
							$("#" +firstnewsid).remove();
						}
							
						projectshowlist[newsinfo.id] = newsinfo.type;
						projectshowlist.records.push(data.data);
						
						$('#news_contselect').append(newsListHtml);
					}					
					
					initNewsList(pageSize*2);
				}
			}
			else {
				if(null!=data && null!=data.msg && ""!=data.msg)
					alert(data.msg);
				else
					alert("获取稿件详情失败!");
			}
			
		}
	});
	
}


function CaneclShowNews(cancelID){	
	//删除投射记录
	var showCount = projectshowlist.records.length;	
	for(var i=0;i<showCount;i++)
	{
		var hadid  = projectshowlist.records[i].mainGuid;
		if(hadid == cancelID){
			projectshowlist.records.splice(i,1);
			break;
		}		
	}
	delete projectshowlist[cancelID];
	
	if(projectshowlistNum>0)
		projectshowlistNum = projectshowlistNum-1;
	
	if(projectshowlistNum<=0)
	{//表示要依靠接口获取最新稿件列表了
		
		initNewsList(pageSize*2);				
	}
	else
	{//表示仍有投射条目
		
		//从页面中删除放弃投射的条目
		var cancelShowObj = $("#" +cancelID);
		if(null!=cancelShowObj){
			cancelShowObj.remove();
		}
		
		initNewsList(pageSize*2);		
	}	
}

function CaneclAllShowNews(){
	
	//删除投射记录
	var showCount = projectshowlist.records.length;	
	for(var i=0;i<showCount;i++)
	{
		var hadid  = projectshowlist.records[i].mainGuid;
		delete projectshowlist[hadid];
		
		var cancelShowObj = $("#" +hadid);
		if(null!=cancelShowObj){
			cancelShowObj.remove();
		}
	}
	projectshowlist.records.splice(0,showCount);	
	
	projectshowlist      = {};   // 被选中显示的条目列表
	projectshowlist.records  = [];
	projectshowlistNum   = 0;
	
	initNewsList(pageSize*2);
}




