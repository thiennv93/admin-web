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
@Table(name = "product_global_option_links")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductGlobalOptionLinks.findAll", query = "SELECT p FROM ProductGlobalOptionLinks p")
    , @NamedQuery(name = "ProductGlobalOptionLinks.findByOptionId", query = "SELECT p FROM ProductGlobalOptionLinks p WHERE p.productGlobalOptionLinksPK.optionId = :optionId")
    , @NamedQuery(name = "ProductGlobalOptionLinks.findByProductId", query = "SELECT p FROM ProductGlobalOptionLinks p WHERE p.productGlobalOptionLinksPK.productId = :productId")})
public class ProductGlobalOptionLinks implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductGlobalOptionLinksPK productGlobalOptionLinksPK;

    public ProductGlobalOptionLinks() {
    }

    public ProductGlobalOptionLinks(ProductGlobalOptionLinksPK productGlobalOptionLinksPK) {
        this.productGlobalOptionLinksPK = productGlobalOptionLinksPK;
    }

    public ProductGlobalOptionLinks(int optionId, int productId) {
        this.productGlobalOptionLinksPK = new ProductGlobalOptionLinksPK(optionId, productId);
    }

    public ProductGlobalOptionLinksPK getProductGlobalOptionLinksPK() {
        return productGlobalOptionLinksPK;
    }

    public void setProductGlobalOptionLinksPK(ProductGlobalOptionLinksPK productGlobalOptionLinksPK) {
        this.productGlobalOptionLinksPK = productGlobalOptionLinksPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productGlobalOptionLinksPK != null ? productGlobalOptionLinksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductGlobalOptionLinks)) {
            return false;
        }
        ProductGlobalOptionLinks other = (ProductGlobalOptionLinks) object;
        if ((this.productGlobalOptionLinksPK == null && other.productGlobalOptionLinksPK != null) || (this.productGlobalOptionLinksPK != null && !this.productGlobalOptionLinksPK.equals(other.productGlobalOptionLinksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductGlobalOptionLinks[ productGlobalOptionLinksPK=" + productGlobalOptionLinksPK + " ]";
    }
    
}
