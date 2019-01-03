package com.dayang.newmedia.newscommand.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.dao.DBMetaDataMapper;
import com.dayang.newmedia.newscommand.db.dao.NewsTaskMapper;
import com.dayang.newmedia.newscommand.db.dao.TaskMissonMapper;
import com.dayang.newmedia.newscommand.db.dao.TaskResourceMapper;
import com.dayang.newmedia.newscommand.db.model.BanmianInfo;
import com.dayang.newmedia.newscommand.db.model.NewsTaskWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.PageResult;
import com.dayang.newmedia.newscommand.db.model.TaskMissonQuery;
import com.dayang.newmedia.newscommand.db.model.TaskMissonWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.TaskResource;
import com.dayang.newmedia.newscommand.db.model.TaskResourceQuery;
import com.dayang.newmedia.newscommand.db.model.TaskResourceQuery.Criteria;
import com.dayang.newmedia.newscommand.db.model.TaskSearchPara;
import com.dayang.newmedia.newscommand.db.model.UserRoleInfo;
import com.dayang.newmedia.newscommand.db.model.enums.CLUETYPEANDSERVERTYPE_ID;
import com.dayang.newmedia.newscommand.db.model.enums.FILEUPLOADTYPE;
import com.dayang.newmedia.newscommand.db.model.enums.ISDELETEFINISHEDMISSION;
import com.dayang.newmedia.newscommand.db.model.enums.ISDOWNLOADFILE;
import com.dayang.newmedia.newscommand.db.model.enums.MESSAGEOPERATION;
import com.dayang.newmedia.newscommand.db.model.enums.NEWSTASKSTATES;
import com.dayang.newmedia.newscommand.db.model.enums.TASKMISSIONSTATUS;
import com.dayang.newmedia.newscommand.db.model.enums.XUANTISTATES;
import com.dayang.newmedia.newscommand.ws.client.clueclient.ClueClient;
import com.dayang.newmedia.newscommand.ws.client.clueclient.ClueClientFactory;
import com.dayang.newmedia.newscommand.ws.client.creclient.CREFolderClient;
import com.dayang.newmedia.newscommand.ws.client.creclient.CREResourceClient;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.AddResourceFolderResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.DeleteCREFolderResponse;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.FolderCondition;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ItemListWarper;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.MetaData;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ResourceFolder;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.SAttribute;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.UpdateFolderResponse;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.HJResourceClient;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.AddResourceResponse;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.AttachFile;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.Resource;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Clue;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Mission;
import com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueByIdResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySelectListCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryTaskCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXTCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXuantiByIdAndTypeResponse;

@Service("newsTaskService")
public class NewsTaskService extends BaseService {
	
	@Autowired
	public NewsTaskMapper newsTaskMapper;
	@Autowired
	public TaskResourceMapper taskResourceMapper;
	@Autowired
	public TaskMissonMapper taskMissonMapper;
	@Autowired
	public DBMetaDataMapper dbMetaDataMapper ;
	
	private NewsTaskService newsTaskService;
	
	public NewsTaskService getNewsTaskService() {
		return newsTaskService;
	}

	public void setNewsTaskService(NewsTaskService newsTaskService) {
		this.newsTaskService = newsTaskService;
	}

	public static Logger log = Logger.getLogger(NewsTaskService.class); 
	
	
	@Transactional
	public String addOrUpdateNewsTask(NewsTaskWithBLOBs newsTaskWithBLOBs) throws Exception {
		String creater = newsTaskWithBLOBs.getCreater();
		// 1、获取汇聚新增入库接口
		String url = CommonServiceUtil.getServerSettingUrlByUtype(Constants.HJ_ADD_URL);
		
		// 2、调用汇聚的标准入库服务
		List<TaskResource> taskResourceList = newsTaskWithBLOBs.getTaskResources();
		if (StringUtils.listIsNotEmpty(taskResourceList)) {
			for (TaskResource taskResource : taskResourceList) {
				if (taskResource.getResourcetype().equals(Constants.LOCAL_TYPE)) {
					Resource resource = getResourceByAttachFile(creater, taskResource);
					AddResourceResponse addResourceResponse = HJResourceClient.addResource(url, resource);
					if (!addResourceResponse.getCommonResponse().getSuccess()) {
						throw new Exception("本地资源入库失败!");
					}
					taskResource.setResourcetype(Constants.HUIJU_TYPE);
				}
			}
		}
		
		// 3、入本地库
		if (newsTaskService==null) {
			newsTaskService = this;
		}
		return newsTaskService.addOrUpdateLocalNewsTaskAndAttach(newsTaskWithBLOBs);
	}

	/**
	 * 将任务插入本地表中
	 * @param newsTaskWithBLOBs
	 * @return
	 * @author luomeng
	 * @throws Exception 
	 */
	public String addOrUpdateLocalNewsTaskAndAttach(NewsTaskWithBLOBs newsTaskWithBLOBs) throws Exception {
		String taskGuid = newsTaskWithBLOBs.getTaskguid();
		if (StringUtils.isEmpty(taskGuid)) {
			return newsTaskService.addNewsTask(newsTaskWithBLOBs);
		} else {
			newsTaskService.updteNewsTask(newsTaskWithBLOBs);
			return taskGuid;
		}
	}

	/**
	 * 新增任务
	 * @param newsTaskWithBLOBs
	 * @return
	 * @author luomeng
	 * @throws Exception 
	 */
	public String addNewsTask(NewsTaskWithBLOBs newsTaskWithBLOBs) throws Exception{
		// 插入主表 NewsTask
		String taskGuid = StringUtils.CreateGuid();
		newsTaskWithBLOBs.setTaskguid(taskGuid);
		newsTaskMapper.insertSelective(newsTaskWithBLOBs);
		// 插入资源表 TaskResource
		List<TaskResource> taskResources = newsTaskWithBLOBs.getTaskResources();
		if (StringUtils.listIsNotEmpty(taskResources)) {
			for (TaskResource taskResource : taskResources) {
				taskResource.setTaskguid(taskGuid);
				insertTaskResource(taskResource);
			}
		}
		return taskGuid;
	}
	
