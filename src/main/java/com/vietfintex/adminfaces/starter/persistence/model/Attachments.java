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
@Table(name = "attachments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Attachments.findAll", query = "SELECT a FROM Attachments a")
    , @NamedQuery(name = "Attachments.findByAttachmentId", query = "SELECT a FROM Attachments a WHERE a.attachmentId = :attachmentId")
    , @NamedQuery(name = "Attachments.findByObjectType", query = "SELECT a FROM Attachments a WHERE a.objectType = :objectType")
    , @NamedQuery(name = "Attachments.findByObjectId", query = "SELECT a FROM Attachments a WHERE a.objectId = :objectId")
    , @NamedQuery(name = "Attachments.findByType", query = "SELECT a FROM Attachments a WHERE a.type = :type")
    , @NamedQuery(name = "Attachments.findByPosition", query = "SELECT a FROM Attachments a WHERE a.position = :position")
    , @NamedQuery(name = "Attachments.findByFilename", query = "SELECT a FROM Attachments a WHERE a.filename = :filename")
    , @NamedQuery(name = "Attachments.findByFilesize", query = "SELECT a FROM Attachments a WHERE a.filesize = :filesize")
    , @NamedQuery(name = "Attachments.findByUsergroupIds", query = "SELECT a FROM Attachments a WHERE a.usergroupIds = :usergroupIds")
    , @NamedQuery(name = "Attachments.findByStatus", query = "SELECT a FROM Attachments a WHERE a.status = :status")})
public class Attachments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "attachment_id")
    private Integer attachmentId;
    @Basic(optional = false)
    @Column(name = "object_type")
    private String objectType;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "position")
    private int position;
    @Basic(optional = false)
    @Column(name = "filename")
    private String filename;
    @Basic(optional = false)
    @Column(name = "filesize")
    private int filesize;
    @Basic(optional = false)
    @Column(name = "usergroup_ids")
    private String usergroupIds;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public Attachments() {
    }

    public Attachments(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Attachments(Integer attachmentId, String objectType, int objectId, Character type, int position, String filename, int filesize, String usergroupIds, Character status) {
        this.attachmentId = attachmentId;
        this.objectType = objectType;
        this.objectId = objectId;
        this.type = type;
        this.position = position;
        this.filename = filename;
        this.filesize = filesize;
        this.usergroupIds = usergroupIds;
        this.status = status;
    }

    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public String getUsergroupIds() {
        return usergroupIds;
    }

    public void setUsergroupIds(String usergroupIds) {
        this.usergroupIds = usergroupIds;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (attachmentId != null ? attachmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Attachments)) {
            return false;
        }
        Attachments other = (Attachments) object;
        if ((this.attachmentId == null && other.attachmentId != null) || (this.attachmentId != null && !this.attachmentId.equals(other.attachmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Attachments[ attachmentId=" + attachmentId + " ]";
    }
    
}
