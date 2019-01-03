package com.dayang.newmedia.newscommand.ws.client.clueclient.impl.HJClue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.ws.client.clueclient.ClueClient;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.HJResourceClient;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.FindResourceByIdResponse;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.FindResourceResponse;
import com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.Resource;
import com.dayang.newmedia.newscommand.ws.commandapp.model.AttachFile;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Clue;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueByIdResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryHJCondition;

/**
 * 汇聚线索操作
 * @author luomeng
 *
 */
public class HJClueClientImpl implements ClueClient{

	/**
	 * 获取汇聚线索
	 * @author luomeng
	 */
	@Override
	public QueryClueResponse getClueList(String serverUrl, QueryHJCondition queryHJCondition) throws Exception {
		// 调用汇聚的标准查询接口
		FindResourceResponse findResourceResponse = HJResourceClient.getHJResouceList(serverUrl, 
																	queryHJCondition.getSearchContent(), 
																	queryHJCondition.getResourceOriginType(),
																	queryHJCondition.getStartTime(), 
																	queryHJCondition.getEndTime(), 
																	queryHJCondition.getStart(), 
																	queryHJCondition.getLimit());
		
		List<Clue> clues = getClueListByHJResourcList(findResourceResponse.getRecords());
		QueryClueResponse queryClueResponse = new QueryClueResponse();
		queryClueResponse.setCurrentPage(findResourceResponse.getCurrentPage());
		queryClueResponse.setLimit(findResourceResponse.getLimit());
		queryClueResponse.setTotalCount(findResourceResponse.getTotalCount());
		queryClueResponse.setRecords(clues);
		queryClueResponse.setCommonResponse(CommonServiceUtil.getCommonResponseSuccess(""));
		return queryClueResponse;
	}

	/**
	 * 根据资源ID获取汇聚线索详情
	 * @author luomeng
	 */
	@Override
	public QueryClueByIdResponse getClueInfoByResourceGuid(String serverUrl, QueryClueCondition queryClueCondition) throws Exception {
		// 调用汇聚的标准查询资源详情
		FindResourceByIdResponse findResourceByIdResponse = HJResourceClient.getHJResourceById(serverUrl, 
																			queryClueCondition.getResourceGuid());
		if (!findResourceByIdResponse.getCommonResponse().getSuccess()) {
			throw new Exception(findResourceByIdResponse
					.getCommonResponse()
					.getErrorDesc());
		}
		Clue clue = getClueByHJResource(findResourceByIdResponse.getResource());
		QueryClueByIdResponse queryClueByIdResponse = new QueryClueByIdResponse();
		queryClueByIdResponse.setCommonResponse(CommonServiceUtil.getCommonResponseSuccess(""));
		queryClueByIdResponse.setResourceInfo(clue);
		return queryClueByIdResponse;
	}
	
	/**
	 * 将汇聚资源转化成指挥调度大屏所需要的资源
	 * @param records
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	private List<Clue> getClueListByHJResourcList(List<Resource> records) throws Exception {
		List<Clue> clueList = new ArrayList<>();
		for (Resource resource : records) {
			Clue clue = getClueByHJResource(resource);
			clueList.add(clue);
		}
		return clueList;
	}
	
	/**
	 * 将汇聚资源转化成指挥调度大屏所需要的资源
	 * @param resource
	 * @return
	 * @throws Exception
	 * @author luomeng
	 */
	private Clue getClueByHJResource(Resource resource) throws Exception{
		if (resource==null) {
			throw new Exception("请求参数异常!");
		}
		Clue clue = new Clue();
		clue.setAuthor(resource.getAuthor());
		clue.setResourceIcon(resource.getResourceIcon());
		clue.setResourceId(resource.getResourceId());
		clue.setResourceOriginAddress(resource.getResourceOriginAddress());
		clue.setResourceOriginTypeName(resource.getResourceOriginTypeName());
		
		// 将日期处理
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat simple2 = new SimpleDateFormat("MM-dd HH:mm");
		Date date = new Date();
		String createdTime = resource.getCreatedTime();
		if (StringUtils.isNotEmpty(createdTime)) {
			date = simple.parse(createdTime);
		}
		String created = simple2.format(date);
		clue.setCreatedTime(created);
		
		// 处理附件信息
		List<com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.AttachFile> hJAttachFileList = resource.getAttachFiles();
		Boolean isHasImg = false;//是否有一个图片附件
		if (StringUtils.listIsNotEmpty(hJAttachFileList)) {
			List<AttachFile> attachFiles = getAttachFileByHJAttachFile(hJAttachFileList);
			clue.setAttachFiles(attachFiles);
			//第一个图片附件URL
			for (AttachFile file : attachFiles) {
				if(file.getFileType() == 4){
					clue.setAttachFileOne(file.getFilePath());
					isHasImg = true;
					break;
				}
			}
		}
		
		String title = resource.getTitle();
		if(StringUtils.isNotEmpty(title)){
			title = StringUtils.replaceBlank(title);
			title = StringUtils.subString(title, isHasImg ? 15 : 20, "...");
		}
		clue.setTitle(title);
		
		String content = resource.getContent();
		if(StringUtils.isNotEmpty(content)){
			content = StringUtils.replaceBlank(content);
			content = StringUtils.subString(content, isHasImg ? 45 : 62, "......");
		}
		clue.setContent(content);
		
		return clue;
	}
	
	/**
	 * 将汇聚附件转化成指挥调度APP所需要的附件类型
	 * @param attachFiles
	 * @return
	 * @author luomeng
	 */
	private List<AttachFile> getAttachFileByHJAttachFile(List<com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.AttachFile> attachFiles){
		List<AttachFile> attachFileList = new ArrayList<>();
		if (StringUtils.listIsNotEmpty(attachFiles)) {
			for (com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.AttachFile hJAttachFile : attachFiles) {
				AttachFile attachFile = getAttachFileByHJAttachFile(hJAttachFile);
				attachFileList.add(attachFile);
			}
		}
		return attachFileList;
	}
	
	/**
	 * 将汇聚附加转化成指挥调度APP所需要的附件类型
	 * @param hjAttachFile
	 * @return
	 * @author luomeng
	 */
	private AttachFile getAttachFileByHJAttachFile(com.dayang.newmedia.newscommand.ws.client.huijuclient.schema.AttachFile hjAttachFile){
		AttachFile attachFile = new AttachFile();
		attachFile.setFilePath(hjAttachFile.getFilePath());
		attachFile.setFileType(hjAttachFile.getFileType());
		return attachFile;
	}

}