	/**
	 * 更新任务
	 * @param newsTaskWithBLOBs
	 * @author luomeng
	 * @throws Exception 
	 */
	public void updteNewsTask(NewsTaskWithBLOBs newsTaskWithBLOBs) throws Exception{
		String taskGuid = newsTaskWithBLOBs.getTaskguid();
		// todo:判断更新前的状态，判断操作是提交报题，还是修改报题，改操作仅适用于发送消息，有待优化
		NewsTaskWithBLOBs sourceNewsTask = newsTaskMapper.selectByPrimaryKey(taskGuid);
		if (sourceNewsTask.getTaskstate() == NEWSTASKSTATES.SAVEBAOTI.getTaskState()) {
			newsTaskWithBLOBs.setOperation(MESSAGEOPERATION.ADDBAOTI.getOperation());
		} else {
			newsTaskWithBLOBs.setOperation(MESSAGEOPERATION.UPDATEBAOTI.getOperation());
		}
		// 更新主表 NewsTask
		newsTaskMapper.updateByPrimaryKeySelective(newsTaskWithBLOBs);
		// 根据任务ID删除资源表中的数据
		deleteTaskResourceByTaskGuid(newsTaskWithBLOBs.getTaskguid());
		// 插入资源表TaskResource
		List<TaskResource> taskResources = newsTaskWithBLOBs.getTaskResources();
		if (StringUtils.listIsNotEmpty(taskResources)) {
			for (TaskResource taskResource : taskResources) {
				taskResource.setTaskguid(taskGuid);
				insertTaskResource(taskResource);
			}
		}
	}
	
	/**
	 * 根据任务ID删除该任务下所挂载的资源
	 * @param taskGuid
	 * @author luomeng
	 */
	public void deleteTaskResourceByTaskGuid(String taskGuid){
		TaskResourceQuery example = new TaskResourceQuery();
		Criteria criteria = example.createCriteria();
		criteria.andTaskguidEqualTo(taskGuid);
		taskResourceMapper.deleteByExample(example);
	}
	
	/**
	 * 根据选题或报题ID删除选题或报题
	 * @param taskGuid
	 * @author luomeng
	 */
	public void deleteNewsTaskByTaskGuid(String taskGuid){
		newsTaskMapper.deleteByPrimaryKey(taskGuid);
	}
	
	/**
	 * 挂载资源
	 * 1、根据资源ID获取资源详情，主要是标题以及资源类型
	 * 2、入库
	 * @param taskResource
	 * @author luomeng
	 * @throws Exception 
	 */
	public void insertTaskResource(TaskResource taskResource) throws Exception{
		String guid = StringUtils.CreateGuid();
		String resourceGuid = taskResource.getResourceguid();
		String resourceType = taskResource.getResourcetype();
		String serverUrl = null;
		Integer clueType = null;
		for (CLUETYPEANDSERVERTYPE_ID cluetypeandservertype : CLUETYPEANDSERVERTYPE_ID.values()) {
			if (cluetypeandservertype.getResourceType().equals(resourceType)) {
				serverUrl = CommonServiceUtil.getServerSettingUrlByUtype(cluetypeandservertype.getServerType());
				String url = cluetypeandservertype.getUrl();
				if (StringUtils.isNotEmpty(url)) {
					serverUrl = StringUtils.combineUrl(serverUrl, url);
				}
				clueType = cluetypeandservertype.getClueType();
				break;
			}
		}
		ClueClientFactory.instance();
		ClueClient clueClient = ClueClientFactory.getClueClient(clueType);
		QueryClueCondition queryClueCondition = new QueryClueCondition();
		queryClueCondition.setQueryModel(clueType);
		queryClueCondition.setResourceGuid(resourceGuid);
		QueryClueByIdResponse response = clueClient.getClueInfoByResourceGuid(serverUrl, queryClueCondition);
		if (response.getCommonResponse().getSuccess()){
			Clue clue = response.getResourceInfo();
			taskResource.setGuid(guid);
			taskResource.setTitle(clue.getTitle());
			taskResource.setCreatetime(dbMetaDataMapper.getCurrentTime());
			taskResource.setTaskguid(taskResource.getTaskguid());
			taskResource.setAuthor(clue.getAttachSubType());
			taskResourceMapper.insertSelective(taskResource);
		}
	}
	
	/**
	 * 入汇聚参数
	 * @param taskResource
	 * @return
	 * @author luomeng
	 * @throws Exception 
	 */
	public Resource getResourceByAttachFile(String creater,TaskResource taskResource) throws Exception{
		Resource resource = new Resource();
		// 资源的GUID
		resource.setResourceId(taskResource.getResourceguid());
		// 附件路径
		String filePath = taskResource.getFilePath();
		if (StringUtils.isEmpty(filePath)) {
			throw new Exception("本地资源的路径不能为空!");
		}
		// 标题  文件名
		String title = StringUtils.getFileNameByAddress(filePath);
		resource.setTitle(title);
		// 提交人姓名
		resource.setSubmitUserName(creater);
		// 提交人ID
		String userId = CommonServiceUtil.getUserIDbyUserName(creater);
		resource.setSubmitUserId(userId);
		// 来源系统ID
		String sysId = Constants.BAOTIZIYUAN;
		resource.setSourceSystemId(sysId);
		// 可见范围
		String visibleRange = "0";
		resource.setVisibleRange(visibleRange);
		// 可见范围类型
		Integer visibleRangeType = 0;
		resource.setVisibleRangeType(visibleRangeType);
		// 附件类型
		resource.setAttachFilePathType(FILEUPLOADTYPE.FTP.getFilePathType());
		// 附件列表
		List<AttachFile> attachFiles = new ArrayList<>();
		AttachFile attachFile = new AttachFile();
		attachFile.setFilePath(filePath);
		attachFiles.add(attachFile);
		resource.setAttachFiles(attachFiles);
		resource.setIsDownLoadAttachFile(ISDOWNLOADFILE.NO.getIsDownLoad());
		return resource;
	}


