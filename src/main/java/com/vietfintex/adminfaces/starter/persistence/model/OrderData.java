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
@Table(name = "order_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderData.findAll", query = "SELECT o FROM OrderData o")
    , @NamedQuery(name = "OrderData.findByOrderId", query = "SELECT o FROM OrderData o WHERE o.orderDataPK.orderId = :orderId")
    , @NamedQuery(name = "OrderData.findByType", query = "SELECT o FROM OrderData o WHERE o.orderDataPK.type = :type")})
public class OrderData implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderDataPK orderDataPK;
    @Basic(optional = false)
    @Lob
    @Column(name = "data")
    private byte[] data;

    public OrderData() {
    }

    public OrderData(OrderDataPK orderDataPK) {
        this.orderDataPK = orderDataPK;
    }

    public OrderData(OrderDataPK orderDataPK, byte[] data) {
        this.orderDataPK = orderDataPK;
        this.data = data;
    }

    public OrderData(int orderId, Character type) {
        this.orderDataPK = new OrderDataPK(orderId, type);
    }

    public OrderDataPK getOrderDataPK() {
        return orderDataPK;
    }

    public void setOrderDataPK(OrderDataPK orderDataPK) {
        this.orderDataPK = orderDataPK;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderDataPK != null ? orderDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderData)) {
            return false;
        }
        OrderData other = (OrderData) object;
        if ((this.orderDataPK == null && other.orderDataPK != null) || (this.orderDataPK != null && !this.orderDataPK.equals(other.orderDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderData[ orderDataPK=" + orderDataPK + " ]";
    }
    
}
