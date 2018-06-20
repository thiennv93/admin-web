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
public class EkeysPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "object_type")
    private Character objectType;
    @Basic(optional = false)
    @Column(name = "ekey")
    private String ekey;

    public EkeysPK() {
    }

    public EkeysPK(int objectId, Character objectType, String ekey) {
        this.objectId = objectId;
        this.objectType = objectType;
        this.ekey = ekey;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Character getObjectType() {
        return objectType;
    }

    public void setObjectType(Character objectType) {
        this.objectType = objectType;
    }

    public String getEkey() {
        return ekey;
    }

    public void setEkey(String ekey) {
        this.ekey = ekey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) objectId;
        hash += (objectType != null ? objectType.hashCode() : 0);
        hash += (ekey != null ? ekey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EkeysPK)) {
            return false;
        }
        EkeysPK other = (EkeysPK) object;
        if (this.objectId != other.objectId) {
            return false;
        }
        if ((this.objectType == null && other.objectType != null) || (this.objectType != null && !this.objectType.equals(other.objectType))) {
            return false;
        }
        if ((this.ekey == null && other.ekey != null) || (this.ekey != null && !this.ekey.equals(other.ekey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EkeysPK[ objectId=" + objectId + ", objectType=" + objectType + ", ekey=" + ekey + " ]";
    }
    
}
