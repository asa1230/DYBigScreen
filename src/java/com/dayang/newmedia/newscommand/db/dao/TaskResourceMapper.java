package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.TaskResource;
import com.dayang.newmedia.newscommand.db.model.TaskResourceQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskResourceMapper {
    int deleteByExample(TaskResourceQuery example);

    int insert(TaskResource record);

    int insertSelective(TaskResource record);

    List<TaskResource> selectByExample(TaskResourceQuery example);

    int updateByExampleSelective(@Param("record") TaskResource record, @Param("example") TaskResourceQuery example);

    int updateByExample(@Param("record") TaskResource record, @Param("example") TaskResourceQuery example);
}