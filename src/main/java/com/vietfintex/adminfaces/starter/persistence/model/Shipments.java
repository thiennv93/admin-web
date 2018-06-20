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
@Table(name = "shipments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shipments.findAll", query = "SELECT s FROM Shipments s")
    , @NamedQuery(name = "Shipments.findByShipmentId", query = "SELECT s FROM Shipments s WHERE s.shipmentId = :shipmentId")
    , @NamedQuery(name = "Shipments.findByShippingId", query = "SELECT s FROM Shipments s WHERE s.shippingId = :shippingId")
    , @NamedQuery(name = "Shipments.findByTrackingNumber", query = "SELECT s FROM Shipments s WHERE s.trackingNumber = :trackingNumber")
    , @NamedQuery(name = "Shipments.findByCarrier", query = "SELECT s FROM Shipments s WHERE s.carrier = :carrier")
    , @NamedQuery(name = "Shipments.findByTimestamp", query = "SELECT s FROM Shipments s WHERE s.timestamp = :timestamp")
    , @NamedQuery(name = "Shipments.findByStatus", query = "SELECT s FROM Shipments s WHERE s.status = :status")})
public class Shipments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "shipment_id")
    private Integer shipmentId;
    @Basic(optional = false)
    @Column(name = "shipping_id")
    private int shippingId;
    @Basic(optional = false)
    @Column(name = "tracking_number")
    private String trackingNumber;
    @Basic(optional = false)
    @Column(name = "carrier")
    private String carrier;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Lob
    @Column(name = "comments")
    private String comments;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public Shipments() {
    }

    public Shipments(Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Shipments(Integer shipmentId, int shippingId, String trackingNumber, String carrier, int timestamp, Character status) {
        this.shipmentId = shipmentId;
        this.shippingId = shippingId;
        this.trackingNumber = trackingNumber;
        this.carrier = carrier;
        this.timestamp = timestamp;
        this.status = status;
    }

    public Integer getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentId != null ? shipmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shipments)) {
            return false;
        }
        Shipments other = (Shipments) object;
        if ((this.shipmentId == null && other.shipmentId != null) || (this.shipmentId != null && !this.shipmentId.equals(other.shipmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shipments[ shipmentId=" + shipmentId + " ]";
    }
    
}
