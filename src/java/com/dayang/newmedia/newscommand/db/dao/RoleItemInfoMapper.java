package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.RoleItemInfo;
import com.dayang.newmedia.newscommand.db.model.RoleItemInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleItemInfoMapper {
    int deleteByExample(RoleItemInfoQuery example);

    int deleteByPrimaryKey(String roleitemguid);

    int insert(RoleItemInfo record);

    int insertSelective(RoleItemInfo record);

    List<RoleItemInfo> selectByExample(RoleItemInfoQuery example);

    RoleItemInfo selectByPrimaryKey(String roleitemguid);

    int updateByExampleSelective(@Param("record") RoleItemInfo record, @Param("example") RoleItemInfoQuery example);

    int updateByExample(@Param("record") RoleItemInfo record, @Param("example") RoleItemInfoQuery example);

    int updateByPrimaryKeySelective(RoleItemInfo record);

    int updateByPrimaryKey(RoleItemInfo record);
}