package com.dayang.newmedia.newscommand.interfaces.db.model;

import java.util.Arrays;

import org.springframework.stereotype.Component;
/*
 * 用来调用线索云的  大屏查询服务接口  的参数实体类
 * /ws/resource/screen
 */
@Component
public class ClueCloudIterfaceQueryCondition {
	private int resourceMediaType;
	private int start;
	private int limit;
	private String[] locationNames;
	private String[] siteNames;
	public ClueCloudIterfaceQueryCondition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClueCloudIterfaceQueryCondition(int resourceMediaType, int start, int limit, String[] locationNames,
			String[] siteNames) {
		super();
		this.resourceMediaType = resourceMediaType;
		this.start = start;
		this.limit = limit;
		this.locationNames = locationNames;
		this.siteNames = siteNames;
	}
	public ClueCloudIterfaceQueryCondition(int resourceMediaType, int start, int limit) {
		super();
		this.resourceMediaType = resourceMediaType;
		this.start = start;
		this.limit = limit;
	}
	public ClueCloudIterfaceQueryCondition(int resourceMediaType, int start, int limit, String[] siteNames) {
		super();
		this.resourceMediaType = resourceMediaType;
		this.start = start;
		this.limit = limit;
		this.siteNames = siteNames;
	}
	public int getResourceMediaType() {
		return resourceMediaType;
	}
	public void setResourceMediaType(int resourceMediaType) {
		this.resourceMediaType = resourceMediaType;
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
	public String[] getLocationNames() {
		return locationNames;
	}
	public void setLocationNames(String[] locationNames) {
		this.locationNames = locationNames;
	}
	public String[] getSiteNames() {
		return siteNames;
	}
	public void setSiteNames(String[] siteNames) {
		this.siteNames = siteNames;
	}
	@Override
	public String toString() {
		return "ClueCloudIterfaceQueryCondition [resourceMediaType=" + resourceMediaType + ", start=" + start
				+ ", limit=" + limit + ", locationNames=" + Arrays.toString(locationNames) + ", siteNames="
				+ Arrays.toString(siteNames) + "]";
	}
	
}
