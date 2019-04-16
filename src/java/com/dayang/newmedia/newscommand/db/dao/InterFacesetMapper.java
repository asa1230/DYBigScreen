package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.InterFaceset;

public interface InterFacesetMapper {
    int deleteByPrimaryKey(String guid);

    int insert(InterFaceset record);

    int insertSelective(InterFaceset record);

    InterFaceset selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(InterFaceset record);

    int updateByPrimaryKey(InterFaceset record);
}