package com.dayang.newmedia.newscommand.db.model;

import java.util.List;

public class TaskSearchPara {

	private int start;                     //分页查询的起始位置
	private int limit;						//每页条数
    private int end;                       //分页查询的结束位置
    private String sortColumn;				//排序字段
    private String direction;				//排序方式
    
    private List<String> columnList;		//栏目名称集合
    private String creater;					//创建人
    private String inPeople;				//参与人
    private String chargetMan;				//负责人
    private List<Integer> taskStateList;	//任务类型
    private List<Integer> xuanTiStateList;	//选题状态
    private Integer queryModel;
    private List<String> aXuanTiGuids;      //选题主键集合
    private String searchContent ;          //搜索内容
    private String taskTitle ;              //标题
    private String taskContent ;            //内容
    
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getSortColumn() {
		return sortColumn;
	}
	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public List<String> getColumnList() {
		return columnList;
	}
	public void setColumnList(List<String> columnList) {
		this.columnList = columnList;
	}
	public String getInPeople() {
		return inPeople;
	}
	public void setInPeople(String inPeople) {
		this.inPeople = inPeople;
	}
	public String getChargetMan() {
		return chargetMan;
	}
	public void setChargetMan(String chargetMan) {
		this.chargetMan = chargetMan;
	}
	public List<Integer> getTaskStateList() {
		return taskStateList;
	}
	public void setTaskStateList(List<Integer> taskStateList) {
		this.taskStateList = taskStateList;
	}
	public List<Integer> getXuanTiStateList() {
		return xuanTiStateList;
	}
	public void setXuanTiStateList(List<Integer> xuanTiStateList) {
		this.xuanTiStateList = xuanTiStateList;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public Integer getQueryModel() {
		return queryModel;
	}
	public void setQueryModel(Integer queryModel) {
		this.queryModel = queryModel;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
    public List<String> getaXuanTiGuids() {
        return aXuanTiGuids;
    }
    public void setaXuanTiGuids(List<String> aXuanTiGuids) {
        this.aXuanTiGuids = aXuanTiGuids;
    }
    public String getSearchContent() {
        return searchContent;
    }
    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }
	public String getTaskTitle() {
		return taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public String getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}
	
}

