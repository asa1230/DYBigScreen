package com.dayang.newmedia.newscommand.db.model.enums;

public enum FILEUPLOADTYPE {
	HTTP(0),
	UNC(1),
	FTP(2);
	
	private int filePathType;
	
	private FILEUPLOADTYPE(int filePathType) {
		this.filePathType = filePathType;
	}
	
	public int getFilePathType() {
		return filePathType;
	}
}
