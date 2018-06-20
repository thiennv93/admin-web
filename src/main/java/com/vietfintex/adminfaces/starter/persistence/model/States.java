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
@Table(name = "states")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "States.findAll", query = "SELECT s FROM States s")
    , @NamedQuery(name = "States.findByStateId", query = "SELECT s FROM States s WHERE s.stateId = :stateId")
    , @NamedQuery(name = "States.findByCountryCode", query = "SELECT s FROM States s WHERE s.countryCode = :countryCode")
    , @NamedQuery(name = "States.findByCode", query = "SELECT s FROM States s WHERE s.code = :code")
    , @NamedQuery(name = "States.findByStatus", query = "SELECT s FROM States s WHERE s.status = :status")})
public class States implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "state_id")
    private Integer stateId;
    @Basic(optional = false)
    @Column(name = "country_code")
    private String countryCode;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public States() {
    }

    public States(Integer stateId) {
        this.stateId = stateId;
    }

    public States(Integer stateId, String countryCode, String code, Character status) {
        this.stateId = stateId;
        this.countryCode = countryCode;
        this.code = code;
        this.status = status;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        hash += (stateId != null ? stateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof States)) {
            return false;
        }
        States other = (States) object;
        if ((this.stateId == null && other.stateId != null) || (this.stateId != null && !this.stateId.equals(other.stateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "States[ stateId=" + stateId + " ]";
    }
    
}
