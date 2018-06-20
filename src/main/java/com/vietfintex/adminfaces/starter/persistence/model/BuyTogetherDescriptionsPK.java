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
public class BuyTogetherDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "chain_id")
    private int chainId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public BuyTogetherDescriptionsPK() {
    }

    public BuyTogetherDescriptionsPK(int chainId, String langCode) {
        this.chainId = chainId;
        this.langCode = langCode;
    }

    public int getChainId() {
        return chainId;
    }

    public void setChainId(int chainId) {
        this.chainId = chainId;
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
        hash += (int) chainId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BuyTogetherDescriptionsPK)) {
            return false;
        }
        BuyTogetherDescriptionsPK other = (BuyTogetherDescriptionsPK) object;
        if (this.chainId != other.chainId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BuyTogetherDescriptionsPK[ chainId=" + chainId + ", langCode=" + langCode + " ]";
    }
    
}
