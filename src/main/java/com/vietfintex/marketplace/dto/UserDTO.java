package com.vietfintex.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dell
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long userId;
    private String status;
    private String userType;
    private String userName;
    private String referer;
    private String isRoot;
    private Integer companyId;
    private Date lastLogin;
    private Date timestamp;

    private String password;
    private String confirmPassword;
    private String salt;
    private String firstname;
    private String lastname;
    private String company;
    private String email;
    private String phone;
    private String fax;
    private String url;
    private String taxExempt;
    private String langCode;
    private Date birthday;
    private Date purchaseTimestampFrom;
    private Date purchaseTimestampTo;
    private String responsibleEmail;
    private String lastPasswords;
    private Date passwordChangeTimestamp;
    private String apiKey;
    private String janrainIdentifier;
    private String sex;

    private List<MenuDTO> menuList;

    public List<MenuDTO> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuDTO> menuList) {
        this.menuList = menuList;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(String isRoot) {
        this.isRoot = isRoot;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
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

    public String getTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(String taxExempt) {
        this.taxExempt = taxExempt;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getPurchaseTimestampFrom() {
        return purchaseTimestampFrom;
    }

    public void setPurchaseTimestampFrom(Date purchaseTimestampFrom) {
        this.purchaseTimestampFrom = purchaseTimestampFrom;
    }

    public Date getPurchaseTimestampTo() {
        return purchaseTimestampTo;
    }

    public void setPurchaseTimestampTo(Date purchaseTimestampTo) {
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

    public Date getPasswordChangeTimestamp() {
        return passwordChangeTimestamp;
    }

    public void setPasswordChangeTimestamp(Date passwordChangeTimestamp) {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
