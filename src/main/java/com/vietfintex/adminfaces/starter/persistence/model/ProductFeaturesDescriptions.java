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
@Table(name = "product_features_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFeaturesDescriptions.findAll", query = "SELECT p FROM ProductFeaturesDescriptions p")
    , @NamedQuery(name = "ProductFeaturesDescriptions.findByFeatureId", query = "SELECT p FROM ProductFeaturesDescriptions p WHERE p.productFeaturesDescriptionsPK.featureId = :featureId")
    , @NamedQuery(name = "ProductFeaturesDescriptions.findByDescription", query = "SELECT p FROM ProductFeaturesDescriptions p WHERE p.description = :description")
    , @NamedQuery(name = "ProductFeaturesDescriptions.findByPrefix", query = "SELECT p FROM ProductFeaturesDescriptions p WHERE p.prefix = :prefix")
    , @NamedQuery(name = "ProductFeaturesDescriptions.findBySuffix", query = "SELECT p FROM ProductFeaturesDescriptions p WHERE p.suffix = :suffix")
    , @NamedQuery(name = "ProductFeaturesDescriptions.findByLangCode", query = "SELECT p FROM ProductFeaturesDescriptions p WHERE p.productFeaturesDescriptionsPK.langCode = :langCode")})
public class ProductFeaturesDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFeaturesDescriptionsPK productFeaturesDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Lob
    @Column(name = "full_description")
    private String fullDescription;
    @Basic(optional = false)
    @Column(name = "prefix")
    private String prefix;
    @Basic(optional = false)
    @Column(name = "suffix")
    private String suffix;

    public ProductFeaturesDescriptions() {
    }

    public ProductFeaturesDescriptions(ProductFeaturesDescriptionsPK productFeaturesDescriptionsPK) {
        this.productFeaturesDescriptionsPK = productFeaturesDescriptionsPK;
    }

    public ProductFeaturesDescriptions(ProductFeaturesDescriptionsPK productFeaturesDescriptionsPK, String description, String prefix, String suffix) {
        this.productFeaturesDescriptionsPK = productFeaturesDescriptionsPK;
        this.description = description;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public ProductFeaturesDescriptions(int featureId, String langCode) {
        this.productFeaturesDescriptionsPK = new ProductFeaturesDescriptionsPK(featureId, langCode);
    }

    public ProductFeaturesDescriptionsPK getProductFeaturesDescriptionsPK() {
        return productFeaturesDescriptionsPK;
    }

    public void setProductFeaturesDescriptionsPK(ProductFeaturesDescriptionsPK productFeaturesDescriptionsPK) {
        this.productFeaturesDescriptionsPK = productFeaturesDescriptionsPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeaturesDescriptionsPK != null ? productFeaturesDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeaturesDescriptions)) {
            return false;
        }
        ProductFeaturesDescriptions other = (ProductFeaturesDescriptions) object;
        if ((this.productFeaturesDescriptionsPK == null && other.productFeaturesDescriptionsPK != null) || (this.productFeaturesDescriptionsPK != null && !this.productFeaturesDescriptionsPK.equals(other.productFeaturesDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFeaturesDescriptions[ productFeaturesDescriptionsPK=" + productFeaturesDescriptionsPK + " ]";
    }
    
}
