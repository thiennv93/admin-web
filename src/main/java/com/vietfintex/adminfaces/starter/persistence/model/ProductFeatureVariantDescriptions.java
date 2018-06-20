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
@Table(name = "product_feature_variant_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFeatureVariantDescriptions.findAll", query = "SELECT p FROM ProductFeatureVariantDescriptions p")
    , @NamedQuery(name = "ProductFeatureVariantDescriptions.findByVariantId", query = "SELECT p FROM ProductFeatureVariantDescriptions p WHERE p.productFeatureVariantDescriptionsPK.variantId = :variantId")
    , @NamedQuery(name = "ProductFeatureVariantDescriptions.findByVariant", query = "SELECT p FROM ProductFeatureVariantDescriptions p WHERE p.variant = :variant")
    , @NamedQuery(name = "ProductFeatureVariantDescriptions.findByPageTitle", query = "SELECT p FROM ProductFeatureVariantDescriptions p WHERE p.pageTitle = :pageTitle")
    , @NamedQuery(name = "ProductFeatureVariantDescriptions.findByMetaKeywords", query = "SELECT p FROM ProductFeatureVariantDescriptions p WHERE p.metaKeywords = :metaKeywords")
    , @NamedQuery(name = "ProductFeatureVariantDescriptions.findByMetaDescription", query = "SELECT p FROM ProductFeatureVariantDescriptions p WHERE p.metaDescription = :metaDescription")
    , @NamedQuery(name = "ProductFeatureVariantDescriptions.findByLangCode", query = "SELECT p FROM ProductFeatureVariantDescriptions p WHERE p.productFeatureVariantDescriptionsPK.langCode = :langCode")})
public class ProductFeatureVariantDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFeatureVariantDescriptionsPK productFeatureVariantDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "variant")
    private String variant;
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "page_title")
    private String pageTitle;
    @Basic(optional = false)
    @Column(name = "meta_keywords")
    private String metaKeywords;
    @Basic(optional = false)
    @Column(name = "meta_description")
    private String metaDescription;

    public ProductFeatureVariantDescriptions() {
    }

    public ProductFeatureVariantDescriptions(ProductFeatureVariantDescriptionsPK productFeatureVariantDescriptionsPK) {
        this.productFeatureVariantDescriptionsPK = productFeatureVariantDescriptionsPK;
    }

    public ProductFeatureVariantDescriptions(ProductFeatureVariantDescriptionsPK productFeatureVariantDescriptionsPK, String variant, String pageTitle, String metaKeywords, String metaDescription) {
        this.productFeatureVariantDescriptionsPK = productFeatureVariantDescriptionsPK;
        this.variant = variant;
        this.pageTitle = pageTitle;
        this.metaKeywords = metaKeywords;
        this.metaDescription = metaDescription;
    }

    public ProductFeatureVariantDescriptions(int variantId, String langCode) {
        this.productFeatureVariantDescriptionsPK = new ProductFeatureVariantDescriptionsPK(variantId, langCode);
    }

    public ProductFeatureVariantDescriptionsPK getProductFeatureVariantDescriptionsPK() {
        return productFeatureVariantDescriptionsPK;
    }

    public void setProductFeatureVariantDescriptionsPK(ProductFeatureVariantDescriptionsPK productFeatureVariantDescriptionsPK) {
        this.productFeatureVariantDescriptionsPK = productFeatureVariantDescriptionsPK;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureVariantDescriptionsPK != null ? productFeatureVariantDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureVariantDescriptions)) {
            return false;
        }
        ProductFeatureVariantDescriptions other = (ProductFeatureVariantDescriptions) object;
        if ((this.productFeatureVariantDescriptionsPK == null && other.productFeatureVariantDescriptionsPK != null) || (this.productFeatureVariantDescriptionsPK != null && !this.productFeatureVariantDescriptionsPK.equals(other.productFeatureVariantDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFeatureVariantDescriptions[ productFeatureVariantDescriptionsPK=" + productFeatureVariantDescriptionsPK + " ]";
    }
    
}
