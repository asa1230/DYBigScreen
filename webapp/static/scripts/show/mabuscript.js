function bar(id, xData, seriesData,format,col,hue,txt){
	var myChart = echarts.init(document.getElementById(id));
	var dataValue = [];
	var params = {};

	for(var m=0;m<xData.length;m++){
		var params  = {
		        value:seriesData[m],
		        itemStyle:{
		            normal: {
		                color: col[m],
		                label:{
		                	show:true,
		                	position:'top',
		                	formatter:format[m],
		                	textStyle:{
		                		color:hue[m],
		                		fontSize:28,
		                		fontWeight:'normal'
		                	}
		                }
		            }
		        }
		    };
		    
		dataValue.push(params);
	}
	var option = {
		title:{
			show:true,
			text:txt,
			textStyle:{
				color:'#898c94',
				fontWeight:'normal',
				fontSize:26,
				fontFamils:'MicrosoftYaHei'
			},
			left:'8%'
		},
		textStyle:{
	    	color:'#fffefe',
	    	fontSize:36,
	    	fontWeight:'normal'
	    },
	    tooltip : {
	        trigger: 'axis',
	        axisPointer : {
	            type : 'shadow'
	        }
	    },
	    grid: {
	        left: '3%',
	        right: '4%',
	        bottom: '5%',
	        containLabel: true
	    },
	    xAxis : [
	        {
	            type : 'category',
	            data : xData,
	            axisTick: {
	                alignWithLabel: true,
	                lineStyle:{
	                	color:'#999999'
	                }
	            },
	            axisLine:{
	            	lineStyle:{
	            		color:'#999999'
	            	}
	            },
	            axisLabel:{
	            	textStyle:{
			    		color:'#fffefe',
			    		fontSize:24,
			    		fontWeight:'normal'
			    	}
	            }
	           
	        }
	    ],
	    yAxis : [
	        {
	            type : 'value',
	            data:[1000,800,600,400,200,0],
	            axisLine:{
	            	lineStyle:{
	            		color:'#999999'
	            	}
	            },
	            axisLabel:{
	            	textStyle:{
			    		color:'#fffefe',
			    		fontSize:22,
			    		fontWeight:'normal'
			    	}
	            }
	        }
	    ],
	    series :[	    	
	        {
	            name:'',
	            type:'bar',
	            barWidth: '60%',
	            data:dataValue	            	
	        }
	    ]
	};
myChart.setOption(option);
}
