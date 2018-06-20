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
public class SupplierLinksPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "supplier_id")
    private int supplierId;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "object_type")
    private Character objectType;

    public SupplierLinksPK() {
    }

    public SupplierLinksPK(int supplierId, int objectId, Character objectType) {
        this.supplierId = supplierId;
        this.objectId = objectId;
        this.objectType = objectType;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Character getObjectType() {
        return objectType;
    }

    public void setObjectType(Character objectType) {
        this.objectType = objectType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) supplierId;
        hash += (int) objectId;
        hash += (objectType != null ? objectType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierLinksPK)) {
            return false;
        }
        SupplierLinksPK other = (SupplierLinksPK) object;
        if (this.supplierId != other.supplierId) {
            return false;
        }
        if (this.objectId != other.objectId) {
            return false;
        }
        if ((this.objectType == null && other.objectType != null) || (this.objectType != null && !this.objectType.equals(other.objectType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SupplierLinksPK[ supplierId=" + supplierId + ", objectId=" + objectId + ", objectType=" + objectType + " ]";
    }
    
}
