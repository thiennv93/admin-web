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
@Table(name = "ebay_shippings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbayShippings.findAll", query = "SELECT e FROM EbayShippings e")
    , @NamedQuery(name = "EbayShippings.findByServiceId", query = "SELECT e FROM EbayShippings e WHERE e.ebayShippingsPK.serviceId = :serviceId")
    , @NamedQuery(name = "EbayShippings.findBySiteId", query = "SELECT e FROM EbayShippings e WHERE e.ebayShippingsPK.siteId = :siteId")
    , @NamedQuery(name = "EbayShippings.findByName", query = "SELECT e FROM EbayShippings e WHERE e.name = :name")
    , @NamedQuery(name = "EbayShippings.findByDescription", query = "SELECT e FROM EbayShippings e WHERE e.description = :description")
    , @NamedQuery(name = "EbayShippings.findByServiceType", query = "SELECT e FROM EbayShippings e WHERE e.serviceType = :serviceType")
    , @NamedQuery(name = "EbayShippings.findByIsInternational", query = "SELECT e FROM EbayShippings e WHERE e.isInternational = :isInternational")
    , @NamedQuery(name = "EbayShippings.findByCategory", query = "SELECT e FROM EbayShippings e WHERE e.category = :category")
    , @NamedQuery(name = "EbayShippings.findByShipDaysMax", query = "SELECT e FROM EbayShippings e WHERE e.shipDaysMax = :shipDaysMax")
    , @NamedQuery(name = "EbayShippings.findByShipDaysMin", query = "SELECT e FROM EbayShippings e WHERE e.shipDaysMin = :shipDaysMin")
    , @NamedQuery(name = "EbayShippings.findByPackage1", query = "SELECT e FROM EbayShippings e WHERE e.package1 = :package1")
    , @NamedQuery(name = "EbayShippings.findByCarrier", query = "SELECT e FROM EbayShippings e WHERE e.carrier = :carrier")
    , @NamedQuery(name = "EbayShippings.findByWeightRequired", query = "SELECT e FROM EbayShippings e WHERE e.weightRequired = :weightRequired")
    , @NamedQuery(name = "EbayShippings.findBySellingFlow", query = "SELECT e FROM EbayShippings e WHERE e.sellingFlow = :sellingFlow")
    , @NamedQuery(name = "EbayShippings.findByDimensionsRequired", query = "SELECT e FROM EbayShippings e WHERE e.dimensionsRequired = :dimensionsRequired")
    , @NamedQuery(name = "EbayShippings.findBySurchargeApplicable", query = "SELECT e FROM EbayShippings e WHERE e.surchargeApplicable = :surchargeApplicable")
    , @NamedQuery(name = "EbayShippings.findByExpeditedService", query = "SELECT e FROM EbayShippings e WHERE e.expeditedService = :expeditedService")
    , @NamedQuery(name = "EbayShippings.findByDetailVersion", query = "SELECT e FROM EbayShippings e WHERE e.detailVersion = :detailVersion")
    , @NamedQuery(name = "EbayShippings.findByUpdateTimestamp", query = "SELECT e FROM EbayShippings e WHERE e.updateTimestamp = :updateTimestamp")})
