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
public class DestinationDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "destination_id")
    private int destinationId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public DestinationDescriptionsPK() {
    }

    public DestinationDescriptionsPK(int destinationId, String langCode) {
        this.destinationId = destinationId;
        this.langCode = langCode;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
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
        hash += (int) destinationId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DestinationDescriptionsPK)) {
            return false;
        }
        DestinationDescriptionsPK other = (DestinationDescriptionsPK) object;
        if (this.destinationId != other.destinationId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DestinationDescriptionsPK[ destinationId=" + destinationId + ", langCode=" + langCode + " ]";
    }
    
}
