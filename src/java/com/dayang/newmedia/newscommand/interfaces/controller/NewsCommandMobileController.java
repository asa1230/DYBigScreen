package com.dayang.newmedia.newscommand.interfaces.controller;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dayang.newmedia.common.utils.MyConfigReader;
import com.dayang.newmedia.newscommand.interfaces.db.model.NewsCommandMobileSelectListQueryCondition;
import com.dayang.newmedia.newscommand.interfaces.db.model.NewsCommandMobileSelectQueryCondition;
import com.dayang.newmedia.newscommand.interfaces.db.model.sysParamHandleCommand;
import com.dayang.newmedia.newscommand.interfaces.service.NewsCommandMobileService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/DYNewsCommandMobileInterface")
public class NewsCommandMobileController {
	private Logger log = LoggerFactory.getLogger(NewsCommandMobileController.class);
	
	@Autowired
	private NewsCommandMobileService newsCommandMobileService;
	
	private MyConfigReader paramcfg = MyConfigReader.getParam();
	/*
	 * control select progress页面的js文件用来加载选题列表的文件
	 */
	@RequestMapping(value="/selectProgressList.do", method = RequestMethod.POST)
	@ResponseBody
	public String selectProgressList(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		//log.debug("-- NewsCommandMobileController selectProgressList 所接收到的参数"+params.toString());
		String result = newsCommandMobileService.selectProgressList(params);
		JSONObject uncookedResult = JSONObject.fromObject(result);
		JSONObject finalResult = new JSONObject();
		//设置返回响应状态
		JSONObject newJsonCommon = new JSONObject();
		newJsonCommon.put("success", uncookedResult.get("status"));
		finalResult.put("commonResponse", newJsonCommon);
		//设置records所需字段
		if(uncookedResult.getJSONObject("data")!=null) {
			
		JSONArray uncookedRecords = uncookedResult.getJSONObject("data").getJSONArray("list");
		
		JSONObject finalRecords = new JSONObject();
		for(int i=0;i<uncookedRecords.size();i++) {
			//log.debug("bug调试12"+i);
				JSONObject uncookedRecord = JSONObject.fromObject(uncookedRecords.get(i));
				JSONObject finalRecord = new JSONObject();
				
				//transferValue(finalRecord,"chargeMan",uncookedRecord,"topicCreator");  
				transferValue(finalRecord,"chargeMan",uncookedRecord,"principalsStr");   //zhy mod 使用负责人
				
				///////////////////////////////////////////////////
				//zhy add
				String strNameval = finalRecord.getString("chargeMan");
				if(null!=strNameval && !"".equals(strNameval)) {
					 try {
						String strChangeNameVal = java.net.URLDecoder.decode(strNameval,   "utf-8");
						finalRecord.put("chargeMan", strChangeNameVal);
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}   
				}
				 
				////////////////////////////////////////////////////
				
				if(uncookedRecord.get("topicContent")!=null) {
					finalRecord.put("content", changeLengthDiy(uncookedRecord.get("topicContent").toString(),800));
				}
				//设置拟发布渠道对应参数
				String stringplanPublish=(String)uncookedRecord.get("topicPlanChannel");
				if(stringplanPublish!=null && !stringplanPublish.equals("")) {
				String[] publishs = stringplanPublish.toString().split(",");
				//log.debug(publishs[0].toString());
				for(int j=0;j<publishs.length;j++ ) {
					//log.debug(publishs[j].toString());
					if(publishs[j].toString()!=null && !publishs[j].toString().equals("") && Integer.parseInt(publishs[j].toString())==1) {   //发布渠道是APP
						//finalRecord.put("ziyuan01", "1");
						finalRecord.put("ziyuan05", "1");
					}
					else if(publishs[j].toString()!=null && !publishs[j].toString().equals("") && Integer.parseInt(publishs[j].toString())==2) { //互联网
						finalRecord.put("ziyuan02", "1");
					}
					else if(publishs[j].toString()!=null && !publishs[j].toString().equals("") && Integer.parseInt(publishs[j].toString())==3) {  //微信
						//finalRecord.put("ziyuan03", "1");
						finalRecord.put("ziyuan04", "1");
					}
					else if(publishs[j].toString()!=null && !publishs[j].toString().equals("") && Integer.parseInt(publishs[j].toString())==4) {  //微博
						//finalRecord.put("ziyuan04", "1");
						finalRecord.put("ziyuan03", "1");
					}
					else if(publishs[j].toString()!=null && !publishs[j].toString().equals("") && Integer.parseInt(publishs[j].toString())==5) {  //电视
						//finalRecord.put("ziyuan05", "1");
						finalRecord.put("ziyuan01", "1");
					}
					else {
						log.debug("发布渠道代码需要配置");
					}
				}
				}else {
					log.debug("拟发布渠道配置为空");
				}
				transferValue(finalRecord,"createTime",uncookedRecord,"topicCreateTime");
				transferValue(finalRecord,"modifytime",uncookedRecord,"topicModifyTime");
				transferValue(finalRecord,"ownColumn",uncookedRecord,"preReportColumnStr");  //大屏显示拟播栏目
				transferValue(finalRecord,"status",uncookedRecord,"topicStatus");
				
				finalRecord.put("statusdesp", "");                                           //zhy add
				transferValue(finalRecord,"taskplace",uncookedRecord,"topicHapplace");
				transferValue(finalRecord,"passadvice",uncookedRecord,"censorOpinion");
				
				transferValue(finalRecord,"taskGuid",uncookedRecord,"topicGuid");
				if(uncookedRecord.get("topicTitle")!=null) {
				finalRecord.put("title", changeLengthDiy(uncookedRecord.get("topicTitle").toString(),80));
				}else {
					log.debug("tasktitle存在空值");
				}
				
				//根据id 调用接口查询任务信息
				NewsCommandMobileSelectQueryCondition nc = new NewsCommandMobileSelectQueryCondition(uncookedRecord.getString("topicGuid").toString(), 1);
				
				//zhy mod ,现在差任务换接口了，从DUCP查
				/*
				String uncookDetail = newsCommandMobileService.selectProgressByIdAndType(nc);  
				JSONObject jsonDetail = JSONObject.fromObject(uncookDetail);
				JSONObject taskInfo = JSONObject.fromObject(jsonDetail.get("data"));
				*/
				String uncookDetail = newsCommandMobileService.getXuantiMissionByselectId(nc);  
				JSONObject taskInfo = JSONObject.fromObject(uncookDetail);				
				
				if(taskInfo.get("missionList")!=null) {
					log.debug("选题任务列表不为空");
					JSONArray taskMissionList = taskInfo.getJSONArray("missionList");
					int finishMissionNum=0;
						
					for(int s=0;s<taskMissionList.size();s++) {
						JSONObject taskMission = JSONObject.fromObject(taskMissionList.get(s));
						
						if("1".equals(taskMission.get("status").toString())) {
							finishMissionNum++;
						}
					}
					
					finalRecord.put("missonNum", taskMissionList.size());
					finalRecord.put("finishMissonNum", finishMissionNum);
					
					}else {
						log.debug("此项选题无任务");
					}
				
				
				finalRecords.put(i, finalRecord);
		}
		finalResult.put("records", finalRecords);
		}
		//设置分页所需字段~
		transferValue(finalResult,"currentPage",uncookedResult.getJSONObject("data"),"currentPage");
		transferValue(finalResult,"totalCount", uncookedResult.getJSONObject("data"),"totalCount");
		//transferValue(finalResult,"limit", uncookedResult.getJSONObject("data"),"limit");
		finalResult.put("limit", 8);
		log.debug( " news commandmobile controller 获取到的 "+result);
		return finalResult.toString();
	}
	