public class EbayShippings implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EbayShippingsPK ebayShippingsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "service_type")
    private String serviceType;
    @Basic(optional = false)
    @Column(name = "is_international")
    private Character isInternational;
    @Basic(optional = false)
    @Column(name = "category")
    private String category;
    @Basic(optional = false)
    @Column(name = "ship_days_max")
    private short shipDaysMax;
    @Basic(optional = false)
    @Column(name = "ship_days_min")
    private short shipDaysMin;
    @Basic(optional = false)
    @Column(name = "package")
    private String package1;
    @Basic(optional = false)
    @Column(name = "carrier")
    private String carrier;
    @Basic(optional = false)
    @Column(name = "weight_required")
    private Character weightRequired;
    @Basic(optional = false)
    @Column(name = "selling_flow")
    private Character sellingFlow;
    @Basic(optional = false)
    @Column(name = "dimensions_required")
    private Character dimensionsRequired;
    @Basic(optional = false)
    @Column(name = "surcharge_applicable")
    private Character surchargeApplicable;
    @Basic(optional = false)
    @Column(name = "expedited_service")
    private Character expeditedService;
    @Basic(optional = false)
    @Column(name = "detail_version")
    private int detailVersion;
    @Basic(optional = false)
    @Column(name = "update_timestamp")
    private int updateTimestamp;

    public EbayShippings() {
    }

    public EbayShippings(EbayShippingsPK ebayShippingsPK) {
        this.ebayShippingsPK = ebayShippingsPK;
    }

    public EbayShippings(EbayShippingsPK ebayShippingsPK, String name, String description, String serviceType, Character isInternational, String category, short shipDaysMax, short shipDaysMin, String package1, String carrier, Character weightRequired, Character sellingFlow, Character dimensionsRequired, Character surchargeApplicable, Character expeditedService, int detailVersion, int updateTimestamp) {
        this.ebayShippingsPK = ebayShippingsPK;
        this.name = name;
        this.description = description;
        this.serviceType = serviceType;
        this.isInternational = isInternational;
        this.category = category;
        this.shipDaysMax = shipDaysMax;
        this.shipDaysMin = shipDaysMin;
        this.package1 = package1;
        this.carrier = carrier;
        this.weightRequired = weightRequired;
        this.sellingFlow = sellingFlow;
        this.dimensionsRequired = dimensionsRequired;
        this.surchargeApplicable = surchargeApplicable;
        this.expeditedService = expeditedService;
        this.detailVersion = detailVersion;
        this.updateTimestamp = updateTimestamp;
    }

    public EbayShippings(int serviceId, int siteId) {
        this.ebayShippingsPK = new EbayShippingsPK(serviceId, siteId);
    }

    public EbayShippingsPK getEbayShippingsPK() {
        return ebayShippingsPK;
    }

    public void setEbayShippingsPK(EbayShippingsPK ebayShippingsPK) {
        this.ebayShippingsPK = ebayShippingsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Character getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(Character isInternational) {
        this.isInternational = isInternational;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public short getShipDaysMax() {
        return shipDaysMax;
    }

    public void setShipDaysMax(short shipDaysMax) {
        this.shipDaysMax = shipDaysMax;
    }

    public short getShipDaysMin() {
        return shipDaysMin;
    }

    public void setShipDaysMin(short shipDaysMin) {
        this.shipDaysMin = shipDaysMin;
    }

    public String getPackage1() {
        return package1;
    }

    public void setPackage1(String package1) {
        this.package1 = package1;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Character getWeightRequired() {
        return weightRequired;
    }

    public void setWeightRequired(Character weightRequired) {
        this.weightRequired = weightRequired;
    }

    public Character getSellingFlow() {
        return sellingFlow;
    }

    public void setSellingFlow(Character sellingFlow) {
        this.sellingFlow = sellingFlow;
    }

    public Character getDimensionsRequired() {
        return dimensionsRequired;
    }

    public void setDimensionsRequired(Character dimensionsRequired) {
        this.dimensionsRequired = dimensionsRequired;
    }

    public Character getSurchargeApplicable() {
        return surchargeApplicable;
    }

    public void setSurchargeApplicable(Character surchargeApplicable) {
        this.surchargeApplicable = surchargeApplicable;
    }

    public Character getExpeditedService() {
        return expeditedService;
    }

    public void setExpeditedService(Character expeditedService) {
        this.expeditedService = expeditedService;
    }

    public int getDetailVersion() {
        return detailVersion;
    }

    public void setDetailVersion(int detailVersion) {
        this.detailVersion = detailVersion;
    }

    public int getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(int updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ebayShippingsPK != null ? ebayShippingsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayShippings)) {
            return false;
        }
        EbayShippings other = (EbayShippings) object;
        if ((this.ebayShippingsPK == null && other.ebayShippingsPK != null) || (this.ebayShippingsPK != null && !this.ebayShippingsPK.equals(other.ebayShippingsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayShippings[ ebayShippingsPK=" + ebayShippingsPK + " ]";
    }
    
}
