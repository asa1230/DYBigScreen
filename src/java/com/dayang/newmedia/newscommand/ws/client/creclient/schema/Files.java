package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.io.Serializable;

/**
 * 
 * @author Mars
 *资源文件列表
 */

public class Files implements Serializable {
	
	private String fileId;				//资源文件id
	private String fileName;			//资源文件名
	private int fileType;				//资源文件类型，具体如下：0：标清；1：单声道；2：低码率（可同时表示视音频，图片和文档的低码文件）；3：服务器；4：关键帧；5：高清； 6：立体声；7：图文（废弃）；8：Zxcel2k；9：IMAGE；10：肖像；11：字幕；12：文档；100：其它(其他附件)
	private long fileSize;				//资源文件大小，以字节为单位
	private String fileSizeDisplay;		//文件大小格式化
	private String md5Code;				//文件md5码
	private String streamMediaInfo;		//视音频参数，视音频文件必填
	private String uncPath;				//资源文件的unc路径
	private String streamMediaPath;		//资源文件的流媒体路径
	private String ftpPath;				//资源文件的ftp路径
	private int bitrateType;
	private int channelIndex;			//资源文件的声道号，单声道音频文件必填。
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
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileSizeDisplay() {
		return fileSizeDisplay;
	}
	public void setFileSizeDisplay(String fileSizeDisplay) {
		this.fileSizeDisplay = fileSizeDisplay;
	}
	public String getMd5Code() {
		return md5Code;
	}
	public void setMd5Code(String md5Code) {
		this.md5Code = md5Code;
	}
	public String getStreamMediaInfo() {
		return streamMediaInfo;
	}
	public void setStreamMediaInfo(String streamMediaInfo) {
		this.streamMediaInfo = streamMediaInfo;
	}
	public String getUncPath() {
		return uncPath;
	}
	public void setUncPath(String uncPath) {
		this.uncPath = uncPath;
	}
	public String getStreamMediaPath() {
		return streamMediaPath;
	}
	public void setStreamMediaPath(String streamMediaPath) {
		this.streamMediaPath = streamMediaPath;
	}
	public String getFtpPath() {
		return ftpPath;
	}
	public void setFtpPath(String ftpPath) {
		this.ftpPath = ftpPath;
	}
	public int getBitrateType() {
		return bitrateType;
	}
	public void setBitrateType(int bitrateType) {
		this.bitrateType = bitrateType;
	}
	public int getChannelIndex() {
		return channelIndex;
	}
	public void setChannelIndex(int channelIndex) {
		this.channelIndex = channelIndex;
	}
	
}
