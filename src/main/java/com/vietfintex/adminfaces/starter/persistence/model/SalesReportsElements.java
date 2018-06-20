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
@Table(name = "sales_reports_elements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesReportsElements.findAll", query = "SELECT s FROM SalesReportsElements s")
    , @NamedQuery(name = "SalesReportsElements.findByElementId", query = "SELECT s FROM SalesReportsElements s WHERE s.elementId = :elementId")
    , @NamedQuery(name = "SalesReportsElements.findByCode", query = "SELECT s FROM SalesReportsElements s WHERE s.code = :code")
    , @NamedQuery(name = "SalesReportsElements.findByType", query = "SELECT s FROM SalesReportsElements s WHERE s.type = :type")
    , @NamedQuery(name = "SalesReportsElements.findByDependOnIt", query = "SELECT s FROM SalesReportsElements s WHERE s.dependOnIt = :dependOnIt")})
public class SalesReportsElements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "element_id")
    private Integer elementId;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "depend_on_it")
    private Character dependOnIt;

    public SalesReportsElements() {
    }

    public SalesReportsElements(Integer elementId) {
        this.elementId = elementId;
    }

    public SalesReportsElements(Integer elementId, String code, Character type, Character dependOnIt) {
        this.elementId = elementId;
        this.code = code;
        this.type = type;
        this.dependOnIt = dependOnIt;
    }

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public Character getDependOnIt() {
        return dependOnIt;
    }

    public void setDependOnIt(Character dependOnIt) {
        this.dependOnIt = dependOnIt;
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
        if (!(object instanceof SalesReportsElements)) {
            return false;
        }
        SalesReportsElements other = (SalesReportsElements) object;
        if ((this.elementId == null && other.elementId != null) || (this.elementId != null && !this.elementId.equals(other.elementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsElements[ elementId=" + elementId + " ]";
    }
    
}