	public TaskSearchPara getXuanTiTaskSearchPara(QueryXTCondition queryXTCondition) throws Exception {
		TaskSearchPara taskSearchPara = new TaskSearchPara();
		// 创建人
		String creater = queryXTCondition.getCreater();
		// 负责人
		String chargeMan = queryXTCondition.getChargeMan();
		// 参与人
		String inPeople = queryXTCondition.getInPeople();
		if (StringUtils.isNotEmpty(inPeople)) {
			inPeople = "%"+queryXTCondition.getInPeople()+"%" ;
		}
		// 标题，此项是用like查询；
		String taskTitle = queryXTCondition.getTaskTitle();
		if (StringUtils.isNotEmpty(taskTitle)) {
			taskTitle = "%"+queryXTCondition.getTaskTitle()+"%" ;
		}
		// 内容，此项是用like查询；
		String taskContent = queryXTCondition.getTaskContent();
		if (StringUtils.isNotEmpty(taskContent)) {
			taskContent = "%"+queryXTCondition.getTaskContent()+"%" ;
		}
		// 资源类型为选题的
		List<Integer> taskStateList = new ArrayList<>();
		taskStateList.add(NEWSTASKSTATES.XUANTI.getTaskState());
		// 资源的选题状态
		List<Integer> xuanTiStateList = new ArrayList<>();
		String xuantiState = queryXTCondition.getXuantiState();
		if (StringUtils.isNotEmpty(xuantiState)) {
			xuanTiStateList.add(Integer.parseInt(xuantiState));
		} else {
			for (XUANTISTATES xuanTi : XUANTISTATES.values()) {
				if (xuanTi.getXuanTiState()!=XUANTISTATES.SAVE.getXuanTiState()) {
					xuanTiStateList.add(xuanTi.getXuanTiState());
				}
			}
		}
		// 所属栏目
		String ownColumn = queryXTCondition.getOwnColumn();
		List<String> columnList = null;
		if (StringUtils.isNotEmpty(ownColumn)) {
			 columnList = java.util.Arrays.asList(ownColumn.split(","));
		}
		// 起始页
		Integer start = queryXTCondition.getStart();
		// 每页条数
		Integer limit = queryXTCondition.getLimit();
		
		if (start == null) {
            start = 0;
        }
        if (limit == null || limit ==0) {
            limit = 8;
        }
		
        taskSearchPara.setCreater(creater);
		taskSearchPara.setChargetMan(chargeMan);
		taskSearchPara.setInPeople(inPeople);
		taskSearchPara.setTaskTitle(taskTitle);
		taskSearchPara.setTaskContent(taskContent);
		taskSearchPara.setTaskStateList(taskStateList);
		taskSearchPara.setXuanTiStateList(xuanTiStateList);
		taskSearchPara.setColumnList(columnList);
		taskSearchPara.setStart(start);
		taskSearchPara.setLimit(limit);
		
		//获取swich开关（按创建时间还是修改时间排序:0=按照创建时间排序 1=更新时间排序）
		Integer orderTime = CommonServiceUtil.getSwitchSettingValueByType(Constants.SWICHSERVICE_XUANTI_ORDER);
		if(orderTime != null){
  			if(orderTime == 1){
  	  			taskSearchPara.setSortColumn("ModifyTime");
  	  		}else{
  	  			taskSearchPara.setSortColumn("CreateTime");
  	  		}
  		}else{
  			taskSearchPara.setSortColumn("CreateTime");
  		}
		taskSearchPara.setDirection("desc");
		return taskSearchPara;
	}
	//重载 用于大屏 获取选题列表
	public TaskSearchPara getXuanTiTaskSearchPara(QuerySelectListCondition queryXTCondition) throws Exception {
		TaskSearchPara taskSearchPara = new TaskSearchPara();
		// 负责人
		String chargeMan = queryXTCondition.getChargerId();
		// 资源类型为选题的
		List<Integer> taskStateList = new ArrayList<>();
		taskStateList.add(NEWSTASKSTATES.XUANTI.getTaskState());
		// 资源的选题状态
		List<Integer> xuanTiStateList = new ArrayList<>();
		String xuantiState = queryXTCondition.getStatus();
		if (StringUtils.isNotEmpty(xuantiState)) {
			xuanTiStateList.add(Integer.parseInt(xuantiState));
		} else {
			for (XUANTISTATES xuanTi : XUANTISTATES.values()) {
				if (xuanTi.getXuanTiState()!=XUANTISTATES.SAVE.getXuanTiState()) {
					xuanTiStateList.add(xuanTi.getXuanTiState());
				}
			}
		}
		// 所属栏目
		String ownColumn = queryXTCondition.getDepartment();
		List<String> columnList = null;
		if (StringUtils.isNotEmpty(ownColumn)) {
			 columnList = java.util.Arrays.asList(ownColumn.split(","));
		}
		// 起始页
		Integer start = queryXTCondition.getStart();
		// 每页条数
		Integer limit = queryXTCondition.getLimit();
		
		if (start == null) {
            start = 0;
        }
        if (limit == null || limit ==0) {
            limit = 8;
        }
		
		taskSearchPara.setChargetMan(chargeMan);
		taskSearchPara.setTaskStateList(taskStateList);
		taskSearchPara.setXuanTiStateList(xuanTiStateList);
		taskSearchPara.setColumnList(columnList);
		taskSearchPara.setStart(start);
		taskSearchPara.setLimit(limit);
		
		//获取swich开关（按创建时间还是修改时间排序:0=按照创建时间排序 1=更新时间排序）
		Integer orderTime = CommonServiceUtil.getSwitchSettingValueByType(Constants.SWICHSERVICE_XUANTI_ORDER);
		if(orderTime != null){
  			if(orderTime == 1){
  	  			taskSearchPara.setSortColumn("ModifyTime");
  	  		}else{
  	  			taskSearchPara.setSortColumn("CreateTime");
  	  		}
  		}else{
  			taskSearchPara.setSortColumn("CreateTime");
  		}
		taskSearchPara.setDirection("desc");
		return taskSearchPara;
	}
	
