package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.TaskMisson;
import com.dayang.newmedia.newscommand.db.model.TaskMissonQuery;
import com.dayang.newmedia.newscommand.db.model.TaskMissonWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.TaskSearchPara;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskMissonMapper {
    int deleteByExample(TaskMissonQuery example);

    int deleteByPrimaryKey(String mguid);

    int insert(TaskMissonWithBLOBs record);

    int insertSelective(TaskMissonWithBLOBs record);

    List<TaskMissonWithBLOBs> selectByExampleWithBLOBs(TaskMissonQuery example);

    List<TaskMisson> selectByExample(TaskMissonQuery example);

    TaskMissonWithBLOBs selectByPrimaryKey(String mguid);

    int updateByExampleSelective(@Param("record") TaskMissonWithBLOBs record, @Param("example") TaskMissonQuery example);

    int updateByExampleWithBLOBs(@Param("record") TaskMissonWithBLOBs record, @Param("example") TaskMissonQuery example);

    int updateByExample(@Param("record") TaskMisson record, @Param("example") TaskMissonQuery example);

    int updateByPrimaryKeySelective(TaskMissonWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TaskMissonWithBLOBs record);

    int updateByPrimaryKey(TaskMisson record);

    int getMissionTaskTotal(TaskSearchPara taskSearchPara);

    List<TaskMissonWithBLOBs> getMissionTaskInfos(TaskSearchPara searchPara);
}