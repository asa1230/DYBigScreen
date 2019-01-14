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


var changgeIframe = function (router) {
    if (router == "summary") {
    } else if (router == "command") {
    } else if (router == "manuscript") {
    } else if (router == "intergragtingCloud") {
    } else if (router == "others") {
        // window.location.href="./nav.html"
        $("#iframeForChange").attr('src', "../control/control_otherbigscreen.html");
    } else if (router == "operationManage") {
        $("#iframeForChange").attr('src', "../control/operationManage.html");
    } else if (router == "globalSetting") {
        $("#iframeForChange").attr('src', "../control/globalSetting.html");
    } else {

    }
}



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