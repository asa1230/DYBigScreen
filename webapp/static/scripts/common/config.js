var systemConfig = {};

$(function(){
	var path = dp.global.getParamterByCode(dp.global.TOPIC_SERVER,dp.global.tenantId);
	systemConfig.serverPath = path;
	//systemConfig.serverPath = "http://10.10.0.205:8011/newscommand/";
});