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
public class SalesReportsTableDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "table_id")
    private int tableId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public SalesReportsTableDescriptionsPK() {
    }

    public SalesReportsTableDescriptionsPK(int tableId, String langCode) {
        this.tableId = tableId;
        this.langCode = langCode;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tableId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsTableDescriptionsPK)) {
            return false;
        }
        SalesReportsTableDescriptionsPK other = (SalesReportsTableDescriptionsPK) object;
        if (this.tableId != other.tableId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsTableDescriptionsPK[ tableId=" + tableId + ", langCode=" + langCode + " ]";
    }
    
}
