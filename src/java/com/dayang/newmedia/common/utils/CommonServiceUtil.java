package com.dayang.newmedia.common.utils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import com.dayang.newmedia.newscommand.db.model.BanmianInfo;
import com.dayang.newmedia.newscommand.db.model.ItemInfo;
import com.dayang.newmedia.newscommand.db.model.NewsTaskWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.RoleInfo;
import com.dayang.newmedia.newscommand.db.model.TaskMissonWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.TaskResource;
import com.dayang.newmedia.newscommand.db.model.UserBanmianInfo;
import com.dayang.newmedia.newscommand.db.model.UserRoleInfo;
import com.dayang.newmedia.newscommand.db.model.enums.APPANDCREFILETYPE;
import com.dayang.newmedia.newscommand.db.model.enums.FILESTATE;
import com.dayang.newmedia.newscommand.db.model.enums.NEWSTASKSTATES;
import com.dayang.newmedia.newscommand.service.BanmianInfoService;
import com.dayang.newmedia.newscommand.service.CustomSettingService;
import com.dayang.newmedia.newscommand.service.ItemInfoService;
import com.dayang.newmedia.newscommand.service.NewsTaskService;
import com.dayang.newmedia.newscommand.service.RoleInfoService;
import com.dayang.newmedia.newscommand.service.ServerSettingsService;
import com.dayang.newmedia.newscommand.service.SwichSettingsService;
import com.dayang.newmedia.newscommand.service.TaskMissionService;
import com.dayang.newmedia.newscommand.service.TaskResourceService;
import com.dayang.newmedia.newscommand.service.UserBanmianInfoService;
import com.dayang.newmedia.newscommand.service.UserExtraInfoService;
import com.dayang.newmedia.newscommand.service.UserRoleInfoService;
import com.dayang.newmedia.newscommand.ws.client.creclient.CRELoginClient;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.Files;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ItemList;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.LoginModel;
import com.dayang.newmedia.newscommand.ws.commandapp.model.AttachFile;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Clue;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Mission;
import com.dayang.newmedia.newscommand.ws.commandapp.model.NewsTask;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Resource;
import com.sun.jersey.spi.container.ContainerRequest;

/**
 * 封装一些公用的方法
 * @author luomeng
 *
 */
public class CommonServiceUtil {
	
	public static Logger log = Logger.getLogger(CommonServiceUtil.class); 
	
	public static ServerSettingsService serverSettingsService = (ServerSettingsService) SpringContextUtil.getBean("serverSettingsService");
	public static ItemInfoService itemInfoService = (ItemInfoService) SpringContextUtil.getBean("itemInfoService");
	public static BanmianInfoService banmianInfoService = (BanmianInfoService) SpringContextUtil.getBean("banmianInfoService");
	public static UserBanmianInfoService userBanmianInfoService = (UserBanmianInfoService) SpringContextUtil.getBean("userBanmianInfoService");
	public static UserExtraInfoService userExtraInfoService = (UserExtraInfoService) SpringContextUtil.getBean("userExtraInfoService");
	public static TaskMissionService taskMissionService = (TaskMissionService) SpringContextUtil.getBean("taskMissionService");
	public static SwichSettingsService swichSettingsService = (SwichSettingsService) SpringContextUtil.getBean("swichSettingsService");
	public static RoleInfoService roleInfoService = (RoleInfoService) SpringContextUtil.getBean("roleInfoService");
	public static UserRoleInfoService userRoleInfoService = (UserRoleInfoService) SpringContextUtil.getBean("userRoleInfoService");
	public static TaskResourceService taskResourceService = (TaskResourceService) SpringContextUtil.getBean("taskResourceService");
	public static CustomSettingService customSettingService = (CustomSettingService) SpringContextUtil.getBean("customSettingService");
	public static NewsTaskService newsTaskService = (NewsTaskService) SpringContextUtil.getBean("newsTaskService");
	/**
	 * 根据uType从服务地址表中获取相应的服务地址
	 * @param uType
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static String getServerSettingUrlByUtype(Integer uType) throws Exception{
		if (uType==null) {
			throw new Exception("请求参数为空");
		}
		return serverSettingsService.getServerSettingsByUtype(uType).getUpath();
	}
	
	/**
	 * 根据用户id，获取用户的权限信息
	 * @param userGuid
	 * @return
	 * @author luomeng
	 */
	public static List<ItemInfo> getItemInfoListsByUserGuid(String userGuid){
		return itemInfoService.selectItemInfosByUserGuid(userGuid);
	}
	
