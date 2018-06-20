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
@Table(name = "product_feature_variants")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFeatureVariants.findAll", query = "SELECT p FROM ProductFeatureVariants p")
    , @NamedQuery(name = "ProductFeatureVariants.findByVariantId", query = "SELECT p FROM ProductFeatureVariants p WHERE p.variantId = :variantId")
    , @NamedQuery(name = "ProductFeatureVariants.findByFeatureId", query = "SELECT p FROM ProductFeatureVariants p WHERE p.featureId = :featureId")
    , @NamedQuery(name = "ProductFeatureVariants.findByUrl", query = "SELECT p FROM ProductFeatureVariants p WHERE p.url = :url")
    , @NamedQuery(name = "ProductFeatureVariants.findByPosition", query = "SELECT p FROM ProductFeatureVariants p WHERE p.position = :position")})
public class ProductFeatureVariants implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "variant_id")
    private Integer variantId;
    @Basic(optional = false)
    @Column(name = "feature_id")
    private int featureId;
    @Basic(optional = false)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;

    public ProductFeatureVariants() {
    }

    public ProductFeatureVariants(Integer variantId) {
        this.variantId = variantId;
    }

    public ProductFeatureVariants(Integer variantId, int featureId, String url, short position) {
        this.variantId = variantId;
        this.featureId = featureId;
        this.url = url;
        this.position = position;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (variantId != null ? variantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureVariants)) {
            return false;
        }
        ProductFeatureVariants other = (ProductFeatureVariants) object;
        if ((this.variantId == null && other.variantId != null) || (this.variantId != null && !this.variantId.equals(other.variantId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFeatureVariants[ variantId=" + variantId + " ]";
    }
    
}
