// -----------------定义路由------------------
function RouterForIframe() {
    this.routes = {};
    this.currentUrl = '';
}
RouterForIframe.prototype.route = function (path, callback) {
    this.routes[path] = callback || function () { };
};
RouterForIframe.prototype.refresh = function () {
    this.currentUrl = location.hash.slice(1) || '/';
    this.routes[this.currentUrl]();
};
RouterForIframe.prototype.init = function () {
    window.addEventListener('load', this.refresh.bind(this), false);
    window.addEventListener('hashchange', this.refresh.bind(this), false);
}
window.RouterForIframe = new RouterForIframe();
window.RouterForIframe.init();

//------------- 配置路由-------------------
// 其它大屏
RouterForIframe.route('/summary', function () {
    changgeIframe('summary');
});
// 其它大屏
RouterForIframe.route('/others', function () {
    changgeIframe('others');
});
// 运营管理
RouterForIframe.route('/operationManage', function () {
    changgeIframe('operationManage');
});
// 全局设置
RouterForIframe.route('/globalSetting', function () {
    changgeIframe('globalSetting');
});
//------------- 路由回调--------------------

var changgeIframe = function (router) {
    if (router == "summary") {
        $("#iframeForChange").attr('src', "../control/control_summary.html");
    } else if (router == "command") {
    } else if (router == "manuscript") {
    } else if (router == "intergragtingCloud") {
    } else if (router == "others") {
        // window.location.href="./nav.html"
        $("#iframeForChange").attr('src', "../control/control_otherbigscreen.html");
    } else if (router == "operationManage") {
        $("#iframeForChange").attr('src', "../control/control_operationManage.html");
    } else if (router == "globalSetting") {
        // 按按键设置
        $("#iframeForChange").attr('src', "../control/control_globalSetting.html");
    } else {

    }
}