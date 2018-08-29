package com.gxu.tbvp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Mapperdemo implements Serializable {
    /**
     * 用户名字，用于登陆
     */
    @Id
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户id,字符型，用于唯一标识每个用户
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户邮箱，用于登陆和找回密码
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 用户手机，用于登陆和找回密码
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 用户密码，用于登陆
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 假删除，0代表为删除，1代表删除
     */
    @Column(name = "user_delete")
    private Integer userDelete;

    /**
     * 用户图片
     */
    @Column(name = "user_image")
    private String userImage;

    /**
     * 用户创建时间
     */
    @Column(name = "user_created_time")
    private Date userCreatedTime;

    /**
     * 用户删除时间
     */
    @Column(name = "user_deleted_time")
    private Date userDeletedTime;

    /**
     * 获取用户名字，用于登陆
     *
     * @return user_name - 用户名字，用于登陆
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名字，用于登陆
     *
     * @param userName 用户名字，用于登陆
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户id,字符型，用于唯一标识每个用户
     *
     * @return user_id - 用户id,字符型，用于唯一标识每个用户
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id,字符型，用于唯一标识每个用户
     *
     * @param userId 用户id,字符型，用于唯一标识每个用户
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户邮箱，用于登陆和找回密码
     *
     * @return user_email - 用户邮箱，用于登陆和找回密码
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置用户邮箱，用于登陆和找回密码
     *
     * @param userEmail 用户邮箱，用于登陆和找回密码
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取用户手机，用于登陆和找回密码
     *
     * @return user_phone - 用户手机，用于登陆和找回密码
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置用户手机，用于登陆和找回密码
     *
     * @param userPhone 用户手机，用于登陆和找回密码
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取用户密码，用于登陆
     *
     * @return user_password - 用户密码，用于登陆
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置用户密码，用于登陆
     *
     * @param userPassword 用户密码，用于登陆
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取假删除，0代表为删除，1代表删除
     *
     * @return user_delete - 假删除，0代表为删除，1代表删除
     */
    public Integer getUserDelete() {
        return userDelete;
    }

    /**
     * 设置假删除，0代表为删除，1代表删除
     *
     * @param userDelete 假删除，0代表为删除，1代表删除
     */
    public void setUserDelete(Integer userDelete) {
        this.userDelete = userDelete;
    }

    /**
     * 获取用户图片
     *
     * @return user_image - 用户图片
     */
    public String getUserImage() {
        return userImage;
    }

    /**
     * 设置用户图片
     *
     * @param userImage 用户图片
     */
    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    /**
     * 获取用户创建时间
     *
     * @return user_created_time - 用户创建时间
     */
    public Date getUserCreatedTime() {
        return userCreatedTime;
    }

    /**
     * 设置用户创建时间
     *
     * @param userCreatedTime 用户创建时间
     */
    public void setUserCreatedTime(Date userCreatedTime) {
        this.userCreatedTime = userCreatedTime;
    }

    /**
     * 获取用户删除时间
     *
     * @return user_deleted_time - 用户删除时间
     */
    public Date getUserDeletedTime() {
        return userDeletedTime;
    }

    /**
     * 设置用户删除时间
     *
     * @param userDeletedTime 用户删除时间
     */
    public void setUserDeletedTime(Date userDeletedTime) {
        this.userDeletedTime = userDeletedTime;
    }
}