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
@Table(name = "discussion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Discussion.findAll", query = "SELECT d FROM Discussion d")
    , @NamedQuery(name = "Discussion.findByThreadId", query = "SELECT d FROM Discussion d WHERE d.threadId = :threadId")
    , @NamedQuery(name = "Discussion.findByObjectId", query = "SELECT d FROM Discussion d WHERE d.objectId = :objectId")
    , @NamedQuery(name = "Discussion.findByObjectType", query = "SELECT d FROM Discussion d WHERE d.objectType = :objectType")
    , @NamedQuery(name = "Discussion.findByType", query = "SELECT d FROM Discussion d WHERE d.type = :type")})
public class Discussion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "thread_id")
    private Integer threadId;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "object_type")
    private Character objectType;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;

    public Discussion() {
    }

    public Discussion(Integer threadId) {
        this.threadId = threadId;
    }

    public Discussion(Integer threadId, int objectId, Character objectType, Character type) {
        this.threadId = threadId;
        this.objectId = objectId;
        this.objectType = objectType;
        this.type = type;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Character getObjectType() {
        return objectType;
    }

    public void setObjectType(Character objectType) {
        this.objectType = objectType;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
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
        if (!(object instanceof Discussion)) {
            return false;
        }
        Discussion other = (Discussion) object;
        if ((this.threadId == null && other.threadId != null) || (this.threadId != null && !this.threadId.equals(other.threadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Discussion[ threadId=" + threadId + " ]";
    }
    
}