	/**1、查询全部的报题资源
                        查询当前登陆用户所属栏目下所有的报题资源（不包含保存状态的）
        2、查询我的报题资源
                          查询当前登陆用户创建的报题资源
	 * @author ybh
	 * @param queryTaskCondition
	 * @return
	 * @throws Exception
	 */
	public TaskSearchPara getBaoTiTaskSearchPara(QueryTaskCondition queryTaskCondition) throws Exception {
	    TaskSearchPara taskSearchPara = new TaskSearchPara();
        String userId = queryTaskCondition.getUserId();
        String creater = null;
        // 根据用户Id获取用户姓名
        String userName = CommonServiceUtil.getUserNameByUserId(userId);
        // 根据用户ID获取所有栏目信息
        List<BanmianInfo> banmianInfos = CommonServiceUtil.getBanmianInfoListByUserGuid(userId);
        // 1、资源类型为报题的
        List<Integer> taskStateList = new ArrayList<>();
        taskStateList.add(NEWSTASKSTATES.BAOTI.getTaskState());
        // 2、用户所属栏目
        List<String> columnList = columnNameList(banmianInfos,true);
        // 3、查询方式
        Integer queryModel = null;
        // 4、起始页
        Integer start = queryTaskCondition.getStart();
        // 5、每页条数
        Integer limit = queryTaskCondition.getLimit();
        // 6、搜索内容
        String searchContent = queryTaskCondition.getSearchContent();
        if (StringUtils.isNotEmpty(searchContent)) {
        	searchContent = "%"+searchContent+"%";
        }
        if (start == null) {
            start =0;
        }
        if (limit == null || limit ==0) {
            limit = 5;
        }
        
        creater = userName; 
        if (queryTaskCondition.getQueryModel() == 0) {
            // 全部报题
            queryModel = 0;
        } else if (queryTaskCondition.getQueryModel() == 1) {
            // 我的报题
            taskStateList.add(NEWSTASKSTATES.SAVEBAOTI.getTaskState()) ;
           
            queryModel = 1;
        }
        taskSearchPara.setColumnList(columnList);
        taskSearchPara.setCreater(creater);
        taskSearchPara.setQueryModel(queryModel);
        taskSearchPara.setTaskStateList(taskStateList);
        taskSearchPara.setStart(start);
        taskSearchPara.setLimit(limit);
        taskSearchPara.setSearchContent(searchContent);
        //获取swich开关（按创建时间还是修改时间排序:0=按照创建时间排序 1=更新时间排序）
  		Integer orderTime = CommonServiceUtil.getSwitchSettingValueByType(Constants.SWICHSERVICE_BAOTI_ORDER);
  		if(orderTime != null){
  			if(orderTime == 1){
  	  			taskSearchPara.setSortColumn("ModifyTime");
  	  		}else{
  	  			taskSearchPara.setSortColumn("CreateTime");
  	  		}
  		}else{
  			taskSearchPara.setSortColumn("CreateTime");
  		}
  		taskSearchPara.setDirection("desc");
        return taskSearchPara;
	}
	
	/**
	 * 获取栏目名称集合
	 * @param banmianInfos
	 * @return
	 */
	public List<String> columnNameList(List<BanmianInfo> banmianInfos,boolean isLikeSearch){
		List<String> columnNameList = new ArrayList<>();
		for (BanmianInfo banmianInfo : banmianInfos) {
			if (isLikeSearch) {
				columnNameList.add("%"+banmianInfo.getBname()+"%");
			} else {
				columnNameList.add(banmianInfo.getBname());
			}
		}
		return columnNameList;
	}

	/**
	 * 获取资源条目
	 * @param taskSearchPara
	 * @return
	 * @author luomeng
	 */
	public PageResult<NewsTaskWithBLOBs> getNewsTaskList(TaskSearchPara taskSearchPara) {
		// 获取当前页数
		Integer currentPage = (taskSearchPara.getStart()/taskSearchPara.getLimit())+1;
		// 2、获取总数
		int totalCount = getNewsTaskTotal(taskSearchPara);
		PageResult pr = new PageResult();
		// 3、查询
		setTaskSearchPara(currentPage,taskSearchPara.getLimit(), totalCount, taskSearchPara);
		List<NewsTaskWithBLOBs> taskList = newsTaskMapper.getNewsTaskInfos(taskSearchPara);
		pr.setPage(currentPage);
		pr.setPageSize(taskSearchPara.getLimit());
		pr.setTotalCount(totalCount);
		pr.setList(taskList);
		return pr;
	}

	/**
	 * 获取总数
	 * @param taskSearchPara
	 * @return
	 * @author luomeng
	 */
	private int getNewsTaskTotal(TaskSearchPara taskSearchPara) {
		return newsTaskMapper.getNewsTaskTotal(taskSearchPara);
	}

	
	
	 /**
    * 获取报题
    * @param taskSearchPara
    * @return
    * @author 
    */
   public PageResult<NewsTaskWithBLOBs> getBaoTiNewsTaskList(TaskSearchPara taskSearchPara) {
       // 获取当前页数
       Integer currentPage = (taskSearchPara.getStart()/taskSearchPara.getLimit())+1;
       // 2、获取总数
       int totalCount = getBaoTiNewsTaskTotal(taskSearchPara);
       PageResult pr = new PageResult();
       // 3、查询
       setTaskSearchPara(currentPage,taskSearchPara.getLimit(), totalCount, taskSearchPara);
       List<NewsTaskWithBLOBs> taskList = newsTaskMapper.getBaoTiNewsTaskInfos(taskSearchPara);
       pr.setPage(currentPage);
       pr.setPageSize(taskSearchPara.getLimit());
       pr.setTotalCount(totalCount);
       pr.setList(taskList);
       return pr;
   }

   /**
    * 获取报题总数
    * @param taskSearchPara
    * @return
    * @author 
    */
   private int getBaoTiNewsTaskTotal(TaskSearchPara taskSearchPara) {
       return newsTaskMapper.getBaoTiNewsTaskTotal(taskSearchPara);
   }
	
