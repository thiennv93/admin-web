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
@Table(name = "shipping_service_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShippingServiceDescriptions.findAll", query = "SELECT s FROM ShippingServiceDescriptions s")
    , @NamedQuery(name = "ShippingServiceDescriptions.findByServiceId", query = "SELECT s FROM ShippingServiceDescriptions s WHERE s.shippingServiceDescriptionsPK.serviceId = :serviceId")
    , @NamedQuery(name = "ShippingServiceDescriptions.findByDescription", query = "SELECT s FROM ShippingServiceDescriptions s WHERE s.description = :description")
    , @NamedQuery(name = "ShippingServiceDescriptions.findByLangCode", query = "SELECT s FROM ShippingServiceDescriptions s WHERE s.shippingServiceDescriptionsPK.langCode = :langCode")})
public class ShippingServiceDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShippingServiceDescriptionsPK shippingServiceDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public ShippingServiceDescriptions() {
    }

    public ShippingServiceDescriptions(ShippingServiceDescriptionsPK shippingServiceDescriptionsPK) {
        this.shippingServiceDescriptionsPK = shippingServiceDescriptionsPK;
    }

    public ShippingServiceDescriptions(ShippingServiceDescriptionsPK shippingServiceDescriptionsPK, String description) {
        this.shippingServiceDescriptionsPK = shippingServiceDescriptionsPK;
        this.description = description;
    }

    public ShippingServiceDescriptions(int serviceId, String langCode) {
        this.shippingServiceDescriptionsPK = new ShippingServiceDescriptionsPK(serviceId, langCode);
    }

    public ShippingServiceDescriptionsPK getShippingServiceDescriptionsPK() {
        return shippingServiceDescriptionsPK;
    }

    public void setShippingServiceDescriptionsPK(ShippingServiceDescriptionsPK shippingServiceDescriptionsPK) {
        this.shippingServiceDescriptionsPK = shippingServiceDescriptionsPK;
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
        hash += (shippingServiceDescriptionsPK != null ? shippingServiceDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShippingServiceDescriptions)) {
            return false;
        }
        ShippingServiceDescriptions other = (ShippingServiceDescriptions) object;
        if ((this.shippingServiceDescriptionsPK == null && other.shippingServiceDescriptionsPK != null) || (this.shippingServiceDescriptionsPK != null && !this.shippingServiceDescriptionsPK.equals(other.shippingServiceDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShippingServiceDescriptions[ shippingServiceDescriptionsPK=" + shippingServiceDescriptionsPK + " ]";
    }
    
}
