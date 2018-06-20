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
@Table(name = "bm_grids")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BmGrids.findAll", query = "SELECT b FROM BmGrids b")
    , @NamedQuery(name = "BmGrids.findByGridId", query = "SELECT b FROM BmGrids b WHERE b.gridId = :gridId")
    , @NamedQuery(name = "BmGrids.findByContainerId", query = "SELECT b FROM BmGrids b WHERE b.containerId = :containerId")
    , @NamedQuery(name = "BmGrids.findByParentId", query = "SELECT b FROM BmGrids b WHERE b.parentId = :parentId")
    , @NamedQuery(name = "BmGrids.findByOrder", query = "SELECT b FROM BmGrids b WHERE b.order = :order")
    , @NamedQuery(name = "BmGrids.findByWidth", query = "SELECT b FROM BmGrids b WHERE b.width = :width")
    , @NamedQuery(name = "BmGrids.findByOffset", query = "SELECT b FROM BmGrids b WHERE b.offset = :offset")
    , @NamedQuery(name = "BmGrids.findByUserClass", query = "SELECT b FROM BmGrids b WHERE b.userClass = :userClass")
    , @NamedQuery(name = "BmGrids.findByOmega", query = "SELECT b FROM BmGrids b WHERE b.omega = :omega")
    , @NamedQuery(name = "BmGrids.findByAlpha", query = "SELECT b FROM BmGrids b WHERE b.alpha = :alpha")
    , @NamedQuery(name = "BmGrids.findByWrapper", query = "SELECT b FROM BmGrids b WHERE b.wrapper = :wrapper")
    , @NamedQuery(name = "BmGrids.findByContentAlign", query = "SELECT b FROM BmGrids b WHERE b.contentAlign = :contentAlign")
    , @NamedQuery(name = "BmGrids.findByHtmlElement", query = "SELECT b FROM BmGrids b WHERE b.htmlElement = :htmlElement")
    , @NamedQuery(name = "BmGrids.findByClear", query = "SELECT b FROM BmGrids b WHERE b.clear = :clear")
    , @NamedQuery(name = "BmGrids.findByStatus", query = "SELECT b FROM BmGrids b WHERE b.status = :status")})
public class BmGrids implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "grid_id")
    private Integer gridId;
    @Basic(optional = false)
    @Column(name = "container_id")
    private int containerId;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "order")
    private int order;
    @Basic(optional = false)
    @Column(name = "width")
    private short width;
    @Basic(optional = false)
    @Column(name = "offset")
    private short offset;
    @Basic(optional = false)
    @Column(name = "user_class")
    private String userClass;
    @Basic(optional = false)
    @Column(name = "omega")
    private boolean omega;
    @Basic(optional = false)
    @Column(name = "alpha")
    private boolean alpha;
    @Basic(optional = false)
    @Column(name = "wrapper")
    private String wrapper;
    @Basic(optional = false)
    @Column(name = "content_align")
    private String contentAlign;
    @Basic(optional = false)
    @Column(name = "html_element")
    private String htmlElement;
    @Basic(optional = false)
    @Column(name = "clear")
    private boolean clear;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public BmGrids() {
    }

    public BmGrids(Integer gridId) {
        this.gridId = gridId;
    }

    public BmGrids(Integer gridId, int containerId, int parentId, int order, short width, short offset, String userClass, boolean omega, boolean alpha, String wrapper, String contentAlign, String htmlElement, boolean clear, String status) {
        this.gridId = gridId;
        this.containerId = containerId;
        this.parentId = parentId;
        this.order = order;
        this.width = width;
        this.offset = offset;
        this.userClass = userClass;
        this.omega = omega;
        this.alpha = alpha;
        this.wrapper = wrapper;
        this.contentAlign = contentAlign;
        this.htmlElement = htmlElement;
        this.clear = clear;
        this.status = status;
    }

    public Integer getGridId() {
        return gridId;
    }

    public void setGridId(Integer gridId) {
        this.gridId = gridId;
    }

    public int getContainerId() {
        return containerId;
    }

    public void setContainerId(int containerId) {
        this.containerId = containerId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public short getOffset() {
        return offset;
    }

    public void setOffset(short offset) {
        this.offset = offset;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public boolean getOmega() {
        return omega;
    }

    public void setOmega(boolean omega) {
        this.omega = omega;
    }

    public boolean getAlpha() {
        return alpha;
    }

    public void setAlpha(boolean alpha) {
        this.alpha = alpha;
    }

    public String getWrapper() {
        return wrapper;
    }

    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    public String getContentAlign() {
        return contentAlign;
    }

    public void setContentAlign(String contentAlign) {
        this.contentAlign = contentAlign;
    }

    public String getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(String htmlElement) {
        this.htmlElement = htmlElement;
    }

    public boolean getClear() {
        return clear;
    }

    public void setClear(boolean clear) {
        this.clear = clear;
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
        hash += (gridId != null ? gridId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmGrids)) {
            return false;
        }
        BmGrids other = (BmGrids) object;
        if ((this.gridId == null && other.gridId != null) || (this.gridId != null && !this.gridId.equals(other.gridId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BmGrids[ gridId=" + gridId + " ]";
    }
    
}
