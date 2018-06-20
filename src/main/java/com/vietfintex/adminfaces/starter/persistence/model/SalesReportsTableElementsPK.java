/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Embeddable
public class SalesReportsTableElementsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "report_id")
    private int reportId;
    @Basic(optional = false)
    @Column(name = "table_id")
    private int tableId;
    @Basic(optional = false)
    @Column(name = "element_hash")
    private int elementHash;

    public SalesReportsTableElementsPK() {
    }

    public SalesReportsTableElementsPK(int reportId, int tableId, int elementHash) {
        this.reportId = reportId;
        this.tableId = tableId;
        this.elementHash = elementHash;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getElementHash() {
        return elementHash;
    }

    public void setElementHash(int elementHash) {
        this.elementHash = elementHash;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) reportId;
        hash += (int) tableId;
        hash += (int) elementHash;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsTableElementsPK)) {
            return false;
        }
        SalesReportsTableElementsPK other = (SalesReportsTableElementsPK) object;
        if (this.reportId != other.reportId) {
            return false;
        }
        if (this.tableId != other.tableId) {
            return false;
        }
        if (this.elementHash != other.elementHash) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsTableElementsPK[ reportId=" + reportId + ", tableId=" + tableId + ", elementHash=" + elementHash + " ]";
    }
    
}
