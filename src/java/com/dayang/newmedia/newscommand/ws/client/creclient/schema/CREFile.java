package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

public class CREFile {
	private String fileId;

	private String fileName;

	private int fileType;

	private String md5Code;

	private String ftpPath;

	private String streamMediaPath;

	private String uncPath;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getFileType() {
		return fileType;
	}

	public void setFileType(int fileType) {
		this.fileType = fileType;
	}

	public String getMd5Code() {
		return md5Code;
	}

	public void setMd5Code(String md5Code) {
		this.md5Code = md5Code;
	}

	public String getFtpPath() {
		return ftpPath;
	}

	public void setFtpPath(String ftpPath) {
		this.ftpPath = ftpPath;
	}

	public String getStreamMediaPath() {
		return streamMediaPath;
	}

	public void setStreamMediaPath(String streamMediaPath) {
		this.streamMediaPath = streamMediaPath;
	}

	public String getUncPath() {
		return uncPath;
	}

	public void setUncPath(String uncPath) {
		this.uncPath = uncPath;
	}
	
	
}
