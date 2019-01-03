<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ include file="/views/include/taglib.jsp"%> --%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	
	<title>资源地图</title>
	
	
</head>

<body id="gps" style="padding:0 !important;">

<style type="text/css">
.locationpic{
	background: url("${ctxStatic}/plugins/img/03-2.png") no-repeat;
	height: 90px;
	width: 90px;
	border: 0px;
	cursor: pointer;
}
</style>


			<!-- ---------------------------ccbnMap-------------------------------- -->
	    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
    <link href="/newsCommand/ccbn/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <link href="/newsCommand/ccbn/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
    <link href="/newsCommand/ccbn/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css" />
    <link href="/newsCommand/ccbn/assets/layouts/layout3/css/layout.min.css" rel="stylesheet" type="text/css" />
    <link href="/newsCommand/ccbn/assets/layouts/layout3/css/themes/default.min.css" rel="stylesheet" type="text/css" id="style_color" />
    <link href="/newsCommand/ccbn/assets/layouts/layout3/css/custom.min.css" rel="stylesheet" type="text/css" />
    <link href="/newsCommand/ccbn/css/ccbnMap_tabs.css" rel="stylesheet" type="text/css">
    <link href="/newsCommand/ccbn/css/ccbnMap_tabstyles.css" rel="stylesheet" type="text/css">
    <link href="/newsCommand/ccbn/css/ccbnMap_index.css" rel="stylesheet" type="text/css"> 
    <style type="text/css">
    	/* 防止modal遮罩取消后移动body */
    	body.modal-open {
			overflow-y: auto !important;
			padding-right: 0 !important;
		}
		body {
    		padding-right:0!important;
		}
		/* 去掉baidu logo */
		    .BMap_cpyCtrl  
        {  
            display:none;   
        }  
	        .anchorBL{  
	            display:none;   
        }   
    </style>
	<!-- ---------------------------ccbnMap-------------------------------- -->
        <div class="container cont" style="height:860px;">
        	<div id="allmap" class="col-md-10" style="height: 860px;width:100%;position: relative;">
	 		</div>
	 		<div class="my-map">
	 				<div id="r-result">
						<div class="input-icon  myInput" style="width: 310px">
							<i class="fa"></i><input type="text" id="suggestId" placeholder="输入地址，快速定位！" size="20"style="width: 300px;" class="form-control"autocomplete="off">
						</div>
					</div>
					<div id="searchResultPanel" style="border:1px solid #C0C0C0;width:150px;height:150px;display:none;"></div>
			</div> 
	 		<!-- Modal -->
			<div class="modal fade right" id="xuantiClick" tabindex="-1"
				role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-keyboard="false"
				data-backdrop="static">
				<div class="modal-dialog"
					style="width: 80%; margin-left: 20%; margin-right: 100%; height: 80%">
					<span class="btn-clipboard glyphicon glyphicon-remove-circle" id="xuantiClose" data-dismiss ="modal"></span>
					<div class="modal-content">

						<div class="modal-body" id="xuantiModel"
							style="max-height: 1300px; overflow-y: auto;"></div>

					</div>
				</div>
			</div>
				<!--任务详情 Modal -->
			<div class="modal fade" id="inXuantiSonTaskContent" tabindex="-1"
				role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">
								<span id="sontaskChangeManSpan"></span>
							</h4>
						</div>
						<div class="modal-body" style="max-height: 1000px; overflow-y: auto;">
			
							<div class="zhdd-tanchu1" style="height: 400">
			
								<span id="sontaskDeviceSpan"></span><br> <span
									id="sontaskPeopleSpan"></span><br> <br>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span
									id="sontaskContentSpan"></span>
							</div>
			
						</div>
						<div class="modal-footer">
							<button type="button" id="frameclose" class="btn btn-default"
								data-dismiss="modal">确认</button>
						</div>
					</div>
				</div>
			</div>
			
            <div class="cont-right">
                <section class="map-tabs">
                    <div class="tabs tabs-style-iconbox">
                        <nav>
                            <ul class="tabList">
                                <li>
                                    <a href="#section-iconbox-1" class="tab-current">
                                        <span>线索</span>
                                    </a>
                                    <s>
                                        <i class="i_tip"></i>
                                    </s>
                                </li>
                                <li>
                                    <a href="#section-iconbox-2">
                                        <span>报题</span>
                                    </a>
                                    <s>
                                        <i class="i_tip"></i>
                                    </s>
                                </li>
                                <li>
                                    <a href="#section-iconbox-2">
                                        <span>选题</span>
                                    </a>
                                    <s>
                                        <i class="i_tip"></i>
                                    </s>
                                </li>
                                <li>
                                    <a href="#section-iconbox-2">
                                        <span>人员</span>
                                    </a>
                                    <s>
                                        <i class="i_tip"></i>
                                    </s>
                                </li>
                                <li>
                                    <a href="#section-iconbox-2">
                                        <span>设备</span>
                                    </a>
                                    <s>
                                        <i class="i_tip"></i>
                                    </s>
                                </li>
                            </ul>
                        </nav>
                        <div class="content-wrap">
                            <section id="section-iconbox-1">
                                <div class="searchDiv">
                                    <div class="col-md-3 col-lg-3 col-sm-3 col-xs-3 selectDiv">
                                        <select id="select2-single-input-sm" class="form-control select2-multiple" >
                                            <optgroup>
                                                <option selected="selected" value="all">全部</option>
                                                <option value="1">已选用</option>
                                                <option value="0">未选用</option>
                                            </optgroup>
                                        </select>
                                    </div>
                                    <div class="col-md-9 col-lg-9 col-sm-9 col-xs-9 searchBtn">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="">
                                            <span class="input-group-addon">
                                                <i class="fa fa-search"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="data-check">
                                    <label class="mt-checkbox mt-checkbox-outline">
                                        <input type="checkbox"> 小图标提示其他资源
                                        <span></span>
                                    </label>
                                </div>
                                <!--数据列表-->
                                <div class="row contLists"></div>
                                <!--分页-->
                                <div id="list-pagination1"></div>
                            </section>
                            <section id="section-iconbox-2">
                                <div class="searchDiv">
                                    <div class="col-md-3 col-lg-3 col-sm-3 col-xs-3 selectDiv">
                                        <select id="select2-single-input-sm" class="form-control select2-multiple" >
                                            <optgroup>
                                                <option selected="selected" value="all">全部</option>
                                                <option value="101">已提交</option>
                                                <option value="103">全部选用</option>
                                                <option value="102">部分选用</option>
                                                <option value="104">退回</option>
                                            </optgroup>
                                        </select>
                                    </div>
                                    <div class="col-md-9 col-lg-9 col-sm-9 col-xs-9 searchBtn">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="">
                                            <span class="input-group-addon">
                                                <i class="fa fa-search"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="data-check">
                                    <label class="mt-checkbox mt-checkbox-outline">
                                        <input type="checkbox"> 小图标提示其他资源
                                        <span></span>
                                    </label>
                                </div>
                                <!--数据列表-->
                                <div class="row contLists"></div>
                                <!--分页-->
                                <div id="list-pagination2"></div>
                            </section>
                            <section id="section-iconbox-3">
                                <div class="searchDiv">
                                    <div class="col-md-3 col-lg-3 col-sm-3 col-xs-3 selectDiv">
                                        <select id="select2-single-input-sm" class="form-control select2-multiple" >
                                            <optgroup>
                                                <option selected="selected" value="all">全部</option>
                                                <option value="1">已完成</option>
                                                <option value="0">进行中</option>
                                                <option value="2">已终止</option>
                                                <option value="104">未指派</option>
                                                <option value="8">保存</option>
                                            </optgroup>
                                        </select>
                                    </div>
                                    <div class="col-md-9 col-lg-9 col-sm-9 col-xs-9 searchBtn">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="">
                                            <span class="input-group-addon">
                                                <i class="fa fa-search"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="data-check">
                                    <label class="mt-checkbox mt-checkbox-outline">
                                        <input type="checkbox"> 小图标提示其他资源
                                        <span></span>
                                    </label>
                                </div>
                                <!--数据列表-->
                                <div class="row contLists"></div>
                                <!--分页-->
                                <div id="list-pagination3"></div>
                            </section>
                            <section id="section-iconbox-4">
                                <div class="searchDiv">
                                    <div class="col-md-3 col-lg-3 col-sm-3 col-xs-3 selectDiv">
                                        <select id="select2-single-input-sm" class="form-control select2-multiple" >
                                            <optgroup>
                                                <option value="all">全部</option>
                                                <option selected="selected" value="0">在线</option>
                                                <option value="1">离线</option>
                                            </optgroup>
                                        </select>
                                    </div>
                                    <div class="col-md-9 col-lg-9 col-sm-9 col-xs-9 searchBtn">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="">
                                            <span class="input-group-addon">
                                                <i class="fa fa-search"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="data-check">
                                    <label class="mt-checkbox mt-checkbox-outline">
                                        <input type="checkbox"> 小图标提示其他资源
                                        <span></span>
                                    </label>
                                </div>
                                <!--数据列表-->
                                <div class="row contLists"></div>
                                <!--分页-->
                                <div id="list-pagination4"></div>
                            </section>
                            <section id="section-iconbox-5">
                                <div class="searchDiv">
                                    <div class="col-md-3 col-lg-3 col-sm-3 col-xs-3 selectDiv">
                                        <select id="select2-single-input-sm" class="form-control select2-multiple" >
                                            <optgroup>
                                                <option value="all">全部</option>
                                                <option selected="selected" value="0">在线</option>
                                                <option value="1">离线</option>
                                            </optgroup>
                                        </select>
                                    </div>
                                    <div class="col-md-9 col-lg-9 col-sm-9 col-xs-9 searchBtn">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="">
                                            <span class="input-group-addon">
                                                <i class="fa fa-search"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="data-check">
                                    <label class="mt-checkbox mt-checkbox-outline">
                                        <input type="checkbox"> 小图标提示其他资源
                                        <span></span>
                                    </label>
                                </div>
                                <!--数据列表-->
                               	<c:if test="${swichCarCZ==1}">
									<div class="row contListsCz"></div>
								</c:if>
								<c:if test="${swichCarCZ!=1}">
									<div class="row contLists"></div>
								</c:if>
                                <!--分页-->
                                <div id="list-pagination5"></div>

                            </section>
                        </div><!-- /content -->
                    </div><!-- /tabs -->
                </section>
            </div>
            <div class="cont-people">
            </div>
        </div>
         <div class='box-shadow'></div>
				<div class="boxAlert">
				<span class="alertTitle"></span>
			</div>
