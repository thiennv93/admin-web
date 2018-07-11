/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class ProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long productId;
    private Long categoryId;
    private String productCode;
    private String productName;
    private String productType;
    private String shortDescription;
    private String fullDescription;
    private String promoText;
    private Long storeId;
    private String approved;
    private Double listPrice;
    private Long amount;
    private Double weight;
    private Long length;
    private Long width;
    private Long height;
    private Double shippingFreight;
    private Long lowAvailLimit;
    private Date createTime;
    private Date updatedTime;
    private String freeShipping;
    private String isReturnable;
    private Long returnPeriod;
    private Date availSince;
    private Long parentProductId;
    private String variationCode;
    private String variationOption;
    private String status;

    public ProductDTO() {
    }

    public ProductDTO(Long productId) {
        this.productId = productId;
    }

    public ProductDTO(Long productId, Long categoryId, String productCode, String productName, String productType, Long storeId, String approved, Double listPrice, Long amount, Double weight, Long length, Long width, Long height, Double shippingFreight, Long lowAvailLimit, Date createTime, Date updatedTime, String freeShipping, String isReturnable, Long returnPeriod, Date availSince, String status) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productCode = productCode;
        this.productName = productName;
        this.productType = productType;
        this.storeId = storeId;
        this.approved = approved;
        this.listPrice = listPrice;
        this.amount = amount;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.shippingFreight = shippingFreight;
        this.lowAvailLimit = lowAvailLimit;
        this.createTime = createTime;
        this.updatedTime = updatedTime;
        this.freeShipping = freeShipping;
        this.isReturnable = isReturnable;
        this.returnPeriod = returnPeriod;
        this.availSince = availSince;
        this.status = status;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getPromoText() {
        return promoText;
    }

    public void setPromoText(String promoText) {
        this.promoText = promoText;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Double getShippingFreight() {
        return shippingFreight;
    }

    public void setShippingFreight(Double shippingFreight) {
        this.shippingFreight = shippingFreight;
    }

    public Long getLowAvailLimit() {
        return lowAvailLimit;
    }

    public void setLowAvailLimit(Long lowAvailLimit) {
        this.lowAvailLimit = lowAvailLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    public String getIsReturnable() {
        return isReturnable;
    }

    public void setIsReturnable(String isReturnable) {
        this.isReturnable = isReturnable;
    }

    public Long getReturnPeriod() {
        return returnPeriod;
    }

    public void setReturnPeriod(Long returnPeriod) {
        this.returnPeriod = returnPeriod;
    }

    public Date getAvailSince() {
        return availSince;
    }

    public void setAvailSince(Date availSince) {
        this.availSince = availSince;
    }

    public Long getParentProductId() {
        return parentProductId;
    }

    public void setParentProductId(Long parentProductId) {
        this.parentProductId = parentProductId;
    }

    public String getVariationCode() {
        return variationCode;
    }

    public void setVariationCode(String variationCode) {
        this.variationCode = variationCode;
    }

    public String getVariationOption() {
        return variationOption;
    }

    public void setVariationOption(String variationOption) {
        this.variationOption = variationOption;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductDTO)) {
            return false;
        }
        ProductDTO other = (ProductDTO) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

}
