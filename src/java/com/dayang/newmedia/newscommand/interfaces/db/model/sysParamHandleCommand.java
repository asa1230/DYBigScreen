package com.dayang.newmedia.newscommand.interfaces.db.model;

public class sysParamHandleCommand {
	
	private String handleCommand;     //操作命令，00表示读取后台配置的所有刷新参数
	                                  //      10表示读取后台配置的今日选题页面动画切换频率，秒为单位
	                                  //      11表示修改后台配置的今日选题页面动画切换频率，秒为单位
	                                  //      20表示读取后台配置的稿件生产页面动画切换频率，秒为单位
	                                  //      21表示修改后台配置的稿件生产页面动画切换频率，秒为单位
									  //      30表示读取后台配置的电视稿件页面动画切换频率，秒为单位
    								  //      31表示修改后台配置的电视稿件页面动画切换频率，秒为单位
	
	
	private String todaySelectSwiperFrequcy;    //今日选题的页面切换动画频率，秒为单位
	private String newsSwiperFrequcy;           //稿件生产的页面切换动画频率，秒为单位
	private String tvnewsSwiperFrequcy;         //电视稿件的页面切换动画频率，秒为单位
	
	
	
	public sysParamHandleCommand() {
		super();
	}

	public String getHandleCommand() {
		return handleCommand;
	}

	public void setHandleCommand(String handleCommand) {
		this.handleCommand = handleCommand;
	}
	
	public String getTodaySelectSwiperFrequcy() {
		return todaySelectSwiperFrequcy;
	}

	public void setTodaySelectSwiperFrequcy(String todaySelectSwiperFrequcy) {
		this.todaySelectSwiperFrequcy = todaySelectSwiperFrequcy;
	}

	public String getNewsSwiperFrequcy() {
		return newsSwiperFrequcy;
	}

	public void setNewsSwiperFrequcy(String newsSwiperFrequcy) {
		this.newsSwiperFrequcy = newsSwiperFrequcy;
	}

	public String getTvnewsSwiperFrequcy() {
		return tvnewsSwiperFrequcy;
	}

	public void setTvnewsSwiperFrequcy(String tvnewsSwiperFrequcy) {
		this.tvnewsSwiperFrequcy = tvnewsSwiperFrequcy;
	}

}
