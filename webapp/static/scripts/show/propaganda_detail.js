$(function() {
    init(null);
});
var scrtime1;
var scrtime2;
var flag = true; //重定向标志
/* var tenantId = 'dayang.com';
var userId = "admin";
var severUrl = "http://10.10.0.102:9088/dypropagandaservice/"; */
var severUrl = dp.global.propaServerUrl;
var tenantId = dp.global.tenantId;
var userId = dp.global.userId;

function init(id) {
    var taskid;
    /* var taskid = 'fcd433a8-af29-4f0b-be6a-690c1c1fe459';
    var type = "propaDetail"; */
    if (taskid != null && flag) {
        loadSelectDetail(taskid);
        flag = false;
    } else {
        if (id) {
            loadSelectDetail(id);
        }
    }

}

//获取公告详情
function loadSelectDetail(id) {
    $.ajax({
        type: 'GET',
        async: true,
        dataType: 'json',
        url: severUrl + "api/annou/" + id,
        contentType: "application/json;charset=UTF-8",
        beforeSend: function(XHR) {
            XHR.setRequestHeader("tenantId", tenantId);
            XHR.setRequestHeader("userId", userId);
        },
        success: function(data) {
            console.info(data);
            if (data.status) {
                var data = data.data;
                data.annouUpdateTime = data.annouUpdateTime.substring(5, 16);
                var html = template('detail1-list-item', data);
                $('#detail-content').html(html);
                var html_1 = template('attach-list-item', data);
                $('#detail-1').html(html_1);
                var rigionData = data.annouRangeName == "" ? [] : data.annouRangeName.split(",");
                data.rigionData = rigionData;
                var html_2 = template('detail2-list-item', data);
                $('#detail-2').html(html_2);
            } else {
                // console.info(data.commonResponse.errorDesc);
            }
        }
    });

}

//------------------发送消息模块-------------------------//
var websocket = null;
var pageId = "propagandaDetail_show";
//判断当前浏览器是否支持WebSocket
if ('WebSocket' in window) {
    websocket = new WebSocket("ws://" + baseUrl + "/DYBigScreen/websocket/" + pageId);
} else {
    // alert('Not support websocket')
}
//连接发生错误的回调方法
websocket.onerror = function() {
    // alert("client error");
};

//连接成功建立的回调方法
websocket.onopen = function(event) {
        console.info("open client");
    }
    //连接关闭的回调方法
websocket.onclose = function() {
        console.info("close client");
    }
    //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function() {
        websocket.close();
    }
    //关闭连接
function closeWebSocket() {
    websocket.close();
}

//接收到消息的回调方法
websocket.onmessage = function(event) {
    var msg = JSON.parse(event.data);
    console.log("msg:", msg)
    if (msg.type == "newAnnouDetail") {
        init(msg.content);
    } else if (msg.type == "selectProgress") {
        //展示列表第一个选题的选题详情
        init(msg.records[0].taskGuid);
    } else if (msg.type == "refresh" && (msg.content == 4 || msg.content == "all")) {
        window.location.reload();
    }
}