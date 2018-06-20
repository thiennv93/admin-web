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
@Table(name = "menus_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MenusDescriptions.findAll", query = "SELECT m FROM MenusDescriptions m")
    , @NamedQuery(name = "MenusDescriptions.findByMenuId", query = "SELECT m FROM MenusDescriptions m WHERE m.menusDescriptionsPK.menuId = :menuId")
    , @NamedQuery(name = "MenusDescriptions.findByLangCode", query = "SELECT m FROM MenusDescriptions m WHERE m.menusDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "MenusDescriptions.findByName", query = "SELECT m FROM MenusDescriptions m WHERE m.name = :name")})
public class MenusDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MenusDescriptionsPK menusDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public MenusDescriptions() {
    }

    public MenusDescriptions(MenusDescriptionsPK menusDescriptionsPK) {
        this.menusDescriptionsPK = menusDescriptionsPK;
    }

    public MenusDescriptions(MenusDescriptionsPK menusDescriptionsPK, String name) {
        this.menusDescriptionsPK = menusDescriptionsPK;
        this.name = name;
    }

    public MenusDescriptions(int menuId, String langCode) {
        this.menusDescriptionsPK = new MenusDescriptionsPK(menuId, langCode);
    }

    public MenusDescriptionsPK getMenusDescriptionsPK() {
        return menusDescriptionsPK;
    }

    public void setMenusDescriptionsPK(MenusDescriptionsPK menusDescriptionsPK) {
        this.menusDescriptionsPK = menusDescriptionsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menusDescriptionsPK != null ? menusDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenusDescriptions)) {
            return false;
        }
        MenusDescriptions other = (MenusDescriptions) object;
        if ((this.menusDescriptionsPK == null && other.menusDescriptionsPK != null) || (this.menusDescriptionsPK != null && !this.menusDescriptionsPK.equals(other.menusDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MenusDescriptions[ menusDescriptionsPK=" + menusDescriptionsPK + " ]";
    }
    
}
