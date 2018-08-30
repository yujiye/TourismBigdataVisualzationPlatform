package com.gxu.tbvp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Accessrecord implements Serializable {
    @Id
    private Integer id;

    /**
     * 为空，表示游览用户非平台注册用户
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 购买的产品id
     */
    @Column(name = "buyProduceId")
    private Integer buyproduceid;

    /**
     * 购买工具，0表示省油灯，1表示通过携程，2表示飞猪，3表示其它等
     */
    @Column(name = "buyTool")
    private Integer buytool;

    /**
     * 购买时间
     */
    @Column(name = "buyTime")
    private Date buytime;

    /**
     * 所花金额，单位元
     */
    @Column(name = "buy_price")
    private Double buyPrice;

    /**
     * 停留时间
     */
    @Column(name = "totalTime")
    private Integer totaltime;

    /**
     * 购买数量
     */
    @Column(name = "buyCount")
    private Integer buycount;

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
     * 获取购买的产品id
     *
     * @return buyProduceId - 购买的产品id
     */
    public Integer getBuyproduceid() {
        return buyproduceid;
    }

    /**
     * 设置购买的产品id
     *
     * @param buyproduceid 购买的产品id
     */
    public void setBuyproduceid(Integer buyproduceid) {
        this.buyproduceid = buyproduceid;
    }

    /**
     * 获取购买工具，0表示省油灯，1表示通过携程，2表示飞猪，3表示其它等
     *
     * @return buyTool - 购买工具，0表示省油灯，1表示通过携程，2表示飞猪，3表示其它等
     */
    public Integer getBuytool() {
        return buytool;
    }

    /**
     * 设置购买工具，0表示省油灯，1表示通过携程，2表示飞猪，3表示其它等
     *
     * @param buytool 购买工具，0表示省油灯，1表示通过携程，2表示飞猪，3表示其它等
     */
    public void setBuytool(Integer buytool) {
        this.buytool = buytool;
    }

    /**
     * 获取购买时间
     *
     * @return buyTime - 购买时间
     */
    public Date getBuytime() {
        return buytime;
    }

    /**
     * 设置购买时间
     *
     * @param buytime 购买时间
     */
    public void setBuytime(Date buytime) {
        this.buytime = buytime;
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
     * 获取停留时间
     *
     * @return totalTime - 停留时间
     */
    public Integer getTotaltime() {
        return totaltime;
    }

    /**
     * 设置停留时间
     *
     * @param totaltime 停留时间
     */
    public void setTotaltime(Integer totaltime) {
        this.totaltime = totaltime;
    }

    /**
     * 获取购买数量
     *
     * @return buyCount - 购买数量
     */
    public Integer getBuycount() {
        return buycount;
    }

    /**
     * 设置购买数量
     *
     * @param buycount 购买数量
     */
    public void setBuycount(Integer buycount) {
        this.buycount = buycount;
    }
}