<!--[if lt IE 9]>
<script src="/newsCommand/ccbn/assets/global/plugins/respond.min.js"></script>
<script src="/newsCommand/ccbn/assets/global/plugins/excanvas.min.js"></script>
<script src="/newsCommand/ccbn/assets/global/plugins/ie8.fix.min.js"></script>
<![endif]-->
<!-- BEGIN CORE PLUGINS -->
<script src="/newsCommand/ccbn/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script><!--滚动条-->
<script src="/newsCommand/ccbn/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script><!--遮罩 http://bookshadow.com/weblog/2014/09/26/jquery-blockui-js-introduction/-->
<script src="/newsCommand/ccbn/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script><!--开关样式-->
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->

<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="/newsCommand/ccbn/assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="/newsCommand/ccbn/assets/global/plugins/select2/js/select2.full.min.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/assets/pages/scripts/components-select2.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script src="/newsCommand/ccbn/assets/layouts/layout3/scripts/layout.min.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/assets/layouts/layout3/scripts/demo.min.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/assets/layouts/global/scripts/quick-nav.min.js" type="text/javascript"></script>
<!-- END THEME LAYOUT SCRIPTS -->
<script src="/newsCommand/ccbn/assets/global/plugins/bootstrap-select/js/bootstrap-select.min.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/assets/pages/scripts/components-bootstrap-select.min.js" type="text/javascript"></script>


