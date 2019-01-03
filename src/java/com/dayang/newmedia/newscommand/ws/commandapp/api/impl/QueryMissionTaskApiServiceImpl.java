package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.common.utils.TimeAgo;
import com.dayang.newmedia.newscommand.db.model.NewsTaskWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.PageResult;
import com.dayang.newmedia.newscommand.db.model.TaskMisson;
import com.dayang.newmedia.newscommand.db.model.TaskMissonWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.TaskSearchPara;
import com.dayang.newmedia.newscommand.service.CustomSettingService;
import com.dayang.newmedia.newscommand.service.NewsTaskService;
import com.dayang.newmedia.newscommand.service.TaskMissionService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.ApiResponseMessage;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryMissionTaskApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Mission;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBaotiResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryMissionTaskResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryTaskCondition;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryMissionTaskApiServiceImpl extends QueryMissionTaskApiService {

    public static Logger log = Logger.getLogger(QueryMissionTaskApiServiceImpl.class);
    public TaskMissionService taskMissionService = (TaskMissionService) SpringContextUtil.getBean("taskMissionService");
    public NewsTaskService newsTaskService = (NewsTaskService) SpringContextUtil.getBean("newsTaskService");
    public CustomSettingService customSettingService = (CustomSettingService) SpringContextUtil.getBean("customSettingService");
    
    @Override
    public Response queryMissionTask(QueryTaskCondition queryTaskCondition, SecurityContext securityContext) throws NotFoundException {
        try {
            TaskSearchPara searchPara = taskMissionService.getMisssionTaskSearchPara(queryTaskCondition);
            PageResult<TaskMissonWithBLOBs> pr = taskMissionService.getMissionTaskList(searchPara);
            List<com.dayang.newmedia.newscommand.ws.commandapp.model.Mission> records = getMissionTaskRecords(pr.getList());
            return Response.ok().entity(getResopnseWithSuccess("", pr.getTotalCount(), pr.getPage(), pr.getPageSize(), records)).build();
        } catch (Exception e) {
            log.error("----------queryMissionTask error-------", e);
            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();
        }
    }
    
    
    
    /**
     *  转换APP所需字段
     * @param list
     * @return
     */
    private List<Mission> getMissionTaskRecords(List<TaskMissonWithBLOBs> aTaskMissionList) {
        List<Mission> aMissionList =new ArrayList<Mission>() ;
        for (Iterator iterator = aTaskMissionList.iterator(); iterator.hasNext();) {
            Mission oMission =  new Mission () ;
            TaskMissonWithBLOBs taskMissonWithBLOBs = (TaskMissonWithBLOBs) iterator.next();
            oMission.setMissionChargeMan(taskMissonWithBLOBs.getMchargeman());
            oMission.setMissionContent(taskMissonWithBLOBs.getMevents());
            oMission.setMissionCreater(taskMissonWithBLOBs.getMcreater());
            oMission.setMissionType(taskMissonWithBLOBs.getMtype());
           
            // 获取数据库当前时间
            Date dbCurrentDate = newsTaskService.getDBDate();
            // 创建时间
            Date createDate = taskMissonWithBLOBs.getMcreatetime();
            String createTime = "";
            if (createDate!=null) {
            	createTime = TimeAgo.newsCommandToDay(createDate, dbCurrentDate);
            }
            oMission.setMissionCreateTime(createTime);
            
            // 修改时间
            Date finishDate = taskMissonWithBLOBs.getMfinishtime();
            String finishTime = "";
            if (finishDate!=null) {
            	finishTime = TimeAgo.newsCommandToDay(finishDate,dbCurrentDate);
            }
            oMission.setMissionFinishTime(finishTime);
            oMission.setMissionState(taskMissonWithBLOBs.getMstate());
            oMission.setTaskGuid(taskMissonWithBLOBs.getTaskguid()) ;
            String taskTitle = taskMissonWithBLOBs.getTasktitle();
            String taskChargeMan = taskMissonWithBLOBs.getTaskchangeman();
            if (StringUtils.isNotEmpty(taskTitle)) {
            	oMission.setTaskTitle(taskTitle);
            }
            if (StringUtils.isNotEmpty(taskChargeMan)) {
            	oMission.setTaskChangeMan(taskChargeMan);
            }
            /*if(null!=xuantiTask){
                if(StringUtils.isNotEmpty(xuantiTask.getTasktitle())){
                    oMission.setTaskTitle(xuantiTask.getTasktitle());
                }
            }*/
            oMission.setMissionGuid(taskMissonWithBLOBs.getMguid());
            oMission.setMissionTypeName(customSettingService.getConfigNameByValue("renwu", taskMissonWithBLOBs.getMtype()));
            aMissionList.add(oMission) ;
        }
        return aMissionList;
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
    public QueryMissionTaskResponse getResopnseWithSuccess(String message, Integer total, Integer page, Integer limit,
            List<com.dayang.newmedia.newscommand.ws.commandapp.model.Mission> records) {
        QueryMissionTaskResponse queryMisssionResponse = new QueryMissionTaskResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess(message);
        queryMisssionResponse.setCommonResponse(commonResponse);
        queryMisssionResponse.setTotalCount(total);
        queryMisssionResponse.setCurrentPage(page);
        queryMisssionResponse.setLimit(limit);
        queryMisssionResponse.setRecords(records);
        return queryMisssionResponse;
    }

    /**
     * 失败返回结果
     * 
     * @param msg
     * @return
     */
    public QueryMissionTaskResponse getResponseWithFailure(String msg) {
        QueryMissionTaskResponse queryMissionResponse = new QueryMissionTaskResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
        queryMissionResponse.setCommonResponse(commonResponse);
        return queryMissionResponse;
    }
}
