package com.shop.yangshop.po;

import java.io.Serializable;

/**
 * sp_attribute
 * @author 
 */
public class SpAttribute implements Serializable {
    /**
     * 主键id
     */
    private Short attrId;

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 外键，类型id
     */
    private Short catId;

    /**
     * only:输入框(唯一)  many:后台下拉列表/前台单选框
     */
    private String attrSel;

    /**
     * manual:手工录入  list:从列表选择
     */
    private String attrWrite;

    /**
     * 删除时间标志
     */
    private Integer deleteTime;

    /**
     * 可选值列表信息,例如颜色：白色,红色,绿色,多个可选值通过逗号分隔
     */
    private String attrVals;

    private static final long serialVersionUID = 1L;

    public Short getAttrId() {
        return attrId;
    }

    public void setAttrId(Short attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getAttrSel() {
        return attrSel;
    }

    public void setAttrSel(String attrSel) {
        this.attrSel = attrSel;
    }

    public String getAttrWrite() {
        return attrWrite;
    }

    public void setAttrWrite(String attrWrite) {
        this.attrWrite = attrWrite;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getAttrVals() {
        return attrVals;
    }

    public void setAttrVals(String attrVals) {
        this.attrVals = attrVals;
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
        SpAttribute other = (SpAttribute) that;
        return (this.getAttrId() == null ? other.getAttrId() == null : this.getAttrId().equals(other.getAttrId()))
            && (this.getAttrName() == null ? other.getAttrName() == null : this.getAttrName().equals(other.getAttrName()))
            && (this.getCatId() == null ? other.getCatId() == null : this.getCatId().equals(other.getCatId()))
            && (this.getAttrSel() == null ? other.getAttrSel() == null : this.getAttrSel().equals(other.getAttrSel()))
            && (this.getAttrWrite() == null ? other.getAttrWrite() == null : this.getAttrWrite().equals(other.getAttrWrite()))
            && (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()))
            && (this.getAttrVals() == null ? other.getAttrVals() == null : this.getAttrVals().equals(other.getAttrVals()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAttrId() == null) ? 0 : getAttrId().hashCode());
        result = prime * result + ((getAttrName() == null) ? 0 : getAttrName().hashCode());
        result = prime * result + ((getCatId() == null) ? 0 : getCatId().hashCode());
        result = prime * result + ((getAttrSel() == null) ? 0 : getAttrSel().hashCode());
        result = prime * result + ((getAttrWrite() == null) ? 0 : getAttrWrite().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        result = prime * result + ((getAttrVals() == null) ? 0 : getAttrVals().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attrId=").append(attrId);
        sb.append(", attrName=").append(attrName);
        sb.append(", catId=").append(catId);
        sb.append(", attrSel=").append(attrSel);
        sb.append(", attrWrite=").append(attrWrite);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", attrVals=").append(attrVals);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}