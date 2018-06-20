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
@Table(name = "installed_upgrades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InstalledUpgrades.findAll", query = "SELECT i FROM InstalledUpgrades i")
    , @NamedQuery(name = "InstalledUpgrades.findById", query = "SELECT i FROM InstalledUpgrades i WHERE i.id = :id")
    , @NamedQuery(name = "InstalledUpgrades.findByType", query = "SELECT i FROM InstalledUpgrades i WHERE i.type = :type")
    , @NamedQuery(name = "InstalledUpgrades.findByName", query = "SELECT i FROM InstalledUpgrades i WHERE i.name = :name")
    , @NamedQuery(name = "InstalledUpgrades.findByTimestamp", query = "SELECT i FROM InstalledUpgrades i WHERE i.timestamp = :timestamp")})
public class InstalledUpgrades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Lob
    @Column(name = "description")
    private String description;
    @Lob
    @Column(name = "conflicts")
    private String conflicts;

    public InstalledUpgrades() {
    }

    public InstalledUpgrades(Integer id) {
        this.id = id;
    }

    public InstalledUpgrades(Integer id, String type, String name, int timestamp) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConflicts() {
        return conflicts;
    }

    public void setConflicts(String conflicts) {
        this.conflicts = conflicts;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InstalledUpgrades)) {
            return false;
        }
        InstalledUpgrades other = (InstalledUpgrades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InstalledUpgrades[ id=" + id + " ]";
    }
    
}
