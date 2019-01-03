package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.UserExtraInfo;
import com.dayang.newmedia.newscommand.db.model.UserExtraInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserExtraInfoMapper {
    int deleteByExample(UserExtraInfoQuery example);

    int deleteByPrimaryKey(String extraid);

    int insert(UserExtraInfo record);

    int insertSelective(UserExtraInfo record);

    List<UserExtraInfo> selectByExample(UserExtraInfoQuery example);

    UserExtraInfo selectByPrimaryKey(String extraid);

    int updateByExampleSelective(@Param("record") UserExtraInfo record, @Param("example") UserExtraInfoQuery example);

    int updateByExample(@Param("record") UserExtraInfo record, @Param("example") UserExtraInfoQuery example);

    int updateByPrimaryKeySelective(UserExtraInfo record);

    int updateByPrimaryKey(UserExtraInfo record);
}