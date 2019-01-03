package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.BanmianInfo;
import com.dayang.newmedia.newscommand.db.model.BanmianInfoQuery;
import com.dayang.newmedia.newscommand.db.model.UserBanmianInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BanmianInfoMapper {
    int deleteByExample(BanmianInfoQuery example);

    int deleteByPrimaryKey(String bguid);

    int insert(BanmianInfo record);

    int insertSelective(BanmianInfo record);

    List<BanmianInfo> selectByExample(BanmianInfoQuery example);

    BanmianInfo selectByPrimaryKey(String bguid);

    int updateByExampleSelective(@Param("record") BanmianInfo record, @Param("example") BanmianInfoQuery example);

    int updateByExample(@Param("record") BanmianInfo record, @Param("example") BanmianInfoQuery example);

    int updateByPrimaryKeySelective(BanmianInfo record);

    int updateByPrimaryKey(BanmianInfo record);

	List<BanmianInfo> getColumnInfoByUserGuid(UserBanmianInfo userBanmianInfo);
}