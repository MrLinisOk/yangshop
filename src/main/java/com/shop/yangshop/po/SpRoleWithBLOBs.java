package com.shop.yangshop.po;

import java.io.Serializable;

/**
 * sp_role
 * @author 
 */
public class SpRoleWithBLOBs extends SpRole implements Serializable {
    /**
     * 控制器-操作,控制器-操作,控制器-操作
     */
    private String psCa;

    private String roleDesc;

    private static final long serialVersionUID = 1L;

    public String getPsCa() {
        return psCa;
    }

    public void setPsCa(String psCa) {
        this.psCa = psCa;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
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
        SpRoleWithBLOBs other = (SpRoleWithBLOBs) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getPsIds() == null ? other.getPsIds() == null : this.getPsIds().equals(other.getPsIds()))
            && (this.getPsCa() == null ? other.getPsCa() == null : this.getPsCa().equals(other.getPsCa()))
            && (this.getRoleDesc() == null ? other.getRoleDesc() == null : this.getRoleDesc().equals(other.getRoleDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getPsIds() == null) ? 0 : getPsIds().hashCode());
        result = prime * result + ((getPsCa() == null) ? 0 : getPsCa().hashCode());
        result = prime * result + ((getRoleDesc() == null) ? 0 : getRoleDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", psCa=").append(psCa);
        sb.append(", roleDesc=").append(roleDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}