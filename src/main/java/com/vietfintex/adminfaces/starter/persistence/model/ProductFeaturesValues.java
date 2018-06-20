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
@Table(name = "product_features_values")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFeaturesValues.findAll", query = "SELECT p FROM ProductFeaturesValues p")
    , @NamedQuery(name = "ProductFeaturesValues.findByFeatureId", query = "SELECT p FROM ProductFeaturesValues p WHERE p.productFeaturesValuesPK.featureId = :featureId")
    , @NamedQuery(name = "ProductFeaturesValues.findByProductId", query = "SELECT p FROM ProductFeaturesValues p WHERE p.productFeaturesValuesPK.productId = :productId")
    , @NamedQuery(name = "ProductFeaturesValues.findByVariantId", query = "SELECT p FROM ProductFeaturesValues p WHERE p.productFeaturesValuesPK.variantId = :variantId")
    , @NamedQuery(name = "ProductFeaturesValues.findByValue", query = "SELECT p FROM ProductFeaturesValues p WHERE p.value = :value")
    , @NamedQuery(name = "ProductFeaturesValues.findByValueInt", query = "SELECT p FROM ProductFeaturesValues p WHERE p.valueInt = :valueInt")
    , @NamedQuery(name = "ProductFeaturesValues.findByLangCode", query = "SELECT p FROM ProductFeaturesValues p WHERE p.productFeaturesValuesPK.langCode = :langCode")})
public class ProductFeaturesValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFeaturesValuesPK productFeaturesValuesPK;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "value_int")
    private Double valueInt;

    public ProductFeaturesValues() {
    }

    public ProductFeaturesValues(ProductFeaturesValuesPK productFeaturesValuesPK) {
        this.productFeaturesValuesPK = productFeaturesValuesPK;
    }

    public ProductFeaturesValues(ProductFeaturesValuesPK productFeaturesValuesPK, String value) {
        this.productFeaturesValuesPK = productFeaturesValuesPK;
        this.value = value;
    }

    public ProductFeaturesValues(int featureId, int productId, int variantId, String langCode) {
        this.productFeaturesValuesPK = new ProductFeaturesValuesPK(featureId, productId, variantId, langCode);
    }

    public ProductFeaturesValuesPK getProductFeaturesValuesPK() {
        return productFeaturesValuesPK;
    }

    public void setProductFeaturesValuesPK(ProductFeaturesValuesPK productFeaturesValuesPK) {
        this.productFeaturesValuesPK = productFeaturesValuesPK;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Double getValueInt() {
        return valueInt;
    }

    public void setValueInt(Double valueInt) {
        this.valueInt = valueInt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeaturesValuesPK != null ? productFeaturesValuesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeaturesValues)) {
            return false;
        }
        ProductFeaturesValues other = (ProductFeaturesValues) object;
        if ((this.productFeaturesValuesPK == null && other.productFeaturesValuesPK != null) || (this.productFeaturesValuesPK != null && !this.productFeaturesValuesPK.equals(other.productFeaturesValuesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFeaturesValues[ productFeaturesValuesPK=" + productFeaturesValuesPK + " ]";
    }
    
}
