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
@Table(name = "tax_rates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TaxRates.findAll", query = "SELECT t FROM TaxRates t")
    , @NamedQuery(name = "TaxRates.findByRateId", query = "SELECT t FROM TaxRates t WHERE t.rateId = :rateId")
    , @NamedQuery(name = "TaxRates.findByTaxId", query = "SELECT t FROM TaxRates t WHERE t.taxId = :taxId")
    , @NamedQuery(name = "TaxRates.findByDestinationId", query = "SELECT t FROM TaxRates t WHERE t.destinationId = :destinationId")
    , @NamedQuery(name = "TaxRates.findByRateValue", query = "SELECT t FROM TaxRates t WHERE t.rateValue = :rateValue")
    , @NamedQuery(name = "TaxRates.findByRateType", query = "SELECT t FROM TaxRates t WHERE t.rateType = :rateType")})
public class TaxRates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rate_id")
    private Integer rateId;
    @Basic(optional = false)
    @Column(name = "tax_id")
    private int taxId;
    @Basic(optional = false)
    @Column(name = "destination_id")
    private int destinationId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "rate_value")
    private BigDecimal rateValue;
    @Basic(optional = false)
    @Column(name = "rate_type")
    private Character rateType;

    public TaxRates() {
    }

    public TaxRates(Integer rateId) {
        this.rateId = rateId;
    }

    public TaxRates(Integer rateId, int taxId, int destinationId, BigDecimal rateValue, Character rateType) {
        this.rateId = rateId;
        this.taxId = taxId;
        this.destinationId = destinationId;
        this.rateValue = rateValue;
        this.rateType = rateType;
    }

    public Integer getRateId() {
        return rateId;
    }

    public void setRateId(Integer rateId) {
        this.rateId = rateId;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public BigDecimal getRateValue() {
        return rateValue;
    }

    public void setRateValue(BigDecimal rateValue) {
        this.rateValue = rateValue;
    }

    public Character getRateType() {
        return rateType;
    }

    public void setRateType(Character rateType) {
        this.rateType = rateType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rateId != null ? rateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxRates)) {
            return false;
        }
        TaxRates other = (TaxRates) object;
        if ((this.rateId == null && other.rateId != null) || (this.rateId != null && !this.rateId.equals(other.rateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TaxRates[ rateId=" + rateId + " ]";
    }
    
}
