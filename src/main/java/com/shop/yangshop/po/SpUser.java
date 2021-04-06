package com.shop.yangshop.po;

import java.io.Serializable;

/**
 * sp_user
 * @author 
 */
public class SpUser implements Serializable {
    /**
     * 自增id
     */
    private Integer userId;

    /**
     * 登录名
     */
    private String username;

    /**
     * qq官方唯一编号信息
     */
    private String qqOpenId;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 新用户注册邮件激活唯一校验码
     */
    private String userEmailCode;

    /**
     * 新用户是否已经通过邮箱激活帐号
     */
    private String isActive;

    /**
     * 性别
     */
    private String userSex;

    /**
     * qq
     */
    private String userQq;

    /**
     * 手机
     */
    private String userTel;

    /**
     * 学历
     */
    private String userXueli;

    /**
     * 爱好
     */
    private String userHobby;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 修改时间
     */
    private Integer updateTime;

    /**
     * 简介
     */
    private String userIntroduce;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmailCode() {
        return userEmailCode;
    }

    public void setUserEmailCode(String userEmailCode) {
        this.userEmailCode = userEmailCode;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserXueli() {
        return userXueli;
    }

    public void setUserXueli(String userXueli) {
        this.userXueli = userXueli;
    }

    public String getUserHobby() {
        return userHobby;
    }

    public void setUserHobby(String userHobby) {
        this.userHobby = userHobby;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserIntroduce() {
        return userIntroduce;
    }

    public void setUserIntroduce(String userIntroduce) {
        this.userIntroduce = userIntroduce;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SpUser other = (SpUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getQqOpenId() == null ? other.getQqOpenId() == null : this.getQqOpenId().equals(other.getQqOpenId()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserEmailCode() == null ? other.getUserEmailCode() == null : this.getUserEmailCode().equals(other.getUserEmailCode()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserQq() == null ? other.getUserQq() == null : this.getUserQq().equals(other.getUserQq()))
            && (this.getUserTel() == null ? other.getUserTel() == null : this.getUserTel().equals(other.getUserTel()))
            && (this.getUserXueli() == null ? other.getUserXueli() == null : this.getUserXueli().equals(other.getUserXueli()))
            && (this.getUserHobby() == null ? other.getUserHobby() == null : this.getUserHobby().equals(other.getUserHobby()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUserIntroduce() == null ? other.getUserIntroduce() == null : this.getUserIntroduce().equals(other.getUserIntroduce()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getQqOpenId() == null) ? 0 : getQqOpenId().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserEmailCode() == null) ? 0 : getUserEmailCode().hashCode());
        result = prime * result + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserQq() == null) ? 0 : getUserQq().hashCode());
        result = prime * result + ((getUserTel() == null) ? 0 : getUserTel().hashCode());
        result = prime * result + ((getUserXueli() == null) ? 0 : getUserXueli().hashCode());
        result = prime * result + ((getUserHobby() == null) ? 0 : getUserHobby().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUserIntroduce() == null) ? 0 : getUserIntroduce().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", qqOpenId=").append(qqOpenId);
        sb.append(", password=").append(password);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userEmailCode=").append(userEmailCode);
        sb.append(", isActive=").append(isActive);
        sb.append(", userSex=").append(userSex);
        sb.append(", userQq=").append(userQq);
        sb.append(", userTel=").append(userTel);
        sb.append(", userXueli=").append(userXueli);
        sb.append(", userHobby=").append(userHobby);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", userIntroduce=").append(userIntroduce);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}