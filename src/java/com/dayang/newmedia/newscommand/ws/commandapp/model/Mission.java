package com.dayang.newmedia.newscommand.ws.commandapp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T03:11:18.652Z")
public class Mission {

	private String missionGuid = null;
	private String missionContent = null;
	private String missionCreater = null;
	private String missionChargeMan = null;
	private String missionType = null;
	private String missionTypeName = null;
	private Integer missionState = null;
	private String missionCreateTime = null;
	private String missionFinishTime = null;
	private String taskGuid = null;
	private String taskTitle = null;
	private String taskChangeMan = null;
	private String operaterId;
	
	/**
	 * 任务的GUID
	 **/
	public Mission missionGuid(String missionGuid) {
		this.missionGuid = missionGuid;
		return this;
	}

	@ApiModelProperty(value = "任务的GUID")
	@JsonProperty("missionGuid")
	public String getMissionGuid() {
		return missionGuid;
	}

	public void setMissionGuid(String missionGuid) {
		this.missionGuid = missionGuid;
	}

	/**
	 * 任务内容
	 **/
	public Mission missionContent(String missionContent) {
		this.missionContent = missionContent;
		return this;
	}

	@ApiModelProperty(value = "任务内容")
	@JsonProperty("missionContent")
	public String getMissionContent() {
		return missionContent;
	}

	public void setMissionContent(String missionContent) {
		this.missionContent = missionContent;
	}

	/**
	 * 任务创建人
	 **/
	public Mission missionCreater(String missionCreater) {
		this.missionCreater = missionCreater;
		return this;
	}

	@ApiModelProperty(value = "任务创建人")
	@JsonProperty("missionCreater")
	public String getMissionCreater() {
		return missionCreater;
	}

	public void setMissionCreater(String missionCreater) {
		this.missionCreater = missionCreater;
	}

	/**
	 * 任务负责人
	 **/
	public Mission missionChargeMan(String missionChargeMan) {
		this.missionChargeMan = missionChargeMan;
		return this;
	}

	@ApiModelProperty(value = "任务负责人")
	@JsonProperty("missionChargeMan")
	public String getMissionChargeMan() {
		return missionChargeMan;
	}

	public void setMissionChargeMan(String missionChargeMan) {
		this.missionChargeMan = missionChargeMan;
	}

	/**
	 * 任务类型
	 **/
	public Mission missionType(String missionType) {
		this.missionType = missionType;
		return this;
	}

	@ApiModelProperty(value = "任务类型")
	@JsonProperty("missionType")
	public String getMissionType() {
		return missionType;
	}

	public void setMissionType(String missionType) {
		this.missionType = missionType;
	}

	/**
	 * 任务类型名称
	 **/
	public Mission missionTypeName(String missionTypeName) {
		this.missionTypeName = missionTypeName;
		return this;
	}

	@ApiModelProperty(value = "任务类型名称")
	@JsonProperty("missionTypeName")
	public String getMissionTypeName() {
		return missionTypeName;
	}

	public void setMissionTypeName(String missionTypeName) {
		this.missionTypeName = missionTypeName;
	}

	/**
	 * 任务的状态(0-未领用、2-进行中、3-完成、8-终止)
	 **/
	public Mission missionState(Integer missionState) {
		this.missionState = missionState;
		return this;
	}

	@ApiModelProperty(value = "任务的状态(0-未领用、2-进行中、3-完成、8-终止)")
	@JsonProperty("missionState")
	public Integer getMissionState() {
		return missionState;
	}

	public void setMissionState(Integer missionState) {
		this.missionState = missionState;
	}

	/**
	 * 任务的创建时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）
	 **/
	public Mission missionCreateTime(String missionCreateTime) {
		this.missionCreateTime = missionCreateTime;
		return this;
	}

	@ApiModelProperty(value = "任务的创建时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）")
	@JsonProperty("missionCreateTime")
	public String getMissionCreateTime() {
		return missionCreateTime;
	}

	public void setMissionCreateTime(String missionCreateTime) {
		this.missionCreateTime = missionCreateTime;
	}

