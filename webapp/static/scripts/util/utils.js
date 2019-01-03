$(function(){
	var sysTitle = "指挥调度-大屏控制端";
	$("#sysTitle").html(sysTitle);
	
	queryFrequncy();
});

/**
 * Determine the mobile operating system.
 * This function either returns 'iOS', 'Android' or 'unknown'
 *
 * @returns {String}
 */

//var baseUrl = "localhost:8080/";  											//大屏项目的部署ip和端口号  开发时候用的是localhost:8083  实施部署的时候应该相应改变




//var appServiceUrl = "http://58.87.82.233:9073/DYNewsCommandMobile/api/bs";//大屏项目需要的指挥调度 项目的路径
//var appServiceUrl = "http://192.168.20.159:8080/DYNewsCommandMobile/api/bs";//大屏项目需要的指挥调度 项目的路径
var appServiceUrl = "http://124.127.118.109:61001/newscommand";
var clueCloudUrl = "http://192.168.5.239:8900/views/controller/controller.html";
var defaultUserWorkNo = "8883";				//调用指挥调度所需的id
var defaultUserId = "8883";					//调用指挥调度所需的id

/////////////////////////////////////////////////////////////////////////
//zhy add
var wbsockectinitmode = 0 ;                    //取值为0，初始化websocket的baseUrl用网页地址自动解析；取值为1时使用写死的内网地址；  根据项目实际情况加以设置
var baseUrl   =  window.location.host;
if(wbsockectinitmode==1)
	baseUrl   =  "192.168.2.101:8080";

var MapneedSetViewPort = true;                //取值为true是需要调整当前地图大小能显示所有当前类型列表当前页坐标mark点，设为false则不调整，保持当前页面中心点和大小比例不变，而且自动刷新列表数据时地图不移动


var publicresourceurl = "http://fast.dayang.com/dycfbserver/";

var bigscreenversion  = "v2.0.4_bulid20181221";
console.info("大屏版本:"+bigscreenversion);

var xuantiStatusDesp=["已选","保存","待选","进行中","审核中","审核通过","审核打回","终止","已发布"];

var defaultPrePushCliname="暂未填写";

var todaySelectSwitchFrequncy="60";
var newsSwitchFrequncy="60";
var tvnewsSwitchFrequncy="60";
var tvnewsquerycolumn="康巴卫视新闻";

function queryFrequncy(){

	var commandType   = "00";
	
	// 构建JSON数据信息
	var params = {};
	params.handleCommand = commandType;
		
	$.ajax({
	    type : 'POST',
        async : false,
        dataType : 'json',
		url : '/DYBigScreen/DYNewsCommandMobileInterface/handlesystemconfigparam.do',
        contentType : "application/json;charset=UTF-8",
        data : JSON.stringify(params),
		success : function(data) {
			if (data.state == 0) {
				var systodaySelectSwtichrequncy = data.todaySelectSwiperFrequcy;
				var sysnewsSwtichrequncy        = data.newsSwiperFrequcy;
				var systvnewsSwtichrequncy      = data.tvnewsSwiperFrequcy;
				var systvnewsqueryCol           = data.tvnewsColumname;
				
				todaySelectSwitchFrequncy = systodaySelectSwtichrequncy;
				newsSwitchFrequncy        = sysnewsSwtichrequncy;
				tvnewsSwitchFrequncy      = systvnewsSwtichrequncy;
				tvnewsquerycolumn         = systvnewsqueryCol;
				
			} else {
				
			}
		}
	});	
	
}

///////////////////////////////////////////////////////////////////////////

var Utils = function () {
    return {
    	// 应用名称
    	appName: function () {
    		var path = location.pathname;
    		if(path.indexOf('/') == 0){
    			path = path.substring(1);
    		}
    		return path.split('/')[0];
        }
    };

}();

