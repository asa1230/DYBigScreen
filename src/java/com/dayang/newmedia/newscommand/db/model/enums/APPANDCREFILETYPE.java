package com.dayang.newmedia.newscommand.db.model.enums;

public enum APPANDCREFILETYPE {
	// 1=视频，2=音频，4=图片，8=文档，128=其他
	// 标清
	SD(0,1),
	// 单声道
	SINGLECHANNEL(1,2),
	// 低码率
	LOWBITRATE(2,128),
	// 服务器
	THESERVER(3,128),
	// 关键帧
	THEKEYFRAME(4,4),
	// 高清
	HIGHDEFINITION(5,1),
	// 立体声
	STEREO(6,2),
	// 2k
	TWOK(8,1),
	// IMAGE
	IMAGE(9,4),
	// 肖像
	HEADICON(10,4),
	// 字幕
	SUBTITLE(11,128),
	// 文档
	DOCUMENT(12,8),
	// 其他
	OTHER(100,128);
	private int CREType;
	private int APPType;
	
	private APPANDCREFILETYPE(int CREType,int APPType) {
		this.CREType = CREType;
		this.APPType = APPType;
	}

	public int getCREType() {
		return CREType;
	}

	public void setCREType(int cREType) {
		CREType = cREType;
	}

	public int getAPPType() {
		return APPType;
	}

	public void setAPPType(int aPPType) {
		APPType = aPPType;
	}
	
}
