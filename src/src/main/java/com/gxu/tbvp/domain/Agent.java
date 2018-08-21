package com.gxu.tbvp.domain;

import java.util.Date;
import javax.persistence.*;

public class Agent {
    /**
     * 代理ID
     */
    @Id
    private Integer id;

    /**
     * 代理用户名
     */
    private String username;

    private String password;

    /**
     * 代理姓名
     */
    private String name;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 用户地址
     */
    @Column(name = "addressId")
    private Integer addressid;

    /**
     * 注册时间
     */
    @Column(name = "register_time")
    private Date registerTime;

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
     * 代理地区
     */
    @Column(name = "Place")
    private String place;

    /**
     * 获取代理ID
     *
     * @return id - 代理ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置代理ID
     *
     * @param id 代理ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取代理用户名
     *
     * @return username - 代理用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置代理用户名
     *
     * @param username 代理用户名
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
     * 获取代理姓名
     *
     * @return name - 代理姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置代理姓名
     *
     * @param name 代理姓名
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
     * 获取用户地址
     *
     * @return addressId - 用户地址
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * 设置用户地址
     *
     * @param addressid 用户地址
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
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
     * @return last_time
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * @param lastTime
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
     * 获取代理地区
     *
     * @return Place - 代理地区
     */
    public String getPlace() {
        return place;
    }

    /**
     * 设置代理地区
     *
     * @param place 代理地区
     */
    public void setPlace(String place) {
        this.place = place;
    }
}