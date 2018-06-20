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
@Table(name = "polls_answers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PollsAnswers.findAll", query = "SELECT p FROM PollsAnswers p")
    , @NamedQuery(name = "PollsAnswers.findByAnswerId", query = "SELECT p FROM PollsAnswers p WHERE p.pollsAnswersPK.answerId = :answerId")
    , @NamedQuery(name = "PollsAnswers.findByVoteId", query = "SELECT p FROM PollsAnswers p WHERE p.pollsAnswersPK.voteId = :voteId")
    , @NamedQuery(name = "PollsAnswers.findByItemId", query = "SELECT p FROM PollsAnswers p WHERE p.pollsAnswersPK.itemId = :itemId")
    , @NamedQuery(name = "PollsAnswers.findByComment", query = "SELECT p FROM PollsAnswers p WHERE p.comment = :comment")})
public class PollsAnswers implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PollsAnswersPK pollsAnswersPK;
    @Basic(optional = false)
    @Column(name = "comment")
    private String comment;

    public PollsAnswers() {
    }

    public PollsAnswers(PollsAnswersPK pollsAnswersPK) {
        this.pollsAnswersPK = pollsAnswersPK;
    }

    public PollsAnswers(PollsAnswersPK pollsAnswersPK, String comment) {
        this.pollsAnswersPK = pollsAnswersPK;
        this.comment = comment;
    }

    public PollsAnswers(int answerId, int voteId, int itemId) {
        this.pollsAnswersPK = new PollsAnswersPK(answerId, voteId, itemId);
    }

    public PollsAnswersPK getPollsAnswersPK() {
        return pollsAnswersPK;
    }

    public void setPollsAnswersPK(PollsAnswersPK pollsAnswersPK) {
        this.pollsAnswersPK = pollsAnswersPK;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pollsAnswersPK != null ? pollsAnswersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PollsAnswers)) {
            return false;
        }
        PollsAnswers other = (PollsAnswers) object;
        if ((this.pollsAnswersPK == null && other.pollsAnswersPK != null) || (this.pollsAnswersPK != null && !this.pollsAnswersPK.equals(other.pollsAnswersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PollsAnswers[ pollsAnswersPK=" + pollsAnswersPK + " ]";
    }
    
}
