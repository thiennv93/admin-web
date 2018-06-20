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
@Table(name = "static_data_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StaticDataDescriptions.findAll", query = "SELECT s FROM StaticDataDescriptions s")
    , @NamedQuery(name = "StaticDataDescriptions.findByParamId", query = "SELECT s FROM StaticDataDescriptions s WHERE s.staticDataDescriptionsPK.paramId = :paramId")
    , @NamedQuery(name = "StaticDataDescriptions.findByLangCode", query = "SELECT s FROM StaticDataDescriptions s WHERE s.staticDataDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "StaticDataDescriptions.findByDescr", query = "SELECT s FROM StaticDataDescriptions s WHERE s.descr = :descr")})
public class StaticDataDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StaticDataDescriptionsPK staticDataDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "descr")
    private String descr;

    public StaticDataDescriptions() {
    }

    public StaticDataDescriptions(StaticDataDescriptionsPK staticDataDescriptionsPK) {
        this.staticDataDescriptionsPK = staticDataDescriptionsPK;
    }

    public StaticDataDescriptions(StaticDataDescriptionsPK staticDataDescriptionsPK, String descr) {
        this.staticDataDescriptionsPK = staticDataDescriptionsPK;
        this.descr = descr;
    }

    public StaticDataDescriptions(int paramId, String langCode) {
        this.staticDataDescriptionsPK = new StaticDataDescriptionsPK(paramId, langCode);
    }

    public StaticDataDescriptionsPK getStaticDataDescriptionsPK() {
        return staticDataDescriptionsPK;
    }

    public void setStaticDataDescriptionsPK(StaticDataDescriptionsPK staticDataDescriptionsPK) {
        this.staticDataDescriptionsPK = staticDataDescriptionsPK;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staticDataDescriptionsPK != null ? staticDataDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StaticDataDescriptions)) {
            return false;
        }
        StaticDataDescriptions other = (StaticDataDescriptions) object;
        if ((this.staticDataDescriptionsPK == null && other.staticDataDescriptionsPK != null) || (this.staticDataDescriptionsPK != null && !this.staticDataDescriptionsPK.equals(other.staticDataDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StaticDataDescriptions[ staticDataDescriptionsPK=" + staticDataDescriptionsPK + " ]";
    }
    
}
