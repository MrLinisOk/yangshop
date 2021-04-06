package com.shop.yangshop.po;

import java.io.Serializable;
import java.util.Date;

/**
 * sp_report_2
 * @author 
 */
public class SpReport2 implements Serializable {
    private Integer id;

    private String rp2Page;

    private Integer rp2Count;

    private Date rp2Date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRp2Page() {
        return rp2Page;
    }

    public void setRp2Page(String rp2Page) {
        this.rp2Page = rp2Page;
    }

    public Integer getRp2Count() {
        return rp2Count;
    }

    public void setRp2Count(Integer rp2Count) {
        this.rp2Count = rp2Count;
    }

    public Date getRp2Date() {
        return rp2Date;
    }

    public void setRp2Date(Date rp2Date) {
        this.rp2Date = rp2Date;
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
        SpReport2 other = (SpReport2) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRp2Page() == null ? other.getRp2Page() == null : this.getRp2Page().equals(other.getRp2Page()))
            && (this.getRp2Count() == null ? other.getRp2Count() == null : this.getRp2Count().equals(other.getRp2Count()))
            && (this.getRp2Date() == null ? other.getRp2Date() == null : this.getRp2Date().equals(other.getRp2Date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRp2Page() == null) ? 0 : getRp2Page().hashCode());
        result = prime * result + ((getRp2Count() == null) ? 0 : getRp2Count().hashCode());
        result = prime * result + ((getRp2Date() == null) ? 0 : getRp2Date().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rp2Page=").append(rp2Page);
        sb.append(", rp2Count=").append(rp2Count);
        sb.append(", rp2Date=").append(rp2Date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}