package com.dayang.newmedia.newscommand.db.model.enums;

/**
 * 选题下面的内容类型
 * 0：挂载的资源、1：任务、2：设备
 * @author huyulong
 */
public enum XUANTIGZTYPE {
	//资源
	RESOURCE(0),
	//任务
	MISSION(1),
	//设备
	DEVICE(0);
	
	private Integer type;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	private XUANTIGZTYPE(Integer type) {
		this.type = type;
	}
	
}
