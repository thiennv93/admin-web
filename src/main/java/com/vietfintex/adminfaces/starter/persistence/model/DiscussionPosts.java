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
@Table(name = "discussion_posts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiscussionPosts.findAll", query = "SELECT d FROM DiscussionPosts d")
    , @NamedQuery(name = "DiscussionPosts.findByPostId", query = "SELECT d FROM DiscussionPosts d WHERE d.postId = :postId")
    , @NamedQuery(name = "DiscussionPosts.findByThreadId", query = "SELECT d FROM DiscussionPosts d WHERE d.threadId = :threadId")
    , @NamedQuery(name = "DiscussionPosts.findByName", query = "SELECT d FROM DiscussionPosts d WHERE d.name = :name")
    , @NamedQuery(name = "DiscussionPosts.findByTimestamp", query = "SELECT d FROM DiscussionPosts d WHERE d.timestamp = :timestamp")
    , @NamedQuery(name = "DiscussionPosts.findByUserId", query = "SELECT d FROM DiscussionPosts d WHERE d.userId = :userId")
    , @NamedQuery(name = "DiscussionPosts.findByStatus", query = "SELECT d FROM DiscussionPosts d WHERE d.status = :status")})
public class DiscussionPosts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "post_id")
    private Integer postId;
    @Basic(optional = false)
    @Column(name = "thread_id")
    private int threadId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Lob
    @Column(name = "ip_address")
    private byte[] ipAddress;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public DiscussionPosts() {
    }

    public DiscussionPosts(Integer postId) {
        this.postId = postId;
    }

    public DiscussionPosts(Integer postId, int threadId, String name, int timestamp, int userId, byte[] ipAddress, Character status) {
        this.postId = postId;
        this.threadId = threadId;
        this.name = name;
        this.timestamp = timestamp;
        this.userId = userId;
        this.ipAddress = ipAddress;
        this.status = status;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public byte[] getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(byte[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
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
        if (!(object instanceof DiscussionPosts)) {
            return false;
        }
        DiscussionPosts other = (DiscussionPosts) object;
        if ((this.postId == null && other.postId != null) || (this.postId != null && !this.postId.equals(other.postId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DiscussionPosts[ postId=" + postId + " ]";
    }
    
}
