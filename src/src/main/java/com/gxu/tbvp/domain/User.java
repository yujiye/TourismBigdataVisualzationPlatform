package com.gxu.tbvp.domain;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * 用户旅客id
     */
    @Id
    private Integer id;

    @Column(name = "addressId")
    private Integer addressid;

    /**
     * 用户名
     */
    private String username;

    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 注册时间
     */
    @Column(name = "register_time")
    private Date registerTime;

    /**
     * 用户最近访问时间
     */
    @Column(name = "last_time")
    private Date lastTime;

    /**
     * 0男，1女
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 身份证信息
     */
    @Column(name = "idCard")
    private String idcard;

    /**
     * 账户是否能用
     */
    private Integer enable;

    /**
     * 获取用户旅客id
     *
     * @return id - 用户旅客id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户旅客id
     *
     * @param id 用户旅客id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return addressId
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * @param addressid
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取电话号码
     *
     * @return phone - 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话号码
     *
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取注册时间
     *
     * @return register_time - 注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置注册时间
     *
     * @param registerTime 注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取用户最近访问时间
     *
     * @return last_time - 用户最近访问时间
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * 设置用户最近访问时间
     *
     * @param lastTime 用户最近访问时间
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * 获取0男，1女
     *
     * @return sex - 0男，1女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置0男，1女
     *
     * @param sex 0男，1女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取身份证信息
     *
     * @return idCard - 身份证信息
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证信息
     *
     * @param idcard 身份证信息
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取账户是否能用
     *
     * @return enable - 账户是否能用
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * 设置账户是否能用
     *
     * @param enable 账户是否能用
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}