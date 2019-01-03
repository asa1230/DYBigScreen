package com.dayang.newmedia.newscommand.ws.commandapp.test;

import com.dayang.newmedia.common.utils.HttpClientUtil;
import com.dayang.newmedia.common.utils.MyConfigReader;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.model.enums.XUANTISTATES;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 指挥调度APP测试样例
 * @author luomeng
 *
 */
public class Test {
	
	public static void main(String[] args) throws Exception {
		//login();
		//getUserInfoTest();
		//queryClueWithHJTest();
		//queryClueWithCRETest();
		//queryClueByIdWithHJTest();
		//queryClueByIdWithCRETest();
		//saveBaotiFirstTest();
		//saveBaotiMoreTest();
		//submitBaotiFirstTest();
		//updateSubmitedBaotiTest();
		//submitSavedBaotiTest();
		//queryUserListTest();
//		queryAllXuantiTest();
		//queryMyXuantiTest();
		//querySavedXuantiByIdTest();
//		querySubmitedXuantiByIdTest();
		//querySavedXuantiByIdAndTypeTest();
		//querySubmitedXuantiByIdAndTypeTest();
		//saveXuanTiFirstTest();
		//saveXuanTiMoreTest();
		//submitXuanTiFirstNoChargeMan();
		//submitXuanTiFirstWithChargeMan();
		//submitXuanTiFromSave();
		//submitXuanTiWithBaoTi();
		//updateXuantiGroupTest();
		//updateXuantiGroupWithFolderName();
		//updateXuantiGroupWithFolder();
		//addXuantiGroupResourceWithHJ();
		//addXuantiGroupResourceWithCRE();
		//System.out.println(StringUtils.CreateGuid());
		//deleteSavedXuantiTest();
		//deleteSavedXuantiTest();
		//deleteSubmitXuantiTest();
		//queryMissionTaskTest();
//		querySwitchSettingValueByType();
		
		//queryServerUrl();
		
		testConfigHandle();
	}
	
	private static void testConfigHandle(){
		
		MyConfigReader paramcfg = MyConfigReader.getParam();		
		String val = paramcfg.val("todayselect.switchfrequency");
		System.out.println(val);
		
		String newVal = "80";
		boolean ret = paramcfg.saveVal("todayselect.switchfrequency",newVal);
		System.out.println(ret);

	}

	private static void queryServerUrl(){
//		String type = "31";
		String url = "http://localhost:9999/DYBigScreen/api/user/queryServerUrl?type=31";
//		String fullPath = StringUtils.combineUrl(url, type);
		JSONObject resultJson = HttpClientUtil.httpGet(url);
		System.out.println(resultJson);
	}
	/**
	 * 
	 */
	private static void querySwitchSettingValueByType(){
		String type = "7";
		String url = "http://localhost:8888/DYNewsCommandMobile/api/swichSettings";
		String fullPath = StringUtils.combineUrl(url, type);
		JSONObject resultJson = HttpClientUtil.httpGet(fullPath);
		System.out.println(resultJson);
	}
	
	public static void queryMissionTaskTest() throws Exception{
		String url = "http://localhost:8888/DYNewsCommandMobile/api/queryMissionTask";
		
		JSONObject jsonParam = new JSONObject();
		jsonParam.put("userId", "3333");
		jsonParam.put("queryModel", 0);
//		jsonParam.put("searchContent", "");
		jsonParam.put("start", 1);
		jsonParam.put("limit", 10);
		String result = HttpClientUtil.httpPost(url, jsonParam, "application/json");
		System.out.println(result);
	}
	
	/**
	 * 用户登陆
	 * @throws Exception
	 * @author luomeng
	 */
	public static void login() throws Exception{
		String url = "http://localhost:31999/DYNewsCommandMobile/api/user/login";
		JSONObject jsonParam = new JSONObject();
		jsonParam.put("userId", "0016");
		jsonParam.put("password", "0016");
		String result = HttpClientUtil.httpPost(url, jsonParam, "application/json");
		System.out.println(result);
	}
	
	/**
	 * 获取用户详情
	 * @throws Exception
	 * @author luomeng
	 */
	public static void  getUserInfoTest() throws Exception{
		String url = "http://100.0.1.61:31999/DYNewsCommandMobile/api/user/getUserInfo";
		JSONObject jsonParam = new JSONObject();
		jsonParam.put("userId", "jb");
		jsonParam.put("token", "2112312312");
		String result = HttpClientUtil.httpPost(url, jsonParam, "application/json");
		System.out.println(result);
	}
	
