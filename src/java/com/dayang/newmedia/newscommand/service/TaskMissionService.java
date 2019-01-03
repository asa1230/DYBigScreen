package com.dayang.newmedia.newscommand.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.dao.DBMetaDataMapper;
import com.dayang.newmedia.newscommand.db.dao.TaskMissonMapper;
import com.dayang.newmedia.newscommand.db.dao.TaskSettingsMapper;
import com.dayang.newmedia.newscommand.db.model.BanmianInfo;
import com.dayang.newmedia.newscommand.db.model.NewsTaskWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.PageResult;
import com.dayang.newmedia.newscommand.db.model.TaskMissonQuery;
import com.dayang.newmedia.newscommand.db.model.TaskMissonQuery.Criteria;
import com.dayang.newmedia.newscommand.db.model.TaskMissonWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.TaskSearchPara;
import com.dayang.newmedia.newscommand.db.model.TaskSettings;
import com.dayang.newmedia.newscommand.db.model.TaskSettingsQuery;
import com.dayang.newmedia.newscommand.db.model.enums.ISDELETEFINISHEDMISSION;
import com.dayang.newmedia.newscommand.db.model.enums.TASKMISSIONSTATUS;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Mission;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryTaskCondition;

@Service("taskMissionService")
public class TaskMissionService extends BaseService {
	
	@Autowired
	public TaskMissonMapper taskMissonMapper;
	@Autowired
	public DBMetaDataMapper dbMetaDataMapper ;
	@Autowired
	public NewsTaskService newsTaskService ;
	@Autowired
	public TaskSettingsMapper taskSettingsMapper ;
	/**
	 * 根据选题/派题ID获取该选题/派题下的任务
	 * @param taskGuid
	 * @return
	 */
	public List<TaskMissonWithBLOBs> getTaskMissonList(String taskGuid) {
		TaskMissonQuery example = new TaskMissonQuery();
		Criteria criteria = example.createCriteria();
		criteria.andTaskguidEqualTo(taskGuid);
		return taskMissonMapper.selectByExampleWithBLOBs(example);
	}
	
	/**
	 * 根据选题id和任务状态过滤
	 * @param taskGuid
	 * @param mstate
	 * @return 符合条件数
	 */
	public Integer getTaskMissonListFinishSize(String taskGuid,Integer mstate) {
		TaskMissonQuery example = new TaskMissonQuery();
		Criteria criteria = example.createCriteria();
		criteria.andTaskguidEqualTo(taskGuid);
		criteria.andMstateEqualTo(mstate);
		return taskMissonMapper.selectByExampleWithBLOBs(example).size();
	}
	
	
	/**
	 *  增加任务 
	 * @param taskMission
	 * @return
	 * @throws Exception 
	 */
	@Transactional
	public String saveMissionTask(Mission mission) throws Exception{
	    NewsTaskWithBLOBs newsTask = newsTaskService.getBaoTiNewsTaskByTaskGuid(mission.getTaskGuid()) ;
	    String taskMissionGuid = UUID.randomUUID().toString() ;
	    TaskMissonWithBLOBs taskWithBlob = new TaskMissonWithBLOBs();
	    taskWithBlob.setMguid(taskMissionGuid);
	    taskWithBlob.setTaskguid(mission.getTaskGuid());
	    taskWithBlob.setMchargeman(mission.getMissionChargeMan());
	    taskWithBlob.setMcreater(mission.getMissionCreater());
	    taskWithBlob.setMcreatetime(dbMetaDataMapper.getCurrentTime());
	    taskWithBlob.setMfinishtime(dbMetaDataMapper.getCurrentTime());
	    taskWithBlob.setMevents(mission.getMissionContent());
	    taskWithBlob.setMstate(mission.getMissionState());
	    taskWithBlob.setMlevel(0);
	    taskWithBlob.setMtype(mission.getMissionType());
	    taskWithBlob.setMtitle(newsTask.getTasktitle());
	    taskWithBlob.setTasktitle(newsTask.getTasktitle());
	    String taskChargeman = "";
	    String chargeMan = newsTask.getChargeman();
	    if (StringUtils.isNotEmpty(chargeMan)) {
	    	taskChargeman = chargeMan;
	    }
	    taskWithBlob.setTaskchangeman(taskChargeman);
	    taskMissonMapper.insertSelective(taskWithBlob);
	    
	    TaskSettings taskSettings = new TaskSettings();
	    taskSettings.setCreatetime(dbMetaDataMapper.getCurrentTime());
	    taskSettings.setGuid(UUID.randomUUID().toString());
	    taskSettings.setTaskguid(mission.getTaskGuid());
	    taskSettings.setMguid(taskMissionGuid);
	    taskSettings.setTasktype(0);
        taskSettingsMapper.insertSelective(taskSettings) ;
        
	    return  taskMissionGuid ;
	}
	
