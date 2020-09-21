package com.example.sqlserverdemo.entity;

import java.util.Date;

public class Access {

    private Integer id;

    private String license;

    private Integer accessType;

    private Date time;

    private Integer isE;

    public void setId(Integer id) {this.id = id;}
    public Integer getId() {return id;}

    public void setLicense(String license) {this.license = license;}
    public String getLicense() {return license;}

    public void setAccessType(Integer accessType) {this.accessType = accessType;}
    public Integer getAccessType() {return accessType;}

    public void setTime(Date time) {this.time = time;}
    public Date getTime() {return time;}

    public void setIsE(Integer isE) {this.isE = isE;}
    public Integer getIsE() {return isE;}
}
