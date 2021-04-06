package com.shop.yangshop.po;

import java.io.Serializable;

/**
 * sp_express
 * @author 
 */
public class SpExpress implements Serializable {
    /**
     * 主键id
     */
    private Integer expressId;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 订单快递公司名称
     */
    private String expressCom;

    /**
     * 快递单编号
     */
    private String expressNu;

    /**
     * 记录生成时间
     */
    private Integer createTime;

    /**
     * 记录修改时间
     */
    private Integer updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getExpressCom() {
        return expressCom;
    }

    public void setExpressCom(String expressCom) {
        this.expressCom = expressCom;
    }

    public String getExpressNu() {
        return expressNu;
    }

    public void setExpressNu(String expressNu) {
        this.expressNu = expressNu;
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
        SpExpress other = (SpExpress) that;
        return (this.getExpressId() == null ? other.getExpressId() == null : this.getExpressId().equals(other.getExpressId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getExpressCom() == null ? other.getExpressCom() == null : this.getExpressCom().equals(other.getExpressCom()))
            && (this.getExpressNu() == null ? other.getExpressNu() == null : this.getExpressNu().equals(other.getExpressNu()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpressId() == null) ? 0 : getExpressId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getExpressCom() == null) ? 0 : getExpressCom().hashCode());
        result = prime * result + ((getExpressNu() == null) ? 0 : getExpressNu().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expressId=").append(expressId);
        sb.append(", orderId=").append(orderId);
        sb.append(", expressCom=").append(expressCom);
        sb.append(", expressNu=").append(expressNu);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}