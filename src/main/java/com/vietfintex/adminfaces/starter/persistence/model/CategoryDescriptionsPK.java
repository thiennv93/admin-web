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
public class CategoryDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "category_id")
    private int categoryId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public CategoryDescriptionsPK() {
    }

    public CategoryDescriptionsPK(int categoryId, String langCode) {
        this.categoryId = categoryId;
        this.langCode = langCode;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
        hash += (int) categoryId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryDescriptionsPK)) {
            return false;
        }
        CategoryDescriptionsPK other = (CategoryDescriptionsPK) object;
        if (this.categoryId != other.categoryId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategoryDescriptionsPK[ categoryId=" + categoryId + ", langCode=" + langCode + " ]";
    }
    
}
