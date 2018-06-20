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
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByUserId", query = "SELECT u FROM Users u WHERE u.userId = :userId")
    , @NamedQuery(name = "Users.findByStatus", query = "SELECT u FROM Users u WHERE u.status = :status")
    , @NamedQuery(name = "Users.findByUserType", query = "SELECT u FROM Users u WHERE u.userType = :userType")
    , @NamedQuery(name = "Users.findByUserLogin", query = "SELECT u FROM Users u WHERE u.userLogin = :userLogin")
    , @NamedQuery(name = "Users.findByReferer", query = "SELECT u FROM Users u WHERE u.referer = :referer")
    , @NamedQuery(name = "Users.findByIsRoot", query = "SELECT u FROM Users u WHERE u.isRoot = :isRoot")
    , @NamedQuery(name = "Users.findByCompanyId", query = "SELECT u FROM Users u WHERE u.companyId = :companyId")
    , @NamedQuery(name = "Users.findByLastLogin", query = "SELECT u FROM Users u WHERE u.lastLogin = :lastLogin")
    , @NamedQuery(name = "Users.findByTimestamp", query = "SELECT u FROM Users u WHERE u.timestamp = :timestamp")
    , @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")
    , @NamedQuery(name = "Users.findBySalt", query = "SELECT u FROM Users u WHERE u.salt = :salt")
    , @NamedQuery(name = "Users.findByFirstname", query = "SELECT u FROM Users u WHERE u.firstname = :firstname")
    , @NamedQuery(name = "Users.findByLastname", query = "SELECT u FROM Users u WHERE u.lastname = :lastname")
    , @NamedQuery(name = "Users.findByCompany", query = "SELECT u FROM Users u WHERE u.company = :company")
    , @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email")
    , @NamedQuery(name = "Users.findByPhone", query = "SELECT u FROM Users u WHERE u.phone = :phone")
    , @NamedQuery(name = "Users.findByFax", query = "SELECT u FROM Users u WHERE u.fax = :fax")
    , @NamedQuery(name = "Users.findByUrl", query = "SELECT u FROM Users u WHERE u.url = :url")
    , @NamedQuery(name = "Users.findByTaxExempt", query = "SELECT u FROM Users u WHERE u.taxExempt = :taxExempt")
    , @NamedQuery(name = "Users.findByLangCode", query = "SELECT u FROM Users u WHERE u.langCode = :langCode")
    , @NamedQuery(name = "Users.findByBirthday", query = "SELECT u FROM Users u WHERE u.birthday = :birthday")
    , @NamedQuery(name = "Users.findByPurchaseTimestampFrom", query = "SELECT u FROM Users u WHERE u.purchaseTimestampFrom = :purchaseTimestampFrom")
    , @NamedQuery(name = "Users.findByPurchaseTimestampTo", query = "SELECT u FROM Users u WHERE u.purchaseTimestampTo = :purchaseTimestampTo")
    , @NamedQuery(name = "Users.findByResponsibleEmail", query = "SELECT u FROM Users u WHERE u.responsibleEmail = :responsibleEmail")
    , @NamedQuery(name = "Users.findByLastPasswords", query = "SELECT u FROM Users u WHERE u.lastPasswords = :lastPasswords")
    , @NamedQuery(name = "Users.findByPasswordChangeTimestamp", query = "SELECT u FROM Users u WHERE u.passwordChangeTimestamp = :passwordChangeTimestamp")
    , @NamedQuery(name = "Users.findByApiKey", query = "SELECT u FROM Users u WHERE u.apiKey = :apiKey")
    , @NamedQuery(name = "Users.findByJanrainIdentifier", query = "SELECT u FROM Users u WHERE u.janrainIdentifier = :janrainIdentifier")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "user_type")
    private Character userType;
    @Basic(optional = false)
    @Column(name = "user_login")
    private String userLogin;
    @Basic(optional = false)
    @Column(name = "referer")
    private String referer;
    @Basic(optional = false)
    @Column(name = "is_root")
    private Character isRoot;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "last_login")
    private int lastLogin;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "salt")
    private String salt;
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
    @Column(name = "tax_exempt")
    private Character taxExempt;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;
    @Basic(optional = false)
    @Column(name = "birthday")
    private int birthday;
    @Basic(optional = false)
    @Column(name = "purchase_timestamp_from")
    private int purchaseTimestampFrom;
    @Basic(optional = false)
    @Column(name = "purchase_timestamp_to")
    private int purchaseTimestampTo;
    @Basic(optional = false)
    @Column(name = "responsible_email")
    private String responsibleEmail;
    @Basic(optional = false)
    @Column(name = "last_passwords")
    private String lastPasswords;
    @Basic(optional = false)
    @Column(name = "password_change_timestamp")
    private int passwordChangeTimestamp;
    @Basic(optional = false)
    @Column(name = "api_key")
    private String apiKey;
    @Basic(optional = false)
    @Column(name = "janrain_identifier")
    private String janrainIdentifier;

    public Users() {
    }

    public Users(Integer userId) {
        this.userId = userId;
    }

    public Users(Integer userId, Character status, Character userType, String userLogin, String referer, Character isRoot, int companyId, int lastLogin, int timestamp, String password, String salt, String firstname, String lastname, String company, String email, String phone, String fax, String url, Character taxExempt, String langCode, int birthday, int purchaseTimestampFrom, int purchaseTimestampTo, String responsibleEmail, String lastPasswords, int passwordChangeTimestamp, String apiKey, String janrainIdentifier) {
        this.userId = userId;
        this.status = status;
        this.userType = userType;
        this.userLogin = userLogin;
        this.referer = referer;
        this.isRoot = isRoot;
        this.companyId = companyId;
        this.lastLogin = lastLogin;
        this.timestamp = timestamp;
        this.password = password;
        this.salt = salt;
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.fax = fax;
        this.url = url;
        this.taxExempt = taxExempt;
        this.langCode = langCode;
        this.birthday = birthday;
        this.purchaseTimestampFrom = purchaseTimestampFrom;
        this.purchaseTimestampTo = purchaseTimestampTo;
        this.responsibleEmail = responsibleEmail;
        this.lastPasswords = lastPasswords;
        this.passwordChangeTimestamp = passwordChangeTimestamp;
        this.apiKey = apiKey;
        this.janrainIdentifier = janrainIdentifier;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getUserType() {
        return userType;
    }

    public void setUserType(Character userType) {
        this.userType = userType;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public Character getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(Character isRoot) {
        this.isRoot = isRoot;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(int lastLogin) {
        this.lastLogin = lastLogin;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getPurchaseTimestampFrom() {
        return purchaseTimestampFrom;
    }

    public void setPurchaseTimestampFrom(int purchaseTimestampFrom) {
        this.purchaseTimestampFrom = purchaseTimestampFrom;
    }

    public int getPurchaseTimestampTo() {
        return purchaseTimestampTo;
    }

    public void setPurchaseTimestampTo(int purchaseTimestampTo) {
        this.purchaseTimestampTo = purchaseTimestampTo;
    }

    public String getResponsibleEmail() {
        return responsibleEmail;
    }

    public void setResponsibleEmail(String responsibleEmail) {
        this.responsibleEmail = responsibleEmail;
    }

    public String getLastPasswords() {
        return lastPasswords;
    }

    public void setLastPasswords(String lastPasswords) {
        this.lastPasswords = lastPasswords;
    }

    public int getPasswordChangeTimestamp() {
        return passwordChangeTimestamp;
    }

    public void setPasswordChangeTimestamp(int passwordChangeTimestamp) {
        this.passwordChangeTimestamp = passwordChangeTimestamp;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getJanrainIdentifier() {
        return janrainIdentifier;
    }

    public void setJanrainIdentifier(String janrainIdentifier) {
        this.janrainIdentifier = janrainIdentifier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Users[ userId=" + userId + " ]";
    }
    
}
