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
@Table(name = "tax_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TaxDescriptions.findAll", query = "SELECT t FROM TaxDescriptions t")
    , @NamedQuery(name = "TaxDescriptions.findByTaxId", query = "SELECT t FROM TaxDescriptions t WHERE t.taxDescriptionsPK.taxId = :taxId")
    , @NamedQuery(name = "TaxDescriptions.findByLangCode", query = "SELECT t FROM TaxDescriptions t WHERE t.taxDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "TaxDescriptions.findByTax", query = "SELECT t FROM TaxDescriptions t WHERE t.tax = :tax")})
public class TaxDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TaxDescriptionsPK taxDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "tax")
    private String tax;

    public TaxDescriptions() {
    }

    public TaxDescriptions(TaxDescriptionsPK taxDescriptionsPK) {
        this.taxDescriptionsPK = taxDescriptionsPK;
    }

    public TaxDescriptions(TaxDescriptionsPK taxDescriptionsPK, String tax) {
        this.taxDescriptionsPK = taxDescriptionsPK;
        this.tax = tax;
    }

    public TaxDescriptions(int taxId, String langCode) {
        this.taxDescriptionsPK = new TaxDescriptionsPK(taxId, langCode);
    }

    public TaxDescriptionsPK getTaxDescriptionsPK() {
        return taxDescriptionsPK;
    }

    public void setTaxDescriptionsPK(TaxDescriptionsPK taxDescriptionsPK) {
        this.taxDescriptionsPK = taxDescriptionsPK;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxDescriptionsPK != null ? taxDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxDescriptions)) {
            return false;
        }
        TaxDescriptions other = (TaxDescriptions) object;
        if ((this.taxDescriptionsPK == null && other.taxDescriptionsPK != null) || (this.taxDescriptionsPK != null && !this.taxDescriptionsPK.equals(other.taxDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TaxDescriptions[ taxDescriptionsPK=" + taxDescriptionsPK + " ]";
    }
    
}