	/**
	 * 根据选题ID获取选题详情
	 * 1、获取选题详细信息
	 * 2、调用CRE接口，获取该选题目录下所有的资源
	 * 3、根据选题ID获取该选题下创建的任务
	 * @param id
	 * @throws Exception 
	 */
	public NewsTask  getXuanTiNewsTaskById(String id) throws Exception {
		// 1、获取选题/报题详情
		NewsTaskWithBLOBs newsTask = newsTaskMapper.selectByPrimaryKey(id);
		if (newsTask == null) {
			throw new Exception("找不到该选题!");
		}
		if (newsTask.getXuantistate() == null) {
			throw new Exception("选题参数有误!");
		}
		// 如果选题状态是保存，则和报题一样
		if (newsTask.getXuantistate().intValue() == XUANTISTATES.SAVE.getXuanTiState()) {
			NewsTaskWithBLOBs saveNewsTask = getBaoTiNewsTaskByTaskGuid(id);
			NewsTask appNewsTask = CommonServiceUtil.getAppNewsTaskByNewsTaskWithBLOBS(saveNewsTask);
			appNewsTask.setResourceList(CommonServiceUtil.getResourceByNewsTaskId(id));
			return appNewsTask;
		} else {
			// 2、调用CRE接口获取选题目录下的资源
//			String searchUrl = CommonServiceUtil.getServerSettingUrlByUtype(Constants.CRE_SEARCH_URL_TYPE);
//			ItemListWarper itemListWarper = CREResourceClient.getCREFolderResourceList(searchUrl, "", Constants.DEFAULT_START, Constants.MAX_PAGE, null, null, id);
			// 3、获取该选题下的任务
			List<TaskMissonWithBLOBs> taskMissonList = CommonServiceUtil.getTaskMissonList(id);
			NewsTask appNewsTask = CommonServiceUtil.getAppNewsTaskByNewsTaskWithBLOBS(newsTask);
			List<Clue> xuanTiResource = null;
			List<Mission> missionList = CommonServiceUtil.getAppMissionList(taskMissonList);
			appNewsTask.setXuanTiresourceList(xuanTiResource);
			appNewsTask.setTaskMissionList(missionList);
			//该选题下任务各状态任务数
			Integer wzpMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(id,0);
			Integer jzxMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(id,2);
			Integer finishMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(id,3);
			Integer zzMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(id,9);
			appNewsTask.setWzpMissonNum(wzpMissonNum);
			appNewsTask.setJzxMissonNum(jzxMissonNum);
			appNewsTask.setFinishMissonNum(finishMissonNum);
			appNewsTask.setZzMissonNum(zzMissonNum);
			appNewsTask.setMissonNum(missionList.size());
			appNewsTask.setResourceNum(0);
			appNewsTask.setXuanTiresourceJson(newsTask.getContentrtf2());
			return appNewsTask;
		}
	}
	/**
	 * 根据选题ID获取选题详情（for大屏）
	 * 1、获取选题详细信息
	 * 2、调用CRE接口，获取该选题目录下所有的资源
	 * 3、根据选题ID获取该选题下创建的任务
	 * @param id
	 * @throws Exception 
	 */
	public NewsTask getBigShowXuanTiNewsTaskById(String id) throws Exception {
		// 1、获取选题/报题详情
		NewsTaskWithBLOBs newsTask = newsTaskMapper.selectByPrimaryKey(id);
		if (newsTask == null) {
			throw new Exception("找不到该选题!");
		}
		if (newsTask.getXuantistate() == null) {
			throw new Exception("选题参数有误!");
		}
		// 如果选题状态是保存，则和报题一样
		if (newsTask.getXuantistate().intValue() == XUANTISTATES.SAVE.getXuanTiState()) {
			NewsTaskWithBLOBs saveNewsTask = getBaoTiNewsTaskByTaskGuid(id);
			NewsTask appNewsTask = CommonServiceUtil.getAppNewsTaskByNewsTaskWithBLOBS(saveNewsTask);
			appNewsTask.setResourceList(CommonServiceUtil.getResourceByNewsTaskId(id));
			return appNewsTask;
		} else {
			/*// 2、调用CRE接口获取选题目录下的资源
			String searchUrl = CommonServiceUtil.getServerSettingUrlByUtype(Constants.CRE_SEARCH_URL_TYPE);
			ItemListWarper itemListWarper = CREResourceClient.getCREFolderResourceList(searchUrl, "", Constants.DEFAULT_START, Constants.MAX_PAGE, null, null, id);*/
			// 3、获取该选题下的任务
			List<TaskMissonWithBLOBs> taskMissonList = CommonServiceUtil.getTaskMissonList(id);
			NewsTask appNewsTask = CommonServiceUtil.getAppNewsTaskByNewsTaskWithBLOBS(newsTask);
			List<Clue> xuanTiResource = null;
			List<Mission> missionList = CommonServiceUtil.getAppMissionList(taskMissonList);
			appNewsTask.setXuanTiresourceList(xuanTiResource);
			appNewsTask.setTaskMissionList(missionList);
			appNewsTask.setChargeMan(newsTask.getChargeman());
			appNewsTask.setInPeople(newsTask.getInpeople());
			appNewsTask.setOwnColumn(newsTask.getOwncolumn());
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd hh:mm:ss");
			appNewsTask.setCreateTime(sdf.format(newsTask.getCreatetime()));
			appNewsTask.setPassAdvice(newsTask.getPassadvice());
			appNewsTask.setStatus(newsTask.getXuantistate().intValue());
			appNewsTask.setTitle(newsTask.getTasktitle());
			appNewsTask.setContent(newsTask.getTaskcontent());
			appNewsTask.setPlanpublish(newsTask.getPlanpublish());
			//该选题下任务各状态任务数
			Integer wzpMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(id,0);
			Integer jzxMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(id,2);
			Integer finishMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(id,3);
			Integer zzMissonNum = CommonServiceUtil.getTaskMissonListFinishSize(id,9);
			
			appNewsTask.setWzpMissonNum(wzpMissonNum);
			appNewsTask.setJzxMissonNum(jzxMissonNum);
			appNewsTask.setFinishMissonNum(finishMissonNum);
			appNewsTask.setZzMissonNum(zzMissonNum);
			appNewsTask.setMissonNum(missionList.size());
			appNewsTask.setResourceNum(0);
			appNewsTask.setXuanTiresourceJson(newsTask.getContentrtf2());
			return appNewsTask;
		}
	}

	/**
	 * 根据选题ID获取选题下面挂载的资源\任务\设备
	 * @param id 选题或选题群组ID
	 * @param type 要获取选题下面的内容类型（0：挂载的资源、1：任务、2：设备）,默认是0
	 * @return QueryXuantiByIdAndTypeResponse
	 * @throws Exception
	 */
	public QueryXuantiByIdAndTypeResponse getQueryXuantiByIdAndType(String id, String type) throws Exception{
		// 1、获取选题/报题详情
		NewsTaskWithBLOBs newsTask = newsTaskMapper.selectByPrimaryKey(id);
		// 2、 创建选题下面的内容类型的封装对象
		QueryXuantiByIdAndTypeResponse queryXuantiByIdAndTypeResponse = new QueryXuantiByIdAndTypeResponse();
		if (newsTask == null) {
			throw new Exception("找不到该选题!");
		}
		if (newsTask.getXuantistate() == null) {
			throw new Exception("选题参数有误!");
		}
		// 如果是保存状态下的选题，则挂载资源，返回的字段是resourceList
		if (newsTask.getXuantistate().intValue() == XUANTISTATES.SAVE.getXuanTiState()) {
			queryXuantiByIdAndTypeResponse.setResourceList(CommonServiceUtil.getResourceByNewsTaskId(id));
		} 
		//如果是非保存状态下的选题
		else {
			//获取选题下面的挂载资源xuanTiresourceList
			if("0".equals(type)){
				// 调用CRE接口获取选题目录下的资源
				String searchUrl = CommonServiceUtil.getServerSettingUrlByUtype(Constants.CRE_SEARCH_URL_TYPE);
				ItemListWarper itemListWarper = CREResourceClient.getCREFolderResourceList(searchUrl, "", Constants.DEFAULT_START, Constants.MAX_PAGE, null, null, id);
				List<Clue> xuanTiResource = CommonServiceUtil.getAppResourceList(itemListWarper.getItemList());
				queryXuantiByIdAndTypeResponse.setXuanTiresourceList(xuanTiResource);
			}
			// 获取该选题下的任务
			else if("1".equals(type)){
				List<TaskMissonWithBLOBs> taskMissonList = CommonServiceUtil.getTaskMissonList(id);
				List<Mission> missionList = CommonServiceUtil.getAppMissionList(taskMissonList);
				queryXuantiByIdAndTypeResponse.setTaskMissionList(missionList);
			}
		}
		return queryXuantiByIdAndTypeResponse;
	}
	
