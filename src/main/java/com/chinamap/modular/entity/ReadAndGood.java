package com.chinamap.modular.entity;

import java.util.Date;

public class ReadAndGood {
    private Long id;

    private Date time;

    private Long reader;

    private Long good;

    private String articleid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getReader() {
        return reader;
    }

    public void setReader(Long reader) {
        this.reader = reader;
    }

    public Long getGood() {
        return good;
    }

    public void setGood(Long good) {
        this.good = good;
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid == null ? null : articleid.trim();
    }
}