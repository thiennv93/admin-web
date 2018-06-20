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
public class EbayShippingsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "service_id")
    private int serviceId;
    @Basic(optional = false)
    @Column(name = "site_id")
    private int siteId;

    public EbayShippingsPK() {
    }

    public EbayShippingsPK(int serviceId, int siteId) {
        this.serviceId = serviceId;
        this.siteId = siteId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) serviceId;
        hash += (int) siteId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayShippingsPK)) {
            return false;
        }
        EbayShippingsPK other = (EbayShippingsPK) object;
        if (this.serviceId != other.serviceId) {
            return false;
        }
        if (this.siteId != other.siteId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayShippingsPK[ serviceId=" + serviceId + ", siteId=" + siteId + " ]";
    }
    
}
