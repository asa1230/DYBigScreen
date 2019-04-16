var isbusy = false; //zhy add


var propaganda = function() {
    var c;
    var echartData = {};
    var timer2, timer1;
    var selectListMsg = ""; //储存查询需要发送的消息字符串
    var projectiveTaskId = ""; //正在投屏的id
    var firstTaskGuid = "";
    var StatusDesp = ["草稿", "已发布", "有回复", "已截止"];
    // var serverUrl = "http://10.10.0.102:9088/dypropagandaservice/";
    var serverUrl = dp.global.propaServerUrl;
    var tenantId = dp.global.tenantId;
    var userId = dp.global.userId;
    /*  var tenantId = "dayang.com";
     var userId = 'admin'; */
    var type = "1"; //1是选题，2是公告
    // var token = "ST-53-R4FZlngYZ2eAzdofZd7J-cas";
    return {
        init: function() {
            c = this;
            c.loadSelectApiList();
            // 定时刷新	
            /*  window.setInterval(function() {
                 window.location.reload();
             }, 600000); */
        },
        loadSelectApiList: function(start) {
            var data = {
                list: [{
                    topicTitle: "稿件现场采访回传任务稿件现场采访回传任务稿件现场采访回传任务",
                    topic: "湖北广电",
                    topicperson: "刘雨",
                    deadLine: "2019-03-28 16:35"
                }, {
                    topicTitle: "稿件现场采访回传任务稿件现场采访回传任务稿件现场采访回传任务",
                    topic: "湖北广电",
                    topicperson: "刘雨",
                    deadLine: "2019-03-28 16:35"
                }, {
                    topicTitle: "稿件现场采访回传任务稿件现场采访回传任务稿件现场采访回传任务",
                    topic: "湖北广电",
                    topicperson: "刘雨",
                    deadLine: "2019-03-28 16:35"
                }, {
                    topicTitle: "稿件现场采访回传任务稿件现场采访回传任务稿件现场采访回传任务",
                    topic: "湖北广电",
                    topicperson: "刘雨",
                    deadLine: "2019-03-28 16:35"
                }, {
                    topicTitle: "稿件现场采访回传任务稿件现场采访回传任务稿件现场采访回传任务",
                    topic: "湖北广电",
                    topicperson: "刘雨",
                    deadLine: "2019-03-28 16:35"
                }]
            }
            $.each(data.list, function(i, item) {
                item.deadLine = c.timeTrans(item.deadLine);
            });
            /* var html = template('task-list-item', data);
            $("#tabs_ul").html(html); */
            var timeData = {
                list: [{
                        date: '2019-03-25 18:23:35',
                        content: [
                            '刘思源修改了任务信息内容'
                        ]
                    },
                    {
                        date: '2019-03-25 18:23:35',
                        content: [
                            '刘思源修改了任务信息内容'
                        ]
                    },
                    {
                        date: '2019-02-28 18:23:35',
                        content: [
                            '刘思源修改了任务信息内容', '刘思源修改了任务信息内容', '刘思源修改了任务信息内容'
                        ]
                    }
                ]
            }
            var timeHtml = template('task-timeline-item', timeData);
            $("#timeline").html(timeHtml);
            /* var startNum = 1;
            if (start) {
                startNum = start;
            }
            var params = {
                currentPage: startNum,
                pageSize: 6,
            }
            $.ajax({
                type: "GET",
                async: true,
                dataType: 'json',
                beforeSend: function(XHR) {
                    XHR.setRequestHeader("tenantId", tenantId);
                    XHR.setRequestHeader("userId", userId);
                },
                url: serverUrl + 'api/topic/list',
                contentType: "application/json;charset=UTF-8",
                data: params,
                success: function(data) {
                    if (data.status) {
                        var data = data.data;
                        $.each(data.list, function(i, item) {
                            item.topicModifyTime = c.timeTrans(item.topicModifyTime);
                        });
                        var html = template('communication-list-item', data);
                        $("#tabs_ul").html(html);
                    } else {
                        // alert(data.commonResponse.errorDesc);
                    }
                }
            }) */
        },
        timeTrans: function(time) {
            return time.substring(5, 16);
        },

    };
}();

$(function() {
    propaganda.init();
});

var pageData = null;

//来源于控制端传递的数据
function loadSelectControlList(data) {

    if (data.commonResponse.success == true) {
        var rlength = getjsonLength(data.records);
        console.info(JSON.stringify(data));
        for (var m = 0; m < rlength; m++) {
            //对于过长的title 进行截取 长度超过20的减为20
            if (data.records[m].title.length > 20) {
                data.records[m].title = data.records[m].title.substring(0, 20) + "...";
            }
            if (data.records[m].content != null) {
                data.records[m].content = titleLegthDiy(data.records[m].content, 60)
                var div = document.createElement("div"); //去掉HTML格式，变成纯文本
                div.innerHTML = data.records[m].content;
                data.records[m].content = div.innerText;
            }
            if (data.records[m].status != null)
                data.records[m].statusdesp = xuantiStatusDesp[data.records[m].status];
        }

        //将查出的数据分为两部分，放入缓存，用于翻页加载
        pageData = data;
        splitPage(data);
    } else {
        console.info(data.commonResponse.errorDesc);
    };

}


//------------------消息模块-------------------------//
var websocket = null;
var pageId = "propaganda_show";
//判断当前浏览器是否支持WebSocket
if ('WebSocket' in window) {
    websocket = new WebSocket("ws://" + baseUrl + "/DYBigScreen/websocket/" + pageId);
} else {
    console.info('Not support websocket')
}
//连接发生错误的回调方法
websocket.onerror = function() {
    console.info("client error");
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
    if (msg.type == "newAnnouDetail") {
        $("#reply_ul").trigger("click");
    } else if (msg.type == "newTopicDetail") {
        $("#communication_ul").trigger("click");
    } else if (msg.type == "refresh" && (msg.content == 3 || msg.content == "all")) {
        window.location.reload();
    } else if (msg.type == "changetsfrequncy") {
        var frequncy = parseInt(msg.content);
        if (null == frequncy || Number.isNaN(frequncy))
            frequncy = 5000;
        else
            frequncy = frequncy * 1000;

        var autoplayparams = {};
        autoplayparams.delay = frequncy;
        mySwiper.params.autoplay.delay = frequncy;
    }
}