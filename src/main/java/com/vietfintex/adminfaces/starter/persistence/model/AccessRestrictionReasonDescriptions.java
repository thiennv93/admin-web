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
@Table(name = "access_restriction_reason_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccessRestrictionReasonDescriptions.findAll", query = "SELECT a FROM AccessRestrictionReasonDescriptions a")
    , @NamedQuery(name = "AccessRestrictionReasonDescriptions.findByItemId", query = "SELECT a FROM AccessRestrictionReasonDescriptions a WHERE a.accessRestrictionReasonDescriptionsPK.itemId = :itemId")
    , @NamedQuery(name = "AccessRestrictionReasonDescriptions.findByType", query = "SELECT a FROM AccessRestrictionReasonDescriptions a WHERE a.accessRestrictionReasonDescriptionsPK.type = :type")
    , @NamedQuery(name = "AccessRestrictionReasonDescriptions.findByLangCode", query = "SELECT a FROM AccessRestrictionReasonDescriptions a WHERE a.accessRestrictionReasonDescriptionsPK.langCode = :langCode")})
public class AccessRestrictionReasonDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccessRestrictionReasonDescriptionsPK accessRestrictionReasonDescriptionsPK;
    @Lob
    @Column(name = "reason")
    private String reason;

    public AccessRestrictionReasonDescriptions() {
    }

    public AccessRestrictionReasonDescriptions(AccessRestrictionReasonDescriptionsPK accessRestrictionReasonDescriptionsPK) {
        this.accessRestrictionReasonDescriptionsPK = accessRestrictionReasonDescriptionsPK;
    }

    public AccessRestrictionReasonDescriptions(int itemId, String type, String langCode) {
        this.accessRestrictionReasonDescriptionsPK = new AccessRestrictionReasonDescriptionsPK(itemId, type, langCode);
    }

    public AccessRestrictionReasonDescriptionsPK getAccessRestrictionReasonDescriptionsPK() {
        return accessRestrictionReasonDescriptionsPK;
    }

    public void setAccessRestrictionReasonDescriptionsPK(AccessRestrictionReasonDescriptionsPK accessRestrictionReasonDescriptionsPK) {
        this.accessRestrictionReasonDescriptionsPK = accessRestrictionReasonDescriptionsPK;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accessRestrictionReasonDescriptionsPK != null ? accessRestrictionReasonDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessRestrictionReasonDescriptions)) {
            return false;
        }
        AccessRestrictionReasonDescriptions other = (AccessRestrictionReasonDescriptions) object;
        if ((this.accessRestrictionReasonDescriptionsPK == null && other.accessRestrictionReasonDescriptionsPK != null) || (this.accessRestrictionReasonDescriptionsPK != null && !this.accessRestrictionReasonDescriptionsPK.equals(other.accessRestrictionReasonDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AccessRestrictionReasonDescriptions[ accessRestrictionReasonDescriptionsPK=" + accessRestrictionReasonDescriptionsPK + " ]";
    }
    
}
