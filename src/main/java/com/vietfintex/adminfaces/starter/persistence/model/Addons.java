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
@Table(name = "addons")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Addons.findAll", query = "SELECT a FROM Addons a")
    , @NamedQuery(name = "Addons.findByAddon", query = "SELECT a FROM Addons a WHERE a.addon = :addon")
    , @NamedQuery(name = "Addons.findByStatus", query = "SELECT a FROM Addons a WHERE a.status = :status")
    , @NamedQuery(name = "Addons.findByVersion", query = "SELECT a FROM Addons a WHERE a.version = :version")
    , @NamedQuery(name = "Addons.findByPriority", query = "SELECT a FROM Addons a WHERE a.priority = :priority")
    , @NamedQuery(name = "Addons.findByDependencies", query = "SELECT a FROM Addons a WHERE a.dependencies = :dependencies")
    , @NamedQuery(name = "Addons.findByConflicts", query = "SELECT a FROM Addons a WHERE a.conflicts = :conflicts")
    , @NamedQuery(name = "Addons.findBySeparate", query = "SELECT a FROM Addons a WHERE a.separate = :separate")
    , @NamedQuery(name = "Addons.findByUnmanaged", query = "SELECT a FROM Addons a WHERE a.unmanaged = :unmanaged")
    , @NamedQuery(name = "Addons.findByHasIcon", query = "SELECT a FROM Addons a WHERE a.hasIcon = :hasIcon")
    , @NamedQuery(name = "Addons.findByInstallDatetime", query = "SELECT a FROM Addons a WHERE a.installDatetime = :installDatetime")
    , @NamedQuery(name = "Addons.findByMarketplaceId", query = "SELECT a FROM Addons a WHERE a.marketplaceId = :marketplaceId")
    , @NamedQuery(name = "Addons.findByMarketplaceLicenseKey", query = "SELECT a FROM Addons a WHERE a.marketplaceLicenseKey = :marketplaceLicenseKey")})
public class Addons implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "addon")
    private String addon;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "version")
    private String version;
    @Basic(optional = false)
    @Column(name = "priority")
    private int priority;
    @Basic(optional = false)
    @Column(name = "dependencies")
    private String dependencies;
    @Basic(optional = false)
    @Column(name = "conflicts")
    private String conflicts;
    @Basic(optional = false)
    @Column(name = "separate")
    private boolean separate;
    @Basic(optional = false)
    @Column(name = "unmanaged")
    private boolean unmanaged;
    @Basic(optional = false)
    @Column(name = "has_icon")
    private boolean hasIcon;
    @Basic(optional = false)
    @Column(name = "install_datetime")
    private int installDatetime;
    @Column(name = "marketplace_id")
    private Integer marketplaceId;
    @Column(name = "marketplace_license_key")
    private String marketplaceLicenseKey;

    public Addons() {
    }

    public Addons(String addon) {
        this.addon = addon;
    }

    public Addons(String addon, Character status, String version, int priority, String dependencies, String conflicts, boolean separate, boolean unmanaged, boolean hasIcon, int installDatetime) {
        this.addon = addon;
        this.status = status;
        this.version = version;
        this.priority = priority;
        this.dependencies = dependencies;
        this.conflicts = conflicts;
        this.separate = separate;
        this.unmanaged = unmanaged;
        this.hasIcon = hasIcon;
        this.installDatetime = installDatetime;
    }

    public String getAddon() {
        return addon;
    }

    public void setAddon(String addon) {
        this.addon = addon;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDependencies() {
        return dependencies;
    }

    public void setDependencies(String dependencies) {
        this.dependencies = dependencies;
    }

    public String getConflicts() {
        return conflicts;
    }

    public void setConflicts(String conflicts) {
        this.conflicts = conflicts;
    }

    public boolean getSeparate() {
        return separate;
    }

    public void setSeparate(boolean separate) {
        this.separate = separate;
    }

    public boolean getUnmanaged() {
        return unmanaged;
    }

    public void setUnmanaged(boolean unmanaged) {
        this.unmanaged = unmanaged;
    }

    public boolean getHasIcon() {
        return hasIcon;
    }

    public void setHasIcon(boolean hasIcon) {
        this.hasIcon = hasIcon;
    }

    public int getInstallDatetime() {
        return installDatetime;
    }

    public void setInstallDatetime(int installDatetime) {
        this.installDatetime = installDatetime;
    }

    public Integer getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(Integer marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public String getMarketplaceLicenseKey() {
        return marketplaceLicenseKey;
    }

    public void setMarketplaceLicenseKey(String marketplaceLicenseKey) {
        this.marketplaceLicenseKey = marketplaceLicenseKey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addon != null ? addon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addons)) {
            return false;
        }
        Addons other = (Addons) object;
        if ((this.addon == null && other.addon != null) || (this.addon != null && !this.addon.equals(other.addon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Addons[ addon=" + addon + " ]";
    }
    
}
