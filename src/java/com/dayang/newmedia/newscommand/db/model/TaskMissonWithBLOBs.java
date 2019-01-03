package com.dayang.newmedia.newscommand.db.model;

public class TaskMissonWithBLOBs extends TaskMisson {
    private String mevents;

    private String meventsr;
    
    private NewsTask newsTask;
    
    public String getMevents() {
        return mevents;
    }

    public void setMevents(String mevents) {
        this.mevents = mevents == null ? null : mevents.trim();
    }

    public String getMeventsr() {
        return meventsr;
    }

    public void setMeventsr(String meventsr) {
        this.meventsr = meventsr == null ? null : meventsr.trim();
    }

	public NewsTask getNewsTask() {
		return newsTask;
	}

	public void setNewsTask(NewsTask newsTask) {
		this.newsTask = newsTask;
	}
    
    
}