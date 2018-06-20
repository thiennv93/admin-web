/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Embeddable
public class PaymentDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "payment_id")
    private int paymentId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public PaymentDescriptionsPK() {
    }

    public PaymentDescriptionsPK(int paymentId, String langCode) {
        this.paymentId = paymentId;
        this.langCode = langCode;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) paymentId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentDescriptionsPK)) {
            return false;
        }
        PaymentDescriptionsPK other = (PaymentDescriptionsPK) object;
        if (this.paymentId != other.paymentId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaymentDescriptionsPK[ paymentId=" + paymentId + ", langCode=" + langCode + " ]";
    }
    
}
