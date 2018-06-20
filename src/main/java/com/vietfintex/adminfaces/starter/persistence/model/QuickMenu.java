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
@Table(name = "quick_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuickMenu.findAll", query = "SELECT q FROM QuickMenu q")
    , @NamedQuery(name = "QuickMenu.findByMenuId", query = "SELECT q FROM QuickMenu q WHERE q.menuId = :menuId")
    , @NamedQuery(name = "QuickMenu.findByUserId", query = "SELECT q FROM QuickMenu q WHERE q.userId = :userId")
    , @NamedQuery(name = "QuickMenu.findByUrl", query = "SELECT q FROM QuickMenu q WHERE q.url = :url")
    , @NamedQuery(name = "QuickMenu.findByParentId", query = "SELECT q FROM QuickMenu q WHERE q.parentId = :parentId")
    , @NamedQuery(name = "QuickMenu.findByPosition", query = "SELECT q FROM QuickMenu q WHERE q.position = :position")})
public class QuickMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "menu_id")
    private Integer menuId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;

    public QuickMenu() {
    }

    public QuickMenu(Integer menuId) {
        this.menuId = menuId;
    }

    public QuickMenu(Integer menuId, int userId, String url, int parentId, short position) {
        this.menuId = menuId;
        this.userId = userId;
        this.url = url;
        this.parentId = parentId;
        this.position = position;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuId != null ? menuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuickMenu)) {
            return false;
        }
        QuickMenu other = (QuickMenu) object;
        if ((this.menuId == null && other.menuId != null) || (this.menuId != null && !this.menuId.equals(other.menuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuickMenu[ menuId=" + menuId + " ]";
    }
    
}
