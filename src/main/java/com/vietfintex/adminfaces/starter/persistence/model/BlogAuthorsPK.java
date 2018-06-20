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
public class BlogAuthorsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "page_id")
    private int pageId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;

    public BlogAuthorsPK() {
    }

    public BlogAuthorsPK(int pageId, int userId) {
        this.pageId = pageId;
        this.userId = userId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pageId;
        hash += (int) userId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BlogAuthorsPK)) {
            return false;
        }
        BlogAuthorsPK other = (BlogAuthorsPK) object;
        if (this.pageId != other.pageId) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BlogAuthorsPK[ pageId=" + pageId + ", userId=" + userId + " ]";
    }
    
}
