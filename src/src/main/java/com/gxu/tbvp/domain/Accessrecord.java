package com.gxu.tbvp.domain;

import java.util.Date;
import javax.persistence.*;

public class Accessrecord {
    @Id
    private Integer id;

    /**
     * 为空，表示游览用户非平台注册用户
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 空表示对平台的访问，非空表示对路线的访问
     */
    @Column(name = "produceId")
    private Integer produceid;

    /**
     * 记录生成时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 0表示访问记录，1表示通过携程购买，2表示省油灯购买，3表示在代理处购买等
     */
    @Column(name = "buy_tool")
    private Integer buyTool;

    /**
     * 空，表示非代理处购买，否则在代理处购买并可以找到此次购买的代理人
     */
    @Column(name = "agentId")
    private Integer agentid;

    /**
     * 0表示现金支付，1微信支付，2支付宝支付
     */
    @Column(name = "buy_way")
    private Integer buyWay;

    /**
     * 购买时间，为空表示访问时间
     */
    @Column(name = "buy_time")
    private Date buyTime;

    /**
     * 所花金额，单位元
     */
    @Column(name = "buy_price")
    private Double buyPrice;

    /**
     * 买票的张数
     */
    private Integer count;

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
     * 获取为空，表示游览用户非平台注册用户
     *
     * @return userId - 为空，表示游览用户非平台注册用户
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置为空，表示游览用户非平台注册用户
     *
     * @param userid 为空，表示游览用户非平台注册用户
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取空表示对平台的访问，非空表示对路线的访问
     *
     * @return produceId - 空表示对平台的访问，非空表示对路线的访问
     */
    public Integer getProduceid() {
        return produceid;
    }

    /**
     * 设置空表示对平台的访问，非空表示对路线的访问
     *
     * @param produceid 空表示对平台的访问，非空表示对路线的访问
     */
    public void setProduceid(Integer produceid) {
        this.produceid = produceid;
    }

    /**
     * 获取记录生成时间
     *
     * @return createTime - 记录生成时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置记录生成时间
     *
     * @param createtime 记录生成时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取0表示访问记录，1表示通过携程购买，2表示省油灯购买，3表示在代理处购买等
     *
     * @return buy_tool - 0表示访问记录，1表示通过携程购买，2表示省油灯购买，3表示在代理处购买等
     */
    public Integer getBuyTool() {
        return buyTool;
    }

    /**
     * 设置0表示访问记录，1表示通过携程购买，2表示省油灯购买，3表示在代理处购买等
     *
     * @param buyTool 0表示访问记录，1表示通过携程购买，2表示省油灯购买，3表示在代理处购买等
     */
    public void setBuyTool(Integer buyTool) {
        this.buyTool = buyTool;
    }

    /**
     * 获取空，表示非代理处购买，否则在代理处购买并可以找到此次购买的代理人
     *
     * @return agentId - 空，表示非代理处购买，否则在代理处购买并可以找到此次购买的代理人
     */
    public Integer getAgentid() {
        return agentid;
    }

    /**
     * 设置空，表示非代理处购买，否则在代理处购买并可以找到此次购买的代理人
     *
     * @param agentid 空，表示非代理处购买，否则在代理处购买并可以找到此次购买的代理人
     */
    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }

    /**
     * 获取0表示现金支付，1微信支付，2支付宝支付
     *
     * @return buy_way - 0表示现金支付，1微信支付，2支付宝支付
     */
    public Integer getBuyWay() {
        return buyWay;
    }

    /**
     * 设置0表示现金支付，1微信支付，2支付宝支付
     *
     * @param buyWay 0表示现金支付，1微信支付，2支付宝支付
     */
    public void setBuyWay(Integer buyWay) {
        this.buyWay = buyWay;
    }

    /**
     * 获取购买时间，为空表示访问时间
     *
     * @return buy_time - 购买时间，为空表示访问时间
     */
    public Date getBuyTime() {
        return buyTime;
    }

    /**
     * 设置购买时间，为空表示访问时间
     *
     * @param buyTime 购买时间，为空表示访问时间
     */
    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    /**
     * 获取所花金额，单位元
     *
     * @return buy_price - 所花金额，单位元
     */
    public Double getBuyPrice() {
        return buyPrice;
    }

    /**
     * 设置所花金额，单位元
     *
     * @param buyPrice 所花金额，单位元
     */
    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * 获取买票的张数
     *
     * @return count - 买票的张数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置买票的张数
     *
     * @param count 买票的张数
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}