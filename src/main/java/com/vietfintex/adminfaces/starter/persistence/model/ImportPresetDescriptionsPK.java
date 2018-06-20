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
public class ImportPresetDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "preset_id")
    private int presetId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public ImportPresetDescriptionsPK() {
    }

    public ImportPresetDescriptionsPK(int presetId, String langCode) {
        this.presetId = presetId;
        this.langCode = langCode;
    }

    public int getPresetId() {
        return presetId;
    }

    public void setPresetId(int presetId) {
        this.presetId = presetId;
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
        hash += (int) presetId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImportPresetDescriptionsPK)) {
            return false;
        }
        ImportPresetDescriptionsPK other = (ImportPresetDescriptionsPK) object;
        if (this.presetId != other.presetId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ImportPresetDescriptionsPK[ presetId=" + presetId + ", langCode=" + langCode + " ]";
    }
    
}
