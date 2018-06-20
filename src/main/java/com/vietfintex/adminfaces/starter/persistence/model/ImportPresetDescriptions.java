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
@Table(name = "import_preset_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImportPresetDescriptions.findAll", query = "SELECT i FROM ImportPresetDescriptions i")
    , @NamedQuery(name = "ImportPresetDescriptions.findByPresetId", query = "SELECT i FROM ImportPresetDescriptions i WHERE i.importPresetDescriptionsPK.presetId = :presetId")
    , @NamedQuery(name = "ImportPresetDescriptions.findByLangCode", query = "SELECT i FROM ImportPresetDescriptions i WHERE i.importPresetDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "ImportPresetDescriptions.findByPreset", query = "SELECT i FROM ImportPresetDescriptions i WHERE i.preset = :preset")})
public class ImportPresetDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ImportPresetDescriptionsPK importPresetDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "preset")
    private String preset;

    public ImportPresetDescriptions() {
    }

    public ImportPresetDescriptions(ImportPresetDescriptionsPK importPresetDescriptionsPK) {
        this.importPresetDescriptionsPK = importPresetDescriptionsPK;
    }

    public ImportPresetDescriptions(ImportPresetDescriptionsPK importPresetDescriptionsPK, String preset) {
        this.importPresetDescriptionsPK = importPresetDescriptionsPK;
        this.preset = preset;
    }

    public ImportPresetDescriptions(int presetId, String langCode) {
        this.importPresetDescriptionsPK = new ImportPresetDescriptionsPK(presetId, langCode);
    }

    public ImportPresetDescriptionsPK getImportPresetDescriptionsPK() {
        return importPresetDescriptionsPK;
    }

    public void setImportPresetDescriptionsPK(ImportPresetDescriptionsPK importPresetDescriptionsPK) {
        this.importPresetDescriptionsPK = importPresetDescriptionsPK;
    }

    public String getPreset() {
        return preset;
    }

    public void setPreset(String preset) {
        this.preset = preset;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (importPresetDescriptionsPK != null ? importPresetDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImportPresetDescriptions)) {
            return false;
        }
        ImportPresetDescriptions other = (ImportPresetDescriptions) object;
        if ((this.importPresetDescriptionsPK == null && other.importPresetDescriptionsPK != null) || (this.importPresetDescriptionsPK != null && !this.importPresetDescriptionsPK.equals(other.importPresetDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ImportPresetDescriptions[ importPresetDescriptionsPK=" + importPresetDescriptionsPK + " ]";
    }
    
}
