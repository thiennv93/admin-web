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
@Table(name = "countries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Countries.findAll", query = "SELECT c FROM Countries c")
    , @NamedQuery(name = "Countries.findByCode", query = "SELECT c FROM Countries c WHERE c.code = :code")
    , @NamedQuery(name = "Countries.findByCodeA3", query = "SELECT c FROM Countries c WHERE c.codeA3 = :codeA3")
    , @NamedQuery(name = "Countries.findByCodeN3", query = "SELECT c FROM Countries c WHERE c.codeN3 = :codeN3")
    , @NamedQuery(name = "Countries.findByRegion", query = "SELECT c FROM Countries c WHERE c.region = :region")
    , @NamedQuery(name = "Countries.findByLat", query = "SELECT c FROM Countries c WHERE c.lat = :lat")
    , @NamedQuery(name = "Countries.findByLon", query = "SELECT c FROM Countries c WHERE c.lon = :lon")
    , @NamedQuery(name = "Countries.findByStatus", query = "SELECT c FROM Countries c WHERE c.status = :status")})
public class Countries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "code_A3")
    private String codeA3;
    @Basic(optional = false)
    @Column(name = "code_N3")
    private String codeN3;
    @Basic(optional = false)
    @Column(name = "region")
    private String region;
    @Basic(optional = false)
    @Column(name = "lat")
    private float lat;
    @Basic(optional = false)
    @Column(name = "lon")
    private float lon;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public Countries() {
    }

    public Countries(String code) {
        this.code = code;
    }

    public Countries(String code, String codeA3, String codeN3, String region, float lat, float lon, Character status) {
        this.code = code;
        this.codeA3 = codeA3;
        this.codeN3 = codeN3;
        this.region = region;
        this.lat = lat;
        this.lon = lon;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeA3() {
        return codeA3;
    }

    public void setCodeA3(String codeA3) {
        this.codeA3 = codeA3;
    }

    public String getCodeN3() {
        return codeN3;
    }

    public void setCodeN3(String codeN3) {
        this.codeN3 = codeN3;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
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
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Countries)) {
            return false;
        }
        Countries other = (Countries) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Countries[ code=" + code + " ]";
    }
    
}
