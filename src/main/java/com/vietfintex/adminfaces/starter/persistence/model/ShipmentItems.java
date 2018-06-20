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
@Table(name = "shipment_items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShipmentItems.findAll", query = "SELECT s FROM ShipmentItems s")
    , @NamedQuery(name = "ShipmentItems.findByItemId", query = "SELECT s FROM ShipmentItems s WHERE s.shipmentItemsPK.itemId = :itemId")
    , @NamedQuery(name = "ShipmentItems.findByShipmentId", query = "SELECT s FROM ShipmentItems s WHERE s.shipmentItemsPK.shipmentId = :shipmentId")
    , @NamedQuery(name = "ShipmentItems.findByOrderId", query = "SELECT s FROM ShipmentItems s WHERE s.orderId = :orderId")
    , @NamedQuery(name = "ShipmentItems.findByProductId", query = "SELECT s FROM ShipmentItems s WHERE s.productId = :productId")
    , @NamedQuery(name = "ShipmentItems.findByAmount", query = "SELECT s FROM ShipmentItems s WHERE s.amount = :amount")})
public class ShipmentItems implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentItemsPK shipmentItemsPK;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;

    public ShipmentItems() {
    }

    public ShipmentItems(ShipmentItemsPK shipmentItemsPK) {
        this.shipmentItemsPK = shipmentItemsPK;
    }

    public ShipmentItems(ShipmentItemsPK shipmentItemsPK, int orderId, int productId, int amount) {
        this.shipmentItemsPK = shipmentItemsPK;
        this.orderId = orderId;
        this.productId = productId;
        this.amount = amount;
    }

    public ShipmentItems(int itemId, int shipmentId) {
        this.shipmentItemsPK = new ShipmentItemsPK(itemId, shipmentId);
    }

    public ShipmentItemsPK getShipmentItemsPK() {
        return shipmentItemsPK;
    }

    public void setShipmentItemsPK(ShipmentItemsPK shipmentItemsPK) {
        this.shipmentItemsPK = shipmentItemsPK;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentItemsPK != null ? shipmentItemsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentItems)) {
            return false;
        }
        ShipmentItems other = (ShipmentItems) object;
        if ((this.shipmentItemsPK == null && other.shipmentItemsPK != null) || (this.shipmentItemsPK != null && !this.shipmentItemsPK.equals(other.shipmentItemsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShipmentItems[ shipmentItemsPK=" + shipmentItemsPK + " ]";
    }
    
}
