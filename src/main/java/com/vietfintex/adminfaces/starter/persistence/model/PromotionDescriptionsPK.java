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
public class PromotionDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "promotion_id")
    private int promotionId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public PromotionDescriptionsPK() {
    }

    public PromotionDescriptionsPK(int promotionId, String langCode) {
        this.promotionId = promotionId;
        this.langCode = langCode;
    }

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
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
        hash += (int) promotionId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PromotionDescriptionsPK)) {
            return false;
        }
        PromotionDescriptionsPK other = (PromotionDescriptionsPK) object;
        if (this.promotionId != other.promotionId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PromotionDescriptionsPK[ promotionId=" + promotionId + ", langCode=" + langCode + " ]";
    }
    
}
