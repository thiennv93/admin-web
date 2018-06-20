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
public class AccessRestrictionReasonDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "item_id")
    private int itemId;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public AccessRestrictionReasonDescriptionsPK() {
    }

    public AccessRestrictionReasonDescriptionsPK(int itemId, String type, String langCode) {
        this.itemId = itemId;
        this.type = type;
        this.langCode = langCode;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        hash += (int) itemId;
        hash += (type != null ? type.hashCode() : 0);
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessRestrictionReasonDescriptionsPK)) {
            return false;
        }
        AccessRestrictionReasonDescriptionsPK other = (AccessRestrictionReasonDescriptionsPK) object;
        if (this.itemId != other.itemId) {
            return false;
        }
        if ((this.type == null && other.type != null) || (this.type != null && !this.type.equals(other.type))) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AccessRestrictionReasonDescriptionsPK[ itemId=" + itemId + ", type=" + type + ", langCode=" + langCode + " ]";
    }
    
}
