var isbusy = false; //zhy add


var Communication = function() {
    var c;
    var echartData = {};
    var timer2;
    var selectListMsg = ""; //储存查询需要发送的消息字符串
    var projectiveTaskId = ""; //正在投屏的id
    var firstTaskGuid = "";
    var StatusDesp = ["草稿", "已发布", "有回复", "已截止"];
    // var serverUrl = "http://10.10.0.102:9002/dycommunicationserver/";
    // var serverUrl = "http://100.0.0.61:9010/gateway/dycommunicationserver/";
    // var tenantId = window.sessionStorage.getItem("tenantId");
    // var tenantId = "dayang.com";
    var token = dp.global.token;
    var serverUrl = dp.global.comiServerUrl;
    var tenantId = dp.global.tenantId;
    return {
        init: function() {
            c = this;
            $("#communication_ul,#reply_ul").on('click', function() {
                    c.tabClick(this);
                })
                // initSwiper();
            $("#communication_ul").trigger("click");
            // 定时刷新	
            /*  window.setInterval(function() {
                 window.location.reload();
             }, 240000); */
        },
        tabClick: function(obj) {
            var $obj = $(obj);
            $obj.siblings().removeClass("tab_active").addClass("tab_unactive");
            $obj.removeClass("tab_unactive").addClass("tab_active");
            var targetType = $obj.attr("name");
            //1、加载列表
            c.initData(targetType);
            clearInterval(timer2);
            timer2 = setInterval(function() { //zhy add
                $obj.siblings().trigger("click");
            }, 60000);
        },
        initData: function(type) {
            var option;
            if (type == "1") {
                c.loadSelectApiList();
            } else {
                $("#sortField").val("main_update_time");
                c.loadReplyApiList();
            }
            $("#deadline").html(option);
            c.initFirstFive("1");
            c.initEventType("1");
        },
        initFirstFive: function(type) {
            var params = {
                start: 1,
                end: 5,
                eventManuscriptType: type,
                tenantId: tenantId,
            };
            $.ajax({
                type: 'POST',
                async: true,
                dataType: 'json',
                url: serverUrl + 'statisticsEventManuscriptController/getStatisticsEventManuscriptByPage',
                // contentType: "application/json;charset=UTF-8",
                data: params,
                success: function(data) {
                    if (data.status) {
                        // console.log("fivedata:", data.data)
                        if (data.data.length > 0) {
                            var Long = data.data[0].sums;
                            var listData = data;
                            $.each(listData.data, function(i, item) {
                                item.width = (item.sums / Long) * 240;
                            });
                            var html = template('first-five-item', listData);
                            $("#first_five").html(html);
                        }
                    } else {
                        // alert(data.commonResponse.errorDesc);
                    }
                }
            })
        },
        initEventType: function(type) {
            var eventList = ['1', '2', '3'];
            var params = {
                eventTypesList: JSON.stringify(eventList),
                eventManuscriptType: type,
                tenantId: tenantId,
            };
            $.ajax({
                type: 'POST',
                async: true,
                dataType: 'json',
                url: serverUrl + 'statisticsEventManuscriptController/getStatisticsEventManuscriptByEventPage',
                // contentType: "application/json;charset=UTF-8",
                data: params,
                success: function(data) {
                    if (data.status) {
                        // console.log("data:", data.data)
                        c.setEchartsList(data.data);
                    } else {
                        // alert(data.commonResponse.errorDesc);
                    }
                }
            })
        },
        setEchartsList: function(data) {
            var dom;
            var rwNum_all = 0;
            $.each(data, function(i, item) {
                rwNum_all += item.sums;
            });
            $.each(data, function(i, item) {
                let ec = pageEchart(item, rwNum_all);
                // echartData[item.statisticsId] = ec;
                dom = $("#echarts_" + item.eventType).get(0);
                ec.showEchart(dom);
            });
        },
        loadSelectApiList: function(start) {
            var startNum = 1;
            if (start) {
                startNum = start;
            }
            var sortField = $("#sortField  option:selected").val();
            if (sortField == "main_update_time") {
                sortField = "main_create_time";
            }
            // 构建JSON数据信息
            var params = {
                currentPage: startNum,
                pageSize: 6,
                tenantId: tenantId,
                sortDirection: "desc",
                sortField: sortField
            };
            $.ajax({
                type: 'POST',
                async: true,
                dataType: 'json',
                url: serverUrl + 'appointmanuscriptMainController/getAppointmanuscriptBigScreenByPage',
                // contentType: "application/json;charset=UTF-8",
                data: params,
                success: function(data) {
                    if (data.status) {
                        var data = data.data;
                        $.each(data.list, function(i, item) {
                            item.mainFinalDeadline = c.timeTrans(item.mainFinalDeadline);
                        });
                        var html = template('communication-list-item', data);
                        $("#tabs_ul").html(html);
                    } else {
                        // alert(data.commonResponse.errorDesc);
                    }
                }
            })
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
                tenantId: tenantId,
                sortDirection: "desc",
                sortField: "reply_creat_time"
            };
            $.ajax({
                type: 'POST',
                async: true,
                dataType: 'json',
                url: serverUrl + 'replyAppointmanuscriptConyroller/getReplyAppointmanuscriptByPage',
                // contentType: "application/json;charset=UTF-8",
                data: params,
                success: function(data) {
                    if (data.status) {
                        var data = data.data;
                        $.each(data.list, function(i, item) {
                            item.replyCreatTime = c.timeTrans(item.replyCreatTime);
                        });
                        var html = template('reply-list-item', data);
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
    };
}();

$(function() {
    Communication.init();
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


function titleLegthDiy(a, b) {
    if (a.length > b) {
        return a.substring(0, b) + "...";
    } else {
        return a;
    }

}


function getjsonLength(json) {
    var jsonLength = 0;
    for (var i in json) {
        jsonLength++;
    }
    return jsonLength;
}

///计算两个整数的百分比值 
function GetPercent(num, total) {
    num = parseFloat(num);
    total = parseFloat(total);
    if (isNaN(num) || isNaN(total)) {
        return "-";
    }
    return total <= 0 ? "0%" : (Math.round(num / total * 100) + "%");
}


var pageEchart = function(data, rwNum_all) {
    var rwNum_wc = 0;
    var rwRrogress = 0;
    rwNum_wc = data.sums;

    if (rwNum_all == 0) {
        rwNum_all = 1;
    }
    rwRrogress = GetPercent(data.sums, rwNum_all);

    var getEchartOption = function(colorStatus) {
        var dataStyle = {
            normal: {
                label: {
                    show: false
                },
                labelLine: {
                    show: false
                },
                shadowBlur: 40,
                shadowColor: 'rgba(255, 255, 255, 0.2)',
            }
        };
        var placeHolderStyle = {
            normal: {
                color: 'rgba(255, 255, 255, 0.2)', //未完成的圆环的颜色
                label: {
                    show: false
                },
                labelLine: {
                    show: false
                }
            },
            emphasis: {
                color: 'rgba(255, 255, 255, 0.2)' //未完成的圆环的颜色
            }
        };
        var option = {
            title: {
                text: rwRrogress,
                x: 'center',
                y: 'center',
                textStyle: {
                    fontWeight: 'normal',
                    color: "#fff",
                    fontSize: 28
                }
            },
            backgroundColor: 'transparent',
            color: [colorStatus, 'rgba(255, 255, 255, 0.2)'],
            tooltip: {
                show: false,
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                show: false,
                itemGap: 12,
                data: ['01', '02']
            },
            toolbox: {
                show: false,
                feature: {
                    mark: {
                        show: true
                    },
                    dataView: {
                        show: true,
                        readOnly: false
                    },
                    restore: {
                        show: true
                    },
                    saveAsImage: {
                        show: true
                    }
                }
            },
            series: [{
                    name: 'Line 1',
                    type: 'pie',
                    clockWise: false,
                    radius: [51, 59],
                    //                color: colorStatus,
                    itemStyle: dataStyle,
                    hoverAnimation: false,

                    data: [{
                            //                    value: rwNum_wc,
                            value: Number(data.sums),
                            name: '01'
                        }, {
                            //                    value: rwNum_all-rwNum_wc,
                            value: rwNum_all - Number(data.sums),
                            name: 'invisible',
                            itemStyle: placeHolderStyle
                        }

                    ]
                }, {
                    name: 'Line 2',
                    type: 'pie',
                    animation: false,
                    clockWise: false,
                    color: 'rgba(255, 255, 255, 0.2)',
                    radius: [68, 66],
                    itemStyle: dataStyle,
                    hoverAnimation: false,
                    tooltip: {
                        show: false
                    },
                    data: [{
                            value: rwNum_all,
                            name: '02',
                            itemStyle: {
                                emphasis: {
                                    color: '#313443'
                                }
                            }
                        }, {
                            value: 0,
                            name: 'invisible',
                            itemStyle: placeHolderStyle
                        }

                    ]
                },


            ]
        };

        return option;
    };

    //    debugger;
    return {
        showEchart: function(dom) {
            var color = "";
            if (data.eventType == 1) {
                color = '#119EFF';
            } else if (data.eventType == 2) {
                color = '#01CBD0';
            } else {
                color = '#FDAF07';
            }
            var myChart = echarts.init(dom);
            var option = getEchartOption(color);
            myChart.setOption(option);
            return myChart;
        }

    };
};


//------------------消息模块-------------------------//
var websocket = null;
var pageId = "communication_show";
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
    if (msg.type == "newCommuDetail") {
        $("#sortField").val(msg.sortField);
        $("#communication_ul").trigger("click");
    } else if (msg.type == "newReplyDetail") {
        $("#reply_ul").trigger("click");
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