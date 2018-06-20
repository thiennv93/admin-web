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
@Table(name = "sitemap_links")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SitemapLinks.findAll", query = "SELECT s FROM SitemapLinks s")
    , @NamedQuery(name = "SitemapLinks.findByLinkId", query = "SELECT s FROM SitemapLinks s WHERE s.linkId = :linkId")
    , @NamedQuery(name = "SitemapLinks.findByLinkHref", query = "SELECT s FROM SitemapLinks s WHERE s.linkHref = :linkHref")
    , @NamedQuery(name = "SitemapLinks.findBySectionId", query = "SELECT s FROM SitemapLinks s WHERE s.sectionId = :sectionId")
    , @NamedQuery(name = "SitemapLinks.findByStatus", query = "SELECT s FROM SitemapLinks s WHERE s.status = :status")
    , @NamedQuery(name = "SitemapLinks.findByPosition", query = "SELECT s FROM SitemapLinks s WHERE s.position = :position")
    , @NamedQuery(name = "SitemapLinks.findByLinkType", query = "SELECT s FROM SitemapLinks s WHERE s.linkType = :linkType")
    , @NamedQuery(name = "SitemapLinks.findByCompanyId", query = "SELECT s FROM SitemapLinks s WHERE s.companyId = :companyId")})
public class SitemapLinks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "link_id")
    private Integer linkId;
    @Basic(optional = false)
    @Column(name = "link_href")
    private String linkHref;
    @Basic(optional = false)
    @Column(name = "section_id")
    private int sectionId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "link_type")
    private String linkType;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;

    public SitemapLinks() {
    }

    public SitemapLinks(Integer linkId) {
        this.linkId = linkId;
    }

    public SitemapLinks(Integer linkId, String linkHref, int sectionId, Character status, short position, String linkType, int companyId) {
        this.linkId = linkId;
        this.linkHref = linkHref;
        this.sectionId = sectionId;
        this.status = status;
        this.position = position;
        this.linkType = linkType;
        this.companyId = companyId;
    }

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getLinkHref() {
        return linkHref;
    }

    public void setLinkHref(String linkHref) {
        this.linkHref = linkHref;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
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
        hash += (linkId != null ? linkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SitemapLinks)) {
            return false;
        }
        SitemapLinks other = (SitemapLinks) object;
        if ((this.linkId == null && other.linkId != null) || (this.linkId != null && !this.linkId.equals(other.linkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SitemapLinks[ linkId=" + linkId + " ]";
    }
    
}