	/**
	 * 查询汇聚线索
	 * @author luomeng
	 * @throws Exception 
	 */
	public static void queryClueWithHJTest() throws Exception{
		String url = "http://localhost:8888/DYBigScreen/api/queryClue";
		//(1：微博,2：微信,3：网站,4：随心拍,5：短信,6：电话,7：其它录入资源
		JSONObject jsonParam = new JSONObject();
		jsonParam.put("resourceOriginType", 4);
		//jsonParam.put("searchContent","罗蒙测试");
		jsonParam.put("start", 1);
		jsonParam.put("limit", 8);
		String result = HttpClientUtil.httpPost(url, jsonParam, "application/json");
		System.out.println(result);
	}
	
	/**
	 * 查询CRE线索
	 * @throws Exception
	 * @author luomeng
	 */
	public static void queryClueWithCRETest() throws Exception{
		String url = "http://localhost:31999/DYNewsCommandMobile/api/queryClue";
		JSONObject jsonParam = new JSONObject();
		jsonParam.put("queryModel", 1);
		jsonParam.put("searchContent","NBA总决赛");
		jsonParam.put("start", 0);
		jsonParam.put("limit", 30);
		String result = HttpClientUtil.httpPost(url, jsonParam, "application/json");
		System.out.println(result);
	}
	
