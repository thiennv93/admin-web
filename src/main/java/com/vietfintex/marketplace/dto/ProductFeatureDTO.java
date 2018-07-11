/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.dto;

import java.io.Serializable;

public class ProductFeatureDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long featureId;
    private String featureCode;
    private String description;
    private String fullDescription;
    private String featureType;
    private String categoriesPath;
    private int parentId;
    private String parentFeatureName;
    private String displayOnProduct;
    private String displayOnCatalog;
    private String displayOnHeader;
    private String status;
    private short position;
    private String comparison;

    public String getParentFeatureName() {
        return parentFeatureName;
    }

    public void setParentFeatureName(String parentFeatureName) {
        this.parentFeatureName = parentFeatureName;
    }

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }

    public String getFeatureCode() {
        return featureCode;
    }

    public void setFeatureCode(String featureCode) {
        this.featureCode = featureCode;
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

    public String getFeatureType() {
        return featureType;
    }

    public void setFeatureType(String featureType) {
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

    public String getDisplayOnProduct() {
        return displayOnProduct;
    }

    public void setDisplayOnProduct(String displayOnProduct) {
        this.displayOnProduct = displayOnProduct;
    }

    public String getDisplayOnCatalog() {
        return displayOnCatalog;
    }

    public void setDisplayOnCatalog(String displayOnCatalog) {
        this.displayOnCatalog = displayOnCatalog;
    }

    public String getDisplayOnHeader() {
        return displayOnHeader;
    }

    public void setDisplayOnHeader(String displayOnHeader) {
        this.displayOnHeader = displayOnHeader;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getComparison() {
        return comparison;
    }

    public void setComparison(String comparison) {
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
        if (!(object instanceof ProductFeatureDTO)) {
            return false;
        }
        ProductFeatureDTO other = (ProductFeatureDTO) object;
        if ((this.featureId == null && other.featureId != null) || (this.featureId != null && !this.featureId.equals(other.featureId))) {
            return false;
        }
        return true;
    }

}
