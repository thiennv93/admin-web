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
@Table(name = "common_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CommonDescriptions.findAll", query = "SELECT c FROM CommonDescriptions c")
    , @NamedQuery(name = "CommonDescriptions.findByObjectId", query = "SELECT c FROM CommonDescriptions c WHERE c.commonDescriptionsPK.objectId = :objectId")
    , @NamedQuery(name = "CommonDescriptions.findByObjectType", query = "SELECT c FROM CommonDescriptions c WHERE c.objectType = :objectType")
    , @NamedQuery(name = "CommonDescriptions.findByLangCode", query = "SELECT c FROM CommonDescriptions c WHERE c.commonDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "CommonDescriptions.findByObject", query = "SELECT c FROM CommonDescriptions c WHERE c.object = :object")
    , @NamedQuery(name = "CommonDescriptions.findByObjectHolder", query = "SELECT c FROM CommonDescriptions c WHERE c.commonDescriptionsPK.objectHolder = :objectHolder")})
public class CommonDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CommonDescriptionsPK commonDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "object_type")
    private String objectType;
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "object")
    private String object;

    public CommonDescriptions() {
    }

    public CommonDescriptions(CommonDescriptionsPK commonDescriptionsPK) {
        this.commonDescriptionsPK = commonDescriptionsPK;
    }

    public CommonDescriptions(CommonDescriptionsPK commonDescriptionsPK, String objectType, String object) {
        this.commonDescriptionsPK = commonDescriptionsPK;
        this.objectType = objectType;
        this.object = object;
    }

    public CommonDescriptions(int objectId, String langCode, String objectHolder) {
        this.commonDescriptionsPK = new CommonDescriptionsPK(objectId, langCode, objectHolder);
    }

    public CommonDescriptionsPK getCommonDescriptionsPK() {
        return commonDescriptionsPK;
    }

    public void setCommonDescriptionsPK(CommonDescriptionsPK commonDescriptionsPK) {
        this.commonDescriptionsPK = commonDescriptionsPK;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commonDescriptionsPK != null ? commonDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommonDescriptions)) {
            return false;
        }
        CommonDescriptions other = (CommonDescriptions) object;
        if ((this.commonDescriptionsPK == null && other.commonDescriptionsPK != null) || (this.commonDescriptionsPK != null && !this.commonDescriptionsPK.equals(other.commonDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CommonDescriptions[ commonDescriptionsPK=" + commonDescriptionsPK + " ]";
    }
    
}
