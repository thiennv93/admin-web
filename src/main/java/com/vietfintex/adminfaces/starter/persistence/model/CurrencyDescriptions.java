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
@Table(name = "currency_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CurrencyDescriptions.findAll", query = "SELECT c FROM CurrencyDescriptions c")
    , @NamedQuery(name = "CurrencyDescriptions.findByCurrencyCode", query = "SELECT c FROM CurrencyDescriptions c WHERE c.currencyDescriptionsPK.currencyCode = :currencyCode")
    , @NamedQuery(name = "CurrencyDescriptions.findByDescription", query = "SELECT c FROM CurrencyDescriptions c WHERE c.description = :description")
    , @NamedQuery(name = "CurrencyDescriptions.findByLangCode", query = "SELECT c FROM CurrencyDescriptions c WHERE c.currencyDescriptionsPK.langCode = :langCode")})
public class CurrencyDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CurrencyDescriptionsPK currencyDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public CurrencyDescriptions() {
    }

    public CurrencyDescriptions(CurrencyDescriptionsPK currencyDescriptionsPK) {
        this.currencyDescriptionsPK = currencyDescriptionsPK;
    }

    public CurrencyDescriptions(CurrencyDescriptionsPK currencyDescriptionsPK, String description) {
        this.currencyDescriptionsPK = currencyDescriptionsPK;
        this.description = description;
    }

    public CurrencyDescriptions(String currencyCode, String langCode) {
        this.currencyDescriptionsPK = new CurrencyDescriptionsPK(currencyCode, langCode);
    }

    public CurrencyDescriptionsPK getCurrencyDescriptionsPK() {
        return currencyDescriptionsPK;
    }

    public void setCurrencyDescriptionsPK(CurrencyDescriptionsPK currencyDescriptionsPK) {
        this.currencyDescriptionsPK = currencyDescriptionsPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (currencyDescriptionsPK != null ? currencyDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurrencyDescriptions)) {
            return false;
        }
        CurrencyDescriptions other = (CurrencyDescriptions) object;
        if ((this.currencyDescriptionsPK == null && other.currencyDescriptionsPK != null) || (this.currencyDescriptionsPK != null && !this.currencyDescriptionsPK.equals(other.currencyDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CurrencyDescriptions[ currencyDescriptionsPK=" + currencyDescriptionsPK + " ]";
    }
    
}
