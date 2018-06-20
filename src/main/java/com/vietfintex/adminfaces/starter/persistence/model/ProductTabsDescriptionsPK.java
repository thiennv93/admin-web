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
public class ProductTabsDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "tab_id")
    private int tabId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public ProductTabsDescriptionsPK() {
    }

    public ProductTabsDescriptionsPK(int tabId, String langCode) {
        this.tabId = tabId;
        this.langCode = langCode;
    }

    public int getTabId() {
        return tabId;
    }

    public void setTabId(int tabId) {
        this.tabId = tabId;
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
        hash += (int) tabId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductTabsDescriptionsPK)) {
            return false;
        }
        ProductTabsDescriptionsPK other = (ProductTabsDescriptionsPK) object;
        if (this.tabId != other.tabId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductTabsDescriptionsPK[ tabId=" + tabId + ", langCode=" + langCode + " ]";
    }
    
}
