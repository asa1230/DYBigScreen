package com.dayang.newmedia.newscommand.db.model.enums;

public enum ISDOWNLOADFILE {
	// 下载
	YES(0),
	// 不下载
	NO(1);
	
	private Integer isDownLoad;
	
	private ISDOWNLOADFILE(Integer isDownLoad) {
		this.isDownLoad = isDownLoad;
	}

	public Integer getIsDownLoad() {
		return isDownLoad;
	}

	public void setIsDownLoad(Integer isDownLoad) {
		this.isDownLoad = isDownLoad;
	}
	
	
}
