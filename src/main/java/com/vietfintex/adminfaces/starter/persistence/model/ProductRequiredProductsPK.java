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
public class ProductRequiredProductsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "required_id")
    private int requiredId;

    public ProductRequiredProductsPK() {
    }

    public ProductRequiredProductsPK(int productId, int requiredId) {
        this.productId = productId;
        this.requiredId = requiredId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getRequiredId() {
        return requiredId;
    }

    public void setRequiredId(int requiredId) {
        this.requiredId = requiredId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productId;
        hash += (int) requiredId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductRequiredProductsPK)) {
            return false;
        }
        ProductRequiredProductsPK other = (ProductRequiredProductsPK) object;
        if (this.productId != other.productId) {
            return false;
        }
        if (this.requiredId != other.requiredId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductRequiredProductsPK[ productId=" + productId + ", requiredId=" + requiredId + " ]";
    }
    
}
