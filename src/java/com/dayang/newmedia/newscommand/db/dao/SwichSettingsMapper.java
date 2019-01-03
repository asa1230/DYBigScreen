package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.SwichSettings;
import com.dayang.newmedia.newscommand.db.model.SwichSettingsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwichSettingsMapper {
    int deleteByExample(SwichSettingsQuery example);

    int deleteByPrimaryKey(String swichguid);

    int insert(SwichSettings record);

    int insertSelective(SwichSettings record);

    List<SwichSettings> selectByExample(SwichSettingsQuery example);

    SwichSettings selectByPrimaryKey(String swichguid);

    int updateByExampleSelective(@Param("record") SwichSettings record, @Param("example") SwichSettingsQuery example);

    int updateByExample(@Param("record") SwichSettings record, @Param("example") SwichSettingsQuery example);

    int updateByPrimaryKeySelective(SwichSettings record);

    int updateByPrimaryKey(SwichSettings record);
}