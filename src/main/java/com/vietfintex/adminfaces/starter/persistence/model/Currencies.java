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
@Table(name = "currencies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Currencies.findAll", query = "SELECT c FROM Currencies c")
    , @NamedQuery(name = "Currencies.findByCurrencyId", query = "SELECT c FROM Currencies c WHERE c.currencyId = :currencyId")
    , @NamedQuery(name = "Currencies.findByCurrencyCode", query = "SELECT c FROM Currencies c WHERE c.currencyCode = :currencyCode")
    , @NamedQuery(name = "Currencies.findByAfter", query = "SELECT c FROM Currencies c WHERE c.after = :after")
    , @NamedQuery(name = "Currencies.findBySymbol", query = "SELECT c FROM Currencies c WHERE c.symbol = :symbol")
    , @NamedQuery(name = "Currencies.findByCoefficient", query = "SELECT c FROM Currencies c WHERE c.coefficient = :coefficient")
    , @NamedQuery(name = "Currencies.findByIsPrimary", query = "SELECT c FROM Currencies c WHERE c.isPrimary = :isPrimary")
    , @NamedQuery(name = "Currencies.findByPosition", query = "SELECT c FROM Currencies c WHERE c.position = :position")
    , @NamedQuery(name = "Currencies.findByDecimalsSeparator", query = "SELECT c FROM Currencies c WHERE c.decimalsSeparator = :decimalsSeparator")
    , @NamedQuery(name = "Currencies.findByThousandsSeparator", query = "SELECT c FROM Currencies c WHERE c.thousandsSeparator = :thousandsSeparator")
    , @NamedQuery(name = "Currencies.findByDecimals", query = "SELECT c FROM Currencies c WHERE c.decimals = :decimals")
    , @NamedQuery(name = "Currencies.findByStatus", query = "SELECT c FROM Currencies c WHERE c.status = :status")})
public class Currencies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "currency_id")
    private Integer currencyId;
    @Basic(optional = false)
    @Column(name = "currency_code")
    private String currencyCode;
    @Basic(optional = false)
    @Column(name = "after")
    private Character after;
    @Column(name = "symbol")
    private String symbol;
    @Basic(optional = false)
    @Column(name = "coefficient")
    private double coefficient;
    @Basic(optional = false)
    @Column(name = "is_primary")
    private Character isPrimary;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "decimals_separator")
    private String decimalsSeparator;
    @Basic(optional = false)
    @Column(name = "thousands_separator")
    private String thousandsSeparator;
    @Basic(optional = false)
    @Column(name = "decimals")
    private short decimals;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public Currencies() {
    }

    public Currencies(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Currencies(Integer currencyId, String currencyCode, Character after, double coefficient, Character isPrimary, short position, String decimalsSeparator, String thousandsSeparator, short decimals, Character status) {
        this.currencyId = currencyId;
        this.currencyCode = currencyCode;
        this.after = after;
        this.coefficient = coefficient;
        this.isPrimary = isPrimary;
        this.position = position;
        this.decimalsSeparator = decimalsSeparator;
        this.thousandsSeparator = thousandsSeparator;
        this.decimals = decimals;
        this.status = status;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Character getAfter() {
        return after;
    }

    public void setAfter(Character after) {
        this.after = after;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public Character getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Character isPrimary) {
        this.isPrimary = isPrimary;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getDecimalsSeparator() {
        return decimalsSeparator;
    }

    public void setDecimalsSeparator(String decimalsSeparator) {
        this.decimalsSeparator = decimalsSeparator;
    }

    public String getThousandsSeparator() {
        return thousandsSeparator;
    }

    public void setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
    }

    public short getDecimals() {
        return decimals;
    }

    public void setDecimals(short decimals) {
        this.decimals = decimals;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (currencyId != null ? currencyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Currencies)) {
            return false;
        }
        Currencies other = (Currencies) object;
        if ((this.currencyId == null && other.currencyId != null) || (this.currencyId != null && !this.currencyId.equals(other.currencyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Currencies[ currencyId=" + currencyId + " ]";
    }
    
}