    /**
	 *  根据报题GUID 获取报题详情
	 * @param taskGuid
	 * @return
	 */
    public NewsTaskWithBLOBs getBaoTiNewsTaskByTaskGuid(String taskGuid) {
        NewsTaskWithBLOBs newsTask = newsTaskMapper.selectByPrimaryKey(taskGuid);
        return newsTask;
    }
    
    /**
     * 根据报题GUID 删除报题
     * @param taskGuid
     * @return
     */
    @Transactional
    public void deleteBaoTiByTaskId(String taskGuid) {
        TaskResourceQuery example = new TaskResourceQuery();
        Criteria createCriteria = example.createCriteria() ;
        createCriteria.andTaskguidEqualTo(taskGuid) ;
        taskResourceMapper.deleteByExample(example ) ;
        newsTaskMapper.deleteByPrimaryKey(taskGuid);
    }
	
			
	
	/**
	 * 封装栏目信息
	 * @param columnName
	 * @return
	 * @author luomeng
	 */
	public MetaData getMetaDate(String columnName,Integer xuantiState){
		MetaData metaData = new MetaData();
		metaData.setMetaDataCount(2);
		List<SAttribute> sAttributes = new ArrayList<>();
		// 栏目信息
		SAttribute sAttribute = new SAttribute();
		sAttribute.setEnumType("0");
		sAttribute.setStrName("栏目名称");
		sAttribute.setValue(columnName);
		sAttributes.add(sAttribute);
		// 状态信息
		SAttribute xuanTiStateSAttribute = new SAttribute();
		xuanTiStateSAttribute.setEnumType("5");
		xuanTiStateSAttribute.setStrName("选题状态");
		for (XUANTISTATES state : XUANTISTATES.values()) {
			if (state.getXuanTiState() == xuantiState) {
				xuanTiStateSAttribute.setValue(state.getStateContent());
				break;
			}
		}
		sAttributes.add(xuanTiStateSAttribute);
		metaData.setsAttributes(sAttributes);
		return metaData;
	}
	
	/**
	 * 封装选题目录参数
	 * @param folderId
	 * @param metaData
	 * @param folderName
	 * @param folderAlc
	 * @param parentId
	 * @param lift
	 * @param secret
	 * @return
	 */
	public ResourceFolder getResourceFolder(String folderId,MetaData metaData,String folderName,String folderAlc,String parentId,Integer lifeCycleDays,Integer secret){
		ResourceFolder resoruceFolder = new ResourceFolder();
		if (StringUtils.isEmpty(parentId)) {
			parentId = Constants.DEFAULT_FOLDER_ID;
		}
		resoruceFolder.setId(folderId);
		resoruceFolder.setName(folderName);
		resoruceFolder.setMetadataInfo(metaData.toString());
		resoruceFolder.setAclContent(folderAlc);
		resoruceFolder.setParentId(parentId);
		if (lifeCycleDays != null) {
			resoruceFolder.setLifeCycleDays(lifeCycleDays);
		}
		if (secret != null) {
			resoruceFolder.setKeepSecretDays(secret);
		}
		return resoruceFolder;
	} 
	
	/**
	 * 1、责编和总编具有最高权限Admin
	 * 2、负责人以及参与人具有编辑者权限AdvEditor
	 * @param creater
	 * @param chargeMan
	 * @param inPeople
	 * @param ownColumn
	 * @return
	 * @author luomeng
	 * @throws Exception 
	 */
	public String getFolderAlc(String creater,String chargeMan,String inPeople,String ownColumn) throws Exception{
		// 1、根据栏目名称获取栏目的责编
		List<UserRoleInfo> userRoleInfos = CommonServiceUtil.getUserRoleInfoByColumnName(ownColumn);
		// 2、获取总指挥
		List<UserRoleInfo> userZZH = CommonServiceUtil.getZongBian();
		List<UserRoleInfo> allAdmin = new ArrayList<>();
		if (StringUtils.listIsNotEmpty(userRoleInfos)) {
			allAdmin.addAll(userRoleInfos);
		}
		
		if (StringUtils.listIsNotEmpty(userZZH)) {
			allAdmin.addAll(userZZH);
		}
		
		
		List<String> adminUserIdList = new ArrayList<>();
		List<String> advEditorUserIdList = new ArrayList<>();
		for (UserRoleInfo userRoleInfo : allAdmin) {
			adminUserIdList.add(userRoleInfo.getUserguid());
		}
		// 3、判断负责是是否是总指挥或者责编
		if (StringUtils.isNotEmpty(chargeMan)){
			String userId = CommonServiceUtil.getUserIDbyUserName(chargeMan);
			boolean isZhongZHIHUI = CommonServiceUtil.checkIsZongZhiHui(userId);
			boolean isColumnZongBian = CommonServiceUtil.checkIsColumnZongBian(userId);
			if (isZhongZHIHUI || isColumnZongBian) {
				adminUserIdList.add(userId);
			} else {
				advEditorUserIdList.add(userId);
			}
		}
		
		// 4、判断参与人是否是总指挥或者责编
		if (StringUtils.isNotEmpty(inPeople)) {
			String [] people = inPeople.split(",");
			for (String p : people) {
				String userId = CommonServiceUtil.getUserIDbyUserName(p);
				boolean isZhongZHIHUI = CommonServiceUtil.checkIsZongZhiHui(userId);
				boolean isColumnZongBian = CommonServiceUtil.checkIsColumnZongBian(userId);
				if (isZhongZHIHUI || isColumnZongBian) {
					adminUserIdList.add(userId);
				} else {
					advEditorUserIdList.add(userId);
				}
			}
		}
		
		String folderAlc="";
		for (String adminUserId : adminUserIdList) {
			if (StringUtils.isEmpty(folderAlc)) {
				folderAlc = adminUserId+","+Constants.CRE_FOLDER_TYPE_USER+","+Constants.CRE_FOLDER_ADMIN;
			} else {
				folderAlc = folderAlc+";"+adminUserId+","+Constants.CRE_FOLDER_TYPE_USER+","+Constants.CRE_FOLDER_ADMIN;
			}
		}
		
		for (String advEditorUserId : advEditorUserIdList) {
			if (StringUtils.isEmpty(folderAlc)) {
				folderAlc = advEditorUserId+","+Constants.CRE_FOLDER_TYPE_USER+","+Constants.CRE_FOLDER_ADVEDITOR;
			} else {
				folderAlc = folderAlc+";"+advEditorUserId+","+Constants.CRE_FOLDER_TYPE_USER+","+Constants.CRE_FOLDER_ADVEDITOR;
			}
		}
		return folderAlc;
	}

	

	
	
