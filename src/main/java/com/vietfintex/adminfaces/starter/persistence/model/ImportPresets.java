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
@Table(name = "import_presets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImportPresets.findAll", query = "SELECT i FROM ImportPresets i")
    , @NamedQuery(name = "ImportPresets.findByPresetId", query = "SELECT i FROM ImportPresets i WHERE i.presetId = :presetId")
    , @NamedQuery(name = "ImportPresets.findByCompanyId", query = "SELECT i FROM ImportPresets i WHERE i.companyId = :companyId")
    , @NamedQuery(name = "ImportPresets.findByObjectType", query = "SELECT i FROM ImportPresets i WHERE i.objectType = :objectType")
    , @NamedQuery(name = "ImportPresets.findByLastLaunch", query = "SELECT i FROM ImportPresets i WHERE i.lastLaunch = :lastLaunch")
    , @NamedQuery(name = "ImportPresets.findByLastStatus", query = "SELECT i FROM ImportPresets i WHERE i.lastStatus = :lastStatus")
    , @NamedQuery(name = "ImportPresets.findByFile", query = "SELECT i FROM ImportPresets i WHERE i.file = :file")
    , @NamedQuery(name = "ImportPresets.findByFileType", query = "SELECT i FROM ImportPresets i WHERE i.fileType = :fileType")})
public class ImportPresets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "preset_id")
    private Integer presetId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "object_type")
    private String objectType;
    @Basic(optional = false)
    @Column(name = "last_launch")
    private int lastLaunch;
    @Basic(optional = false)
    @Column(name = "last_status")
    private Character lastStatus;
    @Lob
    @Column(name = "last_result")
    private String lastResult;
    @Basic(optional = false)
    @Column(name = "file")
    private String file;
    @Basic(optional = false)
    @Column(name = "file_type")
    private String fileType;
    @Lob
    @Column(name = "options")
    private String options;

    public ImportPresets() {
    }

    public ImportPresets(Integer presetId) {
        this.presetId = presetId;
    }

    public ImportPresets(Integer presetId, int companyId, String objectType, int lastLaunch, Character lastStatus, String file, String fileType) {
        this.presetId = presetId;
        this.companyId = companyId;
        this.objectType = objectType;
        this.lastLaunch = lastLaunch;
        this.lastStatus = lastStatus;
        this.file = file;
        this.fileType = fileType;
    }

    public Integer getPresetId() {
        return presetId;
    }

    public void setPresetId(Integer presetId) {
        this.presetId = presetId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public int getLastLaunch() {
        return lastLaunch;
    }

    public void setLastLaunch(int lastLaunch) {
        this.lastLaunch = lastLaunch;
    }

    public Character getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(Character lastStatus) {
        this.lastStatus = lastStatus;
    }

    public String getLastResult() {
        return lastResult;
    }

    public void setLastResult(String lastResult) {
        this.lastResult = lastResult;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (presetId != null ? presetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImportPresets)) {
            return false;
        }
        ImportPresets other = (ImportPresets) object;
        if ((this.presetId == null && other.presetId != null) || (this.presetId != null && !this.presetId.equals(other.presetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ImportPresets[ presetId=" + presetId + " ]";
    }
    
}
