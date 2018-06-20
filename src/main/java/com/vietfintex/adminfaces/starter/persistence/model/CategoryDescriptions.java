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
@Table(name = "category_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoryDescriptions.findAll", query = "SELECT c FROM CategoryDescriptions c")
    , @NamedQuery(name = "CategoryDescriptions.findByCategoryId", query = "SELECT c FROM CategoryDescriptions c WHERE c.categoryDescriptionsPK.categoryId = :categoryId")
    , @NamedQuery(name = "CategoryDescriptions.findByLangCode", query = "SELECT c FROM CategoryDescriptions c WHERE c.categoryDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "CategoryDescriptions.findByCategory", query = "SELECT c FROM CategoryDescriptions c WHERE c.category = :category")
    , @NamedQuery(name = "CategoryDescriptions.findByMetaKeywords", query = "SELECT c FROM CategoryDescriptions c WHERE c.metaKeywords = :metaKeywords")
    , @NamedQuery(name = "CategoryDescriptions.findByMetaDescription", query = "SELECT c FROM CategoryDescriptions c WHERE c.metaDescription = :metaDescription")
    , @NamedQuery(name = "CategoryDescriptions.findByPageTitle", query = "SELECT c FROM CategoryDescriptions c WHERE c.pageTitle = :pageTitle")})
public class CategoryDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CategoryDescriptionsPK categoryDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "category")
    private String category;
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "meta_keywords")
    private String metaKeywords;
    @Basic(optional = false)
    @Column(name = "meta_description")
    private String metaDescription;
    @Basic(optional = false)
    @Column(name = "page_title")
    private String pageTitle;
    @Lob
    @Column(name = "age_warning_message")
    private String ageWarningMessage;

    public CategoryDescriptions() {
    }

    public CategoryDescriptions(CategoryDescriptionsPK categoryDescriptionsPK) {
        this.categoryDescriptionsPK = categoryDescriptionsPK;
    }

    public CategoryDescriptions(CategoryDescriptionsPK categoryDescriptionsPK, String category, String metaKeywords, String metaDescription, String pageTitle) {
        this.categoryDescriptionsPK = categoryDescriptionsPK;
        this.category = category;
        this.metaKeywords = metaKeywords;
        this.metaDescription = metaDescription;
        this.pageTitle = pageTitle;
    }

    public CategoryDescriptions(int categoryId, String langCode) {
        this.categoryDescriptionsPK = new CategoryDescriptionsPK(categoryId, langCode);
    }

    public CategoryDescriptionsPK getCategoryDescriptionsPK() {
        return categoryDescriptionsPK;
    }

    public void setCategoryDescriptionsPK(CategoryDescriptionsPK categoryDescriptionsPK) {
        this.categoryDescriptionsPK = categoryDescriptionsPK;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getAgeWarningMessage() {
        return ageWarningMessage;
    }

    public void setAgeWarningMessage(String ageWarningMessage) {
        this.ageWarningMessage = ageWarningMessage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryDescriptionsPK != null ? categoryDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryDescriptions)) {
            return false;
        }
        CategoryDescriptions other = (CategoryDescriptions) object;
        if ((this.categoryDescriptionsPK == null && other.categoryDescriptionsPK != null) || (this.categoryDescriptionsPK != null && !this.categoryDescriptionsPK.equals(other.categoryDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategoryDescriptions[ categoryDescriptionsPK=" + categoryDescriptionsPK + " ]";
    }
    
}
