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
@Table(name = "addon_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AddonDescriptions.findAll", query = "SELECT a FROM AddonDescriptions a")
    , @NamedQuery(name = "AddonDescriptions.findByAddon", query = "SELECT a FROM AddonDescriptions a WHERE a.addonDescriptionsPK.addon = :addon")
    , @NamedQuery(name = "AddonDescriptions.findByName", query = "SELECT a FROM AddonDescriptions a WHERE a.name = :name")
    , @NamedQuery(name = "AddonDescriptions.findByDescription", query = "SELECT a FROM AddonDescriptions a WHERE a.description = :description")
    , @NamedQuery(name = "AddonDescriptions.findByLangCode", query = "SELECT a FROM AddonDescriptions a WHERE a.addonDescriptionsPK.langCode = :langCode")})
public class AddonDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AddonDescriptionsPK addonDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public AddonDescriptions() {
    }

    public AddonDescriptions(AddonDescriptionsPK addonDescriptionsPK) {
        this.addonDescriptionsPK = addonDescriptionsPK;
    }

    public AddonDescriptions(AddonDescriptionsPK addonDescriptionsPK, String name, String description) {
        this.addonDescriptionsPK = addonDescriptionsPK;
        this.name = name;
        this.description = description;
    }

    public AddonDescriptions(String addon, String langCode) {
        this.addonDescriptionsPK = new AddonDescriptionsPK(addon, langCode);
    }

    public AddonDescriptionsPK getAddonDescriptionsPK() {
        return addonDescriptionsPK;
    }

    public void setAddonDescriptionsPK(AddonDescriptionsPK addonDescriptionsPK) {
        this.addonDescriptionsPK = addonDescriptionsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addonDescriptionsPK != null ? addonDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddonDescriptions)) {
            return false;
        }
        AddonDescriptions other = (AddonDescriptions) object;
        if ((this.addonDescriptionsPK == null && other.addonDescriptionsPK != null) || (this.addonDescriptionsPK != null && !this.addonDescriptionsPK.equals(other.addonDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AddonDescriptions[ addonDescriptionsPK=" + addonDescriptionsPK + " ]";
    }
    
}
