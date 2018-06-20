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
@Table(name = "banners")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banners.findAll", query = "SELECT b FROM Banners b")
    , @NamedQuery(name = "Banners.findByBannerId", query = "SELECT b FROM Banners b WHERE b.bannerId = :bannerId")
    , @NamedQuery(name = "Banners.findByStatus", query = "SELECT b FROM Banners b WHERE b.status = :status")
    , @NamedQuery(name = "Banners.findByType", query = "SELECT b FROM Banners b WHERE b.type = :type")
    , @NamedQuery(name = "Banners.findByTarget", query = "SELECT b FROM Banners b WHERE b.target = :target")
    , @NamedQuery(name = "Banners.findByLocalization", query = "SELECT b FROM Banners b WHERE b.localization = :localization")
    , @NamedQuery(name = "Banners.findByTimestamp", query = "SELECT b FROM Banners b WHERE b.timestamp = :timestamp")
    , @NamedQuery(name = "Banners.findByPosition", query = "SELECT b FROM Banners b WHERE b.position = :position")})
public class Banners implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "banner_id")
    private Integer bannerId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "target")
    private Character target;
    @Basic(optional = false)
    @Column(name = "localization")
    private String localization;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;

    public Banners() {
    }

    public Banners(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public Banners(Integer bannerId, Character status, Character type, Character target, String localization, int timestamp, short position) {
        this.bannerId = bannerId;
        this.status = status;
        this.type = type;
        this.target = target;
        this.localization = localization;
        this.timestamp = timestamp;
        this.position = position;
    }

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
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

    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
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
        hash += (bannerId != null ? bannerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banners)) {
            return false;
        }
        Banners other = (Banners) object;
        if ((this.bannerId == null && other.bannerId != null) || (this.bannerId != null && !this.bannerId.equals(other.bannerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Banners[ bannerId=" + bannerId + " ]";
    }
    
}
