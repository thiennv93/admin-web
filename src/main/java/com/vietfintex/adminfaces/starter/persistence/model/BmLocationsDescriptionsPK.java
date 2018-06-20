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
public class BmLocationsDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "location_id")
    private int locationId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public BmLocationsDescriptionsPK() {
    }

    public BmLocationsDescriptionsPK(int locationId, String langCode) {
        this.locationId = locationId;
        this.langCode = langCode;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
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
        hash += (int) locationId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmLocationsDescriptionsPK)) {
            return false;
        }
        BmLocationsDescriptionsPK other = (BmLocationsDescriptionsPK) object;
        if (this.locationId != other.locationId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BmLocationsDescriptionsPK[ locationId=" + locationId + ", langCode=" + langCode + " ]";
    }
    
}
