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
@Table(name = "taxes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Taxes.findAll", query = "SELECT t FROM Taxes t")
    , @NamedQuery(name = "Taxes.findByTaxId", query = "SELECT t FROM Taxes t WHERE t.taxId = :taxId")
    , @NamedQuery(name = "Taxes.findByAddressType", query = "SELECT t FROM Taxes t WHERE t.addressType = :addressType")
    , @NamedQuery(name = "Taxes.findByStatus", query = "SELECT t FROM Taxes t WHERE t.status = :status")
    , @NamedQuery(name = "Taxes.findByPriceIncludesTax", query = "SELECT t FROM Taxes t WHERE t.priceIncludesTax = :priceIncludesTax")
    , @NamedQuery(name = "Taxes.findByDisplayIncludingTax", query = "SELECT t FROM Taxes t WHERE t.displayIncludingTax = :displayIncludingTax")
    , @NamedQuery(name = "Taxes.findByDisplayInfo", query = "SELECT t FROM Taxes t WHERE t.displayInfo = :displayInfo")
    , @NamedQuery(name = "Taxes.findByRegnumber", query = "SELECT t FROM Taxes t WHERE t.regnumber = :regnumber")
    , @NamedQuery(name = "Taxes.findByPriority", query = "SELECT t FROM Taxes t WHERE t.priority = :priority")})
public class Taxes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tax_id")
    private Integer taxId;
    @Basic(optional = false)
    @Column(name = "address_type")
    private Character addressType;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "price_includes_tax")
    private Character priceIncludesTax;
    @Basic(optional = false)
    @Column(name = "display_including_tax")
    private Character displayIncludingTax;
    @Basic(optional = false)
    @Column(name = "display_info")
    private Character displayInfo;
    @Basic(optional = false)
    @Column(name = "regnumber")
    private String regnumber;
    @Basic(optional = false)
    @Column(name = "priority")
    private int priority;

    public Taxes() {
    }

    public Taxes(Integer taxId) {
        this.taxId = taxId;
    }

    public Taxes(Integer taxId, Character addressType, Character status, Character priceIncludesTax, Character displayIncludingTax, Character displayInfo, String regnumber, int priority) {
        this.taxId = taxId;
        this.addressType = addressType;
        this.status = status;
        this.priceIncludesTax = priceIncludesTax;
        this.displayIncludingTax = displayIncludingTax;
        this.displayInfo = displayInfo;
        this.regnumber = regnumber;
        this.priority = priority;
    }

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public Character getAddressType() {
        return addressType;
    }

    public void setAddressType(Character addressType) {
        this.addressType = addressType;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getPriceIncludesTax() {
        return priceIncludesTax;
    }

    public void setPriceIncludesTax(Character priceIncludesTax) {
        this.priceIncludesTax = priceIncludesTax;
    }

    public Character getDisplayIncludingTax() {
        return displayIncludingTax;
    }

    public void setDisplayIncludingTax(Character displayIncludingTax) {
        this.displayIncludingTax = displayIncludingTax;
    }

    public Character getDisplayInfo() {
        return displayInfo;
    }

    public void setDisplayInfo(Character displayInfo) {
        this.displayInfo = displayInfo;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxId != null ? taxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taxes)) {
            return false;
        }
        Taxes other = (Taxes) object;
        if ((this.taxId == null && other.taxId != null) || (this.taxId != null && !this.taxId.equals(other.taxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Taxes[ taxId=" + taxId + " ]";
    }
    
}
