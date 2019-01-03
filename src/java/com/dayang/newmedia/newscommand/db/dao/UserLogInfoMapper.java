package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.UserLogInfo;
import com.dayang.newmedia.newscommand.db.model.UserLogInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLogInfoMapper {
    int deleteByExample(UserLogInfoQuery example);

    int deleteByPrimaryKey(String logguid);

    int insert(UserLogInfo record);

    int insertSelective(UserLogInfo record);

    List<UserLogInfo> selectByExample(UserLogInfoQuery example);

    UserLogInfo selectByPrimaryKey(String logguid);

    int updateByExampleSelective(@Param("record") UserLogInfo record, @Param("example") UserLogInfoQuery example);

    int updateByExample(@Param("record") UserLogInfo record, @Param("example") UserLogInfoQuery example);

    int updateByPrimaryKeySelective(UserLogInfo record);

    int updateByPrimaryKey(UserLogInfo record);
}