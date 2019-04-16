/**
 * 全局变量
 */
;
SummaryObj = (function ($, window, document) {
    var c = null;
    return {

        init: function () {
            c = this;
            // c.initRouter();
            c.intSummaryView();
            // c.initUserInfo();
        },
        intSummaryView: function () {
        	
        	
        },


    };
})(jQuery, window, document);
//调用初始化方法
$(SummaryObj.init());