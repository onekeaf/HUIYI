package com.qst.medical.model;

import com.qst.medical.domain.Doctor;

public class DoctorModel extends Doctor {

    private String treatType; //诊治类型
    private String doctorLevel; //医师级别

    public String getTreatType() {
        return treatType;
    }

    public void setTreatType(String treatType) {
        this.treatType = treatType;
    }

    public String getDoctorLevel() {
        return doctorLevel;
    }

    public void setDoctorLevel(String doctorLevel) {
        this.doctorLevel = doctorLevel;
    }
}
