/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Embeddable
public class StatusDataPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "status_id")
    private int statusId;
    @Basic(optional = false)
    @Column(name = "param")
    private String param;

    public StatusDataPK() {
    }

    public StatusDataPK(int statusId, String param) {
        this.statusId = statusId;
        this.param = param;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) statusId;
        hash += (param != null ? param.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusDataPK)) {
            return false;
        }
        StatusDataPK other = (StatusDataPK) object;
        if (this.statusId != other.statusId) {
            return false;
        }
        if ((this.param == null && other.param != null) || (this.param != null && !this.param.equals(other.param))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StatusDataPK[ statusId=" + statusId + ", param=" + param + " ]";
    }
    
}
