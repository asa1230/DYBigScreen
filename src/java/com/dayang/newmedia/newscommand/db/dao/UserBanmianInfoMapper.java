package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.UserBanmianInfo;
import com.dayang.newmedia.newscommand.db.model.UserBanmianInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBanmianInfoMapper {
    int deleteByExample(UserBanmianInfoQuery example);

    int deleteByPrimaryKey(String ubguid);

    int insert(UserBanmianInfo record);

    int insertSelective(UserBanmianInfo record);

    List<UserBanmianInfo> selectByExample(UserBanmianInfoQuery example);

    UserBanmianInfo selectByPrimaryKey(String ubguid);

    int updateByExampleSelective(@Param("record") UserBanmianInfo record, @Param("example") UserBanmianInfoQuery example);

    int updateByExample(@Param("record") UserBanmianInfo record, @Param("example") UserBanmianInfoQuery example);

    int updateByPrimaryKeySelective(UserBanmianInfo record);

    int updateByPrimaryKey(UserBanmianInfo record);
}