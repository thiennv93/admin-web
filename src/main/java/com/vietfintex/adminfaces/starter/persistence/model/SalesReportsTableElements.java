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
@Table(name = "sales_reports_table_elements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesReportsTableElements.findAll", query = "SELECT s FROM SalesReportsTableElements s")
    , @NamedQuery(name = "SalesReportsTableElements.findByReportId", query = "SELECT s FROM SalesReportsTableElements s WHERE s.salesReportsTableElementsPK.reportId = :reportId")
    , @NamedQuery(name = "SalesReportsTableElements.findByTableId", query = "SELECT s FROM SalesReportsTableElements s WHERE s.salesReportsTableElementsPK.tableId = :tableId")
    , @NamedQuery(name = "SalesReportsTableElements.findByElementId", query = "SELECT s FROM SalesReportsTableElements s WHERE s.elementId = :elementId")
    , @NamedQuery(name = "SalesReportsTableElements.findByElementHash", query = "SELECT s FROM SalesReportsTableElements s WHERE s.salesReportsTableElementsPK.elementHash = :elementHash")
    , @NamedQuery(name = "SalesReportsTableElements.findByColor", query = "SELECT s FROM SalesReportsTableElements s WHERE s.color = :color")
    , @NamedQuery(name = "SalesReportsTableElements.findByPosition", query = "SELECT s FROM SalesReportsTableElements s WHERE s.position = :position")
    , @NamedQuery(name = "SalesReportsTableElements.findByStatus", query = "SELECT s FROM SalesReportsTableElements s WHERE s.status = :status")
    , @NamedQuery(name = "SalesReportsTableElements.findByDependence", query = "SELECT s FROM SalesReportsTableElements s WHERE s.dependence = :dependence")
    , @NamedQuery(name = "SalesReportsTableElements.findByLimitAuto", query = "SELECT s FROM SalesReportsTableElements s WHERE s.limitAuto = :limitAuto")})
public class SalesReportsTableElements implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesReportsTableElementsPK salesReportsTableElementsPK;
    @Basic(optional = false)
    @Column(name = "element_id")
    private int elementId;
    @Basic(optional = false)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "dependence")
    private String dependence;
    @Basic(optional = false)
    @Column(name = "limit_auto")
    private int limitAuto;

    public SalesReportsTableElements() {
    }

    public SalesReportsTableElements(SalesReportsTableElementsPK salesReportsTableElementsPK) {
        this.salesReportsTableElementsPK = salesReportsTableElementsPK;
    }

    public SalesReportsTableElements(SalesReportsTableElementsPK salesReportsTableElementsPK, int elementId, String color, short position, Character status, String dependence, int limitAuto) {
        this.salesReportsTableElementsPK = salesReportsTableElementsPK;
        this.elementId = elementId;
        this.color = color;
        this.position = position;
        this.status = status;
        this.dependence = dependence;
        this.limitAuto = limitAuto;
    }

    public SalesReportsTableElements(int reportId, int tableId, int elementHash) {
        this.salesReportsTableElementsPK = new SalesReportsTableElementsPK(reportId, tableId, elementHash);
    }

    public SalesReportsTableElementsPK getSalesReportsTableElementsPK() {
        return salesReportsTableElementsPK;
    }

    public void setSalesReportsTableElementsPK(SalesReportsTableElementsPK salesReportsTableElementsPK) {
        this.salesReportsTableElementsPK = salesReportsTableElementsPK;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getDependence() {
        return dependence;
    }

    public void setDependence(String dependence) {
        this.dependence = dependence;
    }

    public int getLimitAuto() {
        return limitAuto;
    }

    public void setLimitAuto(int limitAuto) {
        this.limitAuto = limitAuto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesReportsTableElementsPK != null ? salesReportsTableElementsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsTableElements)) {
            return false;
        }
        SalesReportsTableElements other = (SalesReportsTableElements) object;
        if ((this.salesReportsTableElementsPK == null && other.salesReportsTableElementsPK != null) || (this.salesReportsTableElementsPK != null && !this.salesReportsTableElementsPK.equals(other.salesReportsTableElementsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsTableElements[ salesReportsTableElementsPK=" + salesReportsTableElementsPK + " ]";
    }
    
}