	/**
	 *  更新任务
	 * @param mission
	 */
	public void updateMissionTask(Mission mission){
	    TaskMissonWithBLOBs taskMissonWithBLOBs = taskMissonMapper.selectByPrimaryKey(mission.getMissionGuid()) ;
	    String missonContent = mission.getMissionContent();
	    if (StringUtils.isNotEmpty(missonContent)) {
	    	taskMissonWithBLOBs.setMevents(missonContent);
	    }
	    String missonCreater = mission.getMissionCreater();
	    if (StringUtils.isNotEmpty(missonCreater)) {
	    	taskMissonWithBLOBs.setMcreater(missonCreater);
	    }
	    String missionChargeMan = mission.getMissionChargeMan();
	    if (StringUtils.isNotEmpty(missionChargeMan)) {
	    	taskMissonWithBLOBs.setMchargeman(missionChargeMan);
	    }
	    Integer missionState = mission.getMissionState();
	    if (missionState != null) {
	    	taskMissonWithBLOBs.setMstate(missionState);
	    }
	    String missionType = mission.getMissionType();
	    if (StringUtils.isNotEmpty(missionType)) {
	    	taskMissonWithBLOBs.setMtype(missionType);	
	    }
	    taskMissonWithBLOBs.setMfinishtime(dbMetaDataMapper.getCurrentTime());
	    taskMissonMapper.updateByPrimaryKeySelective(taskMissonWithBLOBs);
	}


	/**
	 *  根据任务GUID 删除任务,删除任务同时，删除任务关联表(taskSetting)
	 * @param taskMissionGuid
	 */
	@Transactional
    public void delTaskMissonById(String taskMissionGuid) {
        taskMissonMapper.deleteByPrimaryKey(taskMissionGuid) ;
        TaskSettingsQuery example = new TaskSettingsQuery();
        com.dayang.newmedia.newscommand.db.model.TaskSettingsQuery.Criteria createCriteria = example.createCriteria() ;
        createCriteria.andMguidEqualTo(taskMissionGuid) ;
        taskSettingsMapper.deleteByExample(example) ;
    }

    /**
     *  设置 获取任务的查询参数
     * @param queryTaskCondition
     * @return
     * @throws Exception 
     */
    public TaskSearchPara getMisssionTaskSearchPara(QueryTaskCondition queryTaskCondition) throws Exception {
        TaskSearchPara taskSearchPara = new TaskSearchPara();
        String userId = queryTaskCondition.getUserId();
        String chargeMan = null;
        // 根据用户Id获取用户姓名
        String userName = CommonServiceUtil.getUserNameByUserId(userId);
        List<String> aXuanTiIds = new ArrayList<String>() ;
        Integer queryModel = null;
        Integer start = queryTaskCondition.getStart();
        Integer limit = queryTaskCondition.getLimit();
        if (start == null) {
            start =0;
        }
        if (limit == null || limit ==0) {
            limit = 5;
        }
        
        if (queryTaskCondition.getQueryModel() == 0) {
            // 全部任务
            queryModel = 0;
            //获取用户下所有选题列表
            List<NewsTaskWithBLOBs> aXuanTiList = newsTaskService.getXuanTiOfCurrentUser(userId) ;
            for (Iterator iterator = aXuanTiList.iterator(); iterator.hasNext();) {
                NewsTaskWithBLOBs oNewsTask = (NewsTaskWithBLOBs) iterator.next();
                aXuanTiIds.add(oNewsTask.getTaskguid()) ;
            }
        } else if (queryTaskCondition.getQueryModel() == 1) {
            // 我的任务
            chargeMan = userName ;
            queryModel = 1;
        }
        String searchContent = queryTaskCondition.getSearchContent();
        if (StringUtils.isNotEmpty(searchContent)) {
        	taskSearchPara.setSearchContent("%"+searchContent+"%");
        }
        taskSearchPara.setaXuanTiGuids(aXuanTiIds);
        taskSearchPara.setChargetMan(chargeMan);
        taskSearchPara.setQueryModel(queryModel);
        taskSearchPara.setStart(start);
        taskSearchPara.setLimit(limit);
        //获取swich开关（按创建时间还是修改时间排序:0=按照创建时间排序 1=更新时间排序）
  		Integer orderTime = CommonServiceUtil.getSwitchSettingValueByType(Constants.SWICHSERVICE_RENWU_ORDER);
  		if(orderTime != null){
  			if(orderTime == 1){
  	  			taskSearchPara.setSortColumn("mfinishtime");
  	  		}else{
  	  			taskSearchPara.setSortColumn("mcreatetime");
  	  		}
  		}else{
  			taskSearchPara.setSortColumn("mfinishtime");
  		}
        taskSearchPara.setDirection("desc");
        return taskSearchPara;
    }

