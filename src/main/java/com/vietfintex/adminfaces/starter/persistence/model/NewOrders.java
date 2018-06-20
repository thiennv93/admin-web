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
@Table(name = "new_orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NewOrders.findAll", query = "SELECT n FROM NewOrders n")
    , @NamedQuery(name = "NewOrders.findByOrderId", query = "SELECT n FROM NewOrders n WHERE n.newOrdersPK.orderId = :orderId")
    , @NamedQuery(name = "NewOrders.findByUserId", query = "SELECT n FROM NewOrders n WHERE n.newOrdersPK.userId = :userId")})
public class NewOrders implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NewOrdersPK newOrdersPK;

    public NewOrders() {
    }

    public NewOrders(NewOrdersPK newOrdersPK) {
        this.newOrdersPK = newOrdersPK;
    }

    public NewOrders(int orderId, int userId) {
        this.newOrdersPK = new NewOrdersPK(orderId, userId);
    }

    public NewOrdersPK getNewOrdersPK() {
        return newOrdersPK;
    }

    public void setNewOrdersPK(NewOrdersPK newOrdersPK) {
        this.newOrdersPK = newOrdersPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (newOrdersPK != null ? newOrdersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NewOrders)) {
            return false;
        }
        NewOrders other = (NewOrders) object;
        if ((this.newOrdersPK == null && other.newOrdersPK != null) || (this.newOrdersPK != null && !this.newOrdersPK.equals(other.newOrdersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewOrders[ newOrdersPK=" + newOrdersPK + " ]";
    }
    
}
