package com.glf.mobile.mobilews.model.entity;

import com.glf.mobile.mobilews.model.base.BaseEntity;

public class Document{
    private Long id;
    private String desc;
    private String descEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }
}
