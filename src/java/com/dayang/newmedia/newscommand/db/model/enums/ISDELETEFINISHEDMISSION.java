package com.dayang.newmedia.newscommand.db.model.enums;

public enum ISDELETEFINISHEDMISSION {
	NOTDELETE(1),
	DEELTE(0);
	
	private Integer isDelete;

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	private ISDELETEFINISHEDMISSION(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	
}
