package com.dayang.newmedia.newscommand.interfaces.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dayang.newmedia.newscommand.interfaces.db.model.ColumnRating;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZColumnItem;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZColumnRatingList;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZNewsBill;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZNewsBillItem;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZNewsStory;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZNewsTaskStory;
import com.dayang.newmedia.newscommand.interfaces.db.model.NewsCommandMobileSelectListQueryCondition;
import com.dayang.newmedia.newscommand.interfaces.service.HZservice;
import com.dayang.newmedia.newscommand.interfaces.service.HzzService;
import com.dayang.newmedia.newscommand.interfaces.service.NewsCommandMobileService;
import com.sun.mail.handlers.message_rfc822;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import oracle.sql.DATE;
import sun.net.www.content.text.plain;

@Controller
@RequestMapping(value="/HZInterfaceSet")
public class HZcontroller {
	private Logger log = LoggerFactory.getLogger(HZcontroller.class);
	@Autowired
	private HZservice hZservice;
	@Autowired
	private HzzService hzzservice;
	@Autowired  
	 HttpServletRequest request; 
	
	@Autowired
	private NewsCommandMobileService newsCommandMobileService; 
	
	@RequestMapping(value="/getLatestNews.do",method=RequestMethod.GET)
	@ResponseBody
	public String getlatestnews() {
		log.debug("==HZcontroller getlatestnews method start==");
		String latestNews = hZservice.getLatestNews();
		JSONObject finalJson = new JSONObject();
		JSONObject response = new JSONObject();
		//判断返回值是否为 error
		if(latestNews.equals("error")) {
			response.put("success", false);
			response.put("errorDesc", "error");
			finalJson.put("commonResponse", response);
			return finalJson.toString();
		}else {
			response.put("errorDesc", "");
			response.put("success", true);
			//封装其余项
			JSONObject records = new JSONObject();

			JSONArray jsonNews = JSONArray.fromObject(latestNews);
			for (int i = 0; i < jsonNews.size(); i++) {
				//用来返回的新闻单项
				JSONObject finalNews = new JSONObject();
				//从接口获取到的新闻单项
				JSONObject eachNews = JSONObject.fromObject(jsonNews.get(i).toString());
				//对图文路径进行封装
				JSONObject indexpic = JSONObject.fromObject(eachNews.get("indexpic").toString());
				String url=indexpic.getString("host").toString()+
						indexpic.getString("dir").toString()+
						indexpic.getString("filepath")+
						indexpic.getString("filename");
				finalNews.put("picUrl", url);
				//对作者姓名进行封装
				transferValue(finalNews,"create_user",eachNews,"create_user");
				//对title进行封装
				transferValue(finalNews,"title",eachNews,"title");
				//对发布时间进行封装
				transferValue(finalNews,"publish_time",eachNews,"publish_time");
				records.put(i, finalNews);
			}
			//将records数组封装到最终返回向
			finalJson.put("commonResponse", response);
			finalJson.put("records", records);
		return finalJson.toString();
		}
		
	}
	@RequestMapping(value="/getHotPoints.do",method=RequestMethod.GET)
	@ResponseBody
	public String getHotPoints() {
		String result = null;
		JSONObject finalJson = new JSONObject();
		try {
			result = hZservice.getHotPoints();
			if(result!=null && result.startsWith("{")) {
			JSONObject uncookedJson = JSONObject.fromObject(result);
			uncookedJson.getString("message");
			if(uncookedJson.getString("message").equals("success")) {
				log.debug("杭州热点调用道顺接口成功");
				JSONObject commonResponse = new JSONObject();
				commonResponse.put("success", true);
				commonResponse.put("errorDesc", "");
				JSONArray newsList = uncookedJson.getJSONArray("newsList");
				finalJson.put("records", newsList);
				finalJson.put("commonResponse", commonResponse);
			}else {
				log.debug("杭州热点调用道顺接口失败");
				JSONObject commonResponse = new JSONObject();
				commonResponse.put("success", false);
				commonResponse.put("errorDesc", uncookedJson.get("message"));
				finalJson.put("commonResponse", commonResponse);
			}
			}else {
					JSONObject commonResponse = new JSONObject();
					commonResponse.put("success", false);
					commonResponse.put("errorDesc", "道顺接口返回参数为空或者不为json");
					finalJson.put("commonResponse", commonResponse);
				}
		}  catch (Exception e) {
			e.printStackTrace();
		}
		log.debug("热度排行视频返回结果:"+finalJson.toString());
		return finalJson.toString();
	}
	/*
	 * 政务问答
	 */
	@RequestMapping(value="/getPtList.do",method=RequestMethod.GET)
	@ResponseBody
	public String getPtList() {
		String result = null;
		JSONObject finalJson = new JSONObject();
		try {
			result = hZservice.getPtList();
			if(result!=null && result.startsWith("{")) {
			JSONObject uncookedJson = JSONObject.fromObject(result);
			uncookedJson.getString("message");
			if(uncookedJson.getString("message").equals("success")) {
				log.debug("杭州之家政务问答列表 调用道顺接口成功");
				JSONObject commonResponse = new JSONObject();
				commonResponse.put("success", true);
				commonResponse.put("errorDesc", "");
				JSONArray governmentlist = uncookedJson.getJSONArray("governmentlist");
				Integer replyNum =(Integer)uncookedJson.get("reply_num");
				finalJson.put("replyNum", replyNum);
				finalJson.put("records", governmentlist);
				finalJson.put("commonResponse", commonResponse);
			}else {
				log.debug("杭州政务问答 调用道顺接口失败");
				JSONObject commonResponse = new JSONObject();
				commonResponse.put("success", false);
				commonResponse.put("errorDesc", uncookedJson.get("message"));
				finalJson.put("commonResponse", commonResponse);
			}
			}else {
					JSONObject commonResponse = new JSONObject();
					commonResponse.put("success", false);
					commonResponse.put("errorDesc", "道顺接口返回参数为空或者格式错误");
					finalJson.put("commonResponse", commonResponse);
				}
		}  catch (Exception e) {
			e.printStackTrace();
		}
		log.debug("政务问答返回结果:"+finalJson.toString());
		return finalJson.toString();
	}
	
