package com.dayang.newmedia.newscommand.db.model.enums;

public enum BAOTISTATUS {
    SAVE(8),
    SUBMIT(101),
    PARTIAL_USE(102),
    ALL_USE(103) ;
    private int baotiStatus ;
    private BAOTISTATUS(int status){
        baotiStatus = status ;
    }
    public int getBaotiStatus() {
        return baotiStatus;
    }
    public void setBaotiStatus(int baotiStatus) {
        this.baotiStatus = baotiStatus;
    }
}
