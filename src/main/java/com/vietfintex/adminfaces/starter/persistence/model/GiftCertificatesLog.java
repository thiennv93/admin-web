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
@Table(name = "gift_certificates_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GiftCertificatesLog.findAll", query = "SELECT g FROM GiftCertificatesLog g")
    , @NamedQuery(name = "GiftCertificatesLog.findByLogId", query = "SELECT g FROM GiftCertificatesLog g WHERE g.logId = :logId")
    , @NamedQuery(name = "GiftCertificatesLog.findByGiftCertId", query = "SELECT g FROM GiftCertificatesLog g WHERE g.giftCertId = :giftCertId")
    , @NamedQuery(name = "GiftCertificatesLog.findByArea", query = "SELECT g FROM GiftCertificatesLog g WHERE g.area = :area")
    , @NamedQuery(name = "GiftCertificatesLog.findByUserId", query = "SELECT g FROM GiftCertificatesLog g WHERE g.userId = :userId")
    , @NamedQuery(name = "GiftCertificatesLog.findByOrderId", query = "SELECT g FROM GiftCertificatesLog g WHERE g.orderId = :orderId")
    , @NamedQuery(name = "GiftCertificatesLog.findByTimestamp", query = "SELECT g FROM GiftCertificatesLog g WHERE g.timestamp = :timestamp")
    , @NamedQuery(name = "GiftCertificatesLog.findByAmount", query = "SELECT g FROM GiftCertificatesLog g WHERE g.amount = :amount")
    , @NamedQuery(name = "GiftCertificatesLog.findByDebit", query = "SELECT g FROM GiftCertificatesLog g WHERE g.debit = :debit")})
public class GiftCertificatesLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "log_id")
    private Integer logId;
    @Basic(optional = false)
    @Column(name = "gift_cert_id")
    private int giftCertId;
    @Basic(optional = false)
    @Column(name = "area")
    private Character area;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic(optional = false)
    @Column(name = "debit")
    private BigDecimal debit;
    @Lob
    @Column(name = "products")
    private String products;
    @Lob
    @Column(name = "debit_products")
    private String debitProducts;

    public GiftCertificatesLog() {
    }

    public GiftCertificatesLog(Integer logId) {
        this.logId = logId;
    }

    public GiftCertificatesLog(Integer logId, int giftCertId, Character area, int userId, int orderId, int timestamp, BigDecimal amount, BigDecimal debit) {
        this.logId = logId;
        this.giftCertId = giftCertId;
        this.area = area;
        this.userId = userId;
        this.orderId = orderId;
        this.timestamp = timestamp;
        this.amount = amount;
        this.debit = debit;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public int getGiftCertId() {
        return giftCertId;
    }

    public void setGiftCertId(int giftCertId) {
        this.giftCertId = giftCertId;
    }

    public Character getArea() {
        return area;
    }

    public void setArea(Character area) {
        this.area = area;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getDebit() {
        return debit;
    }

    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getDebitProducts() {
        return debitProducts;
    }

    public void setDebitProducts(String debitProducts) {
        this.debitProducts = debitProducts;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logId != null ? logId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GiftCertificatesLog)) {
            return false;
        }
        GiftCertificatesLog other = (GiftCertificatesLog) object;
        if ((this.logId == null && other.logId != null) || (this.logId != null && !this.logId.equals(other.logId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GiftCertificatesLog[ logId=" + logId + " ]";
    }
    
}
