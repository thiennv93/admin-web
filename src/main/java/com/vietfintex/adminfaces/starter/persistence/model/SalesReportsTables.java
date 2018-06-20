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
@Table(name = "sales_reports_tables")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesReportsTables.findAll", query = "SELECT s FROM SalesReportsTables s")
    , @NamedQuery(name = "SalesReportsTables.findByTableId", query = "SELECT s FROM SalesReportsTables s WHERE s.tableId = :tableId")
    , @NamedQuery(name = "SalesReportsTables.findByReportId", query = "SELECT s FROM SalesReportsTables s WHERE s.reportId = :reportId")
    , @NamedQuery(name = "SalesReportsTables.findByPosition", query = "SELECT s FROM SalesReportsTables s WHERE s.position = :position")
    , @NamedQuery(name = "SalesReportsTables.findByType", query = "SELECT s FROM SalesReportsTables s WHERE s.type = :type")
    , @NamedQuery(name = "SalesReportsTables.findByDisplay", query = "SELECT s FROM SalesReportsTables s WHERE s.display = :display")
    , @NamedQuery(name = "SalesReportsTables.findByIntervalId", query = "SELECT s FROM SalesReportsTables s WHERE s.intervalId = :intervalId")
    , @NamedQuery(name = "SalesReportsTables.findByAuto", query = "SELECT s FROM SalesReportsTables s WHERE s.auto = :auto")})
public class SalesReportsTables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "table_id")
    private Integer tableId;
    @Basic(optional = false)
    @Column(name = "report_id")
    private int reportId;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "display")
    private String display;
    @Basic(optional = false)
    @Column(name = "interval_id")
    private int intervalId;
    @Basic(optional = false)
    @Column(name = "auto")
    private Character auto;

    public SalesReportsTables() {
    }

    public SalesReportsTables(Integer tableId) {
        this.tableId = tableId;
    }

    public SalesReportsTables(Integer tableId, int reportId, short position, Character type, String display, int intervalId, Character auto) {
        this.tableId = tableId;
        this.reportId = reportId;
        this.position = position;
        this.type = type;
        this.display = display;
        this.intervalId = intervalId;
        this.auto = auto;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getIntervalId() {
        return intervalId;
    }

    public void setIntervalId(int intervalId) {
        this.intervalId = intervalId;
    }

    public Character getAuto() {
        return auto;
    }

    public void setAuto(Character auto) {
        this.auto = auto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tableId != null ? tableId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsTables)) {
            return false;
        }
        SalesReportsTables other = (SalesReportsTables) object;
        if ((this.tableId == null && other.tableId != null) || (this.tableId != null && !this.tableId.equals(other.tableId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsTables[ tableId=" + tableId + " ]";
    }
    
}
