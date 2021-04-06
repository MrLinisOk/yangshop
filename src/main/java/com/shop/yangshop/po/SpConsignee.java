package com.shop.yangshop.po;

import java.io.Serializable;

/**
 * sp_consignee
 * @author 
 */
public class SpConsignee implements Serializable {
    /**
     * 主键id
     */
    private Integer cgnId;

    /**
     * 会员id
     */
    private Integer userId;

    /**
     * 收货人名称
     */
    private String cgnName;

    /**
     * 收货人地址
     */
    private String cgnAddress;

    /**
     * 收货人电话
     */
    private String cgnTel;

    /**
     * 邮编
     */
    private String cgnCode;

    /**
     * 删除时间
     */
    private Integer deleteTime;

    private static final long serialVersionUID = 1L;

    public Integer getCgnId() {
        return cgnId;
    }

    public void setCgnId(Integer cgnId) {
        this.cgnId = cgnId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCgnName() {
        return cgnName;
    }

    public void setCgnName(String cgnName) {
        this.cgnName = cgnName;
    }

    public String getCgnAddress() {
        return cgnAddress;
    }

    public void setCgnAddress(String cgnAddress) {
        this.cgnAddress = cgnAddress;
    }

    public String getCgnTel() {
        return cgnTel;
    }

    public void setCgnTel(String cgnTel) {
        this.cgnTel = cgnTel;
    }

    public String getCgnCode() {
        return cgnCode;
    }

    public void setCgnCode(String cgnCode) {
        this.cgnCode = cgnCode;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
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
        SpConsignee other = (SpConsignee) that;
        return (this.getCgnId() == null ? other.getCgnId() == null : this.getCgnId().equals(other.getCgnId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCgnName() == null ? other.getCgnName() == null : this.getCgnName().equals(other.getCgnName()))
            && (this.getCgnAddress() == null ? other.getCgnAddress() == null : this.getCgnAddress().equals(other.getCgnAddress()))
            && (this.getCgnTel() == null ? other.getCgnTel() == null : this.getCgnTel().equals(other.getCgnTel()))
            && (this.getCgnCode() == null ? other.getCgnCode() == null : this.getCgnCode().equals(other.getCgnCode()))
            && (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCgnId() == null) ? 0 : getCgnId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCgnName() == null) ? 0 : getCgnName().hashCode());
        result = prime * result + ((getCgnAddress() == null) ? 0 : getCgnAddress().hashCode());
        result = prime * result + ((getCgnTel() == null) ? 0 : getCgnTel().hashCode());
        result = prime * result + ((getCgnCode() == null) ? 0 : getCgnCode().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cgnId=").append(cgnId);
        sb.append(", userId=").append(userId);
        sb.append(", cgnName=").append(cgnName);
        sb.append(", cgnAddress=").append(cgnAddress);
        sb.append(", cgnTel=").append(cgnTel);
        sb.append(", cgnCode=").append(cgnCode);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}