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
@Table(name = "settings_vendor_values")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SettingsVendorValues.findAll", query = "SELECT s FROM SettingsVendorValues s")
    , @NamedQuery(name = "SettingsVendorValues.findByObjectId", query = "SELECT s FROM SettingsVendorValues s WHERE s.settingsVendorValuesPK.objectId = :objectId")
    , @NamedQuery(name = "SettingsVendorValues.findByCompanyId", query = "SELECT s FROM SettingsVendorValues s WHERE s.settingsVendorValuesPK.companyId = :companyId")})
public class SettingsVendorValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SettingsVendorValuesPK settingsVendorValuesPK;
    @Basic(optional = false)
    @Lob
    @Column(name = "value")
    private String value;

    public SettingsVendorValues() {
    }

    public SettingsVendorValues(SettingsVendorValuesPK settingsVendorValuesPK) {
        this.settingsVendorValuesPK = settingsVendorValuesPK;
    }

    public SettingsVendorValues(SettingsVendorValuesPK settingsVendorValuesPK, String value) {
        this.settingsVendorValuesPK = settingsVendorValuesPK;
        this.value = value;
    }

    public SettingsVendorValues(int objectId, int companyId) {
        this.settingsVendorValuesPK = new SettingsVendorValuesPK(objectId, companyId);
    }

    public SettingsVendorValuesPK getSettingsVendorValuesPK() {
        return settingsVendorValuesPK;
    }

    public void setSettingsVendorValuesPK(SettingsVendorValuesPK settingsVendorValuesPK) {
        this.settingsVendorValuesPK = settingsVendorValuesPK;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (settingsVendorValuesPK != null ? settingsVendorValuesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SettingsVendorValues)) {
            return false;
        }
        SettingsVendorValues other = (SettingsVendorValues) object;
        if ((this.settingsVendorValuesPK == null && other.settingsVendorValuesPK != null) || (this.settingsVendorValuesPK != null && !this.settingsVendorValuesPK.equals(other.settingsVendorValuesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SettingsVendorValues[ settingsVendorValuesPK=" + settingsVendorValuesPK + " ]";
    }
    
}
