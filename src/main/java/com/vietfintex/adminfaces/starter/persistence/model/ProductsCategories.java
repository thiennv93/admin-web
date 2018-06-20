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
@Table(name = "products_categories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductsCategories.findAll", query = "SELECT p FROM ProductsCategories p")
    , @NamedQuery(name = "ProductsCategories.findByProductId", query = "SELECT p FROM ProductsCategories p WHERE p.productsCategoriesPK.productId = :productId")
    , @NamedQuery(name = "ProductsCategories.findByCategoryId", query = "SELECT p FROM ProductsCategories p WHERE p.productsCategoriesPK.categoryId = :categoryId")
    , @NamedQuery(name = "ProductsCategories.findByLinkType", query = "SELECT p FROM ProductsCategories p WHERE p.linkType = :linkType")
    , @NamedQuery(name = "ProductsCategories.findByPosition", query = "SELECT p FROM ProductsCategories p WHERE p.position = :position")})
public class ProductsCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductsCategoriesPK productsCategoriesPK;
    @Basic(optional = false)
    @Column(name = "link_type")
    private Character linkType;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;

    public ProductsCategories() {
    }

    public ProductsCategories(ProductsCategoriesPK productsCategoriesPK) {
        this.productsCategoriesPK = productsCategoriesPK;
    }

    public ProductsCategories(ProductsCategoriesPK productsCategoriesPK, Character linkType, short position) {
        this.productsCategoriesPK = productsCategoriesPK;
        this.linkType = linkType;
        this.position = position;
    }

    public ProductsCategories(int productId, int categoryId) {
        this.productsCategoriesPK = new ProductsCategoriesPK(productId, categoryId);
    }

    public ProductsCategoriesPK getProductsCategoriesPK() {
        return productsCategoriesPK;
    }

    public void setProductsCategoriesPK(ProductsCategoriesPK productsCategoriesPK) {
        this.productsCategoriesPK = productsCategoriesPK;
    }

    public Character getLinkType() {
        return linkType;
    }

    public void setLinkType(Character linkType) {
        this.linkType = linkType;
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
        hash += (productsCategoriesPK != null ? productsCategoriesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductsCategories)) {
            return false;
        }
        ProductsCategories other = (ProductsCategories) object;
        if ((this.productsCategoriesPK == null && other.productsCategoriesPK != null) || (this.productsCategoriesPK != null && !this.productsCategoriesPK.equals(other.productsCategoriesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductsCategories[ productsCategoriesPK=" + productsCategoriesPK + " ]";
    }
    
}
