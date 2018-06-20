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
public class BmBlocksDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "block_id")
    private int blockId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public BmBlocksDescriptionsPK() {
    }

    public BmBlocksDescriptionsPK(int blockId, String langCode) {
        this.blockId = blockId;
        this.langCode = langCode;
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
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
        hash += (int) blockId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmBlocksDescriptionsPK)) {
            return false;
        }
        BmBlocksDescriptionsPK other = (BmBlocksDescriptionsPK) object;
        if (this.blockId != other.blockId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BmBlocksDescriptionsPK[ blockId=" + blockId + ", langCode=" + langCode + " ]";
    }
    
}
