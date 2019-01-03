package com.dayang.newmedia.newscommand.db.model;

public class Programrating {
    private String ratingid;

    private String ratingcode;

    private String ratingkey;

    private Integer orderby;

    private String ratingvalue;

    public String getRatingid() {
        return ratingid;
    }

    public void setRatingid(String ratingid) {
        this.ratingid = ratingid == null ? null : ratingid.trim();
    }

    public String getRatingcode() {
        return ratingcode;
    }

    public void setRatingcode(String ratingcode) {
        this.ratingcode = ratingcode == null ? null : ratingcode.trim();
    }

    public String getRatingkey() {
        return ratingkey;
    }

    public void setRatingkey(String ratingkey) {
        this.ratingkey = ratingkey == null ? null : ratingkey.trim();
    }

    public Integer getOrderby() {
        return orderby;
    }

    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    public String getRatingvalue() {
        return ratingvalue;
    }

    public void setRatingvalue(String ratingvalue) {
        this.ratingvalue = ratingvalue == null ? null : ratingvalue.trim();
    }
}