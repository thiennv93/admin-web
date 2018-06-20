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
@Table(name = "newsletter_campaigns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NewsletterCampaigns.findAll", query = "SELECT n FROM NewsletterCampaigns n")
    , @NamedQuery(name = "NewsletterCampaigns.findByCampaignId", query = "SELECT n FROM NewsletterCampaigns n WHERE n.campaignId = :campaignId")
    , @NamedQuery(name = "NewsletterCampaigns.findByTimestamp", query = "SELECT n FROM NewsletterCampaigns n WHERE n.timestamp = :timestamp")
    , @NamedQuery(name = "NewsletterCampaigns.findByStatus", query = "SELECT n FROM NewsletterCampaigns n WHERE n.status = :status")})
public class NewsletterCampaigns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "campaign_id")
    private Integer campaignId;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public NewsletterCampaigns() {
    }

    public NewsletterCampaigns(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public NewsletterCampaigns(Integer campaignId, int timestamp, Character status) {
        this.campaignId = campaignId;
        this.timestamp = timestamp;
        this.status = status;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (campaignId != null ? campaignId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NewsletterCampaigns)) {
            return false;
        }
        NewsletterCampaigns other = (NewsletterCampaigns) object;
        if ((this.campaignId == null && other.campaignId != null) || (this.campaignId != null && !this.campaignId.equals(other.campaignId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewsletterCampaigns[ campaignId=" + campaignId + " ]";
    }
    
}
