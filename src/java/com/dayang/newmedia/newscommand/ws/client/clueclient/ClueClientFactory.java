package com.dayang.newmedia.newscommand.ws.client.clueclient;

import java.util.HashMap;
import java.util.Map;

import com.dayang.newmedia.newscommand.db.model.enums.CLUETYPEANDSERVERTYPE_ALL;
import com.dayang.newmedia.newscommand.ws.client.clueclient.impl.CREClue.CREClueClientImpl;
import com.dayang.newmedia.newscommand.ws.client.clueclient.impl.HJClue.HJClueClientImpl;

/**
 * 
 * 获取线索客户端
 * @author luomeng
 *
 */
public class ClueClientFactory {
	public static Map<Integer, ClueClient> clueClientMap;

	private static ClueClientFactory  clueClientFactory = null;

	// 单例模式:实例化方法
	public static ClueClientFactory instance() {
		if (clueClientFactory == null) {
			clueClientFactory = new ClueClientFactory();
		}
		return clueClientFactory;
	}

	private ClueClientFactory(){
		clueClientMap = new HashMap<Integer,ClueClient>();
		clueClientMap.put(CLUETYPEANDSERVERTYPE_ALL.HJCLUE.getClueType(), new HJClueClientImpl());
		clueClientMap.put(CLUETYPEANDSERVERTYPE_ALL.CRECLUE.getClueType(), new CREClueClientImpl());
	}

	// 获取导出方法实例
	public static ClueClient getClueClient(Integer clueClient) {
		return clueClientMap.get(clueClient);
	}
}