	/**
	 * 根据资源ID查看汇聚线索详情
	 * @author luomeng
	 * @throws Exception 
	 */
	public static void queryClueByIdWithHJTest() throws Exception{
		String url = "http://localhost:8888/DYBigScreen/api/queryClueById";
		JSONObject paramJson = new JSONObject();
		paramJson.put("resourceGuid", "8cd9793c-0245-4410-a5d1-7e1a12b4d62e");
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 根据资源ID查看CRE线索详情
	 * @throws Exception 
	 */
	public static void queryClueByIdWithCRETest() throws Exception{
		String url = "http://localhost:31999/DYNewsCommandMobile/api/queryClueById";
		JSONObject paramJson = new JSONObject();
		paramJson.put("queryModel", "1");
		paramJson.put("resourceGuid", "B9132159-6ECA-4F18-B60F-7DBC4796B187");
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 第一次保存报题任务
	 * @throws Exception 
	 */
	public static void saveBaotiFirstTest() throws Exception {
		String url = "http://localhost:31999/DYNewsCommandMobile/api/addBaoti";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "93cd277d-bb12-459c-af9b-3f7b53ad529f");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "2239cdfa-e14e-4535-8af3-9d4503d2d41b");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "3339cdfa-e14e-4535-8af3-9d4503d2d41b");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/3339cdfa-e14e-4535-8af3-9d4503d2d41b/1.jpg");
		//array.add(hjResource);
		//array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("title","保存报题消息通知");
		paramJson.put("creater", "0127");
		paramJson.put("ownColumn", "999888");
		paramJson.put("taskStatus", 8);
		paramJson.put("resourceList", array);
		
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 更新保存的报题任务，但不是提交
	 * @throws Exception 
	 */
	public static void saveBaotiMoreTest() throws Exception {
		String url = "http://localhost:31999/DYCommandService/api/addBaoti";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "92168648-f2b1-4c4e-9149-6e7b12c6699d");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "2239cdfa-e14e-4535-8af3-9d4503d2d41b");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "3112121212121212121212");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/3112121212121212121212/1f8c8c18367adab45743d06d88d4b31c8601e4a7.jpg");
		array.add(hjResource);
		array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid","549f5e5e-199a-40fa-8ad9-a107f1c6c78a");
		paramJson.put("content", "修改了保存状态下正文内容!");
		paramJson.put("title","修改保存状态的标题内容！");
		// 用户名必须在
		//paramJson.put("creater", "0127");
		//paramJson.put("ownColumn", "999888");
		paramJson.put("taskStatus", 8);
		paramJson.put("resourceList", array);
		
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 第一次提交报题任务
	 * @throws Exception 
	 */
	public static void submitBaotiFirstTest() throws Exception {
		String url = "http://localhost:31999/DYNewsCommandMobile/api/addBaoti";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "671119a9-73f6-414b-9fe0-35a1344b4434");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "2239cdfa-e14e-4535-8af3-9d4503d2d41b");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "ccccccccccccccc");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/ccccccccccccccc/1-moov_2_20150824095140.mp4");
		//array.add(hjResource);
		//array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("title","添加报题消息通知");
		paramJson.put("creater", "0127");
		paramJson.put("ownColumn", "999888");
		paramJson.put("taskStatus", 0);
		paramJson.put("resourceList", array);
		
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 更新已经提交过的报题任务
	 * @throws Exception 
	 */
	public static void updateSubmitedBaotiTest() throws Exception{
		String url = "http://localhost:31999/DYNewsCommandMobile/api/addBaoti";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "9cd9a32a-3fa0-43f6-9935-d69c6e872298");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "2239cdfa-e14e-4535-8af3-9d4503d2d41b");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "3339cdfa-e14e-4535-8af3-9d450aa2a41b");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/3339cdfa-e14e-4535-8af3-9d450aa2a41b/20160309094306.mp4");
		//array.add(hjResource);
		//array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid","ab4ea04f-4aa2-4144-971f-d38ca3aa48fc");
		paramJson.put("content", "修改已经提交了的选题");
		paramJson.put("title","修改已经提交了的选题的标题!");
		//paramJson.put("creater", "0127");
		//paramJson.put("ownColumn", "999888");
		//paramJson.put("taskStatus", 0);
		//paramJson.put("resourceList", array);
		
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 提交报题任务，该报题任务是从保存（草稿）报题，来进行提交的
	 * @throws Exception 
	 */
	public static void submitSavedBaotiTest() throws Exception{
		String url = "http://localhost:31999/DYCommandService/api/addBaoti";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "594e2d35-0d41-4c75-b44c-67262482900a");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "2239cdfa-e14e-4535-8af3-9d4503d2d41b");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "tttttttttttttttttttttttttt");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/tttttttttttttttttttttttttt/20160309094257.jpg");
		array.add(hjResource);
		array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid","ebda04a4-d741-4575-84db-9e902e324f5e");
		paramJson.put("content", "我是从草稿状态提交过来的！！");
		paramJson.put("title","该资源是范德萨范德萨保存过来的提交");
		// 用户名必须在
		//paramJson.put("creater", "0127");
		//paramJson.put("ownColumn", "999888");
		paramJson.put("taskStatus", 0);
		//paramJson.put("resourceList", array);
		
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	private static void queryUserListTest() {
		String url = "http://localhost:31999/DYNewsCommandMobile/api/usercolumn";
		String userId = "0002";
		String fullPath = StringUtils.combineUrl(url, userId);
		JSONObject resultJson = HttpClientUtil.httpGet(fullPath);
		System.out.println(resultJson);
	}
	
	/**
	 * 查询全部选题
	 * @throws Exception
	 */
	public static void queryAllXuantiTest() throws Exception {
		String url = "http://localhost:8888/DYBigScreen/api/queryXuanti";
		JSONObject paramJson = new JSONObject();
//		paramJson.put("chargetMan", "0016");
//		paramJson.put("inPeople", "0012");
//		paramJson.put("creater", "0012");
//		paramJson.put("taskTitle", "测试");
//		paramJson.put("taskContent", "巴黎");
//		paramJson.put("ownColumn", "法制栏目");
//		paramJson.put("xuantiState", "1");
		paramJson.put("start", 0);
		paramJson.put("limit", 8);
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 查询我的选题
	 * @throws Exception
	 */
	public static void queryMyXuantiTest() throws Exception {
		String url = "http://localhost:31999/DYNewsCommandMobile/api/queryXuanti";
		JSONObject paramJson = new JSONObject();
		paramJson.put("userId", "0016");
		paramJson.put("queryModel", 1);
		//paramJson.put("searchContent", "萝卜大哥哥");
		paramJson.put("start", 0);
		paramJson.put("limit", 5);
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 根据ID查询保存状态下的选题
	 */
	private static void querySavedXuantiByIdTest(){
		String id = "0e36392a-0f9c-4c8d-825f-0e3991aad970";
		String url = "http://localhost:31999/DYCommandService/api/xuanti";
		String fullPath = StringUtils.combineUrl(url, id);
		JSONObject resultJson = HttpClientUtil.httpGet(fullPath);
		System.out.println(resultJson);
	}
	
	/**
	 * 根据选题ID获取选题详情
	 */
	private static void querySubmitedXuantiByIdTest() {
		String id = "7c6b2a66-db63-4852-80ff-2516c82592b7";
		String url = "http://localhost:8888/DYBigScreen/api/xuanti";
		String fullPath = StringUtils.combineUrl(url, id);
		JSONObject resultJson = HttpClientUtil.httpGet(fullPath);
		System.out.println(resultJson);
	}
	
	/**
	 * 根据选题ID查询保存状态下的选题下面挂载的资源
	 */
	private static void querySavedXuantiByIdAndTypeTest(){
		String id = "417bd991-4c67-480b-bfed-998117ecae98";
		String url = "http://localhost:8888/DYNewsCommandMobile/api/queryXuantiByIdAndType";
		String fullPath = StringUtils.combineUrl(url, id);
		JSONObject resultJson = HttpClientUtil.httpGet(fullPath);
		System.out.println(resultJson);
	}
	
	/**
	 * 根据选题ID查询提交状态下的选题下面挂载的资源
	 */
	private static void querySubmitedXuantiByIdAndTypeTest() {
		String id = "417bd991-4c67-480b-bfed-998117ecae98";
		String url = "http://localhost:8888/DYNewsCommandMobile/api/queryXuantiByIdAndType?id=";
		String fullPath = url + id + "&type=0";
		JSONObject resultJson = HttpClientUtil.httpGet(fullPath);
		System.out.println(resultJson);
	}
	
	/**
	 * 第一次保存选题
	 * @throws Exception 
	 */
	public static void saveXuanTiFirstTest() throws Exception {
		// TODO Auto-generated method stub
		String url="http://localhost:31999/DYCommandService/api/addXuanTi";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "4e88cd40-287f-4533-9d7a-76ed9d4fb086");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "2239cdfa-e14e-4535-8af3-9d4503d2d41b");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "0dc971a2-0325-4ea3-8900-a298a1af979f");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/0dc971a2-0325-4ea3-8900-a298a1af979f/1.mp4");
		array.add(hjResource);
		array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid","");
		//paramJson.put("content", "罗蒙第一次保存选题资源，并且带本地资源");
		paramJson.put("title","萝卜大哥");
		paramJson.put("creater", "0016");
		paramJson.put("ownColumn", "999888");
		//paramJson.put("chargeMan", "0127");
		//paramJson.put("inPeople", "姜博,孙桂双");
		paramJson.put("taskStatus", 2);
		paramJson.put("status", 104);
		paramJson.put("resourceList", array);
		
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
		
	}
	
	/**
	 * 多次保存选题
	 * @throws Exception 
	 */
	public static void saveXuanTiMoreTest() throws Exception{
		// TODO Auto-generated method stub
		String url="http://localhost:31999/DYCommandService/api/addXuanTi";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "9ce90dcb-52de-4134-9d06-f9fbeef14be1");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "2239cdfa-e14e-4535-8af3-9d4503d2d41b");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "126ec7ae-b8b1-48cf-b560-dd186a062300");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/126ec7ae-b8b1-48cf-b560-dd186a062300/1.mp4");
		array.add(hjResource);
		array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid","1f605b7a-8b1f-420b-835a-dee93ac239ce");
		paramJson.put("content", "罗蒙在修改保存状态下的选题资源");
		paramJson.put("title","罗蒙正在修改选题标题");
		paramJson.put("creater", "0016");
		paramJson.put("ownColumn", "999888");
		paramJson.put("chargeMan", "0127");
		paramJson.put("inPeople", "姜博");
		paramJson.put("taskStatus", 2);
		paramJson.put("status", 8);
		paramJson.put("resourceList", array);
			
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 第一次提交选题，未指派负责人
	 * @throws Exception 
	 */
	public static void submitXuanTiFirstNoChargeMan() throws Exception{
		String url="http://localhost:31999/DYCommandService/api/addXuanTi";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "9ce90dcb-52de-4134-9d06-f9fbeef14be1");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "00270CA2-1BCA-4A5F-8B15-EAB11B2370CD");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "126ec7ae-b8b1-48cf-b560-dd186a062300");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/126ec7ae-b8b1-48cf-b560-dd186a062300/1.mp4");
		array.add(hjResource);
		array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid","");
		paramJson.put("content", "罗蒙测试选题目录，资源分发");
		paramJson.put("title","罗蒙测试选题目录，资源分发");
		paramJson.put("creater", "0016");
		paramJson.put("ownColumn", "999888");
		//paramJson.put("chargeMan", "0127");
		//paramJson.put("inPeople", "姜博");
		paramJson.put("taskStatus", 2);
		paramJson.put("status", 104);
		paramJson.put("resourceList", array);
			
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 第一次提交选题，指派了负责人
	 * @throws Exception 
	 */
	public static void submitXuanTiFirstWithChargeMan() throws Exception{
		String url="http://localhost:31999/DYNewsCommandMobile/api/addXuanTi";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "3d56f2f9-aec0-418d-861b-ae4cdc1cc281");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "B9132159-6ECA-4F18-B60F-7DBC4796B187");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "zhangsandasfdsfsd3");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/zhangsandasfdsfsd3/1-moov_2_20150824095140.mp4");
		array.add(hjResource);
		array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid","");
		paramJson.put("content", "111");
		paramJson.put("title","联调saveas接口接口接口接口");
		paramJson.put("creater", "0127");
		paramJson.put("ownColumn", "999888");
		paramJson.put("chargeMan", "0127");
		paramJson.put("inPeople", "wjh,lbx");
		paramJson.put("taskStatus", 2);
		paramJson.put("status", 104);
		paramJson.put("resourceList", array);
		
			
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 从保存状态到提交选题，未指派负责人
	 * @throws Exception 
	 */
	public static void submitXuanTiFromSave() throws Exception{
		String url="http://localhost:31999/DYNewsCommandMobile/api/addXuanTi";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "9ce90dcb-52de-4134-9d06-f9fbeef14be1");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "00270CA2-1BCA-4A5F-8B15-EAB11B2370CD");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "126ec7ae-b8b1-48cf-b560-dd186a062300");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/126ec7ae-b8b1-48cf-b560-dd186a062300/1.mp4");
		//array.add(hjResource);
		//array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid","78ddb050-c979-4f4d-903e-aee89749e118");
		paramJson.put("content", "这条选题资源是由保存状态过来的，并且未指派负责人fdsa");
		paramJson.put("title","这条选题资源是由保存状态过来的，并且未指派负责人fasd");
		paramJson.put("creater", "0127");
		paramJson.put("ownColumn", "999888");
		paramJson.put("chargeMan", "0127");
		paramJson.put("inPeople", "姜博");
		paramJson.put("taskStatus", 2);
		paramJson.put("status", 8);
		paramJson.put("resourceList", array);
			
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 测试选题时由报题生成的
	 * @throws Exception 
	 */
	public static void submitXuanTiWithBaoTi() throws Exception{
		String url="http://localhost:31999/DYCommandService/api/addXuanTi";
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "9ce90dcb-52de-4134-9d06-f9fbeef14be1");
		// CRE资源
		JSONObject creResource = new JSONObject();
		creResource.put("resourceType", "CRE");
		creResource.put("resourceGuid", "00270CA2-1BCA-4A5F-8B15-EAB11B2370CD");
		// 本地资源
		JSONObject localResource = new JSONObject();
		localResource.put("resourceType", "local");
		localResource.put("resourceGuid", "126ec7ae-b8b1-48cf-b560-dd186a062300");
		localResource.put("filePath", "ftp://admin:123456@192.168.20.120:21/126ec7ae-b8b1-48cf-b560-dd186a062300/1.mp4");
		array.add(hjResource);
		array.add(creResource);
		//array.add(localResource);
		
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid","");
		paramJson.put("content", "测试由报题生成的选题");
		paramJson.put("title","测试由报题生成的选题");
		paramJson.put("linkGuid", "3a4253fa-ef8d-43a7-9d61-63c561b654b9");
		paramJson.put("creater", "0016");
		paramJson.put("ownColumn", "999888");
		paramJson.put("chargeMan", "0127");
		paramJson.put("inPeople", "姜博");
		paramJson.put("taskStatus", 2);
		paramJson.put("status", 0);
		paramJson.put("resourceList", array);
			
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	
	/**
	 * 从保存状态到提交选题，指派了负责人
	 */
	public static void submitXuanTiFromSaveWithChargeMan(){
		
	}
	
	/**
	 * 更新选题群组，但是不更新选题目录
	 * @throws Exception 
	 */
	public static void updateXuantiGroupTest() throws Exception {
		// TODO Auto-generated method stub
		String url="http://localhost:8888/DYNewsCommandMobile/api/updateXuantiGroup";
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid", "cb4e8021-3257-4711-986e-36fdeb4ca2ab");
		//paramJson.put("title", value);
//		paramJson.put("content", "这是啥玩意啊，啥玩意啊，啥玩意啊");
		paramJson.put("chargeMan", "0016");
		//paramJson.put("inPeople", value);
//		paramJson.put("passAdvice", "不好好干，我炒你鱿鱼");
		//paramJson.put("status", value);
		paramJson.put("taskStatus", 2);
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 更新选题群组，并且更新选题目录，修改选题目录的名称
	 * @throws Exception 
	 */
	public static void updateXuantiGroupWithFolderName() throws Exception{
		// TODO Auto-generated method stub
		String url="http://localhost:31999/DYCommandService/api/updateXuantiGroup";
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid", "379b84ef-82e0-46b4-9691-ffebedca031f");
		paramJson.put("title", "罗蒙更新选题目录名称");
		paramJson.put("content", "这是啥玩意啊，啥玩意啊，啥玩意啊");
		//paramJson.put("chargeMan", value);
		//paramJson.put("inPeople", value);
		paramJson.put("passAdvice", "不好好干，我炒你鱿鱼");
		//paramJson.put("status", value);
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	public static void updateXuantiGroupWithFolder() throws Exception{
		// TODO Auto-generated method stub
		String url="http://localhost:31999/DYNewsCommandMobile/api/updateXuantiGroup";
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid", "99260238-dab3-41b8-a7f9-0d099a99338a");
		paramJson.put("taskStatus",2);
		paramJson.put("status", XUANTISTATES.FINISH.getXuanTiState());
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 将汇聚资源分发到选题目录
	 * @throws Exception 
	 */
	public static void addXuantiGroupResourceWithHJ() throws Exception{
		String url="http://localhost:31999/DYCommandService/api/addXuantiGroupResource";
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid", "379b84ef-82e0-46b4-9691-ffebedca031f");
		paramJson.put("userId", "0016");
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "huiju");
		hjResource.put("resourceGuid", "2e549b94-0189-4627-9af1-deb8c3aed29f");
		array.add(hjResource);
		paramJson.put("xuanTiResourceList", array);
		
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	public static void addXuantiGroupResourceWithCRE() throws Exception{
		String url="http://localhost:31999/DYCommandService/api/addXuantiGroupResource";
		JSONObject paramJson = new JSONObject();
		paramJson.put("taskGuid", "53408284-87ac-471c-89eb-c0f9fd7527ee");
		paramJson.put("userId", "0016");
		JSONArray array = new JSONArray();
		// 汇聚资源
		JSONObject hjResource = new JSONObject();
		hjResource.put("resourceType", "CRE");
		hjResource.put("resourceGuid", "3fcf8e54-8515-4ff9-a322-f148c4abbcaf");
		//hjResource.put("resourceGuid", "2458494488943854580356216207");
		array.add(hjResource);
		paramJson.put("xuanTiResourceList", array);
		
		String result = HttpClientUtil.httpPost(url, paramJson, null);
		System.out.println(result);
	}
	
	/**
	 * 删除保存状态下的选题
	 */
	public static void deleteSavedXuantiTest() {
		String deleteUrl="http://localhost:31999/DYNewsCommandMobile/api/deleteXuanti?id=";
		String id ="83d9f1b4-58f5-48e8-be67-3aa6a2c270be";
		String fullDeleteUrl = deleteUrl+id;
		HttpClientUtil.httpGet(fullDeleteUrl);
	}
	
	/**
	 * 删除提交状态下的选题
	 */
	public static void deleteSubmitXuantiTest(){
		String deleteUrl="http://localhost:31999/DYNewsCommandMobile/api/deleteXuanti?id=";
		String id ="ed29b610-3d85-4101-962a-05917ac7e5b9";
		String fullDeleteUrl = deleteUrl+id+"&isDeleteMission=0";
		System.out.println(fullDeleteUrl);
		JSONObject paramJson = HttpClientUtil.httpGet(fullDeleteUrl);
		System.out.println(paramJson);
	}
}
