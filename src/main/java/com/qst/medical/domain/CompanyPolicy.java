package com.qst.medical.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qst.medical.domain.superdomain.SuperDomain;

import java.util.Date;

public class CompanyPolicy extends SuperDomain {

    private Long id; //医药公司政策id
    private String title; //医药公司政策标题
    private String message; //医药公司政策内容
    private Long companyId; //医药公司id

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime; //创建时间

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateTime; //发布时间

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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
