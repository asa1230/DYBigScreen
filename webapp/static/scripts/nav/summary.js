/**
 * 全局变量
 */
;
NavObj = (function ($, window, document) {
    var c = null;
    return {

        init: function () {
            c = this;
            queryAll();
            
        },

    };
})(jQuery, window, document);

function queryAll(){
	ajaxRequest({
		type : 'POST',
		async: false,
		url : '../../api/queryBigscreen',
		contentType : "application/json;charset=UTF-8",
	    dataType:'json',
	    success : function(data) {
	    	if (data.commonResponse.success == true) {
				//console.info(data);
				var html ="";
	        	var commandhtml="";
				var newshtml="";
				var rongyunhtml="";
				var otherhtml="";
				
				if (data.records != null) {
					$.each(data.records, function(i, item) {
						//1.指挥调度 2.稿件 3.融云 4.用户添加
						var screenurl = "http://" + baseUrl + "/DYBigScreen" + item.screenurl;
						var controlscreenurl = "";
						if(item.controlscreenurl == "#"){
							controlscreenurl = "";
						}else{
							controlscreenurl="<div class='right' onclick='newwindow(this)' windowto='http://"+ baseUrl + "/DYBigScreen" + item.controlscreenurl+"'>进入控制端<span class='icon iconfont icon-hz_arrowright_normal' ></span>";
							//controlscreenurl = "http://" + baseUrl + "/DYBigScreen" + item.controlscreenurl;
						}
						var imgurl = "http://" + baseUrl + "/DYBigScreen" + item.screenimg;
						
						console.log(screenurl);
						html = html + "<div class='itemForList col-sm-3 col-md-3 col-lg-3'>"
										    +"<div class='containerForItem'>"
										    +"<div class='top' onclick='newwindow(this)' windowto='"+screenurl+"'>"
										    +"<img src='"
										    +imgurl
										    +"' alt=''></div>"
										    +"<div class='bottom'>"
										    +"<div class='left'>"
										    +item.screenname
										    +"</div>"
										    +controlscreenurl
										    +"</div></div></div></div>";
						
						if(item.screengroup == 1){
							commandhtml = commandhtml + "<div class='itemForList col-sm-3 col-md-3 col-lg-3'>"
											    +"<div class='containerForItem'>"
											    +"<div class='top' onclick='newwindow(this)' windowto='"+screenurl+"'>"
											    +"<img src='"
											    +imgurl
											    +"' alt=''></div>"
											    +"<div class='bottom'>"
											    +"<div class='left'>"
											    +item.screenname
											    +"</div>"
											    +controlscreenurl
											    +"</div></div></div></div>";
						}
						if(item.screengroup == 2){
							newshtml = newshtml + "<div class='itemForList col-sm-3 col-md-3 col-lg-3'>"
											    +"<div class='containerForItem'>"
											    +"<div class='top' onclick='newwindow(this)' windowto='"+screenurl+"'>"
											    +"<img src='"
											    +imgurl
											    +"' alt=''></div>"
											    +"<div class='bottom'>"
											    +"<div class='left'>"
											    +item.screenname
											    +"</div>"
											    +controlscreenurl
											    +"</div></div></div></div>";
						}
						if(item.screengroup == 3){
							rongyunhtml = rongyunhtml + "<div class='itemForList col-sm-3 col-md-3 col-lg-3'>"
											    +"<div class='containerForItem'>"
											    +"<div class='top' onclick='newwindow(this)' windowto='"+screenurl+"'>"
											    +"<img src='"
											    +imgurl
											    +"' alt=''></div>"
											    +"<div class='bottom'>"
											    +"<div class='left'>"
											    +item.screenname
											    +"</div>"
											    +controlscreenurl
											    +"</div></div></div></div>";
						}
						
						if(item.screengroup == 4){
							otherhtml = otherhtml + "<div class='itemForList col-sm-3 col-md-3 col-lg-3'>"
											    +"<div class='containerForItem'>"
											    +"<div class='top' onclick='newwindow(this)' windowto='"+screenurl+"'>"
											    +"<img src='"
											    +imgurl
											    +"' alt=''></div>"
											    +"<div class='bottom'>"
											    +"<div class='left'>"
											    +item.screenname
											    +"</div>"
											    +"<div class='right' onclick='newwindow(this)' windowto='"+controlscreenurl+"'>"
											    +"进入控制端<span class='icon iconfont icon-hz_arrowright_normal' ></span>"
											    +"</div></div></div></div>";
						}
						
					});
				}
				
				
				document.getElementById('summaryDIV').innerHTML = html;
				document.getElementById('commandDIV').innerHTML = commandhtml;
				document.getElementById('newDIV').innerHTML = newshtml;
				document.getElementById('rongyunDIV').innerHTML = rongyunhtml;
				document.getElementById('otherDIV').innerHTML = otherhtml;
			} else {
				alert(data.commonResponse.errorDesc);
			}
	    }
	})
}

function newwindow(_this){
	var windowto = $(_this).attr("windowto");
	window.open(windowto); 
}


//调用初始化方法
$(NavObj.init());