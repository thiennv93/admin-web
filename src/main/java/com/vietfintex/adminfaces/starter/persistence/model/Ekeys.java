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
@Table(name = "ekeys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ekeys.findAll", query = "SELECT e FROM Ekeys e")
    , @NamedQuery(name = "Ekeys.findByObjectId", query = "SELECT e FROM Ekeys e WHERE e.ekeysPK.objectId = :objectId")
    , @NamedQuery(name = "Ekeys.findByObjectString", query = "SELECT e FROM Ekeys e WHERE e.objectString = :objectString")
    , @NamedQuery(name = "Ekeys.findByObjectType", query = "SELECT e FROM Ekeys e WHERE e.ekeysPK.objectType = :objectType")
    , @NamedQuery(name = "Ekeys.findByEkey", query = "SELECT e FROM Ekeys e WHERE e.ekeysPK.ekey = :ekey")
    , @NamedQuery(name = "Ekeys.findByTtl", query = "SELECT e FROM Ekeys e WHERE e.ttl = :ttl")})
public class Ekeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EkeysPK ekeysPK;
    @Basic(optional = false)
    @Column(name = "object_string")
    private String objectString;
    @Basic(optional = false)
    @Column(name = "ttl")
    private int ttl;

    public Ekeys() {
    }

    public Ekeys(EkeysPK ekeysPK) {
        this.ekeysPK = ekeysPK;
    }

    public Ekeys(EkeysPK ekeysPK, String objectString, int ttl) {
        this.ekeysPK = ekeysPK;
        this.objectString = objectString;
        this.ttl = ttl;
    }

    public Ekeys(int objectId, Character objectType, String ekey) {
        this.ekeysPK = new EkeysPK(objectId, objectType, ekey);
    }

    public EkeysPK getEkeysPK() {
        return ekeysPK;
    }

    public void setEkeysPK(EkeysPK ekeysPK) {
        this.ekeysPK = ekeysPK;
    }

    public String getObjectString() {
        return objectString;
    }

    public void setObjectString(String objectString) {
        this.objectString = objectString;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ekeysPK != null ? ekeysPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ekeys)) {
            return false;
        }
        Ekeys other = (Ekeys) object;
        if ((this.ekeysPK == null && other.ekeysPK != null) || (this.ekeysPK != null && !this.ekeysPK.equals(other.ekeysPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ekeys[ ekeysPK=" + ekeysPK + " ]";
    }
    
}
