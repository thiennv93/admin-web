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
@Table(name = "shipping_services")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShippingServices.findAll", query = "SELECT s FROM ShippingServices s")
    , @NamedQuery(name = "ShippingServices.findByServiceId", query = "SELECT s FROM ShippingServices s WHERE s.serviceId = :serviceId")
    , @NamedQuery(name = "ShippingServices.findByStatus", query = "SELECT s FROM ShippingServices s WHERE s.status = :status")
    , @NamedQuery(name = "ShippingServices.findByModule", query = "SELECT s FROM ShippingServices s WHERE s.module = :module")
    , @NamedQuery(name = "ShippingServices.findByCode", query = "SELECT s FROM ShippingServices s WHERE s.code = :code")
    , @NamedQuery(name = "ShippingServices.findBySpFile", query = "SELECT s FROM ShippingServices s WHERE s.spFile = :spFile")})
public class ShippingServices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "service_id")
    private Integer serviceId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "module")
    private String module;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "sp_file")
    private String spFile;

    public ShippingServices() {
    }

    public ShippingServices(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public ShippingServices(Integer serviceId, Character status, String module, String code, String spFile) {
        this.serviceId = serviceId;
        this.status = status;
        this.module = module;
        this.code = code;
        this.spFile = spFile;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSpFile() {
        return spFile;
    }

    public void setSpFile(String spFile) {
        this.spFile = spFile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceId != null ? serviceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShippingServices)) {
            return false;
        }
        ShippingServices other = (ShippingServices) object;
        if ((this.serviceId == null && other.serviceId != null) || (this.serviceId != null && !this.serviceId.equals(other.serviceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShippingServices[ serviceId=" + serviceId + " ]";
    }
    
}
