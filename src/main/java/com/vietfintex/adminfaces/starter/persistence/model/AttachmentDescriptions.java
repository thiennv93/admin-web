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
@Table(name = "attachment_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AttachmentDescriptions.findAll", query = "SELECT a FROM AttachmentDescriptions a")
    , @NamedQuery(name = "AttachmentDescriptions.findByAttachmentId", query = "SELECT a FROM AttachmentDescriptions a WHERE a.attachmentDescriptionsPK.attachmentId = :attachmentId")
    , @NamedQuery(name = "AttachmentDescriptions.findByLangCode", query = "SELECT a FROM AttachmentDescriptions a WHERE a.attachmentDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "AttachmentDescriptions.findByDescription", query = "SELECT a FROM AttachmentDescriptions a WHERE a.description = :description")})
public class AttachmentDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AttachmentDescriptionsPK attachmentDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public AttachmentDescriptions() {
    }

    public AttachmentDescriptions(AttachmentDescriptionsPK attachmentDescriptionsPK) {
        this.attachmentDescriptionsPK = attachmentDescriptionsPK;
    }

    public AttachmentDescriptions(AttachmentDescriptionsPK attachmentDescriptionsPK, String description) {
        this.attachmentDescriptionsPK = attachmentDescriptionsPK;
        this.description = description;
    }

    public AttachmentDescriptions(int attachmentId, String langCode) {
        this.attachmentDescriptionsPK = new AttachmentDescriptionsPK(attachmentId, langCode);
    }

    public AttachmentDescriptionsPK getAttachmentDescriptionsPK() {
        return attachmentDescriptionsPK;
    }

    public void setAttachmentDescriptionsPK(AttachmentDescriptionsPK attachmentDescriptionsPK) {
        this.attachmentDescriptionsPK = attachmentDescriptionsPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (attachmentDescriptionsPK != null ? attachmentDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AttachmentDescriptions)) {
            return false;
        }
        AttachmentDescriptions other = (AttachmentDescriptions) object;
        if ((this.attachmentDescriptionsPK == null && other.attachmentDescriptionsPK != null) || (this.attachmentDescriptionsPK != null && !this.attachmentDescriptionsPK.equals(other.attachmentDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AttachmentDescriptions[ attachmentDescriptionsPK=" + attachmentDescriptionsPK + " ]";
    }
    
}
