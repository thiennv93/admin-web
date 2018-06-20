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
public class ProductFileFolderDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "folder_id")
    private int folderId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public ProductFileFolderDescriptionsPK() {
    }

    public ProductFileFolderDescriptionsPK(int folderId, String langCode) {
        this.folderId = folderId;
        this.langCode = langCode;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
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
        hash += (int) folderId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFileFolderDescriptionsPK)) {
            return false;
        }
        ProductFileFolderDescriptionsPK other = (ProductFileFolderDescriptionsPK) object;
        if (this.folderId != other.folderId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFileFolderDescriptionsPK[ folderId=" + folderId + ", langCode=" + langCode + " ]";
    }
    
}
