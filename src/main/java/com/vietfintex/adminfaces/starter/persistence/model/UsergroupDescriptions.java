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
@Table(name = "usergroup_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsergroupDescriptions.findAll", query = "SELECT u FROM UsergroupDescriptions u")
    , @NamedQuery(name = "UsergroupDescriptions.findByUsergroupId", query = "SELECT u FROM UsergroupDescriptions u WHERE u.usergroupDescriptionsPK.usergroupId = :usergroupId")
    , @NamedQuery(name = "UsergroupDescriptions.findByLangCode", query = "SELECT u FROM UsergroupDescriptions u WHERE u.usergroupDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "UsergroupDescriptions.findByUsergroup", query = "SELECT u FROM UsergroupDescriptions u WHERE u.usergroup = :usergroup")})
public class UsergroupDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsergroupDescriptionsPK usergroupDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "usergroup")
    private String usergroup;

    public UsergroupDescriptions() {
    }

    public UsergroupDescriptions(UsergroupDescriptionsPK usergroupDescriptionsPK) {
        this.usergroupDescriptionsPK = usergroupDescriptionsPK;
    }

    public UsergroupDescriptions(UsergroupDescriptionsPK usergroupDescriptionsPK, String usergroup) {
        this.usergroupDescriptionsPK = usergroupDescriptionsPK;
        this.usergroup = usergroup;
    }

    public UsergroupDescriptions(int usergroupId, String langCode) {
        this.usergroupDescriptionsPK = new UsergroupDescriptionsPK(usergroupId, langCode);
    }

    public UsergroupDescriptionsPK getUsergroupDescriptionsPK() {
        return usergroupDescriptionsPK;
    }

    public void setUsergroupDescriptionsPK(UsergroupDescriptionsPK usergroupDescriptionsPK) {
        this.usergroupDescriptionsPK = usergroupDescriptionsPK;
    }

    public String getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(String usergroup) {
        this.usergroup = usergroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usergroupDescriptionsPK != null ? usergroupDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsergroupDescriptions)) {
            return false;
        }
        UsergroupDescriptions other = (UsergroupDescriptions) object;
        if ((this.usergroupDescriptionsPK == null && other.usergroupDescriptionsPK != null) || (this.usergroupDescriptionsPK != null && !this.usergroupDescriptionsPK.equals(other.usergroupDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UsergroupDescriptions[ usergroupDescriptionsPK=" + usergroupDescriptionsPK + " ]";
    }
    
}
