package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.model.TaskMissonWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.TaskModel;
import com.dayang.newmedia.newscommand.service.NewsTaskService;
import com.dayang.newmedia.newscommand.ws.client.creclient.CREResourceClient;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ItemList;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ItemListWarper;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QuerySelectToBigShowApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySelectTopicToBigShowResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Resource;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public class QuerySelectToBigShowApiServiceImpl extends QuerySelectToBigShowApiService {
	
	public static Logger log = Logger.getLogger(QuerySelectListToBigShowApiServiceImpl.class); 
	public NewsTaskService newsTaskService = (NewsTaskService) SpringContextUtil.getBean("newsTaskService");
	
    @Override
    public Response querySelectToBigShow(String id, SecurityContext securityContext) throws NotFoundException {
		try {
			NewsTask newstask = newsTaskService.getBigShowXuanTiNewsTaskById(id);
			QuerySelectTopicToBigShowResponse querySelectTopicToBigShowResponse = Convert(newstask);
			return Response.ok().entity(getQuerySelectToBigShowWithSuccess(querySelectTopicToBigShowResponse)).build();
		} catch (Exception e) {
			log.error("----------QuerySelectToBigShow error-------",e);
			return Response.ok().entity(getQuerySelectToBigShowWithFailure(e.toString())).build();
		}
    }
    
    private QuerySelectTopicToBigShowResponse getQuerySelectToBigShowWithFailure(String string) {
    	QuerySelectTopicToBigShowResponse querySelectTopicToBigShowResponse = new QuerySelectTopicToBigShowResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(string);
    	querySelectTopicToBigShowResponse.setCommonResponse(commonResponse);
		return querySelectTopicToBigShowResponse;
	}

	private QuerySelectTopicToBigShowResponse getQuerySelectToBigShowWithSuccess(
			QuerySelectTopicToBigShowResponse querySelectTopicToBigShowResponse) {
		CommonResponse commonResponse = new CommonResponse();
    	commonResponse.setSuccess(true);
    	commonResponse.setErrorDesc("");
    	querySelectTopicToBigShowResponse.setCommonResponse(commonResponse);
		return querySelectTopicToBigShowResponse;
	}

	public QuerySelectTopicToBigShowResponse Convert(NewsTask newstask){
    	QuerySelectTopicToBigShowResponse querySelectTopicToBigShowResponse = new QuerySelectTopicToBigShowResponse();
    	// 1、负责人
    	String chargeMan = newstask.getChargeMan();
    	// 2、成员
    	String inPeople = newstask.getInPeople();
    	// 3、栏目
    	String ownColumn = newstask.getOwnColumn();
    	// 4、创建时间
    	String createTime = newstask.getCreateTime();
    	// 5、报道意见
    	String passAdvice = newstask.getPassAdvice();
    	if(StringUtils.isNotEmpty(passAdvice)){
//    		passAdvice = StringUtils.replaceBlank(passAdvice);
    		//passAdvice = HtmlUtil.delHTMLTag(passAdvice);
    		passAdvice = StringUtils.subString(passAdvice, 115, "...");
		}
    	// 6、状态
    	int status = newstask.getStatus();
    	// 7、资源
    	List<Resource> xuanTiresourceJson = newstask.getResourceList();
    	// 8、来源情况， 生成0，1随机数
    	//发布渠道
		String planpublish = newstask.getPlanpublish();
		if(planpublish!=null){
			String[] arr = planpublish.split(",");
			for (String str : arr) {
				if("1".equals(str)){
					querySelectTopicToBigShowResponse.setZiyuan01("1");
				}
				if("2".equals(str)){
					querySelectTopicToBigShowResponse.setZiyuan02("1");
				}
				if("3".equals(str)){
					querySelectTopicToBigShowResponse.setZiyuan03("1");
				}
				if("4".equals(str)){
					querySelectTopicToBigShowResponse.setZiyuan04("1");
				}
				if("5".equals(str)){
					querySelectTopicToBigShowResponse.setZiyuan05("1");
				}
			}
		}
    	// 9、标题
    	String title = newstask.getTitle();
    	if(StringUtils.isNotEmpty(title)){
    		title = StringUtils.replaceBlank(title);
    		title = StringUtils.subString(title, 18, "...");
		}
    	// 10、选题内容
    	String content = newstask.getContent();
    	if(StringUtils.isNotEmpty(content)){
//    		content = StringUtils.replaceBlank(content);
    		//content = HtmlUtil.delHTMLTag(content);
    		content = StringUtils.subString(content, 360, "...");
		}
    	//11.选题任务
    	List<TaskMissonWithBLOBs> taskMissonList = null;
    	try {
			taskMissonList = CommonServiceUtil.getTaskMissonList(newstask.getTaskGuid());
			List<TaskModel> tasklist = new ArrayList<>();
			for (TaskMissonWithBLOBs tmw : taskMissonList) {
				TaskModel task = new TaskModel();
				task.setRwStatus(tmw.getMstate());
				task.setRwTitle(StringUtils.subString(tmw.getMevents(), 6, "..."));
				task.setRwUserNmae(tmw.getMchargeman());
				tasklist.add(task);
			}
			querySelectTopicToBigShowResponse.setTaskModelList(tasklist);
		} catch (Exception e) {
			log.error("----------查询选题任务失败 error-------",e);
		}
    	//12.选题资源
    	// 2、调用CRE接口获取选题目录下的资源
		String searchUrl;
		try {
			searchUrl = CommonServiceUtil.getServerSettingUrlByUtype(Constants.CRE_SEARCH_URL_TYPE);
			ItemListWarper itemListWarper = CREResourceClient.getCREFolderResourceList(searchUrl, "", Constants.DEFAULT_START, Constants.MAX_PAGE, null, null, newstask.getTaskGuid());
			List<ItemList> itemList = itemListWarper.getItemList();
			List<Resource> reslist = new ArrayList<>();
			if(itemList!=null){
				for (ItemList il : itemList) {
					Resource res = new Resource();
					res.setTitle(StringUtils.subString(il.getName(), 16, "..."));
					reslist.add(res);
				}
				querySelectTopicToBigShowResponse.setResourceList(reslist);
			}
		} catch (Exception e) {
			log.error("----------查询选题资源失败 error-------",e);
		}
    	
    	querySelectTopicToBigShowResponse.setChargeMan(chargeMan);
    	querySelectTopicToBigShowResponse.setInPeople(inPeople);
    	querySelectTopicToBigShowResponse.setOwnColumn(ownColumn);
    	querySelectTopicToBigShowResponse.setCreateTime(createTime);
    	querySelectTopicToBigShowResponse.setPassAdvice(passAdvice);
    	querySelectTopicToBigShowResponse.setStatus(status);
    	querySelectTopicToBigShowResponse.setXuanTiresourceJson(null);
    	querySelectTopicToBigShowResponse.setTitle(title);
    	querySelectTopicToBigShowResponse.setContent(content);
    	querySelectTopicToBigShowResponse.setFinishMissonNum(newstask.getFinishMissonNum());
    	querySelectTopicToBigShowResponse.setMissonNum(newstask.getMissonNum());
    	
    	
    	return querySelectTopicToBigShowResponse;
    }
}
