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
@Table(name = "profile_field_values")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfileFieldValues.findAll", query = "SELECT p FROM ProfileFieldValues p")
    , @NamedQuery(name = "ProfileFieldValues.findByValueId", query = "SELECT p FROM ProfileFieldValues p WHERE p.valueId = :valueId")
    , @NamedQuery(name = "ProfileFieldValues.findByFieldId", query = "SELECT p FROM ProfileFieldValues p WHERE p.fieldId = :fieldId")
    , @NamedQuery(name = "ProfileFieldValues.findByPosition", query = "SELECT p FROM ProfileFieldValues p WHERE p.position = :position")})
public class ProfileFieldValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "value_id")
    private Integer valueId;
    @Basic(optional = false)
    @Column(name = "field_id")
    private int fieldId;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;

    public ProfileFieldValues() {
    }

    public ProfileFieldValues(Integer valueId) {
        this.valueId = valueId;
    }

    public ProfileFieldValues(Integer valueId, int fieldId, short position) {
        this.valueId = valueId;
        this.fieldId = fieldId;
        this.position = position;
    }

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (valueId != null ? valueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfileFieldValues)) {
            return false;
        }
        ProfileFieldValues other = (ProfileFieldValues) object;
        if ((this.valueId == null && other.valueId != null) || (this.valueId != null && !this.valueId.equals(other.valueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProfileFieldValues[ valueId=" + valueId + " ]";
    }
    
}
