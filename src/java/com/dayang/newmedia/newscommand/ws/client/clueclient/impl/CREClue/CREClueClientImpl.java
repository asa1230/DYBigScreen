package com.dayang.newmedia.newscommand.ws.client.clueclient.impl.CREClue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.common.utils.TimeAgo;
import com.dayang.newmedia.newscommand.db.model.enums.APPANDCREFILETYPE;
import com.dayang.newmedia.newscommand.db.model.enums.ATTACHSUBTYPE;
import com.dayang.newmedia.newscommand.ws.client.clueclient.ClueClient;
import com.dayang.newmedia.newscommand.ws.client.creclient.CREResourceClient;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ExtendAttributes;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.Files;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ItemList;
import com.dayang.newmedia.newscommand.ws.client.creclient.schema.ItemListWarper;
import com.dayang.newmedia.newscommand.ws.commandapp.model.AttachFile;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Clue;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueByIdResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryHJCondition;
/**
 * CRE线索操作
 * @author huyulong
 *
 */
public class CREClueClientImpl implements ClueClient{
	
	public static Logger log = Logger.getLogger(CREClueClientImpl.class); 
	
	
	/**
	 * 根据资源ID查询CRE线索详情
	 * @author huyulong
	 */
	@Override
	public QueryClueByIdResponse getClueInfoByResourceGuid(String serverUrl,QueryClueCondition queryClueCondition) throws Exception {
		log.debug("-------------begin getClueInfoByResourceGuid----------------");
		ItemListWarper itemListWarper = CREResourceClient.getCREResourceById(serverUrl, queryClueCondition.getResourceGuid());
		List<ItemList> itemLists = itemListWarper.getItemList();
		Clue clue = null;
		if (itemListWarper!=null && StringUtils.listIsNotEmpty(itemLists)) {
			clue = getClueByCREResouce(itemLists.get(0));
		}
		QueryClueByIdResponse queryClueByIdResponse = new QueryClueByIdResponse();
		queryClueByIdResponse.setResourceInfo(clue);
		queryClueByIdResponse.setCommonResponse(CommonServiceUtil.getCommonResponseSuccess(""));
		return queryClueByIdResponse;
	}

	/**
	 * 将CRE的资源格式转化成指挥调度APP所需要的格式
	 * @param itemLists
	 * @return
	 * @throws Exception
	 */
	public List<Clue> getClueListByCREResourcList(List<ItemList> itemLists) throws Exception{
		List<Clue> clues = new ArrayList<>();
		for (ItemList itemList : itemLists) {
			Clue clue = getClueByCREResouce(itemList);
			clues.add(clue);
		}
		return clues;
	}
	
	/**
	 * 将CRE的资源格式转化成指挥调度APP所需要的格式
	 * @param itemList
	 * @return
	 * @throws Exception
	 */
	public Clue getClueByCREResouce(ItemList itemList) throws Exception{
		
		if (itemList==null) {
			throw new Exception("请求参数异常!");
		}
		Clue clue = new Clue();
		clue.setResourceId(itemList.getId());
		clue.setAuthor(itemList.getOwner());
		String content = itemList.getContent();
		if (StringUtils.isEmpty(content)) {
			List<ExtendAttributes> extendAttributes = itemList.getExtendAttributes();
			if (StringUtils.listIsNotEmpty(extendAttributes)) {
				for (ExtendAttributes extendAttribute : extendAttributes) {
					if (extendAttribute.getId().equals("正文")) {
						content = extendAttribute.getValue();
					}
				}
			}
		}
		clue.setContent(content);
		String title = itemList.getName();
		clue.setTitle(title);
		// 将日期处理
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String createdTime = itemList.getCreated();
		if (StringUtils.isNotEmpty(createdTime)) {
			date = simple.parse(createdTime);
		}
		String created = TimeAgo.newsCommandToDay(date, new Date());
		clue.setCreatedTime(created);
		clue.setResourceIcon(itemList.getIconUrl());
		clue.setResourceOriginTypeName(itemList.getSource());
		
		// attachSubType信息
		Integer subType = itemList.getSubType();
		Integer attachSubType=null;
		String attachSubTypeName = "";
		for (ATTACHSUBTYPE attachType : ATTACHSUBTYPE.values()) {
			if (subType == attachType.getCRESubType()) {
				attachSubType = attachType.getAttachSubType();
				attachSubTypeName = attachType.getAttachSubTypeName();
				break;
			}
		}
		clue.setAttachSubType(attachSubType+"");
		clue.setAttachSubTypeName(attachSubTypeName);
		// 处理附件信息
		if (StringUtils.listIsNotEmpty(itemList.getFiles())) {
			List<AttachFile> attachFiles = getAttachFilesByCreAttachFileList(itemList.getFiles(),clue);
			clue.setAttachFiles(attachFiles);
		}
		return clue;
	}

	/**
	 * 根据CRE附件获取APP附件
	 * @param fileList
	 * @param clue
	 * @return
	 */
	private List<AttachFile> getAttachFilesByCreAttachFileList(List<Files> fileList, Clue clue) {
		List<AttachFile> attachFileList = new ArrayList<AttachFile>();
		String headerIcon = null;
		for (Files file : fileList) {
			if (file.getFileType() == APPANDCREFILETYPE.HEADICON.getCREType()) {
				String filePath = file.getStreamMediaPath();
				String fileName = file.getFileName();
				headerIcon = StringUtils.combineUrl(filePath, fileName);
			} else {
				AttachFile attachFile = getAttachFileByCreAttachFile(file);
				attachFileList.add(attachFile);
			}
		}
		if (StringUtils.isNotEmpty(headerIcon)) {
			clue.setResourceIcon(headerIcon);
		}
		return attachFileList;
	}
	
	/**
	 * 根据CRE附件获取APP附件
	 * @param file
	 * @return
	 * @author luomeng
	 */
	private AttachFile getAttachFileByCreAttachFile(Files file){
		String streamPath = file.getStreamMediaPath();
		String fileName = file.getFileName();
		String fullFilePath = StringUtils.combineUrl(streamPath, fileName);
		AttachFile attachFile = new AttachFile();
		attachFile.setFilePath(fullFilePath);
		for (APPANDCREFILETYPE aPPAndCreType : APPANDCREFILETYPE.values()) {
			if (file.getFileType() != 10) {
				if (aPPAndCreType.getCREType() == file.getFileType()) {
					attachFile.setFileType(aPPAndCreType.getAPPType());
				}
			}
		}
		return attachFile;
	}

	@Override
	public QueryClueResponse getClueList(String serverUrl, QueryHJCondition queryHJCondition) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
