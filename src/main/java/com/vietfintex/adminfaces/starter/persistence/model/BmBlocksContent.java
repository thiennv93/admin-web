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
@Table(name = "bm_blocks_content")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BmBlocksContent.findAll", query = "SELECT b FROM BmBlocksContent b")
    , @NamedQuery(name = "BmBlocksContent.findBySnappingId", query = "SELECT b FROM BmBlocksContent b WHERE b.bmBlocksContentPK.snappingId = :snappingId")
    , @NamedQuery(name = "BmBlocksContent.findByObjectId", query = "SELECT b FROM BmBlocksContent b WHERE b.bmBlocksContentPK.objectId = :objectId")
    , @NamedQuery(name = "BmBlocksContent.findByObjectType", query = "SELECT b FROM BmBlocksContent b WHERE b.bmBlocksContentPK.objectType = :objectType")
    , @NamedQuery(name = "BmBlocksContent.findByBlockId", query = "SELECT b FROM BmBlocksContent b WHERE b.bmBlocksContentPK.blockId = :blockId")
    , @NamedQuery(name = "BmBlocksContent.findByLangCode", query = "SELECT b FROM BmBlocksContent b WHERE b.bmBlocksContentPK.langCode = :langCode")})
public class BmBlocksContent implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BmBlocksContentPK bmBlocksContentPK;
    @Basic(optional = false)
    @Lob
    @Column(name = "content")
    private String content;

    public BmBlocksContent() {
    }

    public BmBlocksContent(BmBlocksContentPK bmBlocksContentPK) {
        this.bmBlocksContentPK = bmBlocksContentPK;
    }

    public BmBlocksContent(BmBlocksContentPK bmBlocksContentPK, String content) {
        this.bmBlocksContentPK = bmBlocksContentPK;
        this.content = content;
    }

    public BmBlocksContent(int snappingId, int objectId, String objectType, int blockId, String langCode) {
        this.bmBlocksContentPK = new BmBlocksContentPK(snappingId, objectId, objectType, blockId, langCode);
    }

    public BmBlocksContentPK getBmBlocksContentPK() {
        return bmBlocksContentPK;
    }

    public void setBmBlocksContentPK(BmBlocksContentPK bmBlocksContentPK) {
        this.bmBlocksContentPK = bmBlocksContentPK;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bmBlocksContentPK != null ? bmBlocksContentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmBlocksContent)) {
            return false;
        }
        BmBlocksContent other = (BmBlocksContent) object;
        if ((this.bmBlocksContentPK == null && other.bmBlocksContentPK != null) || (this.bmBlocksContentPK != null && !this.bmBlocksContentPK.equals(other.bmBlocksContentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BmBlocksContent[ bmBlocksContentPK=" + bmBlocksContentPK + " ]";
    }
    
}
