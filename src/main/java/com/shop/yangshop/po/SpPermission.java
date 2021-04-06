package com.shop.yangshop.po;

import java.io.Serializable;

/**
 * sp_permission
 * @author 
 */
public class SpPermission implements Serializable {
    private Short psId;

    /**
     * 权限名称
     */
    private String psName;

    /**
     * 父id
     */
    private Short psPid;

    /**
     * 控制器
     */
    private String psC;

    /**
     * 操作方法
     */
    private String psA;

    /**
     * 权限等级
     */
    private String psLevel;

    private static final long serialVersionUID = 1L;

    public Short getPsId() {
        return psId;
    }

    public void setPsId(Short psId) {
        this.psId = psId;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName;
    }

    public Short getPsPid() {
        return psPid;
    }

    public void setPsPid(Short psPid) {
        this.psPid = psPid;
    }

    public String getPsC() {
        return psC;
    }

    public void setPsC(String psC) {
        this.psC = psC;
    }

    public String getPsA() {
        return psA;
    }

    public void setPsA(String psA) {
        this.psA = psA;
    }

    public String getPsLevel() {
        return psLevel;
    }

    public void setPsLevel(String psLevel) {
        this.psLevel = psLevel;
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
        SpPermission other = (SpPermission) that;
        return (this.getPsId() == null ? other.getPsId() == null : this.getPsId().equals(other.getPsId()))
            && (this.getPsName() == null ? other.getPsName() == null : this.getPsName().equals(other.getPsName()))
            && (this.getPsPid() == null ? other.getPsPid() == null : this.getPsPid().equals(other.getPsPid()))
            && (this.getPsC() == null ? other.getPsC() == null : this.getPsC().equals(other.getPsC()))
            && (this.getPsA() == null ? other.getPsA() == null : this.getPsA().equals(other.getPsA()))
            && (this.getPsLevel() == null ? other.getPsLevel() == null : this.getPsLevel().equals(other.getPsLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPsId() == null) ? 0 : getPsId().hashCode());
        result = prime * result + ((getPsName() == null) ? 0 : getPsName().hashCode());
        result = prime * result + ((getPsPid() == null) ? 0 : getPsPid().hashCode());
        result = prime * result + ((getPsC() == null) ? 0 : getPsC().hashCode());
        result = prime * result + ((getPsA() == null) ? 0 : getPsA().hashCode());
        result = prime * result + ((getPsLevel() == null) ? 0 : getPsLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", psId=").append(psId);
        sb.append(", psName=").append(psName);
        sb.append(", psPid=").append(psPid);
        sb.append(", psC=").append(psC);
        sb.append(", psA=").append(psA);
        sb.append(", psLevel=").append(psLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}