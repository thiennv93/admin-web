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
@Table(name = "gift_certificates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GiftCertificates.findAll", query = "SELECT g FROM GiftCertificates g")
    , @NamedQuery(name = "GiftCertificates.findByGiftCertId", query = "SELECT g FROM GiftCertificates g WHERE g.giftCertId = :giftCertId")
    , @NamedQuery(name = "GiftCertificates.findByCompanyId", query = "SELECT g FROM GiftCertificates g WHERE g.companyId = :companyId")
    , @NamedQuery(name = "GiftCertificates.findByGiftCertCode", query = "SELECT g FROM GiftCertificates g WHERE g.giftCertCode = :giftCertCode")
    , @NamedQuery(name = "GiftCertificates.findBySender", query = "SELECT g FROM GiftCertificates g WHERE g.sender = :sender")
    , @NamedQuery(name = "GiftCertificates.findByRecipient", query = "SELECT g FROM GiftCertificates g WHERE g.recipient = :recipient")
    , @NamedQuery(name = "GiftCertificates.findBySendVia", query = "SELECT g FROM GiftCertificates g WHERE g.sendVia = :sendVia")
    , @NamedQuery(name = "GiftCertificates.findByAmount", query = "SELECT g FROM GiftCertificates g WHERE g.amount = :amount")
    , @NamedQuery(name = "GiftCertificates.findByEmail", query = "SELECT g FROM GiftCertificates g WHERE g.email = :email")
    , @NamedQuery(name = "GiftCertificates.findByAddress", query = "SELECT g FROM GiftCertificates g WHERE g.address = :address")
    , @NamedQuery(name = "GiftCertificates.findByAddress2", query = "SELECT g FROM GiftCertificates g WHERE g.address2 = :address2")
    , @NamedQuery(name = "GiftCertificates.findByCity", query = "SELECT g FROM GiftCertificates g WHERE g.city = :city")
    , @NamedQuery(name = "GiftCertificates.findByState", query = "SELECT g FROM GiftCertificates g WHERE g.state = :state")
    , @NamedQuery(name = "GiftCertificates.findByCountry", query = "SELECT g FROM GiftCertificates g WHERE g.country = :country")
    , @NamedQuery(name = "GiftCertificates.findByZipcode", query = "SELECT g FROM GiftCertificates g WHERE g.zipcode = :zipcode")
    , @NamedQuery(name = "GiftCertificates.findByStatus", query = "SELECT g FROM GiftCertificates g WHERE g.status = :status")
    , @NamedQuery(name = "GiftCertificates.findByTimestamp", query = "SELECT g FROM GiftCertificates g WHERE g.timestamp = :timestamp")
    , @NamedQuery(name = "GiftCertificates.findByPhone", query = "SELECT g FROM GiftCertificates g WHERE g.phone = :phone")
    , @NamedQuery(name = "GiftCertificates.findByOrderIds", query = "SELECT g FROM GiftCertificates g WHERE g.orderIds = :orderIds")
    , @NamedQuery(name = "GiftCertificates.findByTemplate", query = "SELECT g FROM GiftCertificates g WHERE g.template = :template")})
public class GiftCertificates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gift_cert_id")
    private Integer giftCertId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "gift_cert_code")
    private String giftCertCode;
    @Basic(optional = false)
    @Column(name = "sender")
    private String sender;
    @Basic(optional = false)
    @Column(name = "recipient")
    private String recipient;
    @Basic(optional = false)
    @Column(name = "send_via")
    private Character sendVia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "address_2")
    private String address2;
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
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "order_ids")
    private String orderIds;
    @Basic(optional = false)
    @Column(name = "template")
    private String template;
    @Lob
    @Column(name = "message")
    private String message;
    @Lob
    @Column(name = "products")
    private String products;

    public GiftCertificates() {
    }

    public GiftCertificates(Integer giftCertId) {
        this.giftCertId = giftCertId;
    }

    public GiftCertificates(Integer giftCertId, int companyId, String giftCertCode, String sender, String recipient, Character sendVia, BigDecimal amount, String email, String address, String address2, String city, String state, String country, String zipcode, Character status, int timestamp, String phone, String orderIds, String template) {
        this.giftCertId = giftCertId;
        this.companyId = companyId;
        this.giftCertCode = giftCertCode;
        this.sender = sender;
        this.recipient = recipient;
        this.sendVia = sendVia;
        this.amount = amount;
        this.email = email;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
        this.status = status;
        this.timestamp = timestamp;
        this.phone = phone;
        this.orderIds = orderIds;
        this.template = template;
    }

    public Integer getGiftCertId() {
        return giftCertId;
    }

    public void setGiftCertId(Integer giftCertId) {
        this.giftCertId = giftCertId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getGiftCertCode() {
        return giftCertCode;
    }

    public void setGiftCertCode(String giftCertCode) {
        this.giftCertCode = giftCertCode;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Character getSendVia() {
        return sendVia;
    }

    public void setSendVia(Character sendVia) {
        this.sendVia = sendVia;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
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

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(String orderIds) {
        this.orderIds = orderIds;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (giftCertId != null ? giftCertId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GiftCertificates)) {
            return false;
        }
        GiftCertificates other = (GiftCertificates) object;
        if ((this.giftCertId == null && other.giftCertId != null) || (this.giftCertId != null && !this.giftCertId.equals(other.giftCertId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GiftCertificates[ giftCertId=" + giftCertId + " ]";
    }
    
}
