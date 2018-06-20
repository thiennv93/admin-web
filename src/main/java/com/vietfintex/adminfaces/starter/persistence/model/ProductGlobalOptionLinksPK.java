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
public class ProductGlobalOptionLinksPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "option_id")
    private int optionId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;

    public ProductGlobalOptionLinksPK() {
    }

    public ProductGlobalOptionLinksPK(int optionId, int productId) {
        this.optionId = optionId;
        this.productId = productId;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) optionId;
        hash += (int) productId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductGlobalOptionLinksPK)) {
            return false;
        }
        ProductGlobalOptionLinksPK other = (ProductGlobalOptionLinksPK) object;
        if (this.optionId != other.optionId) {
            return false;
        }
        if (this.productId != other.productId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductGlobalOptionLinksPK[ optionId=" + optionId + ", productId=" + productId + " ]";
    }
    
}
