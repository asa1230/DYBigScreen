var controlPropaganda = function() {
    var c;
    var selectListMsg = ""; //储存查询需要发送的消息字符串
    var projectiveTaskId = ""; //正在投屏的id
    var firstTaskGuid = "";
    var StatusDesp = ["草稿", "已发布", "有回复", "已截止"];
    // var serverUrl = "http://10.10.0.102:9088/dypropagandaservice/";
    var serverUrl = dp.global.propaServerUrl;
    var tenantId = dp.global.tenantId;
    var userId = dp.global.userId;
    var token = dp.global.token;
    return {
        init: function() {
            c = this;
            //初始化开关
            SimpleSwitch.init();
            c.getOrganization();
            c.getPublishMan();
            c.initSelect();
            c.initData();
            $(".select").change(function() {
                if ($(this).attr("id") == "column") {
                    c.initSelect();
                }
                c.initData();
            });
        },
        initData: function(start) {
            var type = $("#column  option:selected").val();
            if (type === "newTopic") {
                $("#head_diff").html("分类");
                c.loadSelectApiList(start);
            } else {
                $("#head_diff").html("附件数");
                c.loadReplyApiList(start);
            }
        },
        initSelect: function() {
            var type = $("#column  option:selected").val();
            var htmlStatus1 = "";
            if (type === "newTopic") {
                StatusDesp = ["已选", "保存", "待选", "进行中", "审核中", "审核通过", "审核打回", "终止", "完成"];
                $("#publishMan").show();
                for (var z = 0; z < StatusDesp.length; z++) {
                    htmlStatus1 += '<option value="' + StatusDesp[z] + '">' + StatusDesp[z] + '</option>';
                }
            } else {
                StatusDesp = ["已发", "草稿", "撤回"];
                $("#publishMan").hide();
                for (var z = 1; z < StatusDesp.length + 1; z++) {
                    htmlStatus1 += '<option value="' + z + '">' + StatusDesp[z - 1] + '</option>';
                }
            };
            var htmlStatus2 = '<option value="">全部状态</option> ' + htmlStatus1;
            document.getElementById('status').innerHTML = htmlStatus2;
        },
        getPublishMan: function() {
            var postData = {
                token: token
            };
            $.ajax({
                type: 'POST',
                async: true,
                dataType: 'json',
                url: serverUrl + 'userInforController/getUserInforMessageAll',
                // contentType : "application/json;charset=UTF-8",
                data: postData,
                success: function(data) {
                    if (data.status) {
                        var list = data.data,
                            htmlStatus1 = "";
                        for (var z = 0; z < list.length; z++) {
                            htmlStatus1 += '<option value="' + list[z].id + '">' + list[z].name + '</option>';
                        }
                        $("#publishMan").append(htmlStatus1);
                    }

                }
            })
        },
        getOrganization: function() {
            var postData = {
                token: token,
                organizationIdList: []
            };
            $.ajax({
                type: 'POST',
                async: true,
                dataType: 'json',
                url: 'http://dayang.user.com:8088/usermanager/api/' + 'authorization/organization/load',
                contentType: "text/plain;charset=UTF-8",
                data: JSON.stringify(postData),
                success: function(data) {
                    var data = JSON.parse(data);
                    if (data.commonResponse.success) {
                        var list = data.organizationList,
                            htmlStatus1 = "";
                        for (var z = 0; z < list.length; z++) {
                            htmlStatus1 += '<option value="' + list[z].id + '">' + list[z].name + '</option>';
                        }
                        $("#management").append(htmlStatus1);
                    }

                }
            })
        },
        loadSelectApiList: function(start) {
            var startNum = 1;
            var searchContent = $("#searchContent").val(); //搜索内容            
            var status = $("#status  option:selected").val();
            var management = $("#management  option:selected").val();
            var publishMan = $("#publishMan  option:selected").val();
            if (start) {
                startNum = start;
            }
            // 构建JSON数据信息
            var params = {
                currentPage: startNum,
                pageSize: 8,
                topicStatus: status,
                searchContent: searchContent,
            };
            if (management) {
                params.topicReportDeptid = management;
            }
            $.ajax({
                type: 'GET',
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
                        // var rlength = getjsonLength(data.records);
                        var html = template('select-list-item', data.data);
                        $("#select").html(html);
                        firstTaskGuid = data.data.list[0].topicGuid;
                        var target = $("#select tr:first").find('img').parent().get(0);
                        c.toSelectDetail(firstTaskGuid, target);
                        //2、设置分页
                        var totalCount = data.data.totalCount; //总条目数
                        var currentPage = data.data.currentPage //当前页
                        var totalPage = data.data.totalPage; //总页数
                        c.setPagination(totalPage, currentPage);
                    } else {
                        alert(data.commonResponse.errorDesc);
                    }
                }
            })
        },
        loadReplyApiList: function(start) {
            var startNum = 1;
            var searchContent = $("#searchContent").val(); //搜索内容            
            var management = $("#management  option:selected").val();
            var status = $("#status  option:selected").val();
            if (start) {
                startNum = start;
            }
            // 构建JSON数据信息
            var params = {
                currentPage: startNum,
                pageSize: 8,
                searchContent: searchContent,
                deptidList: management,
                annouStatus: status
            };
            $.ajax({
                type: 'GET',
                async: true,
                dataType: 'json',
                url: serverUrl + 'api/annou/list',
                contentType: "application/json;charset=UTF-8",
                beforeSend: function(XHR) {
                    XHR.setRequestHeader("tenantId", tenantId);
                    XHR.setRequestHeader("userId", userId);
                },
                data: params,
                success: function(data) {
                    if (data.status) {
                        // var rlength = getjsonLength(data.records);
                        var html = template('repay-list-item', data.data);
                        $("#select").html(html);
                        firstTaskGuid = data.data.list[0].annouGuid;
                        var target = $("#select tr:first").find('img').parent().get(0);
                        c.toSelectDetail(firstTaskGuid, target);
                        //2、设置分页
                        var totalCount = data.data.totalCount; //总条目数
                        var currentPage = data.data.currentPage //当前页
                        var totalPage = data.data.totalPage; //总页数
                        c.setPagination(totalPage, currentPage);
                    } else {
                        // alert(data.commonResponse.errorDesc);
                    }
                }
            })
        },
        setPagination: function(totalPage, currentPage) {
            var html =
                '<li class="prev"><a href="#" onclick="controlPropaganda.toPage(\'' + totalPage + '\',\'' + currentPage + '\',\'prev\');" title="Prev"><i class="fa fa-angle-left"></i>上一页</a></li>' +
                '<li><a href="#">' + currentPage + '/' + totalPage + '</a></li>' +
                '<li class="next"><a href="#" onclick="controlPropaganda.toPage(\'' + totalPage + '\',\'' + currentPage + '\',\'next\');" title="Next">下一页<i class="fa fa-angle-right"></i></a></li>';
            $('#pagination').html(html);
        },
        toPage: function(totalPage, currentPage, type) {
            if (type == "next") {
                if (currentPage != totalPage) {
                    c.initData(Number(currentPage) + 1);

                } else {
                    alert("已经是最后一页");
                }
            } else {
                if (currentPage != 1) {
                    c.initData(currentPage - 1);
                } else {
                    alert("已经是第一页");
                }
            }
        },
        //投屏到详情页面
        toSelectDetail: function(id, target) {
            //判断是否是投屏状态
            var img = $(target).find("img");
            if (img.is(".projective")) {
                //取消投屏 判断取消的是否是第一个选题,若不是才能取消投屏，取消投屏跳转到默认的第一条选题
                if (firstTaskGuid != id) {
                    //已投屏 则关闭投屏 发送消息 返回到列表展示
                    //isProjective = false;
                    //projectiveTaskId="";
                    img.removeClass();
                    img.prop("src", "../../images/icon1.png");
                    var type = $("#column  option:selected").val();
                    var msg = {};
                    msg.type = type + "Detail";
                    msg.content = firstTaskGuid;
                    send(JSON.stringify(msg));
                    $("#img_" + firstTaskGuid).prop("src", "../../images/icon2.png").addClass("projective");
                }
            } else {
                //未投屏  发送消息让大屏跳转到对应详细
                // isProjective = true;
                $("img[class='projective']").removeClass().prop("src", "../../images/icon1.png");
                img.addClass("projective");
                img.prop("src", "../../images/icon2.png");
                projectiveTaskId = img.attr("id");
                var type = $("#column  option:selected").val();
                //		console.info(id);
                var msg = {};
                msg.type = type + "Detail";
                msg.content = id;
                send(JSON.stringify(msg));
            }

        }
    };
}();

$(function() {
    controlPropaganda.init();
});
//------------------发送消息模块-------------------------//
var websocket = null;
var pageId = "propaganda";
//判断当前浏览器是否支持WebSocket
if ('WebSocket' in window) {
    websocket = new WebSocket("ws://" + baseUrl + "/DYBigScreen/websocket/" + pageId);
} else {
    alert('Not support websocket')
}
//连接发生错误的回调方法
websocket.onerror = function() {
    alert("error");
};

//连接成功建立的回调方法
websocket.onopen = function(event) {
        console.info("open");
    }
    //连接关闭的回调方法
websocket.onclose = function() {
        console.info("close");
    }
    //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function() {
        websocket.close();
    }
    //关闭连接
function closeWebSocket() {
    websocket.close();
}

//发送消息
function send(message) {
    websocket.send(message);
}