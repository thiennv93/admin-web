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
@Table(name = "gdpr_user_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GdprUserData.findAll", query = "SELECT g FROM GdprUserData g")
    , @NamedQuery(name = "GdprUserData.findByUserId", query = "SELECT g FROM GdprUserData g WHERE g.userId = :userId")
    , @NamedQuery(name = "GdprUserData.findByAnonymized", query = "SELECT g FROM GdprUserData g WHERE g.anonymized = :anonymized")})
public class GdprUserData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "anonymized")
    private Character anonymized;

    public GdprUserData() {
    }

    public GdprUserData(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Character getAnonymized() {
        return anonymized;
    }

    public void setAnonymized(Character anonymized) {
        this.anonymized = anonymized;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GdprUserData)) {
            return false;
        }
        GdprUserData other = (GdprUserData) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GdprUserData[ userId=" + userId + " ]";
    }
    
}