	/* 选题列表-原本只从新闻bs 获取选题列表 需要条件为栏目名称和时间
	 * 选题列表新需求 需要从新闻中心 和 指挥调度获取选题(需要条件为默认userid)
	 * 因此在properties中配置默认userid 在获取选题的controller方法中 调用两个service接口获取选题列表 合并
	 */
	@RequestMapping(value="/getselectList.do",method=RequestMethod.GET)
	@ResponseBody
	private String selectList() {
		log.debug("HZcontroller selectList方法内部");
		//获取到的是栏目列表
		List<HZColumnItem> list = hZservice.getColumnList();
		JSONObject finalJson = new JSONObject();
		if(list!=null) {
			ArrayList<HZNewsTaskStory> todaySelect = hZservice.getTodaySelect(list);
			NewsCommandMobileSelectListQueryCondition nc = new NewsCommandMobileSelectListQueryCondition();
			String userid = newsCommandMobileService.getUserIdFromProperties();
			String selectListLimit = newsCommandMobileService.getSelectListLimit();
			nc.setUserId(userid);
			nc.setLimit(Integer.parseInt(selectListLimit));//设置杭州台选题列表每次查询数量
			nc.setStart(0);
			String result = newsCommandMobileService.selectProgressList(nc,request);
			JSONObject uncookedResult = JSONObject.fromObject(result);
			
			if(todaySelect!=null | uncookedResult.get("records")!=null) {
				JSONObject response = new JSONObject();
				response.put("success", true);
				response.put("errorDesc", "");
				finalJson.put("commonResponse", response);
				JSONObject records = new JSONObject();
				int recordsSize=0;
				if(uncookedResult.getJSONArray("records").size()>0) {
				JSONArray uncookedRecords = uncookedResult.getJSONArray("records");
				for(int i=0;i<uncookedRecords.size();i++) {
					JSONObject uncookedRecord = JSONObject.fromObject(uncookedRecords.get(i));
					JSONObject finalRecord = new JSONObject();
					transferValue(finalRecord,"arriveTime",uncookedRecord,"arriveTime");
					transferValue(finalRecord,"assistant",uncookedRecord,"assistant");
					transferValue(finalRecord,"batMan",uncookedRecord,"batMan");
					transferValue(finalRecord,"camerist",uncookedRecord,"camerist");
					transferValue(finalRecord,"createTime",uncookedRecord,"createtime");
					transferValue(finalRecord,"creater",uncookedRecord,"creater");
					transferValue(finalRecord,"driver",uncookedRecord,"driver");
					transferValue(finalRecord,"estimateDate",uncookedRecord,"estimateDate");
					transferValue(finalRecord,"guestMan",uncookedRecord,"guestMan");
					transferValue(finalRecord,"modifyTime",uncookedRecord,"modifytime");
					transferValue(finalRecord,"newsTaskGuid",uncookedRecord,"taskguid");
					transferValue(finalRecord,"newsTaskTitle",uncookedRecord,"tasktitle");
					transferValue(finalRecord,"owEstimateColumnnColumn",uncookedRecord,"owEstimateColumnnColumn");
					transferValue(finalRecord,"otherMan",uncookedRecord,"otherMan");
					transferValue(finalRecord,"ownColumn",uncookedRecord,"owncolumn");
					transferValue(finalRecord,"reporter",uncookedRecord,"reporter");
					transferValue(finalRecord,"taskContent",uncookedRecord,"taskcontent");
					transferValue(finalRecord,"taskKeyword",uncookedRecord,"taskKeyword");
					transferValue(finalRecord,"taskPlace",uncookedRecord,"taskplace");
					transferValue(finalRecord,"taskRemark",uncookedRecord,"taskRemark");
					transferValue(finalRecord,"taskState",uncookedRecord,"taskstate");
					transferValue(finalRecord,"taskStateValue",uncookedRecord,"xuantistate");
					records.put(i, finalRecord);
					recordsSize++;
				}
				}
				for(int i=0;i<todaySelect.size();i++) {
					JSONObject record = JSONObject.fromObject(todaySelect.get(i));
					records.put(i+recordsSize, record);
				}
				finalJson.put("records", records);
		}else {
			JSONObject response = new JSONObject();
			response.put("success", false);
			response.put("errorDesc", "今日选题列表为空");
			finalJson.put("commonResponse", response);
		}
	}else {
		JSONObject response = new JSONObject();
		response.put("success", false);
		response.put("errorDesc", "栏目列表为空");
		finalJson.put("commonResponse", response);
		log.debug("查询到的栏目列表下没有选题");
	}
		return finalJson.toString();
	}
	
