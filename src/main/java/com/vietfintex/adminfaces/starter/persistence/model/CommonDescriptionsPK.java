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
public class CommonDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;
    @Basic(optional = false)
    @Column(name = "object_holder")
    private String objectHolder;

    public CommonDescriptionsPK() {
    }

    public CommonDescriptionsPK(int objectId, String langCode, String objectHolder) {
        this.objectId = objectId;
        this.langCode = langCode;
        this.objectHolder = objectHolder;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getObjectHolder() {
        return objectHolder;
    }

    public void setObjectHolder(String objectHolder) {
        this.objectHolder = objectHolder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) objectId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        hash += (objectHolder != null ? objectHolder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommonDescriptionsPK)) {
            return false;
        }
        CommonDescriptionsPK other = (CommonDescriptionsPK) object;
        if (this.objectId != other.objectId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        if ((this.objectHolder == null && other.objectHolder != null) || (this.objectHolder != null && !this.objectHolder.equals(other.objectHolder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CommonDescriptionsPK[ objectId=" + objectId + ", langCode=" + langCode + ", objectHolder=" + objectHolder + " ]";
    }
    
}
