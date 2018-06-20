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
@Table(name = "category_vendor_product_count")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoryVendorProductCount.findAll", query = "SELECT c FROM CategoryVendorProductCount c")
    , @NamedQuery(name = "CategoryVendorProductCount.findByCompanyId", query = "SELECT c FROM CategoryVendorProductCount c WHERE c.categoryVendorProductCountPK.companyId = :companyId")
    , @NamedQuery(name = "CategoryVendorProductCount.findByCategoryId", query = "SELECT c FROM CategoryVendorProductCount c WHERE c.categoryVendorProductCountPK.categoryId = :categoryId")
    , @NamedQuery(name = "CategoryVendorProductCount.findByProductCount", query = "SELECT c FROM CategoryVendorProductCount c WHERE c.productCount = :productCount")})
public class CategoryVendorProductCount implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CategoryVendorProductCountPK categoryVendorProductCountPK;
    @Basic(optional = false)
    @Column(name = "product_count")
    private int productCount;

    public CategoryVendorProductCount() {
    }

    public CategoryVendorProductCount(CategoryVendorProductCountPK categoryVendorProductCountPK) {
        this.categoryVendorProductCountPK = categoryVendorProductCountPK;
    }

    public CategoryVendorProductCount(CategoryVendorProductCountPK categoryVendorProductCountPK, int productCount) {
        this.categoryVendorProductCountPK = categoryVendorProductCountPK;
        this.productCount = productCount;
    }

    public CategoryVendorProductCount(int companyId, int categoryId) {
        this.categoryVendorProductCountPK = new CategoryVendorProductCountPK(companyId, categoryId);
    }

    public CategoryVendorProductCountPK getCategoryVendorProductCountPK() {
        return categoryVendorProductCountPK;
    }

    public void setCategoryVendorProductCountPK(CategoryVendorProductCountPK categoryVendorProductCountPK) {
        this.categoryVendorProductCountPK = categoryVendorProductCountPK;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryVendorProductCountPK != null ? categoryVendorProductCountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryVendorProductCount)) {
            return false;
        }
        CategoryVendorProductCount other = (CategoryVendorProductCount) object;
        if ((this.categoryVendorProductCountPK == null && other.categoryVendorProductCountPK != null) || (this.categoryVendorProductCountPK != null && !this.categoryVendorProductCountPK.equals(other.categoryVendorProductCountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategoryVendorProductCount[ categoryVendorProductCountPK=" + categoryVendorProductCountPK + " ]";
    }
    
}
