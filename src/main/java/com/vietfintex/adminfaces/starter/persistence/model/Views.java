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
@Table(name = "views")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Views.findAll", query = "SELECT v FROM Views v")
    , @NamedQuery(name = "Views.findByViewId", query = "SELECT v FROM Views v WHERE v.viewId = :viewId")
    , @NamedQuery(name = "Views.findByObject", query = "SELECT v FROM Views v WHERE v.object = :object")
    , @NamedQuery(name = "Views.findByName", query = "SELECT v FROM Views v WHERE v.name = :name")
    , @NamedQuery(name = "Views.findByUserId", query = "SELECT v FROM Views v WHERE v.userId = :userId")
    , @NamedQuery(name = "Views.findByActive", query = "SELECT v FROM Views v WHERE v.active = :active")})
public class Views implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "view_id")
    private Integer viewId;
    @Basic(optional = false)
    @Column(name = "object")
    private String object;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Lob
    @Column(name = "params")
    private String params;
    @Lob
    @Column(name = "view_results")
    private String viewResults;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "active")
    private Character active;

    public Views() {
    }

    public Views(Integer viewId) {
        this.viewId = viewId;
    }

    public Views(Integer viewId, String object, String name, int userId, Character active) {
        this.viewId = viewId;
        this.object = object;
        this.name = name;
        this.userId = userId;
        this.active = active;
    }

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getViewResults() {
        return viewResults;
    }

    public void setViewResults(String viewResults) {
        this.viewResults = viewResults;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (viewId != null ? viewId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Views)) {
            return false;
        }
        Views other = (Views) object;
        if ((this.viewId == null && other.viewId != null) || (this.viewId != null && !this.viewId.equals(other.viewId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Views[ viewId=" + viewId + " ]";
    }
    
}
