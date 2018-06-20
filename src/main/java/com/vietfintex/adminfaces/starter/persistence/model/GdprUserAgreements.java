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
@Table(name = "gdpr_user_agreements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GdprUserAgreements.findAll", query = "SELECT g FROM GdprUserAgreements g")
    , @NamedQuery(name = "GdprUserAgreements.findByAgreementId", query = "SELECT g FROM GdprUserAgreements g WHERE g.agreementId = :agreementId")
    , @NamedQuery(name = "GdprUserAgreements.findByUserId", query = "SELECT g FROM GdprUserAgreements g WHERE g.userId = :userId")
    , @NamedQuery(name = "GdprUserAgreements.findByEmail", query = "SELECT g FROM GdprUserAgreements g WHERE g.email = :email")
    , @NamedQuery(name = "GdprUserAgreements.findByType", query = "SELECT g FROM GdprUserAgreements g WHERE g.type = :type")
    , @NamedQuery(name = "GdprUserAgreements.findByTimestamp", query = "SELECT g FROM GdprUserAgreements g WHERE g.timestamp = :timestamp")})
public class GdprUserAgreements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "agreement_id")
    private Integer agreementId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "email")
    private String email;
    @Column(name = "type")
    private String type;
    @Column(name = "timestamp")
    private Integer timestamp;
    @Lob
    @Column(name = "agreement")
    private String agreement;

    public GdprUserAgreements() {
    }

    public GdprUserAgreements(Integer agreementId) {
        this.agreementId = agreementId;
    }

    public Integer getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Integer agreementId) {
        this.agreementId = agreementId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementId != null ? agreementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GdprUserAgreements)) {
            return false;
        }
        GdprUserAgreements other = (GdprUserAgreements) object;
        if ((this.agreementId == null && other.agreementId != null) || (this.agreementId != null && !this.agreementId.equals(other.agreementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GdprUserAgreements[ agreementId=" + agreementId + " ]";
    }
    
}
