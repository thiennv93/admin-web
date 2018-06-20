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
public class ShipmentItemsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "item_id")
    private int itemId;
    @Basic(optional = false)
    @Column(name = "shipment_id")
    private int shipmentId;

    public ShipmentItemsPK() {
    }

    public ShipmentItemsPK(int itemId, int shipmentId) {
        this.itemId = itemId;
        this.shipmentId = shipmentId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) itemId;
        hash += (int) shipmentId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentItemsPK)) {
            return false;
        }
        ShipmentItemsPK other = (ShipmentItemsPK) object;
        if (this.itemId != other.itemId) {
            return false;
        }
        if (this.shipmentId != other.shipmentId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShipmentItemsPK[ itemId=" + itemId + ", shipmentId=" + shipmentId + " ]";
    }
    
}
