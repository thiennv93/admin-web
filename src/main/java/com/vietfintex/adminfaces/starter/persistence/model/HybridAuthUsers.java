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
@Table(name = "hybrid_auth_users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HybridAuthUsers.findAll", query = "SELECT h FROM HybridAuthUsers h")
    , @NamedQuery(name = "HybridAuthUsers.findByUserId", query = "SELECT h FROM HybridAuthUsers h WHERE h.hybridAuthUsersPK.userId = :userId")
    , @NamedQuery(name = "HybridAuthUsers.findByProviderId", query = "SELECT h FROM HybridAuthUsers h WHERE h.hybridAuthUsersPK.providerId = :providerId")
    , @NamedQuery(name = "HybridAuthUsers.findByIdentifier", query = "SELECT h FROM HybridAuthUsers h WHERE h.identifier = :identifier")
    , @NamedQuery(name = "HybridAuthUsers.findByTimestamp", query = "SELECT h FROM HybridAuthUsers h WHERE h.timestamp = :timestamp")})
public class HybridAuthUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HybridAuthUsersPK hybridAuthUsersPK;
    @Basic(optional = false)
    @Column(name = "identifier")
    private String identifier;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;

    public HybridAuthUsers() {
    }

    public HybridAuthUsers(HybridAuthUsersPK hybridAuthUsersPK) {
        this.hybridAuthUsersPK = hybridAuthUsersPK;
    }

    public HybridAuthUsers(HybridAuthUsersPK hybridAuthUsersPK, String identifier, int timestamp) {
        this.hybridAuthUsersPK = hybridAuthUsersPK;
        this.identifier = identifier;
        this.timestamp = timestamp;
    }

    public HybridAuthUsers(int userId, int providerId) {
        this.hybridAuthUsersPK = new HybridAuthUsersPK(userId, providerId);
    }

    public HybridAuthUsersPK getHybridAuthUsersPK() {
        return hybridAuthUsersPK;
    }

    public void setHybridAuthUsersPK(HybridAuthUsersPK hybridAuthUsersPK) {
        this.hybridAuthUsersPK = hybridAuthUsersPK;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hybridAuthUsersPK != null ? hybridAuthUsersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HybridAuthUsers)) {
            return false;
        }
        HybridAuthUsers other = (HybridAuthUsers) object;
        if ((this.hybridAuthUsersPK == null && other.hybridAuthUsersPK != null) || (this.hybridAuthUsersPK != null && !this.hybridAuthUsersPK.equals(other.hybridAuthUsersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HybridAuthUsers[ hybridAuthUsersPK=" + hybridAuthUsersPK + " ]";
    }
    
}
