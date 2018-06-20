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
public class SalesReportsDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "report_id")
    private int reportId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public SalesReportsDescriptionsPK() {
    }

    public SalesReportsDescriptionsPK(int reportId, String langCode) {
        this.reportId = reportId;
        this.langCode = langCode;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
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
        hash += (int) reportId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsDescriptionsPK)) {
            return false;
        }
        SalesReportsDescriptionsPK other = (SalesReportsDescriptionsPK) object;
        if (this.reportId != other.reportId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsDescriptionsPK[ reportId=" + reportId + ", langCode=" + langCode + " ]";
    }
    
}
