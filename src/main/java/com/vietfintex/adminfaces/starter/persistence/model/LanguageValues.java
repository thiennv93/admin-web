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
@Table(name = "language_values")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LanguageValues.findAll", query = "SELECT l FROM LanguageValues l")
    , @NamedQuery(name = "LanguageValues.findByLangCode", query = "SELECT l FROM LanguageValues l WHERE l.languageValuesPK.langCode = :langCode")
    , @NamedQuery(name = "LanguageValues.findByName", query = "SELECT l FROM LanguageValues l WHERE l.languageValuesPK.name = :name")})
public class LanguageValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LanguageValuesPK languageValuesPK;
    @Basic(optional = false)
    @Lob
    @Column(name = "value")
    private String value;

    public LanguageValues() {
    }

    public LanguageValues(LanguageValuesPK languageValuesPK) {
        this.languageValuesPK = languageValuesPK;
    }

    public LanguageValues(LanguageValuesPK languageValuesPK, String value) {
        this.languageValuesPK = languageValuesPK;
        this.value = value;
    }

    public LanguageValues(String langCode, String name) {
        this.languageValuesPK = new LanguageValuesPK(langCode, name);
    }

    public LanguageValuesPK getLanguageValuesPK() {
        return languageValuesPK;
    }

    public void setLanguageValuesPK(LanguageValuesPK languageValuesPK) {
        this.languageValuesPK = languageValuesPK;
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
        hash += (languageValuesPK != null ? languageValuesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LanguageValues)) {
            return false;
        }
        LanguageValues other = (LanguageValues) object;
        if ((this.languageValuesPK == null && other.languageValuesPK != null) || (this.languageValuesPK != null && !this.languageValuesPK.equals(other.languageValuesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LanguageValues[ languageValuesPK=" + languageValuesPK + " ]";
    }
    
}
