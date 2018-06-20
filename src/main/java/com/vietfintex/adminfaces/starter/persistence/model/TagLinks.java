/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "tag_links")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TagLinks.findAll", query = "SELECT t FROM TagLinks t")
    , @NamedQuery(name = "TagLinks.findByTagId", query = "SELECT t FROM TagLinks t WHERE t.tagLinksPK.tagId = :tagId")
    , @NamedQuery(name = "TagLinks.findByObjectType", query = "SELECT t FROM TagLinks t WHERE t.tagLinksPK.objectType = :objectType")
    , @NamedQuery(name = "TagLinks.findByObjectId", query = "SELECT t FROM TagLinks t WHERE t.tagLinksPK.objectId = :objectId")})
public class TagLinks implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TagLinksPK tagLinksPK;

    public TagLinks() {
    }

    public TagLinks(TagLinksPK tagLinksPK) {
        this.tagLinksPK = tagLinksPK;
    }

    public TagLinks(int tagId, Character objectType, int objectId) {
        this.tagLinksPK = new TagLinksPK(tagId, objectType, objectId);
    }

    public TagLinksPK getTagLinksPK() {
        return tagLinksPK;
    }

    public void setTagLinksPK(TagLinksPK tagLinksPK) {
        this.tagLinksPK = tagLinksPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tagLinksPK != null ? tagLinksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TagLinks)) {
            return false;
        }
        TagLinks other = (TagLinks) object;
        if ((this.tagLinksPK == null && other.tagLinksPK != null) || (this.tagLinksPK != null && !this.tagLinksPK.equals(other.tagLinksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TagLinks[ tagLinksPK=" + tagLinksPK + " ]";
    }
    
}
