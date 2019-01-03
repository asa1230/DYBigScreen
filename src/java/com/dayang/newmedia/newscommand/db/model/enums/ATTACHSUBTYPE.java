package com.dayang.newmedia.newscommand.db.model.enums;

public enum ATTACHSUBTYPE {
	//资源子类型：0：无子类型；1：集合类-电视剧集；2：集合类-CD；3：集合类-图集；100：微博/微信/网页等–仅文字；101：微博/微信/网页等–带视音频文件；102：微博/微信/网页等–带图片
	// 1=视频，2=音频，4=图片，8=文档，128=其他
	NOTYPE(0,8,"文字"),
	TV(1,1,"视频"),
	CD(2,2,"音频"),
	IMAGE(3,4,"图片"),
	WITHTEXT(100,8,"文字"),
	WITHAUDIOANDVIDEO(101,2,"视频"),
	WITHIMAGE(102,4,"图片");
	
	private Integer CRESubType;
	private Integer attachSubType;
	private String attachSubTypeName;
	
	private ATTACHSUBTYPE(Integer cRESubType, Integer attachSubType, String attachSubTypeName) {
		CRESubType = cRESubType;
		this.attachSubType = attachSubType;
		this.attachSubTypeName = attachSubTypeName;
	}
	public Integer getCRESubType() {
		return CRESubType;
	}
	public void setCRESubType(Integer cRESubType) {
		CRESubType = cRESubType;
	}
	public Integer getAttachSubType() {
		return attachSubType;
	}
	public void setAttachSubType(Integer attachSubType) {
		this.attachSubType = attachSubType;
	}
	public String getAttachSubTypeName() {
		return attachSubTypeName;
	}
	public void setAttachSubTypeName(String attachSubTypeName) {
		this.attachSubTypeName = attachSubTypeName;
	}
	
	
}
