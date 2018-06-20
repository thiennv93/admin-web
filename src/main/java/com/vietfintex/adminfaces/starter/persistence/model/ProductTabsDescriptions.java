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
@Table(name = "product_tabs_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductTabsDescriptions.findAll", query = "SELECT p FROM ProductTabsDescriptions p")
    , @NamedQuery(name = "ProductTabsDescriptions.findByTabId", query = "SELECT p FROM ProductTabsDescriptions p WHERE p.productTabsDescriptionsPK.tabId = :tabId")
    , @NamedQuery(name = "ProductTabsDescriptions.findByLangCode", query = "SELECT p FROM ProductTabsDescriptions p WHERE p.productTabsDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "ProductTabsDescriptions.findByName", query = "SELECT p FROM ProductTabsDescriptions p WHERE p.name = :name")})
public class ProductTabsDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductTabsDescriptionsPK productTabsDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public ProductTabsDescriptions() {
    }

    public ProductTabsDescriptions(ProductTabsDescriptionsPK productTabsDescriptionsPK) {
        this.productTabsDescriptionsPK = productTabsDescriptionsPK;
    }

    public ProductTabsDescriptions(ProductTabsDescriptionsPK productTabsDescriptionsPK, String name) {
        this.productTabsDescriptionsPK = productTabsDescriptionsPK;
        this.name = name;
    }

    public ProductTabsDescriptions(int tabId, String langCode) {
        this.productTabsDescriptionsPK = new ProductTabsDescriptionsPK(tabId, langCode);
    }

    public ProductTabsDescriptionsPK getProductTabsDescriptionsPK() {
        return productTabsDescriptionsPK;
    }

    public void setProductTabsDescriptionsPK(ProductTabsDescriptionsPK productTabsDescriptionsPK) {
        this.productTabsDescriptionsPK = productTabsDescriptionsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productTabsDescriptionsPK != null ? productTabsDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductTabsDescriptions)) {
            return false;
        }
        ProductTabsDescriptions other = (ProductTabsDescriptions) object;
        if ((this.productTabsDescriptionsPK == null && other.productTabsDescriptionsPK != null) || (this.productTabsDescriptionsPK != null && !this.productTabsDescriptionsPK.equals(other.productTabsDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductTabsDescriptions[ productTabsDescriptionsPK=" + productTabsDescriptionsPK + " ]";
    }
    
}
