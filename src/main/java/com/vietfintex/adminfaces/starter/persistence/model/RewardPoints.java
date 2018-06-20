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
@Table(name = "reward_points")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RewardPoints.findAll", query = "SELECT r FROM RewardPoints r")
    , @NamedQuery(name = "RewardPoints.findByRewardPointId", query = "SELECT r FROM RewardPoints r WHERE r.rewardPointId = :rewardPointId")
    , @NamedQuery(name = "RewardPoints.findByObjectId", query = "SELECT r FROM RewardPoints r WHERE r.objectId = :objectId")
    , @NamedQuery(name = "RewardPoints.findByUsergroupId", query = "SELECT r FROM RewardPoints r WHERE r.usergroupId = :usergroupId")
    , @NamedQuery(name = "RewardPoints.findByAmount", query = "SELECT r FROM RewardPoints r WHERE r.amount = :amount")
    , @NamedQuery(name = "RewardPoints.findByAmountType", query = "SELECT r FROM RewardPoints r WHERE r.amountType = :amountType")
    , @NamedQuery(name = "RewardPoints.findByObjectType", query = "SELECT r FROM RewardPoints r WHERE r.objectType = :objectType")
    , @NamedQuery(name = "RewardPoints.findByCompanyId", query = "SELECT r FROM RewardPoints r WHERE r.companyId = :companyId")})
public class RewardPoints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "reward_point_id")
    private Integer rewardPointId;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "usergroup_id")
    private int usergroupId;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;
    @Basic(optional = false)
    @Column(name = "amount_type")
    private Character amountType;
    @Basic(optional = false)
    @Column(name = "object_type")
    private Character objectType;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;

    public RewardPoints() {
    }

    public RewardPoints(Integer rewardPointId) {
        this.rewardPointId = rewardPointId;
    }

    public RewardPoints(Integer rewardPointId, int objectId, int usergroupId, int amount, Character amountType, Character objectType, int companyId) {
        this.rewardPointId = rewardPointId;
        this.objectId = objectId;
        this.usergroupId = usergroupId;
        this.amount = amount;
        this.amountType = amountType;
        this.objectType = objectType;
        this.companyId = companyId;
    }

    public Integer getRewardPointId() {
        return rewardPointId;
    }

    public void setRewardPointId(Integer rewardPointId) {
        this.rewardPointId = rewardPointId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getUsergroupId() {
        return usergroupId;
    }

    public void setUsergroupId(int usergroupId) {
        this.usergroupId = usergroupId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Character getAmountType() {
        return amountType;
    }

    public void setAmountType(Character amountType) {
        this.amountType = amountType;
    }

    public Character getObjectType() {
        return objectType;
    }

    public void setObjectType(Character objectType) {
        this.objectType = objectType;
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
        hash += (rewardPointId != null ? rewardPointId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RewardPoints)) {
            return false;
        }
        RewardPoints other = (RewardPoints) object;
        if ((this.rewardPointId == null && other.rewardPointId != null) || (this.rewardPointId != null && !this.rewardPointId.equals(other.rewardPointId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RewardPoints[ rewardPointId=" + rewardPointId + " ]";
    }
    
}
