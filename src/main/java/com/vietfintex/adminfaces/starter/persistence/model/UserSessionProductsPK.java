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
public class UserSessionProductsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "user_type")
    private Character userType;
    @Basic(optional = false)
    @Column(name = "item_id")
    private int itemId;

    public UserSessionProductsPK() {
    }

    public UserSessionProductsPK(int userId, Character type, Character userType, int itemId) {
        this.userId = userId;
        this.type = type;
        this.userType = userType;
        this.itemId = itemId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public Character getUserType() {
        return userType;
    }

    public void setUserType(Character userType) {
        this.userType = userType;
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
        hash += (int) userId;
        hash += (type != null ? type.hashCode() : 0);
        hash += (userType != null ? userType.hashCode() : 0);
        hash += (int) itemId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserSessionProductsPK)) {
            return false;
        }
        UserSessionProductsPK other = (UserSessionProductsPK) object;
        if (this.userId != other.userId) {
            return false;
        }
        if ((this.type == null && other.type != null) || (this.type != null && !this.type.equals(other.type))) {
            return false;
        }
        if ((this.userType == null && other.userType != null) || (this.userType != null && !this.userType.equals(other.userType))) {
            return false;
        }
        if (this.itemId != other.itemId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UserSessionProductsPK[ userId=" + userId + ", type=" + type + ", userType=" + userType + ", itemId=" + itemId + " ]";
    }
    
}
