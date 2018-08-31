package com.gxu.tbvp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Buyrecord implements Serializable {
    @Id
    private Integer id;

    /**
     * 为空，表示游览用户非平台注册用户
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 访问产品的id
     */
    @Column(name = "accessProduceId")
    private Integer accessproduceid;

    /**
     * 访问工具，0表示省油灯，1表示通过携程，2表示飞猪，3表示其它等
     */
    @Column(name = "accessTool")
    private Integer accesstool;

    /**
     * 购买时间，为空表示访问时间
     */
    @Column(name = "accessTime")
    private Date accesstime;

    /**
     * 停留时间
     */
    @Column(name = "totalTime")
    private Integer totaltime;

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
     * 获取访问产品的id
     *
     * @return accessProduceId - 访问产品的id
     */
    public Integer getAccessproduceid() {
        return accessproduceid;
    }

    /**
     * 设置访问产品的id
     *
     * @param accessproduceid 访问产品的id
     */
    public void setAccessproduceid(Integer accessproduceid) {
        this.accessproduceid = accessproduceid;
    }

    /**
     * 获取访问工具，0表示省油灯，1表示通过携程，2表示飞猪，3表示其它等
     *
     * @return accessTool - 访问工具，0表示省油灯，1表示通过携程，2表示飞猪，3表示其它等
     */
    public Integer getAccesstool() {
        return accesstool;
    }

    /**
     * 设置访问工具，0表示省油灯，1表示通过携程，2表示飞猪，3表示其它等
     *
     * @param accesstool 访问工具，0表示省油灯，1表示通过携程，2表示飞猪，3表示其它等
     */
    public void setAccesstool(Integer accesstool) {
        this.accesstool = accesstool;
    }

    /**
     * 获取购买时间，为空表示访问时间
     *
     * @return accessTime - 购买时间，为空表示访问时间
     */
    public Date getAccesstime() {
        return accesstime;
    }

    /**
     * 设置购买时间，为空表示访问时间
     *
     * @param accesstime 购买时间，为空表示访问时间
     */
    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
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
}