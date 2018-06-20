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
@Table(name = "logs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logs.findAll", query = "SELECT l FROM Logs l")
    , @NamedQuery(name = "Logs.findByLogId", query = "SELECT l FROM Logs l WHERE l.logId = :logId")
    , @NamedQuery(name = "Logs.findByUserId", query = "SELECT l FROM Logs l WHERE l.userId = :userId")
    , @NamedQuery(name = "Logs.findByTimestamp", query = "SELECT l FROM Logs l WHERE l.timestamp = :timestamp")
    , @NamedQuery(name = "Logs.findByType", query = "SELECT l FROM Logs l WHERE l.type = :type")
    , @NamedQuery(name = "Logs.findByEventType", query = "SELECT l FROM Logs l WHERE l.eventType = :eventType")
    , @NamedQuery(name = "Logs.findByAction", query = "SELECT l FROM Logs l WHERE l.action = :action")
    , @NamedQuery(name = "Logs.findByObject", query = "SELECT l FROM Logs l WHERE l.object = :object")
    , @NamedQuery(name = "Logs.findByCompanyId", query = "SELECT l FROM Logs l WHERE l.companyId = :companyId")})
public class Logs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "log_id")
    private Integer logId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "event_type")
    private Character eventType;
    @Basic(optional = false)
    @Column(name = "action")
    private String action;
    @Basic(optional = false)
    @Column(name = "object")
    private Character object;
    @Lob
    @Column(name = "content")
    private String content;
    @Lob
    @Column(name = "backtrace")
    private String backtrace;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;

    public Logs() {
    }

    public Logs(Integer logId) {
        this.logId = logId;
    }

    public Logs(Integer logId, int userId, int timestamp, String type, Character eventType, String action, Character object, int companyId) {
        this.logId = logId;
        this.userId = userId;
        this.timestamp = timestamp;
        this.type = type;
        this.eventType = eventType;
        this.action = action;
        this.object = object;
        this.companyId = companyId;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Character getEventType() {
        return eventType;
    }

    public void setEventType(Character eventType) {
        this.eventType = eventType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Character getObject() {
        return object;
    }

    public void setObject(Character object) {
        this.object = object;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBacktrace() {
        return backtrace;
    }

    public void setBacktrace(String backtrace) {
        this.backtrace = backtrace;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logId != null ? logId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logs)) {
            return false;
        }
        Logs other = (Logs) object;
        if ((this.logId == null && other.logId != null) || (this.logId != null && !this.logId.equals(other.logId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Logs[ logId=" + logId + " ]";
    }
    
}
