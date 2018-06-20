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
public class StateDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "state_id")
    private int stateId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public StateDescriptionsPK() {
    }

    public StateDescriptionsPK(int stateId, String langCode) {
        this.stateId = stateId;
        this.langCode = langCode;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
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
        hash += (int) stateId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StateDescriptionsPK)) {
            return false;
        }
        StateDescriptionsPK other = (StateDescriptionsPK) object;
        if (this.stateId != other.stateId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StateDescriptionsPK[ stateId=" + stateId + ", langCode=" + langCode + " ]";
    }
    
}
