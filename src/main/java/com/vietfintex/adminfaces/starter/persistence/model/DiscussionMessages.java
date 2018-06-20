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
@Table(name = "discussion_messages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiscussionMessages.findAll", query = "SELECT d FROM DiscussionMessages d")
    , @NamedQuery(name = "DiscussionMessages.findByPostId", query = "SELECT d FROM DiscussionMessages d WHERE d.postId = :postId")
    , @NamedQuery(name = "DiscussionMessages.findByThreadId", query = "SELECT d FROM DiscussionMessages d WHERE d.threadId = :threadId")})
public class DiscussionMessages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "message")
    private String message;
    @Id
    @Basic(optional = false)
    @Column(name = "post_id")
    private Integer postId;
    @Basic(optional = false)
    @Column(name = "thread_id")
    private int threadId;

    public DiscussionMessages() {
    }

    public DiscussionMessages(Integer postId) {
        this.postId = postId;
    }

    public DiscussionMessages(Integer postId, int threadId) {
        this.postId = postId;
        this.threadId = threadId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        if (!(object instanceof DiscussionMessages)) {
            return false;
        }
        DiscussionMessages other = (DiscussionMessages) object;
        if ((this.postId == null && other.postId != null) || (this.postId != null && !this.postId.equals(other.postId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DiscussionMessages[ postId=" + postId + " ]";
    }
    
}
