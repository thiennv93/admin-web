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
@Table(name = "newsletter_links")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NewsletterLinks.findAll", query = "SELECT n FROM NewsletterLinks n")
    , @NamedQuery(name = "NewsletterLinks.findByLinkId", query = "SELECT n FROM NewsletterLinks n WHERE n.linkId = :linkId")
    , @NamedQuery(name = "NewsletterLinks.findByCampaignId", query = "SELECT n FROM NewsletterLinks n WHERE n.campaignId = :campaignId")
    , @NamedQuery(name = "NewsletterLinks.findByNewsletterId", query = "SELECT n FROM NewsletterLinks n WHERE n.newsletterId = :newsletterId")
    , @NamedQuery(name = "NewsletterLinks.findByUrl", query = "SELECT n FROM NewsletterLinks n WHERE n.url = :url")
    , @NamedQuery(name = "NewsletterLinks.findByClicks", query = "SELECT n FROM NewsletterLinks n WHERE n.clicks = :clicks")})
public class NewsletterLinks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "link_id")
    private Integer linkId;
    @Basic(optional = false)
    @Column(name = "campaign_id")
    private int campaignId;
    @Basic(optional = false)
    @Column(name = "newsletter_id")
    private int newsletterId;
    @Basic(optional = false)
    @Column(name = "url")
    private String url;
    @Column(name = "clicks")
    private Integer clicks;

    public NewsletterLinks() {
    }

    public NewsletterLinks(Integer linkId) {
        this.linkId = linkId;
    }

    public NewsletterLinks(Integer linkId, int campaignId, int newsletterId, String url) {
        this.linkId = linkId;
        this.campaignId = campaignId;
        this.newsletterId = newsletterId;
        this.url = url;
    }

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public int getNewsletterId() {
        return newsletterId;
    }

    public void setNewsletterId(int newsletterId) {
        this.newsletterId = newsletterId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
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
        if (!(object instanceof NewsletterLinks)) {
            return false;
        }
        NewsletterLinks other = (NewsletterLinks) object;
        if ((this.linkId == null && other.linkId != null) || (this.linkId != null && !this.linkId.equals(other.linkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewsletterLinks[ linkId=" + linkId + " ]";
    }
    
}
