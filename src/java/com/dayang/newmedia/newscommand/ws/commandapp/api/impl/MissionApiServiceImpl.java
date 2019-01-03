package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.common.utils.TimeAgo;
import com.dayang.newmedia.newscommand.db.model.NewsTaskWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.TaskMissonWithBLOBs;
import com.dayang.newmedia.newscommand.service.CustomSettingService;
import com.dayang.newmedia.newscommand.service.NewsTaskService;
import com.dayang.newmedia.newscommand.service.TaskMissionService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.ApiResponseMessage;
import com.dayang.newmedia.newscommand.ws.commandapp.api.MissionApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Mission;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBaotiByIdResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryMissionByIdResponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T01:30:07.527Z")
public class MissionApiServiceImpl extends MissionApiService {
    public static Logger log = Logger.getLogger(MissionApiServiceImpl.class);
    public TaskMissionService taskMissionService = (TaskMissionService) SpringContextUtil.getBean("taskMissionService");
    public NewsTaskService newsTaskService = (NewsTaskService) SpringContextUtil.getBean("newsTaskService");
    public CustomSettingService customSettingService = (CustomSettingService) SpringContextUtil.getBean("customSettingService");
    @Override
    public Response queryMissionById(String id, SecurityContext securityContext) throws NotFoundException {
        try {
            TaskMissonWithBLOBs taskMission = taskMissionService.getTaskMissionByMissionGuid(id) ;
            Mission missionTask = getMissionTask(taskMission) ;
           return  Response.ok().entity(getResopnseWithSuccess("",missionTask)).build();
        } catch (Exception e) {
            return Response.ok().entity(getWithFailure(e.getMessage())).build();
        }
        
    }
    /**
     * 转换APP所需字段
     * 
     * @param list
     * @return
     */
    private Mission getMissionTask(TaskMissonWithBLOBs taskMission) {
        Mission oMission = new Mission();
        NewsTaskWithBLOBs xuantiTask = newsTaskService.getBaoTiNewsTaskByTaskGuid(taskMission.getTaskguid());
        String chargeMan = taskMission.getMchargeman();
        oMission.setMissionChargeMan(chargeMan);
        oMission.setMissionContent(taskMission.getMevents());
        oMission.setMissionCreater(taskMission.getMcreater());
        oMission.setMissionType(taskMission.getMtype());
        // 获取数据库当前时间
        Date dbCurrentDate = newsTaskService.getDBDate();
        // 创建时间
        Date createDate = taskMission.getMcreatetime();
        String createTime = "";
        if (createDate!=null) {
        	createTime = TimeAgo.newsCommandToDay(createDate, dbCurrentDate);
        }
        oMission.setMissionCreateTime(createTime);
        // 完成时间
        Date finishDate = taskMission.getMfinishtime();
        String finishTime = "";
        if (finishDate!=null) {
        	finishTime = TimeAgo.newsCommandToDay(finishDate, dbCurrentDate);
        }
        // 选题负责人
        String taskChareMan = taskMission.getTaskchangeman();
        oMission.setMissionFinishTime(finishTime);
        oMission.setMissionState(taskMission.getMstate());
        oMission.setTaskGuid(taskMission.getTaskguid());
        oMission.setTaskTitle(xuantiTask.getTasktitle());
        oMission.setMissionGuid(taskMission.getMguid());
        oMission.setMissionTypeName(customSettingService.getConfigNameByValue("renwu", taskMission.getMtype()));
        if (StringUtils.isNotEmpty(taskChareMan)) {
        	oMission.setTaskChangeMan(taskChareMan);
        }
        return oMission;
    }

    /**
     * 成功响应
     * @param message
     * @param missionInfo
     * @return
     */
    public QueryMissionByIdResponse getResopnseWithSuccess(String message, com.dayang.newmedia.newscommand.ws.commandapp.model.Mission missionInfo) {
        QueryMissionByIdResponse queryMissionByIdResponse = new QueryMissionByIdResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess(message);
        queryMissionByIdResponse.setCommonResponse(commonResponse);
        queryMissionByIdResponse.setMissionInfo(missionInfo);
        return queryMissionByIdResponse;
    }

    /**
     * 失败返回结果
     * 
     * @param msg
     * @return
     */
    public QueryMissionByIdResponse getWithFailure(String msg) {
        QueryMissionByIdResponse queryMissionByIdResponse = new QueryMissionByIdResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
        queryMissionByIdResponse.setCommonResponse(commonResponse);
        return queryMissionByIdResponse;
    }
}
