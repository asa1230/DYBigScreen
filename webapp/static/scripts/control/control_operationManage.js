/**
 * 运营管理模块
 */
;
controlOperationManage = (function ($, window, document) {
    var c = null;
    return {
        init: function () {
            c = this;
			c.initData();
			c.initEvents();
        },
        initData: function () {
		},
		// 初始化事件
		initEvents:function(){
			$(".list-item .forbidden").on("click",function(){

				
			})
			$(".list-item .config").on("click",function(){

				$(window.parent.document).find("#organizationConfigModal").modal("show");
			})
			$(".list-item .delete").on("click",function(){
				$(window.parent.document).find("#deleteModal").modal("show");
				
			})
			// 新建大屏
			$("#createBigScreen").on("click",function(){
				$(window.parent.document).find("#ceateBigScreenModal").modal("show");
				
			})
		},	


    };
})(jQuery, window, document);
//调用初始化方法
$(controlOperationManage.init());