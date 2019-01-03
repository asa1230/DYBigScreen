/**
 * Created by lgh on 2017/2/28.
 */
var MediaSystem = function() {


    var c;
    var map;
    var activeId;

    return {
        init : function() {
            c = this;
            map = c.initMap();
            c.initViewStyle();
            c.initData();
            c.initEvent();

        },
        /**
         * 初始化地图
         */
        initMap:function(){
        	// 百度地图API功能
			var centerPointLongi   = 116.30088390748081;
			var centerPointLanti   = 40.05704468994807;
			var centerdefaultscale = 19; 				//地图级别,值:19
			var setmaptype         = {mapType:BMAP_NORMAL_MAP};        //地图类型,值:{mapType:BMAP_NORMAL_MAP}
			var pointc = new BMap.Point(centerPointLongi,centerPointLanti);	//指定经纬度创建一个地理点坐标
			var map = new BMap.Map("allmap",setmaptype); // 创建Map实例,
			map.centerAndZoom(pointc, centerdefaultscale);// 初始化地图,设置中心点坐标和地图级别
			map.enableDragging(); //启用地图拖拽,默认状态启用
			map.enableScrollWheelZoom(true); //开启鼠标滚轮缩放
			return map;
        },
       
        /**
         * 初始化页面视图
         */
        initViewStyle:function() {

            $('.cont').css('height',$(window).height()+"px");
            $('.tabList').find('li:nth-child(1)').find('s').show();
            //tab切换功能
            (function() {

                [].slice.call( document.querySelectorAll( '.tabs' ) ).forEach( function( el ) {
                    new mapTabs( el );
                });

            })();
            
            $('.contLists').css('height',($('.cont-right').height()-170)+'px');
	    //列表区滚动条样式
            var innerCont=$('.cont-right').height()-170;
            $('.inner-content').slimScroll({
                height: innerCont,
                size:"10px",
            });
            activeId = $('.content-current').attr('id').split('-')[2];

        },
        /**
         * 初始化数据
         */
        initData : function() {
        	c.initTabDate(1,"ccbn/jsp/clue");
        	c.initTabDate(2,"ccbn/jsp/report");
        	c.initTabDate(3,"ccbn/jsp/select");
        	c.initTabDate(4,"ccbn/jsp/staff");
        	c.initTabDate(5,"ccbn/jsp/device");

        },

        /**
         * 初始化事件
         */
        initEvent : function() {
	   //tab切换样式

            $('.tabList').find('li').on('click',function(){
                if($(this).hasClass('tab-current')){
                    $(this).find('s').show();
                    $(this).siblings().find('s').hide();
                }
            });

            //进入人员详情页
          /*  $('.data-photo').on('click',function(){
                $('.cont-people').show();
                $('.cont-right').hide();
            });*/

            //返回列表页
           /* $('.data-return').on('click',function(){
                $('.cont-people').hide();
                $('.cont-right').show();
            });*/
		    //加载tab详情
			$('.tabList').find('li').on('click',function() {
				activeId = $('.content-current').attr('id').split('-')[2];
				c.showTabMapPoint(activeId);
			});

        },
        //获取初始化Tab数据  1.线索, 2.报题, 3.选题, 4.人员 ,5 设备
        initTabDate: function(type,url){
        	 $.ajax({
                 type : "GET",
                 url : url+"1.json",
                 dataType : "json",
                 success : function(data){
                	 if(type==4){
                		 window.localStorage.setItem("userdetail", JSON.stringify(data));
                	 }
                     var html = template('id_records_list', data);
 					$('#section-iconbox-'+type).find(".contLists").prepend(html);
 					//根据坐标添加地址信息
 					for(var i=0;i<data.records.length;i++){
 						var staff = data.records[i];
 						if(staff.Longitude!=null&&staff.Lantitude!=null){
 							c.setAddress(staff.Longitude,staff.Lantitude,staff.id,type);
 						}
 	        		}
 					
 	                    //调用分页
 	                    laypage({
 	                        cont: "list-pagination"+type,
 	                        pages: data.page_info.total_page,
 	                        skin: 'molv', //皮肤
 	                        first: 1, //将首页显示为数字1,。若不显示，设置false即可
 	                        last: data.page_info.total_page, //将尾页显示为总页数。若不显示，设置false即可
 	                        prev: '<', //若不显示，设置false即可
 	                        next: '>', //若不显示，设置false即可
 	                        groups: 2,//连续显示分页数
 	                        jump: function(e,first){
 	                        	 if(!first){   
 	                        		 var starPage =e.curr;
 	                        		 $.ajax({
 	                        			 async:false,
 	                        			 type : "GET",
 	                        			 url : url+starPage+".json",
 	                        			 dataType : "json",
 	                        			 success : function(data){
 	                        				 if(type==4){
 	                        					 window.localStorage.removeItem("userdetail"); 
 	                                   			 window.localStorage.setItem("userdetail", JSON.stringify(data));
 	                        				 }
 	                        				 $('#section-iconbox-'+type).find(".data-cont").remove();
 	                        				 var html = template('id_records_list', data);
 	                        				 $('#section-iconbox-'+type).find(".contLists").prepend(html);
 	                        				//根据坐标添加地址信息
 	                     					for(var i=0;i<data.records.length;i++){
 	                     						var staff = data.records[i];
 	                     						if(staff.Longitude!=null&&staff.Lantitude!=null){
 	                     							c.setAddress(staff.Longitude,staff.Lantitude,staff.id,type);
 	                     						}
 	                     	        		}
 	                        			 }
 	                        		 });
 	                        	 }    
 	                        }
 	                  });

                 }

             });
        },
        /**
         * 初始化当前列表信息的地址标示
         */
        showTabMapPoint:function(type){
	        if(type==4){
	        	var data = JSON.parse(window.localStorage.getItem("userdetail"));
	        	for(var i=0;i<data.records.length;i++){
	        		var user = data.records[i];
	        		var point  = new BMap.Point(user.Longitude,user.Lantitude);
		        	html =  "<div class='col-md-1 col-lg-1 col-sm-1 col-xs-1 data-left'>" 
	                	  +	"<img src='ccbn/images/blue.png'>"
	                	  + "<a class='data-num'>"+i+1+"</a></div>";
		        	html2 = " <div class='col-md-1 col-lg-1 col-sm-1 col-xs-1'><img src='ccbn/images/blue.png'><a class='data-num'>1</a></div>";
		        	html3="<a class='data-num'>"+i+1+"</a></div>";
		        	var marker = new BMapLib.RichMarker(html2,  point,{"anchor": new BMap.Size(0, 0),"enableDragging" : false});
		        	map.addOverlay(marker); 
	        	}
	        }
        },
        /**
         * 连接按钮
         */
        toConnect:function(workNo){
        	var formData = {
      		   'changerWorkNo' : 1,
     		   'memberWorkNo' : workNo
        	}
        	$.ajax({
	               type : 'POST',
	               async : false,
	               dataType : 'json',
	               url : 'api/quanshi/joinMeeting',
	               contentType : "application/json;charset=UTF-8",
	               data : JSON.stringify(formData),
	               success : function(data) {
	               console.info(JSON.stringify(data));
	               if(data.success){
	               		alert("加入连线成功!");
		       	   }else{
		       		    alert(data.errorDesc);
	  			   }
	           	}
		   });
        },
        /**
         * 跳转人员详情页
         */
        toDetail:function(id){
        	 $('.cont-people').show();
        	 var data = JSON.parse(window.localStorage.getItem("userdetail"));
        	 for(var i=0;i<data.records.length;i++){
        		 var user = data.records[i];
     			if(user.id == id){
     				var html = template('user_toDetail', user);
     				break;
     			}
     		 }
        	 $(".cont-people").html('');
			 $(".cont-people").append(html);
			 var addres = $('#section-iconbox-4').find("#address"+id).text();
			 $(".detail_address").text(addres);
             $('.cont-right').hide();
        },
        toUserList:function(){
        	 $('.cont-people').hide();
             $('.cont-right').show();
        },
       /**
        * 根据坐标获取地址
        */
       setAddress:function(Longitude,Lantitude,id,type){
        	var pt = new BMap.Point(Longitude,Lantitude);
        	var geoc = new BMap.Geocoder();
        	geoc.getLocation(pt, function(rs){
        		var addComp = rs.addressComponents;
        		var address = addComp.city + addComp.district + addComp.street + addComp.streetNumber;
        		$('#section-iconbox-'+type).find("#address"+id).html(address);
        	});  
       },
      contsDetail : function(){
            $('.cont-people').show();
            $('.cont-right').hide();
            $('.details-lists').css('height',($('.cont-people').height-45)+'px');
      },
        

        empty : null
    }
}();
$(MediaSystem.init());
