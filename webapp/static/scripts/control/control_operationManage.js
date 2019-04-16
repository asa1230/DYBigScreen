/**
 * 运营管理模块
 */
;
controlOperationManage = (function ($, window, document) {
    var c = null;
    return {
        init: function () {
            c = this;
            queryAll("");
            queryAllBigscreen();
			c.initData();
			c.initEvents();
        },
        initData: function () {
        	$("#searchContent").val("");
        	$("input[type=checkbox][id='tableBox']").prop('checked', false);
		},
		// 初始化事件
		initEvents:function(){
			$(".list-item .forbidden").on("click",function(){

				
			})
			
			
			// 新建大屏
			$("#createBigScreen").on("click",function(){
				//$(window.parent.document).find("#ceateBigScreenModal").modal("show");
				modelClose();
				$(window.document).find("#organizationConfigModal").modal("show");
			})
			
			$("#deleteBigScreen").on("click",function(){
				$("#hidetoDelete").val("1");
				$(window.document).find("#deleteModal").modal("show");
			})
			
			$("#changeOpen").on("click",function(){
				$(window.document).find("#changeOpenModal").modal("show");
			})
			
			$("#changeClose").on("click",function(){
				$(window.document).find("#changeCloseModal").modal("show");
			})
			
		},	


    };
})(jQuery, window, document);
//调用初始化方法

/*查询所有机构*/
function queryAll(tenantName){
	ajaxRequest({
		type : 'POST',
		async: false,
		url : '../../api/queryBigscreenUser/queryAll',
		contentType : "application/json;charset=UTF-8",
		data:tenantName,
	    dataType:'json',
	    success : function(data) {
	    	if (data.commonResponse.success == true) {
	    		var html = "";
	    		
	    		
	    		if (data.records != null) {
	    			$.each(data.records, function(i, item) {
	    				
	    				var screenName = item.tenantorgname;
	    		    	var screenStatus = "禁用";
	    		    	var screenStatusColor = "forbidden";
	    		    	var dateee = new Date(item.modifytime).toJSON();;
	    		    	//var times=d.getFullYear() + '-' + (d.getMonth() + 1) + '-' + d.getDate() + ' ' + d.getHours() + ':' + d.getMinutes() + ':' + d.getSeconds();
	    		    	var times = new Date(+new Date(dateee)+8*3600*1000).toISOString().replace(/T/g,' ').replace(/\.[\d]{3}Z/,'') 
	    		    	
	    		    	if(screenName.length>20){
	    		    		screenName = screenName.substring(0,20)+"...";
	    		    	}
	    		    	
	    		    	if(item.isuse == 1){
	    		    		screenStatus = "启用";
	    		    		screenStatusColor = "normal";
	    		    	}
	    				
	    				html = html + "<tr class='list-item' id='"+item.guid+"'><td><div class='checkbox-lyy checkbox-default' ><input type='checkbox' name='tablecheckbox' onchange='changeBox();'><label></label></div></td>"
	    						 			+"<td style='text-overflow: ellipsis; white-space: nowrap;overflow: hidden;'>"
	    						 			+screenName
	    						 			+"</td><td style='text-overflow: ellipsis; white-space: nowrap;overflow: hidden;'>售前演示</td>"
	    						 			+"<td style='text-align:center;'>"
	    						 			+item.screennum
	    						 			+"</td>"
	    						 			+"<td style='text-align:center;' class='status'><span class='"+ screenStatusColor +"'></span>"
	    						 			+screenStatus
	    						 			+"</td><td style='text-overflow: ellipsis; white-space: nowrap;overflow: hidden;'>"
	    						 			+times
	    						 			+"</td><td style='cursor:pointer;display:flex;align-items:center;justify-content: center;' class='operation'>"
	    						 			+"<span class='config'>配置</span><span class='delete'>删除</span></td></tr>";
					});
	    			document.getElementById('screenBody').innerHTML = html;
	    			
	    		}
	    		
	    		
	    	}else{
	    		alert(data.commonResponse.errorDesc);
	    	}
	    	
	    }
	})
	
	tableOPen();
}

