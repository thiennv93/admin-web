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
@Table(name = "payment_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentDescriptions.findAll", query = "SELECT p FROM PaymentDescriptions p")
    , @NamedQuery(name = "PaymentDescriptions.findByPaymentId", query = "SELECT p FROM PaymentDescriptions p WHERE p.paymentDescriptionsPK.paymentId = :paymentId")
    , @NamedQuery(name = "PaymentDescriptions.findByPayment", query = "SELECT p FROM PaymentDescriptions p WHERE p.payment = :payment")
    , @NamedQuery(name = "PaymentDescriptions.findByDescription", query = "SELECT p FROM PaymentDescriptions p WHERE p.description = :description")
    , @NamedQuery(name = "PaymentDescriptions.findBySurchargeTitle", query = "SELECT p FROM PaymentDescriptions p WHERE p.surchargeTitle = :surchargeTitle")
    , @NamedQuery(name = "PaymentDescriptions.findByLangCode", query = "SELECT p FROM PaymentDescriptions p WHERE p.paymentDescriptionsPK.langCode = :langCode")})
public class PaymentDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentDescriptionsPK paymentDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "payment")
    private String payment;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Lob
    @Column(name = "instructions")
    private String instructions;
    @Basic(optional = false)
    @Column(name = "surcharge_title")
    private String surchargeTitle;

    public PaymentDescriptions() {
    }

    public PaymentDescriptions(PaymentDescriptionsPK paymentDescriptionsPK) {
        this.paymentDescriptionsPK = paymentDescriptionsPK;
    }

    public PaymentDescriptions(PaymentDescriptionsPK paymentDescriptionsPK, String payment, String description, String surchargeTitle) {
        this.paymentDescriptionsPK = paymentDescriptionsPK;
        this.payment = payment;
        this.description = description;
        this.surchargeTitle = surchargeTitle;
    }

    public PaymentDescriptions(int paymentId, String langCode) {
        this.paymentDescriptionsPK = new PaymentDescriptionsPK(paymentId, langCode);
    }

    public PaymentDescriptionsPK getPaymentDescriptionsPK() {
        return paymentDescriptionsPK;
    }

    public void setPaymentDescriptionsPK(PaymentDescriptionsPK paymentDescriptionsPK) {
        this.paymentDescriptionsPK = paymentDescriptionsPK;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getSurchargeTitle() {
        return surchargeTitle;
    }

    public void setSurchargeTitle(String surchargeTitle) {
        this.surchargeTitle = surchargeTitle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentDescriptionsPK != null ? paymentDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentDescriptions)) {
            return false;
        }
        PaymentDescriptions other = (PaymentDescriptions) object;
        if ((this.paymentDescriptionsPK == null && other.paymentDescriptionsPK != null) || (this.paymentDescriptionsPK != null && !this.paymentDescriptionsPK.equals(other.paymentDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaymentDescriptions[ paymentDescriptionsPK=" + paymentDescriptionsPK + " ]";
    }
    
}
