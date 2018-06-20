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
@Table(name = "usergroups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usergroups.findAll", query = "SELECT u FROM Usergroups u")
    , @NamedQuery(name = "Usergroups.findByUsergroupId", query = "SELECT u FROM Usergroups u WHERE u.usergroupId = :usergroupId")
    , @NamedQuery(name = "Usergroups.findByStatus", query = "SELECT u FROM Usergroups u WHERE u.status = :status")
    , @NamedQuery(name = "Usergroups.findByType", query = "SELECT u FROM Usergroups u WHERE u.type = :type")
    , @NamedQuery(name = "Usergroups.findByCompanyId", query = "SELECT u FROM Usergroups u WHERE u.companyId = :companyId")})
public class Usergroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usergroup_id")
    private Integer usergroupId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;

    public Usergroups() {
    }

    public Usergroups(Integer usergroupId) {
        this.usergroupId = usergroupId;
    }

    public Usergroups(Integer usergroupId, Character status, Character type, int companyId) {
        this.usergroupId = usergroupId;
        this.status = status;
        this.type = type;
        this.companyId = companyId;
    }

    public Integer getUsergroupId() {
        return usergroupId;
    }

    public void setUsergroupId(Integer usergroupId) {
        this.usergroupId = usergroupId;
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

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usergroupId != null ? usergroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usergroups)) {
            return false;
        }
        Usergroups other = (Usergroups) object;
        if ((this.usergroupId == null && other.usergroupId != null) || (this.usergroupId != null && !this.usergroupId.equals(other.usergroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usergroups[ usergroupId=" + usergroupId + " ]";
    }
    
}
