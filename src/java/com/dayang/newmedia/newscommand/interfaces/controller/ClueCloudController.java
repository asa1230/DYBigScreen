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

import com.ctc.wstx.util.StringUtil;
import com.dayang.newmedia.newscommand.interfaces.db.model.ClueCloudInterfaceQueryCondition1;
import com.dayang.newmedia.newscommand.interfaces.db.model.ClueCloudIterfaceQueryCondition;
import com.dayang.newmedia.newscommand.interfaces.service.ClueCloudService;
import com.mashape.unirest.http.Unirest;
import com.mysql.jdbc.PingTarget;

import antlr.StringUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/clueCloudInterface")
public class ClueCloudController {
	private Logger log = LoggerFactory.getLogger(ClueCloudController.class);
	
	@Autowired
	private ClueCloudService clueCloudService;
	
	/**
	 * 线索云调用调用线索云的接口用来查询 网页 微博 微信 资源的方法 
	 * @return
	 */
	@RequestMapping(value="/getClueList.do", method = RequestMethod.POST)
	@ResponseBody
	public String getClueList(@RequestBody ClueCloudIterfaceQueryCondition paramss) {
		log.debug("进入方法getClueList.do中...");
		log.debug("本次调用getClueList方法所携带的参数"+paramss.toString());
			//在service层调用  线索云 接口获取数据
			String result = clueCloudService.getClueList(paramss);
			//创建object对象封装接口传出的结果
			JSONObject finalResult = new JSONObject();
			//将从线索云获取的数据转化成未处理(uncooked)的json对象
			JSONObject uncookedResult = JSONObject.fromObject(result);
			
			//如果此json对象的success值为true 说明调用接口成功 并且成功获取数据
			if(JSONObject.fromObject(uncookedResult.get("commonResponse")).getBoolean("success")){
			log.debug("线索云接口调用成功！返回参数commonResponse的 success 值为 true");
			//封装接口响应描述
			JSONObject commonResponse = new JSONObject();
			commonResponse.put("success", true);
			commonResponse.put("errorDesc", "");
			finalResult.put("commonResponse", commonResponse);
			//将接口响应中的resource数据封装到records中
			JSONObject records = new JSONObject();
			JSONArray resources = uncookedResult.getJSONArray("resources");
			for(int i=0;i<resources.size();i++) {
				JSONObject resource = resources.getJSONObject(i);
				JSONObject record = new JSONObject();
			
				//根据不同的线索类型 设置不同的标题 图片 内容等相关信息
				if(resource.get("resourceMediaType").toString().equals("资讯")) {
					record.put("resourceOriginTypeName", "网页");
				}else {
				record.put("resourceOriginTypeName", resource.get("resourceMediaType"));
				}
				
				//根据不同的线索类型 对内容参数做调整 
				if(resource.get("resourceMediaType").toString().equals("微博")) {
					//微博没有摘要 summary 因此 把title 作为展示内容
						record.put("content", resource.get("title").toString());
						//1标题还是标题
						String title = resource.get("title").toString();
						record.put("title",title);
						//2从微博的 contentRow 中获取微博的 图片放在展示位
						String contentRawtext = resource.get("contentRaw").toString();
						String picurl = blogPicFromContentRow(contentRawtext);
						record.put("attachFileOne", picurl);
						//如果在contentRow中不能获取图片，那就用首个图片代替，并放在展示位
						if(picurl==null || picurl.equals("")) {
							record.put("attachFileOne", resource.get("firstImagePath"));	
						}
				}else if(resource.get("resourceMediaType").toString().equals("微信")) {
					
					//1标题还是标题
					String title = resource.get("title").toString();
					record.put("title",title);
					
					String contentRawtext = resource.get("contentRaw").toString();
					String picurl = chatPicFromContentRow(contentRawtext);
					record.put("attachFileOne", picurl);
					if(picurl==null || picurl.equals("")) {
						record.put("attachFileOne", resource.get("firstImagePath"));	
					}
					//设置微信 概要为内容
					String summary = resource.get("summary").toString();
					record.put("content", summary);
				}
				else {
					//1设置互联网线索 标题
					String title = resource.get("title").toString();
					record.put("title",title);
					//2设置互联网展示图片
					record.put("attachFileOne", resource.get("firstImagePath"));
					if(resource.get("navigation")!=null && resource.get("navigation")!="") {
						record.put("navigation", resource.get("navigation"));
					}
					//3设置互联网内容，取自摘要
					String summary = resource.get("summary").toString();
					record.put("content", summary);
				}
				
				//资源归类名称
				record.put("sourceClassifyName", resource.get("sourceClassifyName"));
				//线索唯一id
				record.put("resourceId", resource.get("resourceGuid"));
				//话题代码
				record.put("topicCode", resource.get("topicCode"));
				//动态数据 点击量 转载情况 等
				record.put("dynamicData", JSONObject.fromObject(resource.get("dynamicData").toString()));
				//作者信息
				record.put("author", resource.get("author"));
				//源网站地址
				record.put("resourceOriginAddress", resource.get("sourceAddr"));
				//创建时间
				record.put("createdTime", resource.get("createTime"));
				//线索的全部正文
				record.put("allContent", resource.get("contentRaw"));
				//线索网站名称
				record.put("siteName", resource.get("siteName"));
				records.put(i, record);
			}
			finalResult.put("records", records);
			
			finalResult.put("totalCount", uncookedResult.get("totalCount"));
			finalResult.put("limit", uncookedResult.get("limit"));
			finalResult.put("currentPage", uncookedResult.get("currentPage"));
		}else{
			log.debug("接口响应success值不为true");
		};
		
		
		try {
			String result1 = new String(finalResult.toString().getBytes("utf-8"),"UTF-8");
			return result1;
		} catch (UnsupportedEncodingException e) {
			log.debug("返回结果，转码失败");
			e.printStackTrace();
		}
		return result;
	}
	