	/**
	 * 更新选题群组
	 * @param newsTaskWithBLOBs
	 * @author luomeng
	 * @throws Exception 
	 */
	public CommonResponse updateNewsTaskGroup(NewsTaskWithBLOBs newsTaskWithBLOBs) throws Exception {
		// guid
		String taskGuid = newsTaskWithBLOBs.getTaskguid();
		// 负责人
		String chargeMan = newsTaskWithBLOBs.getChargeman();
		// 参与人
		String inPeople = newsTaskWithBLOBs.getInpeople();
		// 选题状态
		BigDecimal state = newsTaskWithBLOBs.getXuantistate();
		// 选题标题
		String title = newsTaskWithBLOBs.getTasktitle();
		// 如果负责人、选题人、选题状态都没有发生变化，则不需要调用CRE接口更新选题群组
		if (StringUtils.isEmpty(chargeMan) && 
			StringUtils.isEmpty(inPeople) && 
			state==null && StringUtils.isEmpty(title)) {
			newsTaskMapper.updateByPrimaryKeySelective(newsTaskWithBLOBs);
			return CommonServiceUtil.getCommonResponseSuccess("");
		} else {
			// 需要调用接口更新选题目录
			NewsTaskWithBLOBs newsTask = newsTaskMapper.selectByPrimaryKey(taskGuid);
			Integer oldState = newsTask.getXuantistate().intValue();
			if (StringUtils.isEmpty(chargeMan)) {
				chargeMan = newsTask.getChargeman();
			} else {
				if (oldState == XUANTISTATES.UNASSIGNED.getXuanTiState()) {
					state = new BigDecimal(XUANTISTATES.ONGOING.getXuanTiState());
					newsTaskWithBLOBs.setXuantistate(state);
				}
			}
			if (StringUtils.isEmpty(inPeople)) {
				inPeople = newsTask.getInpeople();
			}
			if (StringUtils.isEmpty(title)) {
				title = newsTask.getTasktitle();
			}
			if (state == null) {
				state = newsTask.getXuantistate();
			}
			// 更新选题
			newsTaskMapper.updateByPrimaryKeySelective(newsTaskWithBLOBs);
			// 如果状态变了，且是未指派或者终止状态，则将任务的状态进行修改
			if (state.intValue() == XUANTISTATES.FINISH.getXuanTiState()||
					state.intValue() == XUANTISTATES.STOP.getXuanTiState()) {
				// 将进行中或未领用的任务更新为终止
				CommonServiceUtil.updateUnusedAndPROCESSINGMission(taskGuid,TASKMISSIONSTATUS.TERMINATE.getMissionStatus());
			}
			String column = newsTask.getOwncolumn();
			String creater = newsTask.getCreater();
			MetaData metaData = getMetaDate(column,state.intValue());
			//String currentTimeStamp = StringUtils.getCurrentTimeStamp();
			// 选题目录名称
			//String folderName = currentTimeStamp+"_"+title+"_"+column;
			String folderName =title+"_"+column;
			// 选题目录权限
			String folderAlc = getFolderAlc(creater, chargeMan, inPeople, column);
			// 选题目录的父目录ID
			String parentId = Constants.DEFAULT_FOLDER_ID;
			// 这块有问题，如果是进行中，则选题目录无法创建
			// 从开关参数配置表中获取选题目录生命周期以及私密周期
			Integer life = CommonServiceUtil.getSwitchSettingValueByType(Constants.SWICHSERVICE_LIFE);
			Integer secret = CommonServiceUtil.getSwitchSettingValueByType(Constants.SWICHSERVICE_SECRET);
			ResourceFolder resourceFolder = getResourceFolder(taskGuid, metaData, folderName, folderAlc, parentId, life, secret);
			// 获取更新选题目录的服务地址
			String serverUrl = CommonServiceUtil.getServerSettingUrlByUtype(Constants.CRE_FOLDER_UPDATE_TYPE);
			FolderCondition folderCondition = new FolderCondition();
			List<ResourceFolder> resourceFolders = new ArrayList<>();
			resourceFolders.add(resourceFolder);
			folderCondition.setResourceFolderList(resourceFolders);
			UpdateFolderResponse updateFolderResponse = CREFolderClient.updateFolder(serverUrl, folderCondition);
			if (updateFolderResponse == null) {
				return CommonServiceUtil.getCommonResponseFailure("更新选题目录失败!");
			} else {
				AddResourceFolderResponse addResourceFolderResponse = updateFolderResponse.getUpdateResourceFolderListResponse().get(0);
				return CommonServiceUtil.getCommonResponse(addResourceFolderResponse.isSuccess(), addResourceFolderResponse.getDescription());
			}
		}
	}
	
	
	 /**
	 *  获取当前用户所属选题对象列表
	 * @param userId
	 * @return
	 * @throws Exception 
	 */
	public List<NewsTaskWithBLOBs> getXuanTiOfCurrentUser(String userId) throws Exception{
		// 判断是否是栏目责编或者总指挥
		boolean isHaveXuanTi = CommonServiceUtil.isZeBianOrZongBian(userId);
	    List<NewsTaskWithBLOBs> aNewsTaskList = null ;
	    String userName = CommonServiceUtil.getUserNameByUserId(userId);
	    TaskSearchPara  taskSearchPara = new TaskSearchPara();
	    taskSearchPara.setChargetMan(userName);	
	    taskSearchPara.setInPeople("%"+userName+"%");
	    
	    if (isHaveXuanTi) {
			// 查询范围：当前登录用户所属栏目下进行中、完成、终止的选题   \ 我所负责或参与的非保存状态下的选题
			// 根据用户ID获取所有栏目信息
			List<BanmianInfo> banmianInfos = CommonServiceUtil.getBanmianInfoListByUserGuid(userId);
			//所属栏目
			List<String> columnList = columnNameList(banmianInfos,false);
			taskSearchPara.setCreater(userName);
			if (StringUtils.listIsNotEmpty(columnList)) {
				taskSearchPara.setColumnList(columnList);
			}
		}
	    
	    aNewsTaskList = newsTaskMapper.getXuanTiForTaskMission(taskSearchPara) ;
	    return aNewsTaskList  ;
	}

	

