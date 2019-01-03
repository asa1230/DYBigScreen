package com.dayang.newmedia.newscommand.interfaces.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.UUID;

import javax.xml.rpc.ServiceException;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dayang.commons.MD5Util;
import com.dayang.commons.StringUtil;
import com.dayang.newmedia.newscommand.interfaces.controller.ClueCloudController;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZColumnItem;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZColumnRatingList;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZNewsBill;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZNewsBillItem;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZNewsStory;
import com.dayang.newmedia.newscommand.interfaces.db.model.HZNewsTaskStory;
import com.dayang.newmedia.newscommand.interfaces.utils.MapKeyComparator;
import com.dayang.www.DYESB.GetItemDetailServiceLocator;
import com.dayang.www.DYESB.GetItemDetailServiceSoapBindingStub;
import com.dayang.www.DYESB.QueryBindingStub;
import com.dayang.www.DYESB.QueryServiceLocator;

import MREML_pkg.ExtendAttribute;
import MREML_pkg.MREMLMREML;
import MREML_pkg.MREMLMREMLEnvelopEntity;
import MREML_pkg.ResourceEntityResourceMetaDataInfo;
import MREML_pkg.ResourceEntityResourceMetaDataInfoDescription;
import MREML_pkg.ResourceEntityResourceMetaDataInfoDescriptionColumn;
import MREML_pkq.AuditInfo;
import MREML_pkq.EMIEntity;
import MREML_pkq.EnvelopEntity;
import MREML_pkq.MREML;
import MREML_pkq.MREMLType0;
import MREML_pkq.RequestEntity;
import MREML_pkq.RequestEntityRequestExtendMSG;
import MREML_pkq.RequestEntityRequestExtendMSGQueryRequest;
import MREML_pkq.RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion;
import MREML_pkq.RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition;
import MREML_pkq.RequestEntityRequestExtendMSGQueryRequestLimitation;
import MREML_pkq.ResourceEntity;
import localhost.wenews.services.billMonitor.BillMonitorImpServiceLocator;
import localhost.wenews.services.billMonitor.BillMonitorSoapBindingStub;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class HZservice {
	private Logger log = LoggerFactory.getLogger(HZservice.class);

	/*
	 * 杭州最新新闻接口路径在配置文件中获取
	 */
	@Value(value = "${HZ.latestNews.url}")
	private String latestNewsUrl;
	@Value(value = "${HZ.latestNews.count}")
	private int latestNewsCount;

	/*
	 * 调用厚建接口 获取 杭州最新新闻
	 */
	public String getLatestNews() {
		log.debug("===================class hzservice 方法 getlatestnews 开始================= ");
		log.debug("杭州最新新闻调用接口路径" + latestNewsUrl);
		CloseableHttpClient httpClient = HttpClients.createDefault();
		// 此处制定每次传入接口的参数
		String countString = "?count=";
		log.debug("最终调用接口路径和参数:" + latestNewsUrl + countString + latestNewsCount);
		HttpGet httpGet = new HttpGet(latestNewsUrl + countString + latestNewsCount);
		try {
			CloseableHttpResponse response = httpClient.execute(httpGet);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				log.debug("接口调通 返回状态码为200");
				String result = EntityUtils.toString(response.getEntity(), "utf-8");
				JSONArray jsonArray = JSONArray.fromObject(result);
				log.debug("杭州接口 最新新闻 返回的数据：" + jsonArray.toString());
				return jsonArray.toString();
			}
		} catch (ClientProtocolException e) {
			log.debug("杭州最新新闻 接口调用错误error");
			e.printStackTrace();
		} catch (IOException e) {
			log.debug("error");
			e.printStackTrace();
		}
		return "error";
	}

	/*
	 * 调用厚建(又从道顺获取)接口获取热点排行
	 */
	@Value(value = "${HZ.hotPoint.url}")
	private String hotPointUrl;
	@Value(value = "${HZ.hotPoint.appid}")
	private String hotPointAppid;
	@Value(value = "${HZ.hotPoint.appsecret}")
	private String hotPointSecret;
	@Value(value = "${HZ.hotPoint.count}")
	private int hotPointCount;
	@Value(value = "${HZ.hotPoint.page}")
	private int hotPointPage;
	
	

	public String getHotPoints() throws ClientProtocolException, IOException {
		// 一 >>>>>>> 生成签名sign
		// 参数封装
		HashMap<String, String> paramsMap = new HashMap<>();
		// 1 appid
		paramsMap.put("app_id", hotPointAppid);
		// 2 时间戳
		Date date = new Date();
		long time = date.getTime();
		paramsMap.put("time_stamp", time + "");
		// 3随机字符串
		String randomString = getRandomString(20);
		paramsMap.put("nonce_str", randomString);
		// 4当前page
		paramsMap.put("page", hotPointPage + "");
		// 5每页条数
		paramsMap.put("count", hotPointCount + "");
		// 对hashmap排序
		Map<String, String> sortedMap = sortMapByKey(paramsMap);
		String uncookedString = sortedMap.toString().replace(", ", "&");
		String stringA = uncookedString.substring(1, uncookedString.length() - 1);
		String stringSignTemp = stringA + "&app_secert=" + hotPointSecret;
		String sign = MD5Util.getMD5Str(stringSignTemp).toUpperCase();
		CloseableHttpClient client = HttpClients.createDefault();
		String finalUrl = hotPointUrl+"?"
				+ "app_id="+hotPointAppid+"&time_stamp=" + time + "&nonce_str=" + randomString + "&page=" + hotPointPage
				+ "&count=" + hotPointCount + "&sign=" + sign;
		log.debug("热点排行请求接口路径带参:" + finalUrl);
		HttpGet get = new HttpGet(finalUrl);
		CloseableHttpResponse response = client.execute(get);
		HttpEntity entity = response.getEntity();
		String result = EntityUtils.toString(entity, "utf-8");
		EntityUtils.consume(entity);
		log.debug("道顺服务器获取的最新新闻result:" + result);
		
		return result;
	}

	/*
	 * 获取政务问答数据 
	 */
	@Value(value = "${HZ.politics.url}")
	private String politicsUrl;
	@Value(value = "${HZ.politics.count}")
	private int politicsCount;
	@Value(value = "${HZ.politics.page}")
	private int politicsPage;
	public String getPtList() throws ClientProtocolException, IOException {
		// 一 >>>>>>> 生成签名sign
		// 参数封装
		HashMap<String, String> paramsMap = new HashMap<>();
		// 1 appid
		paramsMap.put("app_id", hotPointAppid);
		// 2 时间戳
		Date date = new Date();
		long time = date.getTime();
		paramsMap.put("time_stamp", time +"");
		// 3随机字符串
		String randomString = getRandomString(20);
		paramsMap.put("nonce_str", randomString);
		// 4当前page
		paramsMap.put("page", politicsPage + "");
		// 5每页条数
		paramsMap.put("count", politicsCount + "");
		// 对hashmap排序
		Map<String, String> sortedMap = sortMapByKey(paramsMap);
		String uncookedString = sortedMap.toString().replace(", ", "&");
		String stringA = uncookedString.substring(1, uncookedString.length() - 1);
		String stringSignTemp = stringA + "&app_secert=" + hotPointSecret;
		String sign = MD5Util.getMD5Str(stringSignTemp).toUpperCase();
		CloseableHttpClient client = HttpClients.createDefault();
		String finalUrl = politicsUrl+"?"
				+ "app_id="+hotPointAppid+"&time_stamp=" + time + "&nonce_str=" + randomString + "&page=" + politicsPage
				+ "&count=" + politicsCount + "&sign=" + sign;
		log.debug("政务帮办请求接口路径带参:" + finalUrl);
		HttpGet get = new HttpGet(finalUrl);
		CloseableHttpResponse response = client.execute(get);
		HttpEntity entity = response.getEntity();
		String result = EntityUtils.toString(entity, "utf-8");
		EntityUtils.consume(entity);
		log.debug("从道顺获取的政务问答result:" + result);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 调用上海新闻接口返回栏目列表 即 所有栏目的列表
	 */
	@Value(value = "${HZ.DYNewsService.url}")
	private String bsNewsUrl;// bs新闻的接口路径

	public List<HZColumnItem> getColumnList() {
		log.debug("service getColumnList方法");
		ArrayList<HZColumnItem> list = null;
		try {
			BillMonitorImpServiceLocator locator = new BillMonitorImpServiceLocator();
			locator.setEndpointAddress("billMonitor", bsNewsUrl);
			BillMonitorSoapBindingStub b = (BillMonitorSoapBindingStub) locator
					.getPort(BillMonitorSoapBindingStub.class);
			String columnList = b
					.getBill("<NewsRequest><NewsBill><RequestType>2</RequestType></NewsBill></NewsRequest>");

			Document doc = DocumentHelper.parseText(columnList);
			Element rootElement = doc.getRootElement();
			System.out.println(rootElement.getName());
			Iterator iterator = rootElement.elementIterator("ColumnItem");
			list = new ArrayList<>();

			while (iterator.hasNext()) {
				Element ColumnItem = (Element) iterator.next();
				if (ColumnItem.elementTextTrim("IsValid").equals("1")) {

					HZColumnItem item = new HZColumnItem();

					String ColumnName = ColumnItem.elementTextTrim("ColumnName");
					item.setColumnName(ColumnName);
					System.out.println(ColumnName);

					String OwnChannel = ColumnItem.elementTextTrim("OwnChannel");
					item.setOwnChannel(OwnChannel);
					System.out.println(OwnChannel);

					String ColumnLength = ColumnItem.elementTextTrim("ColumnLength");
					item.setColumnLength(Integer.parseInt(ColumnLength));
					System.out.println(ColumnLength);

					list.add(item);
				} else {
					log.debug(ColumnItem.elementTextTrim("ColumnName") + "栏目无效");
				}
			}
		} catch (Exception e) {
			log.debug("调用栏目列表接口出错或装填栏目列表出错");
			e.printStackTrace();
		}
		return list;
	}

	/*
	 * 调用上海新闻接口返回今日选题 数据
	 */
	@Value(value = "${HZ.DYNewsService.SelectNewsstate}")
	private String SelectNewsstate;//文稿状态可配置
	
	public ArrayList<HZNewsTaskStory> getTodaySelect(List<HZColumnItem> list) {
		log.debug("service getTodaySelect方法");
		// 封装选题列表的返回对象
		ArrayList<HZNewsTaskStory> HZNewsTaskStoryList = new ArrayList<>();

		try {
			BillMonitorImpServiceLocator locator = new BillMonitorImpServiceLocator();
			locator.setEndpointAddress("billMonitor", bsNewsUrl);
			BillMonitorSoapBindingStub b = (BillMonitorSoapBindingStub) locator
					.getPort(BillMonitorSoapBindingStub.class);

			for (HZColumnItem hzColumnItem : list) {
				Date todayDate = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String dateString = dateFormat.format(todayDate);

				String columnName = hzColumnItem.getColumnName();
				log.debug("查询<" + columnName + ">栏目下的选题");
				log.debug("查询newsstate 为 "+SelectNewsstate+"的选题");
				 String columnSelectlist = b.getBill("<NewsRequest>" + "<NewsBill>" +
				 "<RequestType>7</RequestType>" + "<FromTime>"+dateString+" 00:00:00</FromTime>" + "<EndTime>"+dateString+" 23:59:59</EndTime>" +
				 "<newsstate>"+SelectNewsstate+"</newsstate>"+"<owncolumn></owncolumn>" +
				 "</NewsBill>" + "</NewsRequest>");
				log.debug("获取到的选题结果:" + columnSelectlist);
				// 判断是否获取数据
				if (!columnSelectlist.equals("选题列表查询请求处理失败")&&!columnSelectlist.equals("查询请求的条件不正确")) {
					Document doc = DocumentHelper.parseText(columnSelectlist);
					Element root = doc.getRootElement();
					Iterator ite = root.elementIterator("NewsTaskStory");
					while (ite.hasNext()) {
						HZNewsTaskStory hzNewsTaskStory = new HZNewsTaskStory();

						Element NewsTaskStory = (Element) ite.next();
						if (NewsTaskStory.elementTextTrim("NewsTaskGuid") != null) {
							String NewsTaskGuid = NewsTaskStory.elementTextTrim("NewsTaskGuid");
							hzNewsTaskStory.setNewsTaskGuid(NewsTaskGuid);
						}
						if (NewsTaskStory.elementTextTrim("Creater") != null) {
							String Creater = NewsTaskStory.elementTextTrim("Creater");
							hzNewsTaskStory.setCreater(Creater);

						}
						if (NewsTaskStory.elementTextTrim("NewsTaskTitle") != null) {
							String NewsTaskTitle = NewsTaskStory.elementTextTrim("NewsTaskTitle");
							hzNewsTaskStory.setNewsTaskTitle(NewsTaskTitle);
						}
						if (NewsTaskStory.elementTextTrim("TaskState") != null) {
							String TaskState = NewsTaskStory.elementTextTrim("TaskState");
							hzNewsTaskStory.setTaskState(TaskState);

						}
						if (NewsTaskStory.elementTextTrim("OwnColumn") != null) {
							String OwnColumn = NewsTaskStory.elementTextTrim("OwnColumn");
							hzNewsTaskStory.setOwnColumn(OwnColumn);
						}
						if (NewsTaskStory.elementTextTrim("TaskContent") != null) {
							String TaskContent = NewsTaskStory.elementTextTrim("TaskContent");
							hzNewsTaskStory.setTaskContent(TaskContent);
						}
						HZNewsTaskStoryList.add(hzNewsTaskStory);
					}

				} else {
					log.debug("未能查询到当前栏目下的选题 errorMessage:" + columnSelectlist);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.debug("service返回选题列表长度" + HZNewsTaskStoryList.size());
		return HZNewsTaskStoryList;
	}

	/*
	 * 调用上海接口获取今日稿件接口(今日创建并已审的稿件)
	 */
	@Value(value = "${HZ.DYNewsService.ManuScriptNewsstate}")
	private String ManuScriptNewsstate;//文稿状态可配置
	public ArrayList<HZNewsStory> getManuScriptList() {
		log.debug("HZservice 中getManuScriptList()方法");
		// 用于封装返回参数(稿件)的列表实体类
		ArrayList<HZNewsStory> HZNewsStoryList = new ArrayList<>();
		try {
			BillMonitorImpServiceLocator locator = new BillMonitorImpServiceLocator();
			locator.setEndpointAddress("billMonitor", bsNewsUrl);
			BillMonitorSoapBindingStub b = (BillMonitorSoapBindingStub) locator
					.getPort(BillMonitorSoapBindingStub.class);
			// 针对每个栏目进行稿件查询
				Date todayDate = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String dateString = dateFormat.format(todayDate);
				log.debug("查询newsstate 为 "+ManuScriptNewsstate+"的 稿 件");
				
				String manuScriptListXml = b.getBill("<NewsRequest>" + "<NewsBill>" + "<RequestType>5</RequestType>"
						+ "<FromTime>" + dateString + " 00:00:00</FromTime>" + "<EndTime>" + dateString
						+ " 23:59:59</EndTime>" + "<newsstate>"+ManuScriptNewsstate+"</newsstate>" + "<owncolumn>" + 
						 "</owncolumn> " + "</NewsBill>" + "</NewsRequest>");
				log.debug("bs新闻接口查询稿件获取到的信息:" + manuScriptListXml);
				// 判断是否获取数据
				if (!manuScriptListXml.equals("稿件列表查询请求处理失败")) {
					Document doc = DocumentHelper.parseText(manuScriptListXml);
					Element root = doc.getRootElement();
					Iterator iterator = root.elementIterator("NewsStory");
					while (iterator.hasNext()) {
						HZNewsStory hzNewsStory = new HZNewsStory();
						Element newsStory = (Element) iterator.next();

						if (newsStory.elementTextTrim("Creater") != null) {
							hzNewsStory.setCreater(newsStory.elementTextTrim("Creater"));
						}
						if (newsStory.elementTextTrim("NewsTitle") != null) {
							hzNewsStory.setNewsTitle(newsStory.elementTextTrim("NewsTitle"));
						}
						if (newsStory.elementTextTrim("NewsContent") != null) {
							hzNewsStory.setNewsContent(newsStory.elementTextTrim("NewsContent"));
						}
						if (newsStory.elementTextTrim("NewsState") != null) {
							hzNewsStory.setNewsState(newsStory.elementTextTrim("NewsState"));
						}
						if (newsStory.elementTextTrim("VideoState") != null) {
							hzNewsStory.setVideoState(newsStory.elementTextTrim("VideoState"));
						}
						if (newsStory.elementTextTrim("DubState") != null) {
							hzNewsStory.setDubState(newsStory.elementTextTrim("DubState"));
						}
						if (newsStory.elementTextTrim("AuditState") != null) {
							hzNewsStory.setAuditState(newsStory.elementTextTrim("AuditState"));
						}
						if (newsStory.elementTextTrim("NewsSource") != null) {
							hzNewsStory.setNewsSource(newsStory.elementTextTrim("NewsSource"));
						}
						if (newsStory.elementTextTrim("Modifier") != null) {
							hzNewsStory.setModifier(newsStory.elementTextTrim("Modifier"));
						}
						if (newsStory.elementTextTrim("ModifyTime") != null) {
							hzNewsStory.setModifier(newsStory.elementTextTrim("ModifyTime"));
						}
						if (newsStory.elementTextTrim("NewsGuid") != null) {
							hzNewsStory.setNewsGuid(newsStory.elementTextTrim("NewsGuid"));
						}
						if (newsStory.elementTextTrim("OwnColumn") != null) {
							hzNewsStory.setOwnColumn(newsStory.elementTextTrim("OwnColumn"));
						}
						HZNewsStoryList.add(hzNewsStory);
					}
				} else {
					log.debug("未能获取到xml格式的返回值 errorMessage:" + manuScriptListXml);
				}
			return HZNewsStoryList;
		} catch (Exception e) {
			log.debug("bs新闻接口调用失败");
			e.printStackTrace();
		}
		log.debug("service返回稿件列表长度为:" + HZNewsStoryList.size());
		return HZNewsStoryList;
	}

	/*
	 * 根据栏目名称获取串联单列表中第一个
	 * 
	 */
	public HZNewsBill getNewsBillByColumn(String columnName, int days) {
		HZNewsBill hzNewsBill = null;
		try {
			BillMonitorImpServiceLocator locator = new BillMonitorImpServiceLocator();
			locator.setEndpointAddress("billMonitor", bsNewsUrl);
			BillMonitorSoapBindingStub b = (BillMonitorSoapBindingStub) locator
					.getPort(BillMonitorSoapBindingStub.class);
			/*
			 * String newsBills = b .getBill(
			 * "<NewsRequest><NewsBill><RequestType>2</RequestType></NewsBill></NewsRequest>"
			 * );
			 */
			String yesterday = getDateCondition(days);

			String newsBills = b
					.getBill("<NewsRequest>" + "<NewsBill>" + "<RequestType>3</RequestType>" + "<RequestValue>"
							+ columnName + "</RequestValue>" + "<FromTime>" + yesterday + " 00:00:00</FromTime>"
							+ "<EndTime>" + yesterday + " 23:59:59</EndTime>" + "</NewsBill>" + "</NewsRequest>");
			log.debug("获取到的串联单列表信息为：" + newsBills);

			if (!newsBills.equals("收到串联单列表查询请求处理失败")) {
				Document doc = DocumentHelper.parseText(newsBills);
				Element Newsbills = doc.getRootElement();
				Iterator ite = Newsbills.elementIterator("NewsBill");
				if (ite.hasNext()) {
					hzNewsBill = new HZNewsBill();
					Element NewsBill = (Element) ite.next();
					if (NewsBill.elementTextTrim("newsBillGuid") != null) {
						hzNewsBill.setNewsBillGuid(NewsBill.elementTextTrim("newsBillGuid"));
					}
					if (NewsBill.elementTextTrim("billTitle") != null) {
						hzNewsBill.setBillTitle(NewsBill.elementTextTrim("billTitle"));
					}
					if (NewsBill.elementTextTrim("columnDate") != null) {
						hzNewsBill.setColumnDate(NewsBill.elementTextTrim("columnDate"));
					}
					if (NewsBill.elementTextTrim("columnName") != null) {
						hzNewsBill.setColumnName(NewsBill.elementTextTrim("columnName"));
					}
					if (NewsBill.elementTextTrim("broadTime") != null) {
						hzNewsBill.setBroadTime(NewsBill.elementTextTrim("broadTime"));
					}
					return hzNewsBill;
				} else {
					log.debug("串联单遍历失败 串联单为空");
					return null;
				}
			} else {
				log.debug("接口调用失败 收到串联单列表查询请求处理失败");
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * 根据串联单的id 获取文稿列表
	 * 
	 */
	public ArrayList<HZNewsBillItem> gethzNewsBillItem(String billId) {
		ArrayList<HZNewsBillItem> hZNewsBillItemList = new ArrayList<>();
		try {
			BillMonitorImpServiceLocator locator = new BillMonitorImpServiceLocator();
			locator.setEndpointAddress("billMonitor", bsNewsUrl);
			BillMonitorSoapBindingStub b = (BillMonitorSoapBindingStub) locator
					.getPort(BillMonitorSoapBindingStub.class);
			String resultXml = b.getBill("<NewsRequest>" + 
					"<NewsBill>" + 
					"<RequestType>1</RequestType>" + 
					"<RequestValue>"+billId+"</RequestValue>" + 
					"</NewsBill>" + 
					"</NewsRequest>");
			if(!resultXml.equals("收到串联单条目列表查询请求处理失败")) {
				 Document doc = DocumentHelper.parseText(resultXml);
				Element newsBillXml = doc.getRootElement();
				Iterator ite = newsBillXml.elementIterator("NewsBillItem");
				while(ite.hasNext()) {
					HZNewsBillItem hzNewsBillItem = new HZNewsBillItem();
					Element newsBillItemXml=(Element)ite.next();
					if(newsBillItemXml.elementTextTrim("newsGuid")!=null) {
						hzNewsBillItem.setNewsGuid(newsBillItemXml.elementTextTrim("newsGuid"));
					}
					if(newsBillItemXml.elementTextTrim("creater")!=null) {
						hzNewsBillItem.setCreater(newsBillItemXml.elementTextTrim("creater"));
					}
					if(newsBillItemXml.elementTextTrim("newsTitle")!=null) {
						hzNewsBillItem.setNewsTitle(newsBillItemXml.elementTextTrim("newsTitle"));
					}
					if(newsBillItemXml.elementTextTrim("videoLength")!=null) {
						hzNewsBillItem.setVideoLength(newsBillItemXml.elementTextTrim("videoLength"));
					}
					if(newsBillItemXml.elementTextTrim("newsStateName")!=null) {
						hzNewsBillItem.setNewsStateName(newsBillItemXml.elementTextTrim("newsStateName"));
					}
					if(newsBillItemXml.elementTextTrim("videoStateName")!=null) {
						hzNewsBillItem.setVideoStateName(newsBillItemXml.elementTextTrim("videoStateName"));
					}
					if(newsBillItemXml.elementTextTrim("dubStateName")!=null) {
						hzNewsBillItem.setDubStateName(newsBillItemXml.elementTextTrim("dubStateName"));
					}
					if(newsBillItemXml.elementTextTrim("auditStateName")!=null) {
						hzNewsBillItem.setAuditStateName(newsBillItemXml.elementTextTrim("auditStateName"));
					}
					hZNewsBillItemList.add(hzNewsBillItem);
				}
				 
			}else {
				log.debug("收到串联单条目列表查询请求处理失败");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return hZNewsBillItemList;
	}
	
	/*
	 * 调用线索newsplatform项目的接口获取热线爆料
	 * 接口由线索云部门提供 
	 */
	@Value(value="${HZ.DYNewsPlatForm.url}")
	private String newsPlatUrl;
	@Value(value="${HZ.DYNewsPlatForm.sourcetype}")
	private String sourceType;
	@Value(value="${HZ.DYNewsPlatForm.sysId}")
	private String sysid;
	@Value(value="${HZ.DYNewsPlatForm.dateRange}")
	private String dateRange;
	@Value(value="${HZ.DYNewsPlatForm.sortName}")
	private String sortName;
	@Value(value="${HZ.DYNewsPlatForm.sortType}")
	private String sortType;
	@Value(value="${HZ.DYNewsPlatForm.start}")
	private String start;
	@Value(value="${HZ.DYNewsPlatForm.limit}")
	private String limit;
	@Value(value="${HZ.DYNewsPlatForm.token}")
	private String DYNewsPlatFormToken;
	@Value(value="${HZ.DYNewsPlatForm.userid}")
	private String DYNewsPlatFormUerid;
	public String getHotLineScoop() {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(newsPlatUrl);
		JSONObject object = new JSONObject();
		object.put("sourceType", Integer.parseInt(sourceType));
		object.put("sysId", sysid);
		
			Date nowDate = new Date();
			long nowtime = nowDate.getTime();
			long stime=nowtime-(Integer.parseInt(dateRange)*24*60*60*1000l);
			log.debug("查询时间范围:"+Integer.parseInt(dateRange)+"天前至今");
			log.debug("截止时间毫秒值："+nowtime);
			log.debug("开始时间毫秒值"+stime);
			log.debug("每次查询个数:"+limit);
			Date startDate = new Date(stime);
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String endTime = format.format(nowDate);
			String startTime = format.format(startDate);
			
		object.put("endTime", endTime);
		object.put("startTime", startTime);
		
		JSONObject queryCondition = new JSONObject();
		ArrayList<JSONObject> sortList = new ArrayList<>();
		JSONObject sort = new JSONObject();
		sort.put("sortName", sortName);
		sort.put("sortType", sortType);
		sortList.add(sort);
		queryCondition.put("sortList", sortList);
		queryCondition.put("searchContent", "");
		queryCondition.put("start", Integer.parseInt(start));
		queryCondition.put("limit", limit);
		object.put("queryCondition", queryCondition);
		
		StringEntity stringEntity = new StringEntity(object.toString(), "utf-8");
		stringEntity.setContentType("application/json;charset=utf-8");
		post.setEntity(stringEntity);
		post.addHeader("userId",DYNewsPlatFormUerid);
		post.addHeader("token", DYNewsPlatFormToken);
		CloseableHttpResponse response;
		try {
			response = client.execute(post);
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity,"utf-8");
			log.debug(endTime);
			log.debug(startTime);
			log.debug(result);
			EntityUtils.consume(entity);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	
	public void writeRatingProperties(String a,String b) {
		try { //new File("/columnRating.properties") 写到jvm盘符下
			Properties p = new Properties();
			String path =this.getClass().getResource("/").getPath();
			String REALPATH = new String(path.getBytes(), "GB2312");
			log.debug("收视率储存路径"+REALPATH);
			p.load(new FileInputStream(REALPATH+"columnRating.properties"));
			OutputStream out = new FileOutputStream(REALPATH+"columnRating.properties");
			log.debug("===正在记录栏目收视率===");
			p.setProperty(a, b);
			p.store(out, "更新收视率");
			out.close();
			log.debug("===记录栏目收视率完成===");
		} catch (Exception e) {
			log.debug("收视率文件路径错误"+e);
			e.printStackTrace();
		}
	}
	public String readRatingProperties() {
		try {
		HashMap<String,String> resultMap = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		String path = this.getClass().getResource("/").getPath();
		log.debug("path:"+path);
		String REALPATH = new String(path.getBytes(), "GB2312");
		log.debug("读取收视率文件路径"+REALPATH);
		log.debug("===开始读取栏目收视率===");
		FileInputStream i2n = new FileInputStream(REALPATH+"columnRating.properties");
			FileInputStream in = new FileInputStream(REALPATH+"columnRating.properties");
			BufferedInputStream ins = new BufferedInputStream(in);
			Properties p = new Properties();
			try {
				p.load(ins);
				in.close();
				ins.close();
				Enumeration<?> en = p.propertyNames();
				//json 
				JSONObject records = new JSONObject();
				int i=0;
				sb.append("{\"");
				while(en.hasMoreElements()) {
					JSONObject record = new JSONObject();
					String key=(String)en.nextElement();
					//record
					record.put("columnName", key);
					sb.append(key+"\":\"");
					String value=p.getProperty(key);
					record.put("columnValue", value);
					sb.append(value+"\",\"");
					resultMap.put(key, value);
					log.debug(key+":"+value);
					records.put(i, record);
					i++;
				}
				sb.append("}");
				String sc = sb.substring(0, sb.length()-3)+sb.substring(sb.length()-1, sb.length());
				log.debug("最终返回"+sc.toString());
				log.debug("===读取栏目收视率完成===");
				//return sc;
				return records.toString();
			} catch (IOException e) {
				log.debug("io读取错误");
				e.printStackTrace();
			}
		} catch (Exception e) {
			log.debug("收视率存储文件缺失");
			e.printStackTrace();
		}
		log.debug("===读取栏目收视率完成===");
		return null;
	}
	
	public void CleanRatingsProperties() {
		try {
			Properties p = new Properties();
			String path =this.getClass().getResource("/").getPath();
			String REALPATH = new String(path.getBytes(), "GB2312");
			OutputStream out = new FileOutputStream(REALPATH+"columnRating.properties");
			p.load(new FileInputStream(REALPATH+"columnRating.properties"));
			Enumeration<?> en = p.propertyNames();
			while(en.hasMoreElements()) {
				p.remove(en.nextElement());
			}
			p.store(out, "ratings");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	
	/*
	 *
	 *获取杭州台在媒资系统上的大事件 输入条件为时间 查询结果为标题名字 
	 * 
	 */
	@Value(value="${HZ.mamwebservice.queryUrl}")
	private String mamwebserviceQueryUrl;
	public ArrayList<JSONObject> getHZTodayOnHistory(String time) {
		JSONArray returnJsonArray = new JSONArray();
		
		ArrayList<JSONObject> resourceList = new ArrayList<>();
		
		log.debug("getHZTodayOnHistory service");
		QueryServiceLocator qlocator = new QueryServiceLocator();
		try {
			qlocator.setEndpointAddress("QueryService", mamwebserviceQueryUrl);
			//QueryPort queryService = qlocator.getQueryService();
			QueryBindingStub query1 =(QueryBindingStub)qlocator.getPort(QueryBindingStub.class);
			MREML mreml = new MREML();
			MREMLType0 type0 = new MREMLType0();
						//共有参数信封
			EnvelopEntity eEntity = new EnvelopEntity();
						eEntity.setEnvelopVersion("1.0.2R");	//必填 可以按照样例拷贝
						eEntity.setSendFrom("DYBC");
						String[] a = {"DYMAM"};
						eEntity.setSendTo(a);
						eEntity.setPriority(0);
						//设置用户id等信息
						EMIEntity emiEntity = new EMIEntity();
						//EMIEntity emiEntity = new EMIEntity();
						AuditInfo auditInfo = new AuditInfo();
								auditInfo.setApplicantID("mam");
								AuditInfo[] auditInfos = {auditInfo};
							emiEntity.setAuditInfo(auditInfos);
						//请求体信息
							RequestEntity rEntity = new RequestEntity();
						UUID randomUUID = UUID.randomUUID();
						rEntity.setRequestEntityID(randomUUID.toString());
						rEntity.setAction("Query");
						RequestEntityRequestExtendMSG msg = new RequestEntityRequestExtendMSG();
						
						RequestEntityRequestExtendMSGQueryRequest msgrequest = new RequestEntityRequestExtendMSGQueryRequest();
									//MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition basicCondition = new MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition();
									//basicCondition.setKeyword("");//用关键字进行全文检索
									//basicCondition.setTitle(new RequestEntityRequestExtendMSGQueryRequestBasicConditionTitle(""));//用关键字检索资源名称（正题名）
						RequestEntityRequestExtendMSGQueryRequestLimitation limitation = new RequestEntityRequestExtendMSGQueryRequestLimitation();
									limitation.setBeginIndex(0);
									limitation.setCountPerPage(50);
									RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion advanceCondtion = new RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion();
									advanceCondtion.setEntityType("新闻节目类");//要查询的是那个编目类，填写CCID
									RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition advanceCondtionAttribute = new RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition();
										advanceCondtionAttribute.setAttributeID("首播日期");//AttributeID
										advanceCondtionAttribute.setLogic("1");//逻辑
										advanceCondtionAttribute.setValue(time);//如果逻辑关系是BETWEEN等需要一个以上值的，各个值之间用逗号隔开
										RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition[] advanceCondtionAttributeCondition= {advanceCondtionAttribute};
									advanceCondtion.setAttributeCondition(advanceCondtionAttributeCondition);
								msgrequest.setAdvanceCondtion(advanceCondtion);		
								msgrequest.setLimitation(limitation);
							msg.setQueryRequest(msgrequest);
						rEntity.setRequestExtendMSG(msg);
					type0.setEnvelopEntity(eEntity);
					type0.setRequestEntity(rEntity);
					type0.setEMIEntity(emiEntity);
				mreml.setMREML(type0);
				MREML query = query1.query(mreml);
				if(query!=null) {
					System.out.println("返回整体不为空");
					MREMLType0 remerml = query.getMREML();
					if(remerml!=null) {
						log.debug("媒资返回remerml不为空");
						int j = remerml.getResponseEntity().getStatus();
						log.debug("媒资返回状态码:"+j);
						ResourceEntity[] reEntity = remerml.getResourceEntity();
						if(reEntity!=null&&reEntity.length>2) {
							log.debug("媒资返回reEntity不为空");
							for(int o=0;o<reEntity.length-1;o++) {
								if(reEntity[o].getResourceMetaDataInfo().getTitle().getResourceName()!=null) {
									String resourceName = reEntity[o].getResourceMetaDataInfo().getTitle().getResourceName();
									String videoLength = reEntity[o].getResourceMetaDataInfo().getFormat().getTotalLength();
									String resourceUniqueID = reEntity[o].getResourceMetaDataInfo().getResourceID().getResourceUniqueID();
									
									JSONObject resource = new JSONObject();
									if(resourceUniqueID!=null) {
										resource.put("resourceUniqueID", resourceUniqueID);
									}else {
										resource.put("resourceUniqueID", "");
									}
									if(resourceName!=null) {
										resource.put("resourceName", resourceName);
									}else {
										resource.put("resourceName", "");
									}
									if(videoLength!=null) {
										resource.put("videoLength", videoLength);
									}else {
										resource.put("videoLength", "");
									}
									returnJsonArray.add(o, resource);
									resourceList.add(resource);
								}
							}
							return resourceList;
						}else {
							log.debug("媒资返回reEntity为空");
						}
					}
				}else {
					log.debug("接口调用返回数据存在空值");
				}
		} catch (Exception e) {
			System.out.println("桩代码错误");
			e.printStackTrace();
		}
		log.debug("返回的return："+resourceList.toString());
		return resourceList;
		//return returnJsonArray;
	}
	
	
	
	
	
	
	
	
	
	
	// 随机字符串集合
	private static String charsSet = "abcdefghijklmnopqrstuvwxyz";

	// 获取随机字符串
	private static String getRandomString(int length) {
		StringBuffer sb = new StringBuffer();
		int len = charsSet.length();
		for (int i = 0; i < length; i++) {
			sb.append(charsSet.charAt(getrandomInt(len - 1)));
		}
		return sb.toString();
	}

	// 获取随机整形数字
	private static int getrandomInt(int a) {
		return (int) Math.round(Math.random() * a);
	}

	/**
	 * 使用 Map按key进行排序
	 * 
	 * @param map
	 * @return
	 */
	public static Map<String, String> sortMapByKey(Map<String, String> map) {
		if (map == null || map.isEmpty()) {
			return null;
		}
		Map<String, String> sortMap = new TreeMap<String, String>(new MapKeyComparator());
		sortMap.putAll(map);
		return sortMap;
	}

	/*
	 * 获取几天前的日期  传入数字几 获得几天前的日期
	 */
	public String getDateCondition(int days) {
		Date date = new Date();
		long time = date.getTime();
		Date yesterday = new Date(time - (86400000l*days));
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String yesterdayString = format.format(yesterday);
		return yesterdayString;
	}

	

}