<!-- BEGIN THEME INDEX SCRIPTS -->
<script src="/newsCommand/ccbn/js/modernizr.custom.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/js/mapTabs.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/laypage/laypage.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/aui-artTemplate/template.js" type="text/javascript"></script>
<script id="id_records_list" type="text/html">
    {{each records as data i}}
        <div class="data-cont">
            <div class="col-md-1 col-lg-1 col-sm-1 col-xs-1 data-left" >
                <img class="mapicon1_{{data.id}}" src="/newsCommand/ccbn/images/blue.png">
                <a class="data-num" style="margin-left:-4px;cursor: pointer;" onclick="javascript:MediaSystem.focusPoint('{{data.Longitude}}','{{data.Lantitude}}')">{{i+1}}</a>
            </div>

            {{if data.imgUrl != '' && data.imgUrl != null}}
                <div class="col-md-9 col-lg-9 col-sm-9 col-xs-9 data-center">
            {{else}}
                <div class="col-md-11 col-lg-11 col-sm-11 col-xs-11 data-center">
            {{/if}}
                <p class="data-title" title="{{data.title}}">{{data.title}}</p>
                <p>当前状态&nbsp;&nbsp;:&nbsp;&nbsp;<span><a class="state_type_{{data.stateType}}"></a>&nbsp;&nbsp;{{data.state}}</span></p>
                <p id = "address{{data.id}}"></p>
            </div>
            {{if data.imgUrl != '' && data.imgUrl != null}}
                <div class="col-md-2 col-lg-2 col-sm-2 col-xs-2 data-right">
                    <div>
                        <img src="{{data.imgUrl}}" class="data-photo" onclick="javascript:MediaSystem.toDetail('{{data.id}}')">
                    </div>
                </div>
            {{/if}}
        </div>
    {{/each}}
