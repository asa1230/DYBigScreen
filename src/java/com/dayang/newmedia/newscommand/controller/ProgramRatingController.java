package com.dayang.newmedia.newscommand.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dayang.newmedia.newscommand.db.model.Programrating;
import com.dayang.newmedia.newscommand.service.ProgramRatingService;

@Controller
@RequestMapping("/programRating")
public class ProgramRatingController {
	
	private Logger log = LoggerFactory.getLogger(ProgramRatingController.class);
	
	@Autowired
	private ProgramRatingService programRatingService;
	
	@ResponseBody
	@RequestMapping("queryAll")
	public List<Programrating> queryAllProgramRating(){
		List<Programrating> list = programRatingService.queryAllProgramRating();
		return list;
	}
	
	@ResponseBody
	@RequestMapping("addOrUpdate")
	public String addOrUpdateProgramRating(Programrating p){
		programRatingService.addOrUpdateProgramRating(p);
		
		return "操作成功！";
	}
	
	@ResponseBody
	@RequestMapping("delete")
	public String deleteProgramRating(String ids){
		if(StringUtils.isEmpty(ids)){
			return "待删除id为空！";
		}
		String[] idArr = ids.split(",");
		
		programRatingService.deleteProgramRatingBatch(Arrays.asList(idArr));
		return "删除成功！";
	}
	
}
