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
@Table(name = "store_location_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StoreLocationDescriptions.findAll", query = "SELECT s FROM StoreLocationDescriptions s")
    , @NamedQuery(name = "StoreLocationDescriptions.findByStoreLocationId", query = "SELECT s FROM StoreLocationDescriptions s WHERE s.storeLocationDescriptionsPK.storeLocationId = :storeLocationId")
    , @NamedQuery(name = "StoreLocationDescriptions.findByLangCode", query = "SELECT s FROM StoreLocationDescriptions s WHERE s.storeLocationDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "StoreLocationDescriptions.findByName", query = "SELECT s FROM StoreLocationDescriptions s WHERE s.name = :name")
    , @NamedQuery(name = "StoreLocationDescriptions.findByCity", query = "SELECT s FROM StoreLocationDescriptions s WHERE s.city = :city")})
public class StoreLocationDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StoreLocationDescriptionsPK storeLocationDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;

    public StoreLocationDescriptions() {
    }

    public StoreLocationDescriptions(StoreLocationDescriptionsPK storeLocationDescriptionsPK) {
        this.storeLocationDescriptionsPK = storeLocationDescriptionsPK;
    }

    public StoreLocationDescriptions(StoreLocationDescriptionsPK storeLocationDescriptionsPK, String name, String city) {
        this.storeLocationDescriptionsPK = storeLocationDescriptionsPK;
        this.name = name;
        this.city = city;
    }

    public StoreLocationDescriptions(int storeLocationId, String langCode) {
        this.storeLocationDescriptionsPK = new StoreLocationDescriptionsPK(storeLocationId, langCode);
    }

    public StoreLocationDescriptionsPK getStoreLocationDescriptionsPK() {
        return storeLocationDescriptionsPK;
    }

    public void setStoreLocationDescriptionsPK(StoreLocationDescriptionsPK storeLocationDescriptionsPK) {
        this.storeLocationDescriptionsPK = storeLocationDescriptionsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (storeLocationDescriptionsPK != null ? storeLocationDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StoreLocationDescriptions)) {
            return false;
        }
        StoreLocationDescriptions other = (StoreLocationDescriptions) object;
        if ((this.storeLocationDescriptionsPK == null && other.storeLocationDescriptionsPK != null) || (this.storeLocationDescriptionsPK != null && !this.storeLocationDescriptionsPK.equals(other.storeLocationDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StoreLocationDescriptions[ storeLocationDescriptionsPK=" + storeLocationDescriptionsPK + " ]";
    }
    
}
