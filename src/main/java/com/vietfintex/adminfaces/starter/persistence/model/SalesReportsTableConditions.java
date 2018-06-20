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
@Table(name = "sales_reports_table_conditions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesReportsTableConditions.findAll", query = "SELECT s FROM SalesReportsTableConditions s")
    , @NamedQuery(name = "SalesReportsTableConditions.findByTableId", query = "SELECT s FROM SalesReportsTableConditions s WHERE s.salesReportsTableConditionsPK.tableId = :tableId")
    , @NamedQuery(name = "SalesReportsTableConditions.findByCode", query = "SELECT s FROM SalesReportsTableConditions s WHERE s.salesReportsTableConditionsPK.code = :code")
    , @NamedQuery(name = "SalesReportsTableConditions.findBySubElementId", query = "SELECT s FROM SalesReportsTableConditions s WHERE s.salesReportsTableConditionsPK.subElementId = :subElementId")})
public class SalesReportsTableConditions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesReportsTableConditionsPK salesReportsTableConditionsPK;

    public SalesReportsTableConditions() {
    }

    public SalesReportsTableConditions(SalesReportsTableConditionsPK salesReportsTableConditionsPK) {
        this.salesReportsTableConditionsPK = salesReportsTableConditionsPK;
    }

    public SalesReportsTableConditions(int tableId, String code, String subElementId) {
        this.salesReportsTableConditionsPK = new SalesReportsTableConditionsPK(tableId, code, subElementId);
    }

    public SalesReportsTableConditionsPK getSalesReportsTableConditionsPK() {
        return salesReportsTableConditionsPK;
    }

    public void setSalesReportsTableConditionsPK(SalesReportsTableConditionsPK salesReportsTableConditionsPK) {
        this.salesReportsTableConditionsPK = salesReportsTableConditionsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesReportsTableConditionsPK != null ? salesReportsTableConditionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsTableConditions)) {
            return false;
        }
        SalesReportsTableConditions other = (SalesReportsTableConditions) object;
        if ((this.salesReportsTableConditionsPK == null && other.salesReportsTableConditionsPK != null) || (this.salesReportsTableConditionsPK != null && !this.salesReportsTableConditionsPK.equals(other.salesReportsTableConditionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsTableConditions[ salesReportsTableConditionsPK=" + salesReportsTableConditionsPK + " ]";
    }
    
}
