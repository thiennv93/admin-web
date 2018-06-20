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
public class ProductOptionsDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "option_id")
    private int optionId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public ProductOptionsDescriptionsPK() {
    }

    public ProductOptionsDescriptionsPK(int optionId, String langCode) {
        this.optionId = optionId;
        this.langCode = langCode;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
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
        hash += (int) optionId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOptionsDescriptionsPK)) {
            return false;
        }
        ProductOptionsDescriptionsPK other = (ProductOptionsDescriptionsPK) object;
        if (this.optionId != other.optionId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductOptionsDescriptionsPK[ optionId=" + optionId + ", langCode=" + langCode + " ]";
    }
    
}
