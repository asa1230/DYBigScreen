package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.ServerSettings;
import com.dayang.newmedia.newscommand.db.model.ServerSettingsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerSettingsMapper {
    int deleteByExample(ServerSettingsQuery example);

    int deleteByPrimaryKey(String urlguid);

    int insert(ServerSettings record);

    int insertSelective(ServerSettings record);

    List<ServerSettings> selectByExample(ServerSettingsQuery example);

    ServerSettings selectByPrimaryKey(String urlguid);

    int updateByExampleSelective(@Param("record") ServerSettings record, @Param("example") ServerSettingsQuery example);

    int updateByExample(@Param("record") ServerSettings record, @Param("example") ServerSettingsQuery example);

    int updateByPrimaryKeySelective(ServerSettings record);

    int updateByPrimaryKey(ServerSettings record);
}