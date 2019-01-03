package com.dayang.newmedia.newscommand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.dao.ServerSettingsMapper;
import com.dayang.newmedia.newscommand.db.model.ServerSettings;
import com.dayang.newmedia.newscommand.db.model.ServerSettingsQuery;
import com.dayang.newmedia.newscommand.db.model.ServerSettingsQuery.Criteria;

@Service("serverSettingsService")
public class ServerSettingsService {
	
	@Autowired
	public ServerSettingsMapper serverSettingsMapper;
	
	/**
	 * 根据uType获取请求地址
	 * @param uType
	 * @return
	 * @throws Exception
	 */
	public ServerSettings getServerSettingsByUtype(Integer uType) throws Exception {
		if (uType==null) {
			throw new Exception("请求参数异常!");
		} 
		ServerSettingsQuery example = new ServerSettingsQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUtypeEqualTo(uType);
		List<ServerSettings> serverSettingsList = serverSettingsMapper.selectByExample(example);
		if (!StringUtils.listIsNotEmpty(serverSettingsList)) {
			throw new Exception("找不到对应的服务地址!");
		}
		return serverSettingsList.get(0);
	}
}
