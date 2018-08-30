package com.gxu.tbvp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "super_manager")
public class SuperManager implements Serializable {
    /**
     * id
     */
    @Id
    private String id;

    private String username;

    private String password;

    /**
     * 0表示管理员，1表示用户
     */
    private Integer role;

    /**
     * 代理处名称
     */
    @Column(name = "agentName")
    private String agentname;

    /**
     * 姓名
     */
    private String name;

    /**
     * 职称
     */
    private String profession;

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

    /**
     * 用户最近访问时间
     */
    @Column(name = "last_time")
    private Date lastTime;

    /**
     * 身份证号码
     */
    @Column(name = "idCard")
    private String idcard;

    /**
     * 产品信息id
     */
    @Column(name = "produceId")
    private Integer produceid;

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
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
     * 获取0表示管理员，1表示用户
     *
     * @return role - 0表示管理员，1表示用户
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置0表示管理员，1表示用户
     *
     * @param role 0表示管理员，1表示用户
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * 获取代理处名称
     *
     * @return agentName - 代理处名称
     */
    public String getAgentname() {
        return agentname;
    }

    /**
     * 设置代理处名称
     *
     * @param agentname 代理处名称
     */
    public void setAgentname(String agentname) {
        this.agentname = agentname;
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
     * 获取职称
     *
     * @return profession - 职称
     */
    public String getProfession() {
        return profession;
    }

    /**
     * 设置职称
     *
     * @param profession 职称
     */
    public void setProfession(String profession) {
        this.profession = profession;
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
     * 获取身份证号码
     *
     * @return idCard - 身份证号码
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证号码
     *
     * @param idcard 身份证号码
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取产品信息id
     *
     * @return produceId - 产品信息id
     */
    public Integer getProduceid() {
        return produceid;
    }

    /**
     * 设置产品信息id
     *
     * @param produceid 产品信息id
     */
    public void setProduceid(Integer produceid) {
        this.produceid = produceid;
    }
}