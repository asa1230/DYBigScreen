package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

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
import com.dayang.newmedia.newscommand.db.model.enums.BAOTISTATUS;
import com.dayang.newmedia.newscommand.service.NewsTaskService;
import com.dayang.newmedia.newscommand.service.TaskResourceService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryBaotiApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBaotiResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryTaskCondition;
import com.sun.jersey.api.NotFoundException;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryBaotiApiServiceImpl extends QueryBaotiApiService {
    public static Logger log = Logger.getLogger(QueryBaotiApiServiceImpl.class);
    public NewsTaskService newsTaskService = (NewsTaskService) SpringContextUtil.getBean("newsTaskService");
    public TaskResourceService taskResourceService = (TaskResourceService) SpringContextUtil.getBean("taskResourceService");
    @Override
    public Response queryBaoti(QueryTaskCondition queryTaskCondition, SecurityContext securityContext) throws NotFoundException {
        try {
        	log.debug("---------queryBaoti param:"+queryTaskCondition+"----------------");
            TaskSearchPara baoTiTaskSearchPara = newsTaskService.getBaoTiTaskSearchPara(queryTaskCondition);
            // 获取条目以及总数
            PageResult<NewsTaskWithBLOBs> pr = newsTaskService.getBaoTiNewsTaskList(baoTiTaskSearchPara);
            // 封装返回参数
            List<com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask> records = getNewsTasks(pr.getList());
            QueryBaotiResponse queryBaotiResponse = getResopnseWithSuccess("", pr.getTotalCount(), pr.getPage(), pr.getPageSize(), records);
            log.debug("---------queryBaoti result:" + queryBaotiResponse + "-----------");
            // 返回结果
            return Response.ok().entity(queryBaotiResponse).build();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.error("----------queryBaoti error-------", e);
            return Response.ok().entity(getQueryBaotiResponseWithFailure(e.toString())).build();
        }
    }

    private List<com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask> getNewsTasks(List<NewsTaskWithBLOBs> list) throws Exception {
        List<com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask> newsTaskList = new ArrayList<>();
        if (StringUtils.listIsNotEmpty(list)) {
            for (NewsTaskWithBLOBs newsTask : list) {
            	com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask appNewsTask = getNewsTask(newsTask);
            	if (appNewsTask!=null) {
            		newsTaskList.add(appNewsTask);
            	}
            }
        }
        return newsTaskList;
    }

    private com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask getNewsTask(NewsTaskWithBLOBs record) throws Exception {
        com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask newTask = new com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask();
        newTask.setTaskGuid(record.getTaskguid());
        newTask.setTitle(record.getTasktitle());
        newTask.setContent(record.getTaskcontent());
        newTask.setCreater(record.getCreater());
        newTask.setOwnColumn(record.getOwncolumn());
        newTask.setChargeMan(record.getChargeman());
        newTask.setInPeople(record.getInpeople());
        newTask.setPassAdvice(record.getPassadvice());
        // 获取数据库当前时间
        Date dbCurrentDate = newsTaskService.getDBDate();
        String createrTime = TimeAgo.newsCommandToDay(record.getCreatetime(),dbCurrentDate);
        newTask.setCreateTime(createrTime);
        String modifyTime = TimeAgo.newsCommandToDay(record.getModifytime(),dbCurrentDate);
        newTask.setModifyTime(modifyTime);
        String iconUrl = CommonServiceUtil.getUserIconUrlByUserName(record.getCreater());
        newTask.setResourceIcon(iconUrl);
        newTask.setTaskStatus(record.getTaskstate());
        // 如果为保存状态
        if (record.getTaskstate() == BAOTISTATUS.SAVE.getBaotiStatus()) {
            newTask.setStatus(record.getTaskstate());
        } else {
            // 已经为提交状态
            if(StringUtils.isEmpty(record.getUsecolumn())){
                newTask.setStatus(BAOTISTATUS.ALL_USE.getBaotiStatus());
            }else{
                if (!record.getOwncolumn().equalsIgnoreCase(record.getUsecolumn())) {
                    newTask.setStatus(BAOTISTATUS.PARTIAL_USE.getBaotiStatus());
                }else{
                    newTask.setStatus(BAOTISTATUS.SUBMIT.getBaotiStatus());
                }
            }
         
        }
        newTask.setResourceList(taskResourceService.getResourceByNewsTaskId(record.getTaskguid()));
        return newTask;
    }

    /**
     * 分页查询加载完成响应
     * 
     * @param message
     * @param total
     * @param page
     * @param limit
     * @param records
     * @return
     */
    public QueryBaotiResponse getResopnseWithSuccess(String message, Integer total, Integer page, Integer limit,
            List<com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask> records) {
        QueryBaotiResponse queryBaotiResponse = new QueryBaotiResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess(message);
        queryBaotiResponse.setCommonResponse(commonResponse);
        queryBaotiResponse.setTotalCount(total);
        queryBaotiResponse.setCurrentPage(page);
        queryBaotiResponse.setLimit(limit);
        queryBaotiResponse.setRecords(records);
        return queryBaotiResponse;
    }

    /**
     * 失败返回结果
     * 
     * @param msg
     * @return
     */
    public QueryBaotiResponse getQueryBaotiResponseWithFailure(String msg) {
        QueryBaotiResponse queryBaotiResponse = new QueryBaotiResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
        queryBaotiResponse.setCommonResponse(commonResponse);
        return queryBaotiResponse;
    }
}
