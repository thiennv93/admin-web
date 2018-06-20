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
public class ProductFilterDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "filter_id")
    private int filterId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public ProductFilterDescriptionsPK() {
    }

    public ProductFilterDescriptionsPK(int filterId, String langCode) {
        this.filterId = filterId;
        this.langCode = langCode;
    }

    public int getFilterId() {
        return filterId;
    }

    public void setFilterId(int filterId) {
        this.filterId = filterId;
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
        hash += (int) filterId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFilterDescriptionsPK)) {
            return false;
        }
        ProductFilterDescriptionsPK other = (ProductFilterDescriptionsPK) object;
        if (this.filterId != other.filterId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFilterDescriptionsPK[ filterId=" + filterId + ", langCode=" + langCode + " ]";
    }
    
}
