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
@Table(name = "product_filters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFilters.findAll", query = "SELECT p FROM ProductFilters p")
    , @NamedQuery(name = "ProductFilters.findByFilterId", query = "SELECT p FROM ProductFilters p WHERE p.filterId = :filterId")
    , @NamedQuery(name = "ProductFilters.findByCompanyId", query = "SELECT p FROM ProductFilters p WHERE p.companyId = :companyId")
    , @NamedQuery(name = "ProductFilters.findByFeatureId", query = "SELECT p FROM ProductFilters p WHERE p.featureId = :featureId")
    , @NamedQuery(name = "ProductFilters.findByPosition", query = "SELECT p FROM ProductFilters p WHERE p.position = :position")
    , @NamedQuery(name = "ProductFilters.findByFieldType", query = "SELECT p FROM ProductFilters p WHERE p.fieldType = :fieldType")
    , @NamedQuery(name = "ProductFilters.findByStatus", query = "SELECT p FROM ProductFilters p WHERE p.status = :status")
    , @NamedQuery(name = "ProductFilters.findByRoundTo", query = "SELECT p FROM ProductFilters p WHERE p.roundTo = :roundTo")
    , @NamedQuery(name = "ProductFilters.findByDisplayCount", query = "SELECT p FROM ProductFilters p WHERE p.displayCount = :displayCount")
    , @NamedQuery(name = "ProductFilters.findByDisplay", query = "SELECT p FROM ProductFilters p WHERE p.display = :display")})
public class ProductFilters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "filter_id")
    private Integer filterId;
    @Lob
    @Column(name = "categories_path")
    private String categoriesPath;
    @Column(name = "company_id")
    private Integer companyId;
    @Basic(optional = false)
    @Column(name = "feature_id")
    private int featureId;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "field_type")
    private Character fieldType;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "round_to")
    private String roundTo;
    @Basic(optional = false)
    @Column(name = "display_count")
    private short displayCount;
    @Basic(optional = false)
    @Column(name = "display")
    private Character display;

    public ProductFilters() {
    }

    public ProductFilters(Integer filterId) {
        this.filterId = filterId;
    }

    public ProductFilters(Integer filterId, int featureId, short position, Character fieldType, Character status, String roundTo, short displayCount, Character display) {
        this.filterId = filterId;
        this.featureId = featureId;
        this.position = position;
        this.fieldType = fieldType;
        this.status = status;
        this.roundTo = roundTo;
        this.displayCount = displayCount;
        this.display = display;
    }

    public Integer getFilterId() {
        return filterId;
    }

    public void setFilterId(Integer filterId) {
        this.filterId = filterId;
    }

    public String getCategoriesPath() {
        return categoriesPath;
    }

    public void setCategoriesPath(String categoriesPath) {
        this.categoriesPath = categoriesPath;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Character getFieldType() {
        return fieldType;
    }

    public void setFieldType(Character fieldType) {
        this.fieldType = fieldType;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getRoundTo() {
        return roundTo;
    }

    public void setRoundTo(String roundTo) {
        this.roundTo = roundTo;
    }

    public short getDisplayCount() {
        return displayCount;
    }

    public void setDisplayCount(short displayCount) {
        this.displayCount = displayCount;
    }

    public Character getDisplay() {
        return display;
    }

    public void setDisplay(Character display) {
        this.display = display;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filterId != null ? filterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFilters)) {
            return false;
        }
        ProductFilters other = (ProductFilters) object;
        if ((this.filterId == null && other.filterId != null) || (this.filterId != null && !this.filterId.equals(other.filterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFilters[ filterId=" + filterId + " ]";
    }
    
}
