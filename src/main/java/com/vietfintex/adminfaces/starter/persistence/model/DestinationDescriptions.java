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
@Table(name = "destination_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DestinationDescriptions.findAll", query = "SELECT d FROM DestinationDescriptions d")
    , @NamedQuery(name = "DestinationDescriptions.findByDestinationId", query = "SELECT d FROM DestinationDescriptions d WHERE d.destinationDescriptionsPK.destinationId = :destinationId")
    , @NamedQuery(name = "DestinationDescriptions.findByLangCode", query = "SELECT d FROM DestinationDescriptions d WHERE d.destinationDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "DestinationDescriptions.findByDestination", query = "SELECT d FROM DestinationDescriptions d WHERE d.destination = :destination")})
public class DestinationDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DestinationDescriptionsPK destinationDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "destination")
    private String destination;

    public DestinationDescriptions() {
    }

    public DestinationDescriptions(DestinationDescriptionsPK destinationDescriptionsPK) {
        this.destinationDescriptionsPK = destinationDescriptionsPK;
    }

    public DestinationDescriptions(DestinationDescriptionsPK destinationDescriptionsPK, String destination) {
        this.destinationDescriptionsPK = destinationDescriptionsPK;
        this.destination = destination;
    }

    public DestinationDescriptions(int destinationId, String langCode) {
        this.destinationDescriptionsPK = new DestinationDescriptionsPK(destinationId, langCode);
    }

    public DestinationDescriptionsPK getDestinationDescriptionsPK() {
        return destinationDescriptionsPK;
    }

    public void setDestinationDescriptionsPK(DestinationDescriptionsPK destinationDescriptionsPK) {
        this.destinationDescriptionsPK = destinationDescriptionsPK;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (destinationDescriptionsPK != null ? destinationDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DestinationDescriptions)) {
            return false;
        }
        DestinationDescriptions other = (DestinationDescriptions) object;
        if ((this.destinationDescriptionsPK == null && other.destinationDescriptionsPK != null) || (this.destinationDescriptionsPK != null && !this.destinationDescriptionsPK.equals(other.destinationDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DestinationDescriptions[ destinationDescriptionsPK=" + destinationDescriptionsPK + " ]";
    }
    
}
