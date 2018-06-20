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
@Table(name = "sales_reports_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesReportsDescriptions.findAll", query = "SELECT s FROM SalesReportsDescriptions s")
    , @NamedQuery(name = "SalesReportsDescriptions.findByReportId", query = "SELECT s FROM SalesReportsDescriptions s WHERE s.salesReportsDescriptionsPK.reportId = :reportId")
    , @NamedQuery(name = "SalesReportsDescriptions.findByDescription", query = "SELECT s FROM SalesReportsDescriptions s WHERE s.description = :description")
    , @NamedQuery(name = "SalesReportsDescriptions.findByLangCode", query = "SELECT s FROM SalesReportsDescriptions s WHERE s.salesReportsDescriptionsPK.langCode = :langCode")})
public class SalesReportsDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesReportsDescriptionsPK salesReportsDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public SalesReportsDescriptions() {
    }

    public SalesReportsDescriptions(SalesReportsDescriptionsPK salesReportsDescriptionsPK) {
        this.salesReportsDescriptionsPK = salesReportsDescriptionsPK;
    }

    public SalesReportsDescriptions(SalesReportsDescriptionsPK salesReportsDescriptionsPK, String description) {
        this.salesReportsDescriptionsPK = salesReportsDescriptionsPK;
        this.description = description;
    }

    public SalesReportsDescriptions(int reportId, String langCode) {
        this.salesReportsDescriptionsPK = new SalesReportsDescriptionsPK(reportId, langCode);
    }

    public SalesReportsDescriptionsPK getSalesReportsDescriptionsPK() {
        return salesReportsDescriptionsPK;
    }

    public void setSalesReportsDescriptionsPK(SalesReportsDescriptionsPK salesReportsDescriptionsPK) {
        this.salesReportsDescriptionsPK = salesReportsDescriptionsPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesReportsDescriptionsPK != null ? salesReportsDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsDescriptions)) {
            return false;
        }
        SalesReportsDescriptions other = (SalesReportsDescriptions) object;
        if ((this.salesReportsDescriptionsPK == null && other.salesReportsDescriptionsPK != null) || (this.salesReportsDescriptionsPK != null && !this.salesReportsDescriptionsPK.equals(other.salesReportsDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsDescriptions[ salesReportsDescriptionsPK=" + salesReportsDescriptionsPK + " ]";
    }
    
}
