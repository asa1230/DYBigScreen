
var websocket;
var pageId = "newsprogressshow";
	
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
		if(msg.type == "changenewspfrequncy")       //接收滚动频率刷新  
		{
			var intervalTime = parseInt(msg.content);
			if(null==intervalTime || Number.isNaN(intervalTime))
				intervalTime = 2000;
			else
				intervalTime = intervalTime *1000;
			
			//修改滚动动画效果间隔定时器
			if(null!=timer1){
				clearInterval(timer1);
				timer1 = null;
				
				if(projectshowlistNum<=0 || projectshowlistNum>=6){
					timer1 = setInterval(function() {
					   doscroll();
					}, intervalTime);
				}
			}
			
			//修改从后台获取数据间隔定时器
			if(null!=timer2){
				clearInterval(timer2);
				timer2=null;
				
				initNewsList(pageSize * 4);				
				
				timer2 = setInterval(function() {
					initNewsList(pageSize * 4);
				}, intervalTime * pageSize * 3);
			}
			else
			{
				if(projectshowlistNum<=0){
					initNewsList(pageSize * 4);	
					
					timer2 = setInterval(function() {
						initNewsList(pageSize * 4);
					}, intervalTime * pageSize * 3);
				}
			}
			
			//修改小于5条投射的定时器
			if(null!=timer3){
				clearInterval(timer3);
				timer3 = null;
				
				if(projectshowlistNum>0 && projectshowlistNum<6){
					timer3 = setInterval(function() {
						refreshSelShowList();
					}, intervalTime);
				}
			}
			
		}
		else if(msg.type == "selnewsshow"){        //接收到条目上屏请求
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

var intervalTime         =  2000; //滚动事件间隔 2S

var maxgetlistNum        = 40;   // 从接口获取最新稿件列表的条目数  暂时没用
var pageSize             = 5;    // 每页显示条目
var maxSelShowCount      = 20;   // 最大挑选显示条目。挑选的条目来自于控制端  暂时没用

var projectshowlist      = {};   // 被选中显示的条目列表
projectshowlist.records  = [];
var projectshowlistNum   = 0;    // 被选中显示的条目个数

var timer1 = null;                      // 滚动动画效果间隔定时器
var timer2 = null;                      // 从后台获取数据间隔定时器
var timer3 = null;                      // 对小于6条的选中显示条目进行刷新

function init () 
{
	intervalTime = parseInt(newsSwitchFrequncy);
	if(null==intervalTime || Number.isNaN(intervalTime))
		intervalTime = 2000;
	else
		intervalTime = intervalTime *1000;
	
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
	
	initNewsList(pageSize * 4);
}

/**
 * 初始化事件
 */
function initEvent  () {
	// 添加滚屏定时任务，两秒滚动一次
	timer1 = setInterval(function() {
		doscroll();
	}, intervalTime);
	
	
		setTimeout(function() {
			
			if(null==timer2 && projectshowlistNum<=0){
				initNewsList(pageSize * 4);  //还是需要的因为滚一条少一条
				
				timer2 = setInterval(function() {
					initNewsList(pageSize * 4);
				}, intervalTime * pageSize * 3);
			}
			
		}, intervalTime * pageSize*3);
	
	
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
	
	dp.util.ajaxRequest({
				type : 'POST',
				url : '/DYBigScreen/DYNewsCommandMobileInterface/newsProgressList.do',
				data : JSON.stringify(data),
				dataType : 'json',
				contentType : "application/json;charset=UTF-8",
				success : function(data) {
					if (null!=data && null!=data.status && data.status == true ) {
						if(data.data!=null && typeof (data.data) != "undefined" && data.data.list!=null && data.data.list.length > 0){
							
							for (var i = 0; i < data.data.list.length; i++) {
								
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
								
							}
							
							var newsListHtml = template('manuscript_script', data.data);
							$('#news_cont').append(newsListHtml);
							
							var htmltip="未选择投频稿件，系统自动展示" + data.data.list.length + "篇最新稿件";
							$('#tipsshow').html(htmltip);
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
					
					if(projectshowlistNum == 0)
						$('#news_cont').html("");
					
					projectshowlistNum	= projectshowlistNum +1;     //增加挑选显示记录
					projectshowlist[newsinfo.id] = newsinfo.type;
					projectshowlist.records.push(data.data);
					
					if(projectshowlistNum<6){
						
						//小于6条不动画
						if(null!=timer1){
							clearInterval(timer1);
							timer1 = null;							
						}
						
						//小于6条条目刷新
						if(null==timer3){
							timer3 = setInterval(function() {
								refreshSelShowList();
							}, intervalTime);
						}
					}
					else
					{
						//大于等于6条动画展现
						if(null==timer1){						
							
							timer1 = setInterval(function() {
							   doscroll();
							}, intervalTime);
						}
						
						//大于等于6条条目不再自己刷新，依靠动画刷新
						if(null!=timer3){
							clearInterval(timer3);
							timer3=null;
						}
					}
					
					//有手动徐泽提阿偶就不从接口获取最新稿件
					if(null!=timer2){
						clearInterval(timer2);
						timer2=null;
					}						
										
					var newsListHtml = template('manuscript_deatail_script', data.data);
					$('#news_cont').append(newsListHtml);
					
					var htmltip="总共投屏" + projectshowlistNum + "篇稿件";
					$('#tipsshow').html(htmltip);
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

/**
 * 对列表数据添加滚动事件
 */
function doscroll () {
	var $parent = $("#news_cont");
	var $first = $parent.find('div:first').height();
	var $child = $("#news_cont div");
	
	//在选中的条目大于等于6时要动画显示
	if(projectshowlistNum>=6){
		var firstNews   = $parent.find('div:first');
		if(null!=firstNews && firstNews.length>0){
			var firstnewsid   = firstNews[0].id;
			var firstnewstype = $("#" +firstnewsid).attr("type");
			if(null==firstnewsid || null==firstnewstype)
				return;
			
			var selnewsinfo = {};
			selnewsinfo.id   = firstnewsid;
			selnewsinfo.type = firstnewstype;
			reGetSliceItem(selnewsinfo);		
		}
		else
			return;
	}
	else if(projectshowlistNum>0)
		return;
	
	
	$parent.animate({
		marginTop : -$first
	}, 1000, function() {
		$parent.css('marginTop', 0);				
		$child.slice(0, 1).remove();

	});
}

//说明有选中的条目，只需要重新获取选中条目的内容
function refreshSelShowList (){
	if(projectshowlistNum>=6)
		return;
	
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
	
	$('#news_cont').html(showTotalConten);	
}

function reGetSliceItem(newsinfo){
	
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
					$('#news_cont').append(newsListHtml);					
				}
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
		
		//停止投射条目的自动刷新		
		if(null!=timer3){
			clearInterval(timer3);
			timer3=null;
		}
		
		//恢复从接口刷新获取最新稿件列表
		$('#news_cont').html("");
		initNewsList(pageSize * 4);	
		if(timer2==null){
			timer2 = setInterval(function() {
				initNewsList(pageSize * 4);
			}, intervalTime * pageSize * 3);
		}
		
		//恢复动画
		if(null==timer1){						
			
			timer1 = setInterval(function() {
			   doscroll();
			}, intervalTime);
		}		
	}
	else if(projectshowlistNum<6)
	{//表示仍有投射条目，但是条目数小于6，不用动画了
		
		//从页面中删除放弃投射的条目
		var cancelShowObj = $("#" +cancelID);
		if(null!=cancelShowObj){
			cancelShowObj.remove();
		}
		var htmltip="总共投屏" + projectshowlistNum + "篇稿件";
		$('#tipsshow').html(htmltip);
		
		//有手动投射条目，不从接口获取最新稿件
		if(null!=timer2){
			clearInterval(timer2);
			timer2=null;
		}	
		
		//小于6条不动画
		if(null!=timer1){
			clearInterval(timer1);
			timer1 = null;							
		}
		
		//小于6条条目刷新
		if(null==timer3){
			timer3 = setInterval(function() {
				refreshSelShowList();
			}, intervalTime);
		}
	}
	else
	{//表示仍有投射条目，而且条目数大于等于6，需要动画
		
		//从页面中删除放弃投射的条目
		var cancelShowObj = $("#" +cancelID);
		if(null!=cancelShowObj){
			cancelShowObj.remove();
		}
		var htmltip="总共投屏" + projectshowlistNum + "篇稿件";
		$('#tipsshow').html(htmltip);
		
		//有手动投射条目，不从接口获取最新稿件
		if(null!=timer2){
			clearInterval(timer2);
			timer2=null;
		}	
		
		//大于等于6条动画展现
		if(null==timer1){						
			
			timer1 = setInterval(function() {
			   doscroll();
			}, intervalTime);
		}
		
		//大于等于6条条目不再自己刷新，依靠动画刷新
		if(null!=timer3){
			clearInterval(timer3);
			timer3=null;
		}
	}
	
}

function CaneclAllShowNews(){
	
	//删除投射记录
	var showCount = projectshowlist.records.length;	
	for(var i=0;i<showCount;i++)
	{
		var hadid  = projectshowlist.records[i].mainGuid;
		delete projectshowlist[hadid];
	}
	projectshowlist.records.splice(0,showCount);	
	
	projectshowlist      = {};   // 被选中显示的条目列表
	projectshowlist.records  = [];
	projectshowlistNum   = 0;
	
	//停止投射条目的自动刷新		
	if(null!=timer3){
		clearInterval(timer3);
		timer3=null;
	}
	
	//恢复从接口刷新获取最新稿件列表
	$('#news_cont').html("");	
	initNewsList(pageSize * 4);	
	if(timer2==null){
		timer2 = setInterval(function() {
			initNewsList(pageSize * 4);
		}, intervalTime * pageSize * 3);
	}
	
	//恢复动画
	if(null==timer1){						
		
		timer1 = setInterval(function() {
		   doscroll();
		}, intervalTime);
	}
}




