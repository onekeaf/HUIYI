package com.qst.medical.param;

import com.qst.medical.domain.Doctor;

public class DoctorParam extends Doctor {

    private String pwd; //新增医师的密码

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