	/**
	 * 根据用户ID判断是否是栏目责编或者栏目总编
	 * @param userId
	 * @return
	 */
	public static boolean isZeBianOrZongBian(String userId){
		List<ItemInfo> itemInfoList = getItemInfoListsByUserGuid(userId);
		if (StringUtils.listIsNotEmpty(itemInfoList)) {
			for (ItemInfo itemInfo : itemInfoList) {
				if (Constants.HAVEAUDITXUANTI.equals(itemInfo.getItemtarget())) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 根据用户id,获取用户栏目信息
	 * @param userGuid
	 * @return
	 * @author luomeng
	 */
	public static List<BanmianInfo> getBanmianInfoListByUserGuid(String userGuid) {
		return banmianInfoService.getColumnInfoByUserGuid(userGuid);
	}
	
	
	/**
	 * 获取全部栏目名称
	 * @return
	 */
	public static List<String> getColumnNameList(){
		List<BanmianInfo> banmianInfos= banmianInfoService.getColumnInfo();
		List<String> columnNameList = new ArrayList<>();
        for (BanmianInfo banmianInfo : banmianInfos) {
            columnNameList.add(banmianInfo.getBname());
        }
        return columnNameList;
	}
	
	/**
	 * 默认成功响应
	 * @param msg
	 * @return
	 * @author luomeng
	 */
	public static CommonResponse getCommonResponseSuccess(String msg){
		return  getCommonResponse(true,msg);
	}
	
	/**
	 * 默认失败响应
	 * @param msg
	 * @return
	 * @author luomeng
	 */
	public static CommonResponse getCommonResponseFailure(String msg){
		return getCommonResponse(false,msg);
	}
	
	/**
	 * 响应
	 * @param success
	 * @param msg
	 * @return
	 * @author luomeng
	 */
	public static CommonResponse getCommonResponse(boolean success,String msg){
		CommonResponse commonResponse = new CommonResponse();
		commonResponse.setSuccess(success);
		commonResponse.setErrorDesc(msg);
		return commonResponse;
	}
	
	/**
	 * 获取操作人ID
	 * @param securityContext
	 * @return
	 */
	public static String getOperaterId(SecurityContext securityContext){
		ContainerRequest request = (ContainerRequest) securityContext;
		String operaterId = request.getHeaderValue("operaterId");
		return operaterId;
	}
	
	/**
	 * 获取用户Token
	 * @param userId
	 * @param password
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static String getUserToken(String userId,String password) throws Exception{
		String loginUrl = getServerSettingUrlByUtype(Constants.CRE_LOGIN);
		if (StringUtils.isEmpty(userId)) {
			userId = Constants.DEFAULT_CRE_USERID;
		}
		if (StringUtils.isEmpty(password)) {
			password = Constants.DEFAULT_CRE_PASSWORD;
		}
		LoginModel loginModel = CRELoginClient.loginClient(loginUrl, userId, password, Constants.CRE_FROM);
		if (loginModel == null) {
			throw new Exception("获取用户Token失败!");
		}
		return loginModel.getToken();
	}
	
	/**
	 * 封装公共方法-根据用户名获取用户ID
	 * @param userName
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static String getUserIDbyUserName(String userName) throws Exception{
		if (StringUtils.isEmpty(userName)) {
			throw new Exception("用户名不能为空!");
		}
		return userBanmianInfoService.getUserIdByUserName(userName,true);
	}
	
	/**
	 * 封装公共方法-根据用户名获取用户ID,如果找不到，不抛异常
	 * @param userName
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static String getUserIDbyUserNameNoException(String userName) throws Exception{
		if (StringUtils.isEmpty(userName)) {
			return "";
		}
		return userBanmianInfoService.getUserIdByUserName(userName,false);
	}
	
	/**
	 * 根据用户ID获取该用户所在栏目下所有用户
	 * @param userId
	 * @return
	 * @author luomeng
	 */
	public static List<UserBanmianInfo> getUserBanmianInfoListByUserId(String userId){
		List<BanmianInfo> columnInfoList = getBanmianInfoListByUserGuid(userId);
		if (!StringUtils.listIsNotEmpty(columnInfoList)) {
			return null;
		}
		return userBanmianInfoService.getAllUserByColumns(columnInfoList);
	} 
	
	/**
	 * 所在栏目下所有用户
	 * @param userId
	 * @return
	 * @author huyulong
	 */
	public static List<UserBanmianInfo> getUserBanmianInfoList(){
		List<BanmianInfo> columnInfoList = banmianInfoService.getColumnInfo();
		if (!StringUtils.listIsNotEmpty(columnInfoList)) {
			return null;
		}
		return userBanmianInfoService.getAllUserByColumns(columnInfoList);
	} 
	
	/**
	 * 根据用户ID获取用户详情
	 * @param userId
	 * @return
	 * @throws Exception 
	 * @author luomeng
	 */
	public static String getUserNameByUserId(String userId) throws Exception{
		if (StringUtils.isEmpty(userId)) {
			throw new Exception("用户ID不能为空!");
		}
		String userName = userBanmianInfoService.getUserNameByUserId(userId);
		return userName;
	}
	
	/**
	 * 根据用户姓名获取用户头像地址
	 * @param userName
	 * @return
	 * @throws Exception 
	 * @author luomeng
	 */
	public static String getUserIconUrlByUserName(String userName) throws Exception{
		String userId = getUserIDbyUserNameNoException(userName);
		if (StringUtils.isEmpty(userId)) {
			log.error("------------用户名为【"+userName+"】的用户，数据库中查不到！");
			return "";
		}
		String iconUrl = userExtraInfoService.getUserIconByUserId(userId);
		return iconUrl;
	}
	
	/**
	 * 根据选题/派题ID获取该选题/派题下的任务
	 * @param taskGuid
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public static List<TaskMissonWithBLOBs> getTaskMissonList(String taskGuid) throws Exception{
		if (StringUtils.isEmpty(taskGuid)) {
			throw new Exception("请求参数有误!");
		}
		return taskMissionService.getTaskMissonList(taskGuid);
	}
	
	public static Integer getTaskMissonListFinishSize(String taskGuid,Integer mstate) throws Exception{
		if (StringUtils.isEmpty(taskGuid)) {
			throw new Exception("请求参数有误!");
		}
		return taskMissionService.getTaskMissonListFinishSize(taskGuid,mstate);
	}
	
	 /**
     * 根据类型从开关参数设置表中获取相关参数值
     * @param switchType
     * @return
     * @author luomeng
     */
    public static Integer getSwitchSettingValueByType(Integer switchType){
		return swichSettingsService.getSwitchSettingValueByType(switchType);
    }
    
    /**
     * 根据栏目名称获取该栏目下的责编
     * @param columnName
     * @return
     * @throws Exception 
     * @author luomeng
     */
    public static List<UserRoleInfo> getUserRoleInfoByColumnName(String columnName) throws Exception{
    	// 获取栏目总编角色信息
    	RoleInfo roleInfo = roleInfoService.getRoleInfoByRoleName(Constants.COLUMNZONGBIAN);
    	
    	// 根据栏目名称获取该栏目下所有的用户
    	List<UserBanmianInfo> userBanmianInfos = userBanmianInfoService.getAllUserByColumnName(columnName);
    	if (!StringUtils.listIsNotEmpty(userBanmianInfos)) {
    		return null;
    	}
    	List<String> userIdList = new ArrayList<>();
    	for (UserBanmianInfo userBanmianInfo : userBanmianInfos) {
    		userIdList.add(userBanmianInfo.getUserguid());
		}
    	
    	return userRoleInfoService.getZeBianRoleInfo(roleInfo.getRoleguid(), userIdList);
    }
    
    /**
     * 获取栏目总编
     * @return
     * @throws Exception 
     * @author luomeng
     */
    public static List<UserRoleInfo> getZongBian() throws Exception{
    	// 获取总编角色信息
    	RoleInfo roleInfo = roleInfoService.getRoleInfoByRoleName(Constants.ZONGZHIHUI);
    	return userRoleInfoService.getZeBianRoleInfo(roleInfo.getRoleguid(), null);
    }
    
    /**
     * 根据用户ID获取用户角色信息
     * @param userId
     * @return
     * @author luomeng
     */
    public static List<RoleInfo> getRoleInfoByUserId(String userId){
    	List<UserRoleInfo> roleInfos = userRoleInfoService.getUserRoleInfoByUserId(userId);
    	if (StringUtils.listIsNotEmpty(roleInfos)) {
    		List<String> roleIds = new ArrayList<>();
    		for (UserRoleInfo userRoleInfo : roleInfos) {
    			roleIds.add(userRoleInfo.getRoleguid());
			}
    		return roleInfoService.getRoleInfosByRoleGuids(roleIds);
    	}
		return null;
    }
    
    /**
     * 判断用户是否是总指挥
     * @param userId
     * @return
     * @author luomeng
     */
    public static boolean checkIsZongZhiHui(String userId){
    	List<RoleInfo> roleInfos = getRoleInfoByUserId(userId);
    	if (StringUtils.listIsNotEmpty(roleInfos)) {
    		for (RoleInfo roleInfo : roleInfos) {
				if (roleInfo.getRolename().equals(Constants.ZONGZHIHUI)) {
					return true;
				}
			}
    	}
		return false;
    }
    
    /**
     * 判断用户是否是栏目总监
     * @param userId
     * @return
     * @author luomeng
     */
    public static boolean checkIsColumnZongBian(String userId){
    	List<RoleInfo> roleInfos = getRoleInfoByUserId(userId);
    	if (StringUtils.listIsNotEmpty(roleInfos)) {
    		for (RoleInfo roleInfo : roleInfos) {
				if (roleInfo.getRolename().equals(Constants.COLUMNZONGBIAN)) {
					return true;
				}
			}
    	}
		return false;
    }
	
    /**
     * 根据选题Id获取其下面挂载的资源（保存状态下）
     * @param taskGuid
     * @return
     */
    public static List<Resource> getResourceByNewsTaskId(String taskGuid) {
    	return taskResourceService.getResourceByNewsTaskId(taskGuid);
    }
    
    /**
     * 根据选题ID更新未领用或未完成的任务状态
     * @param taskGuid
     * @param missionTask
     * @author luomeng
     */
    public static void updateUnusedAndPROCESSINGMission(String taskGuid,Integer missionTaskState){
    	taskMissionService.updateUnusedAndPROCESSINGMission(taskGuid,missionTaskState);
    }
    
	//========================================对象将的转换=============================//
	
	/**
	 * 将选题/报题转化成APP所需要的选题/报题结果
	 * @param newsTask
	 * @return
	 * @throws Exception
	 */
	public static NewsTask getAppNewsTaskByNewsTaskWithBLOBS(NewsTaskWithBLOBs newsTask) throws Exception{
		NewsTask appNewsTask = new NewsTask();
		appNewsTask.setTaskGuid(newsTask.getTaskguid());
		//标题
		String tasktitle = newsTask.getTasktitle();
		if(StringUtils.isNotEmpty(tasktitle)){
			tasktitle = StringUtils.replaceBlank(tasktitle);
			tasktitle = StringUtils.subString(tasktitle, 18, "...");
		}
		appNewsTask.setTitle(tasktitle);
		//内容
		String taskcontent = newsTask.getTaskcontent();
    	if(StringUtils.isNotEmpty(taskcontent)){
    		taskcontent = StringUtils.replaceBlank(taskcontent);
    		taskcontent = StringUtils.subString(taskcontent, 360, "...");
		}
		appNewsTask.setContent(taskcontent);
		// 创建人
		String creater = newsTask.getCreater();
		appNewsTask.setCreater(creater);
		appNewsTask.setOwnColumn(newsTask.getOwncolumn());
		appNewsTask.setChargeMan(newsTask.getChargeman());
		appNewsTask.setInPeople(newsTask.getInpeople());
		appNewsTask.setPassAdvice(newsTask.getPassadvice());
		// 数据库当前时间
		Date dbCurrentTime = newsTaskService.getDBDate();
		// 创建时间
		Date createDate = newsTask.getCreatetime();
		SimpleDateFormat simple = new SimpleDateFormat("MM-dd HH:mm");
		String createTime = "";
		if (createDate != null) {
			createTime = simple.format(createDate);
		}
		appNewsTask.setCreateTime(createTime);
		Date modifyDate = newsTask.getModifytime();
		// 修改时间
		String modifyTime = "";
		if (modifyTime != null) {
			 modifyTime = TimeAgo.newsCommandToDay(modifyDate,dbCurrentTime);
		}
		appNewsTask.setModifyTime(modifyTime);
		// 头像
		String resourceIcon = CommonServiceUtil.getUserIconUrlByUserName(creater);
		appNewsTask.setResourceIcon(resourceIcon);
		appNewsTask.setTaskStatus(newsTask.getTaskstate());
		appNewsTask.setStatus(newsTask.getXuantistate().intValue());
		
		//地点信息
		appNewsTask.setTaskPlace(newsTask.getTaskplace());
		//是否包含资源
    	if(StringUtils.isNotBlank(newsTask.getCaifangremark())){
    		String [] ziyuanArr= newsTask.getCaifangremark().split(","); 
    		appNewsTask.setZiyuan01(Integer.parseInt(ziyuanArr[0]));
    		appNewsTask.setZiyuan02(Integer.parseInt(ziyuanArr[1]));
    		appNewsTask.setZiyuan03(Integer.parseInt(ziyuanArr[2]));
    		appNewsTask.setZiyuan04(Integer.parseInt(ziyuanArr[3]));
    		appNewsTask.setZiyuan05(Integer.parseInt(ziyuanArr[4]));
    	}else{
    		appNewsTask.setZiyuan01(0);
    		appNewsTask.setZiyuan02(0);
    		appNewsTask.setZiyuan03(0);
    		appNewsTask.setZiyuan04(0);
    		appNewsTask.setZiyuan05(0);
    	}
    	
		return appNewsTask;
	}
	
	/**
	 * 将选题目录资源转化成APP所需要的挂在资源
	 * @param itemLists
	 * @return
	 * @throws ParseException
	 */
	public static List<Clue> getAppResourceList(List<ItemList> itemLists) throws ParseException{
		List<Clue> clueList = new ArrayList<>();
		if (StringUtils.listIsNotEmpty(itemLists)) {
			for (ItemList itemList : itemLists) {
				Clue clue = getAppResource(itemList);
				clueList.add(clue);
			}
		}
		return clueList;
	}
	
	/**
	 * 将选题目录资源转化成APP所需要的挂在资源
	 * @param itemList
	 * @return
	 * @throws ParseException 
	 */
	public static Clue getAppResource (ItemList itemList) throws ParseException{
		Clue resource = new Clue();
		resource.setResourceId(itemList.getId());
		String resourceTitle = itemList.getName();
		if (StringUtils.isNotEmpty(resourceTitle)) {
			resourceTitle = StringUtils.replaceBlank(resourceTitle);
			resourceTitle = StringUtils.subString(resourceTitle, 12, "...");
		}
		resource.setTitle(resourceTitle);
		
		resource.setAuthor(itemList.getOwner());
		if (StringUtils.isEmpty(itemList.getContent())) {
			resource.setContent(itemList.getName());
		}
		// 将日期处理
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String createdTime = itemList.getCreated();
		if (StringUtils.isNotEmpty(createdTime)) {
			date = simple.parse(createdTime);
		}
		// 数据库当前时间
		Date dbCurrentDate = newsTaskService.getDBDate();
		String created = TimeAgo.newsCommandToDay(date, dbCurrentDate);
		resource.setCreatedTime(created);
		resource.setResourceIcon(itemList.getIconUrl());
		resource.setResourceOriginTypeName(itemList.getSource());
		
		// 处理附件信息
		if (StringUtils.listIsNotEmpty(itemList.getFiles())) {
			List<AttachFile> attachFiles = getAttachFilesByCreAttachFileList(itemList.getFiles(),resource);
			resource.setAttachFiles(attachFiles);
		}
		int hasFile = itemList.getHasFile();
		int fileStatus = itemList.getFileStatus();
		int fileState = getFileStateByCREHasFileAndFileStatus(hasFile,fileStatus);
		// 资源附件状态
		resource.setFileState(fileState);
		return resource;
	}
	
	public static int getFileStateByCREHasFileAndFileStatus(int hasFile,int fileStatus){
		if (hasFile == 0 ) {
			return FILESTATE.COMPLETED.getFileState();
		} else {
			if (fileStatus ==0) {
				return FILESTATE.PROCESSING.getFileState();
			} else {
				return FILESTATE.COMPLETED.getFileState();
			}
		}
	}
	
	/**
	 * 根据CRE附件获取APP附件
	 * @param fileList
	 * @param clue
	 * @return
	 */
	public static List<AttachFile> getAttachFilesByCreAttachFileList(List<Files> fileList, Clue clue) {
		List<AttachFile> attachFileList = new ArrayList<AttachFile>();
		String headerIcon = null;
		for (Files file : fileList) {
			if (file.getFileType() == APPANDCREFILETYPE.HEADICON.getCREType()) {
				String filePath = file.getStreamMediaPath();
				String fileName = file.getFileName();
				headerIcon = StringUtils.combineUrl(filePath, fileName);
			} else {
				AttachFile attachFile = getAttachFileByCreAttachFile(file);
				attachFileList.add(attachFile);
			}
		}
		if (StringUtils.isNotEmpty(headerIcon)) {
			clue.setResourceIcon(headerIcon);
		}
		return attachFileList;
	}
	
	/**
	 * 根据CRE附件获取APP附件
	 * @param file
	 * @return
	 * @author luomeng
	 */
	public static AttachFile getAttachFileByCreAttachFile(Files file){
		String streamPath = file.getStreamMediaPath();
		String fileName = file.getFileName();
		String fullFilePath = StringUtils.combineUrl(streamPath, fileName);
		AttachFile attachFile = new AttachFile();
		attachFile.setFilePath(fullFilePath);
		for (APPANDCREFILETYPE aPPAndCreType : APPANDCREFILETYPE.values()) {
			if (file.getFileType() != 10) {
				if (aPPAndCreType.getCREType() == file.getFileType()) {
					attachFile.setFileType(aPPAndCreType.getAPPType());
				}
			}
		}
		return attachFile;
	}
	
	/**
	 * 将任务保存为APP所需要的任务格式
	 * @param taskMissonWithBLOBs
	 * @return
	 * @author luomeng
	 */
	public static List<Mission> getAppMissionList(List<TaskMissonWithBLOBs> taskMissonWithBLOBs){
		List<Mission> missionList = new ArrayList<>();
		if (StringUtils.listIsNotEmpty(taskMissonWithBLOBs)) {
			for (TaskMissonWithBLOBs taskMisson : taskMissonWithBLOBs) {
				Mission mission = getAppMission(taskMisson);
				missionList.add(mission);
			}
		}
		return missionList;
	}
	
	/**
	 * 将任务保存为APP所需要的任务格式
	 * @param taskMission
	 * @return
	 * @author luomeng
	 */
	public static Mission getAppMission(TaskMissonWithBLOBs taskMission){
		Mission mission = new Mission();
		String guid = taskMission.getMguid();
		if (StringUtils.isNotEmpty(guid)) {
			mission.setMissionGuid(guid);
		}
		String mevents = taskMission.getMevents();
		if (StringUtils.isNotEmpty(mevents)) {
			mevents = StringUtils.replaceBlank(mevents);
			mevents = StringUtils.subString(mevents, 10, "...");
		}
		mission.setMissionContent(mevents);
		String creater = taskMission.getMcreater();
		if (StringUtils.isNotEmpty(creater)) {
			mission.setMissionCreater(creater);
		}
		String chargMan = taskMission.getMchargeman();
		if (StringUtils.isNotEmpty(chargMan)) {
			mission.setMissionChargeMan(chargMan);
		}
		Integer mState = taskMission.getMstate();
		if (mState != null) {
			mission.setMissionState(mState);
		}
		// 数据库当前时间
		Date dbCurrentDate = newsTaskService.getDBDate();
		
		// 创建时间
		Date  missionCreateDate = taskMission.getMcreatetime();
		String missionCreateTime = "";
		if (missionCreateDate != null) {
			missionCreateTime = TimeAgo.newsCommandToDay(missionCreateDate, dbCurrentDate);
		}
		mission.setMissionCreateTime(missionCreateTime);
		
		// 完成时间
		Date  missionFinishDate = taskMission.getMfinishtime();
		String missionFinishTime = "";
		if (missionFinishDate!=null) {
			missionFinishTime = TimeAgo.newsCommandToDay(missionFinishDate, dbCurrentDate);
		}
		mission.setMissionFinishTime(missionFinishTime);
		
		String missionType = taskMission.getMtype();
		mission.setMissionType(missionType);
		String missionTypeName = customSettingService.getConfigNameByValue(Constants.DEFAULT_MISSION_CUTTYPE, missionType);
		mission.setMissionTypeName(missionTypeName);
		mission.setMissionFinishTime(missionFinishTime);
		String taskGuid = taskMission.getTaskguid();
		String taskTitle = taskMission.getTasktitle();
		String taskChargeMan = taskMission.getTaskchangeman();
		if (StringUtils.isNotEmpty(taskGuid)) {
			mission.setTaskGuid(taskMission.getTaskguid());
		}
		if (StringUtils.isNotEmpty(taskTitle)) {
			mission.setTaskTitle(taskTitle);
		}
		if (StringUtils.isNotEmpty(taskChargeMan)) {
			mission.setTaskChangeMan(taskChargeMan);
		}
		return mission;
	}
	
	/**
     * 将APP提交过来的NewsTask转换成指挥调度所需要的NewsTask
     * @param newsTask
     * @return
     * @author luomeng
	 * @throws Exception 
     */
    public static NewsTaskWithBLOBs getAppNewsTaskByWSNewsTask(NewsTask newsTask) throws Exception{
    	NewsTaskWithBLOBs appNewsTask = new NewsTaskWithBLOBs();
    	String taskGuid = newsTask.getTaskGuid();
    	String title = newsTask.getTitle();
    	String content = newsTask.getContent();
    	String ownColumn = newsTask.getOwnColumn();
    	String creater = newsTask.getCreater();
    	String chargeMan = newsTask.getChargeMan();
    	String inPeople = newsTask.getInPeople();
    	String passAdvice = newsTask.getPassAdvice();
    	Integer taskStatus = newsTask.getTaskStatus();
    	Integer status = newsTask.getStatus();
    	String linkGuid = newsTask.getLinkGuid();
    	List<TaskResource> taskResourceList = getTaskResourceList(newsTask.getResourceList()); 
    	appNewsTask.setTaskguid(taskGuid);
    	appNewsTask.setTasktitle(title);
    	appNewsTask.setTaskcontent(content);
    	appNewsTask.setContentrtf2(content);
    	appNewsTask.setOwncolumn(ownColumn);
    	appNewsTask.setCreater(creater);
    	appNewsTask.setChargeman(chargeMan);
    	appNewsTask.setInpeople(inPeople);
    	appNewsTask.setPassadvice(passAdvice);
    	appNewsTask.setLinkguid(linkGuid);
    	Date date = newsTaskService.getDBDate();
    	if (StringUtils.isEmpty(taskGuid)) {
    		appNewsTask.setCreatetime(date);
    	}
    	appNewsTask.setModifytime(date);
    	appNewsTask.setTaskstate(taskStatus);
    	if (status!=null && taskStatus == NEWSTASKSTATES.XUANTI.getTaskState()) {
    		appNewsTask.setXuantistate(new BigDecimal(status));
    	}
    	appNewsTask.setUsecolumn(ownColumn);
    	appNewsTask.setTaskResources(taskResourceList);
    	String operaterId = newsTask.getOperaterId();
    	if (StringUtils.isNotEmpty(operaterId)) {
    		appNewsTask.setOperaterId(operaterId);
    	}
    	return appNewsTask;
    }
    
    /**
     * 将APP提交过来的资源转化成指挥调度接口需要的
     * @param resourceList
     * @return
     * @author luomeng
     */
    public static List<TaskResource> getTaskResourceList(List<Resource> resourceList){
    	if (StringUtils.listIsNotEmpty(resourceList)) {
    		List<TaskResource> taskResourceList = new ArrayList<>();
    		for (Resource resource : resourceList) {
    			TaskResource taskResource = getAppResource(resource);
    			taskResourceList.add(taskResource);
    		}
    		return taskResourceList;
    	}
		return null;
    }
    
    /**
     * 将APP提交过来的资源转化成指挥调度接口需要的
     * @param resource
     * @return
     * @author luomeng
     */
    public static TaskResource getAppResource(Resource resource){
    	TaskResource taskResource = new TaskResource();
    	taskResource.setResourceguid(resource.getResourceGuid());
    	taskResource.setResourcetype(resource.getResourceType());
    	String filePath = resource.getFilePath();
    	if (StringUtils.isNotEmpty(filePath)) {
    		taskResource.setFilePath(filePath);
    	}
    	return taskResource;
    }
    
}
