package com.dayang.newmedia.newscommand.db.dao;

import java.util.List;

import com.dayang.newmedia.newscommand.db.model.BigScreenForUser;
import com.dayang.newmedia.newscommand.db.model.Bigscreen;
import com.dayang.newmedia.newscommand.db.model.BigscreenUser;

public interface BigScreenForUserMapper {
    int deleteByPrimaryKey(String guid);

    int insert(BigScreenForUser record);

    int insertSelective(BigScreenForUser record);

    BigScreenForUser selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(BigScreenForUser record);

    int updateByPrimaryKey(BigScreenForUser record);
    
    List<BigScreenForUser> queryByTenantID(String tenantID);
}