	@RequestMapping(value="/getClueListByKeyWord.do", method = RequestMethod.POST)
	@ResponseBody
	public String getClueListByKeyWord(@RequestBody ClueCloudInterfaceQueryCondition1 paramss) {

		log.debug("进入方法getClueList.do中...");
		log.debug("本次调用getClueList方法所携带的参数"+paramss.toString());
			//在service层调用  线索云 接口获取数据
			String result = clueCloudService.getClueListByKeyWord(paramss);
			//创建object对象封装接口传出的结果
			JSONObject finalResult = new JSONObject();
			//将从线索云获取的数据转化成未处理(uncooked)的json对象
			JSONObject uncookedResult = JSONObject.fromObject(result);
			
			//如果此json对象的success值为true 说明调用接口成功 并且成功获取数据
			if(JSONObject.fromObject(uncookedResult.get("commonResponse")).getBoolean("success")){
			log.debug("线索云接口调用成功！返回参数commonResponse的 success 值为 true");
			//封装接口响应描述
			JSONObject commonResponse = new JSONObject();
			commonResponse.put("success", true);
			commonResponse.put("errorDesc", "");
			finalResult.put("commonResponse", commonResponse);
			//将接口响应中的resource数据封装到records中
			JSONObject records = new JSONObject();
			JSONArray resources = uncookedResult.getJSONArray("resources");
			for(int i=0;i<resources.size();i++) {
				JSONObject resource = resources.getJSONObject(i);
				JSONObject record = new JSONObject();
			
				//根据不同的线索类型 设置不同的标题 图片 内容等相关信息
				if(resource.get("resourceMediaType").toString().equals("资讯")) {
					record.put("resourceOriginTypeName", "网页");
				}else {
				record.put("resourceOriginTypeName", resource.get("resourceMediaType"));
				}
				
				//根据不同的线索类型 对内容参数做调整 
				if(resource.get("resourceMediaType").toString().equals("微博")) {
						//微博没有摘要 summary 因此 把title 作为展示内容
						record.put("content", resource.get("title").toString());
						//1从微博的 contentRow 中获取微博的 图片放在展示位
						String contentRawtext = resource.get("contentRaw").toString();
						String picurl = blogPicFromContentRow(contentRawtext);
						record.put("attachFileOne", picurl);
						//如果在contentRow中不能获取图片，那就用首个图片代替，并放在展示位
						if(picurl==null || picurl.equals("")) {
							record.put("attachFileOne", resource.get("firstImagePath"));	
						}
				}else if(resource.get("resourceMediaType").toString().equals("微信")) {
					String contentRawtext = resource.get("contentRaw").toString();
					String picurl = chatPicFromContentRow(contentRawtext);
					record.put("attachFileOne", picurl);
					if(picurl==null || picurl.equals("")) {
						record.put("attachFileOne", resource.get("firstImagePath"));	
					}
					//设置微信 概要为内容
					String summary = resource.get("summary").toString();
					record.put("content", summary);
				}
				else {
					//1设置互联网展示图片
					record.put("attachFileOne", resource.get("firstImagePath"));
					if(resource.get("navigation")!=null && resource.get("navigation")!="") {
						record.put("navigation", resource.get("navigation"));
					}
					//2设置互联网内容，取自摘要
					String summary = resource.get("summary").toString();
					record.put("content", summary);
				}
				//1设置互联网线索 标题
				record.put("title",resource.get("title").toString());
				//资源归类名称
				record.put("sourceClassifyName", resource.get("sourceClassifyName"));
				//线索唯一id
				record.put("resourceId", resource.get("resourceGuid"));
				//话题代码
				record.put("topicCode", resource.get("topicCode"));
				//动态数据 点击量 转载情况 等
				record.put("dynamicData", JSONObject.fromObject(resource.get("dynamicData").toString()));
				//作者信息
				record.put("author", resource.get("author"));
				//源网站地址
				record.put("resourceOriginAddress", resource.get("sourceAddr"));
				//创建时间
				record.put("createdTime", resource.get("createTime"));
				//线索的全部正文
				record.put("allContent", resource.get("contentRaw"));
				//线索网站名称
				record.put("siteName", resource.get("siteName"));
				records.put(i, record);
			}
			finalResult.put("records", records);
			
			finalResult.put("totalCount", uncookedResult.get("totalCount"));
			finalResult.put("limit", uncookedResult.get("limit"));
			finalResult.put("currentPage", uncookedResult.get("currentPage"));
		}else{
			log.debug("接口响应success值不为true");
		};
		
		
		try {
			String result1 = new String(finalResult.toString().getBytes("utf-8"),"UTF-8");
			return result1;
		} catch (UnsupportedEncodingException e) {
			log.debug("返回结果，转码失败");
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private String chatPicFromContentRow(String contentRawtext) {
		try {
			int img = contentRawtext.indexOf("<img");
			String string = contentRawtext.substring(img, contentRawtext.length());
			int http = string.indexOf("https");
			int jpg = string.indexOf("jpeg");
			String finala = string.substring(http, jpg+4);
			return finala;
		} catch (Exception e) {
				log.debug("从contentRawtext中获取微信图片失败");
		}
		
		return null;
	}

	private String blogPicFromContentRow(String contentRawtext) {
		try {
			int img = contentRawtext.indexOf("<img");
			String string = contentRawtext.substring(img, contentRawtext.length());
			int http = string.indexOf("http");
			int jpg = string.indexOf("jpg");
			String finala = string.substring(http, jpg+3);
			return finala;
		} catch (Exception e) {
				log.debug("从contentRawtext中获取微博图片失败");
		}
		
		return null;
	}

	private String changeLengthDiy(String title,int len) {
		if(title.length()>len) {
			return title.substring(0, len-1)+"...";
		}
		else {
			return title;
		}
		
	}
	
	
}
