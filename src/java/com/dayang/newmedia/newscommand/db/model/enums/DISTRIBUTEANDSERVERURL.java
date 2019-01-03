package com.dayang.newmedia.newscommand.db.model.enums;

import com.dayang.newmedia.common.utils.Constants;

/**
 * 分发
 * @author luomeng
 *
 */
public enum DISTRIBUTEANDSERVERURL {
	// 汇聚分发
	HJDISTRIBUTE(Constants.HUIJU_TYPE,Constants.HJ_DISTRIBUET_URL_TYPE),
	// CRE分发
	CREDISTRIBUET(Constants.CRE_TYPE,Constants.CRE_DISTRIBUET_URL_TYPE);
	
	// 分发类型：huiju 、CRE
	private String resourceType;
	// 服务url类型
	private Integer serviceUrlType;
	
	private DISTRIBUTEANDSERVERURL(String resourceType,Integer serviceUrlType) {
		this.resourceType = resourceType;
		this.serviceUrlType = serviceUrlType;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Integer getServiceUrlType() {
		return serviceUrlType;
	}

	public void setServiceUrlType(Integer serviceUrlType) {
		this.serviceUrlType = serviceUrlType;
	}
	
}
