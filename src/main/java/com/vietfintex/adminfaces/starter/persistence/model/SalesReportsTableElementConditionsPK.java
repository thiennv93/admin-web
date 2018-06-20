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
public class SalesReportsTableElementConditionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "table_id")
    private int tableId;
    @Basic(optional = false)
    @Column(name = "element_hash")
    private String elementHash;
    @Basic(optional = false)
    @Column(name = "ids")
    private String ids;

    public SalesReportsTableElementConditionsPK() {
    }

    public SalesReportsTableElementConditionsPK(int tableId, String elementHash, String ids) {
        this.tableId = tableId;
        this.elementHash = elementHash;
        this.ids = ids;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getElementHash() {
        return elementHash;
    }

    public void setElementHash(String elementHash) {
        this.elementHash = elementHash;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tableId;
        hash += (elementHash != null ? elementHash.hashCode() : 0);
        hash += (ids != null ? ids.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsTableElementConditionsPK)) {
            return false;
        }
        SalesReportsTableElementConditionsPK other = (SalesReportsTableElementConditionsPK) object;
        if (this.tableId != other.tableId) {
            return false;
        }
        if ((this.elementHash == null && other.elementHash != null) || (this.elementHash != null && !this.elementHash.equals(other.elementHash))) {
            return false;
        }
        if ((this.ids == null && other.ids != null) || (this.ids != null && !this.ids.equals(other.ids))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsTableElementConditionsPK[ tableId=" + tableId + ", elementHash=" + elementHash + ", ids=" + ids + " ]";
    }
    
}
