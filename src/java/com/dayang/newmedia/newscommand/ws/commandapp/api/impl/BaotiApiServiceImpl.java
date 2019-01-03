package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import java.util.Date;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.common.utils.TimeAgo;
import com.dayang.newmedia.newscommand.db.model.NewsTaskWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.enums.BAOTISTATUS;
import com.dayang.newmedia.newscommand.service.NewsTaskService;
import com.dayang.newmedia.newscommand.service.TaskResourceService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.BaotiApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBaotiByIdResponse;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class BaotiApiServiceImpl extends BaotiApiService {
    
    public static Logger log = Logger.getLogger(BaotiApiServiceImpl.class);
    public NewsTaskService newsTaskService = (NewsTaskService) SpringContextUtil.getBean("newsTaskService");
    public TaskResourceService taskResourceService = (TaskResourceService) SpringContextUtil.getBean("taskResourceService");
    
    @Override
    public Response queryBaotiById(String id, SecurityContext securityContext) throws NotFoundException {
        try {
            NewsTaskWithBLOBs newsTask= newsTaskService.getBaoTiNewsTaskByTaskGuid(id);
            // 封装返回参数
            com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask appNewsTask = getNewsTask(newsTask);
            QueryBaotiByIdResponse queryBaotiResponse = getResopnseWithSuccess("", appNewsTask);
            log.debug("---------queryBaotibyId result:" + queryBaotiResponse + "-----------");
            // 返回结果
            return Response.ok().entity(queryBaotiResponse).build();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.error("----------queryBaotibyId error-------", e);
            return Response.ok().entity(getQueryBaotiResponseWithFailure(e.toString())).build();
        }
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
        // 数据库当前时间
        Date dbCurrentDate = newsTaskService.getDBDate();
        // 创建时间
        Date createrDate = record.getCreatetime();
        String createrTime = "";
        if (createrDate != null) {
        	createrTime = TimeAgo.newsCommandToDay(createrDate, dbCurrentDate);
        }
        newTask.setCreateTime(createrTime);
        
        // 修改时间
        Date modifyDate = record.getModifytime();
        String modifyTime = "";
        if (modifyDate != null) {
        	 modifyTime = TimeAgo.newsCommandToDay(modifyDate, dbCurrentDate);
        }
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
    * 
    * @param message
    * @param appNewsTask
    * @return
    */
    public QueryBaotiByIdResponse getResopnseWithSuccess(String message,com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask appNewsTask) {
        QueryBaotiByIdResponse queryBaotiResponse = new QueryBaotiByIdResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess(message);
        queryBaotiResponse.setCommonResponse(commonResponse);
        queryBaotiResponse.setTaskInfo(appNewsTask);
        return queryBaotiResponse;
    }

    /**
     * 失败返回结果
     * 
     * @param msg
     * @return
     */
    public QueryBaotiByIdResponse getQueryBaotiResponseWithFailure(String msg) {
        QueryBaotiByIdResponse queryBaotiResponse = new QueryBaotiByIdResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
        queryBaotiResponse.setCommonResponse(commonResponse);
        return queryBaotiResponse;
    }
}