	@RequestMapping(value="/selectProgressDetailes.do", method = RequestMethod.POST)
	@ResponseBody
	public String selectProgressDetailes(@RequestBody NewsCommandMobileSelectQueryCondition nc){
		log.debug("查询选题详情的条件信息:"+nc.toString());
		String result = newsCommandMobileService.selectProgressByIdAndType(nc);
		log.debug( " news commandmobile   controller detail.do 获取到 的 "+result);
		JSONObject uncookedResult = JSONObject.fromObject(result);
		JSONObject finalResult = new JSONObject();
		//finalResult.put("commonResponse", uncookedResult.get("commonResponse"));
			//JSONObject oldJsonCommon = JSONObject.fromObject(uncookedResult.get("commonResponse"));
			JSONObject newJsonCommon = new JSONObject();
			newJsonCommon.put("success", uncookedResult.get("status"));
			//newJsonCommon.put("errorDesc", oldJsonCommon.get("errorDesc").toString());
			finalResult.put("commonResponse", newJsonCommon);
			
				JSONObject taskInfo = JSONObject.fromObject(uncookedResult.get("data"));
				finalResult.put("content", taskInfo.get("topicContent").toString());
				transferValue(finalResult,"createTime",taskInfo,"topicCreateTime");
				//待定
				//transferValue(finalResult,"ownColumn",taskInfo,"owncolumn");
				JSONObject prePushColumn = JSONObject.fromObject(taskInfo.get("prePushColumn"));
				
				
				JSONArray preReportColumnList = taskInfo.getJSONArray("preReportColumn");
				for(int i=0;i<preReportColumnList.size();i++) {
					JSONObject preReport = JSONObject.fromObject(preReportColumnList.get(i));
					Object topicColumnType = preReport.get("topicColumnType");
					finalResult.put("ownColumn", preReport.get("columnName"));
					finalResult.put("passadvice", preReport.get("topicBoard"));
				}
				
				
				finalResult.put("title", changeLengthDiy(taskInfo.get("topicTitle").toString(),50));
				
				//transferValue(finalResult,"chargeMan",taskInfo,"topicCreator");
				transferValue(finalResult,"chargeMan",taskInfo,"principalsStr");   //zhy mod 使用负责人
				
				///////////////////////////////////////////////////
				//zhy add
				String strNameval = finalResult.getString("chargeMan");
				if(null!=strNameval && !"".equals(strNameval)) {
					try {
						String strChangeNameVal = java.net.URLDecoder.decode(strNameval,   "utf-8");
						finalResult.put("chargeMan", strChangeNameVal);
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}   
				}
				
				////////////////////////////////////////////////////
				
				
				transferValue(finalResult,"status",taskInfo,"topicStatus");				
				finalResult.put("statusdesp", "");                                              //zhy add
				transferValue(finalResult,"taskplace",taskInfo,"topicHapplace");
				//transferValue(finalResult,"passadvice",taskInfo,"censorOpinion");             //zhy mod ,说是接口中已经不写这个字段了
				
				
				log.debug(finalResult.toString());
				
				
				//将接口获取的任务细节 填充到页面对应字段内 
				//zhy mod 目前修正为直接从DUCP的接口来取选题任务信息
				/*
				if(taskInfo.get("topicMissions")!=null) {
				log.debug("taskmissionlist 不为 null");
				JSONArray taskMissionList = taskInfo.getJSONArray("topicMissions");
				JSONObject taskModelList = new JSONObject();
				int finishMissionNum=0;
					
				for(int i=0;i<taskMissionList.size();i++) {
					JSONObject taskModel = new JSONObject();
					JSONObject taskMission = JSONObject.fromObject(taskMissionList.get(i));
					//封装方法将jsonobject的值进行转移
					transferValue(taskModel,"rwTitle",taskMission,"msnDetail");
					transferValue(taskModel,"rwUserName",taskMission,"msnChargemanId");
					transferValue(taskModel,"rwStatus",taskMission,"msnStatus");
					if(taskMission.get("msnStatus").equals("3")) {
						finishMissionNum++;
					}
					taskModelList.put(i, taskModel);
				}
				finalResult.put("taskModelList", taskModelList);
				finalResult.put("finishMissonNum", finishMissionNum);
				finalResult.put("missonNum", taskMissionList.size());
				
				}else {
					log.debug("任务列表为空");
					log.debug(uncookedResult.toString()+"uncookedresult");
					log.debug(taskInfo.getString("taskMissionList").toString()+"uncookedresult");
				}
				*/
				log.debug("开始查询选题 " + taskInfo.get("topicTitle").toString() +" 对应任务信息");
				String missionresult = newsCommandMobileService.getXuantiMissionByselectId(nc);
				JSONObject uncookedMissionResult = JSONObject.fromObject(missionresult);
				if(uncookedMissionResult.get("missionList")!=null) {
					log.debug("taskmissionlist 不为 null");
					JSONArray taskMissionList = uncookedMissionResult.getJSONArray("missionList");
					JSONObject taskModelList = new JSONObject();
					int finishMissionNum=0;
						
					for(int i=0;i<taskMissionList.size();i++) {
						JSONObject taskModel = new JSONObject();
						JSONObject taskMission = JSONObject.fromObject(taskMissionList.get(i));
						//封装方法将jsonobject的值进行转移
						transferValue(taskModel,"rwTitle",taskMission,"missionName");
						transferValue(taskModel,"rwUserName",taskMission,"executor");
						transferValue(taskModel,"rwStatus",taskMission,"status");
						if("1".equals(taskMission.get("status").toString())) {
							finishMissionNum++;
						}
						taskModelList.put(i, taskModel);
					}
					finalResult.put("taskModelList", taskModelList);
					finalResult.put("finishMissonNum", finishMissionNum);
					finalResult.put("missonNum", taskMissionList.size());
					
				}else {
					log.debug("任务列表为空");
				}
				log.debug("结束查询选题 " + taskInfo.get("topicTitle").toString() +" 对应任务信息");
			
				//设置拟发布渠道对应参数
				String stringplanPublish=(String)taskInfo.get("topicPlanChannel");
				if(stringplanPublish!=null && !stringplanPublish.equals("")) {
				String[] publishs = stringplanPublish.toString().split(",");
				for(int i=0;i<publishs.length;i++ ) {
					if(publishs[i].toString()!=null && !publishs[i].toString().equals("") && Integer.parseInt(publishs[i].toString())==1) {  //发布渠道APP
						//finalResult.put("ziyuan01", "1");
						finalResult.put("ziyuan05", "1");
					}
					else if(publishs[i].toString()!=null && !publishs[i].toString().equals("") && Integer.parseInt(publishs[i].toString())==2) { //发布渠道网页
						finalResult.put("ziyuan02", "1");
					}
					else if(publishs[i].toString()!=null && !publishs[i].toString().equals("") && Integer.parseInt(publishs[i].toString())==3) { //发布渠道微信
						//finalResult.put("ziyuan03", "1");
						finalResult.put("ziyuan04", "1");
					}
					else if(publishs[i].toString()!=null && !publishs[i].toString().equals("") && Integer.parseInt(publishs[i].toString())==4) {  //发布渠道微博
						//finalResult.put("ziyuan04", "1");
						finalResult.put("ziyuan03", "1");
					}
					else if(publishs[i].toString()!=null && !publishs[i].toString().equals("") && Integer.parseInt(publishs[i].toString())==5) {  //发布渠道电视
						//finalResult.put("ziyuan05", "1");
						finalResult.put("ziyuan01", "1");
					}
					else {
						log.debug("发布渠道代码需要配置");
					}
				}
				}else {
					log.debug("拟发布渠道配置为空");
				}
				
				//设置报道意见
				//transferValue(finalResult,"passAdvice",taskInfo,"passadvice");
				
				
				//挂载资源内容填充
				if(taskInfo.get("resources")!=null) {
					JSONArray xuanTiresourceList = JSONArray.fromObject(taskInfo.get("resources"));
					JSONObject resourceList = new JSONObject();
					for(int i=0;i<xuanTiresourceList.size();i++) {
						JSONObject xuanTiresource = JSONObject.fromObject(xuanTiresourceList.get(i));
						JSONObject resource = new JSONObject();
						transferValue(resource,"title",xuanTiresource,"resourceTitle");
						transferValue(resource,"author",xuanTiresource,"userInfo");
						transferValue(resource,"createdTime",xuanTiresource,"resourceCreatetime");
						transferValue(resource,"fileState",xuanTiresource,"operateStatus");
						transferValue(resource,"resourceId",xuanTiresource,"topicGuid");
						transferValue(resource,"resourceOriginTypeName",xuanTiresource,"resourceCategory");
						transferValue(resource,"resourceSourcetype",xuanTiresource,"resourceSourcetype");   //zhy add
						resourceList.put(i, resource);
						finalResult.put("resourceList", resourceList);
					}
				}else {
					log.debug("选题挂载资源为空");
				}
		return finalResult.toString();
	}
	
