package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.Programrating;
import com.dayang.newmedia.newscommand.db.model.ProgramratingQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgramratingMapper {
    int deleteByExample(ProgramratingQuery example);

    int deleteByPrimaryKey(String ratingid);

    int insert(Programrating record);

    int insertSelective(Programrating record);

    List<Programrating> selectByExample(ProgramratingQuery example);

    Programrating selectByPrimaryKey(String ratingid);

    int updateByExampleSelective(@Param("record") Programrating record, @Param("example") ProgramratingQuery example);

    int updateByExample(@Param("record") Programrating record, @Param("example") ProgramratingQuery example);

    int updateByPrimaryKeySelective(Programrating record);

    int updateByPrimaryKey(Programrating record);
    
    List<Programrating> listProgramrating(String   ratingcode); 
}