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
@Table(name = "original_values")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OriginalValues.findAll", query = "SELECT o FROM OriginalValues o")
    , @NamedQuery(name = "OriginalValues.findByMsgctxt", query = "SELECT o FROM OriginalValues o WHERE o.msgctxt = :msgctxt")})
public class OriginalValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "msgctxt")
    private String msgctxt;
    @Lob
    @Column(name = "msgid")
    private String msgid;

    public OriginalValues() {
    }

    public OriginalValues(String msgctxt) {
        this.msgctxt = msgctxt;
    }

    public String getMsgctxt() {
        return msgctxt;
    }

    public void setMsgctxt(String msgctxt) {
        this.msgctxt = msgctxt;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (msgctxt != null ? msgctxt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OriginalValues)) {
            return false;
        }
        OriginalValues other = (OriginalValues) object;
        if ((this.msgctxt == null && other.msgctxt != null) || (this.msgctxt != null && !this.msgctxt.equals(other.msgctxt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OriginalValues[ msgctxt=" + msgctxt + " ]";
    }
    
}
