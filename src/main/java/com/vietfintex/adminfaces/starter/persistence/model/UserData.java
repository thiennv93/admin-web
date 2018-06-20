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
@Table(name = "user_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserData.findAll", query = "SELECT u FROM UserData u")
    , @NamedQuery(name = "UserData.findByUserId", query = "SELECT u FROM UserData u WHERE u.userDataPK.userId = :userId")
    , @NamedQuery(name = "UserData.findByType", query = "SELECT u FROM UserData u WHERE u.userDataPK.type = :type")})
public class UserData implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserDataPK userDataPK;
    @Lob
    @Column(name = "data")
    private String data;

    public UserData() {
    }

    public UserData(UserDataPK userDataPK) {
        this.userDataPK = userDataPK;
    }

    public UserData(int userId, Character type) {
        this.userDataPK = new UserDataPK(userId, type);
    }

    public UserDataPK getUserDataPK() {
        return userDataPK;
    }

    public void setUserDataPK(UserDataPK userDataPK) {
        this.userDataPK = userDataPK;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userDataPK != null ? userDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserData)) {
            return false;
        }
        UserData other = (UserData) object;
        if ((this.userDataPK == null && other.userDataPK != null) || (this.userDataPK != null && !this.userDataPK.equals(other.userDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UserData[ userDataPK=" + userDataPK + " ]";
    }
    
}
