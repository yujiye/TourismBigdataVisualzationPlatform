package com.gxu.tbvp.domain;

import javax.persistence.*;
import java.io.Serializable;

public class Address implements Serializable {
    /**
     * Id
     */
    @Id
    @Column(name = "addressId")
    private Integer addressid;

    /**
     * 国家
     */
    private String country;

    /**
     * 所在省
     */
    private String province;

    /**
     * 所在市
     */
    private String city;

    /**
     * 详细地址
     */
    private String deati;

    /**
     * 获取Id
     *
     * @return addressId - Id
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * 设置Id
     *
     * @param addressid Id
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取所在省
     *
     * @return province - 所在省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置所在省
     *
     * @param province 所在省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取所在市
     *
     * @return city - 所在市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置所在市
     *
     * @param city 所在市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取详细地址
     *
     * @return deati - 详细地址
     */
    public String getDeati() {
        return deati;
    }

    /**
     * 设置详细地址
     *
     * @param deati 详细地址
     */
    public void setDeati(String deati) {
        this.deati = deati;
    }
}