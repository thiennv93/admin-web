/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Embeddable
public class AddonDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "addon")
    private String addon;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public AddonDescriptionsPK() {
    }

    public AddonDescriptionsPK(String addon, String langCode) {
        this.addon = addon;
        this.langCode = langCode;
    }

    public String getAddon() {
        return addon;
    }

    public void setAddon(String addon) {
        this.addon = addon;
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
        hash += (addon != null ? addon.hashCode() : 0);
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddonDescriptionsPK)) {
            return false;
        }
        AddonDescriptionsPK other = (AddonDescriptionsPK) object;
        if ((this.addon == null && other.addon != null) || (this.addon != null && !this.addon.equals(other.addon))) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AddonDescriptionsPK[ addon=" + addon + ", langCode=" + langCode + " ]";
    }
    
}
