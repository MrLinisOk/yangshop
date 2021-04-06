package com.shop.yangshop.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * sp_goods
 * @author 
 */
public class SpGoods implements Serializable {
    /**
     * 主键id
     */
    private Integer goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    /**
     * 商品数量
     */
    private Integer goodsNumber;

    /**
     * 商品重量
     */
    private Short goodsWeight;

    /**
     * 类型id
     */
    private Short catId;

    /**
     * 图片logo大图
     */
    private String goodsBigLogo;

    /**
     * 图片logo小图
     */
    private String goodsSmallLogo;

    /**
     * 0:正常  1:删除
     */
    private String isDel;

    /**
     * 添加商品时间
     */
    private Integer addTime;

    /**
     * 修改商品时间
     */
    private Integer updTime;

    /**
     * 软删除标志字段
     */
    private Integer deleteTime;

    /**
     * 一级分类id
     */
    private Short catOneId;

    /**
     * 二级分类id
     */
    private Short catTwoId;

    /**
     * 三级分类id
     */
    private Short catThreeId;

    /**
     * 热卖数量
     */
    private Integer hotMumber;

    /**
     * 是否促销
     */
    private Short isPromote;

    /**
     * 商品状态 0: 未通过 1: 审核中 2: 已审核
     */
    private Integer goodsState;

    /**
     * 商品详情介绍
     */
    private String goodsIntroduce;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Short getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Short goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getGoodsBigLogo() {
        return goodsBigLogo;
    }

    public void setGoodsBigLogo(String goodsBigLogo) {
        this.goodsBigLogo = goodsBigLogo;
    }

    public String getGoodsSmallLogo() {
        return goodsSmallLogo;
    }

    public void setGoodsSmallLogo(String goodsSmallLogo) {
        this.goodsSmallLogo = goodsSmallLogo;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Integer updTime) {
        this.updTime = updTime;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Short getCatOneId() {
        return catOneId;
    }

    public void setCatOneId(Short catOneId) {
        this.catOneId = catOneId;
    }

    public Short getCatTwoId() {
        return catTwoId;
    }

    public void setCatTwoId(Short catTwoId) {
        this.catTwoId = catTwoId;
    }

    public Short getCatThreeId() {
        return catThreeId;
    }

    public void setCatThreeId(Short catThreeId) {
        this.catThreeId = catThreeId;
    }

    public Integer getHotMumber() {
        return hotMumber;
    }

    public void setHotMumber(Integer hotMumber) {
        this.hotMumber = hotMumber;
    }

    public Short getIsPromote() {
        return isPromote;
    }

    public void setIsPromote(Short isPromote) {
        this.isPromote = isPromote;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
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
        SpGoods other = (SpGoods) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsNumber() == null ? other.getGoodsNumber() == null : this.getGoodsNumber().equals(other.getGoodsNumber()))
            && (this.getGoodsWeight() == null ? other.getGoodsWeight() == null : this.getGoodsWeight().equals(other.getGoodsWeight()))
            && (this.getCatId() == null ? other.getCatId() == null : this.getCatId().equals(other.getCatId()))
            && (this.getGoodsBigLogo() == null ? other.getGoodsBigLogo() == null : this.getGoodsBigLogo().equals(other.getGoodsBigLogo()))
            && (this.getGoodsSmallLogo() == null ? other.getGoodsSmallLogo() == null : this.getGoodsSmallLogo().equals(other.getGoodsSmallLogo()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdTime() == null ? other.getUpdTime() == null : this.getUpdTime().equals(other.getUpdTime()))
            && (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()))
            && (this.getCatOneId() == null ? other.getCatOneId() == null : this.getCatOneId().equals(other.getCatOneId()))
            && (this.getCatTwoId() == null ? other.getCatTwoId() == null : this.getCatTwoId().equals(other.getCatTwoId()))
            && (this.getCatThreeId() == null ? other.getCatThreeId() == null : this.getCatThreeId().equals(other.getCatThreeId()))
            && (this.getHotMumber() == null ? other.getHotMumber() == null : this.getHotMumber().equals(other.getHotMumber()))
            && (this.getIsPromote() == null ? other.getIsPromote() == null : this.getIsPromote().equals(other.getIsPromote()))
            && (this.getGoodsState() == null ? other.getGoodsState() == null : this.getGoodsState().equals(other.getGoodsState()))
            && (this.getGoodsIntroduce() == null ? other.getGoodsIntroduce() == null : this.getGoodsIntroduce().equals(other.getGoodsIntroduce()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsNumber() == null) ? 0 : getGoodsNumber().hashCode());
        result = prime * result + ((getGoodsWeight() == null) ? 0 : getGoodsWeight().hashCode());
        result = prime * result + ((getCatId() == null) ? 0 : getCatId().hashCode());
        result = prime * result + ((getGoodsBigLogo() == null) ? 0 : getGoodsBigLogo().hashCode());
        result = prime * result + ((getGoodsSmallLogo() == null) ? 0 : getGoodsSmallLogo().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdTime() == null) ? 0 : getUpdTime().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        result = prime * result + ((getCatOneId() == null) ? 0 : getCatOneId().hashCode());
        result = prime * result + ((getCatTwoId() == null) ? 0 : getCatTwoId().hashCode());
        result = prime * result + ((getCatThreeId() == null) ? 0 : getCatThreeId().hashCode());
        result = prime * result + ((getHotMumber() == null) ? 0 : getHotMumber().hashCode());
        result = prime * result + ((getIsPromote() == null) ? 0 : getIsPromote().hashCode());
        result = prime * result + ((getGoodsState() == null) ? 0 : getGoodsState().hashCode());
        result = prime * result + ((getGoodsIntroduce() == null) ? 0 : getGoodsIntroduce().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", goodsWeight=").append(goodsWeight);
        sb.append(", catId=").append(catId);
        sb.append(", goodsBigLogo=").append(goodsBigLogo);
        sb.append(", goodsSmallLogo=").append(goodsSmallLogo);
        sb.append(", isDel=").append(isDel);
        sb.append(", addTime=").append(addTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", catOneId=").append(catOneId);
        sb.append(", catTwoId=").append(catTwoId);
        sb.append(", catThreeId=").append(catThreeId);
        sb.append(", hotMumber=").append(hotMumber);
        sb.append(", isPromote=").append(isPromote);
        sb.append(", goodsState=").append(goodsState);
        sb.append(", goodsIntroduce=").append(goodsIntroduce);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}