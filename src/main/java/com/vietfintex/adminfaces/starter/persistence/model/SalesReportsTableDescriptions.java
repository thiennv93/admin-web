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
@Table(name = "sales_reports_table_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesReportsTableDescriptions.findAll", query = "SELECT s FROM SalesReportsTableDescriptions s")
    , @NamedQuery(name = "SalesReportsTableDescriptions.findByTableId", query = "SELECT s FROM SalesReportsTableDescriptions s WHERE s.salesReportsTableDescriptionsPK.tableId = :tableId")
    , @NamedQuery(name = "SalesReportsTableDescriptions.findByDescription", query = "SELECT s FROM SalesReportsTableDescriptions s WHERE s.description = :description")
    , @NamedQuery(name = "SalesReportsTableDescriptions.findByLangCode", query = "SELECT s FROM SalesReportsTableDescriptions s WHERE s.salesReportsTableDescriptionsPK.langCode = :langCode")})
public class SalesReportsTableDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesReportsTableDescriptionsPK salesReportsTableDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public SalesReportsTableDescriptions() {
    }

    public SalesReportsTableDescriptions(SalesReportsTableDescriptionsPK salesReportsTableDescriptionsPK) {
        this.salesReportsTableDescriptionsPK = salesReportsTableDescriptionsPK;
    }

    public SalesReportsTableDescriptions(SalesReportsTableDescriptionsPK salesReportsTableDescriptionsPK, String description) {
        this.salesReportsTableDescriptionsPK = salesReportsTableDescriptionsPK;
        this.description = description;
    }

    public SalesReportsTableDescriptions(int tableId, String langCode) {
        this.salesReportsTableDescriptionsPK = new SalesReportsTableDescriptionsPK(tableId, langCode);
    }

    public SalesReportsTableDescriptionsPK getSalesReportsTableDescriptionsPK() {
        return salesReportsTableDescriptionsPK;
    }

    public void setSalesReportsTableDescriptionsPK(SalesReportsTableDescriptionsPK salesReportsTableDescriptionsPK) {
        this.salesReportsTableDescriptionsPK = salesReportsTableDescriptionsPK;
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
        hash += (salesReportsTableDescriptionsPK != null ? salesReportsTableDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsTableDescriptions)) {
            return false;
        }
        SalesReportsTableDescriptions other = (SalesReportsTableDescriptions) object;
        if ((this.salesReportsTableDescriptionsPK == null && other.salesReportsTableDescriptionsPK != null) || (this.salesReportsTableDescriptionsPK != null && !this.salesReportsTableDescriptionsPK.equals(other.salesReportsTableDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsTableDescriptions[ salesReportsTableDescriptionsPK=" + salesReportsTableDescriptionsPK + " ]";
    }
    
}
