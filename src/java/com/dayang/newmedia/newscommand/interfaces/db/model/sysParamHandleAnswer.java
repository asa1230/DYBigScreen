package com.dayang.newmedia.newscommand.interfaces.db.model;

public class sysParamHandleAnswer {
	
    private int    state;                       //处理结果，0为成功，其他为失败
	private String todaySelectSwiperFrequcy;    //今日选题的页面切换动画频率，秒为单位
	
	public sysParamHandleAnswer() {
		super();
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getTodaySelectSwiperFrequcy() {
		return todaySelectSwiperFrequcy;
	}

	public void setTodaySelectSwiperFrequcy(String todaySelectSwiperFrequcy) {
		this.todaySelectSwiperFrequcy = todaySelectSwiperFrequcy;
	}

}
