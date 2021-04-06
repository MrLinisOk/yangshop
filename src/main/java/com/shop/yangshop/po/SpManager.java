package com.shop.yangshop.po;

import java.io.Serializable;

/**
 * sp_manager
 * @author 
 */
public class SpManager implements Serializable {
    /**
     * 主键id
     */
    private Integer mgId;

    /**
     * 名称
     */
    private String mgName;

    /**
     * 密码
     */
    private String mgPwd;

    /**
     * 注册时间
     */
    private Integer mgTime;

    /**
     * 角色id
     */
    private Byte roleId;

    private String mgMobile;

    private String mgEmail;

    /**
     * 1：表示启用 0:表示禁用
     */
    private Byte mgState;

    private static final long serialVersionUID = 1L;

    public Integer getMgId() {
        return mgId;
    }

    public void setMgId(Integer mgId) {
        this.mgId = mgId;
    }

    public String getMgName() {
        return mgName;
    }

    public void setMgName(String mgName) {
        this.mgName = mgName;
    }

    public String getMgPwd() {
        return mgPwd;
    }

    public void setMgPwd(String mgPwd) {
        this.mgPwd = mgPwd;
    }

    public Integer getMgTime() {
        return mgTime;
    }

    public void setMgTime(Integer mgTime) {
        this.mgTime = mgTime;
    }

    public Byte getRoleId() {
        return roleId;
    }

    public void setRoleId(Byte roleId) {
        this.roleId = roleId;
    }

    public String getMgMobile() {
        return mgMobile;
    }

    public void setMgMobile(String mgMobile) {
        this.mgMobile = mgMobile;
    }

    public String getMgEmail() {
        return mgEmail;
    }

    public void setMgEmail(String mgEmail) {
        this.mgEmail = mgEmail;
    }

    public Byte getMgState() {
        return mgState;
    }

    public void setMgState(Byte mgState) {
        this.mgState = mgState;
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
        SpManager other = (SpManager) that;
        return (this.getMgId() == null ? other.getMgId() == null : this.getMgId().equals(other.getMgId()))
            && (this.getMgName() == null ? other.getMgName() == null : this.getMgName().equals(other.getMgName()))
            && (this.getMgPwd() == null ? other.getMgPwd() == null : this.getMgPwd().equals(other.getMgPwd()))
            && (this.getMgTime() == null ? other.getMgTime() == null : this.getMgTime().equals(other.getMgTime()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getMgMobile() == null ? other.getMgMobile() == null : this.getMgMobile().equals(other.getMgMobile()))
            && (this.getMgEmail() == null ? other.getMgEmail() == null : this.getMgEmail().equals(other.getMgEmail()))
            && (this.getMgState() == null ? other.getMgState() == null : this.getMgState().equals(other.getMgState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMgId() == null) ? 0 : getMgId().hashCode());
        result = prime * result + ((getMgName() == null) ? 0 : getMgName().hashCode());
        result = prime * result + ((getMgPwd() == null) ? 0 : getMgPwd().hashCode());
        result = prime * result + ((getMgTime() == null) ? 0 : getMgTime().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getMgMobile() == null) ? 0 : getMgMobile().hashCode());
        result = prime * result + ((getMgEmail() == null) ? 0 : getMgEmail().hashCode());
        result = prime * result + ((getMgState() == null) ? 0 : getMgState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mgId=").append(mgId);
        sb.append(", mgName=").append(mgName);
        sb.append(", mgPwd=").append(mgPwd);
        sb.append(", mgTime=").append(mgTime);
        sb.append(", roleId=").append(roleId);
        sb.append(", mgMobile=").append(mgMobile);
        sb.append(", mgEmail=").append(mgEmail);
        sb.append(", mgState=").append(mgState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}