	@RequestMapping(value="/selectMapProgressList.do", method = RequestMethod.POST)
	@ResponseBody
	public String selectMapProgressList(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		String result = "";
		int querymodel = params.getQueryModel();
		if(querymodel==1) {
			result = newsCommandMobileService.MapResourceList(params);			
			if(null==result || "".equals(result))
			{
				log.debug("newscommandmobilecontroller selectMapProgressList获取到的结果为空 ");
				
				JSONObject jsonError = new JSONObject();							
				result = jsonError.toString();
				return result;
			}
			
			JSONObject JSONResult = JSONObject.fromObject(result);			
			if(null==JSONResult || JSONResult.isNullObject())
			{
				log.debug("newscommandmobilecontroller selectMapProgressList变化获取到的结果为json失败 ");
				
				JSONObject jsonError = new JSONObject();
				jsonError.put("status", "true");				
				result = jsonError.toString();
				return result;
			}
			
			JSONArray listArrayRecords = new JSONArray();
			JSONObject dataJson = new JSONObject();
			JSONArray resourcesArrayRecords = JSONResult.getJSONArray("resources");
			
			//JSONResult.put("data", dataJson);
			
			
			for(int i=0;i<resourcesArrayRecords.size();i++) {
				//log.debug("bug调试12"+i);
					JSONObject resourcesJSON = JSONObject.fromObject(resourcesArrayRecords.get(i));
					JSONObject listJson = new JSONObject();
					
					
					//listJson.put("topicTitle", resourcesJSON.get("title").toString());    //爆料信息没有标题
					String strTitle = resourcesJSON.get("title").toString();
					if(null==strTitle||"".equals(strTitle))
						strTitle = resourcesJSON.get("summary").toString();
					if(null==strTitle||"".equals(strTitle))
						strTitle="";
					listJson.put("topicTitle", strTitle);
					
					listJson.put("topicHapplace", resourcesJSON.get("locationName").toString());
					listJson.put("imgUrl", resourcesJSON.get("firstImagePath").toString());
					listJson.put("topicGuid", resourcesJSON.get("resourceGuid").toString());
					listJson.put("topicStatus", "0");
					listJson.put("topicLatitude", "");
					listJson.put("topicLongitude", "");
					listJson.put("isUse", "0");
					
					
					if(resourcesJSON.get("locationCoordinate") != null) {
						String localhost = resourcesJSON.get("locationCoordinate").toString();
						log.debug( " 资源locationCoordinate "+localhost);
						String[] local = localhost.toString().split(",");
						if(local.length==2) {
							//listJson.put("topicLatitude", local[0]);
							//listJson.put("topicLongitude", local[1]);
							
							listJson.put("topicLongitude", local[0]);
							listJson.put("topicLatitude", local[1]);
						}
					}
//					else {
//						listJson.put("topicLatitude", "");
//						listJson.put("topicLongitude", "");
//					}
					
					listArrayRecords.add(listJson);
			}
			
			dataJson.accumulate("list", listArrayRecords);
			dataJson.put("limit", JSONResult.get("limit"));
			dataJson.put("currentPage", JSONResult.get("currentPage"));
			dataJson.put("totalCount", JSONResult.get("totalCount"));
			JSONResult.put("data", dataJson);
			JSONResult.put("status", "true");
			
			
			
			result = JSONResult.toString();
			
		}
		if(querymodel==3) {
			result = newsCommandMobileService.selectProgressList(params);
		}
		if(querymodel==4||querymodel==5) {
			result = newsCommandMobileService.MapGpsInfoList(params);
			
			JSONObject JSONResult = JSONObject.fromObject(result);
			JSONArray listArrayRecords = new JSONArray();
			JSONArray recordArrayRecords = JSONResult.getJSONObject("data").getJSONArray("records");
			
			
			for(int i=0;i<recordArrayRecords.size();i++) {
				//log.debug("bug调试12"+i);
					JSONObject RecordJSON = JSONObject.fromObject(recordArrayRecords.get(i));
					JSONObject listJson = new JSONObject();
					
					listJson.put("topicStatus", RecordJSON.get("state").toString());
					listJson.put("topicHapplace", RecordJSON.get("locationName").toString());
					listJson.put("topicTitle", RecordJSON.get("title").toString());
					listJson.put("imgUrl", RecordJSON.get("imgUrl").toString());
					listJson.put("topicLatitude", RecordJSON.get("lantitude").toString());
					listJson.put("topicLongitude", RecordJSON.get("longitude").toString());
					listJson.put("topicGuid", RecordJSON.get("id").toString());
					
					listArrayRecords.add(listJson);
			}
			
			JSONResult.getJSONObject("data").accumulate("list", listArrayRecords);
			
			result = JSONResult.toString();
		}
		
		
		log.debug( " news commandmobile controller 获取到的 "+result);
		return result;
	}
	
