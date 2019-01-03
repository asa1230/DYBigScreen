package com.dayang.newmedia.newscommand.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.dao.UserBanmianInfoMapper;
import com.dayang.newmedia.newscommand.db.model.BanmianInfo;
import com.dayang.newmedia.newscommand.db.model.ItemInfo;
import com.dayang.newmedia.newscommand.db.model.UserBanmianInfo;
import com.dayang.newmedia.newscommand.db.model.UserBanmianInfoQuery;
import com.dayang.newmedia.newscommand.db.model.UserBanmianInfoQuery.Criteria;
import com.dayang.newmedia.newscommand.ws.client.creclient.CRELoginClient;
import com.dayang.newmedia.newscommand.ws.client.creclient.CREUserLoadClient;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.LoginModel;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.UserLoadModel;
import com.dayang.newmedia.newscommand.ws.commandapp.model.ColumnInfo;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.LoginResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.UserCondition;

import sun.util.logging.resources.logging;

/**
 * 用户栏目业务逻辑层
 * @author luomeng
 *
 */
@Service("userBanmianInfoService")
public class UserBanmianInfoService {
	@Autowired
	public UserBanmianInfoMapper userBanmianInfoMapper;
	
	public static Logger log = Logger.getLogger(UserBanmianInfoService.class); 
	
	/**
	 * 根据用户ID和token获取用户详细信息
	 * 1、调用CRE接口，获取用户userName，以及头像信息
	 * 2、获取FTP上传地址
	 * 3、获取权限信息
	 * 4、如果是系统管理员，则禁止登陆指挥调度APP
	 * 4、获取栏目信息
	 * @param userCondition
	 * @return
	 * @throws Exception 
	 * @author luomeng
	 */
	public LoginResponse getUserInfo(UserCondition userCondition) throws Exception {
		
		if (userCondition == null || StringUtils.isEmpty(userCondition.getUserId())) {
			throw new Exception("请求参数异常!");
		}
		String token = userCondition.getToken();
		String userId = userCondition.getUserId();
		String password = userCondition.getPassword();
		String from = Constants.CRE_FROM;
		// 如果token为空，则先要获取token信息
		if (StringUtils.isEmpty(token)) {
			token = getTokenFromCre(userId, password, from);
		}
		
		// 1、获取用户详情
		UserLoadModel userLoadModel = getUserInfoFromCre(userId, token);
		String userName = userLoadModel.getName();
		String iconUrl = userLoadModel.getIconUrl();
		String tel = userLoadModel.getTel();
		String mail = userLoadModel.getMail();
		// 2、获取FTP上传地址
		String ftpUrl = CommonServiceUtil.getServerSettingUrlByUtype(Constants.LOCAL_FTP_UPLOAD_URL);
		if (StringUtils.isNotEmpty(ftpUrl)) {
			ftpUrl = StringUtils.combineUrl(ftpUrl, "/");
		}
		// 3、获取权限信息
		boolean isHaveAdmin = false;
		List<ItemInfo> itemInfoList = CommonServiceUtil.getItemInfoListsByUserGuid(userId);
		List<String> roleItemFlag = new ArrayList<String>();
		Set<String> roleItemSet = new HashSet<>();
		if (StringUtils.listIsNotEmpty(itemInfoList)) {
			for (ItemInfo itemInfo : itemInfoList) {
				String itemTarget = itemInfo.getItemtarget();
				if (Constants.HAVEADMIN.equals(itemTarget)){
					isHaveAdmin = true;
				}
				roleItemFlag.add(itemTarget);
			}
		}
		if (isHaveAdmin) {
			// 是系统管理员，禁止登陆
			throw new Exception("该用户是系统管理员，禁止登陆!");
		}
		
		// 4、获取栏目信息
		List<BanmianInfo> columnInfoList = CommonServiceUtil.getBanmianInfoListByUserGuid(userId);
		List<ColumnInfo> columnArray = getColumnInfo(columnInfoList);
		
		// 5、封装响应信息
		LoginResponse loginResponse = new LoginResponse();
		CommonResponse successResponse = CommonServiceUtil.getCommonResponseSuccess("获取用户成功!");
		loginResponse.setColumns(columnArray);
		loginResponse.setIconUrl(iconUrl);
		loginResponse.setUserId(userId);
		loginResponse.setUserName(userName);
		loginResponse.setStorageURL(ftpUrl);
		loginResponse.setTel(tel);
		loginResponse.setMail(mail);
		loginResponse.setRoleItemFlag(roleItemFlag);
		loginResponse.setCommonResponse(successResponse);
		return loginResponse;
	}
	
