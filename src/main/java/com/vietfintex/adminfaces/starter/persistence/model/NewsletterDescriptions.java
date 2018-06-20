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
@Table(name = "newsletter_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NewsletterDescriptions.findAll", query = "SELECT n FROM NewsletterDescriptions n")
    , @NamedQuery(name = "NewsletterDescriptions.findByNewsletterId", query = "SELECT n FROM NewsletterDescriptions n WHERE n.newsletterDescriptionsPK.newsletterId = :newsletterId")
    , @NamedQuery(name = "NewsletterDescriptions.findByNewsletter", query = "SELECT n FROM NewsletterDescriptions n WHERE n.newsletter = :newsletter")
    , @NamedQuery(name = "NewsletterDescriptions.findByLangCode", query = "SELECT n FROM NewsletterDescriptions n WHERE n.newsletterDescriptionsPK.langCode = :langCode")})
public class NewsletterDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NewsletterDescriptionsPK newsletterDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "newsletter")
    private String newsletter;
    @Lob
    @Column(name = "newsletter_multiple")
    private String newsletterMultiple;
    @Lob
    @Column(name = "body_html")
    private String bodyHtml;

    public NewsletterDescriptions() {
    }

    public NewsletterDescriptions(NewsletterDescriptionsPK newsletterDescriptionsPK) {
        this.newsletterDescriptionsPK = newsletterDescriptionsPK;
    }

    public NewsletterDescriptions(NewsletterDescriptionsPK newsletterDescriptionsPK, String newsletter) {
        this.newsletterDescriptionsPK = newsletterDescriptionsPK;
        this.newsletter = newsletter;
    }

    public NewsletterDescriptions(int newsletterId, String langCode) {
        this.newsletterDescriptionsPK = new NewsletterDescriptionsPK(newsletterId, langCode);
    }

    public NewsletterDescriptionsPK getNewsletterDescriptionsPK() {
        return newsletterDescriptionsPK;
    }

    public void setNewsletterDescriptionsPK(NewsletterDescriptionsPK newsletterDescriptionsPK) {
        this.newsletterDescriptionsPK = newsletterDescriptionsPK;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    public String getNewsletterMultiple() {
        return newsletterMultiple;
    }

    public void setNewsletterMultiple(String newsletterMultiple) {
        this.newsletterMultiple = newsletterMultiple;
    }

    public String getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (newsletterDescriptionsPK != null ? newsletterDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NewsletterDescriptions)) {
            return false;
        }
        NewsletterDescriptions other = (NewsletterDescriptions) object;
        if ((this.newsletterDescriptionsPK == null && other.newsletterDescriptionsPK != null) || (this.newsletterDescriptionsPK != null && !this.newsletterDescriptionsPK.equals(other.newsletterDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewsletterDescriptions[ newsletterDescriptionsPK=" + newsletterDescriptionsPK + " ]";
    }
    
}
