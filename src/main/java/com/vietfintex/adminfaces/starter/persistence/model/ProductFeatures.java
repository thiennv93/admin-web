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
@Table(name = "product_features")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFeatures.findAll", query = "SELECT p FROM ProductFeatures p")
    , @NamedQuery(name = "ProductFeatures.findByFeatureId", query = "SELECT p FROM ProductFeatures p WHERE p.featureId = :featureId")
    , @NamedQuery(name = "ProductFeatures.findByFeatureCode", query = "SELECT p FROM ProductFeatures p WHERE p.featureCode = :featureCode")
    , @NamedQuery(name = "ProductFeatures.findByCompanyId", query = "SELECT p FROM ProductFeatures p WHERE p.companyId = :companyId")
    , @NamedQuery(name = "ProductFeatures.findByFeatureType", query = "SELECT p FROM ProductFeatures p WHERE p.featureType = :featureType")
    , @NamedQuery(name = "ProductFeatures.findByParentId", query = "SELECT p FROM ProductFeatures p WHERE p.parentId = :parentId")
    , @NamedQuery(name = "ProductFeatures.findByDisplayOnProduct", query = "SELECT p FROM ProductFeatures p WHERE p.displayOnProduct = :displayOnProduct")
    , @NamedQuery(name = "ProductFeatures.findByDisplayOnCatalog", query = "SELECT p FROM ProductFeatures p WHERE p.displayOnCatalog = :displayOnCatalog")
    , @NamedQuery(name = "ProductFeatures.findByDisplayOnHeader", query = "SELECT p FROM ProductFeatures p WHERE p.displayOnHeader = :displayOnHeader")
    , @NamedQuery(name = "ProductFeatures.findByStatus", query = "SELECT p FROM ProductFeatures p WHERE p.status = :status")
    , @NamedQuery(name = "ProductFeatures.findByPosition", query = "SELECT p FROM ProductFeatures p WHERE p.position = :position")
    , @NamedQuery(name = "ProductFeatures.findByComparison", query = "SELECT p FROM ProductFeatures p WHERE p.comparison = :comparison")})
public class ProductFeatures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "feature_id")
    private Integer featureId;
    @Basic(optional = false)
    @Column(name = "feature_code")
    private String featureCode;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "feature_type")
    private Character featureType;
    @Lob
    @Column(name = "categories_path")
    private String categoriesPath;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "display_on_product")
    private Character displayOnProduct;
    @Basic(optional = false)
    @Column(name = "display_on_catalog")
    private Character displayOnCatalog;
    @Basic(optional = false)
    @Column(name = "display_on_header")
    private Character displayOnHeader;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "comparison")
    private Character comparison;

    public ProductFeatures() {
    }

    public ProductFeatures(Integer featureId) {
        this.featureId = featureId;
    }

    public ProductFeatures(Integer featureId, String featureCode, int companyId, Character featureType, int parentId, Character displayOnProduct, Character displayOnCatalog, Character displayOnHeader, Character status, short position, Character comparison) {
        this.featureId = featureId;
        this.featureCode = featureCode;
        this.companyId = companyId;
        this.featureType = featureType;
        this.parentId = parentId;
        this.displayOnProduct = displayOnProduct;
        this.displayOnCatalog = displayOnCatalog;
        this.displayOnHeader = displayOnHeader;
        this.status = status;
        this.position = position;
        this.comparison = comparison;
    }

    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    public String getFeatureCode() {
        return featureCode;
    }

    public void setFeatureCode(String featureCode) {
        this.featureCode = featureCode;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Character getFeatureType() {
        return featureType;
    }

    public void setFeatureType(Character featureType) {
        this.featureType = featureType;
    }

    public String getCategoriesPath() {
        return categoriesPath;
    }

    public void setCategoriesPath(String categoriesPath) {
        this.categoriesPath = categoriesPath;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Character getDisplayOnProduct() {
        return displayOnProduct;
    }

    public void setDisplayOnProduct(Character displayOnProduct) {
        this.displayOnProduct = displayOnProduct;
    }

    public Character getDisplayOnCatalog() {
        return displayOnCatalog;
    }

    public void setDisplayOnCatalog(Character displayOnCatalog) {
        this.displayOnCatalog = displayOnCatalog;
    }

    public Character getDisplayOnHeader() {
        return displayOnHeader;
    }

    public void setDisplayOnHeader(Character displayOnHeader) {
        this.displayOnHeader = displayOnHeader;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Character getComparison() {
        return comparison;
    }

    public void setComparison(Character comparison) {
        this.comparison = comparison;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (featureId != null ? featureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatures)) {
            return false;
        }
        ProductFeatures other = (ProductFeatures) object;
        if ((this.featureId == null && other.featureId != null) || (this.featureId != null && !this.featureId.equals(other.featureId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFeatures[ featureId=" + featureId + " ]";
    }
    
}
