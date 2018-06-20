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
public class UsergroupDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "usergroup_id")
    private int usergroupId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public UsergroupDescriptionsPK() {
    }

    public UsergroupDescriptionsPK(int usergroupId, String langCode) {
        this.usergroupId = usergroupId;
        this.langCode = langCode;
    }

    public int getUsergroupId() {
        return usergroupId;
    }

    public void setUsergroupId(int usergroupId) {
        this.usergroupId = usergroupId;
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
        hash += (int) usergroupId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsergroupDescriptionsPK)) {
            return false;
        }
        UsergroupDescriptionsPK other = (UsergroupDescriptionsPK) object;
        if (this.usergroupId != other.usergroupId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UsergroupDescriptionsPK[ usergroupId=" + usergroupId + ", langCode=" + langCode + " ]";
    }
    
}
