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
@Table(name = "bm_snapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BmSnapping.findAll", query = "SELECT b FROM BmSnapping b")
    , @NamedQuery(name = "BmSnapping.findBySnappingId", query = "SELECT b FROM BmSnapping b WHERE b.snappingId = :snappingId")
    , @NamedQuery(name = "BmSnapping.findByBlockId", query = "SELECT b FROM BmSnapping b WHERE b.blockId = :blockId")
    , @NamedQuery(name = "BmSnapping.findByGridId", query = "SELECT b FROM BmSnapping b WHERE b.gridId = :gridId")
    , @NamedQuery(name = "BmSnapping.findByWrapper", query = "SELECT b FROM BmSnapping b WHERE b.wrapper = :wrapper")
    , @NamedQuery(name = "BmSnapping.findByUserClass", query = "SELECT b FROM BmSnapping b WHERE b.userClass = :userClass")
    , @NamedQuery(name = "BmSnapping.findByOrder", query = "SELECT b FROM BmSnapping b WHERE b.order = :order")
    , @NamedQuery(name = "BmSnapping.findByStatus", query = "SELECT b FROM BmSnapping b WHERE b.status = :status")})
public class BmSnapping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "snapping_id")
    private Integer snappingId;
    @Basic(optional = false)
    @Column(name = "block_id")
    private int blockId;
    @Basic(optional = false)
    @Column(name = "grid_id")
    private int gridId;
    @Basic(optional = false)
    @Column(name = "wrapper")
    private String wrapper;
    @Basic(optional = false)
    @Column(name = "user_class")
    private String userClass;
    @Basic(optional = false)
    @Column(name = "order")
    private int order;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public BmSnapping() {
    }

    public BmSnapping(Integer snappingId) {
        this.snappingId = snappingId;
    }

    public BmSnapping(Integer snappingId, int blockId, int gridId, String wrapper, String userClass, int order, String status) {
        this.snappingId = snappingId;
        this.blockId = blockId;
        this.gridId = gridId;
        this.wrapper = wrapper;
        this.userClass = userClass;
        this.order = order;
        this.status = status;
    }

    public Integer getSnappingId() {
        return snappingId;
    }

    public void setSnappingId(Integer snappingId) {
        this.snappingId = snappingId;
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    public int getGridId() {
        return gridId;
    }

    public void setGridId(int gridId) {
        this.gridId = gridId;
    }

    public String getWrapper() {
        return wrapper;
    }

    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (snappingId != null ? snappingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmSnapping)) {
            return false;
        }
        BmSnapping other = (BmSnapping) object;
        if ((this.snappingId == null && other.snappingId != null) || (this.snappingId != null && !this.snappingId.equals(other.snappingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BmSnapping[ snappingId=" + snappingId + " ]";
    }
    
}
