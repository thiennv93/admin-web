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
@Table(name = "privileges")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Privileges.findAll", query = "SELECT p FROM Privileges p")
    , @NamedQuery(name = "Privileges.findByPrivilege", query = "SELECT p FROM Privileges p WHERE p.privilege = :privilege")
    , @NamedQuery(name = "Privileges.findByIsDefault", query = "SELECT p FROM Privileges p WHERE p.isDefault = :isDefault")
    , @NamedQuery(name = "Privileges.findBySectionId", query = "SELECT p FROM Privileges p WHERE p.sectionId = :sectionId")})
public class Privileges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "privilege")
    private String privilege;
    @Basic(optional = false)
    @Column(name = "is_default")
    private Character isDefault;
    @Basic(optional = false)
    @Column(name = "section_id")
    private String sectionId;

    public Privileges() {
    }

    public Privileges(String privilege) {
        this.privilege = privilege;
    }

    public Privileges(String privilege, Character isDefault, String sectionId) {
        this.privilege = privilege;
        this.isDefault = isDefault;
        this.sectionId = sectionId;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public Character getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Character isDefault) {
        this.isDefault = isDefault;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (privilege != null ? privilege.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Privileges)) {
            return false;
        }
        Privileges other = (Privileges) object;
        if ((this.privilege == null && other.privilege != null) || (this.privilege != null && !this.privilege.equals(other.privilege))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Privileges[ privilege=" + privilege + " ]";
    }
    
}
