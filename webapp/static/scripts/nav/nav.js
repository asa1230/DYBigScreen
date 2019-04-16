/**
 * 全局变量
 */
;
NavObj = (function ($, window, document) {
    var c = null;
    return {

        init: function () {
            c = this;
            // c.initRouter();
            //c.queryAll();
            queryAll();
            c.intNavView();
            
            // c.initUserInfo();
        },
        intNavView: function () {
            //初始化
        	$("#iframeForChange").attr('src', "../control/control_summary.html");
            $('.subMenu').hide();
            $('li.active>.subMenu').show();
            //给菜单项添加事件
            $('.navMenu a').click(function (e) {
                //获取所属列表ul
                var $subMenuElement = $(this).next();
                var $liElement = $(this).parent();
                var $ulElement = $(this).parent().parent();
                //没有子菜单，则直接返回
                if (!$subMenuElement.is('ul')) {
                    $ulElement.find('li').removeClass('active');
                    $ulElement.find('ul.subMenu').slideUp();
                    $liElement.addClass('active');
                    return;
                }
                //如果存在子菜单，则打开或者关闭
                if (!$liElement.hasClass('active')) {
                    $ulElement.find('li').removeClass('active');
                    $ulElement.find('ul.subMenu').slideUp();
                    $liElement.addClass('active');
                    $subMenuElement.slideDown();
                } else {
                    //打开状态 则关闭本菜单
                    $subMenuElement.slideUp();
                    $liElement.removeClass('active');

                }
            });
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
				console.info(data);
				if(data.userinfo != null){
					var loginName = data.userinfo.tenantname;
					console.info(loginName);
					document.getElementById('loginName').innerHTML = loginName;
				}
				
				var html;
	        	var html0="<li id='summary'><a href='#/summary' class='arrow'>汇总列表</a></li>";
				var html1="<li id='command'><a href='javascript:;' class='arrow'>指挥大屏</a>";
				var html2="<li id='manuscript'><a href='javascript:;' class='arrow'>稿件大屏</a>";
				var html3="<li id='intergragtingCloud'><a href='javascript:;' class='arrow'>融云大屏</a>";
				var html4="<li id='others'><a href='#/others' class='arrow'>其它大屏</a></li>";
				var html5="<li id='operationManage'><a href='#/operationManage' class='arrow'>运营管理</a></li>";
				var html6="";
				//var html6="<li id='globalSetting'><a href='#/globalSetting' class='arrow'>全局设置</a></li>";
				
				var nescommandhtml = "";
				var newshtml = "";
				var rongyunhtml = "";
				var userhtml = "";
				
				if (data.records != null) {
					$.each(data.records, function(i, item) {
						//1.指挥调度 2.稿件 3.融云 4.用户添加
						var hrefurl = "http://" + baseUrl + "/DYBigScreen" + item.screenurl;
						console.log(hrefurl);
						if(item.screengroup == 1){
							if(nescommandhtml == ""){
								nescommandhtml = "<ul class='subMenu'><li><a href='"+hrefurl+"' target='_blank'>"+ item.screenname + "</a></li>";
							}else{
								nescommandhtml = nescommandhtml + "<li><a href='"+hrefurl+"' target='_blank'>"+ item.screenname + "</a></li>";
							}
						}
						if(item.screengroup == 2){
							if(newshtml == ""){
								newshtml = "<ul class='subMenu'><li><a href='"+hrefurl+"' target='_blank'>"+ item.screenname + "</a></li>";
							}else{
								newshtml = newshtml + "<li><a href='"+hrefurl+"' target='_blank'>"+ item.screenname + "</a></li>";
							}
						}
						if(item.screengroup == 3){
							if(rongyunhtml == ""){
								rongyunhtml = "<ul class='subMenu'><li><a href='"+hrefurl+"' target='_blank'>"+ item.screenname + "</a></li>";
							}else{
								rongyunhtml = rongyunhtml + "<li><a href='"+hrefurl+"' target='_blank'>"+ item.screenname + "</a></li>";
							}
						}
						
					});
				}
				
				if(nescommandhtml == ""){
					html1 = html1 +"</li>";
				}else{
					nescommandhtml = nescommandhtml + "</ul>";
					html1 = html1 +nescommandhtml+"</li>";
				}
				
				if(newshtml == ""){
					html2 = html2 +"</li>";
				}else{
					newshtml = newshtml + "</ul>";
					html2 = html2 +newshtml+"</li>";
				}
				
				if(rongyunhtml == ""){
					html3 = html3 +"</li>";
				}else{
					rongyunhtml = rongyunhtml + "</ul>";
					html3 = html3 +rongyunhtml+"</li>";
				}
				
				
				html = html0 + html1 + html2 + html3 + html4 + html5 + html6;
				//console.log(html);
				document.getElementById('navMenuBOX').innerHTML = html;
			} else {
				alert(data.commonResponse.errorDesc);
			}
	    }
	})
}


//调用初始化方法
$(NavObj.init());