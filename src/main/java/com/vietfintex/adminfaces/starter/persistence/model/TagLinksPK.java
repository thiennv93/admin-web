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
public class TagLinksPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "tag_id")
    private int tagId;
    @Basic(optional = false)
    @Column(name = "object_type")
    private Character objectType;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;

    public TagLinksPK() {
    }

    public TagLinksPK(int tagId, Character objectType, int objectId) {
        this.tagId = tagId;
        this.objectType = objectType;
        this.objectId = objectId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public Character getObjectType() {
        return objectType;
    }

    public void setObjectType(Character objectType) {
        this.objectType = objectType;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tagId;
        hash += (objectType != null ? objectType.hashCode() : 0);
        hash += (int) objectId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TagLinksPK)) {
            return false;
        }
        TagLinksPK other = (TagLinksPK) object;
        if (this.tagId != other.tagId) {
            return false;
        }
        if ((this.objectType == null && other.objectType != null) || (this.objectType != null && !this.objectType.equals(other.objectType))) {
            return false;
        }
        if (this.objectId != other.objectId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TagLinksPK[ tagId=" + tagId + ", objectType=" + objectType + ", objectId=" + objectId + " ]";
    }
    
}
