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
@Table(name = "product_sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductSales.findAll", query = "SELECT p FROM ProductSales p")
    , @NamedQuery(name = "ProductSales.findByCategoryId", query = "SELECT p FROM ProductSales p WHERE p.productSalesPK.categoryId = :categoryId")
    , @NamedQuery(name = "ProductSales.findByProductId", query = "SELECT p FROM ProductSales p WHERE p.productSalesPK.productId = :productId")
    , @NamedQuery(name = "ProductSales.findByAmount", query = "SELECT p FROM ProductSales p WHERE p.amount = :amount")})
public class ProductSales implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductSalesPK productSalesPK;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;

    public ProductSales() {
    }

    public ProductSales(ProductSalesPK productSalesPK) {
        this.productSalesPK = productSalesPK;
    }

    public ProductSales(ProductSalesPK productSalesPK, int amount) {
        this.productSalesPK = productSalesPK;
        this.amount = amount;
    }

    public ProductSales(int categoryId, int productId) {
        this.productSalesPK = new ProductSalesPK(categoryId, productId);
    }

    public ProductSalesPK getProductSalesPK() {
        return productSalesPK;
    }

    public void setProductSalesPK(ProductSalesPK productSalesPK) {
        this.productSalesPK = productSalesPK;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productSalesPK != null ? productSalesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductSales)) {
            return false;
        }
        ProductSales other = (ProductSales) object;
        if ((this.productSalesPK == null && other.productSalesPK != null) || (this.productSalesPK != null && !this.productSalesPK.equals(other.productSalesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductSales[ productSalesPK=" + productSalesPK + " ]";
    }
    
}