	/* 
	 * 此方法只从bs端获取选题
	 */
	@RequestMapping(value="/selectListFromBsNews.do",method=RequestMethod.GET)
	@ResponseBody
	private String selectListFromBsNews() {
		log.debug("HZcontroller selectList方法内部");
		//获取到的是栏目列表
		List<HZColumnItem> list = hZservice.getColumnList();
		JSONObject finalJson = new JSONObject();
		if(list!=null) {
			ArrayList<HZNewsTaskStory> todaySelect = hZservice.getTodaySelect(list);
			if(todaySelect!=null ) {
				JSONObject response = new JSONObject();
				response.put("success", true);
				response.put("errorDesc", "");
				finalJson.put("commonResponse", response);
				JSONObject records = new JSONObject();
				int recordsSize=0;
				for(int i=0;i<todaySelect.size();i++) {
					JSONObject record = JSONObject.fromObject(todaySelect.get(i));
					records.put(i+recordsSize, record);
				}
				finalJson.put("records", records);
		}else {
			JSONObject response = new JSONObject();
			response.put("success", false);
			response.put("errorDesc", "今日选题列表为空");
			finalJson.put("commonResponse", response);
		}
	}else {
		JSONObject response = new JSONObject();
		response.put("success", false);
		response.put("errorDesc", "栏目列表为空");
		finalJson.put("commonResponse", response);
		log.debug("查询到的栏目列表下没有选题");
	}
		return finalJson.toString();
	}
	
