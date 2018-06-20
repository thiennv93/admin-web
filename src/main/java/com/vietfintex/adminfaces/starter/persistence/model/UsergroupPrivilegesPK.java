/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Embeddable
public class UsergroupPrivilegesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "usergroup_id")
    private int usergroupId;
    @Basic(optional = false)
    @Column(name = "privilege")
    private String privilege;

    public UsergroupPrivilegesPK() {
    }

    public UsergroupPrivilegesPK(int usergroupId, String privilege) {
        this.usergroupId = usergroupId;
        this.privilege = privilege;
    }

    public int getUsergroupId() {
        return usergroupId;
    }

    public void setUsergroupId(int usergroupId) {
        this.usergroupId = usergroupId;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) usergroupId;
        hash += (privilege != null ? privilege.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsergroupPrivilegesPK)) {
            return false;
        }
        UsergroupPrivilegesPK other = (UsergroupPrivilegesPK) object;
        if (this.usergroupId != other.usergroupId) {
            return false;
        }
        if ((this.privilege == null && other.privilege != null) || (this.privilege != null && !this.privilege.equals(other.privilege))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UsergroupPrivilegesPK[ usergroupId=" + usergroupId + ", privilege=" + privilege + " ]";
    }
    
}
