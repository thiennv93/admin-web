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
@Table(name = "bm_containers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BmContainers.findAll", query = "SELECT b FROM BmContainers b")
    , @NamedQuery(name = "BmContainers.findByContainerId", query = "SELECT b FROM BmContainers b WHERE b.containerId = :containerId")
    , @NamedQuery(name = "BmContainers.findByLocationId", query = "SELECT b FROM BmContainers b WHERE b.locationId = :locationId")
    , @NamedQuery(name = "BmContainers.findByPosition", query = "SELECT b FROM BmContainers b WHERE b.position = :position")
    , @NamedQuery(name = "BmContainers.findByWidth", query = "SELECT b FROM BmContainers b WHERE b.width = :width")
    , @NamedQuery(name = "BmContainers.findByUserClass", query = "SELECT b FROM BmContainers b WHERE b.userClass = :userClass")
    , @NamedQuery(name = "BmContainers.findByLinkedToDefault", query = "SELECT b FROM BmContainers b WHERE b.linkedToDefault = :linkedToDefault")
    , @NamedQuery(name = "BmContainers.findByStatus", query = "SELECT b FROM BmContainers b WHERE b.status = :status")
    , @NamedQuery(name = "BmContainers.findByCompanyId", query = "SELECT b FROM BmContainers b WHERE b.companyId = :companyId")})
public class BmContainers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "container_id")
    private Integer containerId;
    @Basic(optional = false)
    @Column(name = "location_id")
    private int locationId;
    @Basic(optional = false)
    @Column(name = "position")
    private String position;
    @Basic(optional = false)
    @Column(name = "width")
    private short width;
    @Basic(optional = false)
    @Column(name = "user_class")
    private String userClass;
    @Basic(optional = false)
    @Column(name = "linked_to_default")
    private String linkedToDefault;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;

    public BmContainers() {
    }

    public BmContainers(Integer containerId) {
        this.containerId = containerId;
    }

    public BmContainers(Integer containerId, int locationId, String position, short width, String userClass, String linkedToDefault, String status, int companyId) {
        this.containerId = containerId;
        this.locationId = locationId;
        this.position = position;
        this.width = width;
        this.userClass = userClass;
        this.linkedToDefault = linkedToDefault;
        this.status = status;
        this.companyId = companyId;
    }

    public Integer getContainerId() {
        return containerId;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public String getLinkedToDefault() {
        return linkedToDefault;
    }

    public void setLinkedToDefault(String linkedToDefault) {
        this.linkedToDefault = linkedToDefault;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (containerId != null ? containerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmContainers)) {
            return false;
        }
        BmContainers other = (BmContainers) object;
        if ((this.containerId == null && other.containerId != null) || (this.containerId != null && !this.containerId.equals(other.containerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BmContainers[ containerId=" + containerId + " ]";
    }
    
}
