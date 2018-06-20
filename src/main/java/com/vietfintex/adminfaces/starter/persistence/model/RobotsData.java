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
@Table(name = "robots_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RobotsData.findAll", query = "SELECT r FROM RobotsData r")
    , @NamedQuery(name = "RobotsData.findByRobotsId", query = "SELECT r FROM RobotsData r WHERE r.robotsId = :robotsId")
    , @NamedQuery(name = "RobotsData.findByCompanyId", query = "SELECT r FROM RobotsData r WHERE r.companyId = :companyId")})
public class RobotsData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "robots_id")
    private Integer robotsId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Lob
    @Column(name = "data")
    private String data;

    public RobotsData() {
    }

    public RobotsData(Integer robotsId) {
        this.robotsId = robotsId;
    }

    public RobotsData(Integer robotsId, int companyId, String data) {
        this.robotsId = robotsId;
        this.companyId = companyId;
        this.data = data;
    }

    public Integer getRobotsId() {
        return robotsId;
    }

    public void setRobotsId(Integer robotsId) {
        this.robotsId = robotsId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (robotsId != null ? robotsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RobotsData)) {
            return false;
        }
        RobotsData other = (RobotsData) object;
        if ((this.robotsId == null && other.robotsId != null) || (this.robotsId != null && !this.robotsId.equals(other.robotsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RobotsData[ robotsId=" + robotsId + " ]";
    }
    
}
