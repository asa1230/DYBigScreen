package com.dayang.newmedia.newscommand.db.model.enums;

public enum MESSAGEOPERATION {
	ADDBAOTI(0,"提交报题"),
	UPDATEBAOTI(1,"修改报题"),
	DELETEBAOTI(2,"删除报题"),
	ADDXUANTIGROUP(3,"你已加入选题群组"),
	UPDATEXUANTIGROUPCONTENT(4,"修改选题内容"),
	UPDATEXUANTIGROUPADVICE(5,"修改选题报道意见"),
	UPDATEXUANTIGROUPINPEOPLE(6,"修改选题成员"),
	FINISHXUANTIGROUP(7,"完成选题"),
	STOPXUANTIGROUP(8,"终止选题"),
	ADDMISSTION(9,"你有新任务"),
	UPDATEMISSION(10,"修改任务"),
	DELETEMISSION(11,"删除任务"),
	EXECUTEMISSION(12,"执行任务"),
	MISSIONEXECUTE(13,"任务执行"),
	FINISHMISSION(14,"完成任务"),
	MISSIONFINISH(15,"任务完成"),
	STOPMISSION(16,"终止任务"),
	DELETEXUANTIGROUP(17,"删除选题");

	private Integer operaterType;
	private String operation;

	private MESSAGEOPERATION(Integer operaterType,String operation) {
		this.operaterType = operaterType;
		this.operation = operation;
	}
	
	public Integer getOperaterType() {
		return operaterType;
	}


	public void setOperaterType(Integer operaterType) {
		this.operaterType = operaterType;
	}


	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}
