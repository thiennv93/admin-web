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
@Table(name = "promotions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Promotions.findAll", query = "SELECT p FROM Promotions p")
    , @NamedQuery(name = "Promotions.findByPromotionId", query = "SELECT p FROM Promotions p WHERE p.promotionId = :promotionId")
    , @NamedQuery(name = "Promotions.findByCompanyId", query = "SELECT p FROM Promotions p WHERE p.companyId = :companyId")
    , @NamedQuery(name = "Promotions.findByToDate", query = "SELECT p FROM Promotions p WHERE p.toDate = :toDate")
    , @NamedQuery(name = "Promotions.findByFromDate", query = "SELECT p FROM Promotions p WHERE p.fromDate = :fromDate")
    , @NamedQuery(name = "Promotions.findByPriority", query = "SELECT p FROM Promotions p WHERE p.priority = :priority")
    , @NamedQuery(name = "Promotions.findByStop", query = "SELECT p FROM Promotions p WHERE p.stop = :stop")
    , @NamedQuery(name = "Promotions.findByZone", query = "SELECT p FROM Promotions p WHERE p.zone = :zone")
    , @NamedQuery(name = "Promotions.findByStatus", query = "SELECT p FROM Promotions p WHERE p.status = :status")
    , @NamedQuery(name = "Promotions.findByNumberOfUsages", query = "SELECT p FROM Promotions p WHERE p.numberOfUsages = :numberOfUsages")})
public class Promotions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "promotion_id")
    private Integer promotionId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Lob
    @Column(name = "conditions")
    private String conditions;
    @Lob
    @Column(name = "bonuses")
    private String bonuses;
    @Basic(optional = false)
    @Column(name = "to_date")
    private int toDate;
    @Basic(optional = false)
    @Column(name = "from_date")
    private int fromDate;
    @Basic(optional = false)
    @Column(name = "priority")
    private int priority;
    @Basic(optional = false)
    @Column(name = "stop")
    private Character stop;
    @Basic(optional = false)
    @Column(name = "zone")
    private String zone;
    @Lob
    @Column(name = "conditions_hash")
    private String conditionsHash;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "number_of_usages")
    private int numberOfUsages;
    @Lob
    @Column(name = "users_conditions_hash")
    private String usersConditionsHash;

    public Promotions() {
    }

    public Promotions(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public Promotions(Integer promotionId, int companyId, int toDate, int fromDate, int priority, Character stop, String zone, Character status, int numberOfUsages) {
        this.promotionId = promotionId;
        this.companyId = companyId;
        this.toDate = toDate;
        this.fromDate = fromDate;
        this.priority = priority;
        this.stop = stop;
        this.zone = zone;
        this.status = status;
        this.numberOfUsages = numberOfUsages;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getBonuses() {
        return bonuses;
    }

    public void setBonuses(String bonuses) {
        this.bonuses = bonuses;
    }

    public int getToDate() {
        return toDate;
    }

    public void setToDate(int toDate) {
        this.toDate = toDate;
    }

    public int getFromDate() {
        return fromDate;
    }

    public void setFromDate(int fromDate) {
        this.fromDate = fromDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Character getStop() {
        return stop;
    }

    public void setStop(Character stop) {
        this.stop = stop;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getConditionsHash() {
        return conditionsHash;
    }

    public void setConditionsHash(String conditionsHash) {
        this.conditionsHash = conditionsHash;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public int getNumberOfUsages() {
        return numberOfUsages;
    }

    public void setNumberOfUsages(int numberOfUsages) {
        this.numberOfUsages = numberOfUsages;
    }

    public String getUsersConditionsHash() {
        return usersConditionsHash;
    }

    public void setUsersConditionsHash(String usersConditionsHash) {
        this.usersConditionsHash = usersConditionsHash;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (promotionId != null ? promotionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promotions)) {
            return false;
        }
        Promotions other = (Promotions) object;
        if ((this.promotionId == null && other.promotionId != null) || (this.promotionId != null && !this.promotionId.equals(other.promotionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Promotions[ promotionId=" + promotionId + " ]";
    }
    
}
