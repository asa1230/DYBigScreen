package com.dayang.newmedia.newscommand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.newscommand.db.dao.BanmianInfoMapper;
import com.dayang.newmedia.newscommand.db.dao.UserBanmianInfoMapper;
import com.dayang.newmedia.newscommand.db.model.BanmianInfo;
import com.dayang.newmedia.newscommand.db.model.BanmianInfoQuery;
import com.dayang.newmedia.newscommand.db.model.BanmianInfoQuery.Criteria;
import com.dayang.newmedia.newscommand.db.model.UserBanmianInfo;

@Service("banmianInfoService")
public class BanmianInfoService {
	
	@Autowired
	public BanmianInfoMapper banmianInfoMapper;
	
	/**
	 * 根据用户ID获取栏目信息
	 * @param userGuid
	 * @return
	 */
	public List<BanmianInfo> getColumnInfoByUserGuid(String userGuid){
		UserBanmianInfo userBanmianInfo = new UserBanmianInfo();
		userBanmianInfo.setUserguid(userGuid);
		return banmianInfoMapper.getColumnInfoByUserGuid(userBanmianInfo);
	}
	
	/**
	 * 获取全部栏目信息
	 * @return
	 */
	public List<BanmianInfo> getColumnInfo(){
		BanmianInfoQuery example = new BanmianInfoQuery();
		//Criteria createCriteria = example.createCriteria();
		example.setOrderByClause("bname desc");
		return banmianInfoMapper.selectByExample(example);
	}
}
