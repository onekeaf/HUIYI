package com.qst.medical.domain;

import com.qst.medical.domain.superdomain.SuperDomain;

import javax.validation.constraints.Pattern;

public class MedicalPolicy extends SuperDomain {

    @Pattern(regexp = "(^[0-9]*)", message = "编号只能为数字")
    private Long id; //政策id
    private String title; //政策标题
    private String message; //政策消息
    private Long cityId; //政策的对应城市
    private String createTime; //创建时间
    private String updateTime; //更新时间兼发布时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
