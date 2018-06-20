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
@Table(name = "ebay_cached_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbayCachedTransactions.findAll", query = "SELECT e FROM EbayCachedTransactions e")
    , @NamedQuery(name = "EbayCachedTransactions.findByTransactionId", query = "SELECT e FROM EbayCachedTransactions e WHERE e.transactionId = :transactionId")
    , @NamedQuery(name = "EbayCachedTransactions.findByTimestamp", query = "SELECT e FROM EbayCachedTransactions e WHERE e.timestamp = :timestamp")
    , @NamedQuery(name = "EbayCachedTransactions.findByUserId", query = "SELECT e FROM EbayCachedTransactions e WHERE e.userId = :userId")
    , @NamedQuery(name = "EbayCachedTransactions.findBySessionId", query = "SELECT e FROM EbayCachedTransactions e WHERE e.sessionId = :sessionId")
    , @NamedQuery(name = "EbayCachedTransactions.findByStatus", query = "SELECT e FROM EbayCachedTransactions e WHERE e.status = :status")
    , @NamedQuery(name = "EbayCachedTransactions.findByType", query = "SELECT e FROM EbayCachedTransactions e WHERE e.type = :type")
    , @NamedQuery(name = "EbayCachedTransactions.findBySiteId", query = "SELECT e FROM EbayCachedTransactions e WHERE e.siteId = :siteId")})
public class EbayCachedTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transaction_id")
    private Integer transactionId;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "session_id")
    private String sessionId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Lob
    @Column(name = "result")
    private String result;
    @Basic(optional = false)
    @Column(name = "site_id")
    private int siteId;

    public EbayCachedTransactions() {
    }

    public EbayCachedTransactions(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public EbayCachedTransactions(Integer transactionId, int timestamp, int userId, String sessionId, Character status, String type, int siteId) {
        this.transactionId = transactionId;
        this.timestamp = timestamp;
        this.userId = userId;
        this.sessionId = sessionId;
        this.status = status;
        this.type = type;
        this.siteId = siteId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayCachedTransactions)) {
            return false;
        }
        EbayCachedTransactions other = (EbayCachedTransactions) object;
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayCachedTransactions[ transactionId=" + transactionId + " ]";
    }
    
}
