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
@Table(name = "sales_reports_table_element_conditions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesReportsTableElementConditions.findAll", query = "SELECT s FROM SalesReportsTableElementConditions s")
    , @NamedQuery(name = "SalesReportsTableElementConditions.findByTableId", query = "SELECT s FROM SalesReportsTableElementConditions s WHERE s.salesReportsTableElementConditionsPK.tableId = :tableId")
    , @NamedQuery(name = "SalesReportsTableElementConditions.findByElementHash", query = "SELECT s FROM SalesReportsTableElementConditions s WHERE s.salesReportsTableElementConditionsPK.elementHash = :elementHash")
    , @NamedQuery(name = "SalesReportsTableElementConditions.findByElementCode", query = "SELECT s FROM SalesReportsTableElementConditions s WHERE s.elementCode = :elementCode")
    , @NamedQuery(name = "SalesReportsTableElementConditions.findByIds", query = "SELECT s FROM SalesReportsTableElementConditions s WHERE s.salesReportsTableElementConditionsPK.ids = :ids")})
public class SalesReportsTableElementConditions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesReportsTableElementConditionsPK salesReportsTableElementConditionsPK;
    @Basic(optional = false)
    @Column(name = "element_code")
    private String elementCode;

    public SalesReportsTableElementConditions() {
    }

    public SalesReportsTableElementConditions(SalesReportsTableElementConditionsPK salesReportsTableElementConditionsPK) {
        this.salesReportsTableElementConditionsPK = salesReportsTableElementConditionsPK;
    }

    public SalesReportsTableElementConditions(SalesReportsTableElementConditionsPK salesReportsTableElementConditionsPK, String elementCode) {
        this.salesReportsTableElementConditionsPK = salesReportsTableElementConditionsPK;
        this.elementCode = elementCode;
    }

    public SalesReportsTableElementConditions(int tableId, String elementHash, String ids) {
        this.salesReportsTableElementConditionsPK = new SalesReportsTableElementConditionsPK(tableId, elementHash, ids);
    }

    public SalesReportsTableElementConditionsPK getSalesReportsTableElementConditionsPK() {
        return salesReportsTableElementConditionsPK;
    }

    public void setSalesReportsTableElementConditionsPK(SalesReportsTableElementConditionsPK salesReportsTableElementConditionsPK) {
        this.salesReportsTableElementConditionsPK = salesReportsTableElementConditionsPK;
    }

    public String getElementCode() {
        return elementCode;
    }

    public void setElementCode(String elementCode) {
        this.elementCode = elementCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesReportsTableElementConditionsPK != null ? salesReportsTableElementConditionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsTableElementConditions)) {
            return false;
        }
        SalesReportsTableElementConditions other = (SalesReportsTableElementConditions) object;
        if ((this.salesReportsTableElementConditionsPK == null && other.salesReportsTableElementConditionsPK != null) || (this.salesReportsTableElementConditionsPK != null && !this.salesReportsTableElementConditionsPK.equals(other.salesReportsTableElementConditionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsTableElementConditions[ salesReportsTableElementConditionsPK=" + salesReportsTableElementConditionsPK + " ]";
    }
    
}
