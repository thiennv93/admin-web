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
@Table(name = "shipping_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShippingDescriptions.findAll", query = "SELECT s FROM ShippingDescriptions s")
    , @NamedQuery(name = "ShippingDescriptions.findByShippingId", query = "SELECT s FROM ShippingDescriptions s WHERE s.shippingDescriptionsPK.shippingId = :shippingId")
    , @NamedQuery(name = "ShippingDescriptions.findByLangCode", query = "SELECT s FROM ShippingDescriptions s WHERE s.shippingDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "ShippingDescriptions.findByShipping", query = "SELECT s FROM ShippingDescriptions s WHERE s.shipping = :shipping")
    , @NamedQuery(name = "ShippingDescriptions.findByDeliveryTime", query = "SELECT s FROM ShippingDescriptions s WHERE s.deliveryTime = :deliveryTime")})
public class ShippingDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShippingDescriptionsPK shippingDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "shipping")
    private String shipping;
    @Basic(optional = false)
    @Column(name = "delivery_time")
    private String deliveryTime;
    @Lob
    @Column(name = "description")
    private String description;

    public ShippingDescriptions() {
    }

    public ShippingDescriptions(ShippingDescriptionsPK shippingDescriptionsPK) {
        this.shippingDescriptionsPK = shippingDescriptionsPK;
    }

    public ShippingDescriptions(ShippingDescriptionsPK shippingDescriptionsPK, String shipping, String deliveryTime) {
        this.shippingDescriptionsPK = shippingDescriptionsPK;
        this.shipping = shipping;
        this.deliveryTime = deliveryTime;
    }

    public ShippingDescriptions(int shippingId, String langCode) {
        this.shippingDescriptionsPK = new ShippingDescriptionsPK(shippingId, langCode);
    }

    public ShippingDescriptionsPK getShippingDescriptionsPK() {
        return shippingDescriptionsPK;
    }

    public void setShippingDescriptionsPK(ShippingDescriptionsPK shippingDescriptionsPK) {
        this.shippingDescriptionsPK = shippingDescriptionsPK;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shippingDescriptionsPK != null ? shippingDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShippingDescriptions)) {
            return false;
        }
        ShippingDescriptions other = (ShippingDescriptions) object;
        if ((this.shippingDescriptionsPK == null && other.shippingDescriptionsPK != null) || (this.shippingDescriptionsPK != null && !this.shippingDescriptionsPK.equals(other.shippingDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShippingDescriptions[ shippingDescriptionsPK=" + shippingDescriptionsPK + " ]";
    }
    
}
