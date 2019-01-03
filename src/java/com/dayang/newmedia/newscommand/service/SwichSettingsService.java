package com.dayang.newmedia.newscommand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.dao.SwichSettingsMapper;
import com.dayang.newmedia.newscommand.db.model.SwichSettings;
import com.dayang.newmedia.newscommand.db.model.SwichSettingsQuery;
import com.dayang.newmedia.newscommand.db.model.SwichSettingsQuery.Criteria;

/**
 * 开关操作服务
 * @author luomeng
 *
 */
@Service("swichSettingsService")
public class SwichSettingsService {
	
	@Autowired
	public SwichSettingsMapper swichSettingsMapper;
	
	/**
	 * 根据类型从开关参数设置表中获取相关参数值
	 * @param switchType
	 * @return 
	 * @author luomeng
	 */
	public Integer getSwitchSettingValueByType(Integer swichType){
		SwichSettingsQuery example = new SwichSettingsQuery();
		Criteria criteria = example.createCriteria(); 
		criteria.andSwichtypeEqualTo(swichType);
		List<SwichSettings> swichSettings = swichSettingsMapper.selectByExample(example);
		if (StringUtils.listIsNotEmpty(swichSettings)) {
			return swichSettings.get(0).getSwichvalue();
		}
		return null;
    }
}
