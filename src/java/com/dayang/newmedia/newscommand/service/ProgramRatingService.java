package com.dayang.newmedia.newscommand.service;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.dayang.newmedia.newscommand.db.dao.ProgramratingMapper;
import com.dayang.newmedia.newscommand.db.model.Programrating;
import com.dayang.newmedia.newscommand.db.model.ProgramratingQuery;

@Service("programRatingService")
public class ProgramRatingService  extends BaseService {
	
	@Autowired
	public ProgramratingMapper programratingMapper;
	
	public List<Programrating> getListProgramrating(String strRatingCode ){
		List<Programrating>   listProgramrating = programratingMapper.listProgramrating(strRatingCode);
		return listProgramrating;
	}
	
	
	public List<Programrating> queryAllProgramRating(){
		ProgramratingQuery query = new ProgramratingQuery();
		List<Programrating> list = programratingMapper.selectByExample(query);
		return list;
	}
	
	public void addOrUpdateProgramRating(Programrating programRating){
		
		if(StringUtils.isEmpty(programRating.getRatingid())){
			programRating.setRatingid(UUID.randomUUID().toString());
			programratingMapper.insert(programRating);
		}else{
			programratingMapper.updateByPrimaryKey(programRating);
		}
	}
	
	public void deleteProgramRating(String pid){
		
		if(StringUtils.isEmpty(pid)){
			throw new RuntimeException("待删除的id为空，请联系管理员！");
		}
		
		programratingMapper.deleteByPrimaryKey(pid);
	}
	
	@Transactional
	public void deleteProgramRatingBatch(List<String> pids){
		if(pids == null || pids.size() == 0){
			return ;
		}
		Iterator<String> it = pids.iterator();
		while(it.hasNext()){
			String id = it.next();
			deleteProgramRating(id);
		}
	}
}
