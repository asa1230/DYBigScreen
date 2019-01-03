package com.dayang.newmedia.common.utils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.apache.log4j.Logger;

import net.sf.json.JSONObject;

/**
 * WebSocket 消息发送服务端</br>
 * @ServerEndpoint("/websocket/{pageId}") 客户端可以通过这个URI来连接到WebSocket。
 * @author huyulong
 *
 */
@ServerEndpoint("/websocket/{pageId}")
public class WebSocket {

	public static Logger log = Logger.getLogger(WebSocket.class);


	/**
	 * 静态变量，用来记录当前在线连接数。
	 */
    private static int onlineCount = 0;

    /**
     * concurrent包的线程安全Map,用来存放每个客户端对应的Session,其中Key可以为用户标识
     */
    private static Map<String, Session> clients = new ConcurrentHashMap<>();

    /**
     * 连接建立成功调用的方法
     * @param pageId  客户端标识
     * @param session session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    @OnOpen
    public void onOpen(@PathParam("pageId") String pageId,Session session){
    	//1、将加入的客户端放入Map
    	clients.put(pageId,session);
    	//2、在线数+1
        addOnlineCount();
        log.debug("客户端："+pageId+"开启！当前在线数为" + getOnlineCount());
    }

    /**
     * 连接关闭调用的方法
     * @param pageId 客户端标识
     */
    @OnClose
    public void onClose(@PathParam("pageId") String pageId){
    	//1、将关闭的客户端从Map中删除
    	clients.remove(pageId);  //从set中删除
    	//2、在线数-1
        subOnlineCount();
        log.debug("客户端："+pageId+"关闭！当前在线数为" + getOnlineCount());
    }

    /**
     * 收到客户端消息后调用的方法
     * @param message 客户端发送过来的消息
     * @param pageId 客户端标识
     */
    @OnMessage
    public void onMessage(String message, @PathParam("pageId") String pageId) {
    	log.debug("来自客户端："+pageId+"的消息:" + message);
        try {
        	//如果消息类型是connectUrl 则调用服务获取url返回给客户端
        	JSONObject msgJson = JSONObject.fromObject(message);
        	if(msgJson.getString("type").equals("connectUrl")){
        		String connectUrl = null;
        		connectUrl = CommonServiceUtil.getServerSettingUrlByUtype(31);
        		String returnMsg = "{'type':'connectUrl','connectUrl':'"+connectUrl+"'}";
        		sendMessage(clients.get(pageId),JSONObject.fromObject(returnMsg).toString());
        		log.debug("发送至："+pageId+" 消息:" + returnMsg);
        		log.debug("向地址："+connectUrl+"  发送连接请求");
        	}
        	//pageId是发送消息的控制端标识，pageId_show是和控制端对应的，接受消息的展示端页面的标识
        	String toPageId = pageId+"_show";
        	//如果该客户端已经连接启动，则向展示页面发送消息
        	//因为选题控制页要向两个不同的客户端发送消息，这里需要特殊判断
        	if("selectProgress".equals(pageId)){
        		String toPageId1 = "selectProgress_show";
    			String toPageId2 = "selectDetail_show";
        		if(hasConnection(toPageId1)){
        			sendMessage(clients.get(toPageId1),message);
        		}
        		if(hasConnection(toPageId2)){
        			if(msgJson.getString("type").equals("selectProgress")){
        				String backMsg = "{'type':'selectProgress'}";
        				sendMessage(clients.get(toPageId2),message);
        				Thread.currentThread().sleep(500);
        				sendMessage(clients.get(toPageId1),message);
        			}else{
        				sendMessage(clients.get(toPageId2),message);
        			}
        		}
        	}
        	else if("control_map20".equals(pageId)) {
        		String toPageId1 = "ccbnMap_show";
        		if(hasConnection(toPageId1)){
        			sendMessage(clients.get(toPageId1),message);
        		}
        	}
        	else if("newsprogress".equals(pageId)){
        		String toPageId1 = "newsprogressshow";
        		if(hasConnection(toPageId1)){
        			sendMessage(clients.get(toPageId1),message);
        		}
        	}
        	else if("newslastctrl".equals(pageId)){
        		String toPageId1 = "newslastshow";
        		if(hasConnection(toPageId1)){
        			sendMessage(clients.get(toPageId1),message);
        		}
        	}
        	else if("tvnewsctrl".equals(pageId)){
        		String toPageId1 = "tvnewsprogressshow";
        		if(hasConnection(toPageId1)){
        			sendMessage(clients.get(toPageId1),message);
        		}
        	}        	
        	//统计分析页面一个控制三个页面，特殊处理
        	else if("tj".equals(pageId)){
        		String toPageId1 = "tj_bxt_show";
    			String toPageId2 = "tj_rw_show";
    			String toPageId3 = "tj_sb_show";
    			String toPageId4 = "tj_kpi_show";
        		if(hasConnection(toPageId1)){
        			sendMessage(clients.get(toPageId1),message);
        		}
        		if(hasConnection(toPageId2)){
        			sendMessage(clients.get(toPageId2),message);
        		}
        		if(hasConnection(toPageId3)){
        			sendMessage(clients.get(toPageId3),message);
        		}
        		if(hasConnection(toPageId4)){
        			sendMessage(clients.get(toPageId4),message);
        		}
        	}
        	//系统设置页面控制八个屏刷新，所以需要给所有客户端发送消息
        	else if("setting".equals(pageId)){
        		for (Session value : clients.values()) {
        			sendMessage(value,message);
        		}
        	}
        	//发布效果评估需要控制第7、8屏
        	else if("publish".equals(pageId)){
        		String toPageId1 = "publish_1_show";
    			String toPageId2 = "publish_2_show";
    			if(hasConnection(toPageId1)){
        			sendMessage(clients.get(toPageId1),message);
        		}
        		if(hasConnection(toPageId2)){
        			sendMessage(clients.get(toPageId2),message);
        		}
        	}
        	else if(hasConnection(toPageId)){
        			sendMessage(clients.get(toPageId),message);
        	}
        	log.debug("发送至："+pageId+" 消息:" + message);
		} catch (Exception e) {
			log.debug("---- send message error:",e);
			e.printStackTrace();
		}
    }


    /**
     * 发送消息
     * @param message
     * @throws IOException
     */
    public void sendMessage(Session session,String message) throws IOException{
        session.getBasicRemote().sendText(message);
        log.debug("---- edn send message ------");
    }

    /**
     * 发生错误时调用
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error){
    	log.debug("---- 客户端连接错误：",error);
        error.printStackTrace();
    }


    /**
    * 判断是否有连接
    * @param relationId
    * @return
    */
    public static boolean hasConnection(String pageId) {
    	return clients.containsKey(pageId);
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
    	WebSocket.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
    	WebSocket.onlineCount--;
    }
}