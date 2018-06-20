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
@Table(name = "localizations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Localizations.findAll", query = "SELECT l FROM Localizations l")
    , @NamedQuery(name = "Localizations.findByLocalizationId", query = "SELECT l FROM Localizations l WHERE l.localizationId = :localizationId")
    , @NamedQuery(name = "Localizations.findByCustomWeightSettings", query = "SELECT l FROM Localizations l WHERE l.customWeightSettings = :customWeightSettings")
    , @NamedQuery(name = "Localizations.findByWeightSymbol", query = "SELECT l FROM Localizations l WHERE l.weightSymbol = :weightSymbol")
    , @NamedQuery(name = "Localizations.findByWeightUnit", query = "SELECT l FROM Localizations l WHERE l.weightUnit = :weightUnit")
    , @NamedQuery(name = "Localizations.findByIsDefault", query = "SELECT l FROM Localizations l WHERE l.isDefault = :isDefault")
    , @NamedQuery(name = "Localizations.findByStatus", query = "SELECT l FROM Localizations l WHERE l.status = :status")})
public class Localizations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "localization_id")
    private Integer localizationId;
    @Basic(optional = false)
    @Column(name = "custom_weight_settings")
    private Character customWeightSettings;
    @Basic(optional = false)
    @Column(name = "weight_symbol")
    private String weightSymbol;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "weight_unit")
    private BigDecimal weightUnit;
    @Basic(optional = false)
    @Column(name = "is_default")
    private Character isDefault;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public Localizations() {
    }

    public Localizations(Integer localizationId) {
        this.localizationId = localizationId;
    }

    public Localizations(Integer localizationId, Character customWeightSettings, String weightSymbol, BigDecimal weightUnit, Character isDefault, Character status) {
        this.localizationId = localizationId;
        this.customWeightSettings = customWeightSettings;
        this.weightSymbol = weightSymbol;
        this.weightUnit = weightUnit;
        this.isDefault = isDefault;
        this.status = status;
    }

    public Integer getLocalizationId() {
        return localizationId;
    }

    public void setLocalizationId(Integer localizationId) {
        this.localizationId = localizationId;
    }

    public Character getCustomWeightSettings() {
        return customWeightSettings;
    }

    public void setCustomWeightSettings(Character customWeightSettings) {
        this.customWeightSettings = customWeightSettings;
    }

    public String getWeightSymbol() {
        return weightSymbol;
    }

    public void setWeightSymbol(String weightSymbol) {
        this.weightSymbol = weightSymbol;
    }

    public BigDecimal getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(BigDecimal weightUnit) {
        this.weightUnit = weightUnit;
    }

    public Character getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Character isDefault) {
        this.isDefault = isDefault;
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
        hash += (localizationId != null ? localizationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Localizations)) {
            return false;
        }
        Localizations other = (Localizations) object;
        if ((this.localizationId == null && other.localizationId != null) || (this.localizationId != null && !this.localizationId.equals(other.localizationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Localizations[ localizationId=" + localizationId + " ]";
    }
    
}
