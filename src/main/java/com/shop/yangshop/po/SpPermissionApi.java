package com.shop.yangshop.po;

import java.io.Serializable;

/**
 * sp_permission_api
 * @author 
 */
public class SpPermissionApi implements Serializable {
    private Integer id;

    private Integer psId;

    private String psApiService;

    private String psApiAction;

    private String psApiPath;

    private Integer psApiOrder;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getPsApiService() {
        return psApiService;
    }

    public void setPsApiService(String psApiService) {
        this.psApiService = psApiService;
    }

    public String getPsApiAction() {
        return psApiAction;
    }

    public void setPsApiAction(String psApiAction) {
        this.psApiAction = psApiAction;
    }

    public String getPsApiPath() {
        return psApiPath;
    }

    public void setPsApiPath(String psApiPath) {
        this.psApiPath = psApiPath;
    }

    public Integer getPsApiOrder() {
        return psApiOrder;
    }

    public void setPsApiOrder(Integer psApiOrder) {
        this.psApiOrder = psApiOrder;
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
        SpPermissionApi other = (SpPermissionApi) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPsId() == null ? other.getPsId() == null : this.getPsId().equals(other.getPsId()))
            && (this.getPsApiService() == null ? other.getPsApiService() == null : this.getPsApiService().equals(other.getPsApiService()))
            && (this.getPsApiAction() == null ? other.getPsApiAction() == null : this.getPsApiAction().equals(other.getPsApiAction()))
            && (this.getPsApiPath() == null ? other.getPsApiPath() == null : this.getPsApiPath().equals(other.getPsApiPath()))
            && (this.getPsApiOrder() == null ? other.getPsApiOrder() == null : this.getPsApiOrder().equals(other.getPsApiOrder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPsId() == null) ? 0 : getPsId().hashCode());
        result = prime * result + ((getPsApiService() == null) ? 0 : getPsApiService().hashCode());
        result = prime * result + ((getPsApiAction() == null) ? 0 : getPsApiAction().hashCode());
        result = prime * result + ((getPsApiPath() == null) ? 0 : getPsApiPath().hashCode());
        result = prime * result + ((getPsApiOrder() == null) ? 0 : getPsApiOrder().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", psId=").append(psId);
        sb.append(", psApiService=").append(psApiService);
        sb.append(", psApiAction=").append(psApiAction);
        sb.append(", psApiPath=").append(psApiPath);
        sb.append(", psApiOrder=").append(psApiOrder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}