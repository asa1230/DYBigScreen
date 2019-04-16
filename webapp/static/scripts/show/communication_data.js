var isbusy = false; //zhy add


var Communication = function() {
    var c;
    var echartData = {};
    var timer2;
    var selectListMsg = ""; //储存查询需要发送的消息字符串
    var firstTaskGuid = "";
    // var serverUrl = "http://10.10.0.102:9002/dycommunicationserver/";
    // var serverUrl = "http://100.0.0.61:9010/gateway/dycommunicationserver/";
    // var tenantId = window.sessionStorage.getItem("tenantId");
    var tenantId = "dayang.com";
    var token = "ST-53-R4FZlngYZ2eAzdofZd7J-cas";
    var initChart = function(list) {
        var myChart = echarts.init(document.getElementById('echarts_map'));
        var optionData = {
            xData: [],
            yData1: [],
            yData2: []
        };
        $.each(list, function(index, value) {
                // optionData.xData.push(value.date.substr(5));
                optionData.xData.push(value.date);
                optionData.yData1.push(value.commit);
                optionData.yData2.push(value.reply);
            })
            // 指定图表的配置项和数据
        var options = {
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
                    var date = new Date(params.name);
                    var str = "周" + "日一二三四五六".charAt(date.getDay());
                    var result = params[0].name + " " + str + "</br>";
                    params.forEach(function(item) {
                        var date = new Date(item.name);
                        var str = "周" + "日一二三四五六".charAt(date.getDay());
                        result += item.marker + " " + item.seriesName + " : " + item.value + "篇</br>";
                    });
                    return result;
                    /* var date = new Date(params.name);
                    var str = "周" + "日一二三四五六".charAt(date.getDay());
                    var tip = params.name + " " + str;
                    if (params.seriesName == "约稿") {
                        tip += '<span class="flex-box"><span class="blue-circle">' + params.seriesName + '：' + params.data + '篇</span>';
                    } else {
                        tip += '<span class="flex-box"><span class="yellow-circle">' + params.seriesName + '：' + params.data + '篇</span>';
                    }
                    return tip; */
                },
                textStyle: {
                    fontSize: 20,
                    fontFamily: 'MicrosoftYaHei',
                    color: '#fff'
                },
                // backgroundColor: 'rgba(0, 0, 0, 0.5)'
            },
            grid: {
                left: '35px',
                right: '35px',
                bottom: '35px',
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
                        // 格式化成月/日，只在第一个刻度显示年份
                        var date = new Date(value);
                        var str = "周" + "日一二三四五六".charAt(date.getDay());
                        var texts = [(date.getMonth() + 1), date.getDate()];
                        return texts.join('/') + str;
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
                data: optionData.yData1,
                name: '约稿',
                itemStyle: {
                    normal: {
                        color: '#00C9FC',
                        lineStyle: {
                            color: '#00C9FC'
                        },
                        // label : {show: true}  
                    }
                },
                smooth: true,
                showAllSymbol: true, //标注所有数据点
                type: 'line'
            }, {
                name: '供稿',
                itemStyle: {
                    normal: {
                        color: '#F5A623',
                        lineStyle: {
                            color: '#F5A623'
                        },
                        // label : {show: true}  
                    }
                },
                type: 'line',
                smooth: true,
                data: optionData.yData2,
                showAllSymbol: true, //标注所有数据点
            }]
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(options);
        window.onresize = myChart.resize;
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
                    var html = template('total-item', data);
                    $("#total_data").html(html);
                    $("#countTime").html(data.calcTime);
                    initChart(data.list);
                }
            })

        },
        /*  setEchartsList: function(data) {
             var dom = $("#echarts_map").get(0);
             var ec = pageEchart(data);
             ec.showEchart(dom);
         }, */
        timeTrans: function(time) {
            return time.substring(5, 16);
        },
    };
}();

$(function() {
    Communication.init();
});

///计算两个整数的百分比值 
function GetPercent(num, total) {
    num = parseFloat(num);
    total = parseFloat(total);
    if (isNaN(num) || isNaN(total)) {
        return "-";
    }
    return total <= 0 ? "0%" : (Math.round(num / total * 100) + "%");
}

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