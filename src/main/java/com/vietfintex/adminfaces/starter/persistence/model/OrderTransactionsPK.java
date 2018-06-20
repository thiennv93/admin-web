/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Embeddable
public class OrderTransactionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "payment_id")
    private int paymentId;
    @Basic(optional = false)
    @Column(name = "transaction_id")
    private String transactionId;

    public OrderTransactionsPK() {
    }

    public OrderTransactionsPK(int paymentId, String transactionId) {
        this.paymentId = paymentId;
        this.transactionId = transactionId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) paymentId;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderTransactionsPK)) {
            return false;
        }
        OrderTransactionsPK other = (OrderTransactionsPK) object;
        if (this.paymentId != other.paymentId) {
            return false;
        }
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderTransactionsPK[ paymentId=" + paymentId + ", transactionId=" + transactionId + " ]";
    }
    
}
