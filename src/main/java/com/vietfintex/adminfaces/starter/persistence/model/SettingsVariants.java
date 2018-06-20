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
@Table(name = "settings_variants")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SettingsVariants.findAll", query = "SELECT s FROM SettingsVariants s")
    , @NamedQuery(name = "SettingsVariants.findByVariantId", query = "SELECT s FROM SettingsVariants s WHERE s.variantId = :variantId")
    , @NamedQuery(name = "SettingsVariants.findByObjectId", query = "SELECT s FROM SettingsVariants s WHERE s.objectId = :objectId")
    , @NamedQuery(name = "SettingsVariants.findByName", query = "SELECT s FROM SettingsVariants s WHERE s.name = :name")
    , @NamedQuery(name = "SettingsVariants.findByPosition", query = "SELECT s FROM SettingsVariants s WHERE s.position = :position")})
public class SettingsVariants implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "variant_id")
    private Integer variantId;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;

    public SettingsVariants() {
    }

    public SettingsVariants(Integer variantId) {
        this.variantId = variantId;
    }

    public SettingsVariants(Integer variantId, int objectId, String name, short position) {
        this.variantId = variantId;
        this.objectId = objectId;
        this.name = name;
        this.position = position;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (variantId != null ? variantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SettingsVariants)) {
            return false;
        }
        SettingsVariants other = (SettingsVariants) object;
        if ((this.variantId == null && other.variantId != null) || (this.variantId != null && !this.variantId.equals(other.variantId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SettingsVariants[ variantId=" + variantId + " ]";
    }
    
}
