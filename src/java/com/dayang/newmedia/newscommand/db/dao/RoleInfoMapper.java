package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.RoleInfo;
import com.dayang.newmedia.newscommand.db.model.RoleInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleInfoMapper {
    int deleteByExample(RoleInfoQuery example);

    int deleteByPrimaryKey(String roleguid);

    int insert(RoleInfo record);

    int insertSelective(RoleInfo record);

    List<RoleInfo> selectByExample(RoleInfoQuery example);

    RoleInfo selectByPrimaryKey(String roleguid);

    int updateByExampleSelective(@Param("record") RoleInfo record, @Param("example") RoleInfoQuery example);

    int updateByExample(@Param("record") RoleInfo record, @Param("example") RoleInfoQuery example);

    int updateByPrimaryKeySelective(RoleInfo record);

    int updateByPrimaryKey(RoleInfo record);
}