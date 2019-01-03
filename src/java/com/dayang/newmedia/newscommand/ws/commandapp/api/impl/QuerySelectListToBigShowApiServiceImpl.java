package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

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
import com.dayang.newmedia.newscommand.db.model.NewsTaskWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.PageResult;
import com.dayang.newmedia.newscommand.db.model.TaskMissonWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.TaskSearchPara;
import com.dayang.newmedia.newscommand.service.NewsTaskService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QuerySelectListToBigShowApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySelectListCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySelectListToBigShowResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.SelectTopicToBigShow;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public class QuerySelectListToBigShowApiServiceImpl extends QuerySelectListToBigShowApiService {
	
	public static Logger log = Logger.getLogger(QuerySelectListToBigShowApiServiceImpl.class); 
	public NewsTaskService newsTaskService = (NewsTaskService) SpringContextUtil.getBean("newsTaskService");
    
    @Override
    public Response querySelectListToBigShow(QuerySelectListCondition querySelectListCondition, SecurityContext securityContext) {
    	try {
    	// 1、封装查询数据
    	String workNo = querySelectListCondition.getUserId();
    	querySelectListCondition.setUserId(null);
    	// 封装请求参数
		TaskSearchPara taskSearchPara = newsTaskService.getXuanTiTaskSearchPara(querySelectListCondition);
		// 获取条目以及总数
		PageResult<NewsTaskWithBLOBs> pr = newsTaskService.getNewsTaskList(taskSearchPara);
    	
        // 3、封装返回对象
        QuerySelectListToBigShowResponse querySelectListResponse = getQuerySelectListResponse(pr,workNo);
		return Response.ok().entity(querySelectListResponse).build();
    	} catch (Exception e) {
    		log.error("----------querySelectListToBigShow error-------",e);
			return Response.ok().entity(getQuerySelectListToBigShowWithFailure(e.toString())).build();
    	}
    }
    	
        /**
         * 失败返回结果
         * @param msg
         * @return
         */
        public QuerySelectListToBigShowResponse getQuerySelectListToBigShowWithFailure(String msg){
        	QuerySelectListToBigShowResponse querySelectListResponse = new QuerySelectListToBigShowResponse();
        	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
        	querySelectListResponse.setCommonResponse(commonResponse);
    		return querySelectListResponse;
        }
        
    
    
    public QuerySelectListToBigShowResponse getQuerySelectListResponse(PageResult<NewsTaskWithBLOBs> pr,String workNo) throws Exception{
    	QuerySelectListToBigShowResponse querySelectListResponse = new QuerySelectListToBigShowResponse();
    	CommonResponse commonResponse = new CommonResponse();
    	commonResponse.setSuccess(true);
    	commonResponse.setErrorDesc("");
    	querySelectListResponse.setCommonResponse(commonResponse);
    	querySelectListResponse.setTotalCount(pr.getTotalCount());
    	querySelectListResponse.setCurrentPage(pr.getPage());
    	querySelectListResponse.setLimit(pr.getPageSize());
    	
    	List<SelectTopicToBigShow> selectList = new ArrayList<>();
    	
    	for(int i=0;i<pr.getList().size();i++){
    		NewsTaskWithBLOBs n = pr.getList().get(i);
    		SelectTopicToBigShow select = new SelectTopicToBigShow();
    		
    		select.setTaskGuid(n.getTaskguid());
    		//标题
        	String tasktitle = n.getTasktitle();
    		if(StringUtils.isNotEmpty(tasktitle)){
    			tasktitle = StringUtils.replaceBlank(tasktitle);
    			tasktitle = StringUtils.subString(tasktitle, 18, "...");
    		}
    		select.setTitle(tasktitle);
    		//内容
        	String taskcontent = n.getTaskcontent();
        	if(StringUtils.isNotEmpty(taskcontent)){
        		taskcontent = StringUtils.replaceBlank(taskcontent);
        		//taskcontent = HtmlUtil.delHTMLTag(taskcontent);
        		taskcontent = taskcontent.replace("&nbsp;","");
        		taskcontent = StringUtils.subString(taskcontent, 55, "...");
    		}
    		select.setContent(taskcontent);
    		//负责人
    		select.setChargeMan(n.getChargeman());
    		//栏目
    		select.setOwnColumn(n.getOwncolumn());
    		// 创建时间
        	Date date = n.getCreatetime();
        	SimpleDateFormat simple = new SimpleDateFormat("MM-dd HH:mm");
        	String createrTime = "";
        	if (date!=null) {
        		createrTime = simple.format(date);
        	}
    		select.setCreateTime(createrTime);
    		//地点信息
//    		select.setTaskPlace("中关村");
    		//状态
    		select.setStatus(n.getXuantistate().intValue());
    		//发布渠道
    		String planpublish = n.getPlanpublish();
    		if(planpublish!=null){
    			String[] arr = planpublish.split(",");
    			for (String str : arr) {
					if("1".equals(str)){
						select.setZiyuan01("1");
					}
					if("2".equals(str)){
						select.setZiyuan02("1");
					}
					if("3".equals(str)){
						select.setZiyuan03("1");
					}
					if("4".equals(str)){
						select.setZiyuan04("1");
					}
					if("5".equals(str)){
						select.setZiyuan05("1");
					}
				}
    		}
    		List<TaskMissonWithBLOBs> taskMissonList = CommonServiceUtil.getTaskMissonList(n.getTaskguid());
    		int finishNum = 0;
    		for (TaskMissonWithBLOBs taskMissonWithBLOBs : taskMissonList) {
				if(taskMissonWithBLOBs.getMstate()==3){
					finishNum++;
				}
			}
    		//该选题下任务各状态任务数(1:待处理,2:进行中,3:待审核,4:已完成)
//    		Integer wzpMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(s.getId(),1,workNo);
//    		Integer jzxMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(s.getId(),2,workNo);
//    		Integer finishMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(s.getId(),3,workNo);
//    		Integer zzMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(s.getId(),4,workNo);
//    		
    		//Integer wzpMissonNum = StringUtils.getRandomNum(4);
    		//Integer jzxMissonNum = StringUtils.getRandomNum(4);
    		Integer finishMissonNum = finishNum;
    		//Integer zzMissonNum = StringUtils.getRandomNum(4);
    		
    		
    		//select.setWzpMissonNum(wzpMissonNum);
    		//select.setJzxMissonNum(jzxMissonNum);
    		select.setFinishMissonNum(finishMissonNum);
    		//select.setZzMissonNum(zzMissonNum);
    		select.setMissonNum(taskMissonList.size());
    		
    		
    		selectList.add(select);
    	}
    	querySelectListResponse.setRecords(selectList);
    	return querySelectListResponse;
    }
    
   
}
