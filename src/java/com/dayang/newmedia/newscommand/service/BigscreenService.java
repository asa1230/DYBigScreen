package com.dayang.newmedia.newscommand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.newscommand.db.dao.BigScreenForUserMapper;
import com.dayang.newmedia.newscommand.db.dao.BigscreenMapper;
import com.dayang.newmedia.newscommand.db.dao.BigscreenUserMapper;
import com.dayang.newmedia.newscommand.db.model.BigScreenForUser;
import com.dayang.newmedia.newscommand.db.model.Bigscreen;
import com.dayang.newmedia.newscommand.db.model.BigscreenUser;


@Service("bigscreenService")
public class BigscreenService {
	
	@Autowired
	public BigscreenMapper bigscreenMapper;
	
	@Autowired
	public BigscreenUserMapper bigscreenUserMapper;

	@Autowired
	public BigScreenForUserMapper bigScreenForUserMapper;
	
	
	/**
	 * 用户大屏信息
	 * @param userGuid
	 * @return
	 */
	public List<Bigscreen> getBigScreenByUserGuid(String userGuid){
		BigscreenUser bigscreenuser = new BigscreenUser();
		bigscreenuser.setTenantid(userGuid);
		return bigscreenMapper.getBigScreenByUserGuid(bigscreenuser);
	}
	
	/**
	 * 根据ID查询大屏信息
	 * @param userGuid
	 * @return
	 */
	public Bigscreen getBigScreenByGuid(String guid){
		return bigscreenMapper.selectByPrimaryKey(guid);
	}
	
	/**
	 * 所有租户信息
	 * @param userGuid
	 * @return
	 */
	public List<BigscreenUser> getBigScreenUser(){
		return bigscreenUserMapper.getBigScreenUser();
	}
	
	/**
	 * 查询所有大屏
	 * @param userGuid
	 * @return
	 */
	public List<Bigscreen> getAllBigScreen(){
		return bigscreenMapper.getAllScreen();
	}
	
	/**
	 * 查询其他大屏
	 * @param userGuid
	 * @return
	 */
	public List<Bigscreen> getOtherBigScreen(String name){
		return bigscreenMapper.selectByName(name);
	}
	
	/**
	 * 添加大屏
	 * @param userGuid
	 * @return
	 */
	public int addBigScreen(Bigscreen record){
		return bigscreenMapper.insert(record);
	}
	
	/**
	 * 更新大屏
	 * @param userGuid
	 * @return
	 */
	public int updateBigScreen(Bigscreen record){
		return bigscreenMapper.updateByPrimaryKey(record);
	}
	
	/**
	 * 删除大屏
	 * @param userGuid
	 * @return
	 */
	public int deleteBigScreen(String guid){
		return bigscreenMapper.deleteByPrimaryKey(guid);
	}
	
	/**
	 * 根据ID查询机构
	 * @param userGuid
	 * @return
	 */
	public BigscreenUser getBigScreenUserByID(String guid){
		return bigscreenUserMapper.selectByPrimaryKey(guid);
	}
	
	/**
	 * 根据名称查询机构
	 * @param userGuid
	 * @return
	 */
	public List<BigscreenUser> getBigScreenUserByName(String name){
		return bigscreenUserMapper.selectByName(name);
	}
	
	/**
	 * 添加机构
	 * @param userGuid
	 * @return
	 */
	public int addBigScreenUser(BigscreenUser BigscreenUser){
		return bigscreenUserMapper.insert(BigscreenUser);
	}
	
	/**
	 * 修改机构
	 * @param userGuid
	 * @return
	 */
	public int updateBigScreenUser(BigscreenUser BigscreenUser){
		return bigscreenUserMapper.updateByPrimaryKey(BigscreenUser);
	}
	
	/**
	 * 删除机构
	 * @param userGuid
	 * @return
	 */
	public int deleteBigScreenUser(String guid){
		return bigscreenUserMapper.deleteByPrimaryKey(guid);
	}
	
	/**
	 * 根据tenantID查询
	 * @param userGuid
	 * @return
	 */
	public List<BigScreenForUser> getBytenantID(String tenantID){
		return bigScreenForUserMapper.queryByTenantID(tenantID);
	}
	
	/**
	 * 删除关联表
	 * @param userGuid
	 * @return
	 */
	public int deleteBigScreenForUser(String guid){
		return bigScreenForUserMapper.deleteByPrimaryKey(guid);
	}
	
	/**
	 * 添加关联表
	 * @param userGuid
	 * @return
	 */
	public int addBigScreenForUser(BigScreenForUser record){
		return bigScreenForUserMapper.insert(record);
	}
	
}
