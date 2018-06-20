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
@Table(name = "status_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusData.findAll", query = "SELECT s FROM StatusData s")
    , @NamedQuery(name = "StatusData.findByStatusId", query = "SELECT s FROM StatusData s WHERE s.statusDataPK.statusId = :statusId")
    , @NamedQuery(name = "StatusData.findByParam", query = "SELECT s FROM StatusData s WHERE s.statusDataPK.param = :param")
    , @NamedQuery(name = "StatusData.findByValue", query = "SELECT s FROM StatusData s WHERE s.value = :value")})
public class StatusData implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StatusDataPK statusDataPK;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;

    public StatusData() {
    }

    public StatusData(StatusDataPK statusDataPK) {
        this.statusDataPK = statusDataPK;
    }

    public StatusData(StatusDataPK statusDataPK, String value) {
        this.statusDataPK = statusDataPK;
        this.value = value;
    }

    public StatusData(int statusId, String param) {
        this.statusDataPK = new StatusDataPK(statusId, param);
    }

    public StatusDataPK getStatusDataPK() {
        return statusDataPK;
    }

    public void setStatusDataPK(StatusDataPK statusDataPK) {
        this.statusDataPK = statusDataPK;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusDataPK != null ? statusDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusData)) {
            return false;
        }
        StatusData other = (StatusData) object;
        if ((this.statusDataPK == null && other.statusDataPK != null) || (this.statusDataPK != null && !this.statusDataPK.equals(other.statusDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StatusData[ statusDataPK=" + statusDataPK + " ]";
    }
    
}
