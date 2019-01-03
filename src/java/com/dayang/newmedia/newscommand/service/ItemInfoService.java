package com.dayang.newmedia.newscommand.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.dao.ItemInfoMapper;
import com.dayang.newmedia.newscommand.db.dao.RoleItemInfoMapper;
import com.dayang.newmedia.newscommand.db.dao.UserRoleInfoMapper;
import com.dayang.newmedia.newscommand.db.model.ItemInfo;
import com.dayang.newmedia.newscommand.db.model.UserRoleInfo;
import com.dayang.newmedia.newscommand.db.model.UserRoleInfoQuery;
import com.dayang.newmedia.newscommand.db.model.UserRoleInfoQuery.Criteria;

@Service("itemInfoService")
public class ItemInfoService {
	
	@Autowired
	public ItemInfoMapper itemInfoMapper;
	@Autowired
	public RoleItemInfoMapper roleItemInfoMapper;
	@Autowired
	public UserRoleInfoMapper userRoleInfoMapper;
	
	public List<ItemInfo> selectItemInfosByUserGuid(String userGuid){
		// 1、根据用户ID获取用户的角色
		UserRoleInfoQuery userRoleQuery = new UserRoleInfoQuery();
		Criteria usrRoleCriteria = userRoleQuery.createCriteria();
		usrRoleCriteria.andUserguidEqualTo(userGuid);
		List<UserRoleInfo> userRoleInfos = userRoleInfoMapper.selectByExample(userRoleQuery);
		
		if (StringUtils.listIsNotEmpty(userRoleInfos)) {
			List<String> roleGuids = new ArrayList<String>();
			for (UserRoleInfo userRoleInfo : userRoleInfos) {
				roleGuids.add(userRoleInfo.getRoleguid());
			}
			// 2、根据角色ID获取权限ID
			Map<String,Object> map = new HashMap();
			map.put("roleGuids", roleGuids);
			List<ItemInfo> itemInfoList = itemInfoMapper.getItemInfosByRoleGuids(map);
			return itemInfoList;
		}
		return null;
	}
}
