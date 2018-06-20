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
@Table(name = "settings_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SettingsDescriptions.findAll", query = "SELECT s FROM SettingsDescriptions s")
    , @NamedQuery(name = "SettingsDescriptions.findByObjectId", query = "SELECT s FROM SettingsDescriptions s WHERE s.settingsDescriptionsPK.objectId = :objectId")
    , @NamedQuery(name = "SettingsDescriptions.findByObjectType", query = "SELECT s FROM SettingsDescriptions s WHERE s.settingsDescriptionsPK.objectType = :objectType")
    , @NamedQuery(name = "SettingsDescriptions.findByLangCode", query = "SELECT s FROM SettingsDescriptions s WHERE s.settingsDescriptionsPK.langCode = :langCode")})
public class SettingsDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SettingsDescriptionsPK settingsDescriptionsPK;
    @Lob
    @Column(name = "value")
    private String value;
    @Lob
    @Column(name = "tooltip")
    private String tooltip;

    public SettingsDescriptions() {
    }

    public SettingsDescriptions(SettingsDescriptionsPK settingsDescriptionsPK) {
        this.settingsDescriptionsPK = settingsDescriptionsPK;
    }

    public SettingsDescriptions(int objectId, String objectType, String langCode) {
        this.settingsDescriptionsPK = new SettingsDescriptionsPK(objectId, objectType, langCode);
    }

    public SettingsDescriptionsPK getSettingsDescriptionsPK() {
        return settingsDescriptionsPK;
    }

    public void setSettingsDescriptionsPK(SettingsDescriptionsPK settingsDescriptionsPK) {
        this.settingsDescriptionsPK = settingsDescriptionsPK;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (settingsDescriptionsPK != null ? settingsDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SettingsDescriptions)) {
            return false;
        }
        SettingsDescriptions other = (SettingsDescriptions) object;
        if ((this.settingsDescriptionsPK == null && other.settingsDescriptionsPK != null) || (this.settingsDescriptionsPK != null && !this.settingsDescriptionsPK.equals(other.settingsDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SettingsDescriptions[ settingsDescriptionsPK=" + settingsDescriptionsPK + " ]";
    }
    
}
