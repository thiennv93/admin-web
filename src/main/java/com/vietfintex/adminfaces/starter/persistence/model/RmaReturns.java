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
@Table(name = "rma_returns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RmaReturns.findAll", query = "SELECT r FROM RmaReturns r")
    , @NamedQuery(name = "RmaReturns.findByReturnId", query = "SELECT r FROM RmaReturns r WHERE r.returnId = :returnId")
    , @NamedQuery(name = "RmaReturns.findByOrderId", query = "SELECT r FROM RmaReturns r WHERE r.orderId = :orderId")
    , @NamedQuery(name = "RmaReturns.findByUserId", query = "SELECT r FROM RmaReturns r WHERE r.userId = :userId")
    , @NamedQuery(name = "RmaReturns.findByTimestamp", query = "SELECT r FROM RmaReturns r WHERE r.timestamp = :timestamp")
    , @NamedQuery(name = "RmaReturns.findByAction", query = "SELECT r FROM RmaReturns r WHERE r.action = :action")
    , @NamedQuery(name = "RmaReturns.findByStatus", query = "SELECT r FROM RmaReturns r WHERE r.status = :status")
    , @NamedQuery(name = "RmaReturns.findByTotalAmount", query = "SELECT r FROM RmaReturns r WHERE r.totalAmount = :totalAmount")})
public class RmaReturns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "return_id")
    private Integer returnId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "action")
    private int action;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "total_amount")
    private int totalAmount;
    @Lob
    @Column(name = "comment")
    private String comment;
    @Lob
    @Column(name = "extra")
    private String extra;

    public RmaReturns() {
    }

    public RmaReturns(Integer returnId) {
        this.returnId = returnId;
    }

    public RmaReturns(Integer returnId, int orderId, int userId, int timestamp, int action, Character status, int totalAmount) {
        this.returnId = returnId;
        this.orderId = orderId;
        this.userId = userId;
        this.timestamp = timestamp;
        this.action = action;
        this.status = status;
        this.totalAmount = totalAmount;
    }

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnId != null ? returnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RmaReturns)) {
            return false;
        }
        RmaReturns other = (RmaReturns) object;
        if ((this.returnId == null && other.returnId != null) || (this.returnId != null && !this.returnId.equals(other.returnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RmaReturns[ returnId=" + returnId + " ]";
    }
    
}
