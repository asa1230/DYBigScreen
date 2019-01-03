/**
 * 
 */
package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.io.Serializable;
import java.util.List;

/**
 * @author Mars
 *
 */
public class ItemList implements Serializable {

	private String id;						//资源id
	private String name;					//资源名称（高亮之后的）
	private String originalName;			//资源名称（原始名称，未经高亮处理的）
	private String ccid;					//编目类id
	private int type;					//资源类型：0：视音频资源；1：纯音频资源；2：集合类资源（剧集类，CD集合类，收录资源池等）；3：图片资源；4：文档资源；5：复杂资源； 6：主题资源；7：文件夹资源；8：新闻串联单资源；9：新闻条目资源；10：全媒体稿件资源；11：微信；12：微博；13：短信；14：互联网网页；15：宣传计划；16：新闻线索；100：其他资源
	private int subType;					//资源子类型：0：无子类型；1：集合类-电视剧集；2：集合类-CD；3：集合类-图集；100：微博/微信/网页等–仅文字；101：微博/微信/网页等–带视音频文件；102：微博/微信/网页等–带图片
	private String iconUrl;				//肖像url
	private String parentId;			//父资源id。如无父资源，则该资源为-
	private String rootId;				//根资源id。如自己为根资源，则该字段与id相同
	private Long inpoint;				//入点，单位是帧
	private Long outpoint;				//出点，单位是帧
	private String created;				//创建时间，形如yyyy-MM-dd 24hh:mm:ss格式
	private String lastModify;			//最近修改时间，形如yyyy-MM-dd 24hh:mm:ss格式
	private String mediaId;				//模拟磁带条形码
	private int downloadCounts;		//下载次数
	private int viewCounts;		//浏览次数
	private String securityId;	 //密级id
	private int hasFile;        // 是否包含文件（0：不包含，1：包含）
	private int fileStatus;		//资源文件状态： 0：不存在；1：在线；2：在线+近线；3：近线；4：在线+离线；5：离线
	private int videoStandard;	//制式。1为PAL制，具体制式枚举如下： 0x00000000:Invalid type；0x00000001:PAL video type；0x00000002:NTSC video type；0x00000004:30-frames/second generic type；0x00000008:SECAM video type；0x00000010:HDTV 1920*1080*25 ；0x00000020:HDTV1920*1080*29.97；0x00000040:HDTV 1920*1080*30 ； 0x00000100:HDTV 1280*720*25 ；0x00000200：HDTV 1280*720*24； 0x00000400：HDTV 1280*720*50 ；0x00000800:HDTV 1280*720*59.94；0x00001000:HDTV 1280*720*2997； 0x00002000:HDTV 1920*1080*23.98 ；0x00004000:HDTV 1920*1080*24 ；0x00008000:HDTV 1920*1080*25 ；0x00010000:HDTV 1920*1080*29.97 ；0x00020000:HDTV 1920*1080*30 ；0x00080000:HDTV 1920*1080*23.98 ； 0x00100000:HDTV 1920*1080*24； 0x00200000:HDTV 1920*1080*25； 0x00400000:HDTV 1920*1080*29.97 ；0x00800000:HDTV 1920*1080*30 ；0x02000000:Unknow Size 23.98 ； 0x04000000:Unknow Size 24 type；0x08000000:Unknow Size 25 type；0x10000000:Unknow Size 29.97 ；0x20000000: Unknow Size 30 type
	private String progCode;	//节目代码
	private String source;		//来源
	private int hdFlag;		//高标清标记，仅对视音频资源有意义。0：标清；1：高清
	private int afdType;		//AFD标识，具体如下：0：未知；8： 全画幅；9： 高清：左右两侧加黑边；标清：全画幅（非首选）；10：高清：全画幅（非原始，可能是经过变换的）；标清：上下加黑边；15：高清：全画幅（左右两侧画面是可被裁剪的无用信息）
	private int proType;		//节目素材标识。0：节目；1：素材
	private int publishStatus;	//发布状态。0：未发布；1：已发布
	private String publishTime;	//发布时间，形如yyyy-MM-dd 24hh:mm:ss格式
	private String onlineLifeCycle; //在线生命周期，形如yyyy-MM-dd 24hh:mm:ss格式
	private String seriesId;			//系列资源（集合类资源）ID
	private int seriesIndex;			//系列资源子条目在系列中的位置。从1开始，如果为0，则表示集合类资源的其他子资源（比如片花，海报等），该字段可能用于文件夹资源和主题资源的序号另外，集合类资源本身，该字段也为0
	private String folderId;			//目录id，如果不属于任何目录，则用-表示
	private int point;					//资源评分
	private int reportCount;			//被举报的次数
	private int shareFlag;				//是否共享给其他系统的标志（一般指与其他系统共享存储）。0：未共享；1：已共享
	private String owner;				//拥有者
	private String summary;  			//资源条目检索摘要
	private String content;
	private List<Files> files;
	private List<ExtendAttributes> extendAttributes;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public String getCcid() {
		return ccid;
	}
	public void setCcid(String ccid) {
		this.ccid = ccid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getSubType() {
		return subType;
	}
	public void setSubType(int subType) {
		this.subType = subType;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getRootId() {
		return rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}
	public Long getInpoint() {
		return inpoint;
	}
	public void setInpoint(Long inpoint) {
		this.inpoint = inpoint;
	}
	public Long getOutpoint() {
		return outpoint;
	}
	public void setOutpoint(Long outpoint) {
		this.outpoint = outpoint;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getLastModify() {
		return lastModify;
	}
	public void setLastModify(String lastModify) {
		this.lastModify = lastModify;
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public int getDownloadCounts() {
		return downloadCounts;
	}
	public void setDownloadCounts(int downloadCounts) {
		this.downloadCounts = downloadCounts;
	}
	public int getViewCounts() {
		return viewCounts;
	}
	public void setViewCounts(int viewCounts) {
		this.viewCounts = viewCounts;
	}
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	public int getFileStatus() {
		return fileStatus;
	}
	public void setFileStatus(int fileStatus) {
		this.fileStatus = fileStatus;
	}
	public int getVideoStandard() {
		return videoStandard;
	}
	public void setVideoStandard(int videoStandard) {
		this.videoStandard = videoStandard;
	}
	public String getProgCode() {
		return progCode;
	}
	public void setProgCode(String progCode) {
		this.progCode = progCode;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getHdFlag() {
		return hdFlag;
	}
	public void setHdFlag(int hdFlag) {
		this.hdFlag = hdFlag;
	}
	public int getAfdType() {
		return afdType;
	}
	public void setAfdType(int afdType) {
		this.afdType = afdType;
	}
	public int getProType() {
		return proType;
	}
	public void setProType(int proType) {
		this.proType = proType;
	}
	public int getPublishStatus() {
		return publishStatus;
	}
	public void setPublishStatus(int publishStatus) {
		this.publishStatus = publishStatus;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public String getOnlineLifeCycle() {
		return onlineLifeCycle;
	}
	public void setOnlineLifeCycle(String onlineLifeCycle) {
		this.onlineLifeCycle = onlineLifeCycle;
	}
	public String getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}
	public int getSeriesIndex() {
		return seriesIndex;
	}
	public void setSeriesIndex(int seriesIndex) {
		this.seriesIndex = seriesIndex;
	}
	public String getFolderId() {
		return folderId;
	}
	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getReportCount() {
		return reportCount;
	}
	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}
	public int getShareFlag() {
		return shareFlag;
	}
	public void setShareFlag(int shareFlag) {
		this.shareFlag = shareFlag;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public List<Files> getFiles() {
		return files;
	}
	public void setFiles(List<Files> files) {
		this.files = files;
	}
	public List<ExtendAttributes> getExtendAttributes() {
		return extendAttributes;
	}
	public void setExtendAttributes(List<ExtendAttributes> extendAttributes) {
		this.extendAttributes = extendAttributes;
	}
	public int getHasFile() {
		return hasFile;
	}
	public void setHasFile(int hasFile) {
		this.hasFile = hasFile;
	}
	
}
