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
public class ProductFeaturesValuesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "feature_id")
    private int featureId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "variant_id")
    private int variantId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public ProductFeaturesValuesPK() {
    }

    public ProductFeaturesValuesPK(int featureId, int productId, int variantId, String langCode) {
        this.featureId = featureId;
        this.productId = productId;
        this.variantId = variantId;
        this.langCode = langCode;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getVariantId() {
        return variantId;
    }

    public void setVariantId(int variantId) {
        this.variantId = variantId;
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
        hash += (int) productId;
        hash += (int) variantId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeaturesValuesPK)) {
            return false;
        }
        ProductFeaturesValuesPK other = (ProductFeaturesValuesPK) object;
        if (this.featureId != other.featureId) {
            return false;
        }
        if (this.productId != other.productId) {
            return false;
        }
        if (this.variantId != other.variantId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFeaturesValuesPK[ featureId=" + featureId + ", productId=" + productId + ", variantId=" + variantId + ", langCode=" + langCode + " ]";
    }
    
}