/**
* HTML接收参数
*/
function  getRequestByName(paramName)
{
	//获取URL的字符串
	var sSource=String(window.document.location);
	var sName= paramName;  
	var sReturn="";   
	var sQUS="?";   
	var sAMP="&";   
	var sEQ="=";   
	var iPos;

	//获取sSource中的"?"，无则返回 -1
	iPos=sSource.indexOf(sQUS);
	if(iPos==-1) 
		return; 
	
	//汲取参数，从iPos位置到sSource.length-iPos的位置，
	//若iPos = -1，则：从-1 到 sSource.length+1
	var strQuery=sSource.substr(iPos,sSource.length-iPos); 

	// alert(strQuery); 
	//先全部转换为小写
	var   strLCQuery = strQuery.toLowerCase();   
	var   strLCName  = sName.toLowerCase(); 

	//从子字符串strLCQuery中查找“?”、参数名，以及“=”，即“?参数名=”
	iPos   = strLCQuery.indexOf(sQUS + strLCName + sEQ);
	//alert(iPos);
	//如果不存在
	if(iPos == -1)   
	{   
		//继续查找可能的后一个参数，即带“&参数名=”
		iPos = strLCQuery.indexOf(sAMP + strLCName + sEQ);   
	}

	//判断是否存在参数
	if(iPos != -1)
	{    
		sReturn = strQuery.substr(iPos + sName.length + 2,strQuery.length-(iPos + sName.length + 2));   
		var iPosAMP = sReturn.indexOf(sAMP);   
		if (iPosAMP == -1)
		{
			return   sReturn;   
		}
		else
		{   
			sReturn = sReturn.substr(0,iPosAMP);   
		}   
	}
	return   sReturn; 
}



//截取字符串区分中英文
function mySubString(str,startLen, len) {
  var newLength = 0;
  var newStr = "";
  var chineseRegex = /[^\x00-\xff]/g;
  var singleChar = "";
  var strLength = str.replace(chineseRegex,"**").length;
  for(var i = 0;i < strLength;i++) {
          singleChar = str.charAt(i).toString();
          if(singleChar.match(chineseRegex) != null) {
                  newLength += 2;
          }else {
                  newLength++;
          }
		            if (newLength > len) {
			break;
		}
		newStr += singleChar;
	}
	if (strLength > len) {
		newStr += "..."; 
	}
	return newStr;
};


//格式化标题，显示20个字
function comChangeTitle(title) {
	var nowWord;
	var nowLeng = contentLength(title);
	if (nowLeng > 19) {
		nowWord = mySubString(title, 0, 20);
	} else {
		nowWord = title;
	}
	return nowWord;
};


//格式化标题，自定义
function changeTitleDiy(title,len){
	var nowWord;
	var nowLeng = contentLength(title);
	if (nowLeng > len-1) {
		nowWord = mySubString(title, 0, len);
	} else {
		nowWord = title;
	}
	return nowWord;
};

//返回文字内容长度
function contentLength(content) {
	var intLength = 0
	for ( var i = 0; i < content.length; i++) {
		if ((content.charCodeAt(i) < 0) || (content.charCodeAt(i) > 255))
			intLength = intLength + 2
		else
			intLength = intLength + 1
	}
	return intLength
};


//处理内容testarea换行符在html页面不换行的问题
function formatContent() {
    var element = $("#formatContent");
    var temp =  element.text().replace(/\n/g,'<br/>');
    element.html(temp);
}

/**
 * 设置确认框（选项包含确认，取消）
 */
function setOptions(){
	
	var options = {
		animation : 5,
		buttons : {
			cancel : {
				action : function() {
				},
				className : null,
				id : 'cancel',
				text : '取消'
			},
			confirm : {
				action : function() {
				},
				className :null,
				id : 'confirm',
				text : '确认'
			}
		},
		input : false
	};
	return options;
}

/**
 * 设置确认框（选项包含是，否）
 */
function setOptions2(){
	
	var options = {
		animation : 5,
		buttons : {
			cancel : {
				action : function() {
				},
				className : null,
				id : 'cancel',
				text : '否'
			},
			confirm : {
				action : function() {
				},
				className :null,
				id : 'confirm',
				text : '是'
			}
		},
		input : false
	};
	return options;
}

/**
 * 设置确认框（选项只包含确认按钮）
 */
function setConfirmOptions(){

	var options = {
		animation : 5,
		buttons : {
			confirm : {
				action : function() {
				},
				className :null,
				id : 'confirm',
				text : '确认'
			}
		},
		input : false
	};
	return options;
}


/**
 * 是否被包含,是返回true,不是返回false
 */
function isContained(a, b){
	if (!(a instanceof Array) || !(b instanceof Array))
		return false;
	if (a.length < b.length)
		return false;
	var aStr = a.toString();
	console.info(aStr);
	for (var i = 0, len = b.length; i < len; i++) {
		console.info(aStr.indexOf(b[i]));
		if (aStr.indexOf(b[i]) == -1)
			return false;
	}
	return true;
}
/**
 * 用新窗口打开url地址
 */
