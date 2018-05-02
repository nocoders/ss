package com.study.model;

import java.util.Date;

public class Logcount {
    private Integer id;

    private String city;

    private Date date;

    private String protocol;

    private Integer bcpnum;

    private Integer loadrecord;

    private Integer saverecord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    public Integer getBcpnum() {
        return bcpnum;
    }

    public void setBcpnum(Integer bcpnum) {
        this.bcpnum = bcpnum;
    }

    public Integer getLoadrecord() {
        return loadrecord;
    }

    public void setLoadrecord(Integer loadrecord) {
        this.loadrecord = loadrecord;
    }

    public Integer getSaverecord() {
        return saverecord;
    }

    public void setSaverecord(Integer saverecord) {
        this.saverecord = saverecord;
    }
}