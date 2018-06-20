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
@Table(name = "company_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyDescriptions.findAll", query = "SELECT c FROM CompanyDescriptions c")
    , @NamedQuery(name = "CompanyDescriptions.findByCompanyId", query = "SELECT c FROM CompanyDescriptions c WHERE c.companyDescriptionsPK.companyId = :companyId")
    , @NamedQuery(name = "CompanyDescriptions.findByLangCode", query = "SELECT c FROM CompanyDescriptions c WHERE c.companyDescriptionsPK.langCode = :langCode")})
public class CompanyDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompanyDescriptionsPK companyDescriptionsPK;
    @Lob
    @Column(name = "company_description")
    private String companyDescription;
    @Lob
    @Column(name = "terms")
    private String terms;

    public CompanyDescriptions() {
    }

    public CompanyDescriptions(CompanyDescriptionsPK companyDescriptionsPK) {
        this.companyDescriptionsPK = companyDescriptionsPK;
    }

    public CompanyDescriptions(int companyId, String langCode) {
        this.companyDescriptionsPK = new CompanyDescriptionsPK(companyId, langCode);
    }

    public CompanyDescriptionsPK getCompanyDescriptionsPK() {
        return companyDescriptionsPK;
    }

    public void setCompanyDescriptionsPK(CompanyDescriptionsPK companyDescriptionsPK) {
        this.companyDescriptionsPK = companyDescriptionsPK;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyDescriptionsPK != null ? companyDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyDescriptions)) {
            return false;
        }
        CompanyDescriptions other = (CompanyDescriptions) object;
        if ((this.companyDescriptionsPK == null && other.companyDescriptionsPK != null) || (this.companyDescriptionsPK != null && !this.companyDescriptionsPK.equals(other.companyDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CompanyDescriptions[ companyDescriptionsPK=" + companyDescriptionsPK + " ]";
    }
    
}
