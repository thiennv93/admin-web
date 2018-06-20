/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Embeddable
public class NewsletterDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "newsletter_id")
    private int newsletterId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public NewsletterDescriptionsPK() {
    }

    public NewsletterDescriptionsPK(int newsletterId, String langCode) {
        this.newsletterId = newsletterId;
        this.langCode = langCode;
    }

    public int getNewsletterId() {
        return newsletterId;
    }

    public void setNewsletterId(int newsletterId) {
        this.newsletterId = newsletterId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) newsletterId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NewsletterDescriptionsPK)) {
            return false;
        }
        NewsletterDescriptionsPK other = (NewsletterDescriptionsPK) object;
        if (this.newsletterId != other.newsletterId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewsletterDescriptionsPK[ newsletterId=" + newsletterId + ", langCode=" + langCode + " ]";
    }
    
}
