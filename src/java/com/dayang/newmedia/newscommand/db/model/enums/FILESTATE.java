package com.dayang.newmedia.newscommand.db.model.enums;

public enum FILESTATE {
	PROCESSING(1),
	COMPLETED(2);
	private int fileState;
	private FILESTATE(int fileState) {
		this.fileState = fileState;
	}
	public int getFileState() {
		return fileState;
	}
	public void setFileState(int fileState) {
		this.fileState = fileState;
	}
}