function openNewWindow(url,title){
	 window.open(url, title, 'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-60)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
}
/**
 * 判断是否是pc端
 * @returns {Boolean}
 */
function IsPC()  
{  
   var userAgentInfo = navigator.userAgent;  
   var Agents = new Array("Android", "iPhone", "SymbianOS", "Windows Phone", "iPad", "iPod");  
   var flag = true;  
   for (var v = 0; v < Agents.length; v++) {  
       if (userAgentInfo.indexOf(Agents[v]) > 0) { flag = false; break; }  
   }  
   return flag;  
} 


/**
 * 根据type获取开关value
 */
function querySwichvalueByType(swichtype) {
	var swichvalue;
	$.ajax({
		type : 'GET',
        async : false,
        contentType: "application/json;charset=UTF-8",
        url : "../../api/swichSettings/"+swichtype,
        dataType : 'json',
        success : function(data) {
            if (data.commonResponse.success) {
            	swichvalue = data.swichvalue;
            } else{
            	Apprise('无法获取对应开关值!');
            }
        },
    });	
	return swichvalue;
}


/**
 *封装Ajax</br>
 *参数说明：</br>
 * opts: {'可选参数'}</br>
 * type: 请求方式:GET/POST,默认值:'GET';</br>
 * url:    发送请求的地址, 默认值: 当前页地址;</br>
 * data: 请求参数;</br>
 * data: string,json;</br>
 * async: 是否异步:true/false,默认值:true;</br>
 * cache: 是否缓存：true/false,默认值:true;</br>
 * contentType: HTTP头信息，默认值：'application/x-www-form-urlencoded';</br>
 * success: 请求成功后的回调函数;</br>
 * error: 请求失败后的回调函数;</br>
 */
function ajaxRequest(opts) {
	//一.设置默认参数
	var defaults = {
		url : '',
		type : '',
		data : '',
		cache : true,
		async : false,
		dataType : 'json',
		contentType : "application/json;charset=UTF-8",
		success : function() {},
		error : function() {}
	};

	//二.用户参数覆盖默认参数    
	for ( var key in opts) {
		defaults[key] = opts[key];
	}

	//三.开始组装ajax
	$.ajax({
		url : defaults.url,
		type : defaults.type,
		data : defaults.data,
		async : defaults.async,
		cache : defaults.cache,
		dataType : defaults.dataType,
		contentType : defaults.contentType,
		beforeSend :function(XHR){
			XHR.setRequestHeader("operaterId",encodeURI(defaultUserId));
		},
		error : defaults.error,
		success : defaults.success
	});
}






/**
* @author xf.radish
  * jQuery插件 常用效果的实现
  */
 (function (jQuery) {
     jQuery.fn.extend({
         /**
          *@description 无缝滚动 支持匀速上下左右和垂直翻滚上下
          *@param {
           *      direction:string,//滚动方向 值域：top|left|bottom|right|up|down
          *      speed:string//滚动速度（垂直翻滚时为停留时间）
          * } o
          *@example
          *HTML结构
          *<div id="mar">
          *    <ul>
          *        <li>内容1</li>
          *        <li>内容2</li>
          *        <li>内容3</li>
          *    </ul>
          *</div>
          *mar样式应该包含height,width,background等 注意不要覆盖了插件附加上去的样式
          *调用：
          *jQuery("#mar").marquee({
          *    direction:"top",
          *    speed:30
          *})
          *
          */
         marquee:function (o) {
             var it = this,
                     d = o.direction || 'top', //滚动方向 默认向左
                     s = o.speed || 30, //速度 默认30毫秒
                     mar = jQuery(it),
                     mp1 = jQuery(it).children(0).attr({id:"mp1"}),
                     marqueeFunc = getMarquee(d),
                     marRun = marqueeFunc ? setInterval(marqueeFunc, s) : function () {
                         return false;
                     };//开始滚动
             //鼠标悬停事件
             jQuery(it).hover(function () {
                 clearInterval(marRun);
             }, function () {
                 marRun = setInterval(marqueeFunc, s);
             })
             /*生成滚动函数
              *1.判断方向 *2.装载CSS *3.判断需不需要滚动 *4.构造函数
              */
             function getMarquee(d) {
                 var marqueeFunc;
                 switch (d) {
                     //水平向左
                     case "left":
                         mar.addClass("plus-mar-left");
                         var liHeight = mar[0].offsetHeight;
                         mar.css({"line-height":liHeight + "px"});
                         if (mp1[0].offsetWidth < mar[0].offsetWidth) return false;
                         mp1.clone().attr({id:"mp2"}).appendTo(mar);
                         marqueeFunc = function () {
                             if (mar[0].scrollLeft >= mp1[0].scrollWidth) {
                                 mar[0].scrollLeft = 0;
                             } else {
                                 mar[0].scrollLeft++;
                             }
                         }
                         break;
                     //水平向上
                     case "top":
                         mar.addClass("plus-mar-top");
                         if (mp1.outerHeight() <= mar.outerHeight()) return false;
                         var mp2 = mp1.clone().attr({id:"mp2"}).appendTo(mar);
                         marqueeFunc = function () {
                             var scrollTop = mar[0].scrollTop;
                             if (mp1[0].offsetHeight > scrollTop) {
                                 mar[0].scrollTop = scrollTop + 1;
                             } else {
                                 mar[0].scrollTop = 0;
                             }
                         }
                         break;
                     //水平向右
                     case "right":
                         mar.addClass("plus-mar-left");
                         var liHeight = mar[0].offsetHeight;
                         mar.css({"line-height":liHeight + "px"});
                         if (mp1[0].offsetWidth <= mar[0].offsetWidth) return false;
                         var mp2 = mp1.clone().attr({id:"mp2"}).appendTo(mar);
                         marqueeFunc = function () {
                             if (mar[0].scrollLeft <= 0) {
                                 mar[0].scrollLeft += mp2[0].offsetWidth;
                             } else {
                                 mar[0].scrollLeft--;
                             }
                         }
                         break;
                     //水平向下
                     case "bottom":
                         mar.addClass("plus-mar-bottom");
                         if (mp1[0].offsetHeight <= mar[0].offsetHeight) return false;
                         var mp2 = mp1.clone().attr({id:"mp2"}).appendTo(mar);
                         mar[0].scrollTop = mar[0].scrollHeight;
                         marqueeFunc = function () {
                             if (mp1[0].offsetTop >= mar[0].scrollTop) {
                                 mar[0].scrollTop += mp1[0].offsetHeight;
                             } else {
                                 mar[0].scrollTop--;

                             }
                         }
                         break;
                     //垂直翻滚 向上
                     case "up":
                         mar.addClass("plus-mar-up");
                         var liHeight = mar[0].offsetHeight;
                         mp1.css({"line-height":liHeight + "px"});
                         marqueeFunc = function () {
                             var currLi = it.eq(0).find("ul:first");
                             currLi.animate({
                                 marginTop:-liHeight
                             }, 500, function () {
                                 currLi.find("li:first").appendTo(currLi);
                                 currLi.css({marginTop:0});
                             })
                         }
                         break;
                     //垂直翻滚 向下
                     case "down":
                         mar.addClass("plus-mar-down");
                         var liHeight = mar[0].offsetHeight,
                                 liLength = mp1.children().length,
                                 topInit = -(liLength - 1) * liHeight + "px";
                         mp1.css({"top":topInit, "line-height":liHeight + "px"});
                         marqueeFunc = function () {
                             var currLi = it.eq(0).find("ul:last");
                             currLi.animate({
                                 marginTop:liHeight
                             }, 500, function () {
                                 currLi.find("li:last").prependTo(currLi);
                                 currLi.css({marginTop:0});
                             })
                         }
                         break;
                     default:
                     {
                         marqueeFunc = null;
                         alert("滚动插件：传入的参数{direction}有误！");
                     }
                 }
                 return marqueeFunc;
             }
         }
     })
 })(jQuery);
 
 
 /**
  * 封装Ajax</br> 参数说明：</br> opts: {'可选参数'}</br> type: 请求方式:GET/POST,默认值:'GET';</br>
  * url: 发送请求的地址, 默认值: 当前页地址;</br> data: 请求参数;</br> data: string,json;</br>
  * async: 是否异步:true/false,默认值:true;</br> cache: 是否缓存：true/false,默认值:true;</br>
  * contentType: HTTP头信息，默认值：'application/x-www-form-urlencoded';</br> success:
  * 请求成功后的回调函数;</br> error: 请求失败后的回调函数;</br>
  */
 ;
 // 注册命名空间
 var NameSpace = {
 	register : function() {
 		var arg = arguments[0];
 		var arr = arg.split('.');
 		var str = '';
 		for (var i = 0; i < arr.length; i++) {
 			str = i == 0 ? arr[i] : (str + '.' + arr[i]);
 			var sval = "   if(typeof " + str + "=='undefined' ) { " + str
 					+ "= new Object(); } ";
 			eval(sval);
 		}
 		;
 	}
 };
 // 注册应用命名空间
 NameSpace.register("dp");
 dp.util = (function($, window, document) {
 	return {
 		ajaxRequest : function(opts) {
 			// 一.设置默认参数
 			var defaults = {
 				isDefaultUser:false,
 				url : '',
 				type : '',
 				data : '',
 				cache : true,
 				async : false,
 				dataType : 'json',
 				// contentType: "application/json;charset=UTF-8",
 				success : function() {
 				},
 				error : function() {
 				}
 			};

 			// 二.用户参数覆盖默认参数
 			for ( var key in opts) {
 				defaults[key] = opts[key];
 			}
 			var userInfo = JSON.parse(window.sessionStorage.getItem("userInfo"));
 			// 三.开始组装ajax
 			$.ajax({
 				url : defaults.url,
 				type : defaults.type,
 				data : defaults.data,
 				async : defaults.async,
 				cache : defaults.cache,
 				dataType : defaults.dataType,
 				contentType : defaults.contentType,
 				beforeSend : function(XHR) {
 					XHR.setRequestHeader("tenantId", userInfo.tenantId);
 					if(defaults.isDefaultUser){
 						XHR.setRequestHeader("userId", userInfo.userId);
 					}
 				},
 				error : function(XMLHttpRequest, textStatus, errorThrown) {
 					console.log("错误信息" + errorThrown.toString());
 				},
 				success : defaults.success
 			});
 		},
 		isNotEmpty : function(obj) {
 			var isflag = false;
 			if (obj != null && obj != '' && obj != undefined
 					&& obj != 'undefined') {
 				isflag = true;
 			}
 			return isflag;
 		},
 		/**
 		 * 对日期进行格式化，
 		 * 
 		 * @param date
 		 *            要格式化的日期
 		 * @param format
 		 *            进行格式化的模式字符串 支持的模式字母有： y:年, M:年中的月份(1-12), d:月份中的天(1-31),
 		 *            h:小时(0-23), m:分(0-59), s:秒(0-59), S:毫秒(0-999), q:季度(1-4)
 		 * @return String
 		 */
 		dateFormat : function(date, format) {

 			date = new Date(date);
 			var map = {
 				"M" : date.getMonth() + 1, // 月份
 				"d" : date.getDate(), // 日
 				"h" : date.getHours(), // 小时
 				"m" : date.getMinutes(), // 分
 				"s" : date.getSeconds(), // 秒
 				"q" : Math.floor((date.getMonth() + 3) / 3), // 季度
 				"S" : date.getMilliseconds()
 			// 毫秒
 			};

 			format = format.replace(/([yMdhmsqS])+/g, function(all, t) {
 				var v = map[t];
 				if (v !== undefined) {
 					if (all.length > 1) {
 						v = '0' + v;
 						v = v.substr(v.length - 2);
 					}
 					return v;
 				} else if (t === 'y') {
 					return (date.getFullYear() + '').substr(4 - all.length);
 				}
 				return all;
 			});
 			return format;
 		},
 		// 从url中根据名称获取参数
 		getParameterFromUrl : function(parameterName) {
 			var reg = new RegExp("(^|&)" + parameterName + "=([^&]*)(&|$)");
 			var r = window.location.search.substr(1).match(reg);
 			if (r != null)
 				return decodeURI(r[2]);
 			;
 			return null;
 		},
 		// 获取根路径
 		getContextPath : function(pathName) {
 			var index = pathName.substr(1).indexOf("/");
 			var result = pathName.substr(0, index + 1);
 			return result;
 		},
 		/**
 		 * days 天之前的日期
 		 * @param days 天数
 		 * @returns yyyy-mm-dd 格式
 		 */
 		getDate : function(days){
 			var preDays = days;
 			if(preDays==null||preDays==""||preDays==undefined){
 				preDays = 0;
 			}
 			//获取当前日期
 			var myDate = new Date();
 			//获取preDays前日期
 			var lw = new Date(myDate - 1000 * 60 * 60 * 24 * preDays);//最后一个数字30可改，30天的意思
 			var lastY = lw.getFullYear();
 			var lastM = lw.getMonth()+1;
 			var lastD = lw.getDate();
 			var date=lastY+"-"+(lastM<10 ? "0" + lastM : lastM)+"-"+(lastD<10 ? "0"+ lastD : lastD);
 			return date;
 		},
 	};
 })(jQuery, window, document);
