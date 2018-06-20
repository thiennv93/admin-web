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
@Table(name = "bm_blocks_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BmBlocksDescriptions.findAll", query = "SELECT b FROM BmBlocksDescriptions b")
    , @NamedQuery(name = "BmBlocksDescriptions.findByBlockId", query = "SELECT b FROM BmBlocksDescriptions b WHERE b.bmBlocksDescriptionsPK.blockId = :blockId")
    , @NamedQuery(name = "BmBlocksDescriptions.findByLangCode", query = "SELECT b FROM BmBlocksDescriptions b WHERE b.bmBlocksDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "BmBlocksDescriptions.findByName", query = "SELECT b FROM BmBlocksDescriptions b WHERE b.name = :name")})
public class BmBlocksDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BmBlocksDescriptionsPK bmBlocksDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public BmBlocksDescriptions() {
    }

    public BmBlocksDescriptions(BmBlocksDescriptionsPK bmBlocksDescriptionsPK) {
        this.bmBlocksDescriptionsPK = bmBlocksDescriptionsPK;
    }

    public BmBlocksDescriptions(BmBlocksDescriptionsPK bmBlocksDescriptionsPK, String name) {
        this.bmBlocksDescriptionsPK = bmBlocksDescriptionsPK;
        this.name = name;
    }

    public BmBlocksDescriptions(int blockId, String langCode) {
        this.bmBlocksDescriptionsPK = new BmBlocksDescriptionsPK(blockId, langCode);
    }

    public BmBlocksDescriptionsPK getBmBlocksDescriptionsPK() {
        return bmBlocksDescriptionsPK;
    }

    public void setBmBlocksDescriptionsPK(BmBlocksDescriptionsPK bmBlocksDescriptionsPK) {
        this.bmBlocksDescriptionsPK = bmBlocksDescriptionsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bmBlocksDescriptionsPK != null ? bmBlocksDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmBlocksDescriptions)) {
            return false;
        }
        BmBlocksDescriptions other = (BmBlocksDescriptions) object;
        if ((this.bmBlocksDescriptionsPK == null && other.bmBlocksDescriptionsPK != null) || (this.bmBlocksDescriptionsPK != null && !this.bmBlocksDescriptionsPK.equals(other.bmBlocksDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BmBlocksDescriptions[ bmBlocksDescriptionsPK=" + bmBlocksDescriptionsPK + " ]";
    }
    
}
