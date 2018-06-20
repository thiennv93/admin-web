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
public class MenusDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "menu_id")
    private int menuId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public MenusDescriptionsPK() {
    }

    public MenusDescriptionsPK(int menuId, String langCode) {
        this.menuId = menuId;
        this.langCode = langCode;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) menuId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenusDescriptionsPK)) {
            return false;
        }
        MenusDescriptionsPK other = (MenusDescriptionsPK) object;
        if (this.menuId != other.menuId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MenusDescriptionsPK[ menuId=" + menuId + ", langCode=" + langCode + " ]";
    }
    
}
