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
@Table(name = "profile_fields_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfileFieldsData.findAll", query = "SELECT p FROM ProfileFieldsData p")
    , @NamedQuery(name = "ProfileFieldsData.findByObjectId", query = "SELECT p FROM ProfileFieldsData p WHERE p.profileFieldsDataPK.objectId = :objectId")
    , @NamedQuery(name = "ProfileFieldsData.findByObjectType", query = "SELECT p FROM ProfileFieldsData p WHERE p.profileFieldsDataPK.objectType = :objectType")
    , @NamedQuery(name = "ProfileFieldsData.findByFieldId", query = "SELECT p FROM ProfileFieldsData p WHERE p.profileFieldsDataPK.fieldId = :fieldId")
    , @NamedQuery(name = "ProfileFieldsData.findByValue", query = "SELECT p FROM ProfileFieldsData p WHERE p.value = :value")})
public class ProfileFieldsData implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProfileFieldsDataPK profileFieldsDataPK;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;

    public ProfileFieldsData() {
    }

    public ProfileFieldsData(ProfileFieldsDataPK profileFieldsDataPK) {
        this.profileFieldsDataPK = profileFieldsDataPK;
    }

    public ProfileFieldsData(ProfileFieldsDataPK profileFieldsDataPK, String value) {
        this.profileFieldsDataPK = profileFieldsDataPK;
        this.value = value;
    }

    public ProfileFieldsData(int objectId, Character objectType, int fieldId) {
        this.profileFieldsDataPK = new ProfileFieldsDataPK(objectId, objectType, fieldId);
    }

    public ProfileFieldsDataPK getProfileFieldsDataPK() {
        return profileFieldsDataPK;
    }

    public void setProfileFieldsDataPK(ProfileFieldsDataPK profileFieldsDataPK) {
        this.profileFieldsDataPK = profileFieldsDataPK;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profileFieldsDataPK != null ? profileFieldsDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfileFieldsData)) {
            return false;
        }
        ProfileFieldsData other = (ProfileFieldsData) object;
        if ((this.profileFieldsDataPK == null && other.profileFieldsDataPK != null) || (this.profileFieldsDataPK != null && !this.profileFieldsDataPK.equals(other.profileFieldsDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProfileFieldsData[ profileFieldsDataPK=" + profileFieldsDataPK + " ]";
    }
    
}
