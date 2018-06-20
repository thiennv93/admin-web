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
@Table(name = "em_subscribers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmSubscribers.findAll", query = "SELECT e FROM EmSubscribers e")
    , @NamedQuery(name = "EmSubscribers.findBySubscriberId", query = "SELECT e FROM EmSubscribers e WHERE e.subscriberId = :subscriberId")
    , @NamedQuery(name = "EmSubscribers.findByEmail", query = "SELECT e FROM EmSubscribers e WHERE e.email = :email")
    , @NamedQuery(name = "EmSubscribers.findByName", query = "SELECT e FROM EmSubscribers e WHERE e.name = :name")
    , @NamedQuery(name = "EmSubscribers.findByTimestamp", query = "SELECT e FROM EmSubscribers e WHERE e.timestamp = :timestamp")
    , @NamedQuery(name = "EmSubscribers.findByLangCode", query = "SELECT e FROM EmSubscribers e WHERE e.langCode = :langCode")
    , @NamedQuery(name = "EmSubscribers.findByStatus", query = "SELECT e FROM EmSubscribers e WHERE e.status = :status")
    , @NamedQuery(name = "EmSubscribers.findByUnsubscribeKey", query = "SELECT e FROM EmSubscribers e WHERE e.unsubscribeKey = :unsubscribeKey")
    , @NamedQuery(name = "EmSubscribers.findByCompanyId", query = "SELECT e FROM EmSubscribers e WHERE e.companyId = :companyId")})
public class EmSubscribers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "subscriber_id")
    private Integer subscriberId;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Lob
    @Column(name = "ip_address")
    private byte[] ipAddress;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "unsubscribe_key")
    private String unsubscribeKey;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;

    public EmSubscribers() {
    }

    public EmSubscribers(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    public EmSubscribers(Integer subscriberId, String email, String name, int timestamp, byte[] ipAddress, String langCode, Character status, String unsubscribeKey, int companyId) {
        this.subscriberId = subscriberId;
        this.email = email;
        this.name = name;
        this.timestamp = timestamp;
        this.ipAddress = ipAddress;
        this.langCode = langCode;
        this.status = status;
        this.unsubscribeKey = unsubscribeKey;
        this.companyId = companyId;
    }

    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public byte[] getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(byte[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getUnsubscribeKey() {
        return unsubscribeKey;
    }

    public void setUnsubscribeKey(String unsubscribeKey) {
        this.unsubscribeKey = unsubscribeKey;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriberId != null ? subscriberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmSubscribers)) {
            return false;
        }
        EmSubscribers other = (EmSubscribers) object;
        if ((this.subscriberId == null && other.subscriberId != null) || (this.subscriberId != null && !this.subscriberId.equals(other.subscriberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmSubscribers[ subscriberId=" + subscriberId + " ]";
    }
    
}
