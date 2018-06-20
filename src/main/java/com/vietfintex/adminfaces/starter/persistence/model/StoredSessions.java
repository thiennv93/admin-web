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
@Table(name = "stored_sessions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StoredSessions.findAll", query = "SELECT s FROM StoredSessions s")
    , @NamedQuery(name = "StoredSessions.findBySessionId", query = "SELECT s FROM StoredSessions s WHERE s.sessionId = :sessionId")
    , @NamedQuery(name = "StoredSessions.findByExpiry", query = "SELECT s FROM StoredSessions s WHERE s.expiry = :expiry")})
public class StoredSessions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "session_id")
    private String sessionId;
    @Basic(optional = false)
    @Column(name = "expiry")
    private int expiry;
    @Lob
    @Column(name = "data")
    private String data;

    public StoredSessions() {
    }

    public StoredSessions(String sessionId) {
        this.sessionId = sessionId;
    }

    public StoredSessions(String sessionId, int expiry) {
        this.sessionId = sessionId;
        this.expiry = expiry;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getExpiry() {
        return expiry;
    }

    public void setExpiry(int expiry) {
        this.expiry = expiry;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionId != null ? sessionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StoredSessions)) {
            return false;
        }
        StoredSessions other = (StoredSessions) object;
        if ((this.sessionId == null && other.sessionId != null) || (this.sessionId != null && !this.sessionId.equals(other.sessionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StoredSessions[ sessionId=" + sessionId + " ]";
    }
    
}
