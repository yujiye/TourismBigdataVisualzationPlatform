package com.gxu.tbvp.domain;

import javax.persistence.*;

public class Ways {
    @Id
    private Integer id;

    /**
     * 起始地
     */
    @Column(name = "startPlace")
    private String startplace;

    /**
     * 目的地
     */
    @Column(name = "endPlace")
    private String endplace;

    private Double amount;

    /**
     * 出行方式，如飞机
     */
    private String way;

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
     * 获取出行方式，如飞机
     *
     * @return way - 出行方式，如飞机
     */
    public String getWay() {
        return way;
    }

    /**
     * 设置出行方式，如飞机
     *
     * @param way 出行方式，如飞机
     */
    public void setWay(String way) {
        this.way = way;
    }
}