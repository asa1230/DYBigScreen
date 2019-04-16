$(function() {
    init(null);
});
var scrtime1;
var scrtime2;
var flag = true; //重定向标志
// var tenantId = 'dayang.com';
// var severUrl = 'http://10.10.0.102:9002/dycommunicationserver/';
// var severUrl = "http://100.0.0.61:9010/gateway/dycommunicationserver/";
var severUrl = dp.global.comiServerUrl;
var tenantId = dp.global.tenantId;

function init(id, replyGuid) {
    //clearInterval(scrtime1);
    //clearInterval(scrtime2);
    //1、加载选题详情
    //先判断是否有请求参数
    var taskid
        // var taskid = getQueryString("TaskGuid");
        // var taskid = '8bf04ae0-8a86-4e03-947c-84cca070947c';
        /* var mainGuid = 'c7155198-5ab9-413d-b289-ff2c9f62ef60';
        var taskid = '408dd3d7-7372-42ea-8142-c482f9630f6f'; */
    var type = "replyDetail";
    if (taskid != null && flag) {
        loadSelectDetail(mainGuid);
        // loadReplyDetail(mainGuid, taskid);
        flag = false;
    } else {
        if (id) {
            if (replyGuid) {
                loadReplyDetail(id, replyGuid);
            } else {
                loadSelectDetail(id);
            }
        }
    }
    //
    //	scrollZiyuan();
    //	scrollMission();
}

function tabClick(obj) {
    var $obj = $(obj);
    $obj.siblings().removeClass("tab_active").addClass("tab_unactive");
    $obj.removeClass("tab_unactive").addClass("tab_active");
    var targetId = $obj.attr("name");
    $("#reply_ul,#comment_ul").hide();
    $("#" + targetId).show();
    clearInterval(scrtime1);
    scrtime1 = setInterval(function() { //zhy add
        $obj.siblings().trigger("click");
    }, 60000);
}

//获取约稿详情
function loadSelectDetail(id) {
    var pageSize = '5';
    var postData = {
        mainGuid: id,
        currentPage: 1,
        pageSize: pageSize
    };
    $("#screen_header_text").find(".header_title").html("约稿详情");
    $("#screen_header_text").find(".header_eng").html("Invitation details");
    $.ajax({
        type: 'POST',
        async: true,
        dataType: 'json',
        url: severUrl + 'appointmanuscriptMainController/detailAppointmanuscript',
        // contentType: "application/json;charset=UTF-8",
        beforeSend: function(XHR) {
            XHR.setRequestHeader("tenantId", tenantId);
        },
        data: postData,
        success: function(data) {
            console.info(data);
            if (data.status) {
                var replyData = data.data.pageReplyCommunications;
                var CommentaryData = data.data.pageCommentaryAppointmanuscript;
                var len1 = replyData.list.length - 4;
                var len2 = CommentaryData.list.length - 4;
                CommentaryData.totalCount = CommentaryData.list.length;
                if (len1 > 0) {
                    replyData.list.splice(4, len1);
                }
                if (len2 > 0) {
                    CommentaryData.list.splice(4, len2);
                }
                $.each(replyData.list, function(i, item) {
                    item.replyCreatTime = item.replyCreatTime.substring(5, 16);
                });
                $.each(CommentaryData.list, function(i, item) {
                    item.commentaryCreateTime = item.commentaryCreateTime.substring(5, 16);
                });
                var html_1 = template('detail1-list-item', data.data);
                $('#detail-1').html(html_1);
                var html_2 = template('detail2-list-item', data.data);
                $('#detail-2').html(html_2);
                $("#comment_tab,#reply_tab").on('click', function() {
                    tabClick(this);
                });
                $("#reply_ul").trigger("click");
            } else {
                // console.info(data.commonResponse.errorDesc);
            }
        }
    });

}
//获取供稿详情
function loadReplyDetail(mainGuid, replyGuid) {
    var pageSize = '5';
    var postData = {
        replyGuid: replyGuid,
        mainGuid: mainGuid
    };
    $("#detail_contant").hide();
    $("#repay_detail").show();
    $("#screen_header_text").find(".header_title").html("供稿详情");
    $("#screen_header_text").find(".header_eng").html("Details of submissions");
    $.ajax({
        type: 'POST',
        async: true,
        dataType: 'json',
        url: severUrl + 'replyAppointmanuscriptConyroller/detailReplyAppointmanuscript',
        // contentType: "application/json;charset=UTF-8",
        beforeSend: function(XHR) {
            XHR.setRequestHeader("tenantId", tenantId);
        },
        data: postData,
        success: function(data) {
            console.info(data);
            if (data.status) {
                var data = data.data.replyCommunications;
                var html_1 = template('reply-list-item', data);
                $('#reply_detail_right').html(html_1);
                $("#reply_detail_title").html(data.replySubtitle);
                $("#reply_detail_content").html(data.replyContent);
            } else {
                // console.info(data.commonResponse.errorDesc);
            }
        }
    });

}

function getjsonLength(json) {
    var jsonLength = 0;
    for (var i in json) {
        jsonLength++;
    }
    return jsonLength;
}

function scrollZiyuan() {

    $("#ziyuan").hover(function() {
        clearInterval(scrtime1);
    }, function() {
        scrtime1 = setInterval(function() {
            var ul = $("#ziyuan");
            var liHeight = ul.find("tr:last").height();
            ul.animate({ marginTop: liHeight + 20 + "px" }, 500, function() {
                ul.find("tr:last").prependTo(ul)
                ul.find("tr:first").hide();
                ul.css({ marginTop: 0 });
                ul.find("tr:first").fadeIn(1000);
            });
        }, 5000);
    }).trigger("mouseleave");
}

function scrollMission() {

    $("#mission").hover(function() {
        clearInterval(scrtime2);
    }, function() {
        scrtime2 = setInterval(function() {
            var ul = $("#mission");
            var liHeight = ul.find(".scroll:last").height();
            ul.animate({ marginTop: liHeight + 20 + "px" }, 500, function() {
                ul.find(".scroll:last").prependTo(ul)
                ul.find(".scroll:first").hide();
                ul.css({ marginTop: 0 });
                ul.find(".scroll:first").fadeIn(1000);
            });
        }, 5000);
    }).trigger("mouseleave");
}
/**
 *根据解析url获取指定名称请求参数
 * @param name 请求参数名称
 * @returns  请求参数内容
 */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}

//------------------发送消息模块-------------------------//
var websocket = null;
var pageId = "communicationDetail_show";
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
    console.log("msg:", msg)
    if (msg.type == "newCommuDetail") {
        init(msg.content);
    } else if (msg.type == "newReplyDetail") {
        //展示列表第一个选题的选题详情
        init(msg.content, msg.replyGuid);
    } else if (msg.type == "refresh" && (msg.content == 4 || msg.content == "all")) {
        window.location.reload();
    }
}

//计算任务完成百分比
template.helper("renwuPercent", function(num, total) {
    num = parseFloat(num);
    total = parseFloat(total);
    if (isNaN(num) || isNaN(total)) {
        return "0%";
    }
    return total <= 0 ? "0%" : (Math.round(num / total * 100) + "%");
});