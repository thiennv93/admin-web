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
public class SeoNamesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "dispatch")
    private String dispatch;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public SeoNamesPK() {
    }

    public SeoNamesPK(int objectId, int companyId, Character type, String dispatch, String langCode) {
        this.objectId = objectId;
        this.companyId = companyId;
        this.type = type;
        this.dispatch = dispatch;
        this.langCode = langCode;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getDispatch() {
        return dispatch;
    }

    public void setDispatch(String dispatch) {
        this.dispatch = dispatch;
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
        hash += (int) objectId;
        hash += (int) companyId;
        hash += (type != null ? type.hashCode() : 0);
        hash += (dispatch != null ? dispatch.hashCode() : 0);
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeoNamesPK)) {
            return false;
        }
        SeoNamesPK other = (SeoNamesPK) object;
        if (this.objectId != other.objectId) {
            return false;
        }
        if (this.companyId != other.companyId) {
            return false;
        }
        if ((this.type == null && other.type != null) || (this.type != null && !this.type.equals(other.type))) {
            return false;
        }
        if ((this.dispatch == null && other.dispatch != null) || (this.dispatch != null && !this.dispatch.equals(other.dispatch))) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SeoNamesPK[ objectId=" + objectId + ", companyId=" + companyId + ", type=" + type + ", dispatch=" + dispatch + ", langCode=" + langCode + " ]";
    }
    
}
