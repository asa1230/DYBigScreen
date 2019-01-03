package com.dayang.newmedia.newscommand.db.dao;

import java.util.Date;
import java.util.List;


public interface DBMetaDataMapper {
    Date getCurrentTime();

    void dropTable(String tableName);

    List<String> queryTables(String tableNameLike);

}
