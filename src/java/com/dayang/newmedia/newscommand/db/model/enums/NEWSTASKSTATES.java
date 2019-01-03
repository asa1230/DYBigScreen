package com.dayang.newmedia.newscommand.db.model.enums;

/**
 * 任务类型枚举值
 * @author luomeng
 *
 */
public enum NEWSTASKSTATES {
	// 报题类型
	BAOTI(0),
	// 选题类型
	XUANTI(2),
	// 报题保存状态
	SAVEBAOTI(8);
	
	private Integer taskState;
	
	private NEWSTASKSTATES(Integer taskState) {
		this.taskState = taskState;
	}

	public Integer getTaskState() {
		return taskState;
	}

	public void setTaskState(Integer taskState) {
		this.taskState = taskState;
	}
	
	
}
