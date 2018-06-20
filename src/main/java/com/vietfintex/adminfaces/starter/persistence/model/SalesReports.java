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
@Table(name = "sales_reports")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesReports.findAll", query = "SELECT s FROM SalesReports s")
    , @NamedQuery(name = "SalesReports.findByReportId", query = "SELECT s FROM SalesReports s WHERE s.reportId = :reportId")
    , @NamedQuery(name = "SalesReports.findByPosition", query = "SELECT s FROM SalesReports s WHERE s.position = :position")
    , @NamedQuery(name = "SalesReports.findByName", query = "SELECT s FROM SalesReports s WHERE s.name = :name")
    , @NamedQuery(name = "SalesReports.findByStatus", query = "SELECT s FROM SalesReports s WHERE s.status = :status")
    , @NamedQuery(name = "SalesReports.findByType", query = "SELECT s FROM SalesReports s WHERE s.type = :type")
    , @NamedQuery(name = "SalesReports.findByPeriod", query = "SELECT s FROM SalesReports s WHERE s.period = :period")
    , @NamedQuery(name = "SalesReports.findByTimeFrom", query = "SELECT s FROM SalesReports s WHERE s.timeFrom = :timeFrom")
    , @NamedQuery(name = "SalesReports.findByTimeTo", query = "SELECT s FROM SalesReports s WHERE s.timeTo = :timeTo")})
public class SalesReports implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "report_id")
    private Integer reportId;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "period")
    private String period;
    @Basic(optional = false)
    @Column(name = "time_from")
    private int timeFrom;
    @Basic(optional = false)
    @Column(name = "time_to")
    private int timeTo;

    public SalesReports() {
    }

    public SalesReports(Integer reportId) {
        this.reportId = reportId;
    }

    public SalesReports(Integer reportId, short position, String name, Character status, Character type, String period, int timeFrom, int timeTo) {
        this.reportId = reportId;
        this.position = position;
        this.name = name;
        this.status = status;
        this.type = type;
        this.period = period;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(int timeFrom) {
        this.timeFrom = timeFrom;
    }

    public int getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(int timeTo) {
        this.timeTo = timeTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reportId != null ? reportId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReports)) {
            return false;
        }
        SalesReports other = (SalesReports) object;
        if ((this.reportId == null && other.reportId != null) || (this.reportId != null && !this.reportId.equals(other.reportId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReports[ reportId=" + reportId + " ]";
    }
    
}