    /**
     *  根据任务搜索参数获取任务列表
     * @param searchPara
     * @return
     */
    public PageResult<TaskMissonWithBLOBs> getMissionTaskList(TaskSearchPara searchPara){
        // 获取当前页数
        Integer currentPage = (searchPara.getStart()/searchPara.getLimit())+1;
        // 2、获取总数
        int totalCount = getMissionTaskTotal(searchPara);
        PageResult pr = new PageResult();
        // 3、查询
        setTaskSearchPara(currentPage,searchPara.getLimit(), totalCount, searchPara);
        List<TaskMissonWithBLOBs> taskList = taskMissonMapper.getMissionTaskInfos(searchPara);
        pr.setPage(currentPage);
        pr.setPageSize(searchPara.getLimit());
        pr.setTotalCount(totalCount);
        pr.setList(taskList);
        return pr;
    }
    
    /**
     * 获取栏目名称集合
     * @param banmianInfos
     * @return
     */
    public List<String> columnNameList(List<BanmianInfo> banmianInfos){
        List<String> columnNameList = new ArrayList<>();
        for (BanmianInfo banmianInfo : banmianInfos) {
            columnNameList.add(banmianInfo.getBname());
        }
        return columnNameList;
    }
    
    /**
     * 获取任务总数
     * @param taskSearchPara
     * @return
     * @author 
     */
    private int getMissionTaskTotal(TaskSearchPara taskSearchPara) {
        return taskMissonMapper.getMissionTaskTotal(taskSearchPara);
    }
    
    
    /**
     *  根据任务GUID获取任务
     * @param taskMissionGuid
     * @return
     */
    public TaskMissonWithBLOBs getTaskMissionByMissionGuid(String taskMissionGuid){
        return  taskMissonMapper.selectByPrimaryKey(taskMissionGuid) ;
    }
    
    /**
     * 根据选题ID更新未指派或者未完成的任务的状态
     * @param taskGuid
     * @param missionTaskState
     */
	public void updateUnusedAndPROCESSINGMission(String taskGuid, Integer missionTaskState) {
		TaskMissonQuery example = new TaskMissonQuery();
		Criteria criteria = example.createCriteria();
		criteria.andTaskguidEqualTo(taskGuid);
		List<Integer> stateList = new ArrayList<>();
		stateList.add(TASKMISSIONSTATUS.UNUSED.getMissionStatus());
		stateList.add(TASKMISSIONSTATUS.PROCESSING.getMissionStatus());
		criteria.andMstateIn(stateList);
		TaskMissonWithBLOBs taskMisson = new TaskMissonWithBLOBs();
		taskMisson.setMstate(missionTaskState);
		taskMissonMapper.updateByExampleSelective(taskMisson, example);
	}

	/**
	 * 根据选题GUID获取选题下面的任务（是否包含已完成的任务）
	 * @param taskGuid
	 * @param isDeleteMission
	 * @return
	 */
	public List<TaskMissonWithBLOBs> getMissionTaskByTaskGuid(String taskGuid, Integer isDeleteMission) {
		TaskMissonQuery example = new TaskMissonQuery();
		com.dayang.newmedia.newscommand.db.model.TaskMissonQuery.Criteria criteria = example.createCriteria();
		criteria.andTaskguidEqualTo(taskGuid);
		if (isDeleteMission == ISDELETEFINISHEDMISSION.NOTDELETE.getIsDelete()) {
			criteria.andMstateNotEqualTo(TASKMISSIONSTATUS.COMPLETED.getMissionStatus());
		}
		return taskMissonMapper.selectByExampleWithBLOBs(example);
	}
}
