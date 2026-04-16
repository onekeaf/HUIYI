package com.qst.medical.domain;

import com.qst.medical.domain.superdomain.SuperDomain;

import java.util.Date;

public class Sale extends SuperDomain {

    private Long saleId; //药店id
    private String saleName; //药店名
    private String salePhone; //药店电话
    private Date createtime; //创建时间
    private Date updatetime; //修改时间

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getSalePhone() {
        return salePhone;
    }

    public void setSalePhone(String salePhone) {
        this.salePhone = salePhone;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
