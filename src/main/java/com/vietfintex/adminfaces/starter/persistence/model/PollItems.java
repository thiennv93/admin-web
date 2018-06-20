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
@Table(name = "poll_items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PollItems.findAll", query = "SELECT p FROM PollItems p")
    , @NamedQuery(name = "PollItems.findByItemId", query = "SELECT p FROM PollItems p WHERE p.itemId = :itemId")
    , @NamedQuery(name = "PollItems.findByParentId", query = "SELECT p FROM PollItems p WHERE p.parentId = :parentId")
    , @NamedQuery(name = "PollItems.findByType", query = "SELECT p FROM PollItems p WHERE p.type = :type")
    , @NamedQuery(name = "PollItems.findByPosition", query = "SELECT p FROM PollItems p WHERE p.position = :position")
    , @NamedQuery(name = "PollItems.findByRequired", query = "SELECT p FROM PollItems p WHERE p.required = :required")
    , @NamedQuery(name = "PollItems.findByPageId", query = "SELECT p FROM PollItems p WHERE p.pageId = :pageId")})
public class PollItems implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_id")
    private Integer itemId;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "required")
    private Character required;
    @Basic(optional = false)
    @Column(name = "page_id")
    private int pageId;

    public PollItems() {
    }

    public PollItems(Integer itemId) {
        this.itemId = itemId;
    }

    public PollItems(Integer itemId, int parentId, Character type, short position, Character required, int pageId) {
        this.itemId = itemId;
        this.parentId = parentId;
        this.type = type;
        this.position = position;
        this.required = required;
        this.pageId = pageId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Character getRequired() {
        return required;
    }

    public void setRequired(Character required) {
        this.required = required;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PollItems)) {
            return false;
        }
        PollItems other = (PollItems) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PollItems[ itemId=" + itemId + " ]";
    }
    
}
