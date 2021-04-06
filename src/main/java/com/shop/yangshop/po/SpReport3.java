package com.shop.yangshop.po;

import java.io.Serializable;
import java.util.Date;

/**
 * sp_report_3
 * @author 
 */
public class SpReport3 implements Serializable {
    private Integer id;

    /**
     * 用户来源
     */
    private String rp3Src;

    /**
     * 数量
     */
    private Integer rp3Count;

    private Date rp3Date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRp3Src() {
        return rp3Src;
    }

    public void setRp3Src(String rp3Src) {
        this.rp3Src = rp3Src;
    }

    public Integer getRp3Count() {
        return rp3Count;
    }

    public void setRp3Count(Integer rp3Count) {
        this.rp3Count = rp3Count;
    }

    public Date getRp3Date() {
        return rp3Date;
    }

    public void setRp3Date(Date rp3Date) {
        this.rp3Date = rp3Date;
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
        SpReport3 other = (SpReport3) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRp3Src() == null ? other.getRp3Src() == null : this.getRp3Src().equals(other.getRp3Src()))
            && (this.getRp3Count() == null ? other.getRp3Count() == null : this.getRp3Count().equals(other.getRp3Count()))
            && (this.getRp3Date() == null ? other.getRp3Date() == null : this.getRp3Date().equals(other.getRp3Date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRp3Src() == null) ? 0 : getRp3Src().hashCode());
        result = prime * result + ((getRp3Count() == null) ? 0 : getRp3Count().hashCode());
        result = prime * result + ((getRp3Date() == null) ? 0 : getRp3Date().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rp3Src=").append(rp3Src);
        sb.append(", rp3Count=").append(rp3Count);
        sb.append(", rp3Date=").append(rp3Date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}