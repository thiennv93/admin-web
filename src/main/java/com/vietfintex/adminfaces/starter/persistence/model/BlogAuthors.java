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
@Table(name = "blog_authors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BlogAuthors.findAll", query = "SELECT b FROM BlogAuthors b")
    , @NamedQuery(name = "BlogAuthors.findByPageId", query = "SELECT b FROM BlogAuthors b WHERE b.blogAuthorsPK.pageId = :pageId")
    , @NamedQuery(name = "BlogAuthors.findByUserId", query = "SELECT b FROM BlogAuthors b WHERE b.blogAuthorsPK.userId = :userId")})
public class BlogAuthors implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BlogAuthorsPK blogAuthorsPK;

    public BlogAuthors() {
    }

    public BlogAuthors(BlogAuthorsPK blogAuthorsPK) {
        this.blogAuthorsPK = blogAuthorsPK;
    }

    public BlogAuthors(int pageId, int userId) {
        this.blogAuthorsPK = new BlogAuthorsPK(pageId, userId);
    }

    public BlogAuthorsPK getBlogAuthorsPK() {
        return blogAuthorsPK;
    }

    public void setBlogAuthorsPK(BlogAuthorsPK blogAuthorsPK) {
        this.blogAuthorsPK = blogAuthorsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (blogAuthorsPK != null ? blogAuthorsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BlogAuthors)) {
            return false;
        }
        BlogAuthors other = (BlogAuthors) object;
        if ((this.blogAuthorsPK == null && other.blogAuthorsPK != null) || (this.blogAuthorsPK != null && !this.blogAuthorsPK.equals(other.blogAuthorsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BlogAuthors[ blogAuthorsPK=" + blogAuthorsPK + " ]";
    }
    
}
