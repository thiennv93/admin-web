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
@Table(name = "vendor_communications")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VendorCommunications.findAll", query = "SELECT v FROM VendorCommunications v")
    , @NamedQuery(name = "VendorCommunications.findByThreadId", query = "SELECT v FROM VendorCommunications v WHERE v.threadId = :threadId")
    , @NamedQuery(name = "VendorCommunications.findByStatus", query = "SELECT v FROM VendorCommunications v WHERE v.status = :status")
    , @NamedQuery(name = "VendorCommunications.findByUserId", query = "SELECT v FROM VendorCommunications v WHERE v.userId = :userId")
    , @NamedQuery(name = "VendorCommunications.findByCompanyId", query = "SELECT v FROM VendorCommunications v WHERE v.companyId = :companyId")
    , @NamedQuery(name = "VendorCommunications.findByObjectId", query = "SELECT v FROM VendorCommunications v WHERE v.objectId = :objectId")
    , @NamedQuery(name = "VendorCommunications.findByObjectType", query = "SELECT v FROM VendorCommunications v WHERE v.objectType = :objectType")
    , @NamedQuery(name = "VendorCommunications.findByCreatedAt", query = "SELECT v FROM VendorCommunications v WHERE v.createdAt = :createdAt")
    , @NamedQuery(name = "VendorCommunications.findByLastMessage", query = "SELECT v FROM VendorCommunications v WHERE v.lastMessage = :lastMessage")
    , @NamedQuery(name = "VendorCommunications.findByLastMessageUserId", query = "SELECT v FROM VendorCommunications v WHERE v.lastMessageUserId = :lastMessageUserId")
    , @NamedQuery(name = "VendorCommunications.findByLastMessageUserType", query = "SELECT v FROM VendorCommunications v WHERE v.lastMessageUserType = :lastMessageUserType")
    , @NamedQuery(name = "VendorCommunications.findByLastUpdated", query = "SELECT v FROM VendorCommunications v WHERE v.lastUpdated = :lastUpdated")})
public class VendorCommunications implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "thread_id")
    private Integer threadId;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Column(name = "object_id")
    private Integer objectId;
    @Column(name = "object_type")
    private Character objectType;
    @Basic(optional = false)
    @Column(name = "created_at")
    private int createdAt;
    @Column(name = "last_message")
    private String lastMessage;
    @Basic(optional = false)
    @Column(name = "last_message_user_id")
    private int lastMessageUserId;
    @Basic(optional = false)
    @Column(name = "last_message_user_type")
    private Character lastMessageUserType;
    @Basic(optional = false)
    @Column(name = "last_updated")
    private int lastUpdated;

    public VendorCommunications() {
    }

    public VendorCommunications(Integer threadId) {
        this.threadId = threadId;
    }

    public VendorCommunications(Integer threadId, Character status, int userId, int companyId, int createdAt, int lastMessageUserId, Character lastMessageUserType, int lastUpdated) {
        this.threadId = threadId;
        this.status = status;
        this.userId = userId;
        this.companyId = companyId;
        this.createdAt = createdAt;
        this.lastMessageUserId = lastMessageUserId;
        this.lastMessageUserType = lastMessageUserType;
        this.lastUpdated = lastUpdated;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Character getObjectType() {
        return objectType;
    }

    public void setObjectType(Character objectType) {
        this.objectType = objectType;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public int getLastMessageUserId() {
        return lastMessageUserId;
    }

    public void setLastMessageUserId(int lastMessageUserId) {
        this.lastMessageUserId = lastMessageUserId;
    }

    public Character getLastMessageUserType() {
        return lastMessageUserType;
    }

    public void setLastMessageUserType(Character lastMessageUserType) {
        this.lastMessageUserType = lastMessageUserType;
    }

    public int getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(int lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (threadId != null ? threadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorCommunications)) {
            return false;
        }
        VendorCommunications other = (VendorCommunications) object;
        if ((this.threadId == null && other.threadId != null) || (this.threadId != null && !this.threadId.equals(other.threadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VendorCommunications[ threadId=" + threadId + " ]";
    }
    
}
