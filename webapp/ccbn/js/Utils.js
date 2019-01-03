var _commons = function(){
	
	return {
		
		getParamsConfig : function(paramKey,fn){
			
			var value = null;
			var url = system.getContextPath() + "/commons/getParamsConfig.do";
			$.ajax({
				url : url,
				type: 'POST',
				async : false,
				data : {key:paramKey},
				success : function(data){
					value = data;
					if(fn && typeof(fn) == "function"){
						fn(data);
					}
				}
			});
			return value;
		}
	};
};

var Commons = _commons();



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
			XHR.setRequestHeader("operaterId",encodeURI(system.getUserid()));
		},
		error : defaults.error,
		success : defaults.success
	});
}