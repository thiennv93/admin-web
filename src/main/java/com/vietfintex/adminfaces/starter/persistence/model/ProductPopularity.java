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
@Table(name = "product_popularity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductPopularity.findAll", query = "SELECT p FROM ProductPopularity p")
    , @NamedQuery(name = "ProductPopularity.findByProductId", query = "SELECT p FROM ProductPopularity p WHERE p.productId = :productId")
    , @NamedQuery(name = "ProductPopularity.findByViewed", query = "SELECT p FROM ProductPopularity p WHERE p.viewed = :viewed")
    , @NamedQuery(name = "ProductPopularity.findByAdded", query = "SELECT p FROM ProductPopularity p WHERE p.added = :added")
    , @NamedQuery(name = "ProductPopularity.findByDeleted", query = "SELECT p FROM ProductPopularity p WHERE p.deleted = :deleted")
    , @NamedQuery(name = "ProductPopularity.findByBought", query = "SELECT p FROM ProductPopularity p WHERE p.bought = :bought")
    , @NamedQuery(name = "ProductPopularity.findByTotal", query = "SELECT p FROM ProductPopularity p WHERE p.total = :total")})
public class ProductPopularity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Basic(optional = false)
    @Column(name = "viewed")
    private int viewed;
    @Basic(optional = false)
    @Column(name = "added")
    private int added;
    @Basic(optional = false)
    @Column(name = "deleted")
    private int deleted;
    @Basic(optional = false)
    @Column(name = "bought")
    private int bought;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;

    public ProductPopularity() {
    }

    public ProductPopularity(Integer productId) {
        this.productId = productId;
    }

    public ProductPopularity(Integer productId, int viewed, int added, int deleted, int bought, int total) {
        this.productId = productId;
        this.viewed = viewed;
        this.added = added;
        this.deleted = deleted;
        this.bought = bought;
        this.total = total;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public int getViewed() {
        return viewed;
    }

    public void setViewed(int viewed) {
        this.viewed = viewed;
    }

    public int getAdded() {
        return added;
    }

    public void setAdded(int added) {
        this.added = added;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public int getBought() {
        return bought;
    }

    public void setBought(int bought) {
        this.bought = bought;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPopularity)) {
            return false;
        }
        ProductPopularity other = (ProductPopularity) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductPopularity[ productId=" + productId + " ]";
    }
    
}
