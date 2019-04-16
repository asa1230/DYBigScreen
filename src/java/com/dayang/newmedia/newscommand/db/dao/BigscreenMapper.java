package com.dayang.newmedia.newscommand.db.dao;

import java.util.List;

import com.dayang.newmedia.newscommand.db.model.Bigscreen;
import com.dayang.newmedia.newscommand.db.model.BigscreenUser;

public interface BigscreenMapper {
    int deleteByPrimaryKey(String screenguid);

    int insert(Bigscreen record);

    int insertSelective(Bigscreen record);

    Bigscreen selectByPrimaryKey(String screenguid);

    int updateByPrimaryKeySelective(Bigscreen record);

    int updateByPrimaryKey(Bigscreen record);
    
    List<Bigscreen> getBigScreenByUserGuid(BigscreenUser bigScreenUser);
    
    List<Bigscreen> getAllScreen();
    
    List<Bigscreen> selectByName(String name);
    
}