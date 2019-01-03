package com.dayang.newmedia.newscommand.service;

import org.springframework.stereotype.Service;

import com.dayang.newmedia.newscommand.db.model.TaskSearchPara;

@Service
public class BaseService {
	
	//设置分页参数对象
	public void setTaskSearchPara(int page,int pageSize,int totalCount, TaskSearchPara taskInfo){
		int start=(page - 1) * pageSize;
		if(page>1){
			start=start+1;
		}
		int end=start+pageSize;
		if(page>1){
			end=end-1;
		}
		if(end>totalCount){
			end=totalCount;
		}
		taskInfo.setStart(start);
		taskInfo.setEnd(end);
	}
}
