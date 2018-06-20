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
public class StoreLocationDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "store_location_id")
    private int storeLocationId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public StoreLocationDescriptionsPK() {
    }

    public StoreLocationDescriptionsPK(int storeLocationId, String langCode) {
        this.storeLocationId = storeLocationId;
        this.langCode = langCode;
    }

    public int getStoreLocationId() {
        return storeLocationId;
    }

    public void setStoreLocationId(int storeLocationId) {
        this.storeLocationId = storeLocationId;
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
        hash += (int) storeLocationId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StoreLocationDescriptionsPK)) {
            return false;
        }
        StoreLocationDescriptionsPK other = (StoreLocationDescriptionsPK) object;
        if (this.storeLocationId != other.storeLocationId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StoreLocationDescriptionsPK[ storeLocationId=" + storeLocationId + ", langCode=" + langCode + " ]";
    }
    
}
