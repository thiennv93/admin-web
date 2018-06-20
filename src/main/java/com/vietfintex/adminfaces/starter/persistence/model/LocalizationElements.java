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
@Table(name = "localization_elements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LocalizationElements.findAll", query = "SELECT l FROM LocalizationElements l")
    , @NamedQuery(name = "LocalizationElements.findByElementId", query = "SELECT l FROM LocalizationElements l WHERE l.elementId = :elementId")
    , @NamedQuery(name = "LocalizationElements.findByLocalizationId", query = "SELECT l FROM LocalizationElements l WHERE l.localizationId = :localizationId")
    , @NamedQuery(name = "LocalizationElements.findByElement", query = "SELECT l FROM LocalizationElements l WHERE l.element = :element")
    , @NamedQuery(name = "LocalizationElements.findByElementType", query = "SELECT l FROM LocalizationElements l WHERE l.elementType = :elementType")
    , @NamedQuery(name = "LocalizationElements.findByPosition", query = "SELECT l FROM LocalizationElements l WHERE l.position = :position")})
public class LocalizationElements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "element_id")
    private Integer elementId;
    @Basic(optional = false)
    @Column(name = "localization_id")
    private int localizationId;
    @Basic(optional = false)
    @Column(name = "element")
    private String element;
    @Basic(optional = false)
    @Column(name = "element_type")
    private Character elementType;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;

    public LocalizationElements() {
    }

    public LocalizationElements(Integer elementId) {
        this.elementId = elementId;
    }

    public LocalizationElements(Integer elementId, int localizationId, String element, Character elementType, short position) {
        this.elementId = elementId;
        this.localizationId = localizationId;
        this.element = element;
        this.elementType = elementType;
        this.position = position;
    }

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public int getLocalizationId() {
        return localizationId;
    }

    public void setLocalizationId(int localizationId) {
        this.localizationId = localizationId;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Character getElementType() {
        return elementType;
    }

    public void setElementType(Character elementType) {
        this.elementType = elementType;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
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
        if (!(object instanceof LocalizationElements)) {
            return false;
        }
        LocalizationElements other = (LocalizationElements) object;
        if ((this.elementId == null && other.elementId != null) || (this.elementId != null && !this.elementId.equals(other.elementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LocalizationElements[ elementId=" + elementId + " ]";
    }
    
}
