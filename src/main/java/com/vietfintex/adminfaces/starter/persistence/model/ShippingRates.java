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
@Table(name = "shipping_rates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShippingRates.findAll", query = "SELECT s FROM ShippingRates s")
    , @NamedQuery(name = "ShippingRates.findByRateId", query = "SELECT s FROM ShippingRates s WHERE s.rateId = :rateId")
    , @NamedQuery(name = "ShippingRates.findByShippingId", query = "SELECT s FROM ShippingRates s WHERE s.shippingId = :shippingId")
    , @NamedQuery(name = "ShippingRates.findByDestinationId", query = "SELECT s FROM ShippingRates s WHERE s.destinationId = :destinationId")})
public class ShippingRates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rate_id")
    private Integer rateId;
    @Basic(optional = false)
    @Column(name = "shipping_id")
    private int shippingId;
    @Basic(optional = false)
    @Column(name = "destination_id")
    private int destinationId;
    @Lob
    @Column(name = "rate_value")
    private String rateValue;

    public ShippingRates() {
    }

    public ShippingRates(Integer rateId) {
        this.rateId = rateId;
    }

    public ShippingRates(Integer rateId, int shippingId, int destinationId) {
        this.rateId = rateId;
        this.shippingId = shippingId;
        this.destinationId = destinationId;
    }

    public Integer getRateId() {
        return rateId;
    }

    public void setRateId(Integer rateId) {
        this.rateId = rateId;
    }

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public String getRateValue() {
        return rateValue;
    }

    public void setRateValue(String rateValue) {
        this.rateValue = rateValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rateId != null ? rateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShippingRates)) {
            return false;
        }
        ShippingRates other = (ShippingRates) object;
        if ((this.rateId == null && other.rateId != null) || (this.rateId != null && !this.rateId.equals(other.rateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShippingRates[ rateId=" + rateId + " ]";
    }
    
}
