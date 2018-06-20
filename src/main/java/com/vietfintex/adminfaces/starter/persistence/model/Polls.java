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
@Table(name = "polls")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Polls.findAll", query = "SELECT p FROM Polls p")
    , @NamedQuery(name = "Polls.findByPageId", query = "SELECT p FROM Polls p WHERE p.pageId = :pageId")
    , @NamedQuery(name = "Polls.findByStartDate", query = "SELECT p FROM Polls p WHERE p.startDate = :startDate")
    , @NamedQuery(name = "Polls.findByEndDate", query = "SELECT p FROM Polls p WHERE p.endDate = :endDate")
    , @NamedQuery(name = "Polls.findByShowResults", query = "SELECT p FROM Polls p WHERE p.showResults = :showResults")})
public class Polls implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "page_id")
    private Integer pageId;
    @Basic(optional = false)
    @Column(name = "start_date")
    private int startDate;
    @Basic(optional = false)
    @Column(name = "end_date")
    private int endDate;
    @Basic(optional = false)
    @Column(name = "show_results")
    private Character showResults;

    public Polls() {
    }

    public Polls(Integer pageId) {
        this.pageId = pageId;
    }

    public Polls(Integer pageId, int startDate, int endDate, Character showResults) {
        this.pageId = pageId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.showResults = showResults;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public Character getShowResults() {
        return showResults;
    }

    public void setShowResults(Character showResults) {
        this.showResults = showResults;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pageId != null ? pageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Polls)) {
            return false;
        }
        Polls other = (Polls) object;
        if ((this.pageId == null && other.pageId != null) || (this.pageId != null && !this.pageId.equals(other.pageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Polls[ pageId=" + pageId + " ]";
    }
    
}
