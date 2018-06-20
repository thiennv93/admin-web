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
@Table(name = "order_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderTransactions.findAll", query = "SELECT o FROM OrderTransactions o")
    , @NamedQuery(name = "OrderTransactions.findByPaymentId", query = "SELECT o FROM OrderTransactions o WHERE o.orderTransactionsPK.paymentId = :paymentId")
    , @NamedQuery(name = "OrderTransactions.findByTransactionId", query = "SELECT o FROM OrderTransactions o WHERE o.orderTransactionsPK.transactionId = :transactionId")
    , @NamedQuery(name = "OrderTransactions.findByStatus", query = "SELECT o FROM OrderTransactions o WHERE o.status = :status")})
public class OrderTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderTransactionsPK orderTransactionsPK;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Lob
    @Column(name = "extra")
    private byte[] extra;

    public OrderTransactions() {
    }

    public OrderTransactions(OrderTransactionsPK orderTransactionsPK) {
        this.orderTransactionsPK = orderTransactionsPK;
    }

    public OrderTransactions(OrderTransactionsPK orderTransactionsPK, Character status, byte[] extra) {
        this.orderTransactionsPK = orderTransactionsPK;
        this.status = status;
        this.extra = extra;
    }

    public OrderTransactions(int paymentId, String transactionId) {
        this.orderTransactionsPK = new OrderTransactionsPK(paymentId, transactionId);
    }

    public OrderTransactionsPK getOrderTransactionsPK() {
        return orderTransactionsPK;
    }

    public void setOrderTransactionsPK(OrderTransactionsPK orderTransactionsPK) {
        this.orderTransactionsPK = orderTransactionsPK;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public byte[] getExtra() {
        return extra;
    }

    public void setExtra(byte[] extra) {
        this.extra = extra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderTransactionsPK != null ? orderTransactionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderTransactions)) {
            return false;
        }
        OrderTransactions other = (OrderTransactions) object;
        if ((this.orderTransactionsPK == null && other.orderTransactionsPK != null) || (this.orderTransactionsPK != null && !this.orderTransactionsPK.equals(other.orderTransactionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderTransactions[ orderTransactionsPK=" + orderTransactionsPK + " ]";
    }
    
}