/*查询所有大屏*/
function queryAllBigscreen(){
	ajaxRequest({
		type : 'POST',
		async: false,
		url : '../../api/queryBigscreenUser/queryAllBigscreen',
		contentType : "application/json;charset=UTF-8",
	    dataType:'json',
	    success : function(data) {
	    	if (data.commonResponse.success == true) {
	    		console.log(data);
	    		var html1="";
				var html2="";
				var html3="";
				var html4="";
	    		
	    		
	    		if (data.bigScreenList != null) {
	    			$.each(data.bigScreenList, function(i, item) {
	    				//1.指挥调度 2.稿件 3.融云 4.用户添加
	    				if(item.screengroup == 1){
	    					html1 = html1 + "<div class='checkboxItem'><div class='checkbox-lyy checkbox-default'><input type='checkbox' id='"+item.screenguid+"' name='bigscreenCheckbox'><label></label></div>"
	    											+item.screenname
	    											+"</div>";
						}
						if(item.screengroup == 2){
							html2 = html2 + "<div class='checkboxItem'><div class='checkbox-lyy checkbox-default'><input type='checkbox' id='"+item.screenguid+"' name='bigscreenCheckbox'><label></label></div>"
							+item.screenname
							+"</div>";
						}
						if(item.screengroup == 3){
							html3 = html3 + "<div class='checkboxItem'><div class='checkbox-lyy checkbox-default'><input type='checkbox' id='"+item.screenguid+"' name='bigscreenCheckbox'><label></label></div>"
							+item.screenname
							+"</div>";
						}
						if(item.screengroup == 4){
							html4 = html4 + "<div class='checkboxItem'><div class='checkbox-lyy checkbox-default'><input type='checkbox' id='"+item.screenguid+"' name='bigscreenCheckbox'><label></label></div>"
							+item.screenname
							+"</div>";
						}
					});
	    			document.getElementById('commandScreenDIV').innerHTML = html1;
	    			document.getElementById('newsScreenDIV').innerHTML = html2;
	    			document.getElementById('rongyunScreenDIV').innerHTML = html3;
	    			document.getElementById('otherScreenDIV').innerHTML = html4;
	    			
	    		}
	    		
	    		
	    	}else{
	    		alert(data.commonResponse.errorDesc);
	    	}
	    	
	    }
	})
}

function toSave(){
	var data = {};
	var tenantorgName = $("#tenantorgName").val();
	var hideTenantID = $("#hideTenantID").val();
	var isuer = 0;
	var screenIDS = "";
	
	if ($('#isuser').prop('checked')) {
		isuer = 1;
	}
	
	$("input[type=checkbox][name='bigscreenCheckbox']").each(function(i){
         if(this.checked == true){
             console.log(this.getAttribute('id'));
             screenIDS = screenIDS + this.getAttribute('id') + ",";
         }
     })
     
     if(screenIDS != ""){
    	 screenIDS = screenIDS.substring(0,screenIDS.length-1);
     }
	data.tenantorgName = tenantorgName;
	data.hideTenantID = hideTenantID;
	data.isuer = isuer;
	data.screenIDS = screenIDS;
	
	ajaxRequest({
		type : 'POST',
		async: false,
		url : '../../api/queryBigscreenUser/updateTenant',
		contentType : "application/json;charset=UTF-8",
		data : JSON.stringify(data),
	    dataType:'json',
	    success : function(data) {
	    	if (data.commonResponse.success == true) {
	    		location.reload();
	    	}
	    }
	})
	
}

function todelete(){
	
	var deleteid = "";
	var hideTenantID = $("#hideTenantID").val();
	var hidetoDelete = $("#hidetoDelete").val();
	
	if(hidetoDelete == 0){
		deleteid = hideTenantID;
	}else{
		$("input[type=checkbox][name='tablecheckbox']").each(function(i){
	        if(this.checked == true){
	        	var parentid = $(this).parent().parent().parent().attr("id");
	        	deleteid = deleteid + parentid + ",";
	        }
	    })
	    
	    if(deleteid != ""){
	    	deleteid = deleteid.substring(0,deleteid.length-1);
	     }
	}
	
	if(deleteid != ""){
		ajaxRequest({
			type : 'POST',
			async: false,
			url : '../../api/queryBigscreenUser/deleteTenant',
			contentType : "application/json;charset=UTF-8",
			data : deleteid,
		    dataType:'json',
		    success : function(data) {
		    	if (data.commonResponse.success == true) {
		    		location.reload();
		    	}
		    }
		})
	}else{
		alert("请选择需要删除的机构!");
	}
	
}

