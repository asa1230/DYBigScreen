package com.dayang.newmedia.newscommand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.dao.UserRoleInfoMapper;
import com.dayang.newmedia.newscommand.db.model.RoleInfo;
import com.dayang.newmedia.newscommand.db.model.UserRoleInfo;
import com.dayang.newmedia.newscommand.db.model.UserRoleInfoQuery;
import com.dayang.newmedia.newscommand.db.model.UserRoleInfoQuery.Criteria;

/**
 * 用户角色
 * @author luomeng
 *
 */
@Service("userRoleInfoService")
public class UserRoleInfoService {
	
	@Autowired
	public UserRoleInfoMapper userRoleInfoMapper;
	/**
	 * 获取责编
	 * @param roleGuid
	 * @param userIdList
	 * @return
	 * @author luomeng
	 */
	public List<UserRoleInfo> getZeBianRoleInfo(String roleGuid,List<String> userIdList){
		UserRoleInfoQuery example = new UserRoleInfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andRoleguidEqualTo(roleGuid);
		if (StringUtils.listIsNotEmpty(userIdList)) {
			criteria.andUserguidIn(userIdList);
		}
		return userRoleInfoMapper.selectByExample(example);
	}
	
	/**
	 * 根据用户ID获取用户角色信息
	 * @param userId
	 * @return
	 * @author luomeng
	 */
	public List<UserRoleInfo> getUserRoleInfoByUserId(String userId){
		UserRoleInfoQuery example = new UserRoleInfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUserguidEqualTo(userId);
		return userRoleInfoMapper.selectByExample(example);
	}
}
