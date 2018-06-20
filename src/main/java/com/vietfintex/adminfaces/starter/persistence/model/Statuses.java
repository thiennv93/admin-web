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
@Table(name = "statuses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statuses.findAll", query = "SELECT s FROM Statuses s")
    , @NamedQuery(name = "Statuses.findByStatusId", query = "SELECT s FROM Statuses s WHERE s.statusId = :statusId")
    , @NamedQuery(name = "Statuses.findByStatus", query = "SELECT s FROM Statuses s WHERE s.status = :status")
    , @NamedQuery(name = "Statuses.findByType", query = "SELECT s FROM Statuses s WHERE s.type = :type")
    , @NamedQuery(name = "Statuses.findByIsDefault", query = "SELECT s FROM Statuses s WHERE s.isDefault = :isDefault")
    , @NamedQuery(name = "Statuses.findByPosition", query = "SELECT s FROM Statuses s WHERE s.position = :position")})
public class Statuses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "status_id")
    private Integer statusId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "is_default")
    private Character isDefault;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;

    public Statuses() {
    }

    public Statuses(Integer statusId) {
        this.statusId = statusId;
    }

    public Statuses(Integer statusId, Character status, Character type, Character isDefault, short position) {
        this.statusId = statusId;
        this.status = status;
        this.type = type;
        this.isDefault = isDefault;
        this.position = position;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
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

    public Character getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Character isDefault) {
        this.isDefault = isDefault;
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
        hash += (statusId != null ? statusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statuses)) {
            return false;
        }
        Statuses other = (Statuses) object;
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Statuses[ statusId=" + statusId + " ]";
    }
    
}
