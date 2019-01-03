package com.dayang.newmedia.newscommand.db.dao;

import com.dayang.newmedia.newscommand.db.model.ItemInfo;
import com.dayang.newmedia.newscommand.db.model.ItemInfoQuery;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ItemInfoMapper {
    int deleteByExample(ItemInfoQuery example);

    int deleteByPrimaryKey(String itemguid);

    int insert(ItemInfo record);

    int insertSelective(ItemInfo record);

    List<ItemInfo> selectByExample(ItemInfoQuery example);

    ItemInfo selectByPrimaryKey(String itemguid);

    int updateByExampleSelective(@Param("record") ItemInfo record, @Param("example") ItemInfoQuery example);

    int updateByExample(@Param("record") ItemInfo record, @Param("example") ItemInfoQuery example);

    int updateByPrimaryKeySelective(ItemInfo record);

    int updateByPrimaryKey(ItemInfo record);
    
	List<ItemInfo> getItemInfosByRoleGuids(Map<String, Object> map);
}