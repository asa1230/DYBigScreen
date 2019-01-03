package com.dayang.newmedia.newscommand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.dao.RoleInfoMapper;
import com.dayang.newmedia.newscommand.db.model.RoleInfo;
import com.dayang.newmedia.newscommand.db.model.RoleInfoQuery;
import com.dayang.newmedia.newscommand.db.model.RoleInfoQuery.Criteria;

/**
 * 角色
 * @author lm
 *
 */
@Service("roleInfoService")
public class RoleInfoService {
	
	@Autowired
	public RoleInfoMapper roleInfoMapper;
	
	/**
	 * 根据角色名称获取角色信息
	 * @param roleName
	 * @return
	 * @throws Exception 
	 * @author luomeng
	 */
	public RoleInfo getRoleInfoByRoleName(String roleName) throws Exception{
		RoleInfoQuery example = new RoleInfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andRolenameEqualTo(roleName);
		List<RoleInfo> roleInfos = roleInfoMapper.selectByExample(example);
		if (!StringUtils.listIsNotEmpty(roleInfos)) {
			throw new Exception("找不到该角色!");
		}
		return roleInfos.get(0);
    }
	
	/**
	 * 根据角色ID获取角色
	 * @param roleGuids
	 * @return
	 */
	public List<RoleInfo> getRoleInfosByRoleGuids(List<String> roleGuids){
		RoleInfoQuery example = new RoleInfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andRoleguidIn(roleGuids);
		List<RoleInfo> roleInfos = roleInfoMapper.selectByExample(example);
		return roleInfos;
	}

}
