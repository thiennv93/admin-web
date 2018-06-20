/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Embeddable
public class PollsAnswersPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "answer_id")
    private int answerId;
    @Basic(optional = false)
    @Column(name = "vote_id")
    private int voteId;
    @Basic(optional = false)
    @Column(name = "item_id")
    private int itemId;

    public PollsAnswersPK() {
    }

    public PollsAnswersPK(int answerId, int voteId, int itemId) {
        this.answerId = answerId;
        this.voteId = voteId;
        this.itemId = itemId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getVoteId() {
        return voteId;
    }

    public void setVoteId(int voteId) {
        this.voteId = voteId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) answerId;
        hash += (int) voteId;
        hash += (int) itemId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PollsAnswersPK)) {
            return false;
        }
        PollsAnswersPK other = (PollsAnswersPK) object;
        if (this.answerId != other.answerId) {
            return false;
        }
        if (this.voteId != other.voteId) {
            return false;
        }
        if (this.itemId != other.itemId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PollsAnswersPK[ answerId=" + answerId + ", voteId=" + voteId + ", itemId=" + itemId + " ]";
    }
    
}