	/* 
	 * 本方法只从指挥调度获取选题
	 */
	@RequestMapping(value="/selectListFromNewsCommand.do",method=RequestMethod.GET)
	@ResponseBody
	private String selectListFromNewsCommand() {
		log.debug("HZcontroller selectList方法内部");
		//获取到的是栏目列表
		
		JSONObject finalJson = new JSONObject();
		
			
			NewsCommandMobileSelectListQueryCondition nc = new NewsCommandMobileSelectListQueryCondition();
			String userid = newsCommandMobileService.getUserIdFromProperties();
			String selectListLimit = newsCommandMobileService.getSelectListLimit();
			nc.setUserId(userid);
			nc.setLimit(Integer.parseInt(selectListLimit));//设置杭州台选题列表每次查询数量
			nc.setStart(0);
			String result = newsCommandMobileService.selectProgressList(nc,request);
			JSONObject uncookedResult = JSONObject.fromObject(result);
			
			if(uncookedResult.get("records")!=null) {
				JSONObject response = new JSONObject();
				response.put("success", true);
				response.put("errorDesc", "");
				finalJson.put("commonResponse", response);
				JSONObject records = new JSONObject();
				int recordsSize=0;
				if(uncookedResult.getJSONArray("records").size()>0) {
				JSONArray uncookedRecords = uncookedResult.getJSONArray("records");
				for(int i=0;i<uncookedRecords.size();i++) {
					JSONObject uncookedRecord = JSONObject.fromObject(uncookedRecords.get(i));
					JSONObject finalRecord = new JSONObject();
					transferValue(finalRecord,"reportsource",uncookedRecord,"reportsource");
					transferValue(finalRecord,"arriveTime",uncookedRecord,"arriveTime");
					transferValue(finalRecord,"assistant",uncookedRecord,"assistant");
					transferValue(finalRecord,"batMan",uncookedRecord,"batMan");
					transferValue(finalRecord,"camerist",uncookedRecord,"camerist");
					transferValue(finalRecord,"createTime",uncookedRecord,"createtime");
					transferValue(finalRecord,"creater",uncookedRecord,"creater");
					transferValue(finalRecord,"driver",uncookedRecord,"driver");
					transferValue(finalRecord,"estimateDate",uncookedRecord,"estimateDate");
					transferValue(finalRecord,"guestMan",uncookedRecord,"guestMan");
					transferValue(finalRecord,"modifyTime",uncookedRecord,"modifytime");
					transferValue(finalRecord,"newsTaskGuid",uncookedRecord,"taskguid");
					transferValue(finalRecord,"newsTaskTitle",uncookedRecord,"tasktitle");
					transferValue(finalRecord,"owEstimateColumnnColumn",uncookedRecord,"owEstimateColumnnColumn");
					transferValue(finalRecord,"otherMan",uncookedRecord,"otherMan");
					transferValue(finalRecord,"ownColumn",uncookedRecord,"owncolumn");
					transferValue(finalRecord,"reporter",uncookedRecord,"reporter");
					transferValue(finalRecord,"taskContent",uncookedRecord,"taskcontent");
					transferValue(finalRecord,"taskKeyword",uncookedRecord,"taskKeyword");
					transferValue(finalRecord,"taskPlace",uncookedRecord,"taskplace");
					transferValue(finalRecord,"taskRemark",uncookedRecord,"taskRemark");
					transferValue(finalRecord,"taskState",uncookedRecord,"taskstate");
					transferValue(finalRecord,"taskStateValue",uncookedRecord,"xuantistate");
					records.put(i, finalRecord);
				}
				}
				finalJson.put("records", records);
		}else {
			JSONObject response = new JSONObject();
			response.put("success", false);
			response.put("errorDesc", "今日选题列表为空");
			finalJson.put("commonResponse", response);
		}
	
		return finalJson.toString();
	}
	
