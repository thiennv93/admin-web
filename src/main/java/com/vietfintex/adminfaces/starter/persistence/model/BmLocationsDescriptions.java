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
@Table(name = "bm_locations_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BmLocationsDescriptions.findAll", query = "SELECT b FROM BmLocationsDescriptions b")
    , @NamedQuery(name = "BmLocationsDescriptions.findByLocationId", query = "SELECT b FROM BmLocationsDescriptions b WHERE b.bmLocationsDescriptionsPK.locationId = :locationId")
    , @NamedQuery(name = "BmLocationsDescriptions.findByLangCode", query = "SELECT b FROM BmLocationsDescriptions b WHERE b.bmLocationsDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "BmLocationsDescriptions.findByName", query = "SELECT b FROM BmLocationsDescriptions b WHERE b.name = :name")})
public class BmLocationsDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BmLocationsDescriptionsPK bmLocationsDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Lob
    @Column(name = "meta_description")
    private String metaDescription;
    @Basic(optional = false)
    @Lob
    @Column(name = "meta_keywords")
    private String metaKeywords;

    public BmLocationsDescriptions() {
    }

    public BmLocationsDescriptions(BmLocationsDescriptionsPK bmLocationsDescriptionsPK) {
        this.bmLocationsDescriptionsPK = bmLocationsDescriptionsPK;
    }

    public BmLocationsDescriptions(BmLocationsDescriptionsPK bmLocationsDescriptionsPK, String name, String title, String metaDescription, String metaKeywords) {
        this.bmLocationsDescriptionsPK = bmLocationsDescriptionsPK;
        this.name = name;
        this.title = title;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
    }

    public BmLocationsDescriptions(int locationId, String langCode) {
        this.bmLocationsDescriptionsPK = new BmLocationsDescriptionsPK(locationId, langCode);
    }

    public BmLocationsDescriptionsPK getBmLocationsDescriptionsPK() {
        return bmLocationsDescriptionsPK;
    }

    public void setBmLocationsDescriptionsPK(BmLocationsDescriptionsPK bmLocationsDescriptionsPK) {
        this.bmLocationsDescriptionsPK = bmLocationsDescriptionsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bmLocationsDescriptionsPK != null ? bmLocationsDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmLocationsDescriptions)) {
            return false;
        }
        BmLocationsDescriptions other = (BmLocationsDescriptions) object;
        if ((this.bmLocationsDescriptionsPK == null && other.bmLocationsDescriptionsPK != null) || (this.bmLocationsDescriptionsPK != null && !this.bmLocationsDescriptionsPK.equals(other.bmLocationsDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BmLocationsDescriptions[ bmLocationsDescriptionsPK=" + bmLocationsDescriptionsPK + " ]";
    }
    
}
