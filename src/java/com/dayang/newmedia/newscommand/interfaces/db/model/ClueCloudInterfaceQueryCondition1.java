package com.dayang.newmedia.newscommand.interfaces.db.model;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import net.sf.json.JSONArray;

/*
 * 线索云提供的  获取线索云列表数据接口 的查询条件
 */
@Component
public class ClueCloudInterfaceQueryCondition1 {
	private int page;
	private int pageSize;
	private String[] resourceMediaType;
	private JSONArray[] sortList;
	private String author;
	private String fullTextContent;
	private String ptTimeStart;
	private String ptTimeEnd;
	//空参构造
	public ClueCloudInterfaceQueryCondition1() {
		super();
		// TODO Auto-generated constructor stub
	}
	//有完整参数构造
	public ClueCloudInterfaceQueryCondition1(int page, int pageSize, String[] resourceMediaType, JSONArray[] sortList,
			String author, String fullTextContent, String ptTimeStart, String ptTimeEnd) {
		super();
		this.page = page;
		this.pageSize = pageSize;
		this.resourceMediaType = resourceMediaType;
		this.sortList = sortList;
		this.author = author;
		this.fullTextContent = fullTextContent;
		this.ptTimeStart = ptTimeStart;
		this.ptTimeEnd = ptTimeEnd;
	}
	//非完整参数构造
	public ClueCloudInterfaceQueryCondition1(int page, int pageSize, String[] resourceMediaType, String fullTextContent,
			String ptTimeStart, String ptTimeEnd) {
		super();
		this.page = page;
		this.pageSize = pageSize;
		this.resourceMediaType = resourceMediaType;
		this.fullTextContent = fullTextContent;
		this.ptTimeStart = ptTimeStart;
		this.ptTimeEnd = ptTimeEnd;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String[] getResourceMediaType() {
		return resourceMediaType;
	}
	public void setResourceMediaType(String[] resourceMediaType) {
		this.resourceMediaType = resourceMediaType;
	}
	public JSONArray[] getSortList() {
		return sortList;
	}
	public void setSortList(JSONArray[] sortList) {
		this.sortList = sortList;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getFullTextContent() {
		return fullTextContent;
	}
	public void setFullTextContent(String fullTextContent) {
		this.fullTextContent = fullTextContent;
	}
	public String getPtTimeStart() {
		return ptTimeStart;
	}
	public void setPtTimeStart(String ptTimeStart) {
		this.ptTimeStart = ptTimeStart;
	}
	public String getPtTimeEnd() {
		return ptTimeEnd;
	}
	public void setPtTimeEnd(String ptTimeEnd) {
		this.ptTimeEnd = ptTimeEnd;
	}
	@Override
	public String toString() {
		return "ClueCloudInterfaceQueryCondition1 [page=" + page + ", pageSize=" + pageSize + ", resourceMediaType="
				+ Arrays.toString(resourceMediaType) + ", sortList=" + Arrays.toString(sortList) + ", author=" + author
				+ ", fullTextContent=" + fullTextContent + ", ptTimeStart=" + ptTimeStart + ", ptTimeEnd=" + ptTimeEnd
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((fullTextContent == null) ? 0 : fullTextContent.hashCode());
		result = prime * result + page;
		result = prime * result + pageSize;
		result = prime * result + ((ptTimeEnd == null) ? 0 : ptTimeEnd.hashCode());
		result = prime * result + ((ptTimeStart == null) ? 0 : ptTimeStart.hashCode());
		result = prime * result + Arrays.hashCode(resourceMediaType);
		result = prime * result + Arrays.hashCode(sortList);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClueCloudInterfaceQueryCondition1 other = (ClueCloudInterfaceQueryCondition1) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (fullTextContent == null) {
			if (other.fullTextContent != null)
				return false;
		} else if (!fullTextContent.equals(other.fullTextContent))
			return false;
		if (page != other.page)
			return false;
		if (pageSize != other.pageSize)
			return false;
		if (ptTimeEnd == null) {
			if (other.ptTimeEnd != null)
				return false;
		} else if (!ptTimeEnd.equals(other.ptTimeEnd))
			return false;
		if (ptTimeStart == null) {
			if (other.ptTimeStart != null)
				return false;
		} else if (!ptTimeStart.equals(other.ptTimeStart))
			return false;
		if (!Arrays.equals(resourceMediaType, other.resourceMediaType))
			return false;
		if (!Arrays.equals(sortList, other.sortList))
			return false;
		return true;
	}
	
}
