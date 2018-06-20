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
@Table(name = "reward_point_changes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RewardPointChanges.findAll", query = "SELECT r FROM RewardPointChanges r")
    , @NamedQuery(name = "RewardPointChanges.findByChangeId", query = "SELECT r FROM RewardPointChanges r WHERE r.changeId = :changeId")
    , @NamedQuery(name = "RewardPointChanges.findByUserId", query = "SELECT r FROM RewardPointChanges r WHERE r.userId = :userId")
    , @NamedQuery(name = "RewardPointChanges.findByAmount", query = "SELECT r FROM RewardPointChanges r WHERE r.amount = :amount")
    , @NamedQuery(name = "RewardPointChanges.findByTimestamp", query = "SELECT r FROM RewardPointChanges r WHERE r.timestamp = :timestamp")
    , @NamedQuery(name = "RewardPointChanges.findByAction", query = "SELECT r FROM RewardPointChanges r WHERE r.action = :action")})
public class RewardPointChanges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "change_id")
    private Integer changeId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "action")
    private Character action;
    @Lob
    @Column(name = "reason")
    private String reason;

    public RewardPointChanges() {
    }

    public RewardPointChanges(Integer changeId) {
        this.changeId = changeId;
    }

    public RewardPointChanges(Integer changeId, int userId, int amount, int timestamp, Character action) {
        this.changeId = changeId;
        this.userId = userId;
        this.amount = amount;
        this.timestamp = timestamp;
        this.action = action;
    }

    public Integer getChangeId() {
        return changeId;
    }

    public void setChangeId(Integer changeId) {
        this.changeId = changeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public Character getAction() {
        return action;
    }

    public void setAction(Character action) {
        this.action = action;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (changeId != null ? changeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RewardPointChanges)) {
            return false;
        }
        RewardPointChanges other = (RewardPointChanges) object;
        if ((this.changeId == null && other.changeId != null) || (this.changeId != null && !this.changeId.equals(other.changeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RewardPointChanges[ changeId=" + changeId + " ]";
    }
    
}
