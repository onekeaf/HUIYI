package com.qst.medical.model;

public class AccountInfoModel {

    private String realname;
    private String utype;

    public AccountInfoModel() {
    }

    public AccountInfoModel(String realname, String utype) {
        this.realname = realname;
        this.utype = utype;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }
}
