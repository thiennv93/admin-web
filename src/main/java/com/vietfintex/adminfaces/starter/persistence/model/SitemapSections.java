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
@Table(name = "sitemap_sections")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SitemapSections.findAll", query = "SELECT s FROM SitemapSections s")
    , @NamedQuery(name = "SitemapSections.findBySectionId", query = "SELECT s FROM SitemapSections s WHERE s.sectionId = :sectionId")
    , @NamedQuery(name = "SitemapSections.findByStatus", query = "SELECT s FROM SitemapSections s WHERE s.status = :status")
    , @NamedQuery(name = "SitemapSections.findBySectionType", query = "SELECT s FROM SitemapSections s WHERE s.sectionType = :sectionType")
    , @NamedQuery(name = "SitemapSections.findByPosition", query = "SELECT s FROM SitemapSections s WHERE s.position = :position")
    , @NamedQuery(name = "SitemapSections.findByCompanyId", query = "SELECT s FROM SitemapSections s WHERE s.companyId = :companyId")})
public class SitemapSections implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "section_id")
    private Integer sectionId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "section_type")
    private String sectionType;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;

    public SitemapSections() {
    }

    public SitemapSections(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public SitemapSections(Integer sectionId, Character status, String sectionType, short position, int companyId) {
        this.sectionId = sectionId;
        this.status = status;
        this.sectionType = sectionType;
        this.position = position;
        this.companyId = companyId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
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
        hash += (sectionId != null ? sectionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SitemapSections)) {
            return false;
        }
        SitemapSections other = (SitemapSections) object;
        if ((this.sectionId == null && other.sectionId != null) || (this.sectionId != null && !this.sectionId.equals(other.sectionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SitemapSections[ sectionId=" + sectionId + " ]";
    }
    
}
