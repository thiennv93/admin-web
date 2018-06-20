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
public class PageDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "page_id")
    private int pageId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public PageDescriptionsPK() {
    }

    public PageDescriptionsPK(int pageId, String langCode) {
        this.pageId = pageId;
        this.langCode = langCode;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
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
        hash += (int) pageId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PageDescriptionsPK)) {
            return false;
        }
        PageDescriptionsPK other = (PageDescriptionsPK) object;
        if (this.pageId != other.pageId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PageDescriptionsPK[ pageId=" + pageId + ", langCode=" + langCode + " ]";
    }
    
}
