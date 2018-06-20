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
public class RmaPropertyDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "property_id")
    private int propertyId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public RmaPropertyDescriptionsPK() {
    }

    public RmaPropertyDescriptionsPK(int propertyId, String langCode) {
        this.propertyId = propertyId;
        this.langCode = langCode;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
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
        hash += (int) propertyId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RmaPropertyDescriptionsPK)) {
            return false;
        }
        RmaPropertyDescriptionsPK other = (RmaPropertyDescriptionsPK) object;
        if (this.propertyId != other.propertyId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RmaPropertyDescriptionsPK[ propertyId=" + propertyId + ", langCode=" + langCode + " ]";
    }
    
}
