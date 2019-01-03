package com.dayang.newmedia.newscommand.db.model.enums;

public enum TASKMISSIONSTATUS {
   //未领用
    UNUSED(0),
    //进行中
    PROCESSING(2),
    //完成
    COMPLETED(3),
    //终止
    TERMINATE(9);
    
    private Integer missionStatus;
    
    private TASKMISSIONSTATUS(Integer missionStatus) {
        this.setMissionStatus(missionStatus);
    }

    public Integer getMissionStatus() {
        return missionStatus;
    }

    public void setMissionStatus(Integer missionStatus) {
        this.missionStatus = missionStatus;
    }

  

}
