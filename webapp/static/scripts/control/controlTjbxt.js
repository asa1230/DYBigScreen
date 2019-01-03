$(function() {
        initDateRangePicker();
});

function selectType(type,type2){
	var msg = {};
	if(type == "columnName"){
		msg.type = "columnName";
		msg.content = $("#columnName").is(':checked');
		send(JSON.stringify(msg));
	}else{
		msg.type = "columnType";
		if(type2 == "wxy"){
			if($("#wxy").is(':checked')){
				msg.value = "wxy";
				msg.content = true;
			}else{
				msg.value = "wxy";
				msg.content = false;
			}
		}else if(type2 == "xy"){
			if($("#xy").is(':checked')){
				msg.value = "xy";
				msg.content = true;
			}else{
				msg.value = "xy";
				msg.content = false;
			}
		}else if(type2 == "zp"){
			if($("#zp").is(':checked')){
				msg.value = "zp";
				msg.content = true;
			}else{
				msg.value = "zp";
				msg.content = false;
			}
		}
		send(JSON.stringify(msg));
	}
}


//初始化 日期范围选择器
function initDateRangePicker() {
    $('.daterange span').html(moment().subtract(30, 'days').format('YYYY-MM-DD') + ' 至 ' + moment().subtract(1, 'days').format('YYYY-MM-DD'));

    $('.daterange').daterangepicker({
        startDate: moment().subtract(30, 'days'),
        endDate: moment().subtract(1, 'days'),
        maxDate: moment().subtract(1, 'days'),
        ranges: {
            '最近7天': [moment().subtract(7, 'days'), moment().subtract(1, 'days')],
            '最近15天': [moment().subtract(15, 'days'), moment().subtract(1, 'days')],
            '最近30天': [moment().subtract(30, 'days'), moment().subtract(1, 'days')]
        },
        locale: {
            applyLabel : '确定',
            cancelLabel : '取消',
            fromLabel : '起始时间',
            toLabel : '结束时间',
            customRangeLabel : '自定义',
            daysOfWeek : [ '日', '一', '二', '三', '四', '五', '六' ],
            monthNames : [ '一月', '二月', '三月', '四月', '五月', '六月',
                '七月', '八月', '九月', '十月', '十一月', '十二月' ],
            firstDay : 1
        }
    }, function(start, end, label) {//格式化日期显示框

        console.log(label);
        console.log(start.format('YYYY/MM/DD')+'--'+end.format('YYYY/MM/DD'));
        var msg = {}
        msg.type = "time";
        msg.content = start.format('YYYY/MM/DD')+'--'+end.format('YYYY/MM/DD');
        send(JSON.stringify(msg));

        var iconCalendar = '<i class="glyphicon glyphicon-calendar fa fa-calendar"></i>';
        var iconCaret = '<b class="caret"></b>';

        this.element.html(iconCalendar + '  <span>' + start.format('YYYY-MM-DD') + ' 至 ' + end.format('YYYY-MM-DD') + '</span> ' + iconCaret);
    });
}


//---------------------------消息发送---------------------------//
var websocket = null;
var pageId = "tj_bxt";
//判断当前浏览器是否支持WebSocket
if('WebSocket' in window){
    websocket = new WebSocket("ws://"+baseUrl+"/DYBigScreen/websocket/"+pageId);
}
else{
    alert('Not support websocket')
}
//连接发生错误的回调方法
websocket.onerror = function(){
    alert("error");
};
 
//连接成功建立的回调方法
websocket.onopen = function(event){
    console.info("open");
}
//连接关闭的回调方法
websocket.onclose = function(){
    console.info("close");
}
//监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function(){
    websocket.close();
}
//关闭连接
function closeWebSocket(){
    websocket.close();
}

//发送消息
function send(message){
    websocket.send(message);
}

