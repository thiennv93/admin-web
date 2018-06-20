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
@Table(name = "profile_field_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfileFieldDescriptions.findAll", query = "SELECT p FROM ProfileFieldDescriptions p")
    , @NamedQuery(name = "ProfileFieldDescriptions.findByObjectId", query = "SELECT p FROM ProfileFieldDescriptions p WHERE p.profileFieldDescriptionsPK.objectId = :objectId")
    , @NamedQuery(name = "ProfileFieldDescriptions.findByDescription", query = "SELECT p FROM ProfileFieldDescriptions p WHERE p.description = :description")
    , @NamedQuery(name = "ProfileFieldDescriptions.findByObjectType", query = "SELECT p FROM ProfileFieldDescriptions p WHERE p.profileFieldDescriptionsPK.objectType = :objectType")
    , @NamedQuery(name = "ProfileFieldDescriptions.findByLangCode", query = "SELECT p FROM ProfileFieldDescriptions p WHERE p.profileFieldDescriptionsPK.langCode = :langCode")})
public class ProfileFieldDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProfileFieldDescriptionsPK profileFieldDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public ProfileFieldDescriptions() {
    }

    public ProfileFieldDescriptions(ProfileFieldDescriptionsPK profileFieldDescriptionsPK) {
        this.profileFieldDescriptionsPK = profileFieldDescriptionsPK;
    }

    public ProfileFieldDescriptions(ProfileFieldDescriptionsPK profileFieldDescriptionsPK, String description) {
        this.profileFieldDescriptionsPK = profileFieldDescriptionsPK;
        this.description = description;
    }

    public ProfileFieldDescriptions(int objectId, Character objectType, String langCode) {
        this.profileFieldDescriptionsPK = new ProfileFieldDescriptionsPK(objectId, objectType, langCode);
    }

    public ProfileFieldDescriptionsPK getProfileFieldDescriptionsPK() {
        return profileFieldDescriptionsPK;
    }

    public void setProfileFieldDescriptionsPK(ProfileFieldDescriptionsPK profileFieldDescriptionsPK) {
        this.profileFieldDescriptionsPK = profileFieldDescriptionsPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profileFieldDescriptionsPK != null ? profileFieldDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfileFieldDescriptions)) {
            return false;
        }
        ProfileFieldDescriptions other = (ProfileFieldDescriptions) object;
        if ((this.profileFieldDescriptionsPK == null && other.profileFieldDescriptionsPK != null) || (this.profileFieldDescriptionsPK != null && !this.profileFieldDescriptionsPK.equals(other.profileFieldDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProfileFieldDescriptions[ profileFieldDescriptionsPK=" + profileFieldDescriptionsPK + " ]";
    }
    
}
