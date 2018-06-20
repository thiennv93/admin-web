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
@Table(name = "access_restriction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccessRestriction.findAll", query = "SELECT a FROM AccessRestriction a")
    , @NamedQuery(name = "AccessRestriction.findByItemId", query = "SELECT a FROM AccessRestriction a WHERE a.itemId = :itemId")
    , @NamedQuery(name = "AccessRestriction.findByValue", query = "SELECT a FROM AccessRestriction a WHERE a.value = :value")
    , @NamedQuery(name = "AccessRestriction.findByIpFrom", query = "SELECT a FROM AccessRestriction a WHERE a.ipFrom = :ipFrom")
    , @NamedQuery(name = "AccessRestriction.findByIpTo", query = "SELECT a FROM AccessRestriction a WHERE a.ipTo = :ipTo")
    , @NamedQuery(name = "AccessRestriction.findByType", query = "SELECT a FROM AccessRestriction a WHERE a.type = :type")
    , @NamedQuery(name = "AccessRestriction.findByStatus", query = "SELECT a FROM AccessRestriction a WHERE a.status = :status")
    , @NamedQuery(name = "AccessRestriction.findByTimestamp", query = "SELECT a FROM AccessRestriction a WHERE a.timestamp = :timestamp")
    , @NamedQuery(name = "AccessRestriction.findByExpires", query = "SELECT a FROM AccessRestriction a WHERE a.expires = :expires")})
public class AccessRestriction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_id")
    private Integer itemId;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @Column(name = "ip_from")
    private int ipFrom;
    @Basic(optional = false)
    @Column(name = "ip_to")
    private int ipTo;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "expires")
    private int expires;

    public AccessRestriction() {
    }

    public AccessRestriction(Integer itemId) {
        this.itemId = itemId;
    }

    public AccessRestriction(Integer itemId, String value, int ipFrom, int ipTo, String type, Character status, int timestamp, int expires) {
        this.itemId = itemId;
        this.value = value;
        this.ipFrom = ipFrom;
        this.ipTo = ipTo;
        this.type = type;
        this.status = status;
        this.timestamp = timestamp;
        this.expires = expires;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getIpFrom() {
        return ipFrom;
    }

    public void setIpFrom(int ipFrom) {
        this.ipFrom = ipFrom;
    }

    public int getIpTo() {
        return ipTo;
    }

    public void setIpTo(int ipTo) {
        this.ipTo = ipTo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
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
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessRestriction)) {
            return false;
        }
        AccessRestriction other = (AccessRestriction) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AccessRestriction[ itemId=" + itemId + " ]";
    }
    
}
