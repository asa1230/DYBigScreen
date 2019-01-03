package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.NewsTask;
import com.dayang.newmedia.newscommand.db.model.NewsTaskQuery;
import com.dayang.newmedia.newscommand.db.model.NewsTaskWithBLOBs;
import com.dayang.newmedia.newscommand.db.model.TaskSearchPara;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsTaskMapper {
    int deleteByExample(NewsTaskQuery example);

    int deleteByPrimaryKey(String taskguid);

    int insert(NewsTaskWithBLOBs record);

    int insertSelective(NewsTaskWithBLOBs record);

    List<NewsTaskWithBLOBs> selectByExampleWithBLOBs(NewsTaskQuery example);

    List<NewsTask> selectByExample(NewsTaskQuery example);

    NewsTaskWithBLOBs selectByPrimaryKey(String taskguid);

    int updateByExampleSelective(@Param("record") NewsTaskWithBLOBs record, @Param("example") NewsTaskQuery example);

    int updateByExampleWithBLOBs(@Param("record") NewsTaskWithBLOBs record, @Param("example") NewsTaskQuery example);

    int updateByExample(@Param("record") NewsTask record, @Param("example") NewsTaskQuery example);

    int updateByPrimaryKeySelective(NewsTaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsTaskWithBLOBs record);

    int updateByPrimaryKey(NewsTask record);

	int getNewsTaskTotal(TaskSearchPara taskSearchPara);

	List<NewsTaskWithBLOBs> getNewsTaskInfos(TaskSearchPara taskSearchPara);
	
	int getBaoTiNewsTaskTotal(TaskSearchPara taskSearchPara) ;
	
	List<NewsTaskWithBLOBs> getBaoTiNewsTaskInfos(TaskSearchPara taskSearchPara);
	
	List<NewsTaskWithBLOBs> getXuanTiForTaskMission(TaskSearchPara taskSearchPara);

	List<NewsTaskWithBLOBs> getRepeatedXuanTiNewsTasks(TaskSearchPara taskSearchPara);
	
}