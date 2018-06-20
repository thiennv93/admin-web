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
@Table(name = "vendor_communication_messages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VendorCommunicationMessages.findAll", query = "SELECT v FROM VendorCommunicationMessages v")
    , @NamedQuery(name = "VendorCommunicationMessages.findByMessageId", query = "SELECT v FROM VendorCommunicationMessages v WHERE v.messageId = :messageId")
    , @NamedQuery(name = "VendorCommunicationMessages.findByThreadId", query = "SELECT v FROM VendorCommunicationMessages v WHERE v.threadId = :threadId")
    , @NamedQuery(name = "VendorCommunicationMessages.findByUserId", query = "SELECT v FROM VendorCommunicationMessages v WHERE v.userId = :userId")
    , @NamedQuery(name = "VendorCommunicationMessages.findByUserType", query = "SELECT v FROM VendorCommunicationMessages v WHERE v.userType = :userType")
    , @NamedQuery(name = "VendorCommunicationMessages.findByTimestamp", query = "SELECT v FROM VendorCommunicationMessages v WHERE v.timestamp = :timestamp")})
public class VendorCommunicationMessages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "message_id")
    private Integer messageId;
    @Basic(optional = false)
    @Column(name = "thread_id")
    private int threadId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "user_type")
    private Character userType;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Lob
    @Column(name = "message")
    private String message;

    public VendorCommunicationMessages() {
    }

    public VendorCommunicationMessages(Integer messageId) {
        this.messageId = messageId;
    }

    public VendorCommunicationMessages(Integer messageId, int threadId, int userId, Character userType, int timestamp) {
        this.messageId = messageId;
        this.threadId = threadId;
        this.userId = userId;
        this.userType = userType;
        this.timestamp = timestamp;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Character getUserType() {
        return userType;
    }

    public void setUserType(Character userType) {
        this.userType = userType;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messageId != null ? messageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorCommunicationMessages)) {
            return false;
        }
        VendorCommunicationMessages other = (VendorCommunicationMessages) object;
        if ((this.messageId == null && other.messageId != null) || (this.messageId != null && !this.messageId.equals(other.messageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VendorCommunicationMessages[ messageId=" + messageId + " ]";
    }
    
}