	@RequestMapping(value="/ManuscriptsList.do", method = RequestMethod.POST)
	@ResponseBody
	public String ManuscriptsList(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		
		String result = "";
		result = newsCommandMobileService.ManuscriptsList(params);		
		
		log.debug( " news commandmobile controller 获取到的 "+result);
		return result;
	}	
	
	@RequestMapping(value="/onLineGo.do", method = RequestMethod.POST)
	@ResponseBody
	public String onLineGo(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		
		String result = "";
		result = newsCommandMobileService.onLineGo(params);
		
		
		log.debug( " news commandmobile controller 获取到的 "+result);
		return result;
	}
	
	@RequestMapping(value="/userList.do", method = RequestMethod.POST)
	@ResponseBody
	public String userList(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		
		String result = "";
		result = newsCommandMobileService.allUserList(params);
		
		
		log.debug( " news commandmobile controller 获取到的 "+result);
		return result;
	}
	
	@RequestMapping(value="/columnList.do", method = RequestMethod.POST)
	@ResponseBody
	public String columnList(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		
		String result = "";
		result = newsCommandMobileService.allColumnrList(params);
		
		
		log.debug( " news commandmobile controller 获取到的 "+result);
		return result;
	}
	
	//zhy add,用于获取后台参数配置
	@RequestMapping(value="/handlesystemconfigparam.do", method = RequestMethod.POST)
	@ResponseBody
	public String handlesystemconfigparam(@RequestBody sysParamHandleCommand params) {
		
		log.info("----进入后台参数处理接口-------");
		
		JSONObject paramResult = new JSONObject();
		paramResult.put("state", 1);
		
		String querycommand = params.getHandleCommand();
		if(null==querycommand||"".equals(querycommand))
		{
			log.info("----接收到的后台参数处理请求命令为空，直接返回错误-------");
			return paramResult.toString();
		}
		log.info("----接收到的后台参数处理请求命令为：" + querycommand + "----");
		
		
		//开始处理命令
		if("00".equals(querycommand)) {
			log.info("----开始获取后台配置的所有页面动画切换频率，秒为单位----");				
			String todayselectswitchfrequency = paramcfg.val("todayselect.switchfrequency");
			if(null==todayselectswitchfrequency || "".equals(todayselectswitchfrequency))
				todayselectswitchfrequency = "60";
			log.info("----获取后台配置的今日选题页面动画切换频率(秒为单位)是:"+todayselectswitchfrequency+"----");
			
			String newsswitchfrequency = paramcfg.val("news.switchfrequency");
			if(null==newsswitchfrequency || "".equals(newsswitchfrequency))
				newsswitchfrequency = "60";
			log.info("----获取后台配置的稿件生产页面动画切换频率(秒为单位)是:"+newsswitchfrequency+"----");			
			
			String tvnewsswitchfrequency = paramcfg.val("tvnews.switchfrequency");
			if(null==tvnewsswitchfrequency || "".equals(tvnewsswitchfrequency))
				tvnewsswitchfrequency = "60";
			log.info("----获取后台配置的电视稿件页面动画切换频率(秒为单位)是:"+tvnewsswitchfrequency+"----");
			
			String tvnewsQueryCol = paramcfg.val("tvnews.querycolumn");
			if(null==tvnewsQueryCol || "".equals(tvnewsQueryCol))
				tvnewsQueryCol = "康巴卫视新闻";
			log.info("----获取后台配置的电视稿件查询栏目是:"+tvnewsQueryCol+"----");
			
			
			paramResult.put("state", 0);
			paramResult.put("todaySelectSwiperFrequcy", todayselectswitchfrequency);
			paramResult.put("newsSwiperFrequcy", newsswitchfrequency);
			paramResult.put("tvnewsSwiperFrequcy", tvnewsswitchfrequency);
			paramResult.put("tvnewsColumname", tvnewsQueryCol);
		}
		else if("10".equals(querycommand)) {
			log.info("----开始获取后台配置的今日选题页面动画切换频率，秒为单位----");				
			String todayselectswitchfrequency = paramcfg.val("todayselect.switchfrequency");
			if(null==todayselectswitchfrequency || "".equals(todayselectswitchfrequency))
				todayselectswitchfrequency = "60";
			log.info("----获取后台配置的今日选题页面动画切换频率(秒为单位)是:"+todayselectswitchfrequency+"----");
			paramResult.put("state", 0);
			paramResult.put("todaySelectSwiperFrequcy", todayselectswitchfrequency);			
		}
		else if("11".equals(querycommand)) {			
			log.info("----开始设置后台配置的今日选题页面动画切换频率，秒为单位----");
			String orgSetVal = paramcfg.val("todayselect.switchfrequency");
			if(null==orgSetVal || "".equals(orgSetVal))
				orgSetVal = "60";
			
			String todayselectswitchfrequency = params.getTodaySelectSwiperFrequcy();			
			log.info("----设置后台配置的今日选题页面动画切换频率(秒为单位)是:"+todayselectswitchfrequency+"----");
			boolean saveRet = paramcfg.saveVal("todayselect.switchfrequency", todayselectswitchfrequency);
			if(saveRet) {
				paramResult.put("state", 0);
				paramResult.put("todaySelectSwiperFrequcy", todayselectswitchfrequency);
			}
			else{
				paramResult.put("todaySelectSwiperFrequcy", orgSetVal);
			}
		}
		else if("20".equals(querycommand)) {
			log.info("----开始获取后台配置的稿件生产页面动画切换频率，秒为单位----");				
			String newsswitchfrequency = paramcfg.val("news.switchfrequency");
			if(null==newsswitchfrequency || "".equals(newsswitchfrequency))
				newsswitchfrequency = "60";
			log.info("----获取后台配置的稿件生产页面动画切换频率(秒为单位)是:"+newsswitchfrequency+"----");
			paramResult.put("state", 0);
			paramResult.put("newsSwiperFrequcy", newsswitchfrequency);			
		}
		else if("21".equals(querycommand)) {			
			log.info("----开始设置后台配置的稿件生产页面动画切换频率，秒为单位----");
			String orgSetVal = paramcfg.val("news.switchfrequency");
			if(null==orgSetVal || "".equals(orgSetVal))
				orgSetVal = "60";
			
			String newsswitchfrequency = params.getNewsSwiperFrequcy();			
			log.info("----设置后台配置的稿件生产页面动画切换频率(秒为单位)是:"+newsswitchfrequency+"----");
			boolean saveRet = paramcfg.saveVal("news.switchfrequency", newsswitchfrequency);
			if(saveRet) {
				paramResult.put("state", 0);
				paramResult.put("newsSwiperFrequcy", newsswitchfrequency);
			}
			else{
				paramResult.put("newsSwiperFrequcy", orgSetVal);
			}
		}
		else if("30".equals(querycommand)) {
			log.info("----开始获取后台配置的电视稿件页面动画切换频率，秒为单位----");				
			String tvnewsswitchfrequency = paramcfg.val("tvnews.switchfrequency");
			if(null==tvnewsswitchfrequency || "".equals(tvnewsswitchfrequency))
				tvnewsswitchfrequency = "60";
			log.info("----获取后台配置的电视稿件页面动画切换频率(秒为单位)是:"+tvnewsswitchfrequency+"----");
			paramResult.put("state", 0);
			paramResult.put("tvnewsSwiperFrequcy", tvnewsswitchfrequency);			
		}
		else if("31".equals(querycommand)) {			
			log.info("----开始设置后台配置的电视稿件页面动画切换频率，秒为单位----");
			String orgSetVal = paramcfg.val("tvnews.switchfrequency");
			if(null==orgSetVal || "".equals(orgSetVal))
				orgSetVal = "60";
			
			String tvnewsswitchfrequency = params.getTvnewsSwiperFrequcy();			
			log.info("----设置后台配置的电视稿件页面动画切换频率(秒为单位)是:"+tvnewsswitchfrequency+"----");
			boolean saveRet = paramcfg.saveVal("tvnews.switchfrequency", tvnewsswitchfrequency);
			if(saveRet) {
				paramResult.put("state", 0);
				paramResult.put("tvnewsSwiperFrequcy", tvnewsswitchfrequency);
			}
			else{
				paramResult.put("tvnewsSwiperFrequcy", orgSetVal);
			}
		}
		
		
		log.info("----退出后台参数处理接口-------");
		return paramResult.toString();
	}
	
