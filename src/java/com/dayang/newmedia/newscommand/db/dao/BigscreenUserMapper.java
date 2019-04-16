package com.dayang.newmedia.newscommand.db.dao;

import java.util.List;

import com.dayang.newmedia.newscommand.db.model.BigscreenUser;

public interface BigscreenUserMapper {
    int deleteByPrimaryKey(String guid);

    int insert(BigscreenUser record);

    int insertSelective(BigscreenUser record);

    BigscreenUser selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(BigscreenUser record);

    int updateByPrimaryKey(BigscreenUser record);
    
    List<BigscreenUser> getBigScreenUser();
    
    List<BigscreenUser> selectByName(String tenantName);
    
}