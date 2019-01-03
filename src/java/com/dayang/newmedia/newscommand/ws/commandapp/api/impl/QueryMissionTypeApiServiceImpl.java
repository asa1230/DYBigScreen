package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import org.apache.log4j.Logger;
import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.newscommand.db.model.CustomSettings;
import com.dayang.newmedia.newscommand.service.CustomSettingService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryMissionTypeApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryMissionTypeResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.TaskMissionType;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T01:30:07.527Z")
public class QueryMissionTypeApiServiceImpl extends QueryMissionTypeApiService {
    public static Logger log = Logger.getLogger(QueryMissionTypeApiServiceImpl.class);
    public CustomSettingService customSettingService = (CustomSettingService) SpringContextUtil.getBean("customSettingService");
    @Override
    public Response queryMissionType(SecurityContext securityContext) throws NotFoundException {
        try {
            List<CustomSettings> aCustomConfigList = customSettingService.getCustomConfigList("renwu") ;
            List<TaskMissionType> aTaskMissionList = getTaskMissions(aCustomConfigList) ;
            return  Response.ok().entity(getResopnseWithSuccess("",aTaskMissionList)).build();
        } catch (Exception e) {
            log.error("", e);
            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();
        }
        
       
    }
    
    /**
     *  转换APP所需类型
     * @param aCustomConfigList
     * @return
     */
    private List<TaskMissionType> getTaskMissions(List<CustomSettings> aCustomConfigList) {
        List<TaskMissionType> aTaskMissionTypeList = new ArrayList<TaskMissionType> () ;
        for (CustomSettings customSettings : aCustomConfigList) {
            TaskMissionType taskMissionType = new TaskMissionType() ;
            taskMissionType.setGuid(customSettings.getCuguid());
            taskMissionType.setMissionType(customSettings.getCuvalue());
            taskMissionType.setMissionTypeName(customSettings.getCuname());
            aTaskMissionTypeList.add(taskMissionType);
        }
        return aTaskMissionTypeList;
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
    public QueryMissionTypeResponse getResopnseWithSuccess(String message, List<TaskMissionType> records) {
        QueryMissionTypeResponse queryMissionTypeResponse = new QueryMissionTypeResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess(message);
        queryMissionTypeResponse.setCommonResponse(commonResponse);
        queryMissionTypeResponse.setRecords(records);
        return queryMissionTypeResponse;
    }

    /**
     * 失败返回结果
     * 
     * @param msg
     * @return
     */
    public QueryMissionTypeResponse getResponseWithFailure(String msg) {
        QueryMissionTypeResponse queryMissionTypeResponse = new QueryMissionTypeResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
        queryMissionTypeResponse.setCommonResponse(commonResponse);
        return queryMissionTypeResponse;
    }
}
