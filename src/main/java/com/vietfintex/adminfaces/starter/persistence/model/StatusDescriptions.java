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
@Table(name = "status_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusDescriptions.findAll", query = "SELECT s FROM StatusDescriptions s")
    , @NamedQuery(name = "StatusDescriptions.findByStatusId", query = "SELECT s FROM StatusDescriptions s WHERE s.statusDescriptionsPK.statusId = :statusId")
    , @NamedQuery(name = "StatusDescriptions.findByDescription", query = "SELECT s FROM StatusDescriptions s WHERE s.description = :description")
    , @NamedQuery(name = "StatusDescriptions.findByEmailSubj", query = "SELECT s FROM StatusDescriptions s WHERE s.emailSubj = :emailSubj")
    , @NamedQuery(name = "StatusDescriptions.findByLangCode", query = "SELECT s FROM StatusDescriptions s WHERE s.statusDescriptionsPK.langCode = :langCode")})
public class StatusDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StatusDescriptionsPK statusDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "email_subj")
    private String emailSubj;
    @Lob
    @Column(name = "email_header")
    private String emailHeader;

    public StatusDescriptions() {
    }

    public StatusDescriptions(StatusDescriptionsPK statusDescriptionsPK) {
        this.statusDescriptionsPK = statusDescriptionsPK;
    }

    public StatusDescriptions(StatusDescriptionsPK statusDescriptionsPK, String description, String emailSubj) {
        this.statusDescriptionsPK = statusDescriptionsPK;
        this.description = description;
        this.emailSubj = emailSubj;
    }

    public StatusDescriptions(int statusId, String langCode) {
        this.statusDescriptionsPK = new StatusDescriptionsPK(statusId, langCode);
    }

    public StatusDescriptionsPK getStatusDescriptionsPK() {
        return statusDescriptionsPK;
    }

    public void setStatusDescriptionsPK(StatusDescriptionsPK statusDescriptionsPK) {
        this.statusDescriptionsPK = statusDescriptionsPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmailSubj() {
        return emailSubj;
    }

    public void setEmailSubj(String emailSubj) {
        this.emailSubj = emailSubj;
    }

    public String getEmailHeader() {
        return emailHeader;
    }

    public void setEmailHeader(String emailHeader) {
        this.emailHeader = emailHeader;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusDescriptionsPK != null ? statusDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusDescriptions)) {
            return false;
        }
        StatusDescriptions other = (StatusDescriptions) object;
        if ((this.statusDescriptionsPK == null && other.statusDescriptionsPK != null) || (this.statusDescriptionsPK != null && !this.statusDescriptionsPK.equals(other.statusDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StatusDescriptions[ statusDescriptionsPK=" + statusDescriptionsPK + " ]";
    }
    
}
