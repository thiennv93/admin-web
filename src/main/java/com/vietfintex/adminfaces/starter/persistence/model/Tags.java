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
@Table(name = "tags")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tags.findAll", query = "SELECT t FROM Tags t")
    , @NamedQuery(name = "Tags.findByTagId", query = "SELECT t FROM Tags t WHERE t.tagId = :tagId")
    , @NamedQuery(name = "Tags.findByCompanyId", query = "SELECT t FROM Tags t WHERE t.companyId = :companyId")
    , @NamedQuery(name = "Tags.findByTag", query = "SELECT t FROM Tags t WHERE t.tag = :tag")
    , @NamedQuery(name = "Tags.findByTimestamp", query = "SELECT t FROM Tags t WHERE t.timestamp = :timestamp")
    , @NamedQuery(name = "Tags.findByStatus", query = "SELECT t FROM Tags t WHERE t.status = :status")})
public class Tags implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tag_id")
    private Integer tagId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "tag")
    private String tag;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public Tags() {
    }

    public Tags(Integer tagId) {
        this.tagId = tagId;
    }

    public Tags(Integer tagId, int companyId, String tag, int timestamp, Character status) {
        this.tagId = tagId;
        this.companyId = companyId;
        this.tag = tag;
        this.timestamp = timestamp;
        this.status = status;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tagId != null ? tagId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tags)) {
            return false;
        }
        Tags other = (Tags) object;
        if ((this.tagId == null && other.tagId != null) || (this.tagId != null && !this.tagId.equals(other.tagId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tags[ tagId=" + tagId + " ]";
    }
    
}
