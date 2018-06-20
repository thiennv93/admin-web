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
@Table(name = "form_options")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormOptions.findAll", query = "SELECT f FROM FormOptions f")
    , @NamedQuery(name = "FormOptions.findByElementId", query = "SELECT f FROM FormOptions f WHERE f.elementId = :elementId")
    , @NamedQuery(name = "FormOptions.findByPageId", query = "SELECT f FROM FormOptions f WHERE f.pageId = :pageId")
    , @NamedQuery(name = "FormOptions.findByParentId", query = "SELECT f FROM FormOptions f WHERE f.parentId = :parentId")
    , @NamedQuery(name = "FormOptions.findByElementType", query = "SELECT f FROM FormOptions f WHERE f.elementType = :elementType")
    , @NamedQuery(name = "FormOptions.findByValue", query = "SELECT f FROM FormOptions f WHERE f.value = :value")
    , @NamedQuery(name = "FormOptions.findByPosition", query = "SELECT f FROM FormOptions f WHERE f.position = :position")
    , @NamedQuery(name = "FormOptions.findByRequired", query = "SELECT f FROM FormOptions f WHERE f.required = :required")
    , @NamedQuery(name = "FormOptions.findByStatus", query = "SELECT f FROM FormOptions f WHERE f.status = :status")})
public class FormOptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "element_id")
    private Integer elementId;
    @Basic(optional = false)
    @Column(name = "page_id")
    private int pageId;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "element_type")
    private Character elementType;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "required")
    private Character required;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public FormOptions() {
    }

    public FormOptions(Integer elementId) {
        this.elementId = elementId;
    }

    public FormOptions(Integer elementId, int pageId, int parentId, Character elementType, String value, short position, Character required, Character status) {
        this.elementId = elementId;
        this.pageId = pageId;
        this.parentId = parentId;
        this.elementType = elementType;
        this.value = value;
        this.position = position;
        this.required = required;
        this.status = status;
    }

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Character getElementType() {
        return elementType;
    }

    public void setElementType(Character elementType) {
        this.elementType = elementType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (elementId != null ? elementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormOptions)) {
            return false;
        }
        FormOptions other = (FormOptions) object;
        if ((this.elementId == null && other.elementId != null) || (this.elementId != null && !this.elementId.equals(other.elementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FormOptions[ elementId=" + elementId + " ]";
    }
    
}
