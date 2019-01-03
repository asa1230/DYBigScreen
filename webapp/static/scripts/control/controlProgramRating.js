$(function(){
	init();
});

//初始化方法
function init(){
	//loadServerUrl();
	/*loadSelectApiList();
	$(".select").change(function() {
		loadSelectApiList();
	});*/
	
	//定义表格
	initTable();
	//加载数据
	
	initData();
	
	initEvent();
}

function initTable(){
	
	$("#programRatingList").bootstrapTable({
//		url:"../../api/queryProgramRatingShow/queryAll",
//		method:"POST",
		striped : true,
		pagination: false,                   //是否显示分页（*）
        sortable: false,                     //是否启用排序
		height: 500,
		toolbar:"#toolbar",
		columns:[{
//			field : "ratingid",
//			title : "主键",
			checkbox : true
		},{
			field : "ratingcode",
			title : "频道名称"
		},{
			field : "ratingkey",
			title : "统计台"
		},{
			field : "orderby",
			title : "排序"
		},{
			field : "ratingvalue",
			title : "统计值"
		}]
		
	});
}

function initData(){
	//加载grid数据
	loadGridData();
}

function loadGridData(){
	ajaxRequest({
		type : 'POST',
		url : '../../api/queryProgramRatingShow/queryAll',
		success : function(data) {
			if (data.commonResponse.success == true) {
				$("#programRatingList").bootstrapTable("load",data.records);
			}
			
		}
	});
}

function initEvent(){
	$("#addBtn").click(function(){
		clearForm();
		$("#addOrUpdateModal").modal({backdrop:"static",keyboard:false,keyboard:false});
	});
	
	$("#updateBtn").click(function(){
		clearForm();
		//勾选，赋值
		var selectRow = $("#programRatingList").bootstrapTable("getAllSelections");
		if($(selectRow).size() != 1){
			alert("请选择一条需要修改的数据！");
			return ;
		}
		var data = selectRow[0];
		//赋值
		obtainFormData(data);
		$("#addOrUpdateModal").modal({backdrop:"static",keyboard:false});
	});
	
	$("#deleteBtn").click(function(){
		var selectRow = $("#programRatingList").bootstrapTable("getAllSelections");
		if($(selectRow).size() < 1){
			alert("请选择需要删除的数据！");
			return ;
		}
		
		var r = confirm("确定需要删除所选数据？");
		if(!r){
			return ;
		}
		var idArr = [];
		$(selectRow).each(function(i,e){
			idArr.push(e.ratingid);
		});
		var ids = idArr.join(",");
		
//		var param = {
//				ids : ids
//		};
		
		ajaxRequest({
			type : 'POST',
			url : '../../api/queryProgramRatingShow/deleteProgramRating',
			dataType:"json",
//			data: JSON.stringify(param),
			data: ids,
			success : function(data) {
				console.info(data);
				if (data.success == true) {
					alert("删除成功！");
					loadGridData();
					$("#addOrUpdateModal").modal("hide");
				}
			}
		});
	});
	
	$("#saveBtn").click(function(){
		var param = getFormData("programForm");
		console.info(param);
		console.info(JSON.stringify(param));
		debugger;
		ajaxRequest({
			type : 'POST',
			url : '../../api/queryProgramRatingShow/addOrUpdate',
			dataType:"json",
			data: JSON.stringify(param),
			success : function(data) {
				console.info(data);
				if (data.success == true) {
					alert("操作成功！");
					loadGridData();
					$("#addOrUpdateModal").modal("hide");
				}
		//		$('#programForm').reset();
				
			}
		});
		
	});
}

function getFormData(name){
	var param = $("#"+name).serializeArray();
	var data = {};
	$.each(param, function() {  
        if (data[this.name]) {
            if (!data[this.name].push) {  
            	data[this.name] = [ data[this.name] ];  
            } 
            data[this.name].push(this.value || '');  
        } else {
        	data[this.name] = this.value || '';  
        }
    });  
	
	return data;
}

function obtainFormData(data){
	$("#ratingid").val(data.ratingid);
	$("#ratingcode").val(data.ratingcode);
	$("#ratingkey").val(data.ratingkey);
	$("#ratingvalue").val(data.ratingvalue);
	$("#orderby").val(data.orderby);
}

function clearForm(){
	$("#ratingid").val("");
	$("#ratingcode").val("");
	$("#ratingkey").val("");
	$("#ratingvalue").val("");
	$("#orderby").val("");
	
}
function queryUser() {
	ajaxRequest({
		type : 'GET',
		url : '../../api/usercolumn/123',
		success : function(data) {
			if (data.commonResponse.success == true) {
				// console.info(JSON.stringify(data));
				var html2;
				if (data.userInfos != null) {
					$.each(data.userInfos, function(i, item) {
						html2 = html2 + '<option value=' + item.userName + '>'+ item.userName + '</option>';
					});
				}
				html = '<option value="">负责人</option> ' + html2;
				document.getElementById('chargeMan').innerHTML = html;
			} else {
				alert(data.commonResponse.errorDesc);
			}
		}
	})
}



function loadServerUrl(){
	var url="";
	window.localStorage.setItem("zhihuidiaoduURL", url);
	return url;
}


//------------------发送消息模块-------------------------//
/*var websocket = null;
var pageId = "programRating";
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
}*/