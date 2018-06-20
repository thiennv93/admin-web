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
public class BmBlocksContentPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "snapping_id")
    private int snappingId;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "object_type")
    private String objectType;
    @Basic(optional = false)
    @Column(name = "block_id")
    private int blockId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public BmBlocksContentPK() {
    }

    public BmBlocksContentPK(int snappingId, int objectId, String objectType, int blockId, String langCode) {
        this.snappingId = snappingId;
        this.objectId = objectId;
        this.objectType = objectType;
        this.blockId = blockId;
        this.langCode = langCode;
    }

    public int getSnappingId() {
        return snappingId;
    }

    public void setSnappingId(int snappingId) {
        this.snappingId = snappingId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
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
        hash += (int) snappingId;
        hash += (int) objectId;
        hash += (objectType != null ? objectType.hashCode() : 0);
        hash += (int) blockId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmBlocksContentPK)) {
            return false;
        }
        BmBlocksContentPK other = (BmBlocksContentPK) object;
        if (this.snappingId != other.snappingId) {
            return false;
        }
        if (this.objectId != other.objectId) {
            return false;
        }
        if ((this.objectType == null && other.objectType != null) || (this.objectType != null && !this.objectType.equals(other.objectType))) {
            return false;
        }
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
        return "BmBlocksContentPK[ snappingId=" + snappingId + ", objectId=" + objectId + ", objectType=" + objectType + ", blockId=" + blockId + ", langCode=" + langCode + " ]";
    }
    
}