function tochangeOpen(){
	var changeid = "";
	$("input[type=checkbox][name='tablecheckbox']").each(function(i){
        if(this.checked == true){
        	var parentid = $(this).parent().parent().parent().attr("id");
        	changeid = changeid + parentid + ",";
        }
    })
    
    if(changeid != ""){
    	changeid = changeid.substring(0,changeid.length-1);
    	
    	ajaxRequest({
			type : 'POST',
			async: false,
			url : '../../api/queryBigscreenUser/changeOpenTenant',
			contentType : "application/json;charset=UTF-8",
			data : changeid,
		    dataType:'json',
		    success : function(data) {
		    	if (data.commonResponse.success == true) {
		    		location.reload();
		    	}
		    }
		})
    	
     }else{
    	 alert("请选择需要改变状态的机构!");
     }
}

function tochangeClose(){
	var changeid = "";
	$("input[type=checkbox][name='tablecheckbox']").each(function(i){
        if(this.checked == true){
        	var parentid = $(this).parent().parent().parent().attr("id");
        	changeid = changeid + parentid + ",";
        }
    })
    
    if(changeid != ""){
    	changeid = changeid.substring(0,changeid.length-1);
    	
    	ajaxRequest({
			type : 'POST',
			async: false,
			url : '../../api/queryBigscreenUser/changeCloseTenant',
			contentType : "application/json;charset=UTF-8",
			data : changeid,
		    dataType:'json',
		    success : function(data) {
		    	if (data.commonResponse.success == true) {
		    		location.reload();
		    	}
		    }
		})
    	
     }else{
    	 alert("请选择需要改变状态的机构!");
     }
}

function loadSelectApiList(){
	var searchContent = $("#searchContent").val();
	queryAll(searchContent);
}

function modelClose(){
	$("#tenantorgName").val("");
	$("#hideTenantID").val("");
	$("#isuser").prop('checked', false);
	$("input[type=checkbox][name='bigscreenCheckbox']").prop('checked', false);
}

function changeTableBox(){
	
	
	if ($("#tableBox").prop('checked')) {
		$("input[type=checkbox][name='tablecheckbox']").prop('checked', true);
		var selectNum = $("input[type=checkbox][name='tablecheckbox']:checked").length
		document.getElementById('selectNum').innerHTML = selectNum;
	}else{
		document.getElementById('selectNum').innerHTML = "0";
		$("input[type=checkbox][name='tablecheckbox']").prop('checked', false);
	}
}

function changeBox(){
	var selectNum = $("input[type=checkbox][name='tablecheckbox']:checked").length
	document.getElementById('selectNum').innerHTML = selectNum;
}

function tableOPen(){
	$(".list-item .config").on("click",function(){
		modelClose();
		var parentid = $(this).parent().parent().attr("id");
		
		$("#hideTenantID").val(parentid);
		ajaxRequest({
			type : 'POST',
			async: false,
			url : '../../api/queryBigscreenUser/queryByID',
			contentType : "application/json;charset=UTF-8",
			data : parentid,
		    dataType:'json',
		    success : function(data) {
		    	if (data.commonResponse.success == true) {
		    		console.log(data);
		    		var bcUser = data.bcUser;
		    		$("#tenantorgName").val(bcUser.tenantorgname);
		    		if(bcUser.isuse==1){
		    			$("input[type=checkbox][id='isuser']").prop('checked', true);
		    		}else{
		    			$("input[type=checkbox][id='isuser']").prop('checked', false);
		    		}
		    		
		    		
		    		if (data.bigScreenUserList != null) {
		    			$.each(data.bigScreenUserList, function(i, item) {
		    				$("input[type=checkbox][id='"+item.screenguid+"']").prop('checked', true);
		    				
		    			});
		    		}
		    		
		    	}else{
		    		alert(data.commonResponse.errorDesc);
		    	}
		    	
		    }
		})
		
		$(window.document).find("#organizationConfigModal").modal("show");
	})
	$(".list-item .delete").on("click",function(){
		var parentid = $(this).parent().parent().attr("id");
		
		$("#hideTenantID").val(parentid);
		$("#hidetoDelete").val("0");
		$(window.document).find("#deleteModal").modal("show");
		
	})
	
	$(".list-item .forbidden").on("click",function(){
		modelClose();
		$(window.document).find("#organizationConfigModal").modal("show");
		
	})
}



$(controlOperationManage.init());