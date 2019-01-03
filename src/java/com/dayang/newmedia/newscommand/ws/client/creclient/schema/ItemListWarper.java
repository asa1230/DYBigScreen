package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.io.Serializable;
import java.util.List;

public class ItemListWarper implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1514096047680921225L;

	private CommonResponse commonResponse;
	private List<ItemList> itemList;
	private int totalCount;
	private int start;
	private int limit;
	private int currentPage;
	private int totalPage;
	private long useTime;
	public CommonResponse getCommonResponse() {
		return commonResponse;
	}
	public void setCommonResponse(CommonResponse commonResponse) {
		this.commonResponse = commonResponse;
	}
	public List<ItemList> getItemList() {
		return itemList;
	}
	public void setItemList(List<ItemList> itemList) {
		this.itemList = itemList;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public long getUseTime() {
		return useTime;
	}
	public void setUseTime(long useTime) {
		this.useTime = useTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
