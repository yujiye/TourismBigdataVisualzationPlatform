package com.gxu.tbvp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

public class Ways implements Serializable {
    @Id
    private Integer id;

    /**
     * 起始地
     */
    @Column(name = "startPlace")
    @JsonIgnore
    private String startplace;

    /**
     * 目的地
     */
    @Column(name = "endPlace")
    @JsonIgnore
    private String endplace;

    private Double amount;

    /**
     * 0飞机，1火车，2汽车，3自驾，4其它
     */
    private Integer way;

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
     * 获取起始地
     *
     * @return startPlace - 起始地
     */
    public String getStartplace() {
        return startplace;
    }

    /**
     * 设置起始地
     *
     * @param startplace 起始地
     */
    public void setStartplace(String startplace) {
        this.startplace = startplace;
    }

    /**
     * 获取目的地
     *
     * @return endPlace - 目的地
     */
    public String getEndplace() {
        return endplace;
    }

    /**
     * 设置目的地
     *
     * @param endplace 目的地
     */
    public void setEndplace(String endplace) {
        this.endplace = endplace;
    }

    /**
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 获取0飞机，1火车，2汽车，3自驾，4其它
     *
     * @return way - 0飞机，1火车，2汽车，3自驾，4其它
     */
    public Integer getWay() {
        return way;
    }

    /**
     * 设置0飞机，1火车，2汽车，3自驾，4其它
     *
     * @param way 0飞机，1火车，2汽车，3自驾，4其它
     */
    public void setWay(Integer way) {
        this.way = way;
    }
}