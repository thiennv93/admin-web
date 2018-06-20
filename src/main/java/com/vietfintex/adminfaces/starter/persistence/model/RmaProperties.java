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
@Table(name = "rma_properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RmaProperties.findAll", query = "SELECT r FROM RmaProperties r")
    , @NamedQuery(name = "RmaProperties.findByPropertyId", query = "SELECT r FROM RmaProperties r WHERE r.propertyId = :propertyId")
    , @NamedQuery(name = "RmaProperties.findByPosition", query = "SELECT r FROM RmaProperties r WHERE r.position = :position")
    , @NamedQuery(name = "RmaProperties.findByStatus", query = "SELECT r FROM RmaProperties r WHERE r.status = :status")
    , @NamedQuery(name = "RmaProperties.findByType", query = "SELECT r FROM RmaProperties r WHERE r.type = :type")
    , @NamedQuery(name = "RmaProperties.findByUpdateTotalsAndInventory", query = "SELECT r FROM RmaProperties r WHERE r.updateTotalsAndInventory = :updateTotalsAndInventory")})
public class RmaProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "property_id")
    private Integer propertyId;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "update_totals_and_inventory")
    private Character updateTotalsAndInventory;

    public RmaProperties() {
    }

    public RmaProperties(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public RmaProperties(Integer propertyId, short position, Character status, Character type, Character updateTotalsAndInventory) {
        this.propertyId = propertyId;
        this.position = position;
        this.status = status;
        this.type = type;
        this.updateTotalsAndInventory = updateTotalsAndInventory;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public Character getUpdateTotalsAndInventory() {
        return updateTotalsAndInventory;
    }

    public void setUpdateTotalsAndInventory(Character updateTotalsAndInventory) {
        this.updateTotalsAndInventory = updateTotalsAndInventory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyId != null ? propertyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RmaProperties)) {
            return false;
        }
        RmaProperties other = (RmaProperties) object;
        if ((this.propertyId == null && other.propertyId != null) || (this.propertyId != null && !this.propertyId.equals(other.propertyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RmaProperties[ propertyId=" + propertyId + " ]";
    }
    
}
