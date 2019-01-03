package com.dayang.newmedia.newscommand.db.model.enums;

/**
 * 任务选题状态枚举值
 * @author luomeng
 *
 */
public enum XUANTISTATES {
	// 保存
	SAVE(8,"保存"),
	// 未指派
	UNASSIGNED(104,"未指派"),
	// 进行中
	ONGOING(0,"进行中"),
	// 完成
	FINISH(1,"已完成"),
	// 终止
	STOP(2,"终止");
	
	private Integer xuanTiState;
	private String stateContent;
	
	private XUANTISTATES(Integer xuanTiState,String stateContent) {
		this.xuanTiState = xuanTiState;
		this.stateContent = stateContent;
	}

	public Integer getXuanTiState() {
		return xuanTiState;
	}

	public void setXuanTiState(Integer xuanTiState) {
		this.xuanTiState = xuanTiState;
	}

	public String getStateContent() {
		return stateContent;
	}

	public void setStateContent(String stateContent) {
		this.stateContent = stateContent;
	}
	
}
