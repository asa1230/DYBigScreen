package com.dayang.newmedia.newscommand.db.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
* @author huyulong 
* @version 创建时间：2017年2月27日 上午11:45:31
* 类说明  厚建任务Modal
*/
public class TaskModel {

	private String rwTitle;				//任务标题
	private String rwUserNmae;			//任务负责人名称
	private Integer rwStatus;			//任务状态值(1:待处理,2:进行中,3:待审核,4:已完成)
	private String rwStatusShow;		//任务状态说明
	
	 @ApiModelProperty(value = "任务标题")
	  @JsonProperty("rwTitle")
	public String getRwTitle() {
		return rwTitle;
	}
	public void setRwTitle(String rwTitle) {
		this.rwTitle = rwTitle;
	}
	
	@ApiModelProperty(value = "任务执行人")
	  @JsonProperty("rwUserNmae")
	public String getRwUserNmae() {
		return rwUserNmae;
	}
	public void setRwUserNmae(String rwUserNmae) {
		this.rwUserNmae = rwUserNmae;
	}
	
	@ApiModelProperty(value = "任务状态")
	  @JsonProperty("rwStatus")
	public Integer getRwStatus() {
		return rwStatus;
	}
	public void setRwStatus(Integer rwStatus) {
		this.rwStatus = rwStatus;
	}
	@ApiModelProperty(value = "任务状态展示名称")
	  @JsonProperty("rwStatusShow")
	public String getRwStatusShow() {
		return rwStatusShow;
	}
	public void setRwStatusShow(String rwStatusShow) {
		this.rwStatusShow = rwStatusShow;
	}
	
	
	
}