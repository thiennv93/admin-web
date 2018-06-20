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
public class HybridAuthUsersPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "provider_id")
    private int providerId;

    public HybridAuthUsersPK() {
    }

    public HybridAuthUsersPK(int userId, int providerId) {
        this.userId = userId;
        this.providerId = providerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) userId;
        hash += (int) providerId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HybridAuthUsersPK)) {
            return false;
        }
        HybridAuthUsersPK other = (HybridAuthUsersPK) object;
        if (this.userId != other.userId) {
            return false;
        }
        if (this.providerId != other.providerId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HybridAuthUsersPK[ userId=" + userId + ", providerId=" + providerId + " ]";
    }
    
}
