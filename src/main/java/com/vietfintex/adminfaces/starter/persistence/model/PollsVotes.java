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
@Table(name = "polls_votes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PollsVotes.findAll", query = "SELECT p FROM PollsVotes p")
    , @NamedQuery(name = "PollsVotes.findByVoteId", query = "SELECT p FROM PollsVotes p WHERE p.voteId = :voteId")
    , @NamedQuery(name = "PollsVotes.findByPageId", query = "SELECT p FROM PollsVotes p WHERE p.pageId = :pageId")
    , @NamedQuery(name = "PollsVotes.findByUserId", query = "SELECT p FROM PollsVotes p WHERE p.userId = :userId")
    , @NamedQuery(name = "PollsVotes.findByTime", query = "SELECT p FROM PollsVotes p WHERE p.time = :time")
    , @NamedQuery(name = "PollsVotes.findByType", query = "SELECT p FROM PollsVotes p WHERE p.type = :type")})
public class PollsVotes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vote_id")
    private Integer voteId;
    @Basic(optional = false)
    @Column(name = "page_id")
    private int pageId;
    @Basic(optional = false)
    @Lob
    @Column(name = "ip_address")
    private byte[] ipAddress;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "time")
    private int time;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;

    public PollsVotes() {
    }

    public PollsVotes(Integer voteId) {
        this.voteId = voteId;
    }

    public PollsVotes(Integer voteId, int pageId, byte[] ipAddress, int userId, int time, Character type) {
        this.voteId = voteId;
        this.pageId = pageId;
        this.ipAddress = ipAddress;
        this.userId = userId;
        this.time = time;
        this.type = type;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public byte[] getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(byte[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
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
        hash += (voteId != null ? voteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PollsVotes)) {
            return false;
        }
        PollsVotes other = (PollsVotes) object;
        if ((this.voteId == null && other.voteId != null) || (this.voteId != null && !this.voteId.equals(other.voteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PollsVotes[ voteId=" + voteId + " ]";
    }
    
}
