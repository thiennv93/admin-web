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
@Table(name = "newsletters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Newsletters.findAll", query = "SELECT n FROM Newsletters n")
    , @NamedQuery(name = "Newsletters.findByNewsletterId", query = "SELECT n FROM Newsletters n WHERE n.newsletterId = :newsletterId")
    , @NamedQuery(name = "Newsletters.findByCampaignId", query = "SELECT n FROM Newsletters n WHERE n.campaignId = :campaignId")
    , @NamedQuery(name = "Newsletters.findBySentDate", query = "SELECT n FROM Newsletters n WHERE n.sentDate = :sentDate")
    , @NamedQuery(name = "Newsletters.findByStatus", query = "SELECT n FROM Newsletters n WHERE n.status = :status")
    , @NamedQuery(name = "Newsletters.findByType", query = "SELECT n FROM Newsletters n WHERE n.type = :type")
    , @NamedQuery(name = "Newsletters.findByMailingLists", query = "SELECT n FROM Newsletters n WHERE n.mailingLists = :mailingLists")
    , @NamedQuery(name = "Newsletters.findByAbandonedType", query = "SELECT n FROM Newsletters n WHERE n.abandonedType = :abandonedType")
    , @NamedQuery(name = "Newsletters.findByAbandonedDays", query = "SELECT n FROM Newsletters n WHERE n.abandonedDays = :abandonedDays")
    , @NamedQuery(name = "Newsletters.findByAbandonedCompanyId", query = "SELECT n FROM Newsletters n WHERE n.abandonedCompanyId = :abandonedCompanyId")})
public class Newsletters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "newsletter_id")
    private Integer newsletterId;
    @Basic(optional = false)
    @Column(name = "campaign_id")
    private int campaignId;
    @Basic(optional = false)
    @Column(name = "sent_date")
    private int sentDate;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "mailing_lists")
    private String mailingLists;
    @Lob
    @Column(name = "users")
    private String users;
    @Basic(optional = false)
    @Column(name = "abandoned_type")
    private String abandonedType;
    @Basic(optional = false)
    @Column(name = "abandoned_days")
    private int abandonedDays;
    @Basic(optional = false)
    @Column(name = "abandoned_company_id")
    private int abandonedCompanyId;

    public Newsletters() {
    }

    public Newsletters(Integer newsletterId) {
        this.newsletterId = newsletterId;
    }

    public Newsletters(Integer newsletterId, int campaignId, int sentDate, Character status, Character type, String mailingLists, String abandonedType, int abandonedDays, int abandonedCompanyId) {
        this.newsletterId = newsletterId;
        this.campaignId = campaignId;
        this.sentDate = sentDate;
        this.status = status;
        this.type = type;
        this.mailingLists = mailingLists;
        this.abandonedType = abandonedType;
        this.abandonedDays = abandonedDays;
        this.abandonedCompanyId = abandonedCompanyId;
    }

    public Integer getNewsletterId() {
        return newsletterId;
    }

    public void setNewsletterId(Integer newsletterId) {
        this.newsletterId = newsletterId;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public int getSentDate() {
        return sentDate;
    }

    public void setSentDate(int sentDate) {
        this.sentDate = sentDate;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getMailingLists() {
        return mailingLists;
    }

    public void setMailingLists(String mailingLists) {
        this.mailingLists = mailingLists;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getAbandonedType() {
        return abandonedType;
    }

    public void setAbandonedType(String abandonedType) {
        this.abandonedType = abandonedType;
    }

    public int getAbandonedDays() {
        return abandonedDays;
    }

    public void setAbandonedDays(int abandonedDays) {
        this.abandonedDays = abandonedDays;
    }

    public int getAbandonedCompanyId() {
        return abandonedCompanyId;
    }

    public void setAbandonedCompanyId(int abandonedCompanyId) {
        this.abandonedCompanyId = abandonedCompanyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (newsletterId != null ? newsletterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Newsletters)) {
            return false;
        }
        Newsletters other = (Newsletters) object;
        if ((this.newsletterId == null && other.newsletterId != null) || (this.newsletterId != null && !this.newsletterId.equals(other.newsletterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Newsletters[ newsletterId=" + newsletterId + " ]";
    }
    
}
