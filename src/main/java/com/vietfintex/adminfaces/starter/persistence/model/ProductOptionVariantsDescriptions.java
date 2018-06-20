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
@Table(name = "product_option_variants_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductOptionVariantsDescriptions.findAll", query = "SELECT p FROM ProductOptionVariantsDescriptions p")
    , @NamedQuery(name = "ProductOptionVariantsDescriptions.findByVariantId", query = "SELECT p FROM ProductOptionVariantsDescriptions p WHERE p.productOptionVariantsDescriptionsPK.variantId = :variantId")
    , @NamedQuery(name = "ProductOptionVariantsDescriptions.findByLangCode", query = "SELECT p FROM ProductOptionVariantsDescriptions p WHERE p.productOptionVariantsDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "ProductOptionVariantsDescriptions.findByVariantName", query = "SELECT p FROM ProductOptionVariantsDescriptions p WHERE p.variantName = :variantName")})
public class ProductOptionVariantsDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductOptionVariantsDescriptionsPK productOptionVariantsDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "variant_name")
    private String variantName;

    public ProductOptionVariantsDescriptions() {
    }

    public ProductOptionVariantsDescriptions(ProductOptionVariantsDescriptionsPK productOptionVariantsDescriptionsPK) {
        this.productOptionVariantsDescriptionsPK = productOptionVariantsDescriptionsPK;
    }

    public ProductOptionVariantsDescriptions(ProductOptionVariantsDescriptionsPK productOptionVariantsDescriptionsPK, String variantName) {
        this.productOptionVariantsDescriptionsPK = productOptionVariantsDescriptionsPK;
        this.variantName = variantName;
    }

    public ProductOptionVariantsDescriptions(int variantId, String langCode) {
        this.productOptionVariantsDescriptionsPK = new ProductOptionVariantsDescriptionsPK(variantId, langCode);
    }

    public ProductOptionVariantsDescriptionsPK getProductOptionVariantsDescriptionsPK() {
        return productOptionVariantsDescriptionsPK;
    }

    public void setProductOptionVariantsDescriptionsPK(ProductOptionVariantsDescriptionsPK productOptionVariantsDescriptionsPK) {
        this.productOptionVariantsDescriptionsPK = productOptionVariantsDescriptionsPK;
    }

    public String getVariantName() {
        return variantName;
    }

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productOptionVariantsDescriptionsPK != null ? productOptionVariantsDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOptionVariantsDescriptions)) {
            return false;
        }
        ProductOptionVariantsDescriptions other = (ProductOptionVariantsDescriptions) object;
        if ((this.productOptionVariantsDescriptionsPK == null && other.productOptionVariantsDescriptionsPK != null) || (this.productOptionVariantsDescriptionsPK != null && !this.productOptionVariantsDescriptionsPK.equals(other.productOptionVariantsDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductOptionVariantsDescriptions[ productOptionVariantsDescriptionsPK=" + productOptionVariantsDescriptionsPK + " ]";
    }
    
}