	/**
	 * 任务的结束时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）
	 **/
	public Mission missionFinishTime(String missionFinishTime) {
		this.missionFinishTime = missionFinishTime;
		return this;
	}

	@ApiModelProperty(value = "任务的结束时间（1999-05-22 12:11:21，yyyy-MM-dd 24hh:mm:ss）")
	@JsonProperty("missionFinishTime")
	public String getMissionFinishTime() {
		return missionFinishTime;
	}

	public void setMissionFinishTime(String missionFinishTime) {
		this.missionFinishTime = missionFinishTime;
	}

	/**
	 * 关联选题的guid
	 **/
	public Mission taskGuid(String taskGuid) {
		this.taskGuid = taskGuid;
		return this;
	}

	@ApiModelProperty(value = "关联选题的guid")
	@JsonProperty("taskGuid")
	public String getTaskGuid() {
		return taskGuid;
	}

	public void setTaskGuid(String taskGuid) {
		this.taskGuid = taskGuid;
	}

	/**
	 * 关联选题的标题
	 **/
	public Mission taskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
		return this;
	}

	@ApiModelProperty(value = "关联选题的标题")
	@JsonProperty("taskTitle")
	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	/**
	 * 选题负责人
	 **/
	public Mission taskChangeMan(String taskChangeMan) {
		this.taskChangeMan = taskChangeMan;
		return this;
	}

	@ApiModelProperty(value = "选题负责人")
	@JsonProperty("taskChangeMan")
	public String getTaskChangeMan() {
		return taskChangeMan;
	}

	public void setTaskChangeMan(String taskChangeMan) {
		this.taskChangeMan = taskChangeMan;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Mission mission = (Mission) o;
		return Objects.equals(missionGuid, mission.missionGuid)
				&& Objects.equals(missionContent, mission.missionContent)
				&& Objects.equals(missionCreater, mission.missionCreater)
				&& Objects.equals(missionChargeMan, mission.missionChargeMan)
				&& Objects.equals(missionType, mission.missionType)
				&& Objects.equals(missionTypeName, mission.missionTypeName)
				&& Objects.equals(missionState, mission.missionState)
				&& Objects.equals(missionCreateTime, mission.missionCreateTime)
				&& Objects.equals(missionFinishTime, mission.missionFinishTime)
				&& Objects.equals(taskGuid, mission.taskGuid) && Objects.equals(taskTitle, mission.taskTitle)
				&& Objects.equals(taskChangeMan, mission.taskChangeMan);
	}

	@Override
	public int hashCode() {
		return Objects.hash(missionGuid, missionContent, missionCreater, missionChargeMan, missionType, missionTypeName,
				missionState, missionCreateTime, missionFinishTime, taskGuid, taskTitle, taskChangeMan);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Mission {\n");

		sb.append("    missionGuid: ").append(toIndentedString(missionGuid)).append("\n");
		sb.append("    missionContent: ").append(toIndentedString(missionContent)).append("\n");
		sb.append("    missionCreater: ").append(toIndentedString(missionCreater)).append("\n");
		sb.append("    missionChargeMan: ").append(toIndentedString(missionChargeMan)).append("\n");
		sb.append("    missionType: ").append(toIndentedString(missionType)).append("\n");
		sb.append("    missionTypeName: ").append(toIndentedString(missionTypeName)).append("\n");
		sb.append("    missionState: ").append(toIndentedString(missionState)).append("\n");
		sb.append("    missionCreateTime: ").append(toIndentedString(missionCreateTime)).append("\n");
		sb.append("    missionFinishTime: ").append(toIndentedString(missionFinishTime)).append("\n");
		sb.append("    taskGuid: ").append(toIndentedString(taskGuid)).append("\n");
		sb.append("    taskTitle: ").append(toIndentedString(taskTitle)).append("\n");
		sb.append("    taskChangeMan: ").append(toIndentedString(taskChangeMan)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	public String getOperaterId() {
		return operaterId;
	}

	public void setOperaterId(String operaterId) {
		this.operaterId = operaterId;
	}
	
}