	/**
	 * 根据选题ID删除选题
	 * @param id
	 * @author luomeng
	 * @throws Exception 
	 */
	public void deleteXuantiById(String id,Integer isDeleteMission) throws Exception {
		if (StringUtils.isEmpty(id)) {
			throw new Exception("请求参数有误!");
		}
		NewsTaskWithBLOBs newsTask = newsTaskMapper.selectByPrimaryKey(id);
		if (newsTask == null) {
			throw new Exception("该资源不存在!");
		}
		if (newsTask.getXuantistate() == null) {
			throw new Exception("该资源参数有误!");
		} 
		if (newsTask.getXuantistate().intValue() == XUANTISTATES.SAVE.getXuanTiState()) {
			deleteBaoTiByTaskId(id);
		} else {
			deleteXuantiGroup(id,isDeleteMission);
		}
	}
	
	/**
	 * 删除选题群组
	 * @param id
	 * @throws Exception
	 */
	@Transactional
	public void deleteXuantiGroup(String id,Integer isDeleteMission) throws Exception{
		// 1、获取删除CRE选题目录接口地址
		String deleteUrl = CommonServiceUtil.getServerSettingUrlByUtype(Constants.CRE_FOLDER_DELETE);
		// 2、调用CRE接口，删除选题目录
		DeleteCREFolderResponse deleteCREFolderResponse = CREFolderClient.deleteFolderByIds(deleteUrl, id);
		if (deleteCREFolderResponse==null || 
				!StringUtils.listIsNotEmpty(deleteCREFolderResponse.getDeleteResourceFolderListResponse())) {
			throw new Exception("CRE删除选题目录失败!");
		}
		AddResourceFolderResponse resourceResponse = deleteCREFolderResponse.getDeleteResourceFolderListResponse().get(0);
		
		if (!resourceResponse.isSuccess()){
			throw new Exception(resourceResponse.getDescription());
		}
		// 3、删除任务
		deleteTaskMissionByTaskGuid(id,isDeleteMission);
		// 4、删除本地接口，删除本地库中选题
		newsTaskMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 根据选题ID删除该选题下的任务
	 * @param taskGuid
	 * @author luomeng
	 */
	public void deleteTaskMissionByTaskGuid(String taskGuid,Integer isDeleteMission){
		TaskMissonQuery example = new TaskMissonQuery();
		com.dayang.newmedia.newscommand.db.model.TaskMissonQuery.Criteria criteria = example.createCriteria();
		criteria.andTaskguidEqualTo(taskGuid);
		if (isDeleteMission == ISDELETEFINISHEDMISSION.NOTDELETE.getIsDelete()) {
			criteria.andMstateNotEqualTo(TASKMISSIONSTATUS.COMPLETED.getMissionStatus());
		}
		taskMissonMapper.deleteByExample(example);
	}
	
	/**
	 * 更新报题的状态
	 * @param taskId
	 * @param xuantiColumns
	 */
	public void updateBaoTiStatus(String taskId,String xuantiColumns){
		log.debug("----------begin updateBaoTiStatus-----");
		// 1、根据报题ID获取报题详情
		NewsTaskWithBLOBs newsTask = newsTaskMapper.selectByPrimaryKey(taskId);
		if (newsTask != null) {
			String ownColumn = newsTask.getOwncolumn();
			String userColumn = newsTask.getUsecolumn();
			String updateOwnColumn = StringUtils.combineContent(ownColumn, xuantiColumns);
			String updateUserColumn = StringUtils.deleteSameContent(ownColumn, xuantiColumns);
			newsTask.setOwncolumn(updateOwnColumn);
			newsTask.setUsecolumn(updateUserColumn);
			log.debug("----------old ownColumn:"+ownColumn+"-----");
			log.debug("----------old userColumn:"+userColumn+"-----");
			log.debug("----------new ownColumn:"+updateOwnColumn+"-----");
			log.debug("----------new userColumn:"+updateUserColumn+"-----");
			newsTaskMapper.updateByPrimaryKeySelective(newsTask);
		}
	}
	
	/**
	 * 获取数据库当前时间
	 * @return
	 */
	public Date getDBDate(){
		return dbMetaDataMapper.getCurrentTime();
	}
	
	/**
	 * 根据资源ID删除选取目录下的资源
	 * @param  id
	 * @throws Exception 
	 * @author luomeng
	 */
	public void deleteXuantiGroupResource(String id) throws Exception {
		// 1、获取删除CRE选题目录接口地址
		String deleteUrl = CommonServiceUtil.getServerSettingUrlByUtype(Constants.CRE_FOLDER_DELETE);
		// 2、调用CRE接口，删除选题目录
		DeleteCREFolderResponse deleteCREFolderResponse = CREFolderClient.deleteFolderByIds(deleteUrl, id);
		if (deleteCREFolderResponse==null || 
				!StringUtils.listIsNotEmpty(deleteCREFolderResponse.getDeleteResourceFolderListResponse())) {
			throw new Exception("CRE删除选题目录失败!");
		}
		AddResourceFolderResponse resourceResponse = deleteCREFolderResponse.getDeleteResourceFolderListResponse().get(0);
		
		if (!resourceResponse.isSuccess()){
			throw new Exception(resourceResponse.getDescription());
		}
	}

	/**
	 * 判断选题是否重复
	 * @param xuantiTitle
	 * @param ownColumn
	 */
	public List<NewsTaskWithBLOBs> getRepeatedXuanTiNewsTasks(String xuantiTitle, String ownColumn) {
		TaskSearchPara taskSearchPara = new TaskSearchPara();
		List<String> columnList = new ArrayList<>();
		if (StringUtils.isNotEmpty(ownColumn)) {
			columnList = StringUtils.stringToList(ownColumn, ",");
		}
		taskSearchPara.setSearchContent(xuantiTitle);
		taskSearchPara.setColumnList(columnList);
		return newsTaskMapper.getRepeatedXuanTiNewsTasks(taskSearchPara);
	}

}
