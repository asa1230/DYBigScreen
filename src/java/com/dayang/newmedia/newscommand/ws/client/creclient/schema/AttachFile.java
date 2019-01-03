package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.io.Serializable;

public class AttachFile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1440752756578361246L;
	private String filePath;
	private String thumbnailPath;
	private int fileType;
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getThumbnailPath() {
		return thumbnailPath;
	}
	public void setThumbnailPath(String thumbnailPath) {
		this.thumbnailPath = thumbnailPath;
	}
	public int getFileType() {
		return fileType;
	}
	public void setFileType(int fileType) {
		this.fileType = fileType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
