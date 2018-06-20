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
@Table(name = "rma_property_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RmaPropertyDescriptions.findAll", query = "SELECT r FROM RmaPropertyDescriptions r")
    , @NamedQuery(name = "RmaPropertyDescriptions.findByPropertyId", query = "SELECT r FROM RmaPropertyDescriptions r WHERE r.rmaPropertyDescriptionsPK.propertyId = :propertyId")
    , @NamedQuery(name = "RmaPropertyDescriptions.findByLangCode", query = "SELECT r FROM RmaPropertyDescriptions r WHERE r.rmaPropertyDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "RmaPropertyDescriptions.findByProperty", query = "SELECT r FROM RmaPropertyDescriptions r WHERE r.property = :property")})
public class RmaPropertyDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RmaPropertyDescriptionsPK rmaPropertyDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "property")
    private String property;

    public RmaPropertyDescriptions() {
    }

    public RmaPropertyDescriptions(RmaPropertyDescriptionsPK rmaPropertyDescriptionsPK) {
        this.rmaPropertyDescriptionsPK = rmaPropertyDescriptionsPK;
    }

    public RmaPropertyDescriptions(RmaPropertyDescriptionsPK rmaPropertyDescriptionsPK, String property) {
        this.rmaPropertyDescriptionsPK = rmaPropertyDescriptionsPK;
        this.property = property;
    }

    public RmaPropertyDescriptions(int propertyId, String langCode) {
        this.rmaPropertyDescriptionsPK = new RmaPropertyDescriptionsPK(propertyId, langCode);
    }

    public RmaPropertyDescriptionsPK getRmaPropertyDescriptionsPK() {
        return rmaPropertyDescriptionsPK;
    }

    public void setRmaPropertyDescriptionsPK(RmaPropertyDescriptionsPK rmaPropertyDescriptionsPK) {
        this.rmaPropertyDescriptionsPK = rmaPropertyDescriptionsPK;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rmaPropertyDescriptionsPK != null ? rmaPropertyDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RmaPropertyDescriptions)) {
            return false;
        }
        RmaPropertyDescriptions other = (RmaPropertyDescriptions) object;
        if ((this.rmaPropertyDescriptionsPK == null && other.rmaPropertyDescriptionsPK != null) || (this.rmaPropertyDescriptionsPK != null && !this.rmaPropertyDescriptionsPK.equals(other.rmaPropertyDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RmaPropertyDescriptions[ rmaPropertyDescriptionsPK=" + rmaPropertyDescriptionsPK + " ]";
    }
    
}
