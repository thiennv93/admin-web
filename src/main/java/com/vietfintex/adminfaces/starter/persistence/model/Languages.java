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
@Table(name = "languages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Languages.findAll", query = "SELECT l FROM Languages l")
    , @NamedQuery(name = "Languages.findByLangId", query = "SELECT l FROM Languages l WHERE l.langId = :langId")
    , @NamedQuery(name = "Languages.findByLangCode", query = "SELECT l FROM Languages l WHERE l.langCode = :langCode")
    , @NamedQuery(name = "Languages.findByName", query = "SELECT l FROM Languages l WHERE l.name = :name")
    , @NamedQuery(name = "Languages.findByStatus", query = "SELECT l FROM Languages l WHERE l.status = :status")
    , @NamedQuery(name = "Languages.findByCountryCode", query = "SELECT l FROM Languages l WHERE l.countryCode = :countryCode")})
public class Languages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lang_id")
    private Integer langId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "country_code")
    private String countryCode;

    public Languages() {
    }

    public Languages(Integer langId) {
        this.langId = langId;
    }

    public Languages(Integer langId, String langCode, String name, Character status, String countryCode) {
        this.langId = langId;
        this.langCode = langCode;
        this.name = name;
        this.status = status;
        this.countryCode = countryCode;
    }

    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (langId != null ? langId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Languages)) {
            return false;
        }
        Languages other = (Languages) object;
        if ((this.langId == null && other.langId != null) || (this.langId != null && !this.langId.equals(other.langId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Languages[ langId=" + langId + " ]";
    }
    
}
