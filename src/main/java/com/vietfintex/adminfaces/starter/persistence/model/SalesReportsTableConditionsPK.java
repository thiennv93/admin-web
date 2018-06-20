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
public class SalesReportsTableConditionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "table_id")
    private int tableId;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "sub_element_id")
    private String subElementId;

    public SalesReportsTableConditionsPK() {
    }

    public SalesReportsTableConditionsPK(int tableId, String code, String subElementId) {
        this.tableId = tableId;
        this.code = code;
        this.subElementId = subElementId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSubElementId() {
        return subElementId;
    }

    public void setSubElementId(String subElementId) {
        this.subElementId = subElementId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tableId;
        hash += (code != null ? code.hashCode() : 0);
        hash += (subElementId != null ? subElementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsTableConditionsPK)) {
            return false;
        }
        SalesReportsTableConditionsPK other = (SalesReportsTableConditionsPK) object;
        if (this.tableId != other.tableId) {
            return false;
        }
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        if ((this.subElementId == null && other.subElementId != null) || (this.subElementId != null && !this.subElementId.equals(other.subElementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsTableConditionsPK[ tableId=" + tableId + ", code=" + code + ", subElementId=" + subElementId + " ]";
    }
    
}
