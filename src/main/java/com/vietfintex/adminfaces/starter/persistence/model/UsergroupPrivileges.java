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
@Table(name = "usergroup_privileges")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsergroupPrivileges.findAll", query = "SELECT u FROM UsergroupPrivileges u")
    , @NamedQuery(name = "UsergroupPrivileges.findByUsergroupId", query = "SELECT u FROM UsergroupPrivileges u WHERE u.usergroupPrivilegesPK.usergroupId = :usergroupId")
    , @NamedQuery(name = "UsergroupPrivileges.findByPrivilege", query = "SELECT u FROM UsergroupPrivileges u WHERE u.usergroupPrivilegesPK.privilege = :privilege")})
public class UsergroupPrivileges implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsergroupPrivilegesPK usergroupPrivilegesPK;

    public UsergroupPrivileges() {
    }

    public UsergroupPrivileges(UsergroupPrivilegesPK usergroupPrivilegesPK) {
        this.usergroupPrivilegesPK = usergroupPrivilegesPK;
    }

    public UsergroupPrivileges(int usergroupId, String privilege) {
        this.usergroupPrivilegesPK = new UsergroupPrivilegesPK(usergroupId, privilege);
    }

    public UsergroupPrivilegesPK getUsergroupPrivilegesPK() {
        return usergroupPrivilegesPK;
    }

    public void setUsergroupPrivilegesPK(UsergroupPrivilegesPK usergroupPrivilegesPK) {
        this.usergroupPrivilegesPK = usergroupPrivilegesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usergroupPrivilegesPK != null ? usergroupPrivilegesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsergroupPrivileges)) {
            return false;
        }
        UsergroupPrivileges other = (UsergroupPrivileges) object;
        if ((this.usergroupPrivilegesPK == null && other.usergroupPrivilegesPK != null) || (this.usergroupPrivilegesPK != null && !this.usergroupPrivilegesPK.equals(other.usergroupPrivilegesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UsergroupPrivileges[ usergroupPrivilegesPK=" + usergroupPrivilegesPK + " ]";
    }
    
}
