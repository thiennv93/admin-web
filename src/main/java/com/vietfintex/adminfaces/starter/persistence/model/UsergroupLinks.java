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
@Table(name = "usergroup_links")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsergroupLinks.findAll", query = "SELECT u FROM UsergroupLinks u")
    , @NamedQuery(name = "UsergroupLinks.findByLinkId", query = "SELECT u FROM UsergroupLinks u WHERE u.linkId = :linkId")
    , @NamedQuery(name = "UsergroupLinks.findByUserId", query = "SELECT u FROM UsergroupLinks u WHERE u.userId = :userId")
    , @NamedQuery(name = "UsergroupLinks.findByUsergroupId", query = "SELECT u FROM UsergroupLinks u WHERE u.usergroupId = :usergroupId")
    , @NamedQuery(name = "UsergroupLinks.findByStatus", query = "SELECT u FROM UsergroupLinks u WHERE u.status = :status")})
public class UsergroupLinks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "link_id")
    private Integer linkId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "usergroup_id")
    private int usergroupId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public UsergroupLinks() {
    }

    public UsergroupLinks(Integer linkId) {
        this.linkId = linkId;
    }

    public UsergroupLinks(Integer linkId, int userId, int usergroupId, Character status) {
        this.linkId = linkId;
        this.userId = userId;
        this.usergroupId = usergroupId;
        this.status = status;
    }

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUsergroupId() {
        return usergroupId;
    }

    public void setUsergroupId(int usergroupId) {
        this.usergroupId = usergroupId;
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
        hash += (linkId != null ? linkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsergroupLinks)) {
            return false;
        }
        UsergroupLinks other = (UsergroupLinks) object;
        if ((this.linkId == null && other.linkId != null) || (this.linkId != null && !this.linkId.equals(other.linkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UsergroupLinks[ linkId=" + linkId + " ]";
    }
    
}
