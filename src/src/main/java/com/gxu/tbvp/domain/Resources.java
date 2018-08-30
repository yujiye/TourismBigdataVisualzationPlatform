package com.gxu.tbvp.domain;

import javax.persistence.*;
import java.io.Serializable;

public class Resources implements Serializable {
    @Id
    private Integer id;

    /**
     * ��Դ����
     */
    private String name;

    /**
     * ��Դurl
     */
    @Column(name = "resUrl")
    private String resurl;

    /**
     * ��Դ����   1:�˵�    2����ť
     */
    private Integer type;

    /**
     * ����Դ
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * ����
     */
    private Integer sort;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取��Դ����
     *
     * @return name - ��Դ����
     */
    public String getName() {
        return name;
    }

    /**
     * 设置��Դ����
     *
     * @param name ��Դ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取��Դurl
     *
     * @return resUrl - ��Դurl
     */
    public String getResurl() {
        return resurl;
    }

    /**
     * 设置��Դurl
     *
     * @param resurl ��Դurl
     */
    public void setResurl(String resurl) {
        this.resurl = resurl;
    }

    /**
     * 获取��Դ����   1:�˵�    2����ť
     *
     * @return type - ��Դ����   1:�˵�    2����ť
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置��Դ����   1:�˵�    2����ť
     *
     * @param type ��Դ����   1:�˵�    2����ť
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取����Դ
     *
     * @return parentId - ����Դ
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置����Դ
     *
     * @param parentid ����Դ
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取����
     *
     * @return sort - ����
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置����
     *
     * @param sort ����
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}