	@RequestMapping(value="/newsProgressList.do", method = RequestMethod.POST)
	@ResponseBody
	public String newsProgressList(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		
		String result = "";
		result = newsCommandMobileService.ManuscriptsProgressList(params);
		
		
		log.info( " newsProgressListAction commandmobile controller 获取到的 "+result);
		return result;
	}
	
	@RequestMapping(value="/newsDetailInfo.do", method = RequestMethod.POST)
	@ResponseBody
	public String newsDetailInfo(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		
		String result = "";
		result = newsCommandMobileService.ManuscriptsProgressDetail(params);		
		
		log.debug( " newsDetail  controller 获取到的 "+result);
		return result;
	}
	
	@RequestMapping(value="/tvnewsuserList.do", method = RequestMethod.POST)
	@ResponseBody
	public String tvnewsuserList(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		
		String result = "";
		result = newsCommandMobileService.tvNewsuserlistQurey(params);		
		
		log.debug( " tvnewsuserList  controller 获取到的 "+result);
		return result;
	}
	
	
	@RequestMapping(value="/tvnewslistquery.do", method = RequestMethod.POST)
	@ResponseBody
	public String tvnewslistquery(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		
		String result = "";
		result = newsCommandMobileService.tvNewsitemlistquery(params);		
		
		log.debug( " tvnewslistquery  controller 获取到的 "+result);
		return result;
	}
	
	@RequestMapping(value="/tvnewsdetailquery.do", method = RequestMethod.POST)
	@ResponseBody
	public String tvnewsdetailquery(@RequestBody NewsCommandMobileSelectListQueryCondition params) {
		
		String result = "";
		result = newsCommandMobileService.tvNewsitemdetailquery(params);		
		
		log.debug( " tvnewsdetailquery  controller 获取到的 "+result);
		return result;
	}
	
	
	/*
	 * 改变文本长度
	 */
	private String changeLengthDiy(String title,int len) {
		if(title.length()>len) {
			return title.substring(0, len-1)+"...";
		}
		else {
			return title;
		}
		
	}
	//将sourceJson中的sourceKey值转存到targetJson的targetKey值
	private void transferValue(JSONObject targetJson,String targetKey,JSONObject sourceJson, String sourceKey) {
		if(sourceJson.get(sourceKey)!=null) {
			targetJson.put(targetKey, sourceJson.get(sourceKey));
		}else {
			targetJson.put(targetKey, null);
			log.debug(sourceKey.toString()+"存在空值");
		}
		
		
	}
	
	
	
	
	
}
