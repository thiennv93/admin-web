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
@Table(name = "companies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Companies.findAll", query = "SELECT c FROM Companies c")
    , @NamedQuery(name = "Companies.findByCompanyId", query = "SELECT c FROM Companies c WHERE c.companyId = :companyId")
    , @NamedQuery(name = "Companies.findByStatus", query = "SELECT c FROM Companies c WHERE c.status = :status")
    , @NamedQuery(name = "Companies.findByCompany", query = "SELECT c FROM Companies c WHERE c.company = :company")
    , @NamedQuery(name = "Companies.findByLangCode", query = "SELECT c FROM Companies c WHERE c.langCode = :langCode")
    , @NamedQuery(name = "Companies.findByAddress", query = "SELECT c FROM Companies c WHERE c.address = :address")
    , @NamedQuery(name = "Companies.findByCity", query = "SELECT c FROM Companies c WHERE c.city = :city")
    , @NamedQuery(name = "Companies.findByState", query = "SELECT c FROM Companies c WHERE c.state = :state")
    , @NamedQuery(name = "Companies.findByCountry", query = "SELECT c FROM Companies c WHERE c.country = :country")
    , @NamedQuery(name = "Companies.findByZipcode", query = "SELECT c FROM Companies c WHERE c.zipcode = :zipcode")
    , @NamedQuery(name = "Companies.findByEmail", query = "SELECT c FROM Companies c WHERE c.email = :email")
    , @NamedQuery(name = "Companies.findByPhone", query = "SELECT c FROM Companies c WHERE c.phone = :phone")
    , @NamedQuery(name = "Companies.findByFax", query = "SELECT c FROM Companies c WHERE c.fax = :fax")
    , @NamedQuery(name = "Companies.findByUrl", query = "SELECT c FROM Companies c WHERE c.url = :url")
    , @NamedQuery(name = "Companies.findByStorefront", query = "SELECT c FROM Companies c WHERE c.storefront = :storefront")
    , @NamedQuery(name = "Companies.findBySecureStorefront", query = "SELECT c FROM Companies c WHERE c.secureStorefront = :secureStorefront")
    , @NamedQuery(name = "Companies.findByEntryPage", query = "SELECT c FROM Companies c WHERE c.entryPage = :entryPage")
    , @NamedQuery(name = "Companies.findByRedirectCustomer", query = "SELECT c FROM Companies c WHERE c.redirectCustomer = :redirectCustomer")
    , @NamedQuery(name = "Companies.findByTimestamp", query = "SELECT c FROM Companies c WHERE c.timestamp = :timestamp")
    , @NamedQuery(name = "Companies.findByRequestUserId", query = "SELECT c FROM Companies c WHERE c.requestUserId = :requestUserId")
    , @NamedQuery(name = "Companies.findByRequestAccountName", query = "SELECT c FROM Companies c WHERE c.requestAccountName = :requestAccountName")
    , @NamedQuery(name = "Companies.findByPreModeration", query = "SELECT c FROM Companies c WHERE c.preModeration = :preModeration")
    , @NamedQuery(name = "Companies.findByPreModerationEdit", query = "SELECT c FROM Companies c WHERE c.preModerationEdit = :preModerationEdit")
    , @NamedQuery(name = "Companies.findByPreModerationEditVendors", query = "SELECT c FROM Companies c WHERE c.preModerationEditVendors = :preModerationEditVendors")
    , @NamedQuery(name = "Companies.findByPlanId", query = "SELECT c FROM Companies c WHERE c.planId = :planId")
    , @NamedQuery(name = "Companies.findByPaypalEmail", query = "SELECT c FROM Companies c WHERE c.paypalEmail = :paypalEmail")
    , @NamedQuery(name = "Companies.findByPaypalBaseForCommission", query = "SELECT c FROM Companies c WHERE c.paypalBaseForCommission = :paypalBaseForCommission")
    , @NamedQuery(name = "Companies.findByPaypalVerification", query = "SELECT c FROM Companies c WHERE c.paypalVerification = :paypalVerification")
    , @NamedQuery(name = "Companies.findByPpaFirstName", query = "SELECT c FROM Companies c WHERE c.ppaFirstName = :ppaFirstName")
    , @NamedQuery(name = "Companies.findByPpaLastName", query = "SELECT c FROM Companies c WHERE c.ppaLastName = :ppaLastName")
    , @NamedQuery(name = "Companies.findByStripeConnectAccountId", query = "SELECT c FROM Companies c WHERE c.stripeConnectAccountId = :stripeConnectAccountId")})
