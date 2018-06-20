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
@Table(name = "ebay_templates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbayTemplates.findAll", query = "SELECT e FROM EbayTemplates e")
    , @NamedQuery(name = "EbayTemplates.findByTemplateId", query = "SELECT e FROM EbayTemplates e WHERE e.templateId = :templateId")
    , @NamedQuery(name = "EbayTemplates.findByStatus", query = "SELECT e FROM EbayTemplates e WHERE e.status = :status")
    , @NamedQuery(name = "EbayTemplates.findBySiteId", query = "SELECT e FROM EbayTemplates e WHERE e.siteId = :siteId")
    , @NamedQuery(name = "EbayTemplates.findByUseAsDefault", query = "SELECT e FROM EbayTemplates e WHERE e.useAsDefault = :useAsDefault")
    , @NamedQuery(name = "EbayTemplates.findByRootCategory", query = "SELECT e FROM EbayTemplates e WHERE e.rootCategory = :rootCategory")
    , @NamedQuery(name = "EbayTemplates.findByCategory", query = "SELECT e FROM EbayTemplates e WHERE e.category = :category")
    , @NamedQuery(name = "EbayTemplates.findByRootSecCategory", query = "SELECT e FROM EbayTemplates e WHERE e.rootSecCategory = :rootSecCategory")
    , @NamedQuery(name = "EbayTemplates.findBySecCategory", query = "SELECT e FROM EbayTemplates e WHERE e.secCategory = :secCategory")
    , @NamedQuery(name = "EbayTemplates.findByEbayDuration", query = "SELECT e FROM EbayTemplates e WHERE e.ebayDuration = :ebayDuration")
    , @NamedQuery(name = "EbayTemplates.findByPaymentMethods", query = "SELECT e FROM EbayTemplates e WHERE e.paymentMethods = :paymentMethods")
    , @NamedQuery(name = "EbayTemplates.findByPaypalEmail", query = "SELECT e FROM EbayTemplates e WHERE e.paypalEmail = :paypalEmail")
    , @NamedQuery(name = "EbayTemplates.findByConditionId", query = "SELECT e FROM EbayTemplates e WHERE e.conditionId = :conditionId")
    , @NamedQuery(name = "EbayTemplates.findByDispatchDays", query = "SELECT e FROM EbayTemplates e WHERE e.dispatchDays = :dispatchDays")
    , @NamedQuery(name = "EbayTemplates.findByShippingType", query = "SELECT e FROM EbayTemplates e WHERE e.shippingType = :shippingType")
    , @NamedQuery(name = "EbayTemplates.findByShippings", query = "SELECT e FROM EbayTemplates e WHERE e.shippings = :shippings")
    , @NamedQuery(name = "EbayTemplates.findByInternationalShippings", query = "SELECT e FROM EbayTemplates e WHERE e.internationalShippings = :internationalShippings")
    , @NamedQuery(name = "EbayTemplates.findByCompanyId", query = "SELECT e FROM EbayTemplates e WHERE e.companyId = :companyId")
    , @NamedQuery(name = "EbayTemplates.findByFreeShipping", query = "SELECT e FROM EbayTemplates e WHERE e.freeShipping = :freeShipping")
    , @NamedQuery(name = "EbayTemplates.findByShippingCost", query = "SELECT e FROM EbayTemplates e WHERE e.shippingCost = :shippingCost")
    , @NamedQuery(name = "EbayTemplates.findByShippingCostAdditional", query = "SELECT e FROM EbayTemplates e WHERE e.shippingCostAdditional = :shippingCostAdditional")
    , @NamedQuery(name = "EbayTemplates.findByInternationalShippingCost", query = "SELECT e FROM EbayTemplates e WHERE e.internationalShippingCost = :internationalShippingCost")
    , @NamedQuery(name = "EbayTemplates.findByInternationalShippingCostAdditional", query = "SELECT e FROM EbayTemplates e WHERE e.internationalShippingCostAdditional = :internationalShippingCostAdditional")
    , @NamedQuery(name = "EbayTemplates.findByReturnPolicy", query = "SELECT e FROM EbayTemplates e WHERE e.returnPolicy = :returnPolicy")
    , @NamedQuery(name = "EbayTemplates.findByContactTime", query = "SELECT e FROM EbayTemplates e WHERE e.contactTime = :contactTime")
    , @NamedQuery(name = "EbayTemplates.findByRefundMethod", query = "SELECT e FROM EbayTemplates e WHERE e.refundMethod = :refundMethod")
    , @NamedQuery(name = "EbayTemplates.findByCostPaidBy", query = "SELECT e FROM EbayTemplates e WHERE e.costPaidBy = :costPaidBy")})
