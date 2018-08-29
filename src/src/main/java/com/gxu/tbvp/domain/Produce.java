package com.gxu.tbvp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Produce implements Serializable {
    /**
     * 旅游路线id
     */
    @Column(name = "produceId")
    private Integer produceid;

    /**
     * 旅游路线主题名称
     */
    private String title;

    /**
     * 路线所包含所有景点，用“青秀山，大明山”这种格式
     */
    private String scenics;

    /**
     * 出行方式，中间用逗号隔开
     */
    @Column(name = "waySId")
    private String waysid;

    /**
     * 路线原价，单位元
     */
    @Column(name = "totalAmount")
    private Double totalamount;

    /**
     * 路线现价
     */
    private Double price;

    /**
     * 路线的特色图片，多张图片用逗号隔开
     */
    @Column(name = "Images")
    private String images;

    /**
     * 对路线的文字描述
     */
    private String description;

    /**
     * 路线运营的初始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 路线运营的结束时间
     */
    @Column(name = "End_time")
    private Date endTime;

    /**
     * 获取旅游路线id
     *
     * @return produceId - 旅游路线id
     */
    public Integer getProduceid() {
        return produceid;
    }

    /**
     * 设置旅游路线id
     *
     * @param produceid 旅游路线id
     */
    public void setProduceid(Integer produceid) {
        this.produceid = produceid;
    }

    /**
     * 获取旅游路线主题名称
     *
     * @return title - 旅游路线主题名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置旅游路线主题名称
     *
     * @param title 旅游路线主题名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取路线所包含所有景点，用“青秀山，大明山”这种格式
     *
     * @return scenics - 路线所包含所有景点，用“青秀山，大明山”这种格式
     */
    public String getScenics() {
        return scenics;
    }

    /**
     * 设置路线所包含所有景点，用“青秀山，大明山”这种格式
     *
     * @param scenics 路线所包含所有景点，用“青秀山，大明山”这种格式
     */
    public void setScenics(String scenics) {
        this.scenics = scenics;
    }

    /**
     * 获取出行方式，中间用逗号隔开
     *
     * @return waySId - 出行方式，中间用逗号隔开
     */
    public String getWaysid() {
        return waysid;
    }

    /**
     * 设置出行方式，中间用逗号隔开
     *
     * @param waysid 出行方式，中间用逗号隔开
     */
    public void setWaysid(String waysid) {
        this.waysid = waysid;
    }

    /**
     * 获取路线原价，单位元
     *
     * @return totalAmount - 路线原价，单位元
     */
    public Double getTotalamount() {
        return totalamount;
    }

    /**
     * 设置路线原价，单位元
     *
     * @param totalamount 路线原价，单位元
     */
    public void setTotalamount(Double totalamount) {
        this.totalamount = totalamount;
    }

    /**
     * 获取路线现价
     *
     * @return price - 路线现价
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置路线现价
     *
     * @param price 路线现价
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取路线的特色图片，多张图片用逗号隔开
     *
     * @return Images - 路线的特色图片，多张图片用逗号隔开
     */
    public String getImages() {
        return images;
    }

    /**
     * 设置路线的特色图片，多张图片用逗号隔开
     *
     * @param images 路线的特色图片，多张图片用逗号隔开
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * 获取对路线的文字描述
     *
     * @return description - 对路线的文字描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置对路线的文字描述
     *
     * @param description 对路线的文字描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取路线运营的初始时间
     *
     * @return start_time - 路线运营的初始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置路线运营的初始时间
     *
     * @param startTime 路线运营的初始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取路线运营的结束时间
     *
     * @return End_time - 路线运营的结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置路线运营的结束时间
     *
     * @param endTime 路线运营的结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}