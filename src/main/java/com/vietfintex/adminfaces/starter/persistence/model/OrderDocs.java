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
@Table(name = "order_docs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderDocs.findAll", query = "SELECT o FROM OrderDocs o")
    , @NamedQuery(name = "OrderDocs.findByDocId", query = "SELECT o FROM OrderDocs o WHERE o.orderDocsPK.docId = :docId")
    , @NamedQuery(name = "OrderDocs.findByType", query = "SELECT o FROM OrderDocs o WHERE o.orderDocsPK.type = :type")
    , @NamedQuery(name = "OrderDocs.findByOrderId", query = "SELECT o FROM OrderDocs o WHERE o.orderId = :orderId")})
public class OrderDocs implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderDocsPK orderDocsPK;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;

    public OrderDocs() {
    }

    public OrderDocs(OrderDocsPK orderDocsPK) {
        this.orderDocsPK = orderDocsPK;
    }

    public OrderDocs(OrderDocsPK orderDocsPK, int orderId) {
        this.orderDocsPK = orderDocsPK;
        this.orderId = orderId;
    }

    public OrderDocs(int docId, Character type) {
        this.orderDocsPK = new OrderDocsPK(docId, type);
    }

    public OrderDocsPK getOrderDocsPK() {
        return orderDocsPK;
    }

    public void setOrderDocsPK(OrderDocsPK orderDocsPK) {
        this.orderDocsPK = orderDocsPK;
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
        hash += (orderDocsPK != null ? orderDocsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDocs)) {
            return false;
        }
        OrderDocs other = (OrderDocs) object;
        if ((this.orderDocsPK == null && other.orderDocsPK != null) || (this.orderDocsPK != null && !this.orderDocsPK.equals(other.orderDocsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderDocs[ orderDocsPK=" + orderDocsPK + " ]";
    }
    
}
