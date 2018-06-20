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
@Table(name = "user_session_products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserSessionProducts.findAll", query = "SELECT u FROM UserSessionProducts u")
    , @NamedQuery(name = "UserSessionProducts.findByUserId", query = "SELECT u FROM UserSessionProducts u WHERE u.userSessionProductsPK.userId = :userId")
    , @NamedQuery(name = "UserSessionProducts.findByTimestamp", query = "SELECT u FROM UserSessionProducts u WHERE u.timestamp = :timestamp")
    , @NamedQuery(name = "UserSessionProducts.findByType", query = "SELECT u FROM UserSessionProducts u WHERE u.userSessionProductsPK.type = :type")
    , @NamedQuery(name = "UserSessionProducts.findByUserType", query = "SELECT u FROM UserSessionProducts u WHERE u.userSessionProductsPK.userType = :userType")
    , @NamedQuery(name = "UserSessionProducts.findByItemId", query = "SELECT u FROM UserSessionProducts u WHERE u.userSessionProductsPK.itemId = :itemId")
    , @NamedQuery(name = "UserSessionProducts.findByItemType", query = "SELECT u FROM UserSessionProducts u WHERE u.itemType = :itemType")
    , @NamedQuery(name = "UserSessionProducts.findByProductId", query = "SELECT u FROM UserSessionProducts u WHERE u.productId = :productId")
    , @NamedQuery(name = "UserSessionProducts.findByAmount", query = "SELECT u FROM UserSessionProducts u WHERE u.amount = :amount")
    , @NamedQuery(name = "UserSessionProducts.findByPrice", query = "SELECT u FROM UserSessionProducts u WHERE u.price = :price")
    , @NamedQuery(name = "UserSessionProducts.findBySessionId", query = "SELECT u FROM UserSessionProducts u WHERE u.sessionId = :sessionId")
    , @NamedQuery(name = "UserSessionProducts.findByOrderId", query = "SELECT u FROM UserSessionProducts u WHERE u.orderId = :orderId")})
public class UserSessionProducts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserSessionProductsPK userSessionProductsPK;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "item_type")
    private Character itemType;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "price")
    private BigDecimal price;
    @Lob
    @Column(name = "extra")
    private String extra;
    @Basic(optional = false)
    @Column(name = "session_id")
    private String sessionId;
    @Basic(optional = false)
    @Lob
    @Column(name = "ip_address")
    private byte[] ipAddress;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;

    public UserSessionProducts() {
    }

    public UserSessionProducts(UserSessionProductsPK userSessionProductsPK) {
        this.userSessionProductsPK = userSessionProductsPK;
    }

    public UserSessionProducts(UserSessionProductsPK userSessionProductsPK, int timestamp, Character itemType, int productId, int amount, BigDecimal price, String sessionId, byte[] ipAddress, int orderId) {
        this.userSessionProductsPK = userSessionProductsPK;
        this.timestamp = timestamp;
        this.itemType = itemType;
        this.productId = productId;
        this.amount = amount;
        this.price = price;
        this.sessionId = sessionId;
        this.ipAddress = ipAddress;
        this.orderId = orderId;
    }

    public UserSessionProducts(int userId, Character type, Character userType, int itemId) {
        this.userSessionProductsPK = new UserSessionProductsPK(userId, type, userType, itemId);
    }

    public UserSessionProductsPK getUserSessionProductsPK() {
        return userSessionProductsPK;
    }

    public void setUserSessionProductsPK(UserSessionProductsPK userSessionProductsPK) {
        this.userSessionProductsPK = userSessionProductsPK;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public Character getItemType() {
        return itemType;
    }

    public void setItemType(Character itemType) {
        this.itemType = itemType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public byte[] getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(byte[] ipAddress) {
        this.ipAddress = ipAddress;
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
        hash += (userSessionProductsPK != null ? userSessionProductsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserSessionProducts)) {
            return false;
        }
        UserSessionProducts other = (UserSessionProducts) object;
        if ((this.userSessionProductsPK == null && other.userSessionProductsPK != null) || (this.userSessionProductsPK != null && !this.userSessionProductsPK.equals(other.userSessionProductsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UserSessionProducts[ userSessionProductsPK=" + userSessionProductsPK + " ]";
    }
    
}
