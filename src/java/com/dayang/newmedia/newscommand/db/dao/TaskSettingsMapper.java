package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.TaskSettings;
import com.dayang.newmedia.newscommand.db.model.TaskSettingsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskSettingsMapper {
    int deleteByExample(TaskSettingsQuery example);

    int insert(TaskSettings record);

    int insertSelective(TaskSettings record);

    List<TaskSettings> selectByExample(TaskSettingsQuery example);

    int updateByExampleSelective(@Param("record") TaskSettings record, @Param("example") TaskSettingsQuery example);

    int updateByExample(@Param("record") TaskSettings record, @Param("example") TaskSettingsQuery example);
}