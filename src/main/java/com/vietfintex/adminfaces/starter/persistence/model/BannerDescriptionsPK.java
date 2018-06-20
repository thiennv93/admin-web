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
public class BannerDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "banner_id")
    private int bannerId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public BannerDescriptionsPK() {
    }

    public BannerDescriptionsPK(int bannerId, String langCode) {
        this.bannerId = bannerId;
        this.langCode = langCode;
    }

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
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
        hash += (int) bannerId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BannerDescriptionsPK)) {
            return false;
        }
        BannerDescriptionsPK other = (BannerDescriptionsPK) object;
        if (this.bannerId != other.bannerId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BannerDescriptionsPK[ bannerId=" + bannerId + ", langCode=" + langCode + " ]";
    }
    
}
