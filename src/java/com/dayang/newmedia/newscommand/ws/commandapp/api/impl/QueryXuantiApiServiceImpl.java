package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.common.utils.TimeAgo;
import com.dayang.newmedia.newscommand.db.model.NewsTaskWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.PageResult;
import com.dayang.newmedia.newscommand.db.model.TaskSearchPara;
import com.dayang.newmedia.newscommand.service.NewsTaskService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryXuantiApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXTCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXuantiResponse;


/**
 * 1、全部选题需要的参数：
 * 	1.1、任务类型为选题
 * 	1.2、选题状态：保存以及未指派除外
 * 	1.3、当前登陆用户所属栏目
 * 	1.4、负责人、参与人为当前登陆用户
 * 2、我的选题
 * 	2.1、任务类型为选题
 * 	2.2、如果是参与的以及负责的，则状态:保存以及未指派除外
 * 	2.3、创建人
 * @author luomeng
 *
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryXuantiApiServiceImpl extends QueryXuantiApiService {
	
	public static Logger log = Logger.getLogger(QueryXuantiApiServiceImpl.class); 
	public NewsTaskService newsTaskService = (NewsTaskService) SpringContextUtil.getBean("newsTaskService");
	
    @Override
    public Response queryXuanti(QueryXTCondition queryXTCondition, SecurityContext securityContext)
    throws NotFoundException {
    	log.debug("---------queryXuanti param:"+queryXTCondition+"-----------");
    	try {
    		if (queryXTCondition == null) {
        		throw new Exception("请求参数有误!");
        	}
    		// 封装请求参数
			TaskSearchPara taskSearchPara = newsTaskService.getXuanTiTaskSearchPara(queryXTCondition);
			// 获取条目以及总数
			PageResult<NewsTaskWithBLOBs> pr = newsTaskService.getNewsTaskList(taskSearchPara);
			List<NewsTaskWithBLOBs> newsTaskWithBLOBs = pr.getList();
			// 封装返回参数
			List<com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask> records = new ArrayList<>();
			if (StringUtils.listIsNotEmpty(newsTaskWithBLOBs)) {
				records = getNewsTasks(pr.getList());
			}
			QueryXuantiResponse queryXuantiResponse = getResopnseWithSuccess("", pr.getTotalCount(), pr.getPage(), pr.getPageSize(), records);
			log.debug("---------queryXuanti result:"+queryXuantiResponse+"-----------");
			// 返回结果
			return Response.ok().entity(queryXuantiResponse).build();
		} catch (Exception e) {
			log.error("----------queryXuanti error-------",e);
			return Response.ok().entity(getQueryXuantiResponseWithFailure(e.toString())).build();
		}
    }
    
    private List<com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask> getNewsTasks(List<NewsTaskWithBLOBs> list) throws Exception {
    	List<com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask> newsTaskList = new ArrayList<>();
		if (StringUtils.listIsNotEmpty(list)) {
			for (NewsTaskWithBLOBs newsTask : list) {
				com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask appNewTask = getNewsTask(newsTask);
				if (appNewTask != null) {
					newsTaskList.add(appNewTask);
				}
				
			}
		}
    	return newsTaskList;
	}
    
    private com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask getNewsTask(NewsTaskWithBLOBs record) throws Exception{
    	com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask newTask = new com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask();
    	newTask.setTaskGuid(record.getTaskguid());
    	//标题
    	String tasktitle = record.getTasktitle();
		if(StringUtils.isNotEmpty(tasktitle)){
			tasktitle = StringUtils.replaceBlank(tasktitle);
			tasktitle = StringUtils.subString(tasktitle, 18, "...");
		}
    	newTask.setTitle(tasktitle);
    	//内容
    	String taskcontent = record.getTaskcontent();
    	if(StringUtils.isNotEmpty(taskcontent)){
    		taskcontent = StringUtils.replaceBlank(taskcontent);
    		taskcontent = StringUtils.subString(taskcontent, 55, "...");
		}
    	newTask.setContent(taskcontent);
    	//负责人
    	newTask.setCreater(record.getCreater());
       	newTask.setChargeMan(record.getChargeman());
    	newTask.setInPeople(record.getInpeople());
    	//栏目
    	newTask.setOwnColumn(record.getOwncolumn());
    	// 创建时间
    	Date date = record.getCreatetime();
    	SimpleDateFormat simple = new SimpleDateFormat("MM-dd HH:mm");
    	String createrTime = "";
    	if (date!=null) {
    		createrTime = simple.format(date);
    	}
    	newTask.setCreateTime(createrTime);
    	//地点信息
    	newTask.setTaskPlace(record.getTaskplace());
    	//状态
    	newTask.setTaskStatus(record.getTaskstate());
    	BigDecimal status = record.getXuantistate();
    	if (status != null) {
    		newTask.setStatus(status.intValue());
    	}
    	//进度
    	newTask.setTaskRemark(record.getTaskremark());
    	//是否包含资源
    	if(StringUtils.isNotBlank(record.getCaifangremark())){
    		String [] ziyuanArr= record.getCaifangremark().split(","); 
    		newTask.setZiyuan01(Integer.parseInt(ziyuanArr[0]));
        	newTask.setZiyuan02(Integer.parseInt(ziyuanArr[1]));
        	newTask.setZiyuan03(Integer.parseInt(ziyuanArr[2]));
        	newTask.setZiyuan04(Integer.parseInt(ziyuanArr[3]));
        	newTask.setZiyuan05(Integer.parseInt(ziyuanArr[4]));
    	}else{
    		newTask.setZiyuan01(0);
        	newTask.setZiyuan02(0);
        	newTask.setZiyuan03(0);
        	newTask.setZiyuan04(0);
        	newTask.setZiyuan05(0);
    	}
    	
 
    	
    	
    	newTask.setPassAdvice(record.getPassadvice());
    	// 获取数据库当前时间
    	Date dbCurrentDate = newsTaskService.getDBDate();
    	// 修改时间
    	Date modifyDate = record.getCreatetime();
    	String modifyTime = "";
    	if (modifyDate != null){
    		modifyTime = TimeAgo.newsCommandToDay(modifyDate,dbCurrentDate);
    	}
    	newTask.setModifyTime(modifyTime);
    	
    	// 根据创建人姓名，获取创建人头像
    	String creater = record.getCreater();
    	String iconUrl = "";
    	if (StringUtils.isNotEmpty(creater)) {
    		iconUrl = CommonServiceUtil.getUserIconUrlByUserName(creater);
    	}
    	newTask.setResourceIcon(iconUrl);
    	
    	//该选题下任务各状态任务数
		Integer wzpMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(record.getTaskguid(),0);
		Integer jzxMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(record.getTaskguid(),2);
		Integer finishMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(record.getTaskguid(),3);
		Integer zzMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(record.getTaskguid(),9);
		newTask.setWzpMissonNum(wzpMissonNum);
		newTask.setJzxMissonNum(jzxMissonNum);
		newTask.setFinishMissonNum(finishMissonNum);
		newTask.setZzMissonNum(zzMissonNum);
		newTask.setMissonNum(wzpMissonNum+jzxMissonNum+finishMissonNum+zzMissonNum);
    	return newTask;
    }

	/**
	 * 分页查询加载完成响应
	 * @param message
	 * @param total
	 * @param page
	 * @param limit
	 * @param records
	 * @return
	 */
	public QueryXuantiResponse getResopnseWithSuccess(String message,Integer total,Integer page,Integer limit,List<com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask> records){
		QueryXuantiResponse queryXuantiResponse = new QueryXuantiResponse();
		CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess(message);
		queryXuantiResponse.setCommonResponse(commonResponse);
		queryXuantiResponse.setTotalCount(total);
		queryXuantiResponse.setCurrentPage(page);
		queryXuantiResponse.setLimit(limit);
		queryXuantiResponse.setRecords(records);
		return queryXuantiResponse;
	}
    
    /**
     * 失败返回结果
     * @param msg
     * @return
     */
    public QueryXuantiResponse getQueryXuantiResponseWithFailure(String msg){
    	QueryXuantiResponse queryXuantiResponse = new QueryXuantiResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
    	queryXuantiResponse.setCommonResponse(commonResponse);
		return queryXuantiResponse;
    }
    
}
