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
@Table(name = "ebay_transaction_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbayTransactionLog.findAll", query = "SELECT e FROM EbayTransactionLog e")
    , @NamedQuery(name = "EbayTransactionLog.findById", query = "SELECT e FROM EbayTransactionLog e WHERE e.id = :id")
    , @NamedQuery(name = "EbayTransactionLog.findByRequest", query = "SELECT e FROM EbayTransactionLog e WHERE e.request = :request")
    , @NamedQuery(name = "EbayTransactionLog.findByStatus", query = "SELECT e FROM EbayTransactionLog e WHERE e.status = :status")
    , @NamedQuery(name = "EbayTransactionLog.findByErrorCount", query = "SELECT e FROM EbayTransactionLog e WHERE e.errorCount = :errorCount")
    , @NamedQuery(name = "EbayTransactionLog.findByWarningCount", query = "SELECT e FROM EbayTransactionLog e WHERE e.warningCount = :warningCount")
    , @NamedQuery(name = "EbayTransactionLog.findBySuccessRate", query = "SELECT e FROM EbayTransactionLog e WHERE e.successRate = :successRate")
    , @NamedQuery(name = "EbayTransactionLog.findByStartDatetime", query = "SELECT e FROM EbayTransactionLog e WHERE e.startDatetime = :startDatetime")
    , @NamedQuery(name = "EbayTransactionLog.findByEndDatetime", query = "SELECT e FROM EbayTransactionLog e WHERE e.endDatetime = :endDatetime")})
public class EbayTransactionLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "request")
    private String request;
    @Basic(optional = false)
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @Column(name = "error_count")
    private short errorCount;
    @Basic(optional = false)
    @Column(name = "warning_count")
    private short warningCount;
    @Basic(optional = false)
    @Column(name = "success_rate")
    private float successRate;
    @Column(name = "start_datetime")
    private Integer startDatetime;
    @Column(name = "end_datetime")
    private Integer endDatetime;

    public EbayTransactionLog() {
    }

    public EbayTransactionLog(Integer id) {
        this.id = id;
    }

    public EbayTransactionLog(Integer id, String request, boolean status, short errorCount, short warningCount, float successRate) {
        this.id = id;
        this.request = request;
        this.status = status;
        this.errorCount = errorCount;
        this.warningCount = warningCount;
        this.successRate = successRate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public short getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(short errorCount) {
        this.errorCount = errorCount;
    }

    public short getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(short warningCount) {
        this.warningCount = warningCount;
    }

    public float getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(float successRate) {
        this.successRate = successRate;
    }

    public Integer getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Integer startDatetime) {
        this.startDatetime = startDatetime;
    }

    public Integer getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(Integer endDatetime) {
        this.endDatetime = endDatetime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayTransactionLog)) {
            return false;
        }
        EbayTransactionLog other = (EbayTransactionLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayTransactionLog[ id=" + id + " ]";
    }
    
}
