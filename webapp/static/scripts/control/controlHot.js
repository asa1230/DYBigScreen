$(function(){
	init();
});

function init(){
	//1、加载热点信息列表
	loadHotList();
}


//加载热点列表
function loadHotList() {
	var jsonFile= "../../json/hotJson.json"; 		//热点内容
	$.getJSON(jsonFile, function(data){ 
		hotInfo = data;
		//1、加载hot内容
		var html = template('hot-list-item', hotInfo);
		document.getElementById('hot').innerHTML = html;
		
		var html = template('hot2-list-item', hotInfo);
		document.getElementById('hot2').innerHTML = html;
	}); 
	
	var jsonFile= "../../json/commentJson.json"; 	//热点评论
	$.getJSON(jsonFile, function(data){ 
		//2、加载评论内容
		commentInfo = data;
		var html = template('comment-list-item', commentInfo);
		document.getElementById('comment').innerHTML = html;
	}); 
	
}