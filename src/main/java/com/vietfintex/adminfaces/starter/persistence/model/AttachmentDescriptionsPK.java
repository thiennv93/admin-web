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
public class AttachmentDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "attachment_id")
    private int attachmentId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public AttachmentDescriptionsPK() {
    }

    public AttachmentDescriptionsPK(int attachmentId, String langCode) {
        this.attachmentId = attachmentId;
        this.langCode = langCode;
    }

    public int getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
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
        hash += (int) attachmentId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AttachmentDescriptionsPK)) {
            return false;
        }
        AttachmentDescriptionsPK other = (AttachmentDescriptionsPK) object;
        if (this.attachmentId != other.attachmentId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AttachmentDescriptionsPK[ attachmentId=" + attachmentId + ", langCode=" + langCode + " ]";
    }
    
}
