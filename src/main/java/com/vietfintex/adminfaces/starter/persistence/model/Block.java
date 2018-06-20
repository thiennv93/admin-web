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
@Table(name = "bm_blocks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Block.findAll", query = "SELECT b FROM Block b")
    , @NamedQuery(name = "Block.findByBlockId", query = "SELECT b FROM Block b WHERE b.blockId = :blockId")
    , @NamedQuery(name = "Block.findByType", query = "SELECT b FROM Block b WHERE b.type = :type")
    , @NamedQuery(name = "Block.findByCompanyId", query = "SELECT b FROM Block b WHERE b.companyId = :companyId")})
public class Block implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "block_id")
    private Long blockId;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Lob
    @Column(name = "properties")
    private String properties;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;

    public Block() {
    }

    public Block(Long blockId) {
        this.blockId = blockId;
    }

    public Block(Long blockId, String type, int companyId) {
        this.blockId = blockId;
        this.type = type;
        this.companyId = companyId;
    }

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (blockId != null ? blockId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Block)) {
            return false;
        }
        Block other = (Block) object;
        if ((this.blockId == null && other.blockId != null) || (this.blockId != null && !this.blockId.equals(other.blockId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Block[ blockId=" + blockId + " ]";
    }
    
}