public class EbayTemplates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "template_id")
    private Integer templateId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "site_id")
    private int siteId;
    @Basic(optional = false)
    @Column(name = "use_as_default")
    private Character useAsDefault;
    @Basic(optional = false)
    @Column(name = "root_category")
    private int rootCategory;
    @Basic(optional = false)
    @Column(name = "category")
    private int category;
    @Basic(optional = false)
    @Column(name = "root_sec_category")
    private int rootSecCategory;
    @Basic(optional = false)
    @Column(name = "sec_category")
    private int secCategory;
    @Basic(optional = false)
    @Column(name = "ebay_duration")
    private String ebayDuration;
    @Basic(optional = false)
    @Column(name = "payment_methods")
    private String paymentMethods;
    @Basic(optional = false)
    @Column(name = "paypal_email")
    private String paypalEmail;
    @Basic(optional = false)
    @Column(name = "condition_id")
    private int conditionId;
    @Basic(optional = false)
    @Column(name = "dispatch_days")
    private short dispatchDays;
    @Basic(optional = false)
    @Column(name = "shipping_type")
    private Character shippingType;
    @Basic(optional = false)
    @Column(name = "shippings")
    private String shippings;
    @Basic(optional = false)
    @Column(name = "international_shippings")
    private String internationalShippings;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Column(name = "free_shipping")
    private String freeShipping;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "shipping_cost")
    private Double shippingCost;
    @Column(name = "shipping_cost_additional")
    private Double shippingCostAdditional;
    @Column(name = "international_shipping_cost")
    private Double internationalShippingCost;
    @Column(name = "international_shipping_cost_additional")
    private Double internationalShippingCostAdditional;
    @Lob
    @Column(name = "international_shipping_locations")
    private String internationalShippingLocations;
    @Column(name = "return_policy")
    private String returnPolicy;
    @Column(name = "contact_time")
    private String contactTime;
    @Column(name = "refund_method")
    private String refundMethod;
    @Column(name = "cost_paid_by")
    private String costPaidBy;
    @Lob
    @Column(name = "return_policy_descr")
    private String returnPolicyDescr;
    @Lob
    @Column(name = "identifiers")
    private String identifiers;

    public EbayTemplates() {
    }

    public EbayTemplates(Integer templateId) {
        this.templateId = templateId;
    }

    public EbayTemplates(Integer templateId, Character status, int siteId, Character useAsDefault, int rootCategory, int category, int rootSecCategory, int secCategory, String ebayDuration, String paymentMethods, String paypalEmail, int conditionId, short dispatchDays, Character shippingType, String shippings, String internationalShippings, int companyId) {
        this.templateId = templateId;
        this.status = status;
        this.siteId = siteId;
        this.useAsDefault = useAsDefault;
        this.rootCategory = rootCategory;
        this.category = category;
        this.rootSecCategory = rootSecCategory;
        this.secCategory = secCategory;
        this.ebayDuration = ebayDuration;
        this.paymentMethods = paymentMethods;
        this.paypalEmail = paypalEmail;
        this.conditionId = conditionId;
        this.dispatchDays = dispatchDays;
        this.shippingType = shippingType;
        this.shippings = shippings;
        this.internationalShippings = internationalShippings;
        this.companyId = companyId;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public Character getUseAsDefault() {
        return useAsDefault;
    }

    public void setUseAsDefault(Character useAsDefault) {
        this.useAsDefault = useAsDefault;
    }

    public int getRootCategory() {
        return rootCategory;
    }

    public void setRootCategory(int rootCategory) {
        this.rootCategory = rootCategory;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getRootSecCategory() {
        return rootSecCategory;
    }

    public void setRootSecCategory(int rootSecCategory) {
        this.rootSecCategory = rootSecCategory;
    }

    public int getSecCategory() {
        return secCategory;
    }

    public void setSecCategory(int secCategory) {
        this.secCategory = secCategory;
    }

    public String getEbayDuration() {
        return ebayDuration;
    }

    public void setEbayDuration(String ebayDuration) {
        this.ebayDuration = ebayDuration;
    }

    public String getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public String getPaypalEmail() {
        return paypalEmail;
    }

    public void setPaypalEmail(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    public int getConditionId() {
        return conditionId;
    }

    public void setConditionId(int conditionId) {
        this.conditionId = conditionId;
    }

    public short getDispatchDays() {
        return dispatchDays;
    }

    public void setDispatchDays(short dispatchDays) {
        this.dispatchDays = dispatchDays;
    }

    public Character getShippingType() {
        return shippingType;
    }

    public void setShippingType(Character shippingType) {
        this.shippingType = shippingType;
    }

    public String getShippings() {
        return shippings;
    }

    public void setShippings(String shippings) {
        this.shippings = shippings;
    }

    public String getInternationalShippings() {
        return internationalShippings;
    }

    public void setInternationalShippings(String internationalShippings) {
        this.internationalShippings = internationalShippings;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Double getShippingCostAdditional() {
        return shippingCostAdditional;
    }

    public void setShippingCostAdditional(Double shippingCostAdditional) {
        this.shippingCostAdditional = shippingCostAdditional;
    }

    public Double getInternationalShippingCost() {
        return internationalShippingCost;
    }

    public void setInternationalShippingCost(Double internationalShippingCost) {
        this.internationalShippingCost = internationalShippingCost;
    }

    public Double getInternationalShippingCostAdditional() {
        return internationalShippingCostAdditional;
    }

    public void setInternationalShippingCostAdditional(Double internationalShippingCostAdditional) {
        this.internationalShippingCostAdditional = internationalShippingCostAdditional;
    }

    public String getInternationalShippingLocations() {
        return internationalShippingLocations;
    }

    public void setInternationalShippingLocations(String internationalShippingLocations) {
        this.internationalShippingLocations = internationalShippingLocations;
    }

    public String getReturnPolicy() {
        return returnPolicy;
    }

    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    public String getContactTime() {
        return contactTime;
    }

    public void setContactTime(String contactTime) {
        this.contactTime = contactTime;
    }

    public String getRefundMethod() {
        return refundMethod;
    }

    public void setRefundMethod(String refundMethod) {
        this.refundMethod = refundMethod;
    }

    public String getCostPaidBy() {
        return costPaidBy;
    }

    public void setCostPaidBy(String costPaidBy) {
        this.costPaidBy = costPaidBy;
    }

    public String getReturnPolicyDescr() {
        return returnPolicyDescr;
    }

    public void setReturnPolicyDescr(String returnPolicyDescr) {
        this.returnPolicyDescr = returnPolicyDescr;
    }

    public String getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(String identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (templateId != null ? templateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayTemplates)) {
            return false;
        }
        EbayTemplates other = (EbayTemplates) object;
        if ((this.templateId == null && other.templateId != null) || (this.templateId != null && !this.templateId.equals(other.templateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayTemplates[ templateId=" + templateId + " ]";
    }
    
}
