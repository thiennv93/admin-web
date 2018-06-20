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
@Table(name = "sales_reports_intervals")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesReportsIntervals.findAll", query = "SELECT s FROM SalesReportsIntervals s")
    , @NamedQuery(name = "SalesReportsIntervals.findByIntervalId", query = "SELECT s FROM SalesReportsIntervals s WHERE s.intervalId = :intervalId")
    , @NamedQuery(name = "SalesReportsIntervals.findByValue", query = "SELECT s FROM SalesReportsIntervals s WHERE s.value = :value")
    , @NamedQuery(name = "SalesReportsIntervals.findByIntervalCode", query = "SELECT s FROM SalesReportsIntervals s WHERE s.intervalCode = :intervalCode")})
public class SalesReportsIntervals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "interval_id")
    private Integer intervalId;
    @Basic(optional = false)
    @Column(name = "value")
    private int value;
    @Basic(optional = false)
    @Column(name = "interval_code")
    private String intervalCode;

    public SalesReportsIntervals() {
    }

    public SalesReportsIntervals(Integer intervalId) {
        this.intervalId = intervalId;
    }

    public SalesReportsIntervals(Integer intervalId, int value, String intervalCode) {
        this.intervalId = intervalId;
        this.value = value;
        this.intervalCode = intervalCode;
    }

    public Integer getIntervalId() {
        return intervalId;
    }

    public void setIntervalId(Integer intervalId) {
        this.intervalId = intervalId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getIntervalCode() {
        return intervalCode;
    }

    public void setIntervalCode(String intervalCode) {
        this.intervalCode = intervalCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (intervalId != null ? intervalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesReportsIntervals)) {
            return false;
        }
        SalesReportsIntervals other = (SalesReportsIntervals) object;
        if ((this.intervalId == null && other.intervalId != null) || (this.intervalId != null && !this.intervalId.equals(other.intervalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesReportsIntervals[ intervalId=" + intervalId + " ]";
    }
    
}
