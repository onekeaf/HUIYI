package com.qst.medical.domain;

import com.qst.medical.domain.superdomain.SuperDomain;

public class DoctorLevel extends SuperDomain {

    private Long id; //级别id
    private String name; //级别名称

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
