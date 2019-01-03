package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.io.Serializable;
import java.util.List;

public class SubscriberWarper implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4495834248184643440L;
	
	private List<SubscriberInfo> subscriberInfolist;
	
	public SubscriberWarper(List<SubscriberInfo> subscriberInfolist) {
		this.subscriberInfolist = subscriberInfolist;
	}

	public void setSubscriberInfolist(List<SubscriberInfo> subscriberInfolist) {
		this.subscriberInfolist = subscriberInfolist;
	}

	public List<SubscriberInfo> getSubscriberInfolist() {
		return subscriberInfolist;
	}

}
