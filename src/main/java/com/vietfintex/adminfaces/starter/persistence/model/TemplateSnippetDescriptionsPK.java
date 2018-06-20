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
public class TemplateSnippetDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "snippet_id")
    private int snippetId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public TemplateSnippetDescriptionsPK() {
    }

    public TemplateSnippetDescriptionsPK(int snippetId, String langCode) {
        this.snippetId = snippetId;
        this.langCode = langCode;
    }

    public int getSnippetId() {
        return snippetId;
    }

    public void setSnippetId(int snippetId) {
        this.snippetId = snippetId;
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
        hash += (int) snippetId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemplateSnippetDescriptionsPK)) {
            return false;
        }
        TemplateSnippetDescriptionsPK other = (TemplateSnippetDescriptionsPK) object;
        if (this.snippetId != other.snippetId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TemplateSnippetDescriptionsPK[ snippetId=" + snippetId + ", langCode=" + langCode + " ]";
    }
    
}
