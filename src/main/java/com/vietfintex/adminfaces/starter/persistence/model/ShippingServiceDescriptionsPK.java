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
public class ShippingServiceDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "service_id")
    private int serviceId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public ShippingServiceDescriptionsPK() {
    }

    public ShippingServiceDescriptionsPK(int serviceId, String langCode) {
        this.serviceId = serviceId;
        this.langCode = langCode;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) serviceId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShippingServiceDescriptionsPK)) {
            return false;
        }
        ShippingServiceDescriptionsPK other = (ShippingServiceDescriptionsPK) object;
        if (this.serviceId != other.serviceId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShippingServiceDescriptionsPK[ serviceId=" + serviceId + ", langCode=" + langCode + " ]";
    }
    
}
