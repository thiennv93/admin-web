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
@Table(name = "product_filter_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFilterDescriptions.findAll", query = "SELECT p FROM ProductFilterDescriptions p")
    , @NamedQuery(name = "ProductFilterDescriptions.findByFilterId", query = "SELECT p FROM ProductFilterDescriptions p WHERE p.productFilterDescriptionsPK.filterId = :filterId")
    , @NamedQuery(name = "ProductFilterDescriptions.findByLangCode", query = "SELECT p FROM ProductFilterDescriptions p WHERE p.productFilterDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "ProductFilterDescriptions.findByFilter", query = "SELECT p FROM ProductFilterDescriptions p WHERE p.filter = :filter")})
public class ProductFilterDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFilterDescriptionsPK productFilterDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "filter")
    private String filter;

    public ProductFilterDescriptions() {
    }

    public ProductFilterDescriptions(ProductFilterDescriptionsPK productFilterDescriptionsPK) {
        this.productFilterDescriptionsPK = productFilterDescriptionsPK;
    }

    public ProductFilterDescriptions(ProductFilterDescriptionsPK productFilterDescriptionsPK, String filter) {
        this.productFilterDescriptionsPK = productFilterDescriptionsPK;
        this.filter = filter;
    }

    public ProductFilterDescriptions(int filterId, String langCode) {
        this.productFilterDescriptionsPK = new ProductFilterDescriptionsPK(filterId, langCode);
    }

    public ProductFilterDescriptionsPK getProductFilterDescriptionsPK() {
        return productFilterDescriptionsPK;
    }

    public void setProductFilterDescriptionsPK(ProductFilterDescriptionsPK productFilterDescriptionsPK) {
        this.productFilterDescriptionsPK = productFilterDescriptionsPK;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFilterDescriptionsPK != null ? productFilterDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFilterDescriptions)) {
            return false;
        }
        ProductFilterDescriptions other = (ProductFilterDescriptions) object;
        if ((this.productFilterDescriptionsPK == null && other.productFilterDescriptionsPK != null) || (this.productFilterDescriptionsPK != null && !this.productFilterDescriptionsPK.equals(other.productFilterDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFilterDescriptions[ productFilterDescriptionsPK=" + productFilterDescriptionsPK + " ]";
    }
    
}
