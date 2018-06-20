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
@Table(name = "subscribers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subscribers.findAll", query = "SELECT s FROM Subscribers s")
    , @NamedQuery(name = "Subscribers.findBySubscriberId", query = "SELECT s FROM Subscribers s WHERE s.subscriberId = :subscriberId")
    , @NamedQuery(name = "Subscribers.findByEmail", query = "SELECT s FROM Subscribers s WHERE s.email = :email")
    , @NamedQuery(name = "Subscribers.findByTimestamp", query = "SELECT s FROM Subscribers s WHERE s.timestamp = :timestamp")
    , @NamedQuery(name = "Subscribers.findByLangCode", query = "SELECT s FROM Subscribers s WHERE s.langCode = :langCode")})
public class Subscribers implements Serializable {

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
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public Subscribers() {
    }

    public Subscribers(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    public Subscribers(Integer subscriberId, String email, int timestamp, String langCode) {
        this.subscriberId = subscriberId;
        this.email = email;
        this.timestamp = timestamp;
        this.langCode = langCode;
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

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
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
        if (!(object instanceof Subscribers)) {
            return false;
        }
        Subscribers other = (Subscribers) object;
        if ((this.subscriberId == null && other.subscriberId != null) || (this.subscriberId != null && !this.subscriberId.equals(other.subscriberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Subscribers[ subscriberId=" + subscriberId + " ]";
    }
    
}