public class Companies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "company_id")
    private Integer companyId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "company")
    private String company;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @Column(name = "zipcode")
    private String zipcode;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
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
    @Column(name = "storefront")
    private String storefront;
    @Basic(optional = false)
    @Column(name = "secure_storefront")
    private String secureStorefront;
    @Basic(optional = false)
    @Column(name = "entry_page")
    private String entryPage;
    @Basic(optional = false)
    @Column(name = "redirect_customer")
    private Character redirectCustomer;
    @Lob
    @Column(name = "countries_list")
    private String countriesList;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Lob
    @Column(name = "shippings")
    private String shippings;
    @Lob
    @Column(name = "logos")
    private String logos;
    @Basic(optional = false)
    @Column(name = "request_user_id")
    private int requestUserId;
    @Basic(optional = false)
    @Column(name = "request_account_name")
    private String requestAccountName;
    @Lob
    @Column(name = "request_account_data")
    private String requestAccountData;
    @Basic(optional = false)
    @Column(name = "pre_moderation")
    private Character preModeration;
    @Basic(optional = false)
    @Column(name = "pre_moderation_edit")
    private Character preModerationEdit;
    @Basic(optional = false)
    @Column(name = "pre_moderation_edit_vendors")
    private Character preModerationEditVendors;
    @Basic(optional = false)
    @Column(name = "plan_id")
    private int planId;
    @Basic(optional = false)
    @Column(name = "paypal_email")
    private String paypalEmail;
    @Basic(optional = false)
    @Column(name = "paypal_base_for_commission")
    private Character paypalBaseForCommission;
    @Basic(optional = false)
    @Column(name = "paypal_verification")
    private String paypalVerification;
    @Basic(optional = false)
    @Column(name = "ppa_first_name")
    private String ppaFirstName;
    @Basic(optional = false)
    @Column(name = "ppa_last_name")
    private String ppaLastName;
    @Basic(optional = false)
    @Column(name = "stripe_connect_account_id")
    private String stripeConnectAccountId;

    public Companies() {
    }

    public Companies(Integer companyId) {
        this.companyId = companyId;
    }

    public Companies(Integer companyId, Character status, String company, String langCode, String address, String city, String state, String country, String zipcode, String email, String phone, String fax, String url, String storefront, String secureStorefront, String entryPage, Character redirectCustomer, int timestamp, int requestUserId, String requestAccountName, Character preModeration, Character preModerationEdit, Character preModerationEditVendors, int planId, String paypalEmail, Character paypalBaseForCommission, String paypalVerification, String ppaFirstName, String ppaLastName, String stripeConnectAccountId) {
        this.companyId = companyId;
        this.status = status;
        this.company = company;
        this.langCode = langCode;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
        this.email = email;
        this.phone = phone;
        this.fax = fax;
        this.url = url;
        this.storefront = storefront;
        this.secureStorefront = secureStorefront;
        this.entryPage = entryPage;
        this.redirectCustomer = redirectCustomer;
        this.timestamp = timestamp;
        this.requestUserId = requestUserId;
        this.requestAccountName = requestAccountName;
        this.preModeration = preModeration;
        this.preModerationEdit = preModerationEdit;
        this.preModerationEditVendors = preModerationEditVendors;
        this.planId = planId;
        this.paypalEmail = paypalEmail;
        this.paypalBaseForCommission = paypalBaseForCommission;
        this.paypalVerification = paypalVerification;
        this.ppaFirstName = ppaFirstName;
        this.ppaLastName = ppaLastName;
        this.stripeConnectAccountId = stripeConnectAccountId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getStorefront() {
        return storefront;
    }

    public void setStorefront(String storefront) {
        this.storefront = storefront;
    }

    public String getSecureStorefront() {
        return secureStorefront;
    }

    public void setSecureStorefront(String secureStorefront) {
        this.secureStorefront = secureStorefront;
    }

    public String getEntryPage() {
        return entryPage;
    }

    public void setEntryPage(String entryPage) {
        this.entryPage = entryPage;
    }

    public Character getRedirectCustomer() {
        return redirectCustomer;
    }

    public void setRedirectCustomer(Character redirectCustomer) {
        this.redirectCustomer = redirectCustomer;
    }

    public String getCountriesList() {
        return countriesList;
    }

    public void setCountriesList(String countriesList) {
        this.countriesList = countriesList;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getShippings() {
        return shippings;
    }

    public void setShippings(String shippings) {
        this.shippings = shippings;
    }

    public String getLogos() {
        return logos;
    }

    public void setLogos(String logos) {
        this.logos = logos;
    }

    public int getRequestUserId() {
        return requestUserId;
    }

    public void setRequestUserId(int requestUserId) {
        this.requestUserId = requestUserId;
    }

    public String getRequestAccountName() {
        return requestAccountName;
    }

    public void setRequestAccountName(String requestAccountName) {
        this.requestAccountName = requestAccountName;
    }

    public String getRequestAccountData() {
        return requestAccountData;
    }

    public void setRequestAccountData(String requestAccountData) {
        this.requestAccountData = requestAccountData;
    }

    public Character getPreModeration() {
        return preModeration;
    }

    public void setPreModeration(Character preModeration) {
        this.preModeration = preModeration;
    }

    public Character getPreModerationEdit() {
        return preModerationEdit;
    }

    public void setPreModerationEdit(Character preModerationEdit) {
        this.preModerationEdit = preModerationEdit;
    }

    public Character getPreModerationEditVendors() {
        return preModerationEditVendors;
    }

    public void setPreModerationEditVendors(Character preModerationEditVendors) {
        this.preModerationEditVendors = preModerationEditVendors;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPaypalEmail() {
        return paypalEmail;
    }

    public void setPaypalEmail(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    public Character getPaypalBaseForCommission() {
        return paypalBaseForCommission;
    }

    public void setPaypalBaseForCommission(Character paypalBaseForCommission) {
        this.paypalBaseForCommission = paypalBaseForCommission;
    }

    public String getPaypalVerification() {
        return paypalVerification;
    }

    public void setPaypalVerification(String paypalVerification) {
        this.paypalVerification = paypalVerification;
    }

    public String getPpaFirstName() {
        return ppaFirstName;
    }

    public void setPpaFirstName(String ppaFirstName) {
        this.ppaFirstName = ppaFirstName;
    }

    public String getPpaLastName() {
        return ppaLastName;
    }

    public void setPpaLastName(String ppaLastName) {
        this.ppaLastName = ppaLastName;
    }

    public String getStripeConnectAccountId() {
        return stripeConnectAccountId;
    }

    public void setStripeConnectAccountId(String stripeConnectAccountId) {
        this.stripeConnectAccountId = stripeConnectAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyId != null ? companyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Companies)) {
            return false;
        }
        Companies other = (Companies) object;
        if ((this.companyId == null && other.companyId != null) || (this.companyId != null && !this.companyId.equals(other.companyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Companies[ companyId=" + companyId + " ]";
    }
    
}