	/*
	 * 获取所有文稿
	 */
	@RequestMapping(value="/getManuScriptList.do",method=RequestMethod.GET)
	@ResponseBody
	private String getManuScriptList() {
		log.debug("HZcontroller getManuScriptList方法内部");
		JSONObject finalJson = new JSONObject();
		
		ArrayList<HZNewsStory> manuScriptList = hZservice.getManuScriptList();
		if(manuScriptList!=null) {
			JSONObject response = new JSONObject();
			response.put("success", true);
			response.put("errorDesc", "");
			finalJson.put("commonResponse", response);
			JSONObject records = new JSONObject();
			for(int i =0;i<manuScriptList.size();i++) {
					JSONObject record = JSONObject.fromObject(manuScriptList.get(i));
					records.put(i, record);
			}
			finalJson.put("records", records);
		}else {
			JSONObject response = new JSONObject();
			response.put("success", false);
			response.put("errorDesc", "今日稿件为空");
			finalJson.put("commonResponse", response);
		}
		return finalJson.toString();
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/getYesterdayNewsBillsByCloumn.do",method=RequestMethod.POST)
	@ResponseBody
	private String getYesterdayNewsBillsByCloumn(@RequestBody String column) {
		//最终返回的json类
		JSONObject finalJson = new JSONObject();
		List<HZColumnItem> list = hZservice.getColumnList();
		
		if(column==null|column==""|column.equals("{}")) {
			log.debug("输入栏目名称为空");
			for (HZColumnItem hzColumnItem : list) {
				String columnName = hzColumnItem.getColumnName();
				HZNewsBill bill = hZservice.getNewsBillByColumn(columnName, 1);
				if(bill!=null) {
				
				String billId = bill.getNewsBillGuid();
				List<HZNewsBillItem> item = hZservice.gethzNewsBillItem(billId);
				if(item!=null) {
					finalJson.put("billInfo", bill);
					JSONObject response = new JSONObject();
					response.put("success", true);
					response.put("errorDesc", "");
					finalJson.put("commonResponse", response);
					JSONObject records = new JSONObject();
					for (int i=0;i<item.size();i++) {
						JSONObject record = JSONObject.fromObject(item.get(i));
						records.put(i, record);
					}
					finalJson.put("records", records);
					
				}else {
					log.debug("调用接口查询今日文稿失败");
					JSONObject response = new JSONObject();
					response.put("success", false);
					response.put("errorDesc", "输入栏目名称有误或不在系统记录中");
					finalJson.put("commonResponse", response);
					return finalJson.toString();
				}
				}else {
					log.debug(columnName+"栏目下文稿信息为空");
					JSONObject response = new JSONObject();
					response.put("success", true);
					response.put("errorDesc", columnName+"栏目下文稿信息为空");
					finalJson.put("commonResponse", response);
					return finalJson.toString();
				}
				
				
				
				}
			
			return finalJson.toString();
		}else {
			log.debug("输入栏目名称为:"+column);
		JSONObject columnJson = JSONObject.fromObject(column);
		String columnName = columnJson.get("column").toString();
		String columnname="";
		try {
			columnname = URLDecoder.decode(columnName,"UTF-8");
			log.debug("url解码ing");
		} catch (UnsupportedEncodingException e) {
			log.debug("栏目名称url解码错误");
			e.printStackTrace();
		}
		log.debug("栏目名称"+columnname);
			int contain=0;
		//判断新闻系统中的栏目列表是否包含传进来的这个栏目名字
			
		for (HZColumnItem hzColumnItem : list) {
		if(hzColumnItem.getColumnName().equals(columnname)) {
			contain++;
		}
		}
		//如果包含 则进行下一步
		if(contain==1) {
			log.debug("开始查询栏目下的"+columnname+"文稿");
			//获取一天前的串联单对象
			HZNewsBill bill = hZservice.getNewsBillByColumn(columnname, 1);
			if(bill!=null) {
				
			
			String billId = bill.getNewsBillGuid();
			List<HZNewsBillItem> item = hZservice.gethzNewsBillItem(billId);
			if(item!=null) {
				finalJson.put("billInfo", bill);
				JSONObject response = new JSONObject();
				response.put("success", true);
				response.put("errorDesc", "");
				finalJson.put("commonResponse", response);
				JSONObject records = new JSONObject();
				for (int i=0;i<item.size();i++) {
					JSONObject record = JSONObject.fromObject(item.get(i));
					records.put(i, record);
				}
				finalJson.put("records", records);
				
				
			}else {
				log.debug("调用接口查询今日文稿失败");
				JSONObject response = new JSONObject();
				response.put("success", false);
				response.put("errorDesc", "输入栏目名称有误或不在系统记录中");
				finalJson.put("commonResponse", response);
				return finalJson.toString();
			}
			}else {
				log.debug(columnname+"栏目下文稿信息为空");
				JSONObject response = new JSONObject();
				response.put("success", true);
				response.put("errorDesc", columnname+"栏目下文稿信息为空");
				finalJson.put("commonResponse", response);
				return finalJson.toString();
			}
		}else{
			log.debug("输入栏目名称有误或不在系统记录中");
			JSONObject response = new JSONObject();
			response.put("success", false);
			response.put("errorDesc", "输入栏目名称有误或不在系统记录中");
			finalJson.put("commonResponse", response);
			return finalJson.toString();
		}
		return finalJson.toString();
	}
		
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/getTodayNewsBillsByCloumn.do",method=RequestMethod.POST)
	@ResponseBody
	private String getTodayNewsBillsByCloumn(@RequestBody String column) {
		//最终返回的json类
		JSONObject finalJson = new JSONObject();
		List<HZColumnItem> list = hZservice.getColumnList();
		if(column==null|column==""|column.equals("{}")) {
			log.debug("输入栏目名称为空");
			JSONObject records = new JSONObject();
			int c=0;
			for (HZColumnItem hzColumnItem : list) {
				String columnName = hzColumnItem.getColumnName();
				HZNewsBill bill = hZservice.getNewsBillByColumn(columnName, 0);
				if(bill!=null) {
				String billId = bill.getNewsBillGuid();
				List<HZNewsBillItem> item = hZservice.gethzNewsBillItem(billId);
				if(item!=null) {
					JSONObject response = new JSONObject();
					response.put("success", true);
					response.put("errorDesc", "");
					finalJson.put("commonResponse", response);
					for (int i=0;i<item.size();i++) {
						JSONObject record = JSONObject.fromObject(item.get(i));
						records.put(c, record);
						c++;
					}
				}else {
					log.debug("调用接口查询今日文稿失败");
					JSONObject response = new JSONObject();
					response.put("success", false);
					response.put("errorDesc", "输入栏目名称有误或不在系统记录中");
					finalJson.put("commonResponse", response);
					return finalJson.toString();
				}
				}else {
					log.debug(columnName+"栏目下文稿信息为空");
					JSONObject response = new JSONObject();
					response.put("success", true);
					response.put("errorDesc", columnName+"栏目下文稿信息为空");
					finalJson.put("commonResponse", response);
					return finalJson.toString();
				}}
			finalJson.put("records", records);
			return finalJson.toString();
		}else {
			log.debug("输入栏目名称为:"+column);
		JSONObject columnJson = JSONObject.fromObject(column);
		String columnName = columnJson.get("column").toString();
		String columnname="";
		try {
			columnname = URLDecoder.decode(columnName,"UTF-8");
			log.debug("url解码ing");
		} catch (UnsupportedEncodingException e) {
			log.debug("栏目名称url解码错误");
			e.printStackTrace();
		}
		log.debug("栏目名称"+columnname);
			int contain=0;
		//判断新闻系统中的栏目列表是否包含传进来的这个栏目名字
		for (HZColumnItem hzColumnItem : list) {
		if(hzColumnItem.getColumnName().equals(columnname)) {
			contain++;
		}}
		//如果包含 则进行下一步
		if(contain==1) {
			log.debug("开始查询栏目下的"+columnname+"文稿");
			//获取一天前的串联单对象
			HZNewsBill bill = hZservice.getNewsBillByColumn(columnname, 0);
			if(bill!=null) {
			String billId = bill.getNewsBillGuid();
			List<HZNewsBillItem> item = hZservice.gethzNewsBillItem(billId);
			if(item!=null) {
				finalJson.put("billInfo", bill);
				JSONObject response = new JSONObject();
				response.put("success", true);
				response.put("errorDesc", "");
				finalJson.put("commonResponse", response);
				JSONObject records = new JSONObject();
				for (int i=0;i<item.size();i++) {
					JSONObject record = JSONObject.fromObject(item.get(i));
					records.put(i, record);}
				finalJson.put("records", records);
			}else {
				log.debug("调用接口查询今日文稿失败");
				JSONObject response = new JSONObject();
				response.put("success", false);
				response.put("errorDesc", "输入栏目名称有误或不在系统记录中");
				finalJson.put("commonResponse", response);
				return finalJson.toString();
			}}else {
				log.debug(columnname+"栏目下文稿信息为空");
				JSONObject response = new JSONObject();
				response.put("success", true);
				response.put("errorDesc", columnname+"栏目下文稿信息为空");
				finalJson.put("commonResponse", response);
				return finalJson.toString();}
		}else{
			log.debug("输入栏目名称有误或不在系统记录中");
			JSONObject response = new JSONObject();
			response.put("success", false);
			response.put("errorDesc", "输入栏目名称有误或不在系统记录中");
			finalJson.put("commonResponse", response);
			return finalJson.toString();
		}
		return finalJson.toString();
	}
	}
	@RequestMapping(value="/getTodayColumnList.do",method=RequestMethod.GET)
	@ResponseBody
	public String getColumnList() {
		//
		JSONObject finalJson = new JSONObject();
		JSONObject records = new JSONObject();
		
		//获取所有栏目名称
		List<HZColumnItem> columnNames = hZservice.getColumnList();
		int c=0;
		for (HZColumnItem hzColumnItem : columnNames) {
			//获取栏目下的串联单 如果如果串联单下文稿不为空就为 可用栏目名称
			String columnName = hzColumnItem.getColumnName();
			//根据栏目名称获取该栏目下 第一个 串联单
			HZNewsBill bill = hZservice.getNewsBillByColumn(columnName, 0);
			if(bill!=null) {
				//根据bilid获取文稿信息
				String billGuid = bill.getNewsBillGuid();
				List<HZNewsBillItem> item = hZservice.gethzNewsBillItem(billGuid);
				if(item.size()>0) {
					records.put(c, columnName);
					c++;
				}else {
					log.debug(columnName+"栏目下文稿为空");
				}
			}else {
				log.debug(columnName+"栏目下串联单为空");
			}
		}
		if(c>0) {
			JSONObject response = new JSONObject();
			response.put("success", true);
			response.put("errorDesc", "");
			finalJson.put("commonResponse", response);
			finalJson.put("records", records);
		}else {
			JSONObject response = new JSONObject();
			response.put("success", false);
			response.put("errorDesc", "所有栏目下文稿均为空");
			finalJson.put("commonResponse", response);
			finalJson.put("records", records);
		}
		return finalJson.toString();
	}
	//
	@RequestMapping(value="/getYesterdayColumnList.do",method=RequestMethod.GET)
	@ResponseBody
	public String getYesterdayColumnList() {
		//
		JSONObject finalJson = new JSONObject();
		JSONObject records = new JSONObject();
		
		//获取所有栏目名称
		List<HZColumnItem> columnNames = hZservice.getColumnList();
		int c=0;
		for (HZColumnItem hzColumnItem : columnNames) {
			//获取栏目下的串联单 如果如果串联单下文稿不为空就为 可用栏目名称
			String columnName = hzColumnItem.getColumnName();
			//根据栏目名称获取该栏目下 第一个 串联单
			HZNewsBill bill = hZservice.getNewsBillByColumn(columnName, 1);
			if(bill!=null) {
				//根据bilid获取文稿信息
				String billGuid = bill.getNewsBillGuid();
				List<HZNewsBillItem> item = hZservice.gethzNewsBillItem(billGuid);
				if(item.size()>0) {
					records.put(c, columnName);
					c++;
				}else {
					log.debug(columnName+"栏目下文稿为空");
				}
			}else {
				log.debug(columnName+"栏目下串联单为空");
			}
		}
		if(c>0) {
			JSONObject response = new JSONObject();
			response.put("success", true);
			response.put("errorDesc", "");
			finalJson.put("commonResponse", response);
			finalJson.put("records", records);
		}else {
			JSONObject response = new JSONObject();
			response.put("success", false);
			response.put("errorDesc", "所有栏目下文稿均为空");
			finalJson.put("commonResponse", response);
			finalJson.put("records", records);
		}
		return finalJson.toString();
	}
	
	/*
	 * 热线爆料方法 
	 */
	@RequestMapping(value="/getHotLineScoop.do",method=RequestMethod.POST)
	@ResponseBody
	public String getHotLineScoop() {
		String result = hZservice.getHotLineScoop();
		JSONObject uncookedResult = JSONObject.fromObject(result);
		JSONObject finalResult = new JSONObject();
		
		JSONObject commonResponse = JSONObject.fromObject(uncookedResult.get("commonResponse").toString());
		finalResult.put("commonResponse", commonResponse);
		JSONArray records = JSONArray.fromObject(uncookedResult.getJSONArray("resources").toString());
		finalResult.put("records",records);
		String totalCount = uncookedResult.get("totalCount").toString();
		finalResult.put("totalCount", totalCount);
		String currentPage = uncookedResult.get("currentPage").toString();
		finalResult.put("currentPage", currentPage);
		return finalResult.toString();
	} 
	
	@RequestMapping(value="/getRatingData.do",method=RequestMethod.GET)
	@ResponseBody
	public String getRatingData() {
		JSONObject finalJson = new JSONObject();
		String sc = hZservice.readRatingProperties();
		JSONObject scJson = JSONObject.fromObject(sc);
		finalJson.put("records", scJson);
		return finalJson.toString();
	}
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/putRating.do",method=RequestMethod.POST)
	@ResponseBody
	public String putRating(@RequestBody ColumnRating c) {
		log.debug("putRating...");
		log.debug(c.getColumnRatingName()+":"+c.getColumnRatingValue());
		String columnname = URLDecoder.decode(c.getColumnRatingName());
		String columvalue = URLDecoder.decode(c.getColumnRatingValue());
		log.debug(columnname+":"+columvalue);
		hZservice.writeRatingProperties(columnname,columvalue);
		String sc = hZservice.readRatingProperties();
		log.debug("getRatingData!!!");
		return sc;
	}
	@RequestMapping(value="/cleanRatings.do",method=RequestMethod.GET)
	@ResponseBody
	public String cleanRatings() {
		log.debug("进入cleanratings 方法");
		hZservice.CleanRatingsProperties();
		log.debug("结束cleanratings 方法");
		return "all data have been cleared";
	}
	@RequestMapping(value="/HZTodayOnHistory.do",method=RequestMethod.POST)
	@ResponseBody
	public String HZTodayOnHistory() {
		log.debug("进入HZTodayOnHistory 方法");
		JSONObject finalJson = new JSONObject();
		JSONArray records = new JSONArray();
									/*JSONObject commonResponse = new JSONObject();
									commonResponse.put("success", true);
									commonResponse.put("errorDesc", "未能从媒资获取合理数据");*/
		int count=0;
		for(int i=1;i<8;i++) {
			String sameDay = getSameDay(i);
			ArrayList<JSONObject> array = hZservice.getHZTodayOnHistory(sameDay);
			log.debug("controller");
			if(array.size()>0) {
				log.debug("arraysize>0");
				for (JSONObject object : array) {
					log.debug("uniqid1");
					String resourceUniqueID = object.get("resourceUniqueID").toString();
					log.debug("uniqid2");
					JSONObject detail = hzzservice.getItemDetail(resourceUniqueID);
					if(detail!=null) {
						String channelName = detail.get("channelName").toString();
						if(channelName!=null&&channelName!="") {
							object.put("channelName", channelName);
						}
						String columnName = detail.get("columnName").toString();
						if(columnName!=null&&columnName!="") {
							object.put("columnName", columnName);
						}
						object.put("firstShowDate", sameDay);
						records.add(count, object);
						count++;
					}
				}
			}else {
				log.debug(sameDay+"返回数据为空");
				
			}
		}
		if(records.size()>0) {
			log.debug("records size大于零");
			JSONObject commonResponse = new JSONObject();
			commonResponse.put("success", true);
			commonResponse.put("errorDesc", "");
			finalJson.put("commonResponse", commonResponse);
			finalJson.put("records", records);
		}else {
			log.debug("records size为零");
			JSONObject commonResponse = new JSONObject();
			commonResponse.put("success", false);
			commonResponse.put("errorDesc", "媒资库中未查询到数据");
			finalJson.put("commonResponse", commonResponse);
		}
		log.debug("结束HZTodayOnHistory 方法");
		return finalJson.toString();
	}
	//获取过去的年
	public String getSameDay(int years) {
		Date date = new Date();
		long time = date.getTime();
		SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");
		SimpleDateFormat formatDate = new SimpleDateFormat("MM-dd");
		String year = formatYear.format(time);
		log.debug(year);
		String today = formatDate.format(time);
		log.debug(today);
		int thisYear = Integer.parseInt(year);
		int targetYear=thisYear-years;
		String targetDate=targetYear+"-"+today;
		log.debug("目标日期："+targetDate);
		return targetDate;
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
