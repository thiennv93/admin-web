/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "rma_return_products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RmaReturnProducts.findAll", query = "SELECT r FROM RmaReturnProducts r")
    , @NamedQuery(name = "RmaReturnProducts.findByReturnId", query = "SELECT r FROM RmaReturnProducts r WHERE r.rmaReturnProductsPK.returnId = :returnId")
    , @NamedQuery(name = "RmaReturnProducts.findByItemId", query = "SELECT r FROM RmaReturnProducts r WHERE r.rmaReturnProductsPK.itemId = :itemId")
    , @NamedQuery(name = "RmaReturnProducts.findByProductId", query = "SELECT r FROM RmaReturnProducts r WHERE r.productId = :productId")
    , @NamedQuery(name = "RmaReturnProducts.findByReason", query = "SELECT r FROM RmaReturnProducts r WHERE r.reason = :reason")
    , @NamedQuery(name = "RmaReturnProducts.findByAmount", query = "SELECT r FROM RmaReturnProducts r WHERE r.amount = :amount")
    , @NamedQuery(name = "RmaReturnProducts.findByType", query = "SELECT r FROM RmaReturnProducts r WHERE r.rmaReturnProductsPK.type = :type")
    , @NamedQuery(name = "RmaReturnProducts.findByPrice", query = "SELECT r FROM RmaReturnProducts r WHERE r.price = :price")
    , @NamedQuery(name = "RmaReturnProducts.findByProduct", query = "SELECT r FROM RmaReturnProducts r WHERE r.product = :product")})
public class RmaReturnProducts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RmaReturnProductsPK rmaReturnProductsPK;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "reason")
    private int reason;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "price")
    private BigDecimal price;
    @Lob
    @Column(name = "product_options")
    private String productOptions;
    @Basic(optional = false)
    @Column(name = "product")
    private String product;

    public RmaReturnProducts() {
    }

    public RmaReturnProducts(RmaReturnProductsPK rmaReturnProductsPK) {
        this.rmaReturnProductsPK = rmaReturnProductsPK;
    }

    public RmaReturnProducts(RmaReturnProductsPK rmaReturnProductsPK, int productId, int reason, int amount, BigDecimal price, String product) {
        this.rmaReturnProductsPK = rmaReturnProductsPK;
        this.productId = productId;
        this.reason = reason;
        this.amount = amount;
        this.price = price;
        this.product = product;
    }

    public RmaReturnProducts(int returnId, int itemId, Character type) {
        this.rmaReturnProductsPK = new RmaReturnProductsPK(returnId, itemId, type);
    }

    public RmaReturnProductsPK getRmaReturnProductsPK() {
        return rmaReturnProductsPK;
    }

    public void setRmaReturnProductsPK(RmaReturnProductsPK rmaReturnProductsPK) {
        this.rmaReturnProductsPK = rmaReturnProductsPK;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getReason() {
        return reason;
    }

    public void setReason(int reason) {
        this.reason = reason;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductOptions() {
        return productOptions;
    }

    public void setProductOptions(String productOptions) {
        this.productOptions = productOptions;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rmaReturnProductsPK != null ? rmaReturnProductsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RmaReturnProducts)) {
            return false;
        }
        RmaReturnProducts other = (RmaReturnProducts) object;
        if ((this.rmaReturnProductsPK == null && other.rmaReturnProductsPK != null) || (this.rmaReturnProductsPK != null && !this.rmaReturnProductsPK.equals(other.rmaReturnProductsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RmaReturnProducts[ rmaReturnProductsPK=" + rmaReturnProductsPK + " ]";
    }
    
}
