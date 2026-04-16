package com.qst.medical.domain;

import com.qst.medical.domain.superdomain.SuperDomain;

public class TreatType extends SuperDomain {

    private Long id; //诊治类型id
    private String name; //诊治类型名称

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
