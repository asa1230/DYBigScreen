package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.dayang.newmedia.common.utils.Constants;



public class PageResult<T> {
	public static final Integer MAX_PAGE_SIZE = 100;// 每页最大记录数限制
	// 总条数
	private int totalCount;
	// 每页记录数
	private Integer pageSize = Constants.PAGESIZE;
	// 总页数
	private int totalPage;
	// 当前页码
	private int page;
	// 展示页码集合
	private Vector<Integer> pageArr = null;
	// 每页数据集合
	private List<T> list = new ArrayList<T>();

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public void setPageSize(Integer pageSize) {
		if (pageSize < 1) {
			pageSize = 1;
		} else if (pageSize > MAX_PAGE_SIZE) {
			pageSize = MAX_PAGE_SIZE;
		}
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		totalPage = totalCount / pageSize;

		if (totalCount % pageSize != 0) {
			totalPage += 1;
		}
		return totalPage;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Vector<Integer> getPageArr() {
		int tota=getTotalPage();
		pageArr = new Vector<Integer>();
		int start = 1;
		if (page >= 10) {
			start = page / 10 * 10;
		}
		int num = start;
		while (!(num > tota || num > start + 10)) {
			pageArr.add(new Integer(num));
			num++;
		}
		return pageArr;
	}

	public Integer getPageSize() {
		return pageSize;
	}
	
	

}
