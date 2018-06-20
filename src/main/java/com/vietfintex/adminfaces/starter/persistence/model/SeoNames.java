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
@Table(name = "seo_names")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeoNames.findAll", query = "SELECT s FROM SeoNames s")
    , @NamedQuery(name = "SeoNames.findByName", query = "SELECT s FROM SeoNames s WHERE s.name = :name")
    , @NamedQuery(name = "SeoNames.findByObjectId", query = "SELECT s FROM SeoNames s WHERE s.seoNamesPK.objectId = :objectId")
    , @NamedQuery(name = "SeoNames.findByCompanyId", query = "SELECT s FROM SeoNames s WHERE s.seoNamesPK.companyId = :companyId")
    , @NamedQuery(name = "SeoNames.findByType", query = "SELECT s FROM SeoNames s WHERE s.seoNamesPK.type = :type")
    , @NamedQuery(name = "SeoNames.findByDispatch", query = "SELECT s FROM SeoNames s WHERE s.seoNamesPK.dispatch = :dispatch")
    , @NamedQuery(name = "SeoNames.findByPath", query = "SELECT s FROM SeoNames s WHERE s.path = :path")
    , @NamedQuery(name = "SeoNames.findByLangCode", query = "SELECT s FROM SeoNames s WHERE s.seoNamesPK.langCode = :langCode")})
public class SeoNames implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SeoNamesPK seoNamesPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "path")
    private String path;

    public SeoNames() {
    }

    public SeoNames(SeoNamesPK seoNamesPK) {
        this.seoNamesPK = seoNamesPK;
    }

    public SeoNames(SeoNamesPK seoNamesPK, String name, String path) {
        this.seoNamesPK = seoNamesPK;
        this.name = name;
        this.path = path;
    }

    public SeoNames(int objectId, int companyId, Character type, String dispatch, String langCode) {
        this.seoNamesPK = new SeoNamesPK(objectId, companyId, type, dispatch, langCode);
    }

    public SeoNamesPK getSeoNamesPK() {
        return seoNamesPK;
    }

    public void setSeoNamesPK(SeoNamesPK seoNamesPK) {
        this.seoNamesPK = seoNamesPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seoNamesPK != null ? seoNamesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeoNames)) {
            return false;
        }
        SeoNames other = (SeoNames) object;
        if ((this.seoNamesPK == null && other.seoNamesPK != null) || (this.seoNamesPK != null && !this.seoNamesPK.equals(other.seoNamesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SeoNames[ seoNamesPK=" + seoNamesPK + " ]";
    }
    
}
