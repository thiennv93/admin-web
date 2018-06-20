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
public class ProductFeaturesDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "feature_id")
    private int featureId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public ProductFeaturesDescriptionsPK() {
    }

    public ProductFeaturesDescriptionsPK(int featureId, String langCode) {
        this.featureId = featureId;
        this.langCode = langCode;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
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
        hash += (int) featureId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeaturesDescriptionsPK)) {
            return false;
        }
        ProductFeaturesDescriptionsPK other = (ProductFeaturesDescriptionsPK) object;
        if (this.featureId != other.featureId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFeaturesDescriptionsPK[ featureId=" + featureId + ", langCode=" + langCode + " ]";
    }
    
}
