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
@Table(name = "product_required_products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductRequiredProducts.findAll", query = "SELECT p FROM ProductRequiredProducts p")
    , @NamedQuery(name = "ProductRequiredProducts.findByProductId", query = "SELECT p FROM ProductRequiredProducts p WHERE p.productRequiredProductsPK.productId = :productId")
    , @NamedQuery(name = "ProductRequiredProducts.findByRequiredId", query = "SELECT p FROM ProductRequiredProducts p WHERE p.productRequiredProductsPK.requiredId = :requiredId")})
public class ProductRequiredProducts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductRequiredProductsPK productRequiredProductsPK;

    public ProductRequiredProducts() {
    }

    public ProductRequiredProducts(ProductRequiredProductsPK productRequiredProductsPK) {
        this.productRequiredProductsPK = productRequiredProductsPK;
    }

    public ProductRequiredProducts(int productId, int requiredId) {
        this.productRequiredProductsPK = new ProductRequiredProductsPK(productId, requiredId);
    }

    public ProductRequiredProductsPK getProductRequiredProductsPK() {
        return productRequiredProductsPK;
    }

    public void setProductRequiredProductsPK(ProductRequiredProductsPK productRequiredProductsPK) {
        this.productRequiredProductsPK = productRequiredProductsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productRequiredProductsPK != null ? productRequiredProductsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductRequiredProducts)) {
            return false;
        }
        ProductRequiredProducts other = (ProductRequiredProducts) object;
        if ((this.productRequiredProductsPK == null && other.productRequiredProductsPK != null) || (this.productRequiredProductsPK != null && !this.productRequiredProductsPK.equals(other.productRequiredProductsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductRequiredProducts[ productRequiredProductsPK=" + productRequiredProductsPK + " ]";
    }
    
}
