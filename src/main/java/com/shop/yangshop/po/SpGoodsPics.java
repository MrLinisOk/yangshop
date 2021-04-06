package com.shop.yangshop.po;

import java.io.Serializable;

/**
 * sp_goods_pics
 * @author 
 */
public class SpGoodsPics implements Serializable {
    /**
     * 主键id
     */
    private Integer picsId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 相册大图800*800
     */
    private String picsBig;

    /**
     * 相册中图350*350
     */
    private String picsMid;

    /**
     * 相册小图50*50
     */
    private String picsSma;

    private static final long serialVersionUID = 1L;

    public Integer getPicsId() {
        return picsId;
    }

    public void setPicsId(Integer picsId) {
        this.picsId = picsId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getPicsBig() {
        return picsBig;
    }

    public void setPicsBig(String picsBig) {
        this.picsBig = picsBig;
    }

    public String getPicsMid() {
        return picsMid;
    }

    public void setPicsMid(String picsMid) {
        this.picsMid = picsMid;
    }

    public String getPicsSma() {
        return picsSma;
    }

    public void setPicsSma(String picsSma) {
        this.picsSma = picsSma;
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
        SpGoodsPics other = (SpGoodsPics) that;
        return (this.getPicsId() == null ? other.getPicsId() == null : this.getPicsId().equals(other.getPicsId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getPicsBig() == null ? other.getPicsBig() == null : this.getPicsBig().equals(other.getPicsBig()))
            && (this.getPicsMid() == null ? other.getPicsMid() == null : this.getPicsMid().equals(other.getPicsMid()))
            && (this.getPicsSma() == null ? other.getPicsSma() == null : this.getPicsSma().equals(other.getPicsSma()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPicsId() == null) ? 0 : getPicsId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getPicsBig() == null) ? 0 : getPicsBig().hashCode());
        result = prime * result + ((getPicsMid() == null) ? 0 : getPicsMid().hashCode());
        result = prime * result + ((getPicsSma() == null) ? 0 : getPicsSma().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", picsId=").append(picsId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", picsBig=").append(picsBig);
        sb.append(", picsMid=").append(picsMid);
        sb.append(", picsSma=").append(picsSma);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}