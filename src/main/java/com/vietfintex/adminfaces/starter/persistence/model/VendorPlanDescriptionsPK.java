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
public class VendorPlanDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "plan_id")
    private int planId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public VendorPlanDescriptionsPK() {
    }

    public VendorPlanDescriptionsPK(int planId, String langCode) {
        this.planId = planId;
        this.langCode = langCode;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
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
        hash += (int) planId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorPlanDescriptionsPK)) {
            return false;
        }
        VendorPlanDescriptionsPK other = (VendorPlanDescriptionsPK) object;
        if (this.planId != other.planId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VendorPlanDescriptionsPK[ planId=" + planId + ", langCode=" + langCode + " ]";
    }
    
}
