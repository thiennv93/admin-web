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
public class StaticDataDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "param_id")
    private int paramId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public StaticDataDescriptionsPK() {
    }

    public StaticDataDescriptionsPK(int paramId, String langCode) {
        this.paramId = paramId;
        this.langCode = langCode;
    }

    public int getParamId() {
        return paramId;
    }

    public void setParamId(int paramId) {
        this.paramId = paramId;
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
        hash += (int) paramId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StaticDataDescriptionsPK)) {
            return false;
        }
        StaticDataDescriptionsPK other = (StaticDataDescriptionsPK) object;
        if (this.paramId != other.paramId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StaticDataDescriptionsPK[ paramId=" + paramId + ", langCode=" + langCode + " ]";
    }
    
}
