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
@Table(name = "orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o")
    , @NamedQuery(name = "Orders.findByOrderId", query = "SELECT o FROM Orders o WHERE o.orderId = :orderId")
    , @NamedQuery(name = "Orders.findByIsParentOrder", query = "SELECT o FROM Orders o WHERE o.isParentOrder = :isParentOrder")
    , @NamedQuery(name = "Orders.findByParentOrderId", query = "SELECT o FROM Orders o WHERE o.parentOrderId = :parentOrderId")
    , @NamedQuery(name = "Orders.findByCompanyId", query = "SELECT o FROM Orders o WHERE o.companyId = :companyId")
    , @NamedQuery(name = "Orders.findByIssuerId", query = "SELECT o FROM Orders o WHERE o.issuerId = :issuerId")
    , @NamedQuery(name = "Orders.findByUserId", query = "SELECT o FROM Orders o WHERE o.userId = :userId")
    , @NamedQuery(name = "Orders.findByTotal", query = "SELECT o FROM Orders o WHERE o.total = :total")
    , @NamedQuery(name = "Orders.findBySubtotal", query = "SELECT o FROM Orders o WHERE o.subtotal = :subtotal")
    , @NamedQuery(name = "Orders.findByDiscount", query = "SELECT o FROM Orders o WHERE o.discount = :discount")
    , @NamedQuery(name = "Orders.findBySubtotalDiscount", query = "SELECT o FROM Orders o WHERE o.subtotalDiscount = :subtotalDiscount")
    , @NamedQuery(name = "Orders.findByPaymentSurcharge", query = "SELECT o FROM Orders o WHERE o.paymentSurcharge = :paymentSurcharge")
    , @NamedQuery(name = "Orders.findByShippingIds", query = "SELECT o FROM Orders o WHERE o.shippingIds = :shippingIds")
    , @NamedQuery(name = "Orders.findByShippingCost", query = "SELECT o FROM Orders o WHERE o.shippingCost = :shippingCost")
    , @NamedQuery(name = "Orders.findByTimestamp", query = "SELECT o FROM Orders o WHERE o.timestamp = :timestamp")
    , @NamedQuery(name = "Orders.findByStatus", query = "SELECT o FROM Orders o WHERE o.status = :status")
    , @NamedQuery(name = "Orders.findByPromotionIds", query = "SELECT o FROM Orders o WHERE o.promotionIds = :promotionIds")
    , @NamedQuery(name = "Orders.findByFirstname", query = "SELECT o FROM Orders o WHERE o.firstname = :firstname")
    , @NamedQuery(name = "Orders.findByLastname", query = "SELECT o FROM Orders o WHERE o.lastname = :lastname")
    , @NamedQuery(name = "Orders.findByCompany", query = "SELECT o FROM Orders o WHERE o.company = :company")
    , @NamedQuery(name = "Orders.findByBFirstname", query = "SELECT o FROM Orders o WHERE o.bFirstname = :bFirstname")
    , @NamedQuery(name = "Orders.findByBLastname", query = "SELECT o FROM Orders o WHERE o.bLastname = :bLastname")
    , @NamedQuery(name = "Orders.findByBAddress", query = "SELECT o FROM Orders o WHERE o.bAddress = :bAddress")
    , @NamedQuery(name = "Orders.findByBAddress2", query = "SELECT o FROM Orders o WHERE o.bAddress2 = :bAddress2")
    , @NamedQuery(name = "Orders.findByBCity", query = "SELECT o FROM Orders o WHERE o.bCity = :bCity")
    , @NamedQuery(name = "Orders.findByBCounty", query = "SELECT o FROM Orders o WHERE o.bCounty = :bCounty")
    , @NamedQuery(name = "Orders.findByBState", query = "SELECT o FROM Orders o WHERE o.bState = :bState")
    , @NamedQuery(name = "Orders.findByBCountry", query = "SELECT o FROM Orders o WHERE o.bCountry = :bCountry")
    , @NamedQuery(name = "Orders.findByBZipcode", query = "SELECT o FROM Orders o WHERE o.bZipcode = :bZipcode")
    , @NamedQuery(name = "Orders.findByBPhone", query = "SELECT o FROM Orders o WHERE o.bPhone = :bPhone")
    , @NamedQuery(name = "Orders.findBySFirstname", query = "SELECT o FROM Orders o WHERE o.sFirstname = :sFirstname")
    , @NamedQuery(name = "Orders.findBySLastname", query = "SELECT o FROM Orders o WHERE o.sLastname = :sLastname")
    , @NamedQuery(name = "Orders.findBySAddress", query = "SELECT o FROM Orders o WHERE o.sAddress = :sAddress")
    , @NamedQuery(name = "Orders.findBySAddress2", query = "SELECT o FROM Orders o WHERE o.sAddress2 = :sAddress2")
    , @NamedQuery(name = "Orders.findBySCity", query = "SELECT o FROM Orders o WHERE o.sCity = :sCity")
    , @NamedQuery(name = "Orders.findBySCounty", query = "SELECT o FROM Orders o WHERE o.sCounty = :sCounty")
    , @NamedQuery(name = "Orders.findBySState", query = "SELECT o FROM Orders o WHERE o.sState = :sState")
    , @NamedQuery(name = "Orders.findBySCountry", query = "SELECT o FROM Orders o WHERE o.sCountry = :sCountry")
    , @NamedQuery(name = "Orders.findBySZipcode", query = "SELECT o FROM Orders o WHERE o.sZipcode = :sZipcode")
    , @NamedQuery(name = "Orders.findBySPhone", query = "SELECT o FROM Orders o WHERE o.sPhone = :sPhone")
    , @NamedQuery(name = "Orders.findBySAddressType", query = "SELECT o FROM Orders o WHERE o.sAddressType = :sAddressType")
    , @NamedQuery(name = "Orders.findByPhone", query = "SELECT o FROM Orders o WHERE o.phone = :phone")
    , @NamedQuery(name = "Orders.findByFax", query = "SELECT o FROM Orders o WHERE o.fax = :fax")
    , @NamedQuery(name = "Orders.findByUrl", query = "SELECT o FROM Orders o WHERE o.url = :url")
    , @NamedQuery(name = "Orders.findByEmail", query = "SELECT o FROM Orders o WHERE o.email = :email")
    , @NamedQuery(name = "Orders.findByPaymentId", query = "SELECT o FROM Orders o WHERE o.paymentId = :paymentId")
    , @NamedQuery(name = "Orders.findByTaxExempt", query = "SELECT o FROM Orders o WHERE o.taxExempt = :taxExempt")
    , @NamedQuery(name = "Orders.findByLangCode", query = "SELECT o FROM Orders o WHERE o.langCode = :langCode")
    , @NamedQuery(name = "Orders.findByRepaid", query = "SELECT o FROM Orders o WHERE o.repaid = :repaid")
    , @NamedQuery(name = "Orders.findByValidationCode", query = "SELECT o FROM Orders o WHERE o.validationCode = :validationCode")
    , @NamedQuery(name = "Orders.findByLocalizationId", query = "SELECT o FROM Orders o WHERE o.localizationId = :localizationId")
    , @NamedQuery(name = "Orders.findByProfileId", query = "SELECT o FROM Orders o WHERE o.profileId = :profileId")
    , @NamedQuery(name = "Orders.findByEbayOrderId", query = "SELECT o FROM Orders o WHERE o.ebayOrderId = :ebayOrderId")})
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @Column(name = "is_parent_order")
    private Character isParentOrder;
    @Basic(optional = false)
    @Column(name = "parent_order_id")
    private int parentOrderId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Column(name = "issuer_id")
    private Integer issuerId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "total")
    private BigDecimal total;
    @Basic(optional = false)
    @Column(name = "subtotal")
    private BigDecimal subtotal;
    @Basic(optional = false)
    @Column(name = "discount")
    private BigDecimal discount;
    @Basic(optional = false)
    @Column(name = "subtotal_discount")
    private BigDecimal subtotalDiscount;
    @Basic(optional = false)
    @Column(name = "payment_surcharge")
    private BigDecimal paymentSurcharge;
    @Basic(optional = false)
    @Column(name = "shipping_ids")
    private String shippingIds;
    @Basic(optional = false)
    @Column(name = "shipping_cost")
    private BigDecimal shippingCost;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Lob
    @Column(name = "notes")
    private String notes;
    @Lob
    @Column(name = "details")
    private String details;
    @Lob
    @Column(name = "promotions")
    private String promotions;
    @Basic(optional = false)
    @Column(name = "promotion_ids")
    private String promotionIds;
    @Basic(optional = false)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "company")
    private String company;
    @Basic(optional = false)
    @Column(name = "b_firstname")
    private String bFirstname;
    @Basic(optional = false)
    @Column(name = "b_lastname")
    private String bLastname;
    @Basic(optional = false)
    @Column(name = "b_address")
    private String bAddress;
    @Basic(optional = false)
    @Column(name = "b_address_2")
    private String bAddress2;
    @Basic(optional = false)
    @Column(name = "b_city")
    private String bCity;
    @Basic(optional = false)
    @Column(name = "b_county")
    private String bCounty;
    @Basic(optional = false)
    @Column(name = "b_state")
    private String bState;
    @Basic(optional = false)
    @Column(name = "b_country")
    private String bCountry;
    @Basic(optional = false)
    @Column(name = "b_zipcode")
    private String bZipcode;
    @Basic(optional = false)
    @Column(name = "b_phone")
    private String bPhone;
    @Basic(optional = false)
    @Column(name = "s_firstname")
    private String sFirstname;
    @Basic(optional = false)
    @Column(name = "s_lastname")
    private String sLastname;
    @Basic(optional = false)
    @Column(name = "s_address")
    private String sAddress;
    @Basic(optional = false)
    @Column(name = "s_address_2")
    private String sAddress2;
    @Basic(optional = false)
    @Column(name = "s_city")
    private String sCity;
    @Basic(optional = false)
    @Column(name = "s_county")
    private String sCounty;
    @Basic(optional = false)
    @Column(name = "s_state")
    private String sState;
    @Basic(optional = false)
    @Column(name = "s_country")
    private String sCountry;
    @Basic(optional = false)
    @Column(name = "s_zipcode")
    private String sZipcode;
    @Basic(optional = false)
    @Column(name = "s_phone")
    private String sPhone;
    @Basic(optional = false)
    @Column(name = "s_address_type")
    private String sAddressType;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "fax")
    private String fax;
    @Basic(optional = false)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "payment_id")
    private int paymentId;
    @Basic(optional = false)
    @Column(name = "tax_exempt")
    private Character taxExempt;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;
    @Basic(optional = false)
    @Lob
    @Column(name = "ip_address")
    private byte[] ipAddress;
    @Basic(optional = false)
    @Column(name = "repaid")
    private int repaid;
    @Basic(optional = false)
    @Column(name = "validation_code")
    private String validationCode;
    @Basic(optional = false)
    @Column(name = "localization_id")
    private int localizationId;
    @Basic(optional = false)
    @Column(name = "profile_id")
    private int profileId;
    @Basic(optional = false)
    @Column(name = "ebay_order_id")
    private String ebayOrderId;

    public Orders() {
    }

    public Orders(Integer orderId) {
        this.orderId = orderId;
    }

    public Orders(Integer orderId, Character isParentOrder, int parentOrderId, int companyId, int userId, BigDecimal total, BigDecimal subtotal, BigDecimal discount, BigDecimal subtotalDiscount, BigDecimal paymentSurcharge, String shippingIds, BigDecimal shippingCost, int timestamp, Character status, String promotionIds, String firstname, String lastname, String company, String bFirstname, String bLastname, String bAddress, String bAddress2, String bCity, String bCounty, String bState, String bCountry, String bZipcode, String bPhone, String sFirstname, String sLastname, String sAddress, String sAddress2, String sCity, String sCounty, String sState, String sCountry, String sZipcode, String sPhone, String sAddressType, String phone, String fax, String url, String email, int paymentId, Character taxExempt, String langCode, byte[] ipAddress, int repaid, String validationCode, int localizationId, int profileId, String ebayOrderId) {
        this.orderId = orderId;
        this.isParentOrder = isParentOrder;
        this.parentOrderId = parentOrderId;
        this.companyId = companyId;
        this.userId = userId;
        this.total = total;
        this.subtotal = subtotal;
        this.discount = discount;
        this.subtotalDiscount = subtotalDiscount;
        this.paymentSurcharge = paymentSurcharge;
        this.shippingIds = shippingIds;
        this.shippingCost = shippingCost;
        this.timestamp = timestamp;
        this.status = status;
        this.promotionIds = promotionIds;
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.bFirstname = bFirstname;
        this.bLastname = bLastname;
        this.bAddress = bAddress;
        this.bAddress2 = bAddress2;
        this.bCity = bCity;
        this.bCounty = bCounty;
        this.bState = bState;
        this.bCountry = bCountry;
        this.bZipcode = bZipcode;
        this.bPhone = bPhone;
        this.sFirstname = sFirstname;
        this.sLastname = sLastname;
        this.sAddress = sAddress;
        this.sAddress2 = sAddress2;
        this.sCity = sCity;
        this.sCounty = sCounty;
        this.sState = sState;
        this.sCountry = sCountry;
        this.sZipcode = sZipcode;
        this.sPhone = sPhone;
        this.sAddressType = sAddressType;
        this.phone = phone;
        this.fax = fax;
        this.url = url;
        this.email = email;
        this.paymentId = paymentId;
        this.taxExempt = taxExempt;
        this.langCode = langCode;
        this.ipAddress = ipAddress;
        this.repaid = repaid;
        this.validationCode = validationCode;
        this.localizationId = localizationId;
        this.profileId = profileId;
        this.ebayOrderId = ebayOrderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Character getIsParentOrder() {
        return isParentOrder;
    }

    public void setIsParentOrder(Character isParentOrder) {
        this.isParentOrder = isParentOrder;
    }

    public int getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(int parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Integer getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Integer issuerId) {
        this.issuerId = issuerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getSubtotalDiscount() {
        return subtotalDiscount;
    }

    public void setSubtotalDiscount(BigDecimal subtotalDiscount) {
        this.subtotalDiscount = subtotalDiscount;
    }

    public BigDecimal getPaymentSurcharge() {
        return paymentSurcharge;
    }

    public void setPaymentSurcharge(BigDecimal paymentSurcharge) {
        this.paymentSurcharge = paymentSurcharge;
    }

    public String getShippingIds() {
        return shippingIds;
    }

    public void setShippingIds(String shippingIds) {
        this.shippingIds = shippingIds;
    }

    public BigDecimal getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(BigDecimal shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPromotions() {
        return promotions;
    }

    public void setPromotions(String promotions) {
        this.promotions = promotions;
    }

    public String getPromotionIds() {
        return promotionIds;
    }

    public void setPromotionIds(String promotionIds) {
        this.promotionIds = promotionIds;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBFirstname() {
        return bFirstname;
    }

    public void setBFirstname(String bFirstname) {
        this.bFirstname = bFirstname;
    }

    public String getBLastname() {
        return bLastname;
    }

    public void setBLastname(String bLastname) {
        this.bLastname = bLastname;
    }

    public String getBAddress() {
        return bAddress;
    }

    public void setBAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public String getBAddress2() {
        return bAddress2;
    }

    public void setBAddress2(String bAddress2) {
        this.bAddress2 = bAddress2;
    }

    public String getBCity() {
        return bCity;
    }

    public void setBCity(String bCity) {
        this.bCity = bCity;
    }

    public String getBCounty() {
        return bCounty;
    }

    public void setBCounty(String bCounty) {
        this.bCounty = bCounty;
    }

    public String getBState() {
        return bState;
    }

    public void setBState(String bState) {
        this.bState = bState;
    }

    public String getBCountry() {
        return bCountry;
    }

    public void setBCountry(String bCountry) {
        this.bCountry = bCountry;
    }

    public String getBZipcode() {
        return bZipcode;
    }

    public void setBZipcode(String bZipcode) {
        this.bZipcode = bZipcode;
    }

    public String getBPhone() {
        return bPhone;
    }

    public void setBPhone(String bPhone) {
        this.bPhone = bPhone;
    }

    public String getSFirstname() {
        return sFirstname;
    }

    public void setSFirstname(String sFirstname) {
        this.sFirstname = sFirstname;
    }

    public String getSLastname() {
        return sLastname;
    }

    public void setSLastname(String sLastname) {
        this.sLastname = sLastname;
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getSAddress2() {
        return sAddress2;
    }

    public void setSAddress2(String sAddress2) {
        this.sAddress2 = sAddress2;
    }

    public String getSCity() {
        return sCity;
    }

    public void setSCity(String sCity) {
        this.sCity = sCity;
    }

    public String getSCounty() {
        return sCounty;
    }

    public void setSCounty(String sCounty) {
        this.sCounty = sCounty;
    }

    public String getSState() {
        return sState;
    }

    public void setSState(String sState) {
        this.sState = sState;
    }

    public String getSCountry() {
        return sCountry;
    }

    public void setSCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    public String getSZipcode() {
        return sZipcode;
    }

    public void setSZipcode(String sZipcode) {
        this.sZipcode = sZipcode;
    }

    public String getSPhone() {
        return sPhone;
    }

    public void setSPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getSAddressType() {
        return sAddressType;
    }

    public void setSAddressType(String sAddressType) {
        this.sAddressType = sAddressType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Character getTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(Character taxExempt) {
        this.taxExempt = taxExempt;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public byte[] getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(byte[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getRepaid() {
        return repaid;
    }

    public void setRepaid(int repaid) {
        this.repaid = repaid;
    }

    public String getValidationCode() {
        return validationCode;
    }

    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
    }

    public int getLocalizationId() {
        return localizationId;
    }

    public void setLocalizationId(int localizationId) {
        this.localizationId = localizationId;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getEbayOrderId() {
        return ebayOrderId;
    }

    public void setEbayOrderId(String ebayOrderId) {
        this.ebayOrderId = ebayOrderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Orders[ orderId=" + orderId + " ]";
    }
    
}
