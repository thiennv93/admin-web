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
public class ProductFileEkeysPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "file_id")
    private int fileId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;

    public ProductFileEkeysPK() {
    }

    public ProductFileEkeysPK(int fileId, int orderId) {
        this.fileId = fileId;
        this.orderId = orderId;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fileId;
        hash += (int) orderId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFileEkeysPK)) {
            return false;
        }
        ProductFileEkeysPK other = (ProductFileEkeysPK) object;
        if (this.fileId != other.fileId) {
            return false;
        }
        if (this.orderId != other.orderId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFileEkeysPK[ fileId=" + fileId + ", orderId=" + orderId + " ]";
    }
    
}
