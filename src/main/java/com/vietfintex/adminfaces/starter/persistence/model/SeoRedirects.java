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
@Table(name = "seo_redirects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeoRedirects.findAll", query = "SELECT s FROM SeoRedirects s")
    , @NamedQuery(name = "SeoRedirects.findByRedirectId", query = "SELECT s FROM SeoRedirects s WHERE s.redirectId = :redirectId")
    , @NamedQuery(name = "SeoRedirects.findBySrc", query = "SELECT s FROM SeoRedirects s WHERE s.src = :src")
    , @NamedQuery(name = "SeoRedirects.findByDest", query = "SELECT s FROM SeoRedirects s WHERE s.dest = :dest")
    , @NamedQuery(name = "SeoRedirects.findByType", query = "SELECT s FROM SeoRedirects s WHERE s.type = :type")
    , @NamedQuery(name = "SeoRedirects.findByObjectId", query = "SELECT s FROM SeoRedirects s WHERE s.objectId = :objectId")
    , @NamedQuery(name = "SeoRedirects.findByCompanyId", query = "SELECT s FROM SeoRedirects s WHERE s.companyId = :companyId")
    , @NamedQuery(name = "SeoRedirects.findByLangCode", query = "SELECT s FROM SeoRedirects s WHERE s.langCode = :langCode")})
public class SeoRedirects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "redirect_id")
    private Integer redirectId;
    @Basic(optional = false)
    @Column(name = "src")
    private String src;
    @Basic(optional = false)
    @Column(name = "dest")
    private String dest;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public SeoRedirects() {
    }

    public SeoRedirects(Integer redirectId) {
        this.redirectId = redirectId;
    }

    public SeoRedirects(Integer redirectId, String src, String dest, Character type, int objectId, int companyId, String langCode) {
        this.redirectId = redirectId;
        this.src = src;
        this.dest = dest;
        this.type = type;
        this.objectId = objectId;
        this.companyId = companyId;
        this.langCode = langCode;
    }

    public Integer getRedirectId() {
        return redirectId;
    }

    public void setRedirectId(Integer redirectId) {
        this.redirectId = redirectId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
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
        hash += (redirectId != null ? redirectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeoRedirects)) {
            return false;
        }
        SeoRedirects other = (SeoRedirects) object;
        if ((this.redirectId == null && other.redirectId != null) || (this.redirectId != null && !this.redirectId.equals(other.redirectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SeoRedirects[ redirectId=" + redirectId + " ]";
    }
    
}
