package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.UserRoleInfo;
import com.dayang.newmedia.newscommand.db.model.UserRoleInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleInfoMapper {
    int deleteByExample(UserRoleInfoQuery example);

    int deleteByPrimaryKey(String userroleguid);

    int insert(UserRoleInfo record);

    int insertSelective(UserRoleInfo record);

    List<UserRoleInfo> selectByExample(UserRoleInfoQuery example);

    UserRoleInfo selectByPrimaryKey(String userroleguid);

    int updateByExampleSelective(@Param("record") UserRoleInfo record, @Param("example") UserRoleInfoQuery example);

    int updateByExample(@Param("record") UserRoleInfo record, @Param("example") UserRoleInfoQuery example);

    int updateByPrimaryKeySelective(UserRoleInfo record);

    int updateByPrimaryKey(UserRoleInfo record);
}