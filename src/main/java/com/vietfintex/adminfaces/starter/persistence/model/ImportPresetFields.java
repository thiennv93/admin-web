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
@Table(name = "import_preset_fields")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImportPresetFields.findAll", query = "SELECT i FROM ImportPresetFields i")
    , @NamedQuery(name = "ImportPresetFields.findByFieldId", query = "SELECT i FROM ImportPresetFields i WHERE i.fieldId = :fieldId")
    , @NamedQuery(name = "ImportPresetFields.findByPresetId", query = "SELECT i FROM ImportPresetFields i WHERE i.presetId = :presetId")
    , @NamedQuery(name = "ImportPresetFields.findByName", query = "SELECT i FROM ImportPresetFields i WHERE i.name = :name")
    , @NamedQuery(name = "ImportPresetFields.findByRelatedObjectType", query = "SELECT i FROM ImportPresetFields i WHERE i.relatedObjectType = :relatedObjectType")
    , @NamedQuery(name = "ImportPresetFields.findByRelatedObject", query = "SELECT i FROM ImportPresetFields i WHERE i.relatedObject = :relatedObject")})
public class ImportPresetFields implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "field_id")
    private Integer fieldId;
    @Basic(optional = false)
    @Column(name = "preset_id")
    private int presetId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "related_object_type")
    private String relatedObjectType;
    @Basic(optional = false)
    @Column(name = "related_object")
    private String relatedObject;
    @Lob
    @Column(name = "modifier")
    private String modifier;

    public ImportPresetFields() {
    }

    public ImportPresetFields(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public ImportPresetFields(Integer fieldId, int presetId, String name, String relatedObjectType, String relatedObject) {
        this.fieldId = fieldId;
        this.presetId = presetId;
        this.name = name;
        this.relatedObjectType = relatedObjectType;
        this.relatedObject = relatedObject;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public int getPresetId() {
        return presetId;
    }

    public void setPresetId(int presetId) {
        this.presetId = presetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelatedObjectType() {
        return relatedObjectType;
    }

    public void setRelatedObjectType(String relatedObjectType) {
        this.relatedObjectType = relatedObjectType;
    }

    public String getRelatedObject() {
        return relatedObject;
    }

    public void setRelatedObject(String relatedObject) {
        this.relatedObject = relatedObject;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldId != null ? fieldId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImportPresetFields)) {
            return false;
        }
        ImportPresetFields other = (ImportPresetFields) object;
        if ((this.fieldId == null && other.fieldId != null) || (this.fieldId != null && !this.fieldId.equals(other.fieldId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ImportPresetFields[ fieldId=" + fieldId + " ]";
    }
    
}
