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
@Table(name = "destination_elements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DestinationElements.findAll", query = "SELECT d FROM DestinationElements d")
    , @NamedQuery(name = "DestinationElements.findByElementId", query = "SELECT d FROM DestinationElements d WHERE d.elementId = :elementId")
    , @NamedQuery(name = "DestinationElements.findByDestinationId", query = "SELECT d FROM DestinationElements d WHERE d.destinationId = :destinationId")
    , @NamedQuery(name = "DestinationElements.findByElement", query = "SELECT d FROM DestinationElements d WHERE d.element = :element")
    , @NamedQuery(name = "DestinationElements.findByElementType", query = "SELECT d FROM DestinationElements d WHERE d.elementType = :elementType")})
public class DestinationElements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "element_id")
    private Integer elementId;
    @Basic(optional = false)
    @Column(name = "destination_id")
    private int destinationId;
    @Basic(optional = false)
    @Column(name = "element")
    private String element;
    @Basic(optional = false)
    @Column(name = "element_type")
    private Character elementType;

    public DestinationElements() {
    }

    public DestinationElements(Integer elementId) {
        this.elementId = elementId;
    }

    public DestinationElements(Integer elementId, int destinationId, String element, Character elementType) {
        this.elementId = elementId;
        this.destinationId = destinationId;
        this.element = element;
        this.elementType = elementType;
    }

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (elementId != null ? elementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DestinationElements)) {
            return false;
        }
        DestinationElements other = (DestinationElements) object;
        if ((this.elementId == null && other.elementId != null) || (this.elementId != null && !this.elementId.equals(other.elementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DestinationElements[ elementId=" + elementId + " ]";
    }
    
}
