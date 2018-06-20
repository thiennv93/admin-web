/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "supplier_links")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SupplierLinks.findAll", query = "SELECT s FROM SupplierLinks s")
    , @NamedQuery(name = "SupplierLinks.findBySupplierId", query = "SELECT s FROM SupplierLinks s WHERE s.supplierLinksPK.supplierId = :supplierId")
    , @NamedQuery(name = "SupplierLinks.findByObjectId", query = "SELECT s FROM SupplierLinks s WHERE s.supplierLinksPK.objectId = :objectId")
    , @NamedQuery(name = "SupplierLinks.findByObjectType", query = "SELECT s FROM SupplierLinks s WHERE s.supplierLinksPK.objectType = :objectType")})
public class SupplierLinks implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SupplierLinksPK supplierLinksPK;

    public SupplierLinks() {
    }

    public SupplierLinks(SupplierLinksPK supplierLinksPK) {
        this.supplierLinksPK = supplierLinksPK;
    }

    public SupplierLinks(int supplierId, int objectId, Character objectType) {
        this.supplierLinksPK = new SupplierLinksPK(supplierId, objectId, objectType);
    }

    public SupplierLinksPK getSupplierLinksPK() {
        return supplierLinksPK;
    }

    public void setSupplierLinksPK(SupplierLinksPK supplierLinksPK) {
        this.supplierLinksPK = supplierLinksPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supplierLinksPK != null ? supplierLinksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierLinks)) {
            return false;
        }
        SupplierLinks other = (SupplierLinks) object;
        if ((this.supplierLinksPK == null && other.supplierLinksPK != null) || (this.supplierLinksPK != null && !this.supplierLinksPK.equals(other.supplierLinksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SupplierLinks[ supplierLinksPK=" + supplierLinksPK + " ]";
    }
    
}
