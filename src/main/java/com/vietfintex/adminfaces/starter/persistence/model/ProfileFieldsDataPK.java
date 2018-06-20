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
public class ProfileFieldsDataPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "object_type")
    private Character objectType;
    @Basic(optional = false)
    @Column(name = "field_id")
    private int fieldId;

    public ProfileFieldsDataPK() {
    }

    public ProfileFieldsDataPK(int objectId, Character objectType, int fieldId) {
        this.objectId = objectId;
        this.objectType = objectType;
        this.fieldId = fieldId;
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

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) objectId;
        hash += (objectType != null ? objectType.hashCode() : 0);
        hash += (int) fieldId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfileFieldsDataPK)) {
            return false;
        }
        ProfileFieldsDataPK other = (ProfileFieldsDataPK) object;
        if (this.objectId != other.objectId) {
            return false;
        }
        if ((this.objectType == null && other.objectType != null) || (this.objectType != null && !this.objectType.equals(other.objectType))) {
            return false;
        }
        if (this.fieldId != other.fieldId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProfileFieldsDataPK[ objectId=" + objectId + ", objectType=" + objectType + ", fieldId=" + fieldId + " ]";
    }
    
}
