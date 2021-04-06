package com.shop.yangshop.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * sp_order
 * @author 
 */
public class SpOrder implements Serializable {
    /**
     * 主键id
     */
    private Integer orderId;

    /**
     * 下订单会员id
     */
    private Integer userId;

    /**
     * 订单编号
     */
    private String orderNumber;

    /**
     * 订单总金额
     */
    private BigDecimal orderPrice;

    /**
     * 支付方式  0未支付 1支付宝  2微信  3银行卡
     */
    private String orderPay;

    /**
     * 订单是否已经发货
     */
    private String isSend;

    /**
     * 支付宝交易流水号码
     */
    private String tradeNo;

    /**
     * 发票抬头 个人 公司
     */
    private String orderFapiaoTitle;

    /**
     * 公司名称
     */
    private String orderFapiaoCompany;

    /**
     * 发票内容
     */
    private String orderFapiaoContent;

    /**
     * 订单状态： 0未付款、1已付款
     */
    private String payStatus;

    /**
     * 记录生成时间
     */
    private Integer createTime;

    /**
     * 记录修改时间
     */
    private Integer updateTime;

    /**
     * consignee收货人地址
     */
    private String consigneeAddr;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(String orderPay) {
        this.orderPay = orderPay;
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOrderFapiaoTitle() {
        return orderFapiaoTitle;
    }

    public void setOrderFapiaoTitle(String orderFapiaoTitle) {
        this.orderFapiaoTitle = orderFapiaoTitle;
    }

    public String getOrderFapiaoCompany() {
        return orderFapiaoCompany;
    }

    public void setOrderFapiaoCompany(String orderFapiaoCompany) {
        this.orderFapiaoCompany = orderFapiaoCompany;
    }

    public String getOrderFapiaoContent() {
        return orderFapiaoContent;
    }

    public void setOrderFapiaoContent(String orderFapiaoContent) {
        this.orderFapiaoContent = orderFapiaoContent;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
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

    public String getConsigneeAddr() {
        return consigneeAddr;
    }

    public void setConsigneeAddr(String consigneeAddr) {
        this.consigneeAddr = consigneeAddr;
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
        SpOrder other = (SpOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderNumber() == null ? other.getOrderNumber() == null : this.getOrderNumber().equals(other.getOrderNumber()))
            && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()))
            && (this.getOrderPay() == null ? other.getOrderPay() == null : this.getOrderPay().equals(other.getOrderPay()))
            && (this.getIsSend() == null ? other.getIsSend() == null : this.getIsSend().equals(other.getIsSend()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getOrderFapiaoTitle() == null ? other.getOrderFapiaoTitle() == null : this.getOrderFapiaoTitle().equals(other.getOrderFapiaoTitle()))
            && (this.getOrderFapiaoCompany() == null ? other.getOrderFapiaoCompany() == null : this.getOrderFapiaoCompany().equals(other.getOrderFapiaoCompany()))
            && (this.getOrderFapiaoContent() == null ? other.getOrderFapiaoContent() == null : this.getOrderFapiaoContent().equals(other.getOrderFapiaoContent()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getConsigneeAddr() == null ? other.getConsigneeAddr() == null : this.getConsigneeAddr().equals(other.getConsigneeAddr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderNumber() == null) ? 0 : getOrderNumber().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        result = prime * result + ((getOrderPay() == null) ? 0 : getOrderPay().hashCode());
        result = prime * result + ((getIsSend() == null) ? 0 : getIsSend().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getOrderFapiaoTitle() == null) ? 0 : getOrderFapiaoTitle().hashCode());
        result = prime * result + ((getOrderFapiaoCompany() == null) ? 0 : getOrderFapiaoCompany().hashCode());
        result = prime * result + ((getOrderFapiaoContent() == null) ? 0 : getOrderFapiaoContent().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getConsigneeAddr() == null) ? 0 : getConsigneeAddr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", orderPay=").append(orderPay);
        sb.append(", isSend=").append(isSend);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", orderFapiaoTitle=").append(orderFapiaoTitle);
        sb.append(", orderFapiaoCompany=").append(orderFapiaoCompany);
        sb.append(", orderFapiaoContent=").append(orderFapiaoContent);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", consigneeAddr=").append(consigneeAddr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}