package com.qst.medical.domain;

import com.qst.medical.domain.superdomain.SuperDomain;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class Doctor extends SuperDomain {

    private Long id; //医师id

    @NotBlank(message = "姓名不能为空")
    @Pattern(regexp = "(^[\u2E80-\u9FFF]{2,4})", message = "姓名只能为汉字,且长度为2-4个汉字")
    private String name; //医师姓名

    @Range(min = 1, max = 130, message = "年龄格式错误")
    @NotNull(message = "年龄不能为空")
    private Integer age; //年龄

    @Range(min = 1, max = 2, message = "性别错误，1代表男，2代表女")
    @NotNull(message = "性别不能为空")
    private Integer sex; //性别：1男，2女

    @NotNull(message = "等级不能为空")
    private Integer levelId; //等级：1主任，2普通

    @NotBlank(message = "手机号不能为空")
    @Length(min = 11, max = 11, message = "手机号格式不正确")
    private String phoneNumber; //电话号

    @NotNull(message = "级别不能为空")
    private Long typeId; //诊治类别id

    private Date createTime; //创建时间
    private Date updateTime; //更新时间
    private Long accountId; //账号id

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
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

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
