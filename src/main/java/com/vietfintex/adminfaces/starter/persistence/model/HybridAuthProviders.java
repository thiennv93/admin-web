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
@Table(name = "hybrid_auth_providers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HybridAuthProviders.findAll", query = "SELECT h FROM HybridAuthProviders h")
    , @NamedQuery(name = "HybridAuthProviders.findByProviderId", query = "SELECT h FROM HybridAuthProviders h WHERE h.providerId = :providerId")
    , @NamedQuery(name = "HybridAuthProviders.findByCompanyId", query = "SELECT h FROM HybridAuthProviders h WHERE h.companyId = :companyId")
    , @NamedQuery(name = "HybridAuthProviders.findByProvider", query = "SELECT h FROM HybridAuthProviders h WHERE h.provider = :provider")
    , @NamedQuery(name = "HybridAuthProviders.findByPosition", query = "SELECT h FROM HybridAuthProviders h WHERE h.position = :position")
    , @NamedQuery(name = "HybridAuthProviders.findByAppId", query = "SELECT h FROM HybridAuthProviders h WHERE h.appId = :appId")
    , @NamedQuery(name = "HybridAuthProviders.findByAppSecretKey", query = "SELECT h FROM HybridAuthProviders h WHERE h.appSecretKey = :appSecretKey")
    , @NamedQuery(name = "HybridAuthProviders.findByAppPublicKey", query = "SELECT h FROM HybridAuthProviders h WHERE h.appPublicKey = :appPublicKey")
    , @NamedQuery(name = "HybridAuthProviders.findByStatus", query = "SELECT h FROM HybridAuthProviders h WHERE h.status = :status")})
public class HybridAuthProviders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "provider_id")
    private Integer providerId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "provider")
    private String provider;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "app_id")
    private String appId;
    @Column(name = "app_secret_key")
    private String appSecretKey;
    @Column(name = "app_public_key")
    private String appPublicKey;
    @Lob
    @Column(name = "app_params")
    private String appParams;
    @Column(name = "status")
    private Character status;

    public HybridAuthProviders() {
    }

    public HybridAuthProviders(Integer providerId) {
        this.providerId = providerId;
    }

    public HybridAuthProviders(Integer providerId, int companyId, String provider, short position, String appId) {
        this.providerId = providerId;
        this.companyId = companyId;
        this.provider = provider;
        this.position = position;
        this.appId = appId;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecretKey() {
        return appSecretKey;
    }

    public void setAppSecretKey(String appSecretKey) {
        this.appSecretKey = appSecretKey;
    }

    public String getAppPublicKey() {
        return appPublicKey;
    }

    public void setAppPublicKey(String appPublicKey) {
        this.appPublicKey = appPublicKey;
    }

    public String getAppParams() {
        return appParams;
    }

    public void setAppParams(String appParams) {
        this.appParams = appParams;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (providerId != null ? providerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HybridAuthProviders)) {
            return false;
        }
        HybridAuthProviders other = (HybridAuthProviders) object;
        if ((this.providerId == null && other.providerId != null) || (this.providerId != null && !this.providerId.equals(other.providerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HybridAuthProviders[ providerId=" + providerId + " ]";
    }
    
}
