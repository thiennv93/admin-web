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
@Table(name = "country_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CountryDescriptions.findAll", query = "SELECT c FROM CountryDescriptions c")
    , @NamedQuery(name = "CountryDescriptions.findByCode", query = "SELECT c FROM CountryDescriptions c WHERE c.countryDescriptionsPK.code = :code")
    , @NamedQuery(name = "CountryDescriptions.findByLangCode", query = "SELECT c FROM CountryDescriptions c WHERE c.countryDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "CountryDescriptions.findByCountry", query = "SELECT c FROM CountryDescriptions c WHERE c.country = :country")})
public class CountryDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CountryDescriptionsPK countryDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;

    public CountryDescriptions() {
    }

    public CountryDescriptions(CountryDescriptionsPK countryDescriptionsPK) {
        this.countryDescriptionsPK = countryDescriptionsPK;
    }

    public CountryDescriptions(CountryDescriptionsPK countryDescriptionsPK, String country) {
        this.countryDescriptionsPK = countryDescriptionsPK;
        this.country = country;
    }

    public CountryDescriptions(String code, String langCode) {
        this.countryDescriptionsPK = new CountryDescriptionsPK(code, langCode);
    }

    public CountryDescriptionsPK getCountryDescriptionsPK() {
        return countryDescriptionsPK;
    }

    public void setCountryDescriptionsPK(CountryDescriptionsPK countryDescriptionsPK) {
        this.countryDescriptionsPK = countryDescriptionsPK;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryDescriptionsPK != null ? countryDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CountryDescriptions)) {
            return false;
        }
        CountryDescriptions other = (CountryDescriptions) object;
        if ((this.countryDescriptionsPK == null && other.countryDescriptionsPK != null) || (this.countryDescriptionsPK != null && !this.countryDescriptionsPK.equals(other.countryDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CountryDescriptions[ countryDescriptionsPK=" + countryDescriptionsPK + " ]";
    }
    
}
