/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "vendor_plans")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VendorPlans.findAll", query = "SELECT v FROM VendorPlans v")
    , @NamedQuery(name = "VendorPlans.findByPlanId", query = "SELECT v FROM VendorPlans v WHERE v.planId = :planId")
    , @NamedQuery(name = "VendorPlans.findByStatus", query = "SELECT v FROM VendorPlans v WHERE v.status = :status")
    , @NamedQuery(name = "VendorPlans.findByPosition", query = "SELECT v FROM VendorPlans v WHERE v.position = :position")
    , @NamedQuery(name = "VendorPlans.findByIsDefault", query = "SELECT v FROM VendorPlans v WHERE v.isDefault = :isDefault")
    , @NamedQuery(name = "VendorPlans.findByPrice", query = "SELECT v FROM VendorPlans v WHERE v.price = :price")
    , @NamedQuery(name = "VendorPlans.findByPeriodicity", query = "SELECT v FROM VendorPlans v WHERE v.periodicity = :periodicity")
    , @NamedQuery(name = "VendorPlans.findByCommission", query = "SELECT v FROM VendorPlans v WHERE v.commission = :commission")
    , @NamedQuery(name = "VendorPlans.findByProductsLimit", query = "SELECT v FROM VendorPlans v WHERE v.productsLimit = :productsLimit")
    , @NamedQuery(name = "VendorPlans.findByRevenueLimit", query = "SELECT v FROM VendorPlans v WHERE v.revenueLimit = :revenueLimit")
    , @NamedQuery(name = "VendorPlans.findByVendorStore", query = "SELECT v FROM VendorPlans v WHERE v.vendorStore = :vendorStore")})
public class VendorPlans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "plan_id")
    private Integer planId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "is_default")
    private boolean isDefault;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "price")
    private BigDecimal price;
    @Basic(optional = false)
    @Column(name = "periodicity")
    private String periodicity;
    @Basic(optional = false)
    @Column(name = "commission")
    private BigDecimal commission;
    @Basic(optional = false)
    @Column(name = "products_limit")
    private int productsLimit;
    @Basic(optional = false)
    @Column(name = "revenue_limit")
    private BigDecimal revenueLimit;
    @Basic(optional = false)
    @Column(name = "vendor_store")
    private boolean vendorStore;
    @Lob
    @Column(name = "categories")
    private String categories;

    public VendorPlans() {
    }

    public VendorPlans(Integer planId) {
        this.planId = planId;
    }

    public VendorPlans(Integer planId, Character status, short position, boolean isDefault, BigDecimal price, String periodicity, BigDecimal commission, int productsLimit, BigDecimal revenueLimit, boolean vendorStore) {
        this.planId = planId;
        this.status = status;
        this.position = position;
        this.isDefault = isDefault;
        this.price = price;
        this.periodicity = periodicity;
        this.commission = commission;
        this.productsLimit = productsLimit;
        this.revenueLimit = revenueLimit;
        this.vendorStore = vendorStore;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
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

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public int getProductsLimit() {
        return productsLimit;
    }

    public void setProductsLimit(int productsLimit) {
        this.productsLimit = productsLimit;
    }

    public BigDecimal getRevenueLimit() {
        return revenueLimit;
    }

    public void setRevenueLimit(BigDecimal revenueLimit) {
        this.revenueLimit = revenueLimit;
    }

    public boolean getVendorStore() {
        return vendorStore;
    }

    public void setVendorStore(boolean vendorStore) {
        this.vendorStore = vendorStore;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planId != null ? planId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorPlans)) {
            return false;
        }
        VendorPlans other = (VendorPlans) object;
        if ((this.planId == null && other.planId != null) || (this.planId != null && !this.planId.equals(other.planId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VendorPlans[ planId=" + planId + " ]";
    }
    
}
