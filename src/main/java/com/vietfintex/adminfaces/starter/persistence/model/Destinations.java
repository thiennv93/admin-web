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
@Table(name = "destinations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Destinations.findAll", query = "SELECT d FROM Destinations d")
    , @NamedQuery(name = "Destinations.findByDestinationId", query = "SELECT d FROM Destinations d WHERE d.destinationId = :destinationId")
    , @NamedQuery(name = "Destinations.findByLocalization", query = "SELECT d FROM Destinations d WHERE d.localization = :localization")
    , @NamedQuery(name = "Destinations.findByStatus", query = "SELECT d FROM Destinations d WHERE d.status = :status")})
public class Destinations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "destination_id")
    private Integer destinationId;
    @Basic(optional = false)
    @Column(name = "localization")
    private String localization;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public Destinations() {
    }

    public Destinations(Integer destinationId) {
        this.destinationId = destinationId;
    }

    public Destinations(Integer destinationId, String localization, Character status) {
        this.destinationId = destinationId;
        this.localization = localization;
        this.status = status;
    }

    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (destinationId != null ? destinationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destinations)) {
            return false;
        }
        Destinations other = (Destinations) object;
        if ((this.destinationId == null && other.destinationId != null) || (this.destinationId != null && !this.destinationId.equals(other.destinationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Destinations[ destinationId=" + destinationId + " ]";
    }
    
}
