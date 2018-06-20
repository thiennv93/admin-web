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
@Table(name = "product_subscriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductSubscriptions.findAll", query = "SELECT p FROM ProductSubscriptions p")
    , @NamedQuery(name = "ProductSubscriptions.findBySubscriptionId", query = "SELECT p FROM ProductSubscriptions p WHERE p.subscriptionId = :subscriptionId")
    , @NamedQuery(name = "ProductSubscriptions.findByProductId", query = "SELECT p FROM ProductSubscriptions p WHERE p.productId = :productId")
    , @NamedQuery(name = "ProductSubscriptions.findByUserId", query = "SELECT p FROM ProductSubscriptions p WHERE p.userId = :userId")
    , @NamedQuery(name = "ProductSubscriptions.findByEmail", query = "SELECT p FROM ProductSubscriptions p WHERE p.email = :email")})
public class ProductSubscriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "subscription_id")
    private Integer subscriptionId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public ProductSubscriptions() {
    }

    public ProductSubscriptions(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public ProductSubscriptions(Integer subscriptionId, int productId, int userId, String email) {
        this.subscriptionId = subscriptionId;
        this.productId = productId;
        this.userId = userId;
        this.email = email;
    }

    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionId != null ? subscriptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductSubscriptions)) {
            return false;
        }
        ProductSubscriptions other = (ProductSubscriptions) object;
        if ((this.subscriptionId == null && other.subscriptionId != null) || (this.subscriptionId != null && !this.subscriptionId.equals(other.subscriptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductSubscriptions[ subscriptionId=" + subscriptionId + " ]";
    }
    
}
