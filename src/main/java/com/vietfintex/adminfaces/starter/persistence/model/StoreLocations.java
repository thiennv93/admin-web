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
@Table(name = "store_locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StoreLocations.findAll", query = "SELECT s FROM StoreLocations s")
    , @NamedQuery(name = "StoreLocations.findByStoreLocationId", query = "SELECT s FROM StoreLocations s WHERE s.storeLocationId = :storeLocationId")
    , @NamedQuery(name = "StoreLocations.findByCompanyId", query = "SELECT s FROM StoreLocations s WHERE s.companyId = :companyId")
    , @NamedQuery(name = "StoreLocations.findByPosition", query = "SELECT s FROM StoreLocations s WHERE s.position = :position")
    , @NamedQuery(name = "StoreLocations.findByCountry", query = "SELECT s FROM StoreLocations s WHERE s.country = :country")
    , @NamedQuery(name = "StoreLocations.findByLatitude", query = "SELECT s FROM StoreLocations s WHERE s.latitude = :latitude")
    , @NamedQuery(name = "StoreLocations.findByLongitude", query = "SELECT s FROM StoreLocations s WHERE s.longitude = :longitude")
    , @NamedQuery(name = "StoreLocations.findByLocalization", query = "SELECT s FROM StoreLocations s WHERE s.localization = :localization")
    , @NamedQuery(name = "StoreLocations.findByStatus", query = "SELECT s FROM StoreLocations s WHERE s.status = :status")})
public class StoreLocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "store_location_id")
    private Integer storeLocationId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @Column(name = "latitude")
    private double latitude;
    @Basic(optional = false)
    @Column(name = "longitude")
    private double longitude;
    @Basic(optional = false)
    @Column(name = "localization")
    private String localization;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public StoreLocations() {
    }

    public StoreLocations(Integer storeLocationId) {
        this.storeLocationId = storeLocationId;
    }

    public StoreLocations(Integer storeLocationId, int companyId, short position, String country, double latitude, double longitude, String localization, Character status) {
        this.storeLocationId = storeLocationId;
        this.companyId = companyId;
        this.position = position;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.localization = localization;
        this.status = status;
    }

    public Integer getStoreLocationId() {
        return storeLocationId;
    }

    public void setStoreLocationId(Integer storeLocationId) {
        this.storeLocationId = storeLocationId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
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
        hash += (storeLocationId != null ? storeLocationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StoreLocations)) {
            return false;
        }
        StoreLocations other = (StoreLocations) object;
        if ((this.storeLocationId == null && other.storeLocationId != null) || (this.storeLocationId != null && !this.storeLocationId.equals(other.storeLocationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StoreLocations[ storeLocationId=" + storeLocationId + " ]";
    }
    
}
