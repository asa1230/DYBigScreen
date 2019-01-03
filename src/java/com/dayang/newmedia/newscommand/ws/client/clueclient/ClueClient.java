package com.dayang.newmedia.newscommand.ws.client.clueclient;

import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueByIdResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryHJCondition;
/**
 * 线索客户端Interface
 * @author luomeng
 *
 */
public interface ClueClient {
	public QueryClueResponse getClueList(String serverUrl,QueryHJCondition queryHJCondition) throws Exception;
	public QueryClueByIdResponse getClueInfoByResourceGuid(String serverUrl,QueryClueCondition queryClueCondition) throws Exception;
	//public CommonResponse addDistributeTask(String serverUrl,String resourceGuid,String folderId,String userId,String userName,String columnId,String columnName) throws Exception;
}
