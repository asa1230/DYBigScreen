package com.dayang.newmedia.newscommand.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.dao.UserExtraInfoMapper;
import com.dayang.newmedia.newscommand.db.model.UserExtraInfo;
import com.dayang.newmedia.newscommand.db.model.UserExtraInfoQuery;
import com.dayang.newmedia.newscommand.db.model.UserExtraInfoQuery.Criteria;
import com.dayang.newmedia.newscommand.ws.client.creclient.CREUserLoadClient;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.UserLoadModel;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryXuantiApiServiceImpl;

@Service("userExtraInfoService")
public class UserExtraInfoService {
	
	public static Logger log = Logger.getLogger(UserExtraInfoService.class); 
	
	@Autowired
	public UserExtraInfoMapper userExtraInfoMapper;
	
	public String getUserIconByUserId(String userId) throws Exception{
		UserExtraInfoQuery example = new UserExtraInfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userId);
		List<UserExtraInfo> userExtraInfos = userExtraInfoMapper.selectByExample(example);
		String headerIcon = null;
		if (StringUtils.listIsNotEmpty(userExtraInfos)) {
			headerIcon = userExtraInfos.get(0).getUserimagefile();
		}
		if (StringUtils.isEmpty(headerIcon)) {
			log.warn("--------用户ID为【"+userId+"】的用户，在UserExtarInfo中找不到，从CRE中获取用户头像------");
			String url = CommonServiceUtil.getServerSettingUrlByUtype(Constants.CRE_USER_LOAD);
			List<UserLoadModel> userList = CREUserLoadClient.userLoadClient(url, userId, null);
			headerIcon = userList.get(0).getIconUrl();
			if (StringUtils.isEmpty(headerIcon)) {
				log.warn("--------用户ID为【"+userId+"】的用户，CRE头像不存在，请设置------");
			}
		}
		return headerIcon;
	}
	
}
