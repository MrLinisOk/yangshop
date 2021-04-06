package com.shop.yangshop.po;

import java.io.Serializable;
import java.util.Date;

/**
 * sp_report_1
 * @author 
 */
public class SpReport1 implements Serializable {
    private Integer id;

    /**
     * 用户数
     */
    private Integer rp1UserCount;

    /**
     * 地区
     */
    private String rp1Area;

    private Date rp1Date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRp1UserCount() {
        return rp1UserCount;
    }

    public void setRp1UserCount(Integer rp1UserCount) {
        this.rp1UserCount = rp1UserCount;
    }

    public String getRp1Area() {
        return rp1Area;
    }

    public void setRp1Area(String rp1Area) {
        this.rp1Area = rp1Area;
    }

    public Date getRp1Date() {
        return rp1Date;
    }

    public void setRp1Date(Date rp1Date) {
        this.rp1Date = rp1Date;
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
        SpReport1 other = (SpReport1) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRp1UserCount() == null ? other.getRp1UserCount() == null : this.getRp1UserCount().equals(other.getRp1UserCount()))
            && (this.getRp1Area() == null ? other.getRp1Area() == null : this.getRp1Area().equals(other.getRp1Area()))
            && (this.getRp1Date() == null ? other.getRp1Date() == null : this.getRp1Date().equals(other.getRp1Date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRp1UserCount() == null) ? 0 : getRp1UserCount().hashCode());
        result = prime * result + ((getRp1Area() == null) ? 0 : getRp1Area().hashCode());
        result = prime * result + ((getRp1Date() == null) ? 0 : getRp1Date().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rp1UserCount=").append(rp1UserCount);
        sb.append(", rp1Area=").append(rp1Area);
        sb.append(", rp1Date=").append(rp1Date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}