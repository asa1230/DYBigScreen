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
            $("#communication_ul,#reply_ul").on('click', function() {
                c.tabClick(this);
            });
            $("#rigion_ul,#hot_ul").on('click', function() {
                c.rankTabClick(this);
            });
            // initSwiper();
            $("#communication_ul").trigger("click");
            $("#rigion_ul").trigger("click");
            // 定时刷新	
            /*  window.setInterval(function() {
                 window.location.reload();
             }, 600000); */
        },
        tabClick: function(obj) {
            var $obj = $(obj);
            $obj.siblings().removeClass("tab_active").addClass("tab_unactive");
            $obj.removeClass("tab_unactive").addClass("tab_active");
            type = $obj.attr("name");
            //1、加载列表
            c.initData(type);
            clearInterval(timer2);
            timer2 = setInterval(function() { //zhy add
                $obj.siblings().trigger("click");
            }, 120000);
        },
        rankTabClick: function(obj) {
            var $obj = $(obj);
            $obj.siblings().removeClass("rank_tab_active").addClass("rank_tab_unactive");
            $obj.removeClass("rank_tab_unactive").addClass("rank_tab_active");
            var targetType = $obj.attr("name");
            c.initFirstFive(targetType);
            clearInterval(timer1);
            timer1 = setInterval(function() { //zhy add
                $obj.siblings().trigger("click");
            }, 120000);
        },
        initData: function(type) {
            if (type == "1") {
                c.loadSelectApiList();
            } else {
                c.loadReplyApiList();
            }

        },
        initFirstFive: function(type) {
            /* var limit = 8;
            var direction = 'desc';
            $.ajax({
                type: 'GET',
                async: true,
                dataType: 'json',
                url: serverUrl + 'api/topic/' + type + '/' + limit + '/' + direction,
                beforeSend: function(XHR) {
                    XHR.setRequestHeader("tenantId", tenantId);
                    XHR.setRequestHeader("userId", userId);
                },
                success: function(data) {
                    if (data.status) {
                        console.log("fivedata:", data.data)
                        var Long = data.data[0].count;
                        var listData = data;
                        $.each(listData.data, function(i, item) {
                            item.width = (item.count / Long) * 240;
                        });
                        var html = template('first-five-item', listData);
                        $("#first_five").html(html);
                    } else {
                        // alert(data.commonResponse.errorDesc);
                    }
                }
            }) */
            $.ajax({
                type: 'get',
                url: '../../view/data.json',
                dataType: 'json',
                success: function(data) {
                    var data = data.propaganda.rank[type];
                    console.log("json:", data)
                    var Long = Number(data.data[0].count);
                    // var listData = data;
                    $.each(data.data, function(i, item) {
                        item.width = (Number(item.count) / Long) * 240;
                        if (item.count.length > 3) {
                            item.count = item.count.substring(0, item.count.length - 3) + "," + item.count.slice(-3);
                        };
                    });
                    var html = template('first-five-item', data);
                    $("#first_five").html(html);
                }
            })
        },
        loadSelectApiList: function(start) {
            var startNum = 1;
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
            })
        },
        timeTrans: function(time) {
            return time.substring(5, 16);
        },
        loadReplyApiList: function(start) {
            var startNum = 1;
            if (start) {
                startNum = start;
            }
            // 构建JSON数据信息
            var params = {
                currentPage: startNum,
                pageSize: 6,
            };
            $.ajax({
                type: 'GET',
                async: true,
                dataType: 'json',
                url: serverUrl + 'api/annou/list',
                beforeSend: function(XHR) {
                    XHR.setRequestHeader("tenantId", tenantId);
                    XHR.setRequestHeader("userId", userId);
                },
                contentType: "application/json;charset=UTF-8",
                data: params,
                success: function(data) {
                    if (data.status) {
                        var data = data.data;
                        $.each(data.list, function(i, item) {
                            item.annouUpdateTime = c.timeTrans(item.annouUpdateTime);
                        });
                        var html = template('reply-list-item', data);
                        $("#tabs_ul").html(html);
                    } else {
                        // alert(data.commonResponse.errorDesc);
                    }
                }
            })
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
    alert('Not support websocket')
}
//连接发生错误的回调方法
websocket.onerror = function() {
    alert("client error");
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