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
@Table(name = "payments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payments.findAll", query = "SELECT p FROM Payments p")
    , @NamedQuery(name = "Payments.findByPaymentId", query = "SELECT p FROM Payments p WHERE p.paymentId = :paymentId")
    , @NamedQuery(name = "Payments.findByCompanyId", query = "SELECT p FROM Payments p WHERE p.companyId = :companyId")
    , @NamedQuery(name = "Payments.findByUsergroupIds", query = "SELECT p FROM Payments p WHERE p.usergroupIds = :usergroupIds")
    , @NamedQuery(name = "Payments.findByPosition", query = "SELECT p FROM Payments p WHERE p.position = :position")
    , @NamedQuery(name = "Payments.findByStatus", query = "SELECT p FROM Payments p WHERE p.status = :status")
    , @NamedQuery(name = "Payments.findByTemplate", query = "SELECT p FROM Payments p WHERE p.template = :template")
    , @NamedQuery(name = "Payments.findByProcessorId", query = "SELECT p FROM Payments p WHERE p.processorId = :processorId")
    , @NamedQuery(name = "Payments.findByASurcharge", query = "SELECT p FROM Payments p WHERE p.aSurcharge = :aSurcharge")
    , @NamedQuery(name = "Payments.findByPSurcharge", query = "SELECT p FROM Payments p WHERE p.pSurcharge = :pSurcharge")
    , @NamedQuery(name = "Payments.findByTaxIds", query = "SELECT p FROM Payments p WHERE p.taxIds = :taxIds")
    , @NamedQuery(name = "Payments.findByLocalization", query = "SELECT p FROM Payments p WHERE p.localization = :localization")
    , @NamedQuery(name = "Payments.findByPaymentCategory", query = "SELECT p FROM Payments p WHERE p.paymentCategory = :paymentCategory")})
public class Payments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "payment_id")
    private Integer paymentId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "usergroup_ids")
    private String usergroupIds;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "template")
    private String template;
    @Basic(optional = false)
    @Column(name = "processor_id")
    private int processorId;
    @Lob
    @Column(name = "processor_params")
    private String processorParams;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "a_surcharge")
    private BigDecimal aSurcharge;
    @Basic(optional = false)
    @Column(name = "p_surcharge")
    private BigDecimal pSurcharge;
    @Basic(optional = false)
    @Column(name = "tax_ids")
    private String taxIds;
    @Basic(optional = false)
    @Column(name = "localization")
    private String localization;
    @Basic(optional = false)
    @Column(name = "payment_category")
    private String paymentCategory;

    public Payments() {
    }

    public Payments(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Payments(Integer paymentId, int companyId, String usergroupIds, short position, Character status, String template, int processorId, BigDecimal aSurcharge, BigDecimal pSurcharge, String taxIds, String localization, String paymentCategory) {
        this.paymentId = paymentId;
        this.companyId = companyId;
        this.usergroupIds = usergroupIds;
        this.position = position;
        this.status = status;
        this.template = template;
        this.processorId = processorId;
        this.aSurcharge = aSurcharge;
        this.pSurcharge = pSurcharge;
        this.taxIds = taxIds;
        this.localization = localization;
        this.paymentCategory = paymentCategory;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getUsergroupIds() {
        return usergroupIds;
    }

    public void setUsergroupIds(String usergroupIds) {
        this.usergroupIds = usergroupIds;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public int getProcessorId() {
        return processorId;
    }

    public void setProcessorId(int processorId) {
        this.processorId = processorId;
    }

    public String getProcessorParams() {
        return processorParams;
    }

    public void setProcessorParams(String processorParams) {
        this.processorParams = processorParams;
    }

    public BigDecimal getASurcharge() {
        return aSurcharge;
    }

    public void setASurcharge(BigDecimal aSurcharge) {
        this.aSurcharge = aSurcharge;
    }

    public BigDecimal getPSurcharge() {
        return pSurcharge;
    }

    public void setPSurcharge(BigDecimal pSurcharge) {
        this.pSurcharge = pSurcharge;
    }

    public String getTaxIds() {
        return taxIds;
    }

    public void setTaxIds(String taxIds) {
        this.taxIds = taxIds;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getPaymentCategory() {
        return paymentCategory;
    }

    public void setPaymentCategory(String paymentCategory) {
        this.paymentCategory = paymentCategory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payments)) {
            return false;
        }
        Payments other = (Payments) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Payments[ paymentId=" + paymentId + " ]";
    }
    
}
