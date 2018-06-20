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
public class EbayTemplateDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "template_id")
    private int templateId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public EbayTemplateDescriptionsPK() {
    }

    public EbayTemplateDescriptionsPK(int templateId, String langCode) {
        this.templateId = templateId;
        this.langCode = langCode;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
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
        hash += (int) templateId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayTemplateDescriptionsPK)) {
            return false;
        }
        EbayTemplateDescriptionsPK other = (EbayTemplateDescriptionsPK) object;
        if (this.templateId != other.templateId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayTemplateDescriptionsPK[ templateId=" + templateId + ", langCode=" + langCode + " ]";
    }
    
}