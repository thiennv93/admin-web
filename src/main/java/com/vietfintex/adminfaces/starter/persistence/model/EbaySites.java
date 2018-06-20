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
@Table(name = "ebay_sites")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbaySites.findAll", query = "SELECT e FROM EbaySites e")
    , @NamedQuery(name = "EbaySites.findBySiteId", query = "SELECT e FROM EbaySites e WHERE e.siteId = :siteId")
    , @NamedQuery(name = "EbaySites.findBySite", query = "SELECT e FROM EbaySites e WHERE e.site = :site")
    , @NamedQuery(name = "EbaySites.findByDetailUpdateTime", query = "SELECT e FROM EbaySites e WHERE e.detailUpdateTime = :detailUpdateTime")})
public class EbaySites implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "site_id")
    private Integer siteId;
    @Basic(optional = false)
    @Column(name = "site")
    private String site;
    @Lob
    @Column(name = "details")
    private String details;
    @Basic(optional = false)
    @Column(name = "detail_update_time")
    private int detailUpdateTime;

    public EbaySites() {
    }

    public EbaySites(Integer siteId) {
        this.siteId = siteId;
    }

    public EbaySites(Integer siteId, String site, int detailUpdateTime) {
        this.siteId = siteId;
        this.site = site;
        this.detailUpdateTime = detailUpdateTime;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getDetailUpdateTime() {
        return detailUpdateTime;
    }

    public void setDetailUpdateTime(int detailUpdateTime) {
        this.detailUpdateTime = detailUpdateTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (siteId != null ? siteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbaySites)) {
            return false;
        }
        EbaySites other = (EbaySites) object;
        if ((this.siteId == null && other.siteId != null) || (this.siteId != null && !this.siteId.equals(other.siteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbaySites[ siteId=" + siteId + " ]";
    }
    
}
