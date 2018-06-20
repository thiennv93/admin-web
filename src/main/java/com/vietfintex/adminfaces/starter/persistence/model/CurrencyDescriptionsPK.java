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
public class CurrencyDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "currency_code")
    private String currencyCode;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public CurrencyDescriptionsPK() {
    }

    public CurrencyDescriptionsPK(String currencyCode, String langCode) {
        this.currencyCode = currencyCode;
        this.langCode = langCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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
        hash += (currencyCode != null ? currencyCode.hashCode() : 0);
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurrencyDescriptionsPK)) {
            return false;
        }
        CurrencyDescriptionsPK other = (CurrencyDescriptionsPK) object;
        if ((this.currencyCode == null && other.currencyCode != null) || (this.currencyCode != null && !this.currencyCode.equals(other.currencyCode))) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CurrencyDescriptionsPK[ currencyCode=" + currencyCode + ", langCode=" + langCode + " ]";
    }
    
}
