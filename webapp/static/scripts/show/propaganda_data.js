var isbusy = false; //zhy add

var PropagandaData = function() {
    var c;
    var echartData = {};
    var timerLine;
    var selectListMsg = ""; //储存查询需要发送的消息字符串
    var firstTaskGuid = "";

    var initChart = function(list) {
        var myChart = echarts.init(document.getElementById('echarts_map'));
        var optionData = {
            xData: [],
            yDataChat: [],
            yDataMicro: [],
            yDataPage: [],
            yDataTv: [],
            yDataToutiao: [],
        };
        var Len = 7;
        /*  $.each(list, function(index, value) {
                 // optionData.xData.push(value.date.substr(5));
                 optionData.xData.push(value.date);
                 optionData.yDataChat.push(value.chat);
                 optionData.yDataMicro.push(value.micro);
                 optionData.yDataPage.push(value.page);
                 optionData.yDataTv.push(value.tv);
                 optionData.yDataToutiao.push(value.toutiao);
             }) */
        for (var i = 0; i < 7; i++) {
            optionData.xData.push(list[i].date);
            optionData.yDataChat.push(list[i].chat);
            optionData.yDataMicro.push(list[i].micro);
            optionData.yDataPage.push(list[i].page);
            optionData.yDataTv.push(list[i].tv);
            optionData.yDataToutiao.push(list[i].toutiao);
        };
        // 指定图表的配置项和数据
        var options = {
            title: {
                text: '选题成果发布渠道',
                textStyle: {
                    fontSize: 26,
                    color: '#fff',
                    align: 'left'
                },
                left: '25px'
            },
            legend: {
                data: [{
                    name: '微信',
                    icon: 'circle',
                    textStyle: {
                        color: ' #A6C9F1',
                        fontSize: 22
                    }
                }, {
                    name: '微博',
                    icon: 'circle',
                    textStyle: {
                        color: ' #A6C9F1',
                        fontSize: 22
                    }
                }, {
                    name: '网页',
                    icon: 'circle',
                    textStyle: {
                        color: ' #A6C9F1',
                        fontSize: 22
                    }
                }, {
                    name: '电视',
                    icon: 'circle',
                    textStyle: {
                        color: ' #A6C9F1',
                        fontSize: 22
                    }
                }, {
                    name: '头条',
                    icon: 'circle',
                    textStyle: {
                        color: ' #A6C9F1',
                        fontSize: 22
                    }
                }],
                right: '25px'
            },
            tooltip: {
                show: true,
                padding: 15,
                trigger: 'axis',
                axisPointer: {
                    type: 'none'
                },
                // formatter: '{b}<br /> 数量:{c}',
                formatter: function(params) {
                    console.log("line:", params)
                    var result = params[0].name + "</br>";
                    params.forEach(function(item) {
                        var str = item.value;
                        if (str.length > 3) {
                            str = str.substring(0, str.length - 3) + "," + str.slice(-3);
                        };
                        result += item.marker + " " + item.seriesName + " : " + str + "篇</br>";
                    });
                    return result;
                },
                textStyle: {
                    fontSize: 20,
                    fontFamily: 'MicrosoftYaHei',
                    color: '#fff'
                },
                // backgroundColor: 'rgba(0, 0, 0, 0.5)'
            },
            grid: {
                left: '25px',
                right: '25px',
                bottom: '0',
                top: '70px',
                containLabel: true
            },
            xAxis: {
                type: 'category',
                data: optionData.xData,
                boundaryGap: false,
                axisLine: {
                    onZero: true,
                    lineStyle: {
                        color: '#A6C9F1'
                    }
                },
                axisLabel: {
                    textStyle: {
                        fontSize: 18,
                        color: '#A6C9F1'
                    },
                    margin: 30,
                    // interval : 0,
                    formatter: function(value, index) {
                        return value.split(" ")[1];
                    }
                }

            },
            yAxis: {
                type: 'value',
                axisLine: {
                    /*   lineStyle: {
                          color: '#A6C9F1',
                      }, */
                    show: false
                },
                position: 'right',
                axisLabel: {
                    textStyle: {
                        fontSize: 20,
                        color: '#A6C9F1'
                    },
                    margin: 50
                },
                splitLine: {
                    lineStyle: {
                        color: '#A6C9F1',
                        type: 'dashed'
                    },
                },
                minInterval: 1,
                splitNumber: 5,
                boundaryGap: [0, '20%']
                    /* min: 0,
                     max: function(value) {
                         return value.max + 5;
                     } */
            },
            series: [{
                data: optionData.yDataChat,
                name: '微信',
                itemStyle: {
                    normal: {
                        color: '#6D80FF',
                        lineStyle: {
                            color: '#6D80FF'
                        },
                        // label : {show: true}  
                    }
                },
                // smooth: true,
                showAllSymbol: true, //标注所有数据点
                type: 'line'
            }, {
                name: '微博',
                itemStyle: {
                    normal: {
                        color: '#6DFF87',
                        lineStyle: {
                            color: '#6DFF87'
                        },
                        // label : {show: true}  
                    }
                },
                type: 'line',
                // smooth: true,
                data: optionData.yDataMicro,
                showAllSymbol: true, //标注所有数据点
            }, {
                name: '网页',
                itemStyle: {
                    normal: {
                        color: '#F3497F',
                        lineStyle: {
                            color: '#F3497F'
                        },
                        // label : {show: true}  
                    }
                },
                type: 'line',
                // smooth: true,
                data: optionData.yDataPage,
                showAllSymbol: true, //标注所有数据点
            }, {
                name: '电视',
                itemStyle: {
                    normal: {
                        color: '#DFEF7D',
                        lineStyle: {
                            color: '#DFEF7D'
                        },
                        // label : {show: true}  
                    }
                },
                type: 'line',
                // smooth: true,
                data: optionData.yDataTv,
                showAllSymbol: true, //标注所有数据点
            }, {
                name: '头条',
                itemStyle: {
                    normal: {
                        color: '#65F5FF',
                        lineStyle: {
                            color: '#65F5FF'
                        },
                        label: { show: true }
                    }
                },
                type: 'line',
                // smooth: true,
                data: optionData.yDataToutiao,
                showAllSymbol: true, //标注所有数据点
            }]
        };
        // 使用刚指定的配置项和数据显示图表。
        var listLen = list.length;
        if (listLen > 7) {
            clearInterval(timerLine);
            timerLine = setInterval(function() {
                optionData.xData.shift();
                optionData.yDataChat.shift();
                optionData.yDataMicro.shift();
                optionData.yDataPage.shift();
                optionData.yDataTv.shift();
                optionData.yDataToutiao.shift();

                optionData.xData.push(list[Len].date);
                optionData.yDataChat.push(list[Len].chat);
                optionData.yDataMicro.push(list[Len].micro);
                optionData.yDataPage.push(list[Len].page);
                optionData.yDataTv.push(list[Len].tv);
                optionData.yDataToutiao.push(list[Len].toutiao);

                myChart.setOption(options);
                window.onresize = myChart.resize;
                Len++;
                if (Len >= listLen) {
                    clearInterval(timerLine);
                    c.initData();
                }
            }, 3000);
        } else {
            myChart.setOption(options);
            window.onresize = myChart.resize;
        }
    };
    return {
        init: function() {
            c = this;
            c.initData();
        },
        initData: function() {
            $.ajax({
                type: 'get',
                url: '../../view/data.json',
                dataType: 'json',
                success: function(data) {
                    console.log("json:", data)
                    var data = data.propaganda;
                    var html = template('total-item', data.week);
                    $("#propa_left").html(html);
                    $("#today_report").html(data.today.total);
                    $("#today_ratio").html(data.today.ratio);
                    $("#today_num").html(data.today.num);
                    initChart(data.list);
                }
            })

        }
    };
}();

$(function() {
    PropagandaData.init();
});

//------------------消息模块-------------------------//
var websocket = null;
var pageId = "communication_show";
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