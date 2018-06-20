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
@Table(name = "discussion_rating")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiscussionRating.findAll", query = "SELECT d FROM DiscussionRating d")
    , @NamedQuery(name = "DiscussionRating.findByRatingValue", query = "SELECT d FROM DiscussionRating d WHERE d.ratingValue = :ratingValue")
    , @NamedQuery(name = "DiscussionRating.findByPostId", query = "SELECT d FROM DiscussionRating d WHERE d.postId = :postId")
    , @NamedQuery(name = "DiscussionRating.findByThreadId", query = "SELECT d FROM DiscussionRating d WHERE d.threadId = :threadId")})
public class DiscussionRating implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "rating_value")
    private short ratingValue;
    @Id
    @Basic(optional = false)
    @Column(name = "post_id")
    private Integer postId;
    @Basic(optional = false)
    @Column(name = "thread_id")
    private int threadId;

    public DiscussionRating() {
    }

    public DiscussionRating(Integer postId) {
        this.postId = postId;
    }

    public DiscussionRating(Integer postId, short ratingValue, int threadId) {
        this.postId = postId;
        this.ratingValue = ratingValue;
        this.threadId = threadId;
    }

    public short getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(short ratingValue) {
        this.ratingValue = ratingValue;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postId != null ? postId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiscussionRating)) {
            return false;
        }
        DiscussionRating other = (DiscussionRating) object;
        if ((this.postId == null && other.postId != null) || (this.postId != null && !this.postId.equals(other.postId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DiscussionRating[ postId=" + postId + " ]";
    }
    
}