</script>

<script id="user_toDetail" type="text/html">
	<div class="data-details">
                    <div class="fa-item data-return" onclick="javascript:MediaSystem.toUserList()">
                        <i class="fa fa-mail-reply"></i>
                    </div>
                    <span class="details-title">人员详情</span>
                </div>
                <div class="details-lists">
                    <div class="people-details">
                        <div class="detail-photo">
                            <img src="{{imgUrl}}" class="details-photo">
                        </div>
                        <div class="people-lists">
                            <p>{{title}}</p>
                            <p>联系方式&nbsp;&nbsp;:&nbsp;&nbsp;<span class="userDetail_span_1">{{phone}}</span></p>
                        </div>

                    </div>
                    <div class="state-lists">
                        <p>当前状态&nbsp;&nbsp;:&nbsp;&nbsp;<span><a class="state_type_{{stateType}}"></a>&nbsp;&nbsp;{{state}}</span></p>
                        <p class="detail_address"></p>
						<p>携带设备&nbsp;&nbsp;:&nbsp;&nbsp;<span>{{deviceName}}</span></p>
							<table class="user_task_select_table">
								<tr>
									<td><p>任     务 : </p></td>
									<td>
										<span class="userDetail_span_2">
											{{each curTaskList as data i}}
							 					<span class='select_task_title' title="{{data.title}}">{{data.title}}</span>
											{{/each}}
										</span>
									</td>
								</tr>
							</table>
							<table class="user_task_select_table">
								<tr>
									<td><p>选     题 : </p></td>
									<td>
										<span class="userDetail_span_3">
											{{each curSelectList as data i}}
							 					<a data-toggle="modal" data-target="#xuantiClick" title="{{data.title}}"  onclick="javascript:MediaSystem.onXuantiByid('{{data.taskGuid}}')"  style="cursor: pointer;color: #337ab7;"><span class='select_task_title'>{{data.title}}</span></a>
											{{/each}}
										</span>
									</td>
								</tr>
							</table>
                    </div>
					<div  class="onLineDiv" style="height:100px;text-align:right;display:none">
					 		<input style="margin-top:25px;"  type="button" class ="btn btn-info" value="连线" onclick="javascript:MediaSystem.toConnect('{{title}}')">
					</div>
                </div>
</script>
<script id="car_listCZ" type="text/html">
    {{each records as data i}}
        <div class="data-cont">
            <div class="col-md-1 col-lg-1 col-sm-1 col-xs-1 data-left" >
                <img class="mapicon1_{{data.id}}" src="/newsCommand/ccbn/images/blue.png">
                <a class="data-num" style="margin-left:-4px;cursor: pointer;">{{i+1}}</a>
            </div>

            {{if data.imgUrl != '' && data.imgUrl != null}}
                <div class="col-md-9 col-lg-9 col-sm-9 col-xs-9 data-center">
            {{else}}
                <div class="col-md-11 col-lg-11 col-sm-11 col-xs-11 data-center">
            {{/if}}
                <p class="data-title" title="{{data.title}}">{{data.car}}&nbsp;-&nbsp;{{data.statusinfo}}</p>
				<p>栏目：{{data.department}}&nbsp;-&nbsp;时间：{{data.timestart}}<p>
				<p>司机：{{data.driver}}&nbsp;-&nbsp;地址：{{data.adddr}}<p>
            </div>
        </div>
    {{/each}}
</script>
<script src="${ctxStatic}/plugins/bootstrap/js/jquery.bootstrap-growl.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=u75wSbW0md3GMbvevqrbDObv"></script>
<script type="text/javascript" src="/newsCommand/ccbn/js/RichMarker_min.js"></script>
<script type="text/javascript" src="/newsCommand/ccbn/js/InfoBox_min.js"></script>
<script src="/newsCommand/ccbn/js/ccbnMap.js" type="text/javascript"></script>
<script src="/newsCommand/ccbn/js/Utils.js" type="text/javascript"></script>
<!-- END THEME INDEX SCRIPTS -->

</body>
</html>

