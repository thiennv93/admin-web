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
@Table(name = "se_settings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeSettings.findAll", query = "SELECT s FROM SeSettings s")
    , @NamedQuery(name = "SeSettings.findByName", query = "SELECT s FROM SeSettings s WHERE s.seSettingsPK.name = :name")
    , @NamedQuery(name = "SeSettings.findByCompanyId", query = "SELECT s FROM SeSettings s WHERE s.seSettingsPK.companyId = :companyId")
    , @NamedQuery(name = "SeSettings.findByLangCode", query = "SELECT s FROM SeSettings s WHERE s.seSettingsPK.langCode = :langCode")
    , @NamedQuery(name = "SeSettings.findByValue", query = "SELECT s FROM SeSettings s WHERE s.value = :value")})
public class SeSettings implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SeSettingsPK seSettingsPK;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;

    public SeSettings() {
    }

    public SeSettings(SeSettingsPK seSettingsPK) {
        this.seSettingsPK = seSettingsPK;
    }

    public SeSettings(SeSettingsPK seSettingsPK, String value) {
        this.seSettingsPK = seSettingsPK;
        this.value = value;
    }

    public SeSettings(String name, int companyId, String langCode) {
        this.seSettingsPK = new SeSettingsPK(name, companyId, langCode);
    }

    public SeSettingsPK getSeSettingsPK() {
        return seSettingsPK;
    }

    public void setSeSettingsPK(SeSettingsPK seSettingsPK) {
        this.seSettingsPK = seSettingsPK;
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
        hash += (seSettingsPK != null ? seSettingsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeSettings)) {
            return false;
        }
        SeSettings other = (SeSettings) object;
        if ((this.seSettingsPK == null && other.seSettingsPK != null) || (this.seSettingsPK != null && !this.seSettingsPK.equals(other.seSettingsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SeSettings[ seSettingsPK=" + seSettingsPK + " ]";
    }
    
}
