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
@Table(name = "page_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PageDescriptions.findAll", query = "SELECT p FROM PageDescriptions p")
    , @NamedQuery(name = "PageDescriptions.findByPageId", query = "SELECT p FROM PageDescriptions p WHERE p.pageDescriptionsPK.pageId = :pageId")
    , @NamedQuery(name = "PageDescriptions.findByLangCode", query = "SELECT p FROM PageDescriptions p WHERE p.pageDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "PageDescriptions.findByPage", query = "SELECT p FROM PageDescriptions p WHERE p.page = :page")
    , @NamedQuery(name = "PageDescriptions.findByMetaKeywords", query = "SELECT p FROM PageDescriptions p WHERE p.metaKeywords = :metaKeywords")
    , @NamedQuery(name = "PageDescriptions.findByMetaDescription", query = "SELECT p FROM PageDescriptions p WHERE p.metaDescription = :metaDescription")
    , @NamedQuery(name = "PageDescriptions.findByPageTitle", query = "SELECT p FROM PageDescriptions p WHERE p.pageTitle = :pageTitle")
    , @NamedQuery(name = "PageDescriptions.findByLink", query = "SELECT p FROM PageDescriptions p WHERE p.link = :link")})
public class PageDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PageDescriptionsPK pageDescriptionsPK;
    @Column(name = "page")
    private String page;
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "meta_keywords")
    private String metaKeywords;
    @Basic(optional = false)
    @Column(name = "meta_description")
    private String metaDescription;
    @Basic(optional = false)
    @Column(name = "page_title")
    private String pageTitle;
    @Basic(optional = false)
    @Column(name = "link")
    private String link;

    public PageDescriptions() {
    }

    public PageDescriptions(PageDescriptionsPK pageDescriptionsPK) {
        this.pageDescriptionsPK = pageDescriptionsPK;
    }

    public PageDescriptions(PageDescriptionsPK pageDescriptionsPK, String metaKeywords, String metaDescription, String pageTitle, String link) {
        this.pageDescriptionsPK = pageDescriptionsPK;
        this.metaKeywords = metaKeywords;
        this.metaDescription = metaDescription;
        this.pageTitle = pageTitle;
        this.link = link;
    }

    public PageDescriptions(int pageId, String langCode) {
        this.pageDescriptionsPK = new PageDescriptionsPK(pageId, langCode);
    }

    public PageDescriptionsPK getPageDescriptionsPK() {
        return pageDescriptionsPK;
    }

    public void setPageDescriptionsPK(PageDescriptionsPK pageDescriptionsPK) {
        this.pageDescriptionsPK = pageDescriptionsPK;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pageDescriptionsPK != null ? pageDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PageDescriptions)) {
            return false;
        }
        PageDescriptions other = (PageDescriptions) object;
        if ((this.pageDescriptionsPK == null && other.pageDescriptionsPK != null) || (this.pageDescriptionsPK != null && !this.pageDescriptionsPK.equals(other.pageDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PageDescriptions[ pageDescriptionsPK=" + pageDescriptionsPK + " ]";
    }
    
}
