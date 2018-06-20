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
@Table(name = "mailing_lists")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MailingLists.findAll", query = "SELECT m FROM MailingLists m")
    , @NamedQuery(name = "MailingLists.findByListId", query = "SELECT m FROM MailingLists m WHERE m.listId = :listId")
    , @NamedQuery(name = "MailingLists.findByTimestamp", query = "SELECT m FROM MailingLists m WHERE m.timestamp = :timestamp")
    , @NamedQuery(name = "MailingLists.findByFromEmail", query = "SELECT m FROM MailingLists m WHERE m.fromEmail = :fromEmail")
    , @NamedQuery(name = "MailingLists.findByFromName", query = "SELECT m FROM MailingLists m WHERE m.fromName = :fromName")
    , @NamedQuery(name = "MailingLists.findByReplyTo", query = "SELECT m FROM MailingLists m WHERE m.replyTo = :replyTo")
    , @NamedQuery(name = "MailingLists.findByShowOnCheckout", query = "SELECT m FROM MailingLists m WHERE m.showOnCheckout = :showOnCheckout")
    , @NamedQuery(name = "MailingLists.findByShowOnRegistration", query = "SELECT m FROM MailingLists m WHERE m.showOnRegistration = :showOnRegistration")
    , @NamedQuery(name = "MailingLists.findByStatus", query = "SELECT m FROM MailingLists m WHERE m.status = :status")
    , @NamedQuery(name = "MailingLists.findByRegisterAutoresponder", query = "SELECT m FROM MailingLists m WHERE m.registerAutoresponder = :registerAutoresponder")})
public class MailingLists implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "list_id")
    private Integer listId;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "from_email")
    private String fromEmail;
    @Basic(optional = false)
    @Column(name = "from_name")
    private String fromName;
    @Basic(optional = false)
    @Column(name = "reply_to")
    private String replyTo;
    @Basic(optional = false)
    @Column(name = "show_on_checkout")
    private short showOnCheckout;
    @Basic(optional = false)
    @Column(name = "show_on_registration")
    private short showOnRegistration;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "register_autoresponder")
    private int registerAutoresponder;

    public MailingLists() {
    }

    public MailingLists(Integer listId) {
        this.listId = listId;
    }

    public MailingLists(Integer listId, int timestamp, String fromEmail, String fromName, String replyTo, short showOnCheckout, short showOnRegistration, Character status, int registerAutoresponder) {
        this.listId = listId;
        this.timestamp = timestamp;
        this.fromEmail = fromEmail;
        this.fromName = fromName;
        this.replyTo = replyTo;
        this.showOnCheckout = showOnCheckout;
        this.showOnRegistration = showOnRegistration;
        this.status = status;
        this.registerAutoresponder = registerAutoresponder;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public short getShowOnCheckout() {
        return showOnCheckout;
    }

    public void setShowOnCheckout(short showOnCheckout) {
        this.showOnCheckout = showOnCheckout;
    }

    public short getShowOnRegistration() {
        return showOnRegistration;
    }

    public void setShowOnRegistration(short showOnRegistration) {
        this.showOnRegistration = showOnRegistration;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public int getRegisterAutoresponder() {
        return registerAutoresponder;
    }

    public void setRegisterAutoresponder(int registerAutoresponder) {
        this.registerAutoresponder = registerAutoresponder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (listId != null ? listId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MailingLists)) {
            return false;
        }
        MailingLists other = (MailingLists) object;
        if ((this.listId == null && other.listId != null) || (this.listId != null && !this.listId.equals(other.listId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MailingLists[ listId=" + listId + " ]";
    }
    
}