	/**
	 * 认证登陆，并获取token信息
	 * @param userId
	 * @param password
	 * @param from
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public String getTokenFromCre(String userId,String password,String from) throws Exception{
		// CRE登陆认证地址
		String loginUrl = CommonServiceUtil.getServerSettingUrlByUtype(Constants.CRE_LOGIN);
		LoginModel loginModel = CRELoginClient.loginClient(loginUrl, userId, password, from);
		if (loginModel==null) {
			throw new Exception("获取认证Token失败!");
		}
		return loginModel.getToken();
	}
	
	/**
	 * 根据用户ID和token从CRE获取用户详情
	 * @param userId
	 * @param token
	 * @return
	 * @throws Exception 
	 * @author luomeng
	 */
	public UserLoadModel getUserInfoFromCre(String userId,String token) throws Exception{
		// CRE用户详情地址
		String userLoad = CommonServiceUtil.getServerSettingUrlByUtype(Constants.CRE_USER_LOAD);
		List<UserLoadModel>  userLoadModel = CREUserLoadClient.userLoadClient(userLoad, userId, token);
		if (!StringUtils.listIsNotEmpty(userLoadModel)) {
			throw new Exception("获取用户详情失败!");
		}
		return userLoadModel.get(0);
	}
	
	/**
	 * 封装栏目的返回消息
	 * @param columnInfoList
	 * @return
	 * @author luomeng
	 */
	public List<ColumnInfo> getColumnInfo(List<BanmianInfo> columnInfoList){
		List<ColumnInfo> columnInfoArray = new ArrayList<ColumnInfo>();
		for (BanmianInfo columnInfo : columnInfoList) {
			ColumnInfo column = new ColumnInfo();
			column.setColumnId(columnInfo.getBcolumnguid());
			column.setColumnName(columnInfo.getBname());
			columnInfoArray.add(column);
		}
		return columnInfoArray;
	}
	
	/**
	 * 根据用户姓名获取用户的GUID
	 * @param userName
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public String getUserIdByUserName (String userName,boolean isThrowException) throws Exception{
		UserBanmianInfoQuery example = new UserBanmianInfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userName);
		List<UserBanmianInfo> userBanmianInfos = userBanmianInfoMapper.selectByExample(example);
		if (!StringUtils.listIsNotEmpty(userBanmianInfos)) {
			if (isThrowException) {
				throw new Exception("找不到【"+userName+"】用户!");
			} else {
				return "";
			}
		}
		return userBanmianInfos.get(0).getUserguid();
	}
	
	/**
	 * 根据用户ID获取用户姓名信息
	 * @param userId
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	public String getUserNameByUserId (String userId) throws Exception{
		UserBanmianInfoQuery example = new UserBanmianInfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUserguidEqualTo(userId);
		List<UserBanmianInfo> userBanmianInfos = userBanmianInfoMapper.selectByExample(example);
		if (!StringUtils.listIsNotEmpty(userBanmianInfos)) {
			log.error("-----根据用户ID查询不到用户，用户ID为【"+userId+"】-----");
			throw new Exception("找不到该用户!");
		}
		String userName = userBanmianInfos.get(0).getUsername();
		return userName;
	}

	/**
	 * 根据栏目集合获取该栏目下所有的用户
	 * @param columnInfoList
	 * @return
	 * @author luomeng
	 */
	public List<UserBanmianInfo> getAllUserByColumns(List<BanmianInfo> columnInfoList) {
		if (!StringUtils.listIsNotEmpty(columnInfoList)) {
			return null;
		}
		// 栏目ID集合
		List<String> columnIds = new ArrayList<>();
		for (BanmianInfo banmianInfo : columnInfoList) {
			columnIds.add(banmianInfo.getBguid());
		}
		
		UserBanmianInfoQuery  example = new UserBanmianInfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andBguidIn(columnIds);
		return userBanmianInfoMapper.selectByExample(example);
	}
	
	/**
	 * 根据栏目名称获取该栏目下所有用户
	 * @param columnName
	 * @return
	 * @author luomeng
	 */
	public List<UserBanmianInfo> getAllUserByColumnName(String columnName){
		UserBanmianInfoQuery  example = new UserBanmianInfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andBnameEqualTo(columnName);
		return userBanmianInfoMapper.selectByExample(example);
	}
}
