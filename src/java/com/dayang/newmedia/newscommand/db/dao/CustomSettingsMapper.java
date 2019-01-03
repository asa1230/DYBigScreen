package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.CustomSettings;
import com.dayang.newmedia.newscommand.db.model.CustomSettingsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomSettingsMapper {
    int deleteByExample(CustomSettingsQuery example);

    int deleteByPrimaryKey(String cuguid);

    int insert(CustomSettings record);

    int insertSelective(CustomSettings record);

    List<CustomSettings> selectByExample(CustomSettingsQuery example);

    CustomSettings selectByPrimaryKey(String cuguid);

    int updateByExampleSelective(@Param("record") CustomSettings record, @Param("example") CustomSettingsQuery example);

    int updateByExample(@Param("record") CustomSettings record, @Param("example") CustomSettingsQuery example);

    int updateByPrimaryKeySelective(CustomSettings record);

    int updateByPrimaryKey(CustomSettings record);
}