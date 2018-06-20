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
@Table(name = "images_links")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImagesLinks.findAll", query = "SELECT i FROM ImagesLinks i")
    , @NamedQuery(name = "ImagesLinks.findByPairId", query = "SELECT i FROM ImagesLinks i WHERE i.pairId = :pairId")
    , @NamedQuery(name = "ImagesLinks.findByObjectId", query = "SELECT i FROM ImagesLinks i WHERE i.objectId = :objectId")
    , @NamedQuery(name = "ImagesLinks.findByObjectType", query = "SELECT i FROM ImagesLinks i WHERE i.objectType = :objectType")
    , @NamedQuery(name = "ImagesLinks.findByImageId", query = "SELECT i FROM ImagesLinks i WHERE i.imageId = :imageId")
    , @NamedQuery(name = "ImagesLinks.findByDetailedId", query = "SELECT i FROM ImagesLinks i WHERE i.detailedId = :detailedId")
    , @NamedQuery(name = "ImagesLinks.findByType", query = "SELECT i FROM ImagesLinks i WHERE i.type = :type")
    , @NamedQuery(name = "ImagesLinks.findByPosition", query = "SELECT i FROM ImagesLinks i WHERE i.position = :position")})
public class ImagesLinks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pair_id")
    private Integer pairId;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "object_type")
    private String objectType;
    @Basic(optional = false)
    @Column(name = "image_id")
    private int imageId;
    @Basic(optional = false)
    @Column(name = "detailed_id")
    private int detailedId;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "position")
    private int position;

    public ImagesLinks() {
    }

    public ImagesLinks(Integer pairId) {
        this.pairId = pairId;
    }

    public ImagesLinks(Integer pairId, int objectId, String objectType, int imageId, int detailedId, Character type, int position) {
        this.pairId = pairId;
        this.objectId = objectId;
        this.objectType = objectType;
        this.imageId = imageId;
        this.detailedId = detailedId;
        this.type = type;
        this.position = position;
    }

    public Integer getPairId() {
        return pairId;
    }

    public void setPairId(Integer pairId) {
        this.pairId = pairId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getDetailedId() {
        return detailedId;
    }

    public void setDetailedId(int detailedId) {
        this.detailedId = detailedId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pairId != null ? pairId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImagesLinks)) {
            return false;
        }
        ImagesLinks other = (ImagesLinks) object;
        if ((this.pairId == null && other.pairId != null) || (this.pairId != null && !this.pairId.equals(other.pairId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ImagesLinks[ pairId=" + pairId + " ]";
    }
    
}
