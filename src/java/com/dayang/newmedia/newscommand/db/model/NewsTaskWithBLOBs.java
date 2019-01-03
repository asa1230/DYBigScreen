package com.dayang.newmedia.newscommand.db.model;

public class NewsTaskWithBLOBs extends NewsTask {
    private String taskcontent;

    private String contentrtf2;

    private String mappingrequirement;

    public String getTaskcontent() {
        return taskcontent;
    }

    public void setTaskcontent(String taskcontent) {
        this.taskcontent = taskcontent == null ? null : taskcontent.trim();
    }

    public String getContentrtf2() {
        return contentrtf2;
    }

    public void setContentrtf2(String contentrtf2) {
        this.contentrtf2 = contentrtf2 == null ? null : contentrtf2.trim();
    }

    public String getMappingrequirement() {
        return mappingrequirement;
    }

    public void setMappingrequirement(String mappingrequirement) {
        this.mappingrequirement = mappingrequirement == null ? null : mappingrequirement.trim();
    }
}