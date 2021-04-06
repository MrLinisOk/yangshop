package com.shop.yangshop.po;

import java.io.Serializable;

/**
 * sp_category
 * @author 
 */
public class SpCategory implements Serializable {
    /**
     * 分类唯一ID
     */
    private Integer catId;

    /**
     * 分类名称
     */
    private String catName;

    /**
     * 分类父ID
     */
    private Integer catPid;

    /**
     * 分类层级 0: 顶级 1:二级 2:三级
     */
    private Integer catLevel;

    /**
     * 是否删除 1为删除
     */
    private Integer catDeleted;

    private String catIcon;

    private String catSrc;

    private static final long serialVersionUID = 1L;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getCatPid() {
        return catPid;
    }

    public void setCatPid(Integer catPid) {
        this.catPid = catPid;
    }

    public Integer getCatLevel() {
        return catLevel;
    }

    public void setCatLevel(Integer catLevel) {
        this.catLevel = catLevel;
    }

    public Integer getCatDeleted() {
        return catDeleted;
    }

    public void setCatDeleted(Integer catDeleted) {
        this.catDeleted = catDeleted;
    }

    public String getCatIcon() {
        return catIcon;
    }

    public void setCatIcon(String catIcon) {
        this.catIcon = catIcon;
    }

    public String getCatSrc() {
        return catSrc;
    }

    public void setCatSrc(String catSrc) {
        this.catSrc = catSrc;
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
        SpCategory other = (SpCategory) that;
        return (this.getCatId() == null ? other.getCatId() == null : this.getCatId().equals(other.getCatId()))
            && (this.getCatName() == null ? other.getCatName() == null : this.getCatName().equals(other.getCatName()))
            && (this.getCatPid() == null ? other.getCatPid() == null : this.getCatPid().equals(other.getCatPid()))
            && (this.getCatLevel() == null ? other.getCatLevel() == null : this.getCatLevel().equals(other.getCatLevel()))
            && (this.getCatDeleted() == null ? other.getCatDeleted() == null : this.getCatDeleted().equals(other.getCatDeleted()))
            && (this.getCatIcon() == null ? other.getCatIcon() == null : this.getCatIcon().equals(other.getCatIcon()))
            && (this.getCatSrc() == null ? other.getCatSrc() == null : this.getCatSrc().equals(other.getCatSrc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCatId() == null) ? 0 : getCatId().hashCode());
        result = prime * result + ((getCatName() == null) ? 0 : getCatName().hashCode());
        result = prime * result + ((getCatPid() == null) ? 0 : getCatPid().hashCode());
        result = prime * result + ((getCatLevel() == null) ? 0 : getCatLevel().hashCode());
        result = prime * result + ((getCatDeleted() == null) ? 0 : getCatDeleted().hashCode());
        result = prime * result + ((getCatIcon() == null) ? 0 : getCatIcon().hashCode());
        result = prime * result + ((getCatSrc() == null) ? 0 : getCatSrc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catId=").append(catId);
        sb.append(", catName=").append(catName);
        sb.append(", catPid=").append(catPid);
        sb.append(", catLevel=").append(catLevel);
        sb.append(", catDeleted=").append(catDeleted);
        sb.append(", catIcon=").append(catIcon);
        sb.append(", catSrc=").append(catSrc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}