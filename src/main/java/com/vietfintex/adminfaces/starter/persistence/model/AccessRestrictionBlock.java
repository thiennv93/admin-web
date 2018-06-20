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
@Table(name = "access_restriction_block")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccessRestrictionBlock.findAll", query = "SELECT a FROM AccessRestrictionBlock a")
    , @NamedQuery(name = "AccessRestrictionBlock.findByIp", query = "SELECT a FROM AccessRestrictionBlock a WHERE a.ip = :ip")
    , @NamedQuery(name = "AccessRestrictionBlock.findByTries", query = "SELECT a FROM AccessRestrictionBlock a WHERE a.tries = :tries")
    , @NamedQuery(name = "AccessRestrictionBlock.findByTimestamp", query = "SELECT a FROM AccessRestrictionBlock a WHERE a.timestamp = :timestamp")
    , @NamedQuery(name = "AccessRestrictionBlock.findByExpires", query = "SELECT a FROM AccessRestrictionBlock a WHERE a.expires = :expires")})
public class AccessRestrictionBlock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ip")
    private Integer ip;
    @Basic(optional = false)
    @Column(name = "tries")
    private short tries;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "expires")
    private int expires;

    public AccessRestrictionBlock() {
    }

    public AccessRestrictionBlock(Integer ip) {
        this.ip = ip;
    }

    public AccessRestrictionBlock(Integer ip, short tries, int timestamp, int expires) {
        this.ip = ip;
        this.tries = tries;
        this.timestamp = timestamp;
        this.expires = expires;
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public short getTries() {
        return tries;
    }

    public void setTries(short tries) {
        this.tries = tries;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ip != null ? ip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessRestrictionBlock)) {
            return false;
        }
        AccessRestrictionBlock other = (AccessRestrictionBlock) object;
        if ((this.ip == null && other.ip != null) || (this.ip != null && !this.ip.equals(other.ip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AccessRestrictionBlock[ ip=" + ip + " ]";
    }
    
}
