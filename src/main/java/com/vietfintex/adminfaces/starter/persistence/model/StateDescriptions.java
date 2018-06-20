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
@Table(name = "state_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StateDescriptions.findAll", query = "SELECT s FROM StateDescriptions s")
    , @NamedQuery(name = "StateDescriptions.findByStateId", query = "SELECT s FROM StateDescriptions s WHERE s.stateDescriptionsPK.stateId = :stateId")
    , @NamedQuery(name = "StateDescriptions.findByLangCode", query = "SELECT s FROM StateDescriptions s WHERE s.stateDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "StateDescriptions.findByState", query = "SELECT s FROM StateDescriptions s WHERE s.state = :state")})
public class StateDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StateDescriptionsPK stateDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;

    public StateDescriptions() {
    }

    public StateDescriptions(StateDescriptionsPK stateDescriptionsPK) {
        this.stateDescriptionsPK = stateDescriptionsPK;
    }

    public StateDescriptions(StateDescriptionsPK stateDescriptionsPK, String state) {
        this.stateDescriptionsPK = stateDescriptionsPK;
        this.state = state;
    }

    public StateDescriptions(int stateId, String langCode) {
        this.stateDescriptionsPK = new StateDescriptionsPK(stateId, langCode);
    }

    public StateDescriptionsPK getStateDescriptionsPK() {
        return stateDescriptionsPK;
    }

    public void setStateDescriptionsPK(StateDescriptionsPK stateDescriptionsPK) {
        this.stateDescriptionsPK = stateDescriptionsPK;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stateDescriptionsPK != null ? stateDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StateDescriptions)) {
            return false;
        }
        StateDescriptions other = (StateDescriptions) object;
        if ((this.stateDescriptionsPK == null && other.stateDescriptionsPK != null) || (this.stateDescriptionsPK != null && !this.stateDescriptionsPK.equals(other.stateDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StateDescriptions[ stateDescriptionsPK=" + stateDescriptionsPK + " ]";
    }
    
}
