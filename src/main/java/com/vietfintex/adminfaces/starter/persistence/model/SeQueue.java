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
@Table(name = "se_queue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeQueue.findAll", query = "SELECT s FROM SeQueue s")
    , @NamedQuery(name = "SeQueue.findByQueueId", query = "SELECT s FROM SeQueue s WHERE s.queueId = :queueId")
    , @NamedQuery(name = "SeQueue.findByAction", query = "SELECT s FROM SeQueue s WHERE s.action = :action")
    , @NamedQuery(name = "SeQueue.findByCompanyId", query = "SELECT s FROM SeQueue s WHERE s.companyId = :companyId")
    , @NamedQuery(name = "SeQueue.findByLangCode", query = "SELECT s FROM SeQueue s WHERE s.langCode = :langCode")
    , @NamedQuery(name = "SeQueue.findByStarted", query = "SELECT s FROM SeQueue s WHERE s.started = :started")
    , @NamedQuery(name = "SeQueue.findByErrorCount", query = "SELECT s FROM SeQueue s WHERE s.errorCount = :errorCount")
    , @NamedQuery(name = "SeQueue.findByStatus", query = "SELECT s FROM SeQueue s WHERE s.status = :status")})
public class SeQueue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "queue_id")
    private Integer queueId;
    @Lob
    @Column(name = "data")
    private String data;
    @Basic(optional = false)
    @Column(name = "action")
    private String action;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;
    @Basic(optional = false)
    @Column(name = "started")
    private int started;
    @Basic(optional = false)
    @Column(name = "error_count")
    private int errorCount;
    @Column(name = "status")
    private String status;

    public SeQueue() {
    }

    public SeQueue(Integer queueId) {
        this.queueId = queueId;
    }

    public SeQueue(Integer queueId, String action, int companyId, String langCode, int started, int errorCount) {
        this.queueId = queueId;
        this.action = action;
        this.companyId = companyId;
        this.langCode = langCode;
        this.started = started;
        this.errorCount = errorCount;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public int getStarted() {
        return started;
    }

    public void setStarted(int started) {
        this.started = started;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (queueId != null ? queueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeQueue)) {
            return false;
        }
        SeQueue other = (SeQueue) object;
        if ((this.queueId == null && other.queueId != null) || (this.queueId != null && !this.queueId.equals(other.queueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SeQueue[ queueId=" + queueId + " ]";
    }
    
}
